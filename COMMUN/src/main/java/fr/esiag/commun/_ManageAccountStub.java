package fr.esiag.commun;


/**
 * Generated from IDL interface "ManageAccount".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 8 déc. 2013 15:09:47
 */

public class _ManageAccountStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements fr.esiag.commun.ManageAccount
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private String[] ids = {"IDL:transaction/ManageAccount:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = fr.esiag.commun.ManageAccountOperations.class;
	public fr.esiag.commun.Account creditAccount(fr.esiag.commun.ApprovedDemand demand)
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "creditAccount", true);
					fr.esiag.commun.ApprovedDemandHelper.write(_os,demand);
					_is = _invoke(_os);
					fr.esiag.commun.Account _result = fr.esiag.commun.AccountHelper.read(_is);
					return _result;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
							_ax.getInputStream().close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "creditAccount", _opsClass );
			if( _so == null )
				continue;
			ManageAccountOperations _localServant = (ManageAccountOperations)_so.servant;
			fr.esiag.commun.Account _result;
			try
			{
				_result = _localServant.creditAccount(demand);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return _result;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

}
