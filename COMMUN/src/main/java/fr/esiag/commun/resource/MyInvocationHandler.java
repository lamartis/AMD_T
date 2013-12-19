package fr.esiag.commun.resource;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import fr.esiag.commun.TransactionResource;

public class MyInvocationHandler implements InvocationHandler, Serializable {
	
	private static final long serialVersionUID = 1L;
	public TransactionResource resource = null;
	
	public MyInvocationHandler(TransactionResource resource) {
		this.resource = resource;
	}

	public Object invoke(Object proxy, Method m, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		String value = null;
		System.out.println("Generic Logger Entry: Invoking " + m.getName());
		if (m.getName().startsWith("createDemand")){
			//value = ((ManageDemand) resource).createDemand("saad");
			//System.out.println("la valeur récuperer est: " + value);
			//value = (String) m.invoke(this.resource, args);
			
			Class c = resource.getClass();
			for (Method method : c.getMethods()) {
				System.out.println("----------->" + method.getName());
			}
		}	
		return "value";
	}

}
