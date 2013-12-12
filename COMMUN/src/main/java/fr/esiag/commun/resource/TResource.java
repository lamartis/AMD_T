package fr.esiag.commun.resource;

import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import fr.esiag.commun.TransactionManager;
import fr.esiag.commun.TransactionManagerHelper;
import fr.esiag.commun.TransactionResource;
import fr.esiag.commun.TransactionResourceHelper;
import fr.esiag.commun.TransactionResourcePOA;

public abstract class TResource extends TransactionResourcePOA {

	private String tManagerCorbaLOC = "corbaloc:iiop:1.2@127.0.0.1:1234/Server/TManagerPOAP/TManagerID";

	public TResource(){
		try {
			// initialize the ORB.
			ORB orb = ORB.init( new String[]{}, null );

			//init POA
			POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

			// Lets call the known short object key
			Object obj = orb.string_to_object(tManagerCorbaLOC);

			// and narrow it 
			TransactionManager transactionManager = TransactionManagerHelper.narrow(obj);

			// transfert this TransactionResource to transactionManager.
			TransactionResource transactionResource = TransactionResourceHelper.narrow(rootPOA.id_to_reference(rootPOA.activate_object(this)));
			transactionManager.registerResource(transactionResource);

		} catch (Exception e){
			e.getStackTrace();
		}
	}

}
