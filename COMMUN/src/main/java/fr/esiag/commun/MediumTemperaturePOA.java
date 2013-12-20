package fr.esiag.commun;


/**
 * Generated from IDL interface "MediumTemperature".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 20 déc. 2013 07:17:01
 */

public abstract class MediumTemperaturePOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, fr.esiag.commun.MediumTemperatureOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "rollback", Integer.valueOf(0));
		m_opsHash.put ( "commit", Integer.valueOf(1));
		m_opsHash.put ( "prepare", Integer.valueOf(2));
		m_opsHash.put ( "calculMediumTemperature", Integer.valueOf(3));
	}
	private String[] ids = {"IDL:transaction/MediumTemperature:1.0","IDL:transaction/TransactionResource:1.0"};
	public fr.esiag.commun.MediumTemperature _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esiag.commun.MediumTemperature __r = fr.esiag.commun.MediumTemperatureHelper.narrow(__o);
		return __r;
	}
	public fr.esiag.commun.MediumTemperature _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esiag.commun.MediumTemperature __r = fr.esiag.commun.MediumTemperatureHelper.narrow(__o);
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
			case 0: // rollback
			{
			try
			{
				_out = handler.createReply();
				rollback();
			}
			catch(fr.esiag.commun.TransactionException _ex0)
			{
				_out = handler.createExceptionReply();
				fr.esiag.commun.TransactionExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // commit
			{
			try
			{
				_out = handler.createReply();
				commit();
			}
			catch(fr.esiag.commun.TransactionException _ex0)
			{
				_out = handler.createExceptionReply();
				fr.esiag.commun.TransactionExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // prepare
			{
			try
			{
				_out = handler.createReply();
				prepare();
			}
			catch(fr.esiag.commun.NotPreparedException _ex0)
			{
				_out = handler.createExceptionReply();
				fr.esiag.commun.NotPreparedExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // calculMediumTemperature
			{
				double _arg0=_input.read_double();
				_out = handler.createReply();
				_out.write_double(calculMediumTemperature(_arg0));
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
