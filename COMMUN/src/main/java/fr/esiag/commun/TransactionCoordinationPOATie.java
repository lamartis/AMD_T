package fr.esiag.commun;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TransactionCoordination".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19 déc. 2013 13:36:17
 */

public class TransactionCoordinationPOATie
	extends TransactionCoordinationPOA
{
	private TransactionCoordinationOperations _delegate;

	private POA _poa;
	public TransactionCoordinationPOATie(TransactionCoordinationOperations delegate)
	{
		_delegate = delegate;
	}
	public TransactionCoordinationPOATie(TransactionCoordinationOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public fr.esiag.commun.TransactionCoordination _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esiag.commun.TransactionCoordination __r = fr.esiag.commun.TransactionCoordinationHelper.narrow(__o);
		return __r;
	}
	public fr.esiag.commun.TransactionCoordination _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esiag.commun.TransactionCoordination __r = fr.esiag.commun.TransactionCoordinationHelper.narrow(__o);
		return __r;
	}
	public TransactionCoordinationOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransactionCoordinationOperations delegate)
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
	public fr.esiag.commun.TransactionResource[] getResources()
	{
		return _delegate.getResources();
	}

	public void registerResource(fr.esiag.commun.TransactionResource resource)
	{
_delegate.registerResource(resource);
	}

}
