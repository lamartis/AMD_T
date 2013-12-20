package fr.esiag.commun;


/**
 * Generated from IDL interface "TransactionFactory".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 20 déc. 2013 07:17:01
 */

public abstract class TransactionFactoryHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TransactionFactoryHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:transaction/TransactionFactory:1.0", "TransactionFactory");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esiag.commun.TransactionFactory s)
	{
			any.insert_Object(s);
	}
	public static fr.esiag.commun.TransactionFactory extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:transaction/TransactionFactory:1.0";
	}
	public static TransactionFactory read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(fr.esiag.commun._TransactionFactoryStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final fr.esiag.commun.TransactionFactory s)
	{
		_out.write_Object(s);
	}
	public static fr.esiag.commun.TransactionFactory narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.TransactionFactory)
		{
			return (fr.esiag.commun.TransactionFactory)obj;
		}
		else if (obj._is_a("IDL:transaction/TransactionFactory:1.0"))
		{
			fr.esiag.commun._TransactionFactoryStub stub;
			stub = new fr.esiag.commun._TransactionFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static fr.esiag.commun.TransactionFactory unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.TransactionFactory)
		{
			return (fr.esiag.commun.TransactionFactory)obj;
		}
		else
		{
			fr.esiag.commun._TransactionFactoryStub stub;
			stub = new fr.esiag.commun._TransactionFactoryStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
