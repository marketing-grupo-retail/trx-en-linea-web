package com.grpretail.business.admin.vo;

/**
 * @(#) USUARIO.java
 * 
 * Copyright (c) 2002 ITFusion, All Rights Reserved.
 * 
 * Fecha Creaci�n: 03/05/2004
 */ 

/**
 * Informaci�n
 * 
 * @author: null.
 * @version: null
 */

public interface USUARIO_Ext extends USUARIO{ 

	/** Usuario activo */
	public final String ACTIVE_STATUS = "A";
	
	/** Usuario eliminado */
	public final String ERASED_STATUS = "E";
	
	/** Usuario deshabilitado temporalmente*/
	public final String DISABLE_STATUS = "I";

	
	public String getDESC();

	public void setDESC(String string);


}
