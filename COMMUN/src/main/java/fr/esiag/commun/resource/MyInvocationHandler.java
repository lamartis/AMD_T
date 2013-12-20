package fr.esiag.commun.resource;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import fr.esiag.commun.FrontTemperature;
import fr.esiag.commun.GlobalSensor;
import fr.esiag.commun.MediumTemperature;
import fr.esiag.commun.TransactionResource;

public class MyInvocationHandler implements InvocationHandler, Serializable {

	public static final long serialVersionUID = 1L;
	public TransactionResource resource = null;
	
	public MyInvocationHandler(TransactionResource res) {
		this.resource =  res;
		
		if (resource instanceof FrontTemperature){
			System.out.println("[MyInvocationHandler] resource is instanceof FrontTemperature");
		} else if (resource instanceof MediumTemperature){
			System.out.println("[MyInvocationHandler] resource is instanceof MediumTemperature");
		} else if (resource instanceof GlobalSensor){
			System.out.println("[MyInvocationHandler] resource is instanceof GlobalSensor");
		}
	}

	public Object invoke(Object proxy, Method m, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		double value = 0;
		System.out.println("Generic Logger Entry: Invoking " + m.getName());
		if (m.getName().startsWith("calculFrontTemperature")){
			//value = (Double) m.invoke((FrontTemperature) resource, args);
			value = 12;
		} else if (m.getName().startsWith("calculMediumTemperature")){
			//value = (Double) m.invoke((MediumTemperature) resource, args);
			value = 11;
		} else if (m.getName().startsWith("calculGlobalTempareature")){
			//value = (Double) m.invoke((GlobalSensor) resource, args);
			value = 20.3;
		}
		return value;
	}

}
