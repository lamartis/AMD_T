package fr.esiag.commun;


/**
 * Generated from IDL interface "MediumTemperature".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 20 d�c. 2013 07:17:01
 */

public abstract class MediumTemperatureHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(MediumTemperatureHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:transaction/MediumTemperature:1.0", "MediumTemperature");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esiag.commun.MediumTemperature s)
	{
			any.insert_Object(s);
	}
	public static fr.esiag.commun.MediumTemperature extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:transaction/MediumTemperature:1.0";
	}
	public static MediumTemperature read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(fr.esiag.commun._MediumTemperatureStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final fr.esiag.commun.MediumTemperature s)
	{
		_out.write_Object(s);
	}
	public static fr.esiag.commun.MediumTemperature narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.MediumTemperature)
		{
			return (fr.esiag.commun.MediumTemperature)obj;
		}
		else if (obj._is_a("IDL:transaction/MediumTemperature:1.0"))
		{
			fr.esiag.commun._MediumTemperatureStub stub;
			stub = new fr.esiag.commun._MediumTemperatureStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static fr.esiag.commun.MediumTemperature unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.MediumTemperature)
		{
			return (fr.esiag.commun.MediumTemperature)obj;
		}
		else
		{
			fr.esiag.commun._MediumTemperatureStub stub;
			stub = new fr.esiag.commun._MediumTemperatureStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
