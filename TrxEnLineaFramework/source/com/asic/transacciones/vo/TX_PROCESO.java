package com.asic.transacciones.vo;


/**
 * @(#) TX_PROCESO.java
 * 
 * Copyright (c) 2002 ITFusion, All Rights Reserved.
 * 
 * Fecha Creación: 24/02/2006
 */ 

/**
 * Información
 * 
 * @author: null.
 * @version: null
 */

public interface TX_PROCESO { 



	/**
	 * Retorna el valor del atributo PROC_ID.
	 * Creation date: (02/24/2006
	 * @return java.lang.Double
	 */
	public java.lang.Double getPROC_ID();

	/**
	 * Asigna el atributo PROC_ID
	 * Creation date: (02/24/2006
	 * @param newPROC_ID java.lang.Double
	 */
	public void setPROC_ID(java.lang.Double newPROC_ID);
	/**
	 * Retorna el valor del atributo PROC_DESC.
	 * Creation date: (02/24/2006
	 * @return java.lang.String
	 */
	public java.lang.String getPROC_DESC();

	/**
	 * Asigna el atributo PROC_DESC
	 * Creation date: (02/24/2006
	 * @param newPROC_DESC java.lang.String
	 */
	public void setPROC_DESC(java.lang.String newPROC_DESC);
	/**
	 * Retorna el valor del atributo PROC_ESTADO.
	 * Creation date: (02/24/2006
	 * @return java.lang.String
	 */
	public java.lang.String getPROC_ESTADO();

	/**
	 * Asigna el atributo PROC_ESTADO
	 * Creation date: (02/24/2006
	 * @param newPROC_ESTADO java.lang.String
	 */
	public void setPROC_ESTADO(java.lang.String newPROC_ESTADO);
	/**
	 * Retorna el valor del atributo AUDI_CREA.
	 * Creation date: (02/24/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAUDI_CREA();

	/**
	 * Asigna el atributo AUDI_CREA
	 * Creation date: (02/24/2006
	 * @param newAUDI_CREA java.lang.String
	 */
	public void setAUDI_CREA(java.lang.String newAUDI_CREA);
	/**
	 * Retorna el valor del atributo AUDI_FHCREA.
	 * Creation date: (02/24/2006
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getAUDI_FHCREA();

	/**
	 * Asigna el atributo AUDI_FHCREA
	 * Creation date: (02/24/2006
	 * @param newAUDI_FHCREA java.sql.Timestamp
	 */
	public void setAUDI_FHCREA(java.sql.Timestamp newAUDI_FHCREA);
	/**
	 * Retorna el valor del atributo AUDI_MOD.
	 * Creation date: (02/24/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAUDI_MOD();

	/**
	 * Asigna el atributo AUDI_MOD
	 * Creation date: (02/24/2006
	 * @param newAUDI_MOD java.lang.String
	 */
	public void setAUDI_MOD(java.lang.String newAUDI_MOD);
	/**
	 * Retorna el valor del atributo AUDI_FHMOD.
	 * Creation date: (02/24/2006
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getAUDI_FHMOD();

	/**
	 * Asigna el atributo AUDI_FHMOD
	 * Creation date: (02/24/2006
	 * @param newAUDI_FHMOD java.sql.Timestamp
	 */
	public void setAUDI_FHMOD(java.sql.Timestamp newAUDI_FHMOD);
}
