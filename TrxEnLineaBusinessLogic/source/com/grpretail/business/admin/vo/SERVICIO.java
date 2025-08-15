/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: SERVICIO.java,v 1.1 2019/12/18 17:08:58 Alfonso Exp $
 *
 */
package com.grpretail.business.admin.vo;

/**
 * Información
 *
 * @author: null.
 * @version: null
 */

public interface SERVICIO {



	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (05/05/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID();

	/**
	 * Asigna el atributo ID
	 * Creation date: (05/05/2004
	 * @param newID java.lang.Integer
	 */
	public void setID(java.lang.Integer newID);
	/**
	 * Retorna el valor del atributo NOMBRE.
	 * Creation date: (05/05/2004
	 * @return java.lang.String
	 */
	public java.lang.String getNOMBRE();

	/**
	 * Asigna el atributo NOMBRE
	 * Creation date: (05/05/2004
	 * @param newNOMBRE java.lang.String
	 */
	public void setNOMBRE(java.lang.String newNOMBRE);
	/**
	 * Retorna el valor del atributo DESCRIP.
	 * Creation date: (05/05/2004
	 * @return java.lang.String
	 */
	public java.lang.String getDESCRIP();

	/**
	 * Asigna el atributo DESCRIP
	 * Creation date: (05/05/2004
	 * @param newDESCRIP java.lang.String
	 */
	public void setDESCRIP(java.lang.String newDESCRIP);
}
