package fr.esiag.commun;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ManageAproveDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19 déc. 2013 22:07:02
 */

public class ManageAproveDemandPOATie
	extends ManageAproveDemandPOA
{
	private ManageAproveDemandOperations _delegate;

	private POA _poa;
	public ManageAproveDemandPOATie(ManageAproveDemandOperations delegate)
	{
		_delegate = delegate;
	}
	public ManageAproveDemandPOATie(ManageAproveDemandOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public fr.esiag.commun.ManageAproveDemand _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esiag.commun.ManageAproveDemand __r = fr.esiag.commun.ManageAproveDemandHelper.narrow(__o);
		return __r;
	}
	public fr.esiag.commun.ManageAproveDemand _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esiag.commun.ManageAproveDemand __r = fr.esiag.commun.ManageAproveDemandHelper.narrow(__o);
		return __r;
	}
	public ManageAproveDemandOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ManageAproveDemandOperations delegate)
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
	public java.lang.String aproveDemand(java.lang.String demand)
	{
		return _delegate.aproveDemand(demand);
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
