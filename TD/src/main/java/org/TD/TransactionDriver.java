package org.TD;

import java.io.IOException;

import fr.esiag.commun.FrontTemperature;
import fr.esiag.commun.GlobalSensor;
import fr.esiag.commun.MediumTemperature;
import fr.esiag.commun.Transaction;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.api.API;
import fr.esiag.commun.tools.ProxySerialization;

public class TransactionDriver {
	
	public final static String IP = "10.2.79.56";
	
	public static void main(String[] args) throws ClassNotFoundException, IOException, Exception {

		API api = new API();
		Transaction transaction = api.createTransaction();
		FrontTemperature frontTemperature        = (FrontTemperature) ProxySerialization.unserializeFrom(transaction.addResource("corbaloc:iiop:1.2@"+IP+":111/Server/TManagerPOAP/R1"));
		MediumTemperature mediumTemperature  = (MediumTemperature) ProxySerialization.unserializeFrom(transaction.addResource("corbaloc:iiop:1.2@"+IP+":112/Server/TManagerPOAP/R2"));
		GlobalSensor globalSensor      = (GlobalSensor) ProxySerialization.unserializeFrom(transaction.addResource("corbaloc:iiop:1.2@"+IP+":113/Server/TManagerPOAP/R3"));

		try {
			
			transaction.begin();
			double              d = frontTemperature.calculFrontTemperature(10, 20); 
			double             ap = mediumTemperature.calculMediumTemperature(d);
			double              a = globalSensor.calculGlobalTempareature(ap);
			transaction.commit();
			System.out.println("----------------> " + a);
			
		} catch (TransactionException e) {
			transaction.rollback();
		}
		
	}
}