package org.Resource1;

import fr.esiag.commun.Demand;
import fr.esiag.commun.ManageDemandPOA;

public class Service extends ManageDemandPOA {

	public Demand createDemand(String accountID, double amount) {
		Demand demand = new Demand();
		return demand;
	}
	
}
