package fr.esiag.commun;


/**
 * Generated from IDL interface "Transaction".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 12 déc. 2013 21:55:59
 */

public abstract class TransactionHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TransactionHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:transaction/Transaction:1.0", "Transaction");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esiag.commun.Transaction s)
	{
			any.insert_Object(s);
	}
	public static fr.esiag.commun.Transaction extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:transaction/Transaction:1.0";
	}
	public static Transaction read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(fr.esiag.commun._TransactionStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final fr.esiag.commun.Transaction s)
	{
		_out.write_Object(s);
	}
	public static fr.esiag.commun.Transaction narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.Transaction)
		{
			return (fr.esiag.commun.Transaction)obj;
		}
		else if (obj._is_a("IDL:transaction/Transaction:1.0"))
		{
			fr.esiag.commun._TransactionStub stub;
			stub = new fr.esiag.commun._TransactionStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static fr.esiag.commun.Transaction unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.Transaction)
		{
			return (fr.esiag.commun.Transaction)obj;
		}
		else
		{
			fr.esiag.commun._TransactionStub stub;
			stub = new fr.esiag.commun._TransactionStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
