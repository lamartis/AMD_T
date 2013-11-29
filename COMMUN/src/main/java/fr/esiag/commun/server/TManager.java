package fr.esiag.commun.server;

import fr.esiag.commun.TransactionFactory;
import fr.esiag.commun.TransactionFactoryHelper;
import fr.esiag.commun.TransactionManagerPOA;
import fr.esiag.commun.orb.ORBProvider;

public class TManager extends TransactionManagerPOA {
	
	TransactionFactory transactionFactory;
	ORBProvider orbProvider = ORBProvider.getInstance("1234");
	
	public TManager(){
		orbProvider.activate_object_with_id("TManagerID", this);
	}

	public TransactionFactory getTransactionFactory() {
		TFactory transactionFactoryImpl = new TFactory();
		transactionFactory = TransactionFactoryHelper.narrow(orbProvider.activate(transactionFactoryImpl));
		return transactionFactory;
	}
}
