package fr.esiag.commun;


/**
 * Generated from IDL struct "Demand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 12 déc. 2013 21:55:59
 */

public abstract class DemandHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(DemandHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(fr.esiag.commun.DemandHelper.id(),"Demand",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("demandID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("accountID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("amount", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(7)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esiag.commun.Demand s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static fr.esiag.commun.Demand extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:transaction/Demand:1.0";
	}
	public static fr.esiag.commun.Demand read (final org.omg.CORBA.portable.InputStream in)
	{
		fr.esiag.commun.Demand result = new fr.esiag.commun.Demand();
		result.demandID=in.read_string();
		result.accountID=in.read_string();
		result.amount=in.read_double();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final fr.esiag.commun.Demand s)
	{
		java.lang.String tmpResult1 = s.demandID;
out.write_string( tmpResult1 );
		java.lang.String tmpResult2 = s.accountID;
out.write_string( tmpResult2 );
		out.write_double(s.amount);
	}
}
