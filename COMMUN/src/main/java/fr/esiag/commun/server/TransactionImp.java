package fr.esiag.commun.server;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.UUID;
import fr.esiag.commun.TransactionCoordination;
import fr.esiag.commun.TransactionCoordinationHelper;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.TransactionPOA;
import fr.esiag.commun.TransactionResource;
import fr.esiag.commun.interfaces.resource.ManageDemand;
import fr.esiag.commun.orb.ORBProvider;
import fr.esiag.commun.resource.MyInvocationHandler;
import fr.esiag.commun.tools.ProxySerialization;

public class TransactionImp extends TransactionPOA {

	private UUID transactionID;
	private TransactionCoordination transactionCoordination;
	private ORBProvider orbProvider = ORBProvider.getInstance();
	
	public TransactionImp(UUID transactionID){
		this.transactionID = transactionID;
		TCoordination transactionCoordinationImpl = new TCoordination(this.transactionID);
		transactionCoordination = TransactionCoordinationHelper.narrow(orbProvider.activate(transactionCoordinationImpl));
	}
	
	public TransactionCoordination getCoordinator() {
		return transactionCoordination;
	}

	public void begin() throws TransactionException {
		// TODO Auto-generated method stub
		
	}

	public void commit() throws TransactionException {
		// TODO Auto-generated method stub
		
	}

	public void rollback() throws TransactionException {
		// TODO Auto-generated method stub
		
	}

	public byte[] addResource(TransactionResource resource) {
		this.getCoordinator().registerResource(resource);

		// creation of a proxy. 
		Object o = Proxy.newProxyInstance(ManageDemand.class.getClassLoader() , new Class[] {ManageDemand.class}, new MyInvocationHandler(resource));
		
		// Serialize Object before sending.
		byte[] proxy = null;
		try {
			proxy = ProxySerialization.serializeFrom(o);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return proxy;
		
	}

}
