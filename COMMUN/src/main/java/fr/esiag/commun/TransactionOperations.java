package fr.esiag.commun;


/**
 * Generated from IDL interface "Transaction".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 12 déc. 2013 21:55:59
 */

public interface TransactionOperations
{
	/* constants */
	/* operations  */
	fr.esiag.commun.TransactionCoordination getCoordinator();
	void begin() throws fr.esiag.commun.TransactionException;
	void commit() throws fr.esiag.commun.TransactionException;
	void rollback() throws fr.esiag.commun.TransactionException;
}
