package fr.esiag.commun;

/**
 * Generated from IDL interface "TransactionResource".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 29 nov. 2013 09:49:26
 */

public final class TransactionResourceHolder	implements org.omg.CORBA.portable.Streamable{
	 public TransactionResource value;
	public TransactionResourceHolder()
	{
	}
	public TransactionResourceHolder (final TransactionResource initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TransactionResourceHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransactionResourceHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TransactionResourceHelper.write (_out,value);
	}
}
