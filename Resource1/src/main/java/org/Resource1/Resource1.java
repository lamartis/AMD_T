package org.Resource1;

import fr.esiag.commun.FrontTemperaturePOA;
import fr.esiag.commun.NotPreparedException;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.orb.ORBProvider;
import fr.esiag.commun.tools.Lock;

public class Resource1 extends FrontTemperaturePOA {

	private double frontTemperature;
	
	private ORBProvider orbProvider = null;
	private boolean isUsed = false;
	private String name = null;
	private Lock lock;
	
	public Resource1(String resourceName)	{
		try {
			name = resourceName;
			orbProvider = ORBProvider.getInstance("111");
			orbProvider.activate_object_with_id(resourceName, this);
			lock = new Lock();
		} catch (Exception e){
			e.getStackTrace();
		}
	}

	
	public double getFrontTemperature()	{
		return this.frontTemperature;
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
			this.frontTemperature = 0;
			isUsed = false;
			lock.unlock();
		}
	}

	public void rollback() throws TransactionException {
		if (!isUsed)
			throw new TransactionException();
		else {
			System.out.println("RollBack Resource");
			this.frontTemperature = 0;
			isUsed = false;
			lock.unlock();
		}

	}

	public static void main(String[] args){
		new Resource1("R1");
	}


	public synchronized double calculFrontTemperature(double altitude, double speed) {
		frontTemperature = (altitude*speed)/1000;
		return getValue();
	}


	public double getValue() {
		return this.frontTemperature;
	}

}