package org.Resource3;

import fr.esiag.commun.NotPreparedException;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.resource.TResource;

public class Resource3 extends TResource {
	
	public Resource3(String resourceName) {
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
		new Resource3("R3");
	}

}
