package fr.esiag.commun;

/**
 * Generated from IDL exception "NotPreparedException".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 8 déc. 2013 15:09:47
 */

public final class NotPreparedExceptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esiag.commun.NotPreparedException value;

	public NotPreparedExceptionHolder ()
	{
	}
	public NotPreparedExceptionHolder(final fr.esiag.commun.NotPreparedException initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.esiag.commun.NotPreparedExceptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.esiag.commun.NotPreparedExceptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.esiag.commun.NotPreparedExceptionHelper.write(_out, value);
	}
}
