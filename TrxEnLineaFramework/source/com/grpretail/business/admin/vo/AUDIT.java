package com.grpretail.business.admin.vo;

/**
 * @(#) AUDIT.java
 * 
 * Copyright (c) 2002 ITFusion, All Rights Reserved.
 * 
 * Fecha Creación: 04/05/2004
 */ 

/**
 * Información
 * 
 * @author: null.
 * @version: null
 */

public interface AUDIT { 



	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (05/04/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID();

	/**
	 * Asigna el atributo ID
	 * Creation date: (05/04/2004
	 * @param newID java.lang.Integer
	 */
	public void setID(java.lang.Integer newID);
	/**
	 * Retorna el valor del atributo FECHA.
	 * Creation date: (05/04/2004
	 * @return java.lang.String
	 */
	public java.lang.String getFECHA();

	/**
	 * Asigna el atributo FECHA
	 * Creation date: (05/04/2004
	 * @param newFECHA java.lang.String
	 */
	public void setFECHA(java.lang.String newFECHA);
	/**
	 * Retorna el valor del atributo ID_USER.
	 * Creation date: (05/04/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_USER();

	/**
	 * Asigna el atributo ID_USER
	 * Creation date: (05/04/2004
	 * @param newID_USER java.lang.Integer
	 */
	public void setID_USER(java.lang.Integer newID_USER);
	/**
	 * Retorna el valor del atributo SERV.
	 * Creation date: (05/04/2004
	 * @return java.lang.String
	 */
	public java.lang.String getSERV();

	/**
	 * Asigna el atributo SERV
	 * Creation date: (05/04/2004
	 * @param newSERV java.lang.String
	 */
	public void setSERV(java.lang.String newSERV);
	/**
	 * Retorna el valor del atributo DESCRIP.
	 * Creation date: (05/04/2004
	 * @return java.lang.String
	 */
	public java.lang.String getDESCRIP();

	/**
	 * Asigna el atributo DESCRIP
	 * Creation date: (05/04/2004
	 * @param newDESCRIP java.lang.String
	 */
	public void setDESCRIP(java.lang.String newDESCRIP);
}
