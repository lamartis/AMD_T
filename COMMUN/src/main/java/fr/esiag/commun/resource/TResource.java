package fr.esiag.commun.resource;

import fr.esiag.commun.TransactionResourcePOA;
import fr.esiag.commun.orb.ORBProvider;

public abstract class TResource extends TransactionResourcePOA {
	
	// le nom permet d'identifier la resource lorsqu'elle s'enregistre dans le TransactionManager.
	public String name;
	public ORBProvider orbProvider;
	
	public TResource(String resourceName){
		try {
			//orbProvider = ORBProvider.getInstance("111");
			orbProvider.activate_object_with_id("R1", this);
		} catch (Exception e){
			e.getStackTrace();
		}
	}

	public String getIdentifiant(){
		return this.name;
	}
	
}
