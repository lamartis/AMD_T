package org.Resource2;

import fr.esiag.commun.MediumTemperaturePOA;
import fr.esiag.commun.NotPreparedException;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.orb.ORBProvider;
import fr.esiag.commun.tools.Lock;

public class Resource2 extends MediumTemperaturePOA {
	
	double mediumValue;
	
	ORBProvider orbProvider = null;
	boolean isUsed = false;
	String name = null;
	private Lock lock;
	
	public Resource2(String resourceName) {
		try {
			name = resourceName;
			orbProvider = ORBProvider.getInstance("112");
			orbProvider.activate_object_with_id(resourceName, this);
			lock = new Lock();
		} catch (Exception e){
			e.getStackTrace();
		}
	}

	public void prepare() throws NotPreparedException {
		lock.lock();
		if (isUsed)
			throw new NotPreparedException();
		else { 
			System.out.println("Resource is locked and prepared");
			isUsed = true;
		}
	}

	public void commit() throws TransactionException {
		if (!isUsed)
			throw new TransactionException();
		else {
			System.out.println("Resource is commited");
			this.mediumValue = 0;
			isUsed = false;
			lock.unlock();
		}
	}

	public void rollback() throws TransactionException {
		if (!isUsed)
			throw new TransactionException();
		else {
			System.out.println("RollBack Resource");
			this.mediumValue = 0;
			lock.unlock();
			isUsed = false;
		}
			
	}
	
	public static void main(String[] args){
		new Resource2("R2");
	}

	public synchronized double calculMediumTemperature(double ft) {
		mediumValue =  (10*Math.random()+ft)/2;
		return this.getValue();
	}

	public double getValue() {
		return this.mediumValue;
	}
	

}
