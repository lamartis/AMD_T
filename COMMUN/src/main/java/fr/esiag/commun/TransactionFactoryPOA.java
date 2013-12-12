package fr.esiag.commun;


/**
 * Generated from IDL interface "TransactionFactory".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 8 déc. 2013 15:09:47
 */

public abstract class TransactionFactoryPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, fr.esiag.commun.TransactionFactoryOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "createTransaction", Integer.valueOf(0));
	}
	private String[] ids = {"IDL:transaction/TransactionFactory:1.0"};
	public fr.esiag.commun.TransactionFactory _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esiag.commun.TransactionFactory __r = fr.esiag.commun.TransactionFactoryHelper.narrow(__o);
		return __r;
	}
	public fr.esiag.commun.TransactionFactory _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esiag.commun.TransactionFactory __r = fr.esiag.commun.TransactionFactoryHelper.narrow(__o);
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
			case 0: // createTransaction
			{
				_out = handler.createReply();
				fr.esiag.commun.TransactionHelper.write(_out,createTransaction());
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
