package fr.esiag.commun;

/**
 * Generated from IDL alias "ResourceID".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 18 déc. 2013 17:20:03
 */

public final class ResourceIDHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public ResourceIDHolder ()
	{
	}
	public ResourceIDHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ResourceIDHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ResourceIDHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ResourceIDHelper.write (out,value);
	}
}
