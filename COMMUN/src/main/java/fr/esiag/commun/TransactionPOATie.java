package fr.esiag.commun;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Transaction".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 16 déc. 2013 18:27:53
 */

public class TransactionPOATie
	extends TransactionPOA
{
	private TransactionOperations _delegate;

	private POA _poa;
	public TransactionPOATie(TransactionOperations delegate)
	{
		_delegate = delegate;
	}
	public TransactionPOATie(TransactionOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
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
	public TransactionOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransactionOperations delegate)
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
	public void begin() throws fr.esiag.commun.TransactionException
	{
_delegate.begin();
	}

	public void rollback() throws fr.esiag.commun.TransactionException
	{
_delegate.rollback();
	}

	public void commit() throws fr.esiag.commun.TransactionException
	{
_delegate.commit();
	}

	public fr.esiag.commun.TransactionCoordination getCoordinator()
	{
		return _delegate.getCoordinator();
	}

	public org.omg.CORBA.Object addResource(fr.esiag.commun.TransactionResource resource)
	{
		return _delegate.addResource(resource);
	}

}
