package fr.esiag.commun;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "MediumTemperature".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 20 déc. 2013 07:17:01
 */

public class MediumTemperaturePOATie
	extends MediumTemperaturePOA
{
	private MediumTemperatureOperations _delegate;

	private POA _poa;
	public MediumTemperaturePOATie(MediumTemperatureOperations delegate)
	{
		_delegate = delegate;
	}
	public MediumTemperaturePOATie(MediumTemperatureOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public fr.esiag.commun.MediumTemperature _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esiag.commun.MediumTemperature __r = fr.esiag.commun.MediumTemperatureHelper.narrow(__o);
		return __r;
	}
	public fr.esiag.commun.MediumTemperature _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esiag.commun.MediumTemperature __r = fr.esiag.commun.MediumTemperatureHelper.narrow(__o);
		return __r;
	}
	public MediumTemperatureOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MediumTemperatureOperations delegate)
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

	public double calculMediumTemperature(double ft)
	{
		return _delegate.calculMediumTemperature(ft);
	}

}
