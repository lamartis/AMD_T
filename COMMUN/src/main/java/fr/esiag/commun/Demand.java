package fr.esiag.commun;

/**
 * Generated from IDL struct "Demand".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 13 déc. 2013 00:57:06
 */

public final class Demand
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Demand(){}
	public java.lang.String demandID = "";
	public java.lang.String accountID = "";
	public double amount;
	public Demand(java.lang.String demandID, java.lang.String accountID, double amount)
	{
		this.demandID = demandID;
		this.accountID = accountID;
		this.amount = amount;
	}
}
