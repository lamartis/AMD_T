package org.Resource1;

import fr.esiag.commun.Demand;
import fr.esiag.commun.ManageDemandPOA;

public class ManageDemandImpl extends ManageDemandPOA {
	
	// tableau qui contient newDemand<UUIDTransaction, DemanD>
	public Demand createDemand(String accountID, double amount) {
		Demand demand = new Demand();
		return demand;
	}
	
}
