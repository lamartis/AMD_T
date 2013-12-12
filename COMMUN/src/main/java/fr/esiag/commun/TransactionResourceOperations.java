package fr.esiag.commun;


/**
 * Generated from IDL interface "TransactionResource".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 8 déc. 2013 15:09:47
 */

public interface TransactionResourceOperations
{
	/* constants */
	/* operations  */
	void prepare() throws fr.esiag.commun.NotPreparedException;
	void commit() throws fr.esiag.commun.TransactionException;
	void rollback() throws fr.esiag.commun.TransactionException;
}
