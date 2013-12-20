package fr.esiag.commun;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TransactionResource".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 20 déc. 2013 07:17:01
 */

public class TransactionResourcePOATie
	extends TransactionResourcePOA
{
	private TransactionResourceOperations _delegate;

	private POA _poa;
	public TransactionResourcePOATie(TransactionResourceOperations delegate)
	{
		_delegate = delegate;
	}
	public TransactionResourcePOATie(TransactionResourceOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public fr.esiag.commun.TransactionResource _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esiag.commun.TransactionResource __r = fr.esiag.commun.TransactionResourceHelper.narrow(__o);
		return __r;
	}
	public fr.esiag.commun.TransactionResource _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esiag.commun.TransactionResource __r = fr.esiag.commun.TransactionResourceHelper.narrow(__o);
		return __r;
	}
	public TransactionResourceOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransactionResourceOperations delegate)
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
	public void rollback() throws fr.esiag.commun.TransactionException
	{
_delegate.rollback();
	}

	public void commit() throws fr.esiag.commun.TransactionException
	{
_delegate.commit();
	}

	public void prepare() throws fr.esiag.commun.NotPreparedException
	{
_delegate.prepare();
	}

}
