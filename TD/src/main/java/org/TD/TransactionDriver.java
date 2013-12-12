package org.TD;

import java.lang.reflect.Proxy;

import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;

import fr.esiag.commun.Transaction;
import fr.esiag.commun.TransactionCoordination;
import fr.esiag.commun.TransactionFactory;
import fr.esiag.commun.TransactionManager;
import fr.esiag.commun.TransactionManagerHelper;
import fr.esiag.commun.TransactionResource;
import fr.esiag.commun.resource.MyInvocationHandler;

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
		
		//TransactionResource R1 = (TransactionResource) Proxy.newProxyInstance(TransactionResource.class.getClassLoader() , 
		//		new Class[] {TransactionResource.class}, new MyInvocationHandler());
		//transactionCoordination.registerResource(R1); 
		//Ps: l'enregistrement des resources ne se fait pas ici, vu que le TManager qui a toute les resources.
		//C'est ces resources qui vont être donner au cordinateur.
		
		//TransactionResource R2 = Proxy ...
		//transactionCoordination.registerResource(R2);
		
		//TransactionResource R3 = Proxy ...
		//transactionCoordination.registerResource(R3);
		
		//ds l begin le coordi indique au ressource l'id transaction
		transactionCoordination.begin();
		// Demand d         = R1.createDemand(loginID, amount);
		// ApproveDemand ap = R2.aproveDemand(d);
		// String response  = R3.creditAccount(ap);
		transactionCoordination.commit();
		
		//a faire: simuler l envoie d une rqt de tr au resource et tr recoi la réponse. proxy
		//comprendre les commit rollb .. de resource1 et coordi et transactionImpl
		
		
		
		
		/**
		 * for (TransactionResource resource : transactionManager.getResources()) {
			System.out.println(resource.getIdentifiant());
		}
		 * 
		 */
		
	}
}
