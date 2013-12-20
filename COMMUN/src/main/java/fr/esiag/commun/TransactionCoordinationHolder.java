package fr.esiag.commun;

/**
 * Generated from IDL interface "TransactionCoordination".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 20 déc. 2013 07:17:01
 */

public final class TransactionCoordinationHolder	implements org.omg.CORBA.portable.Streamable{
	 public TransactionCoordination value;
	public TransactionCoordinationHolder()
	{
	}
	public TransactionCoordinationHolder (final TransactionCoordination initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TransactionCoordinationHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransactionCoordinationHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TransactionCoordinationHelper.write (_out,value);
	}
}
