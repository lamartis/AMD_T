package fr.esiag.commun.server;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import fr.esiag.commun.TransactionCoordinationPOA;
import fr.esiag.commun.TransactionResource;

public class TCoordination extends TransactionCoordinationPOA{

	private final int MAX_TRANSACTION = 100;
	private UUID transactionID;
	private Set<TransactionResource> resources = 
			Collections.synchronizedSet(new HashSet<TransactionResource>());
	
	public TCoordination(UUID transactionID){
		this.transactionID = transactionID;
	}
	
	public void registerResource(TransactionResource resource) {
		resources.add(resource);
		System.out.println("Resource Added on the cordinator! ");
		//ManageDemand R1 = (ManageDemand) Proxy.newProxyInstance(TransactionResource.class.getClassLoader() , 
		//new Class[] {TransactionResource.class}, new MyInvocationHandler(transactionManager, transactionCoordination));
				
	}

	public TransactionResource[] getResources() {
		int i = 0;
		TransactionResource[] tResources = new TransactionResource[MAX_TRANSACTION];
		for (TransactionResource transactionResource : resources) {
			tResources[i++] = transactionResource;
		}
		return tResources;
	}

}
