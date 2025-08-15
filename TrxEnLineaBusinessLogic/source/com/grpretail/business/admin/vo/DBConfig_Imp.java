/*
 * Created on Jul 29, 2004
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
public class DBConfig_Imp implements DBConfig {

	private String NOMBRE = "";
	
	private String LOGIN = ""; 
	
	private String PASSWORD = "";
	
	private String URL = "";
	
	private String DRIVER = "";
	
	
	/**
	 * @return
	 */
	public String getDRIVER() {
		return DRIVER;
	}

	/**
	 * @return
	 */
	public String getLOGIN() {
		return LOGIN;
	}

	/**
	 * @return
	 */
	public String getNOMBRE() {
		return NOMBRE;
	}

	/**
	 * @return
	 */
	public String getPASSWORD() {
		return PASSWORD;
	}

	/**
	 * @return
	 */
	public String getURL() {
		return URL;
	}

	/**
	 * @param string
	 */
	public void setDRIVER(String newDRIVER) {
		DRIVER = newDRIVER;
	}

	/**
	 * @param string
	 */
	public void setLOGIN(String newLOGIN) {
		LOGIN = newLOGIN;
	}

	/**
	 * @param string
	 */
	public void setNOMBRE(String newNOMBRE) {
		NOMBRE = newNOMBRE;
	}

	/**
	 * @param string
	 */
	public void setPASSWORD(String newPASSWORD) {
		PASSWORD = newPASSWORD;
	}

	/**
	 * @param string
	 */
	public void setURL(String newURL) {
		URL = newURL;
	}

}
