package fr.esiag.commun;

/**
 * Generated from IDL struct "ApprovedDemand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 13 d�c. 2013 00:57:06
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
