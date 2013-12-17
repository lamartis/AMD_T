package fr.esiag.commun;


/**
 * Generated from IDL interface "TransactionResource".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 16 déc. 2013 18:27:53
 */

public interface TransactionResourceOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Object getService();
	void prepare() throws fr.esiag.commun.NotPreparedException;
	void commit() throws fr.esiag.commun.TransactionException;
	void rollback() throws fr.esiag.commun.TransactionException;
}
