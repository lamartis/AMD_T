package fr.esiag.commun;

/**
 * Generated from IDL interface "ManageAccount".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 18 déc. 2013 11:42:59
 */

public final class ManageAccountHolder	implements org.omg.CORBA.portable.Streamable{
	 public ManageAccount value;
	public ManageAccountHolder()
	{
	}
	public ManageAccountHolder (final ManageAccount initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ManageAccountHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ManageAccountHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ManageAccountHelper.write (_out,value);
	}
}
