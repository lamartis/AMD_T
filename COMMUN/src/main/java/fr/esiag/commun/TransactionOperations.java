package fr.esiag.commun;


/**
 * Generated from IDL interface "Transaction".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 16 déc. 2013 18:27:53
 */

public interface TransactionOperations
{
	/* constants */
	/* operations  */
	fr.esiag.commun.TransactionCoordination getCoordinator();
	org.omg.CORBA.Object addResource(fr.esiag.commun.TransactionResource resource);
	void begin() throws fr.esiag.commun.TransactionException;
	void commit() throws fr.esiag.commun.TransactionException;
	void rollback() throws fr.esiag.commun.TransactionException;
}
