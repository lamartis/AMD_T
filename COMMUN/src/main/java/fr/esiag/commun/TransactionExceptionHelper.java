package fr.esiag.commun;


/**
 * Generated from IDL exception "TransactionException".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 20 déc. 2013 07:17:01
 */

public abstract class TransactionExceptionHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TransactionExceptionHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(fr.esiag.commun.TransactionExceptionHelper.id(),"TransactionException",new org.omg.CORBA.StructMember[0]);
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esiag.commun.TransactionException s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static fr.esiag.commun.TransactionException extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:transaction/TransactionException:1.0";
	}
	public static fr.esiag.commun.TransactionException read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final fr.esiag.commun.TransactionException result = new fr.esiag.commun.TransactionException(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final fr.esiag.commun.TransactionException s)
	{
		out.write_string(id());
	}
}
