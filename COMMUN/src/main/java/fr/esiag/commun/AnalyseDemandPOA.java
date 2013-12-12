package fr.esiag.commun;


/**
 * Generated from IDL interface "AnalyseDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 12 déc. 2013 21:55:59
 */

public abstract class AnalyseDemandPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, fr.esiag.commun.AnalyseDemandOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "approveDemand", Integer.valueOf(0));
	}
	private String[] ids = {"IDL:transaction/AnalyseDemand:1.0"};
	public fr.esiag.commun.AnalyseDemand _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esiag.commun.AnalyseDemand __r = fr.esiag.commun.AnalyseDemandHelper.narrow(__o);
		return __r;
	}
	public fr.esiag.commun.AnalyseDemand _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esiag.commun.AnalyseDemand __r = fr.esiag.commun.AnalyseDemandHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // approveDemand
			{
				fr.esiag.commun.Demand _arg0=fr.esiag.commun.DemandHelper.read(_input);
				_out = handler.createReply();
				fr.esiag.commun.ApprovedDemandHelper.write(_out,approveDemand(_arg0));
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
