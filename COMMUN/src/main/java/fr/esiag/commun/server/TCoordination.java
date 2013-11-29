package fr.esiag.commun.server;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import fr.esiag.commun.TransactionCoordinationPOA;
import fr.esiag.commun.TransactionResource;

public class TCoordination extends TransactionCoordinationPOA{

	private Set<TransactionResource> resources = 
			Collections.synchronizedSet(new HashSet<TransactionResource>());
	
	public TCoordination(){
		
	}
	
	public void registerResource(TransactionResource resource) {
		resources.add(resource);
		System.out.println("Resource Added ! ");
	}

	public TransactionResource[] getResources() {
		int i = 0;
		TransactionResource[] tResources = new TransactionResource[3];
		for (TransactionResource transactionResource : tResources) {
			tResources[i++] = transactionResource;
		}
		return tResources;
	}

}
