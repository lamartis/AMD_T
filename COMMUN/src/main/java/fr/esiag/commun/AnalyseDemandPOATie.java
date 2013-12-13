package fr.esiag.commun;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "AnalyseDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 13 déc. 2013 00:57:06
 */

public class AnalyseDemandPOATie
	extends AnalyseDemandPOA
{
	private AnalyseDemandOperations _delegate;

	private POA _poa;
	public AnalyseDemandPOATie(AnalyseDemandOperations delegate)
	{
		_delegate = delegate;
	}
	public AnalyseDemandPOATie(AnalyseDemandOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public fr.esiag.commun.AnalyseDemand _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esiag.commun.AnalyseDemand __r = fr.esiag.commun.AnalyseDemandHelper.narrow(__o);
		return __r;
	}
	public fr.esiag.commun.AnalyseDemand _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esiag.commun.AnalyseDemand __r = fr.esiag.commun.AnalyseDemandHelper.narrow(__o);
		return __r;
	}
	public AnalyseDemandOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AnalyseDemandOperations delegate)
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
	public fr.esiag.commun.ApprovedDemand approveDemand(fr.esiag.commun.Demand mydemand)
	{
		return _delegate.approveDemand(mydemand);
	}

}
