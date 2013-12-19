package org.Resource1;

import fr.esiag.commun.ManageDemand;
import fr.esiag.commun.ManageDemandPOA;
import fr.esiag.commun.NotPreparedException;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.orb.ORBProvider;

public class Resource1 extends ManageDemandPOA {

	ManageDemand man = null;
	ORBProvider orbProvider = ORBProvider.getInstance();

	public Resource1(String resourceName) {
		try {
			orbProvider = ORBProvider.getInstance("111");
			orbProvider.activate_object_with_id("R1", this);
		} catch (Exception e){
			e.getStackTrace();
		}
	}

	public String createDemand(String name) {
		return name;
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

	public static void main(String[] args){
		new Resource1("R1");
	}

}