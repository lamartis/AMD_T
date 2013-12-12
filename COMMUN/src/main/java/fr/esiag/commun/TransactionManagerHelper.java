package fr.esiag.commun;


/**
 * Generated from IDL interface "TransactionManager".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 12 déc. 2013 21:55:59
 */

public abstract class TransactionManagerHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TransactionManagerHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:transaction/TransactionManager:1.0", "TransactionManager");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esiag.commun.TransactionManager s)
	{
			any.insert_Object(s);
	}
	public static fr.esiag.commun.TransactionManager extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:transaction/TransactionManager:1.0";
	}
	public static TransactionManager read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(fr.esiag.commun._TransactionManagerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final fr.esiag.commun.TransactionManager s)
	{
		_out.write_Object(s);
	}
	public static fr.esiag.commun.TransactionManager narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.TransactionManager)
		{
			return (fr.esiag.commun.TransactionManager)obj;
		}
		else if (obj._is_a("IDL:transaction/TransactionManager:1.0"))
		{
			fr.esiag.commun._TransactionManagerStub stub;
			stub = new fr.esiag.commun._TransactionManagerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static fr.esiag.commun.TransactionManager unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.TransactionManager)
		{
			return (fr.esiag.commun.TransactionManager)obj;
		}
		else
		{
			fr.esiag.commun._TransactionManagerStub stub;
			stub = new fr.esiag.commun._TransactionManagerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
