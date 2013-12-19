package fr.esiag.commun.api;

import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import fr.esiag.commun.Transaction;
import fr.esiag.commun.TransactionFactory;
import fr.esiag.commun.TransactionManager;
import fr.esiag.commun.TransactionManagerHelper;

public class API {

	public TransactionFactory transactionFactory;
	public TransactionManager transactionManager;
	public ORB orb = null;
	public final static String IP = "10.2.79.56";
	
	public API(){
		// initialize the ORB.
		orb = ORB.init( new String[]{}, null );

		// Lets call the known short object key
		Object obj = orb.string_to_object("corbaloc:iiop:1.2@"+ IP +":1234/Server/TManagerPOAP/TManagerID");

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

/*	public TransactionResource getResource(String url){
		Object obj = orb.string_to_object(url.toString());
		TransactionResource transactionResource = null;

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
*/
}
