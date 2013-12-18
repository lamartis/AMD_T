package fr.esiag.commun;

/**
 * Generated from IDL interface "TransactionFactory".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 18 déc. 2013 17:20:03
 */

public final class TransactionFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public TransactionFactory value;
	public TransactionFactoryHolder()
	{
	}
	public TransactionFactoryHolder (final TransactionFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TransactionFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransactionFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TransactionFactoryHelper.write (_out,value);
	}
}
