package fr.esiag.commun;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ManageDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19 déc. 2013 20:15:19
 */

public class ManageDemandPOATie
	extends ManageDemandPOA
{
	private ManageDemandOperations _delegate;

	private POA _poa;
	public ManageDemandPOATie(ManageDemandOperations delegate)
	{
		_delegate = delegate;
	}
	public ManageDemandPOATie(ManageDemandOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
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
	public ManageDemandOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ManageDemandOperations delegate)
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
