package org.TD;

import java.io.IOException;

import fr.esiag.commun.ManageAccount;
import fr.esiag.commun.ManageAproveDemand;
import fr.esiag.commun.ManageDemand;
import fr.esiag.commun.Transaction;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.api.API;
import fr.esiag.commun.tools.ProxySerialization;

public class TransactionDriver {

	public static void main(String[] args) throws ClassNotFoundException, IOException, Exception {

		API api = new API();
		Transaction transaction = api.createTransaction();
		ManageDemand manageDemand        = (ManageDemand) ProxySerialization.unserializeFrom(transaction.addResource("corbaloc::localhost:111/Server/TManagerPOAP/R1"));
		ManageAproveDemand aproveDemand  = (ManageAproveDemand) ProxySerialization.unserializeFrom(transaction.addResource("corbaloc::localhost:112/Server/TManagerPOAP/R2"));
		ManageAccount createAccount      = (ManageAccount) ProxySerialization.unserializeFrom(transaction.addResource("corbaloc::localhost:113/Server/TManagerPOAP/R3"));

		try {
			
			transaction.begin();
			String          d = manageDemand.createDemand("s"); 
			String         ap = aproveDemand.aproveDemand(d);
			String          a = createAccount.createAccount(ap);
			transaction.commit();
			System.out.println("----------------> " + a);
			
		} catch (TransactionException e) {
			transaction.rollback();
		}
		
	}
}