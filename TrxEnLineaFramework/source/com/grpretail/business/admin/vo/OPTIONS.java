package com.grpretail.business.admin.vo;

/**
 * @(#) OPTIONS.java
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

public interface OPTIONS { 



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
	 * Retorna el valor del atributo NOMBRE.
	 * Creation date: (06/25/2004
	 * @return java.lang.String
	 */
	public java.lang.String getNOMBRE();

	/**
	 * Asigna el atributo NOMBRE
	 * Creation date: (06/25/2004
	 * @param newNOMBRE java.lang.String
	 */
	public void setNOMBRE(java.lang.String newNOMBRE);
	/**
	 * Retorna el valor del atributo JERARQUI.
	 * Creation date: (06/25/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getJERARQUI();

	/**
	 * Asigna el atributo JERARQUI
	 * Creation date: (06/25/2004
	 * @param newJERARQUI java.lang.Integer
	 */
	public void setJERARQUI(java.lang.Integer newJERARQUI);
	/**
	 * Retorna el valor del atributo ORDEN.
	 * Creation date: (06/25/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getORDEN();

	/**
	 * Asigna el atributo ORDEN
	 * Creation date: (06/25/2004
	 * @param newORDEN java.lang.Integer
	 */
	public void setORDEN(java.lang.Integer newORDEN);
	/**
	 * Retorna el valor del atributo TIPO.
	 * Creation date: (06/25/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getTIPO();
	
	/**
	 * Asigna el atributo ES_MENU
	 * Creation date: (06/25/2004
	 * @param newES_MENU java.lang.Integer
	 */	
	public java.lang.Integer getES_MENU();
	
	public void setES_MENU(java.lang.Integer newES_MENU);	

	/**
	 * Asigna el atributo TIPO
	 * Creation date: (06/25/2004
	 * @param newTIPO java.lang.Integer
	 */
	public void setTIPO(java.lang.Integer newTIPO);
	
	public String getDESCRIP();
	
	public void setDESCRIP(String newDESCRIP);
	



}