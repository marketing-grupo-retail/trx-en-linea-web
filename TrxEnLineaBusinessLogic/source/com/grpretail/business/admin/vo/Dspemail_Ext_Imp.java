/*
 * Created on Jul 16, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.grpretail.business.admin.vo;


/**
 * @author JuanR
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Dspemail_Ext_Imp extends DSPEMAIL_Imp implements Dspemail_Ext {

	private String USERNAME = "";
	
	private String USERMAIL = "";
	
	private String SERDES = "";
	
	public void setUSERNAME(String newUSERNAME){
		USERNAME = newUSERNAME;
	}
	
	public void setUSERMAIL(String newUSERMAIL){
		USERMAIL = newUSERMAIL;
	}
	
	public void setSERDES(String newSERDES) {
		SERDES = newSERDES;
	}

	public String getUSERNAME(){
		return USERNAME;
	}
	
	public String getUSERMAIL(){
		return USERMAIL;
	}

	public String getSERDES() {
		return SERDES;
	}

}
