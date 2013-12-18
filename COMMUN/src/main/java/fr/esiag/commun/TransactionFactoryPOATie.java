package fr.esiag.commun;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TransactionFactory".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 18 déc. 2013 17:20:03
 */

public class TransactionFactoryPOATie
	extends TransactionFactoryPOA
{
	private TransactionFactoryOperations _delegate;

	private POA _poa;
	public TransactionFactoryPOATie(TransactionFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public TransactionFactoryPOATie(TransactionFactoryOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
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
	public TransactionFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransactionFactoryOperations delegate)
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
	public fr.esiag.commun.Transaction createTransaction()
	{
		return _delegate.createTransaction();
	}

}
