package fr.esiag.commun.server;

import fr.esiag.commun.Transaction;
import fr.esiag.commun.TransactionFactoryPOA;
import fr.esiag.commun.TransactionHelper;
import fr.esiag.commun.orb.ORBProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class TFactory extends TransactionFactoryPOA {
	
	private Set<UUID> uuids = 
			Collections.synchronizedSet(new HashSet<UUID>());
	private Map<UUID, Transaction> transactions = 
			Collections.synchronizedMap(new HashMap<UUID, Transaction>());
	public ORBProvider orbProvider = ORBProvider.getInstance();
	
	public TFactory(){
		System.out.println("Factory Created !!");
	}

	public Transaction createTransaction() {		
		UUID uuid = UUID.randomUUID();
		uuids.add(uuid);
		
		TransactionImp transactionImpl = new TransactionImp(uuid);
		Transaction transaction = TransactionHelper.narrow(orbProvider.activate(transactionImpl));
		
		transactions.put(uuid, transaction);
		
		return transaction;
	}
	
	
}
