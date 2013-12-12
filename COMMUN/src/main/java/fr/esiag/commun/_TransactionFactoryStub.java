package fr.esiag.commun;


/**
 * Generated from IDL interface "TransactionFactory".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 12 déc. 2013 21:55:59
 */

public class _TransactionFactoryStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements fr.esiag.commun.TransactionFactory
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private String[] ids = {"IDL:transaction/TransactionFactory:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = fr.esiag.commun.TransactionFactoryOperations.class;
	public fr.esiag.commun.Transaction createTransaction()
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "createTransaction", true);
					_is = _invoke(_os);
					fr.esiag.commun.Transaction _result = fr.esiag.commun.TransactionHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createTransaction", _opsClass );
			if( _so == null )
				continue;
			TransactionFactoryOperations _localServant = (TransactionFactoryOperations)_so.servant;
			fr.esiag.commun.Transaction _result;
			try
			{
				_result = _localServant.createTransaction();
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
