package fr.esiag.commun;

/**
 * Generated from IDL exception "TransactionException".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19 déc. 2013 22:07:02
 */

public final class TransactionExceptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esiag.commun.TransactionException value;

	public TransactionExceptionHolder ()
	{
	}
	public TransactionExceptionHolder(final fr.esiag.commun.TransactionException initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.esiag.commun.TransactionExceptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.esiag.commun.TransactionExceptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.esiag.commun.TransactionExceptionHelper.write(_out, value);
	}
}
