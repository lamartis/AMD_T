package fr.esiag.commun.server;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.UUID;

import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;

import fr.esiag.commun.ManageDemand;
import fr.esiag.commun.ManageDemandHelper;
import fr.esiag.commun.TransactionCoordination;
import fr.esiag.commun.TransactionCoordinationHelper;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.TransactionPOA;
import fr.esiag.commun.TransactionResource;
import fr.esiag.commun.TransactionResourceHelper;
import fr.esiag.commun.orb.ORBProvider;
import fr.esiag.commun.resource.MyInvocationHandler;
import fr.esiag.commun.tools.ProxySerialization;

public class TransactionImp extends TransactionPOA {

	private UUID transactionID;
	private TransactionCoordination transactionCoordination;
	private ORBProvider orbProvider = ORBProvider.getInstance();

	public TransactionImp(UUID transactionID){
		this.transactionID = transactionID;
		TCoordination transactionCoordinationImpl = new TCoordination(this.transactionID);
		transactionCoordination = TransactionCoordinationHelper.narrow(orbProvider.activate(transactionCoordinationImpl));
	}

	public TransactionCoordination getCoordinator() {
		return transactionCoordination;
	}

	public void begin() throws TransactionException {
		// TODO Auto-generated method stub

	}

	public void commit() throws TransactionException {
		// TODO Auto-generated method stub

	}

	public void rollback() throws TransactionException {
		// TODO Auto-generated method stub

	}

	public byte[] addResource(String resource) {
		ORB orb = ORB.init( new String[]{}, null );
		Object obj = orb.string_to_object(resource);
		System.out.println(obj);
		ManageDemand transactionResource = null;

		transactionResource = ManageDemandHelper.narrow(obj);

		/*		System.out.println("test de conformité");
		if (obj._is_a("IDL:transaction/ManageDemand:1.0")){
			transactionResource = ManageDemandHelper.narrow(obj);
		} else {
			//transactionResource = ManageAccountHelper.narrow(obj);
		} */

		this.getCoordinator().registerResource(TransactionResourceHelper.narrow(transactionResource));

		if (transactionResource instanceof ManageDemand){
			System.out.println("[TransactionImp] ouiiiiiiiii");
		} else {
			System.out.println("[TransactionImp] non");
			System.out.println(resource.getClass().toString());
		}
		// creation of a proxy. 
		java.lang.Object o = Proxy.newProxyInstance(TransactionImp.class.getClassLoader() , new Class[] {ManageDemand.class, TransactionResource.class}, new MyInvocationHandler(transactionResource));
		
		// Serialize Object before sending.
		byte[] proxy = null;
		try {
			proxy = ProxySerialization.serializeFrom(o);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return proxy;		
	}

}
