package fr.esiag.commun;

/**
 * Generated from IDL interface "FrontTemperature".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 20 déc. 2013 07:17:01
 */

public final class FrontTemperatureHolder	implements org.omg.CORBA.portable.Streamable{
	 public FrontTemperature value;
	public FrontTemperatureHolder()
	{
	}
	public FrontTemperatureHolder (final FrontTemperature initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FrontTemperatureHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FrontTemperatureHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FrontTemperatureHelper.write (_out,value);
	}
}
