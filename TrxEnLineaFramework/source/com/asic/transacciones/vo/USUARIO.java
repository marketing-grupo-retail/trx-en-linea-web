package com.asic.transacciones.vo;

import com.asic.framework.vo.GenericVO;

/**
 * @(#) USUARIO.java
 * 
 * Copyright (c) 2002 ITFusion, All Rights Reserved.
 * 
 * Fecha Creación: 27/04/2005
 */ 

/**
 * Información
 * 
 * @author: null.
 * @version: null
 */

public interface USUARIO extends GenericVO { 



	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (04/27/2005
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID();

	/**
	 * Asigna el atributo ID
	 * Creation date: (04/27/2005
	 * @param newID java.lang.Integer
	 */
	public void setID(java.lang.Integer newID);
	/**
	 * Retorna el valor del atributo LOGIN.
	 * Creation date: (04/27/2005
	 * @return java.lang.String
	 */
	public java.lang.String getLOGIN();

	/**
	 * Asigna el atributo LOGIN
	 * Creation date: (04/27/2005
	 * @param newLOGIN java.lang.String
	 */
	public void setLOGIN(java.lang.String newLOGIN);
	/**
	 * Retorna el valor del atributo PASSWORD.
	 * Creation date: (04/27/2005
	 * @return java.lang.String
	 */
	public java.lang.String getPASSWORD();

	/**
	 * Asigna el atributo PASSWORD
	 * Creation date: (04/27/2005
	 * @param newPASSWORD java.lang.String
	 */
	public void setPASSWORD(java.lang.String newPASSWORD);
	/**
	 * Retorna el valor del atributo NOMBRE.
	 * Creation date: (04/27/2005
	 * @return java.lang.String
	 */
	public java.lang.String getNOMBRE();

	/**
	 * Asigna el atributo NOMBRE
	 * Creation date: (04/27/2005
	 * @param newNOMBRE java.lang.String
	 */
	public void setNOMBRE(java.lang.String newNOMBRE);
	/**
	 * Retorna el valor del atributo APELLIDO.
	 * Creation date: (04/27/2005
	 * @return java.lang.String
	 */
	public java.lang.String getAPELLIDO();

	/**
	 * Asigna el atributo APELLIDO
	 * Creation date: (04/27/2005
	 * @param newAPELLIDO java.lang.String
	 */
	public void setAPELLIDO(java.lang.String newAPELLIDO);
	/**
	 * Retorna el valor del atributo EMAIL.
	 * Creation date: (04/27/2005
	 * @return java.lang.String
	 */
	public java.lang.String getEMAIL();

	/**
	 * Asigna el atributo EMAIL
	 * Creation date: (04/27/2005
	 * @param newEMAIL java.lang.String
	 */
	public void setEMAIL(java.lang.String newEMAIL);
	/**
	 * Retorna el valor del atributo ESTADO.
	 * Creation date: (04/27/2005
	 * @return java.lang.String
	 */
	public java.lang.String getESTADO();

	/**
	 * Asigna el atributo ESTADO
	 * Creation date: (04/27/2005
	 * @param newESTADO java.lang.String
	 */
	public void setESTADO(java.lang.String newESTADO);
	/**
	 * Retorna el valor del atributo INGRDATE.
	 * Creation date: (04/27/2005
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getINGRDATE();

	/**
	 * Asigna el atributo INGRDATE
	 * Creation date: (04/27/2005
	 * @param newINGRDATE java.sql.Timestamp
	 */
	public void setINGRDATE(java.sql.Timestamp newINGRDATE);
	/**
	 * Retorna el valor del atributo RETIDATE.
	 * Creation date: (04/27/2005
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getRETIDATE();

	/**
	 * Asigna el atributo RETIDATE
	 * Creation date: (04/27/2005
	 * @param newRETIDATE java.sql.Timestamp
	 */
	public void setRETIDATE(java.sql.Timestamp newRETIDATE);
}
