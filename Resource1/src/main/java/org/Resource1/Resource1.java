package org.Resource1;

import fr.esiag.commun.FrontTemperaturePOA;
import fr.esiag.commun.NotPreparedException;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.orb.ORBProvider;

public class Resource1 extends FrontTemperaturePOA {

	private double frontTemperature;
	
	ORBProvider orbProvider = null;
	boolean isUsed = false;
	String name = null;
	
	public Resource1(String resourceName)	{
		try {
			name = resourceName;
			orbProvider = ORBProvider.getInstance("111");
			orbProvider.activate_object_with_id(resourceName, this);
		} catch (Exception e){
			e.getStackTrace();
		}
	}

	
	public double getFrontTemperature()	{
		return this.frontTemperature;
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
		new Resource1("R1");
	}


	public double calculFrontTemperature(double altitude, double speed) {
		frontTemperature = (altitude*speed)/1000;
		return getValue();
	}


	public double getValue() {
		return this.frontTemperature;
	}

}