package fr.esiag.commun;

/**
 * Generated from IDL struct "Account".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 13 déc. 2013 00:57:06
 */

public final class AccountHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esiag.commun.Account value;

	public AccountHolder ()
	{
	}
	public AccountHolder(final fr.esiag.commun.Account initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.esiag.commun.AccountHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.esiag.commun.AccountHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.esiag.commun.AccountHelper.write(_out, value);
	}
}
