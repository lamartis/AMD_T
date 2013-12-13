package fr.esiag.commun;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ManageAccount".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 13 déc. 2013 00:57:06
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
	public fr.esiag.commun.Account creditAccount(fr.esiag.commun.ApprovedDemand demand)
	{
		return _delegate.creditAccount(demand);
	}

}
