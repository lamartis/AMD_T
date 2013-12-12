package fr.esiag.commun;


/**
 * Generated from IDL interface "ManageDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 12 déc. 2013 21:55:59
 */

public abstract class ManageDemandPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, fr.esiag.commun.ManageDemandOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "createDemand", Integer.valueOf(0));
	}
	private String[] ids = {"IDL:transaction/ManageDemand:1.0"};
	public fr.esiag.commun.ManageDemand _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esiag.commun.ManageDemand __r = fr.esiag.commun.ManageDemandHelper.narrow(__o);
		return __r;
	}
	public fr.esiag.commun.ManageDemand _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esiag.commun.ManageDemand __r = fr.esiag.commun.ManageDemandHelper.narrow(__o);
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
			case 0: // createDemand
			{
				java.lang.String _arg0=_input.read_string();
				double _arg1=_input.read_double();
				_out = handler.createReply();
				fr.esiag.commun.DemandHelper.write(_out,createDemand(_arg0,_arg1));
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
