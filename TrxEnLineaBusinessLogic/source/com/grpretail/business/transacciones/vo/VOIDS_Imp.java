package com.grpretail.business.transacciones.vo;

/**
 * @(#) ALMACEN.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 18/10/2004
 */ 

/**
 * Clase que permite acceso a la tabla ALMACEN y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;
import java.sql.Timestamp;


public class VOIDS_Imp implements Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>ALMACEN</B>
	 */
	//public static final String NAME = "GROSS_POSITIVE";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	public static final String VALUE = "VALUE";
	//public static final String DAY = "DAY";	
	//public static final String FECHAHORA = "TFECHAHORA";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Long _VALUE;


	/**
	 * Metodo Constructor basico
	 */
	public VOIDS_Imp() {
		super();
		//start();
	}

/**
 * Crea un nuevo ALMACEN con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
	public VOIDS_Imp( java.lang.Long _VALUE) { 
		this._VALUE = _VALUE;
	}

	/*
	public GROSS_POSITIVE_Imp( java.lang.Integer pCODCCO, java.sql.Timestamp pFECHAHORA, java.sql.Date pDAY) { 
		this._STORE = pCODCCO;
		this._FECHAHORA = pFECHAHORA;
		this._DAY = pDAY;
	}

	public String getTableName() {
		return NAME;
	}
	*/

	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (10/18/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Long getVALUE(){
			return _VALUE;
	}


	public void setVALUE(java.lang.Long newVALUE) {
		_VALUE = newVALUE;
	}
	
}
