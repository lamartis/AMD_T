package org.Resource1;

import fr.esiag.commun.ManageDemandPOA;
import fr.esiag.commun.NotPreparedException;
import fr.esiag.commun.TransactionException;

public class ManageDemandImpl extends ManageDemandPOA {

	ManageDemandImpl(){
		System.out.println("--------------------->Service Created ! ");
	}
	
	public String createDemand(String demand) {
		return demand;
	}

	public void prepare() throws NotPreparedException {
		// TODO Auto-generated method stub
		
	}

	public void commit() throws TransactionException {
		// TODO Auto-generated method stub
		
	}

	public void rollback() throws TransactionException {
		// TODO Auto-generated method stub
		
	}

}
