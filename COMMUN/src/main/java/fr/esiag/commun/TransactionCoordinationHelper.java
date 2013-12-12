package fr.esiag.commun;


/**
 * Generated from IDL interface "TransactionCoordination".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 8 d�c. 2013 15:09:47
 */

public abstract class TransactionCoordinationHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TransactionCoordinationHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:transaction/TransactionCoordination:1.0", "TransactionCoordination");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esiag.commun.TransactionCoordination s)
	{
			any.insert_Object(s);
	}
	public static fr.esiag.commun.TransactionCoordination extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:transaction/TransactionCoordination:1.0";
	}
	public static TransactionCoordination read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(fr.esiag.commun._TransactionCoordinationStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final fr.esiag.commun.TransactionCoordination s)
	{
		_out.write_Object(s);
	}
	public static fr.esiag.commun.TransactionCoordination narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.TransactionCoordination)
		{
			return (fr.esiag.commun.TransactionCoordination)obj;
		}
		else if (obj._is_a("IDL:transaction/TransactionCoordination:1.0"))
		{
			fr.esiag.commun._TransactionCoordinationStub stub;
			stub = new fr.esiag.commun._TransactionCoordinationStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static fr.esiag.commun.TransactionCoordination unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof fr.esiag.commun.TransactionCoordination)
		{
			return (fr.esiag.commun.TransactionCoordination)obj;
		}
		else
		{
			fr.esiag.commun._TransactionCoordinationStub stub;
			stub = new fr.esiag.commun._TransactionCoordinationStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
