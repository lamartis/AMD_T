package fr.esiag.commun.resource;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import fr.esiag.commun.ManageDemand;
import fr.esiag.commun.TransactionResource;

public class MyInvocationHandler implements InvocationHandler, Serializable {

	public static final long serialVersionUID = 1L;
	public TransactionResource resource = null;

	public MyInvocationHandler(TransactionResource res) {
		this.resource =  res;
		if (resource instanceof ManageDemand){
			System.out.println("[MyInvocationHandler] ouiiiiiiiii");
		} else {
			System.out.println("[MyInvocationHandler] non");
			System.out.println(resource.getClass().toString());
		}
	}

	public Object invoke(Object proxy, Method m, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		String value = null;
		System.out.println("Generic Logger Entry: Invoking " + m.getName());
		//if (m.getName().startsWith("createDemand")){
		//System.out.println("------------> " + this.resource.createDemand("dddddddddddddd"));
		//}	
		return "saad";
	}

}
