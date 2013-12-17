package fr.esiag.commun.server;

import java.lang.reflect.Proxy;
import java.util.UUID;

import org.omg.CORBA.Any;
import org.omg.CORBA.AnyHolder;
import org.omg.CORBA.ORB;
import org.omg.CosTrading.ProxyHelper;
import org.omg.PortableServer.Servant;

import fr.esiag.commun.ManageDemand;
import fr.esiag.commun.ManageDemandHelper;
import fr.esiag.commun.TransactionCoordination;
import fr.esiag.commun.TransactionCoordinationHelper;
import fr.esiag.commun.TransactionException;
import fr.esiag.commun.TransactionPOA;
import fr.esiag.commun.TransactionResource;
import fr.esiag.commun.orb.ORBProvider;
import fr.esiag.commun.resource.MyInvocationHandler;

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

	public ManageDemand addResource(TransactionResource resource) {
		this.getCoordinator().registerResource(resource);
		// creation of a proxy. 
	//	TransactionResource R1 = (TransactionResource) Proxy.newProxyInstance(TransactionResource.class.getClassLoader() , new Class[] {ManageDemand.class}, new MyInvocationHandler());
	//	ManageDemand R 1 = (ManageDemand) Proxy.newProxyInstance(ManageDemand.class.getClassLoader() , 
	//			new Class[] {ManageDemand.class}, new MyInvocationHandler());
		
	//	ManageDemandImpl R1 = new ManageDemandImpl();
	//	ManageDemand manageDemand = ManageDemandHelper.narrow(orbProvider.activate(R1)); 
		Object o = Proxy.newProxyInstance(ManageDemand.class.getClassLoader() , new Class[] {ManageDemand.class}, new MyInvocationHandler());
		
		return (ManageDemand) o;
	}

}
