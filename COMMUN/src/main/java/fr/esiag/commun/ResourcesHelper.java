package fr.esiag.commun;

/**
 * Generated from IDL alias "Resources".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 8 déc. 2013 15:09:47
 */

public abstract class ResourcesHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, fr.esiag.commun.TransactionResource[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static fr.esiag.commun.TransactionResource[] extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ResourcesHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(fr.esiag.commun.ResourcesHelper.id(), "Resources",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_interface_tc("IDL:transaction/TransactionResource:1.0", "TransactionResource")));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:transaction/Resources:1.0";
	}
	public static fr.esiag.commun.TransactionResource[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		fr.esiag.commun.TransactionResource[] _result;
		int _l_result1 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result1 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result1);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new fr.esiag.commun.TransactionResource[_l_result1];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=fr.esiag.commun.TransactionResourceHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, fr.esiag.commun.TransactionResource[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			fr.esiag.commun.TransactionResourceHelper.write(_out,_s[i]);
		}

	}
}
