package fr.esiag.commun.server;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import fr.esiag.commun.TransactionFactory;
import fr.esiag.commun.TransactionFactoryHelper;
import fr.esiag.commun.TransactionManagerPOA;
import fr.esiag.commun.TransactionResource;
import fr.esiag.commun.orb.ORBProvider;

public class TManager extends TransactionManagerPOA {
	
	TransactionFactory transactionFactory;
	ORBProvider orbProvider = ORBProvider.getInstance("1234");
	private Set<TransactionResource> resources = 
			Collections.synchronizedSet(new HashSet<TransactionResource>());
	
	public TManager(){
		//Persisted this object (TransactionManager)
		orbProvider.activate_object_with_id("TManagerID", this);
		
		//Initialized TransactionFactory
		TFactory transactionFactoryImpl = new TFactory();
		transactionFactory = TransactionFactoryHelper.narrow(orbProvider.activate(transactionFactoryImpl));
	}

	public TransactionFactory getTransactionFactory() {
		return transactionFactory;
	}

	public void registerResource(TransactionResource resource) {
		resources.add(resource);
		System.out.println("Added new resource: [" + resources.size() + "]");
	}
}
