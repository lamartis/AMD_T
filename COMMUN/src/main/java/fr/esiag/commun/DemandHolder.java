package fr.esiag.commun;

/**
 * Generated from IDL struct "Demand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 12 déc. 2013 21:55:59
 */

public final class DemandHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esiag.commun.Demand value;

	public DemandHolder ()
	{
	}
	public DemandHolder(final fr.esiag.commun.Demand initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.esiag.commun.DemandHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.esiag.commun.DemandHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.esiag.commun.DemandHelper.write(_out, value);
	}
}
