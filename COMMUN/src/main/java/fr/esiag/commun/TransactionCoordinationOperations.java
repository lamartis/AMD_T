package fr.esiag.commun;


/**
 * Generated from IDL interface "TransactionCoordination".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 8 déc. 2013 15:09:47
 */

public interface TransactionCoordinationOperations
{
	/* constants */
	/* operations  */
	void begin();
	void registerResource(fr.esiag.commun.TransactionResource resource);
	fr.esiag.commun.TransactionResource[] getResources();
	void commit();
}
