package fr.esiag.commun.server;

import java.lang.reflect.Proxy;
import java.util.UUID;

import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;

import fr.esiag.commun.FrontTemperature;
import fr.esiag.commun.FrontTemperatureHelper;
import fr.esiag.commun.GlobalSensor;
import fr.esiag.commun.GlobalSensorHelper;
import fr.esiag.commun.MediumTemperature;
import fr.esiag.commun.MediumTemperatureHelper;
import fr.esiag.commun.NotPreparedException;
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
		System.out.println("Starting Transaction ");
		// Verify if there are resources.
		if (this.transactionCoordination.getResources().length == 0)
			throw new TransactionException();
		else {
			System.out.println("[Verified] There are " + this.transactionCoordination.getResources().length + " resources" );
		}
		for (TransactionResource resource : this.transactionCoordination.getResources()) {
			try {
				resource.prepare();
			} catch (NotPreparedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("All resources are prepared ! ");
	}

	public void commit() throws TransactionException {
		System.out.println("Transaction commit");
		// Commit all resources.
		for (TransactionResource resource : this.transactionCoordination.getResources()) {
			resource.commit();
		}
		System.out.println("All resources are commited");
	}

	public void rollback() throws TransactionException {
		System.out.println("Transaction rollBack");
		// rollBack all resources.
		for (TransactionResource resource : this.transactionCoordination.getResources()) {
			resource.rollback();
		}
		System.out.println("All resources are rollBack");
	}

	public byte[] addResource(String resource) {
		ORB orb = ORB.init( new String[]{}, null );
		Object obj = orb.string_to_object(resource);
		System.out.println(obj);
		TransactionResource transactionResource = TransactionResourceHelper.narrow(obj);
		this.getCoordinator().registerResource(transactionResource);

		System.out.println("test de conformité");
		if (obj._is_a("IDL:transaction/FrontTemperature:1.0")){
			transactionResource = FrontTemperatureHelper.narrow(obj);
			System.out.println("[TransactionImp] the resource is instance of ManageDemand");
		} else if (obj._is_a("IDL:transaction/MediumTemperature:1.0")){
			transactionResource = MediumTemperatureHelper.narrow(obj);
			System.out.println("[TransactionImp] the resource is instance of ManageAproveDemand");
		} else if (obj._is_a("IDL:transaction/GlobalSensor:1.0")) {
			transactionResource = GlobalSensorHelper.narrow(obj);
			System.out.println("[TransactionImp] the resource is instance of ManageAccount");
		} else {
			System.out.println("the resource is not identified");
		}

		// creation of a proxy. 
		java.lang.Object o = Proxy.newProxyInstance(TransactionImp.class.getClassLoader() , new Class[] {FrontTemperature.class, MediumTemperature.class, GlobalSensor.class}, new MyInvocationHandler(transactionResource));

		// Serialize Object before sending.
		byte[] proxy = null;
		try {
			proxy = ProxySerialization.serializeFrom(o);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return proxy;		
	}

}
