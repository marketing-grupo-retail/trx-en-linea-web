package com.grpretail.business.admin.vo;

/**
 * @(#) LOG_REP.java
 * 
 * Copyright (c) 2002 ITFusion, All Rights Reserved.
 * 
 * Fecha Creación: 25/06/2004
 */ 

/**
 * Información
 * 
 * @author: null.
 * @version: null
 */

public interface LOG_REP { 



	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (06/25/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID();

	/**
	 * Asigna el atributo ID
	 * Creation date: (06/25/2004
	 * @param newID java.lang.Integer
	 */
	public void setID(java.lang.Integer newID);
	/**
	 * Retorna el valor del atributo ID_USER.
	 * Creation date: (06/25/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_USER();

	/**
	 * Asigna el atributo ID_USER
	 * Creation date: (06/25/2004
	 * @param newID_USER java.lang.Integer
	 */
	public void setID_USER(java.lang.Integer newID_USER);
	/**
	 * Retorna el valor del atributo ID_REPS.
	 * Creation date: (06/25/2004
	 * @return java.lang.Integer
	 */
	public String getDESCRIP();

	/**
	 * Asigna el atributo ID_REPS
	 * Creation date: (06/25/2004
	 * @param newID_REPS java.lang.Integer
	 */
	public void setDESCRIP(String newDESCRIP);
	/**
	 * Retorna el valor del atributo TIME.
	 * Creation date: (06/25/2004
	 * @return java.sql.Time
	 */
	public java.sql.Timestamp getTIME();

	/**
	 * Asigna el atributo TIME
	 * Creation date: (06/25/2004
	 * @param newTIME java.sql.Time
	 */
	public void setTIME(java.sql.Timestamp newTIME);
}
