package fr.esiag.commun;


/**
 * Generated from IDL interface "AnalyseDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 16 déc. 2013 18:27:53
 */

public abstract class AnalyseDemandHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(AnalyseDemandHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:transaction/AnalyseDemand:1.0", "AnalyseDemand");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esiag.commun.AnalyseDemand s)
	{
			any.insert_Object(s);
	}
	public static fr.esiag.commun.AnalyseDemand extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:transaction/AnalyseDemand:1.0";
	}
	public static AnalyseDemand read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(fr.esiag.commun._AnalyseDemandStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final fr.esiag.commun.AnalyseDemand s)
	{
		_out.write_Object(s);
	}
	public static fr.esiag.commun.AnalyseDemand narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.AnalyseDemand)
		{
			return (fr.esiag.commun.AnalyseDemand)obj;
		}
		else if (obj._is_a("IDL:transaction/AnalyseDemand:1.0"))
		{
			fr.esiag.commun._AnalyseDemandStub stub;
			stub = new fr.esiag.commun._AnalyseDemandStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static fr.esiag.commun.AnalyseDemand unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.AnalyseDemand)
		{
			return (fr.esiag.commun.AnalyseDemand)obj;
		}
		else
		{
			fr.esiag.commun._AnalyseDemandStub stub;
			stub = new fr.esiag.commun._AnalyseDemandStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
