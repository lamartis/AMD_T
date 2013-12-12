package fr.esiag.commun;


/**
 * Generated from IDL interface "TransactionResource".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 12 déc. 2013 21:55:59
 */

public interface TransactionResourceOperations
{
	/* constants */
	/* operations  */
	java.lang.String getIdentifiant();
	void prepare() throws fr.esiag.commun.NotPreparedException;
	void commit() throws fr.esiag.commun.TransactionException;
	void rollback() throws fr.esiag.commun.TransactionException;
}
