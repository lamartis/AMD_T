package org.Resource1;

import fr.esiag.commun.NotPreparedException;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.resource.TResource;

public class Resource1 extends TResource {
	
	public ManageDemandImpl manageDemandImpl = null;
	
	public Resource1(String resourceName) {
		super(resourceName);
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
