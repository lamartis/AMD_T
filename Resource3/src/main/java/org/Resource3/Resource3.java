package org.Resource3;

import fr.esiag.commun.ManageAccountPOA;
import fr.esiag.commun.NotPreparedException;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.orb.ORBProvider;

public class Resource3 extends ManageAccountPOA {
	
	ORBProvider orbProvider = null;
	boolean isUsed = false;
	String name = null;
	
	public Resource3(String resourceName) {
		try {
			name = resourceName;
			orbProvider = ORBProvider.getInstance("113");
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
		new Resource3("R3");
	}

	public String createAccount(String demand) {
		return demand;
	}

}
