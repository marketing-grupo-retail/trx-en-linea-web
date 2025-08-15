package com.grpretail.business.admin.vo;

/**
 * @(#) LOG_PROP.java
 * 
 * Copyright (c) 2002 ITFusion, All Rights Reserved.
 * 
 * Fecha Creación: 21/07/2004
 */ 

/**
 * Información
 * 
 * @author: null.
 * @version: null
 */

public interface LOG_PROP { 



	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (07/21/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID();

	/**
	 * Asigna el atributo ID
	 * Creation date: (07/21/2004
	 * @param newID java.lang.Integer
	 */
	public void setID(java.lang.Integer newID);
	/**
	 * Retorna el valor del atributo ID_USER.
	 * Creation date: (07/21/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_USER();

	/**
	 * Asigna el atributo ID_USER
	 * Creation date: (07/21/2004
	 * @param newID_USER java.lang.Integer
	 */
	public void setID_USER(java.lang.Integer newID_USER);
	/**
	 * Retorna el valor del atributo CONXNAME.
	 * Creation date: (07/21/2004
	 * @return java.lang.String
	 */
	public java.lang.String getCONXNAME();

	/**
	 * Asigna el atributo CONXNAME
	 * Creation date: (07/21/2004
	 * @param newCONXNAME java.lang.String
	 */
	public void setCONXNAME(java.lang.String newCONXNAME);
	/**
	 * Retorna el valor del atributo ACTUDATE.
	 * Creation date: (07/21/2004
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getACTUDATE();

	/**
	 * Asigna el atributo ACTUDATE
	 * Creation date: (07/21/2004
	 * @param newACTUDATE java.sql.Timestamp
	 */
	public void setACTUDATE(java.sql.Timestamp newACTUDATE);
}
