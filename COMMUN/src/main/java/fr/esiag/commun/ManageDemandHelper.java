package fr.esiag.commun;


/**
 * Generated from IDL interface "ManageDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 16 déc. 2013 18:27:53
 */

public abstract class ManageDemandHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ManageDemandHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:transaction/ManageDemand:1.0", "ManageDemand");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esiag.commun.ManageDemand s)
	{
			any.insert_Object(s);
	}
	public static fr.esiag.commun.ManageDemand extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:transaction/ManageDemand:1.0";
	}
	public static ManageDemand read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(fr.esiag.commun._ManageDemandStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final fr.esiag.commun.ManageDemand s)
	{
		_out.write_Object(s);
	}
	public static fr.esiag.commun.ManageDemand narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.ManageDemand)
		{
			return (fr.esiag.commun.ManageDemand)obj;
		}
		else if (obj._is_a("IDL:transaction/ManageDemand:1.0"))
		{
			fr.esiag.commun._ManageDemandStub stub;
			stub = new fr.esiag.commun._ManageDemandStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static fr.esiag.commun.ManageDemand unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.ManageDemand)
		{
			return (fr.esiag.commun.ManageDemand)obj;
		}
		else
		{
			fr.esiag.commun._ManageDemandStub stub;
			stub = new fr.esiag.commun._ManageDemandStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
