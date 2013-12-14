package fr.esiag.commun.api;

import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;

import fr.esiag.commun.Transaction;
import fr.esiag.commun.TransactionFactory;
import fr.esiag.commun.TransactionManager;
import fr.esiag.commun.TransactionManagerHelper;
import fr.esiag.commun.TransactionResource;

public class API {

	public TransactionFactory transactionFactory;
	public TransactionManager transactionManager;
	
	public API(){
		// initialize the ORB.
		ORB orb = ORB.init( new String[]{}, null );

		// Lets call the known short object key
		Object obj = orb.string_to_object("corbaloc:iiop:1.2@127.0.0.1:1234/Server/TManagerPOAP/TManagerID");

		// and narrow it 
		transactionManager = TransactionManagerHelper.narrow(obj);

		// invoke transactionManager to receive transactionFactory.
		transactionFactory = transactionManager.getTransactionFactory();
	}

	public Transaction createTransaction(){
		// invoke transactionFactory to create new Transaction, and retrieve it.
		Transaction transaction = transactionFactory.createTransaction();
		return transaction;
	}
	
	public TransactionResource getResource(String cle){
		return transactionManager.getResource(cle);
	}
	
}
