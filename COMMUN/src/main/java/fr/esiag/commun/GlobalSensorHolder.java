package fr.esiag.commun;

/**
 * Generated from IDL interface "GlobalSensor".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 20 déc. 2013 07:17:01
 */

public final class GlobalSensorHolder	implements org.omg.CORBA.portable.Streamable{
	 public GlobalSensor value;
	public GlobalSensorHolder()
	{
	}
	public GlobalSensorHolder (final GlobalSensor initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return GlobalSensorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GlobalSensorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		GlobalSensorHelper.write (_out,value);
	}
}
