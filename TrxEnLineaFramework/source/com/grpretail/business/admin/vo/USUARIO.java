package com.grpretail.business.admin.vo;

import java.sql.Timestamp;

/**
 * @(#) USUARIO.java
 * 
 * Copyright (c) 2002 ITFusion, All Rights Reserved.
 * 
 * Fecha Creación: 10/05/2004
 */ 

/**
 * Información
 * 
 * @author: null.
 * @version: null
 */

public interface USUARIO { 



	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (05/10/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID();

	/**
	 * Asigna el atributo ID
	 * Creation date: (05/10/2004
	 * @param newID java.lang.Integer
	 */
	public void setID(java.lang.Integer newID);
	/**
	 * Retorna el valor del atributo LOGIN.
	 * Creation date: (05/10/2004
	 * @return java.lang.String
	 */
	public java.lang.String getLOGIN();

	/**
	 * Asigna el atributo LOGIN
	 * Creation date: (05/10/2004
	 * @param newLOGIN java.lang.String
	 */
	public void setLOGIN(java.lang.String newLOGIN);
	/**
	 * Retorna el valor del atributo PASSWORD.
	 * Creation date: (05/10/2004
	 * @return java.lang.String
	 */
	public java.lang.String getPASSWORD();

	/**
	 * Asigna el atributo PASSWORD
	 * Creation date: (05/10/2004
	 * @param newPASSWORD java.lang.String
	 */
	public void setPASSWORD(java.lang.String newPASSWORD);
	/**
	 * Retorna el valor del atributo NOMBRE.
	 * Creation date: (05/10/2004
	 * @return java.lang.String
	 */
	public java.lang.String getNOMBRE();

	/**
	 * Asigna el atributo NOMBRE
	 * Creation date: (05/10/2004
	 * @param newNOMBRE java.lang.String
	 */
	public void setNOMBRE(java.lang.String newNOMBRE);
	/**
	 * Retorna el valor del atributo APELLIDO.
	 * Creation date: (05/10/2004
	 * @return java.lang.String
	 */
	public java.lang.String getAPELLIDO();

	/**
	 * Asigna el atributo APELLIDO
	 * Creation date: (05/10/2004
	 * @param newPASSWORD java.lang.String
	 */
	public void setAPELLIDO(java.lang.String newAPELLIDO);

	/**
	 * Asigna el atributo APELLIDO
	 * Creation date: (05/10/2004
	 * @param newAPELLIDO java.lang.String
	 */
	
	/**
	 * Retorna el valor del atributo EMAIL.
	 * Creation date: (05/10/2004
	 * @return java.lang.String
	 */
	public java.lang.String getEMAIL();

	/**
	 * Asigna el atributo EMAIL
	 * Creation date: (05/10/2004
	 * @param newEMAIL java.lang.String
	 */
	public void setEMAIL(java.lang.String newEMAIL);
	/**
	 * Retorna el valor del atributo ESTADO.
	 * Creation date: (05/10/2004
	 * @return java.lang.String
	 */
	public java.lang.String getESTADO();

	/**
	 * Asigna el atributo ESTADO
	 * Creation date: (05/10/2004
	 * @param newESTADO java.lang.String
	 */
	public void setESTADO(java.lang.String newESTADO);
	
	public Timestamp getINGRDATE();
	
	public void setINGRDATE(Timestamp newINGRDATE);
	
	public Timestamp getRETIDATE();
	
	public void setRETIDATE(Timestamp newRETIDATE);
	
}
