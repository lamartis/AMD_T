package fr.esiag.commun.resource;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import fr.esiag.commun.TransactionCoordination;
import fr.esiag.commun.TransactionManager;
import fr.esiag.commun.TransactionResource;

public class MyInvocationHandler implements InvocationHandler {
	
	public TransactionCoordination coordinator = null;
	public TransactionManager manager = null;
	public TransactionResource resource = null;
	
	public MyInvocationHandler(TransactionManager manager, TransactionCoordination coordinator) {
		this.coordinator = coordinator;
		this.manager = manager;
	}
	
	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		System.out.println("Generic Logger Entry: Invoking " + m.getName());
		if (m.getName().startsWith("createDemand")){
			// Get resource from TransactionManager
			resource = manager.getResource("R1");
			// Save this resource on the coordinator.
			coordinator.registerResource(resource);
			// Recupere the Service composant from this resource.
			// return m.invoke(service, args);
		}
		return m.invoke(null, args);
	}

}
