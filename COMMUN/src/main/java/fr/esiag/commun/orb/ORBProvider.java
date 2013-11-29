package fr.esiag.commun.orb;

import java.util.Properties;
import org.omg.CORBA.Object;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Policy;
import org.omg.PortableServer.IdAssignmentPolicyValue;
import org.omg.PortableServer.LifespanPolicyValue;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.Servant;

public class ORBProvider implements Runnable {

	private ORB orb;
	private static ORBProvider instance = null;
	private Properties props;
	private POA rootPOA;
	private POA helloPOAPersistent;

	private ORBProvider(String port) {
		try {
			props = new Properties();
			props.setProperty("jacorb.implname", "Server");
			props.setProperty("OAPort", port);

			//init ORB
			orb = ORB.init(new String[]{}, props);

			//init POA
			rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

			//init new POA
			Policy[] policies = new Policy[2];
			policies[0] = rootPOA.create_lifespan_policy(LifespanPolicyValue.PERSISTENT);
			policies[1] = rootPOA.create_id_assignment_policy(IdAssignmentPolicyValue.USER_ID);

			helloPOAPersistent = rootPOA.create_POA("TManagerPOAP", rootPOA.the_POAManager(), policies);
			helloPOAPersistent.the_POAManager().activate();

			new Thread(this).start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public Object activate(Servant servant) {
		byte[] id;
		Object ref = null;
		try {
			id = rootPOA.activate_object(servant);
			ref = rootPOA.id_to_reference(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ref;
	}

	public void activate_object_with_id(String name, Servant servant){
		try {
			helloPOAPersistent.activate_object_with_id(name.getBytes(), servant);

			// Manually create a persistent based corbaloc.
			String corbalocStr = "corbaloc::localhost:"
					+ props.getProperty("OAPort") + "/"
					+ props.getProperty("jacorb.implname") + "/"
					+ helloPOAPersistent.the_name() + "/" + name;
			
			System.out.println( corbalocStr );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static ORBProvider getInstance(String port) {
		if (instance == null ) {
			instance = new ORBProvider(port); 
		}
		return instance;
	}

	public static ORBProvider getInstance() {
		return instance;
	}


	public void run() {
		if (orb != null) {
			orb.run();
		}

	}

}
