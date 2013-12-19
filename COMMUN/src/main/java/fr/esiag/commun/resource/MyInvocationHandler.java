package fr.esiag.commun.resource;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import fr.esiag.commun.ManageAccount;
import fr.esiag.commun.ManageAproveDemand;
import fr.esiag.commun.ManageDemand;
import fr.esiag.commun.TransactionResource;

public class MyInvocationHandler implements InvocationHandler, Serializable {

	public static final long serialVersionUID = 1L;
	public TransactionResource resource = null;
	
	public MyInvocationHandler(TransactionResource res) {
		this.resource =  res;
		
		if (resource instanceof ManageDemand){
			System.out.println("[MyInvocationHandler] resource is instanceof ManageDemand");
		} else if (resource instanceof ManageAproveDemand){
			System.out.println("[MyInvocationHandler] resource is instanceof ManageAproveDemand");
		} else if (resource instanceof ManageAccount){
			System.out.println("[MyInvocationHandler] resource is instanceof ManageAccount");
		}
	}

	public Object invoke(Object proxy, Method m, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		String value = null;
		System.out.println("Generic Logger Entry: Invoking " + m.getName());
		if (m.getName().startsWith("createDemand")){
			//value = (String) m.invoke((ManageDemand) resource, args);
			value = "s";
		} else if (m.getName().startsWith("aproveDemand")){
			//value = (String) m.invoke((ManageDemand) resource, args);
			value = "aa";
		} else if (m.getName().startsWith("createAccount")){
			//value = (String) m.invoke((ManageDemand) resource, args);
			value = "sss";
		}
		return value;
	}

}
