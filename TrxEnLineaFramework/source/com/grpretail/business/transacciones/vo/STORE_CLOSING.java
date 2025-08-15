package com.grpretail.business.transacciones.vo;

import java.sql.Timestamp;

/**
 * @(#) ALMACEN.java
 * 
 * Copyright (c) 2002 ITFusion, All Rights Reserved.
 * 
 * Fecha Creación: 18/10/2004
 */ 

/**
 * Información
 * 
 * @author: null.
 * @version: null
 */

public interface STORE_CLOSING { 

	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (10/18/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getSTORE();

	/**
	 * Asigna el atributo ID
	 * Creation date: (10/18/2004
	 * @param newID java.lang.Integer
	 */
	public void setSTORE(java.lang.Integer newID);
	
	public java.sql.Date getDAY();

	/**
	 * Asigna el atributo ID
	 * Creation date: (10/18/2004
	 * @param newID java.lang.Integer
	 */
	public void setDAY(java.sql.Date newID);	
	/**
	 * Retorna el valor del atributo ID_CITY.
	 * Creation date: (10/18/2004
	 * @return java.lang.Integer
	 */
	public java.sql.Timestamp getFECHAHORA();

	/**
	 * Asigna el atributo ID_CITY
	 * Creation date: (10/18/2004
	 * @param newID_CITY java.lang.Integer
	 */
	public void setFECHAHORA(java.sql.Timestamp newFECHAHORA);
	/**
	 * Retorna el valor del atributo ID_DEPT.
	 * Creation date: (10/18/2004
	 * @return java.lang.Integer
	 */

}
