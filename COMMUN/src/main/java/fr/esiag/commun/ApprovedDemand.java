package fr.esiag.commun;

/**
 * Generated from IDL struct "ApprovedDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 8 déc. 2013 15:09:47
 */

public final class ApprovedDemand
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ApprovedDemand(){}
	public java.lang.String approvedDemandID = "";
	public fr.esiag.commun.Demand mydemand;
	public ApprovedDemand(java.lang.String approvedDemandID, fr.esiag.commun.Demand mydemand)
	{
		this.approvedDemandID = approvedDemandID;
		this.mydemand = mydemand;
	}
}
