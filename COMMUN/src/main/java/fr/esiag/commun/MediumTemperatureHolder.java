package fr.esiag.commun;

/**
 * Generated from IDL interface "MediumTemperature".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 20 déc. 2013 07:17:01
 */

public final class MediumTemperatureHolder	implements org.omg.CORBA.portable.Streamable{
	 public MediumTemperature value;
	public MediumTemperatureHolder()
	{
	}
	public MediumTemperatureHolder (final MediumTemperature initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return MediumTemperatureHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MediumTemperatureHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MediumTemperatureHelper.write (_out,value);
	}
}
