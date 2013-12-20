package fr.esiag.commun;

/**
 * Generated from IDL alias "TransactionID".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 20 déc. 2013 07:17:01
 */

public final class TransactionIDHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public TransactionIDHolder ()
	{
	}
	public TransactionIDHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TransactionIDHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransactionIDHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TransactionIDHelper.write (out,value);
	}
}
