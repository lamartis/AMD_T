package org.Resource2;

import fr.esiag.commun.MediumTemperaturePOA;
import fr.esiag.commun.NotPreparedException;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.orb.ORBProvider;

public class Resource2 extends MediumTemperaturePOA {
	
	double mediumValue;
	
	ORBProvider orbProvider = null;
	boolean isUsed = false;
	String name = null;
	
	public Resource2(String resourceName) {
		try {
			name = resourceName;
			orbProvider = ORBProvider.getInstance("112");
			orbProvider.activate_object_with_id(resourceName, this);
		} catch (Exception e){
			e.getStackTrace();
		}
	}

	public void prepare() throws NotPreparedException {
		if (isUsed)
			throw new NotPreparedException();
		else { 
			System.out.println("Resource is prepared");
			isUsed = true;
		}
	}

	public void commit() throws TransactionException {
		if (!isUsed)
			throw new TransactionException();
		else {
			System.out.println("Resource is commited");
			isUsed = false;
		}
	}

	public void rollback() throws TransactionException {
		if (!isUsed)
			throw new TransactionException();
		else {
			System.out.println("RollBack Resource");
			isUsed = false;
		}
			
	}
	
	public static void main(String[] args){
		new Resource2("R2");
	}

	public double calculMediumTemperature(double ft) {
		mediumValue =  (10*Math.random()+ft)/2;
		return this.getValue();
	}

	public double getValue() {
		return this.mediumValue;
	}
	

}
