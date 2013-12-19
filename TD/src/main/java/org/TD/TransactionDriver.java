package org.TD;

import java.io.IOException;
import java.lang.reflect.Method;
import fr.esiag.commun.ManageDemand;
import fr.esiag.commun.ManageDemandOperations;
import fr.esiag.commun.ManageDemandPOA;
import fr.esiag.commun.Transaction;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.TransactionResource;
import fr.esiag.commun.api.API;
import fr.esiag.commun.tools.ProxySerialization;

public class TransactionDriver {

	public static void main(String[] args) throws Exception {

		// Create functional proxy which it believes that it contacts the resource directly. But it's not Correct.
		// This proxy will tell the CosTransaction to treat requests Transaction driver through resource object.
		
		API api = new API();
//		TransactionResource resourceIOR = api.getResource("corbaloc::localhost:111/Server/TManagerPOAP/R1");		
		//		String value = ((ManageDemand) resourceIOR).createDemand("saad");
		//		System.out.println(value);
		//System.out.println("Hamdolah");
	
		Transaction transaction = api.createTransaction();
		ManageDemand resource = (ManageDemand) api.getResource("corbaloc::localhost:111/Server/TManagerPOAP/R1");
		if (resource instanceof ManageDemand){
			System.out.println("ouiiiiiiiii");
			System.out.println(resource.getClass().toString());
		}
		transaction.addResource(resource);
		//ManageDemand    m = (ManageDemand) ProxySerialization.unserializeFrom(transaction.addResource(api.getResource("corbaloc::localhost:111/Server/TManagerPOAP/R1")));
		
	//	String          d = m.createDemand("accountID");
	//	System.out.println(d);
// On récupère l'objet CORBA métier, on l'associe au handler, et en retourne le proxy. 
/*		AnalyseDemand ad = (AnalyseDemand) transaction.addResource(api.getResource("corbaloc::localhost:222/Server/TManagerPOAP/R2"));
		ManageAccount ma = (ManageAccount) transaction.addResource(api.getResource("corbaloc::localhost:333/Server/TManagerPOAP/R3"));
		//ça nous oblige de modifier la méthode registerResource pour retourner un objet.
		
		transaction.begin();
		String          d = m.createDemand("accountID"); //Business impl.
		String         ap = ad.approveDemand("m");
		String          a = ma.creditAccount("ap");
		transaction.commit();*/
//		System.out.println("Coooooooooooooooool");
	}
}

/**
 * 
		API api = API.init()
		Transaction t = api.createTransaction()
		ManageDemand m = t.addResource(R1)
		t.begin()
		m.demand() //Business impl.
 
 		ManageDemand m = t.addResource(R1)
 		le t est une référence d'un objet distribuée qui se colocalise dans le serveur COSTransaction.
 		Je vois pas comment retourner un proxy, depuis l'object distribué Transaction. Pour créer un Proxy coté COSTransaction, et 
 		le retourner aux TDs, il va falloir utiliser un Servant Proxy, le narrower et le retourner au TD.
 		En plus, le proxy est cencé etre crée coté td et non pas costransaction.
 		
 		
 		 
 * 
 */


