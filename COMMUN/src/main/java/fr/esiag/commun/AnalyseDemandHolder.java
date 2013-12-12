package fr.esiag.commun;

/**
 * Generated from IDL interface "AnalyseDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 8 déc. 2013 15:09:47
 */

public final class AnalyseDemandHolder	implements org.omg.CORBA.portable.Streamable{
	 public AnalyseDemand value;
	public AnalyseDemandHolder()
	{
	}
	public AnalyseDemandHolder (final AnalyseDemand initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AnalyseDemandHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AnalyseDemandHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AnalyseDemandHelper.write (_out,value);
	}
}
