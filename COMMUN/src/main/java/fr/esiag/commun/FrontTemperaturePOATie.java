package fr.esiag.commun;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "FrontTemperature".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 20 déc. 2013 07:17:01
 */

public class FrontTemperaturePOATie
	extends FrontTemperaturePOA
{
	private FrontTemperatureOperations _delegate;

	private POA _poa;
	public FrontTemperaturePOATie(FrontTemperatureOperations delegate)
	{
		_delegate = delegate;
	}
	public FrontTemperaturePOATie(FrontTemperatureOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public fr.esiag.commun.FrontTemperature _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esiag.commun.FrontTemperature __r = fr.esiag.commun.FrontTemperatureHelper.narrow(__o);
		return __r;
	}
	public fr.esiag.commun.FrontTemperature _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esiag.commun.FrontTemperature __r = fr.esiag.commun.FrontTemperatureHelper.narrow(__o);
		return __r;
	}
	public FrontTemperatureOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FrontTemperatureOperations delegate)
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
	public double calculFrontTemperature(double altitude, double speed)
	{
		return _delegate.calculFrontTemperature(altitude,speed);
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
