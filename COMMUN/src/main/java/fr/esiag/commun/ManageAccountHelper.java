package fr.esiag.commun;


/**
 * Generated from IDL interface "ManageAccount".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19 déc. 2013 22:07:02
 */

public abstract class ManageAccountHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ManageAccountHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:transaction/ManageAccount:1.0", "ManageAccount");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esiag.commun.ManageAccount s)
	{
			any.insert_Object(s);
	}
	public static fr.esiag.commun.ManageAccount extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:transaction/ManageAccount:1.0";
	}
	public static ManageAccount read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(fr.esiag.commun._ManageAccountStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final fr.esiag.commun.ManageAccount s)
	{
		_out.write_Object(s);
	}
	public static fr.esiag.commun.ManageAccount narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.ManageAccount)
		{
			return (fr.esiag.commun.ManageAccount)obj;
		}
		else if (obj._is_a("IDL:transaction/ManageAccount:1.0"))
		{
			fr.esiag.commun._ManageAccountStub stub;
			stub = new fr.esiag.commun._ManageAccountStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static fr.esiag.commun.ManageAccount unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.ManageAccount)
		{
			return (fr.esiag.commun.ManageAccount)obj;
		}
		else
		{
			fr.esiag.commun._ManageAccountStub stub;
			stub = new fr.esiag.commun._ManageAccountStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
