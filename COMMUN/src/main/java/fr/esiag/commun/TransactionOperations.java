package fr.esiag.commun;


/**
 * Generated from IDL interface "Transaction".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 8 déc. 2013 15:09:47
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
