package org.TD;

import java.lang.reflect.Proxy;
import java.util.Map;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import fr.esiag.commun.Account;
import fr.esiag.commun.AnalyseDemand;
import fr.esiag.commun.ApprovedDemand;
import fr.esiag.commun.Demand;
import fr.esiag.commun.ManageAccount;
import fr.esiag.commun.ManageDemand;
import fr.esiag.commun.Transaction;
import fr.esiag.commun.TransactionCoordination;
import fr.esiag.commun.TransactionFactory;
import fr.esiag.commun.TransactionManager;
import fr.esiag.commun.TransactionManagerHelper;
import fr.esiag.commun.TransactionResource;
import fr.esiag.commun.api.API;
import fr.esiag.commun.resource.MyInvocationHandler;

public class TransactionDriver {

	public static void main(String[] args){

		// Create functional proxy which it believes that it contacts the resource directly. But it's not Correct.
		// This proxy will tell the CosTransaction to treat requests Transaction driver through resource object.
		
/*		API api = new API();
		Transaction transaction = api.createTransaction();
		ManageDemand   m = transaction.getCoordinator().registerResource(api.getResource("R1")); // ManageDemand = Proxy. // R1 ? IOR
		AnalyseDemand ad = transaction.getCoordinator().registerResource(api.getResource("R2"));
		ManageAccount ma = transaction.getCoordinator().registerResource(api.getResource("R3"));
		//ça nous oblige de modifier la méthode registerResource pour retourner un objet.
		
		transaction.begin();
		Demand          d = m.createDemand("accountID", 12); //Business impl.
		ApprovedDemand ap = ad.approveDemand(m);
		Account         a = ma.creditAccount(ap);
		transaction.commit();*/
		
	}
}

/**
 * 
		API api = API.init()
		Transaction t = api.createTransaction()
		ManageDemand m = t.addResource(R1)
		t.begin()
		m.demand() //Business impl.
 
 * 
 */


