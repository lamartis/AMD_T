package fr.esiag.commun.resource;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		System.out.println("Generic Logger Entry: Invoking " + m.getName());
		// Faire un filtre pour savoir quel object on va interoger.
		return m.invoke(null, args);
	}

}
