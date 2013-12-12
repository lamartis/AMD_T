package fr.esiag.commun.server;

import java.util.UUID;

import fr.esiag.commun.TransactionCoordination;
import fr.esiag.commun.TransactionCoordinationHelper;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.TransactionPOA;
import fr.esiag.commun.orb.ORBProvider;

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

}
