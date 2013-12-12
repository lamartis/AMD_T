package fr.esiag.commun.server;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.omg.CosTransactions.Coordinator;
import org.omg.CosTransactions.CoordinatorPOA;

import fr.esiag.commun.TransactionCoordinationPOA;
import fr.esiag.commun.TransactionIDHelper;
import fr.esiag.commun.TransactionResource;

public class TCoordination extends TransactionCoordinationPOA{

	private UUID transactionID;
	private Set<TransactionResource> resources = 
			Collections.synchronizedSet(new HashSet<TransactionResource>());
	
	public TCoordination(UUID transactionID){
		this.transactionID = transactionID;
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

	public void begin() {
		// Envoyer au ressources, l'id transaction dont il doivent faire parti.
		
	}

	public void commit() {
		// là, faut appel aux commits de tous les resources.
	}

}
