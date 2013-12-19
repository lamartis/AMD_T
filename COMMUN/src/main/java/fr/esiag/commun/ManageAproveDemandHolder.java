package fr.esiag.commun;

/**
 * Generated from IDL interface "ManageAproveDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19 déc. 2013 22:07:02
 */

public final class ManageAproveDemandHolder	implements org.omg.CORBA.portable.Streamable{
	 public ManageAproveDemand value;
	public ManageAproveDemandHolder()
	{
	}
	public ManageAproveDemandHolder (final ManageAproveDemand initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ManageAproveDemandHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ManageAproveDemandHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ManageAproveDemandHelper.write (_out,value);
	}
}
