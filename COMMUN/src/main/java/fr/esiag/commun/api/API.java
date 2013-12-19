package fr.esiag.commun.api;

import java.net.URL;

import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;

import fr.esiag.commun.ManageAccount;
import fr.esiag.commun.ManageAccountHelper;
import fr.esiag.commun.ManageDemand;
import fr.esiag.commun.ManageDemandHelper;
import fr.esiag.commun.ManageDemandOperations;
import fr.esiag.commun.ManageDemandPOA;
import fr.esiag.commun.Transaction;
import fr.esiag.commun.TransactionFactory;
import fr.esiag.commun.TransactionManager;
import fr.esiag.commun.TransactionManagerHelper;
import fr.esiag.commun.TransactionResource;
import fr.esiag.commun.TransactionResourceHelper;

public class API {

	public TransactionFactory transactionFactory;
	public TransactionManager transactionManager;
	public ORB orb = null;

	public API(){
		// initialize the ORB.
		orb = ORB.init( new String[]{}, null );

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

	public TransactionResource getResource(String url){
		Object obj = orb.string_to_object(url.toString());
		ManageDemand transactionResource = null;

		System.out.println("test de conformité");
		if (obj._is_a("IDL:transaction/ManageDemand:1.0")){
			transactionResource = ManageDemandHelper.narrow(obj);
		} else {
			//transactionResource = ManageAccountHelper.narrow(obj);
		}

		// Registre the resource on the TManager
		transactionManager.registerResource(transactionResource);
		return transactionResource;
	}

}
