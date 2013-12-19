package fr.esiag.commun;


/**
 * Generated from IDL interface "ManageAproveDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19 déc. 2013 22:07:02
 */

public abstract class ManageAproveDemandHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ManageAproveDemandHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:transaction/ManageAproveDemand:1.0", "ManageAproveDemand");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esiag.commun.ManageAproveDemand s)
	{
			any.insert_Object(s);
	}
	public static fr.esiag.commun.ManageAproveDemand extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:transaction/ManageAproveDemand:1.0";
	}
	public static ManageAproveDemand read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(fr.esiag.commun._ManageAproveDemandStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final fr.esiag.commun.ManageAproveDemand s)
	{
		_out.write_Object(s);
	}
	public static fr.esiag.commun.ManageAproveDemand narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.ManageAproveDemand)
		{
			return (fr.esiag.commun.ManageAproveDemand)obj;
		}
		else if (obj._is_a("IDL:transaction/ManageAproveDemand:1.0"))
		{
			fr.esiag.commun._ManageAproveDemandStub stub;
			stub = new fr.esiag.commun._ManageAproveDemandStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static fr.esiag.commun.ManageAproveDemand unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.ManageAproveDemand)
		{
			return (fr.esiag.commun.ManageAproveDemand)obj;
		}
		else
		{
			fr.esiag.commun._ManageAproveDemandStub stub;
			stub = new fr.esiag.commun._ManageAproveDemandStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
