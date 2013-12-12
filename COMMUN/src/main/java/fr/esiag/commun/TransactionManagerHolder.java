package fr.esiag.commun;

/**
 * Generated from IDL interface "TransactionManager".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 12 déc. 2013 21:55:59
 */

public final class TransactionManagerHolder	implements org.omg.CORBA.portable.Streamable{
	 public TransactionManager value;
	public TransactionManagerHolder()
	{
	}
	public TransactionManagerHolder (final TransactionManager initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TransactionManagerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransactionManagerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TransactionManagerHelper.write (_out,value);
	}
}
