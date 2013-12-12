package fr.esiag.commun;

/**
 * Generated from IDL struct "ApprovedDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 12 déc. 2013 21:55:59
 */

public final class ApprovedDemandHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esiag.commun.ApprovedDemand value;

	public ApprovedDemandHolder ()
	{
	}
	public ApprovedDemandHolder(final fr.esiag.commun.ApprovedDemand initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.esiag.commun.ApprovedDemandHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.esiag.commun.ApprovedDemandHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.esiag.commun.ApprovedDemandHelper.write(_out, value);
	}
}
