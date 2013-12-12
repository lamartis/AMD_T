package fr.esiag.commun;

/**
 * Generated from IDL alias "Resources".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 12 déc. 2013 21:55:59
 */

public final class ResourcesHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esiag.commun.TransactionResource[] value;

	public ResourcesHolder ()
	{
	}
	public ResourcesHolder (final fr.esiag.commun.TransactionResource[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ResourcesHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ResourcesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ResourcesHelper.write (out,value);
	}
}
