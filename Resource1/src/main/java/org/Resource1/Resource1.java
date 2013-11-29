package org.Resource1;

import fr.esiag.commun.NotPreparedException;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.resource.TResource;

public class Resource1 extends TResource {
	// Tester si j'arrive à récupérer la resource depuis un client.
	// Et voir aussi la réference.
	public Resource1(String URL) {
		super(URL);
		System.out.println(this.getReference());
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
		new Resource1("http://saadlamarti/REST/service");
	}

}
