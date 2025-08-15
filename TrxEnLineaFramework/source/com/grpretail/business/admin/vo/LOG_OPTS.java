package com.grpretail.business.admin.vo;

/**
 * @(#) LOG_OPTS.java
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

public interface LOG_OPTS { 



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
	 * Retorna el valor del atributo ID_USR.
	 * Creation date: (06/25/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_USR();

	/**
	 * Asigna el atributo ID_USR
	 * Creation date: (06/25/2004
	 * @param newID_USR java.lang.Integer
	 */
	public void setID_USR(java.lang.Integer newID_USR);
	/**
	 * Retorna el valor del atributo ID_OPTS.
	 * Creation date: (06/25/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_OPTS();

	/**
	 * Asigna el atributo ID_OPTS
	 * Creation date: (06/25/2004
	 * @param newID_OPTS java.lang.Integer
	 */
	public void setID_OPTS(java.lang.Integer newID_OPTS);
	/**
	 * Retorna el valor del atributo TIME.
	 * Creation date: (06/25/2004
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getTIME();

	/**
	 * Asigna el atributo TIME
	 * Creation date: (06/25/2004
	 * @param newTIME java.sql.Timestamp
	 */
	public void setTIME(java.sql.Timestamp newTIME);
	
	public String getDESCRIP();
	
	public void setDESCRIP(String newDESCRIP);
}
