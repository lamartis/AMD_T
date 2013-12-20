package fr.esiag.commun;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "GlobalSensor".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 20 déc. 2013 07:17:01
 */

public class GlobalSensorPOATie
	extends GlobalSensorPOA
{
	private GlobalSensorOperations _delegate;

	private POA _poa;
	public GlobalSensorPOATie(GlobalSensorOperations delegate)
	{
		_delegate = delegate;
	}
	public GlobalSensorPOATie(GlobalSensorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public fr.esiag.commun.GlobalSensor _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esiag.commun.GlobalSensor __r = fr.esiag.commun.GlobalSensorHelper.narrow(__o);
		return __r;
	}
	public fr.esiag.commun.GlobalSensor _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esiag.commun.GlobalSensor __r = fr.esiag.commun.GlobalSensorHelper.narrow(__o);
		return __r;
	}
	public GlobalSensorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(GlobalSensorOperations delegate)
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

	public double calculGlobalTempareature(double mt)
	{
		return _delegate.calculGlobalTempareature(mt);
	}

}
