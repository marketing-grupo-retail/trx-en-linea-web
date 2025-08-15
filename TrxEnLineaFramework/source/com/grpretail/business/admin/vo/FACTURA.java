package com.grpretail.business.admin.vo;

/**
 * @(#) FACTURA.java
 * 
 * Copyright (c) 2002 ITFusion, All Rights Reserved.
 * 
 * Fecha Creación: 26/07/2004
 */ 

/**
 * Información
 * 
 * @author: null.
 * @version: null
 */

public interface FACTURA { 



	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (07/26/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID();

	/**
	 * Asigna el atributo ID
	 * Creation date: (07/26/2004
	 * @param newID java.lang.Integer
	 */
	public void setID(java.lang.Integer newID);
	/**
	 * Retorna el valor del atributo ID_ENTI.
	 * Creation date: (07/26/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_ENTI();

	/**
	 * Asigna el atributo ID_ENTI
	 * Creation date: (07/26/2004
	 * @param newID_ENTI java.lang.Integer
	 */
	public void setID_ENTI(java.lang.Integer newID_ENTI);
	/**
	 * Retorna el valor del atributo ID_ESTADO.
	 * Creation date: (07/26/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_ESTADO();

	/**
	 * Asigna el atributo ID_ESTADO
	 * Creation date: (07/26/2004
	 * @param newID_ESTADO java.lang.Integer
	 */
	public void setID_ESTADO(java.lang.Integer newID_ESTADO);
	/**
	 * Retorna el valor del atributo TOTAL.
	 * Creation date: (07/26/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getTOTAL();

	/**
	 * Asigna el atributo TOTAL
	 * Creation date: (07/26/2004
	 * @param newTOTAL java.lang.Integer
	 */
	public void setTOTAL(java.lang.Integer newTOTAL);
	/**
	 * Retorna el valor del atributo INIDATE.
	 * Creation date: (07/26/2004
	 * @return java.sql.Timestamp
	 */
	public java.sql.Date getINIDATE();

	/**
	 * Asigna el atributo INIDATE
	 * Creation date: (07/26/2004
	 * @param newINIDATE java.sql.Timestamp
	 */
	public void setINIDATE(java.sql.Date newINIDATE);
	/**
	 * Retorna el valor del atributo FINDATE.
	 * Creation date: (07/26/2004
	 * @return java.sql.Timestamp
	 */
	public java.sql.Date getFINDATE();

	/**
	 * Asigna el atributo FINDATE
	 * Creation date: (07/26/2004
	 * @param newFINDATE java.sql.Timestamp
	 */
	public void setFINDATE(java.sql.Date newFINDATE);
}
