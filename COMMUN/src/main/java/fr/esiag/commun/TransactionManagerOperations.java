package fr.esiag.commun;


/**
 * Generated from IDL interface "TransactionManager".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 13 déc. 2013 00:57:06
 */

public interface TransactionManagerOperations
{
	/* constants */
	/* operations  */
	void registerResource(fr.esiag.commun.TransactionResource resource);
	fr.esiag.commun.TransactionResource getResource(java.lang.String resourceName);
	fr.esiag.commun.TransactionFactory getTransactionFactory();
}
