package org.TD;

import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import fr.esiag.commun.Transaction;
import fr.esiag.commun.TransactionCoordination;
import fr.esiag.commun.TransactionFactory;
import fr.esiag.commun.TransactionManager;
import fr.esiag.commun.TransactionManagerHelper;
import fr.esiag.commun.TransactionResource;
import fr.esiag.commun.TransactionResourceHelper;

public class TransactionDriver {

	public static void main(String[] args){
		
		// initialize the ORB.
		ORB orb = ORB.init( new String[]{}, null );

		// Lets call the known short object key
		Object obj = orb.string_to_object("corbaloc:iiop:1.2@127.0.0.1:1234/Server/TManagerPOAP/TManagerID");

		// and narrow it 
		TransactionManager transactionManager = TransactionManagerHelper.narrow(obj);

		// invoke transactionManager to receive transactionFactory.
		TransactionFactory transactionFactory = transactionManager.getTransactionFactory();

		// invoke transactionFactory to create new Transaction, and retrieve it.
		Transaction transaction = transactionFactory.createTransaction();

		// get transactionCoordination from Transaction
		TransactionCoordination transactionCoordination = transaction.getCoordinator();
		System.out.println(transactionCoordination);
		
		// add resource1 on this transactionCoordination
		Object object = orb.string_to_object("corbaloc:iiop:1.2@127.0.0.1:2345/Server/TManagerPOAP/TR1");
		TransactionResource R1 = TransactionResourceHelper.narrow(object);
		
		// registre resource1 on TransactionCoordination
		transactionCoordination.registerResource(R1);
		
		System.out.println(R1.getReference()); 
	}
}
