package com.grpretail.business.transacciones.vo;

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

public interface ALMACEN { 



	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (10/18/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getCODCCO();

	/**
	 * Asigna el atributo ID
	 * Creation date: (10/18/2004
	 * @param newID java.lang.Integer
	 */
	public void setCODCCO(java.lang.Integer newID);
	
	public java.lang.Integer getCODEMP();

	/**
	 * Asigna el atributo ID
	 * Creation date: (10/18/2004
	 * @param newID java.lang.Integer
	 */
	public void setCODEMP(java.lang.Integer newID);	
	/**
	 * Retorna el valor del atributo ID_CITY.
	 * Creation date: (10/18/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_CITY();

	/**
	 * Asigna el atributo ID_CITY
	 * Creation date: (10/18/2004
	 * @param newID_CITY java.lang.Integer
	 */
	public void setID_CITY(java.lang.Integer newID_CITY);
	/**
	 * Retorna el valor del atributo ID_DEPT.
	 * Creation date: (10/18/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_DEPT();

	/**
	 * Asigna el atributo ID_DEPT
	 * Creation date: (10/18/2004
	 * @param newID_DEPT java.lang.Integer
	 */
	public void setID_DEPT(java.lang.Integer newID_DEPT);
	/**
	 * Retorna el valor del atributo ID_PAIS.
	 * Creation date: (10/18/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_PAIS();

	/**
	 * Asigna el atributo ID_PAIS
	 * Creation date: (10/18/2004
	 * @param newID_PAIS java.lang.Integer
	 */
	public void setID_PAIS(java.lang.Integer newID_PAIS);
	/**
	 * Retorna el valor del atributo IP.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getIP();

	/**
	 * Asigna el atributo IP
	 * Creation date: (10/18/2004
	 * @param newIP java.lang.String
	 */
	public void setIP(java.lang.String newIP);
	/**
	 * Retorna el valor del atributo USER.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	//public java.lang.String getUSER();
	public java.lang.String getAL_USER();

	/**
	 * Asigna el atributo USER
	 * Creation date: (10/18/2004
	 * @param newUSER java.lang.String
	 */
	//public void setUSER(java.lang.String newUSER);
	public void setAL_USER(java.lang.String newAL_USER);
	/**
	 * Retorna el valor del atributo PASSWORD.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getPASSWORD();

	/**
	 * Asigna el atributo PASSWORD
	 * Creation date: (10/18/2004
	 * @param newPASSWORD java.lang.String
	 */
	public void setPASSWORD(java.lang.String newPASSWORD);
	/**
	 * Retorna el valor del atributo NOMBRE.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getNOMBRE();

	/**
	 * Asigna el atributo NOMBRE
	 * Creation date: (10/18/2004
	 * @param newNOMBRE java.lang.String
	 */
	public void setNOMBRE(java.lang.String newNOMBRE);
	/**
	 * Retorna el valor del atributo DIRECC.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getDIRECC();

	/**
	 * Asigna el atributo DIRECC
	 * Creation date: (10/18/2004
	 * @param newDIRECC java.lang.String
	 */
	public void setDIRECC(java.lang.String newDIRECC);
	/**
	 * Retorna el valor del atributo TELEFONO.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getTELEFONO();

	/**
	 * Asigna el atributo TELEFONO
	 * Creation date: (10/18/2004
	 * @param newTELEFONO java.lang.String
	 */
	public void setTELEFONO(java.lang.String newTELEFONO);
	/**
	 * Retorna el valor del atributo EMAIL.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getEMAIL();

	/**
	 * Asigna el atributo EMAIL
	 * Creation date: (10/18/2004
	 * @param newEMAIL java.lang.String
	 */
	public void setEMAIL(java.lang.String newEMAIL);
	/**
	 * Retorna el valor del atributo ADM_NAME.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getADM_NAME();

	/**
	 * Asigna el atributo ADM_NAME
	 * Creation date: (10/18/2004
	 * @param newADM_NAME java.lang.String
	 */
	public void setADM_NAME(java.lang.String newADM_NAME);
	
	public void setCITY_NAME(java.lang.String newCITY_NAME);
	
	public java.lang.String getCITY_NAME();
}
