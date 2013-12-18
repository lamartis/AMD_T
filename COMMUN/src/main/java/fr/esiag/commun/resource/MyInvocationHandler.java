package fr.esiag.commun.resource;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import fr.esiag.commun.ManageDemand;
import fr.esiag.commun.TransactionResource;

public class MyInvocationHandler implements InvocationHandler, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public TransactionResource resource = null;
	public Object object;
	
	public MyInvocationHandler() {
		System.out.println("dkhaaaaaaaaaaaaaaaal");
		// récupérer la référence du service et le stocké ici.
		//object = resource.getService();
	}
	
	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		System.out.println("Generic Logger Entry: Invoking " + m.getName());
		if (m.getName().startsWith("createDemand")){
			((ManageDemand)object).createDemand("demand");
		}
		return m.invoke(null, args);
	}

}
