package fr.esiag.commun;


/**
 * Generated from IDL struct "ApprovedDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 13 déc. 2013 00:57:06
 */

public abstract class ApprovedDemandHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ApprovedDemandHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(fr.esiag.commun.ApprovedDemandHelper.id(),"ApprovedDemand",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("approvedDemandID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("mydemand", org.omg.CORBA.ORB.init().create_struct_tc(fr.esiag.commun.DemandHelper.id(),"Demand",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("demandID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("accountID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("amount", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(7)), null)}), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esiag.commun.ApprovedDemand s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static fr.esiag.commun.ApprovedDemand extract (final org.omg.CORBA.Any any)
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
		return "IDL:transaction/ApprovedDemand:1.0";
	}
	public static fr.esiag.commun.ApprovedDemand read (final org.omg.CORBA.portable.InputStream in)
	{
		fr.esiag.commun.ApprovedDemand result = new fr.esiag.commun.ApprovedDemand();
		result.approvedDemandID=in.read_string();
		result.mydemand=fr.esiag.commun.DemandHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final fr.esiag.commun.ApprovedDemand s)
	{
		java.lang.String tmpResult4 = s.approvedDemandID;
out.write_string( tmpResult4 );
		fr.esiag.commun.DemandHelper.write(out,s.mydemand);
	}
}
