package fr.esiag.commun.resource;

import fr.esiag.commun.TransactionResourcePOA;
import fr.esiag.commun.orb.ORBProvider;

public abstract class TResource extends TransactionResourcePOA {

	public String URL = null;
	public ORBProvider orbProvider = ORBProvider.getInstance("2345");
	
	public TResource(String URL){
		this.URL = URL;
		
		// Persiste this object on POAPersistence using CorbaLOC.
		orbProvider.activate_object_with_id("TR1", this);
	}
	
	public String getReference() {
		return URL;
	}

}
