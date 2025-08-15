/*
 * Created on Jul 8, 2004
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
public class LOG_OPTS_Ext_Imp extends LOG_OPTS_Imp implements LOG_OPTS_Ext {
	
	private String LOGIN = "";
	
	private String NOMBRE = "";

	private String CANTI = "";
	
	private String PRECIO = "";

	private Integer TOTAL;
	
	private String DESC_OPTS = "";


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
	 * @return
	 */
	public String getCANTI() {
		return CANTI;
	}

	/**
	 * @return
	 */
	public String getPRECIO() {
		return PRECIO;
	}

	/**
	 * @return
	 */
	public Integer getTOTAL() {
		return TOTAL;
	}

	/**
	 * @param string
	 */
	public void setCANTI(String newCANTI) {
		CANTI = newCANTI;
	}

	/**
	 * @param string
	 */
	public void setPRECIO(String newPRECIO) {
		PRECIO = newPRECIO;
	}

	/**
	 * @param string
	 */
	public void setTOTAL(Integer newTOTAL) {
		TOTAL = newTOTAL;
	}

	/**
	 * @return
	 */
	public String getDESC_OPTS() {
		return DESC_OPTS;
	}

	/**
	 * @param string
	 */
	public void setDESC_OPTS(String newDESC_OPTS) {
		DESC_OPTS = newDESC_OPTS;
	}

}
