package fr.esiag.commun;

/**
 * Generated from IDL interface "ManageDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19 déc. 2013 20:15:19
 */

public final class ManageDemandHolder	implements org.omg.CORBA.portable.Streamable{
	 public ManageDemand value;
	public ManageDemandHolder()
	{
	}
	public ManageDemandHolder (final ManageDemand initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ManageDemandHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ManageDemandHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ManageDemandHelper.write (_out,value);
	}
}
