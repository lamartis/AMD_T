package fr.esiag.commun;

/**
 * Generated from IDL struct "Account".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 8 déc. 2013 15:09:47
 */

public final class Account
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Account(){}
	public java.lang.String accountID = "";
	public double solde;
	public Account(java.lang.String accountID, double solde)
	{
		this.accountID = accountID;
		this.solde = solde;
	}
}
