package fr.esiag.commun;

/**
 * Generated from IDL interface "Transaction".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19 déc. 2013 22:07:02
 */

public final class TransactionHolder	implements org.omg.CORBA.portable.Streamable{
	 public Transaction value;
	public TransactionHolder()
	{
	}
	public TransactionHolder (final Transaction initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TransactionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransactionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TransactionHelper.write (_out,value);
	}
}
