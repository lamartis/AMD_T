package fr.esiag.commun;


/**
 * Generated from IDL interface "GlobalSensor".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 20 déc. 2013 07:17:01
 */

public abstract class GlobalSensorHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(GlobalSensorHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:transaction/GlobalSensor:1.0", "GlobalSensor");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esiag.commun.GlobalSensor s)
	{
			any.insert_Object(s);
	}
	public static fr.esiag.commun.GlobalSensor extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:transaction/GlobalSensor:1.0";
	}
	public static GlobalSensor read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(fr.esiag.commun._GlobalSensorStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final fr.esiag.commun.GlobalSensor s)
	{
		_out.write_Object(s);
	}
	public static fr.esiag.commun.GlobalSensor narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.GlobalSensor)
		{
			return (fr.esiag.commun.GlobalSensor)obj;
		}
		else if (obj._is_a("IDL:transaction/GlobalSensor:1.0"))
		{
			fr.esiag.commun._GlobalSensorStub stub;
			stub = new fr.esiag.commun._GlobalSensorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static fr.esiag.commun.GlobalSensor unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.GlobalSensor)
		{
			return (fr.esiag.commun.GlobalSensor)obj;
		}
		else
		{
			fr.esiag.commun._GlobalSensorStub stub;
			stub = new fr.esiag.commun._GlobalSensorStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
