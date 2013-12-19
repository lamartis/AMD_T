package fr.esiag.commun;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ManageAccount".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19 déc. 2013 13:36:17
 */

public class ManageAccountPOATie
	extends ManageAccountPOA
{
	private ManageAccountOperations _delegate;

	private POA _poa;
	public ManageAccountPOATie(ManageAccountOperations delegate)
	{
		_delegate = delegate;
	}
	public ManageAccountPOATie(ManageAccountOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public fr.esiag.commun.ManageAccount _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esiag.commun.ManageAccount __r = fr.esiag.commun.ManageAccountHelper.narrow(__o);
		return __r;
	}
	public fr.esiag.commun.ManageAccount _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esiag.commun.ManageAccount __r = fr.esiag.commun.ManageAccountHelper.narrow(__o);
		return __r;
	}
	public ManageAccountOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ManageAccountOperations delegate)
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
	public java.lang.String createDemand(java.lang.String demand)
	{
		return _delegate.createDemand(demand);
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
