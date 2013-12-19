package fr.esiag.commun;

/**
 * Generated from IDL alias "ProxyStream".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19 déc. 2013 20:15:19
 */

public final class ProxyStreamHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public ProxyStreamHolder ()
	{
	}
	public ProxyStreamHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProxyStreamHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyStreamHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProxyStreamHelper.write (out,value);
	}
}
