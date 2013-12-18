package fr.esiag.commun;


/**
 * Generated from IDL interface "Transaction".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 18 déc. 2013 11:42:59
 */

public abstract class TransactionPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, fr.esiag.commun.TransactionOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "begin", Integer.valueOf(0));
		m_opsHash.put ( "rollback", Integer.valueOf(1));
		m_opsHash.put ( "commit", Integer.valueOf(2));
		m_opsHash.put ( "getCoordinator", Integer.valueOf(3));
		m_opsHash.put ( "addResource", Integer.valueOf(4));
	}
	private String[] ids = {"IDL:transaction/Transaction:1.0"};
	public fr.esiag.commun.Transaction _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esiag.commun.Transaction __r = fr.esiag.commun.TransactionHelper.narrow(__o);
		return __r;
	}
	public fr.esiag.commun.Transaction _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esiag.commun.Transaction __r = fr.esiag.commun.TransactionHelper.narrow(__o);
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
			case 0: // begin
			{
			try
			{
				_out = handler.createReply();
				begin();
			}
			catch(fr.esiag.commun.TransactionException _ex0)
			{
				_out = handler.createExceptionReply();
				fr.esiag.commun.TransactionExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // rollback
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
			case 2: // commit
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
			case 3: // getCoordinator
			{
				_out = handler.createReply();
				fr.esiag.commun.TransactionCoordinationHelper.write(_out,getCoordinator());
				break;
			}
			case 4: // addResource
			{
				fr.esiag.commun.TransactionResource _arg0=fr.esiag.commun.TransactionResourceHelper.read(_input);
				_out = handler.createReply();
				fr.esiag.commun.ProxyStreamHelper.write(_out,addResource(_arg0));
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
