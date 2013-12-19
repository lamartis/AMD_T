package fr.esiag.commun;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TransactionManager".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19 déc. 2013 13:36:17
 */

public class TransactionManagerPOATie
	extends TransactionManagerPOA
{
	private TransactionManagerOperations _delegate;

	private POA _poa;
	public TransactionManagerPOATie(TransactionManagerOperations delegate)
	{
		_delegate = delegate;
	}
	public TransactionManagerPOATie(TransactionManagerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public fr.esiag.commun.TransactionManager _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esiag.commun.TransactionManager __r = fr.esiag.commun.TransactionManagerHelper.narrow(__o);
		return __r;
	}
	public fr.esiag.commun.TransactionManager _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esiag.commun.TransactionManager __r = fr.esiag.commun.TransactionManagerHelper.narrow(__o);
		return __r;
	}
	public TransactionManagerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransactionManagerOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public fr.esiag.commun.TransactionFactory getTransactionFactory()
	{
		return _delegate.getTransactionFactory();
	}

	public void registerResource(fr.esiag.commun.TransactionResource resource)
	{
_delegate.registerResource(resource);
	}

}
