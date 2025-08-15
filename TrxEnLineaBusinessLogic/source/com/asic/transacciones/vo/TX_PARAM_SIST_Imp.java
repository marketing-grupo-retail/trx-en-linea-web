package com.asic.transacciones.vo;
/**
 * @(#) TX_PARAM_SIST.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 27/12/2005
 */ 

/**
 * Clase que permite acceso a la tabla TX_PARAM_SIST y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TX_PARAM_SIST_Imp extends jdao.data.DataAdv implements TX_PARAM_SIST, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TX_PARAM_SIST</B>
	 */
	public static final String NAME = "TX_PARAM_SIST";
	/**
	 * Atributo que contiene el nombre del campo <B>PARAM_ID</B>
	 * de la tabla <B>TX_PARAM_SIST</B>
	 */
	public static final String PARAM_ID = "PARAM_ID";

	/**
	 * Atributo para manejar el campo <B>PARAM_ID</B>
	 * de la tabla <B>PARAM_ID</B>
	 */
	private java.lang.Double _PARAM_ID;

	/**
	 * Atributo que contiene el nombre del campo <B>PARAM_DESC</B>
	 * de la tabla <B>TX_PARAM_SIST</B>
	 */
	public static final String PARAM_DESC = "PARAM_DESC";

	/**
	 * Atributo para manejar el campo <B>PARAM_DESC</B>
	 * de la tabla <B>PARAM_DESC</B>
	 */
	private java.lang.String _PARAM_DESC;

	/**
	 * Atributo que contiene el nombre del campo <B>PARAM_VLR</B>
	 * de la tabla <B>TX_PARAM_SIST</B>
	 */
	public static final String PARAM_VLR = "PARAM_VLR";

	/**
	 * Atributo para manejar el campo <B>PARAM_VLR</B>
	 * de la tabla <B>PARAM_VLR</B>
	 */
	private java.lang.String _PARAM_VLR;

	/**
	 * Metodo Constructor basico
	 */
	public TX_PARAM_SIST_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo TX_PARAM_SIST con los campos de la llave primaria
 * @param _PARAM_ID java.lang.Double;
 */
public TX_PARAM_SIST_Imp( java.lang.Double _PARAM_ID) { 
	this._PARAM_ID = _PARAM_ID;
}
	/**
	 * Crea un nuevo TX_PARAM_SIST con los campos de la tabla
	 * @param pPARAM_ID java.lang.Double;
	 * @param pPARAM_DESC java.lang.String;
	 * @param pPARAM_VLR java.lang.String;
	 */
	public TX_PARAM_SIST_Imp( java.lang.Double pPARAM_ID,java.lang.String pPARAM_DESC,java.lang.String pPARAM_VLR) { 
		this._PARAM_ID = pPARAM_ID;
		this._PARAM_DESC = pPARAM_DESC;
		this._PARAM_VLR = pPARAM_VLR;
	}

	/**
	 * Retorna el valor del atributo PARAM_ID.
	 * Creation date: (12/27/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getPARAM_ID(){
			return _PARAM_ID;
	}

	/**
	 * Asigna el atributo PARAM_ID
	 * Creation date: (12/27/2005
	 * @param newPARAM_ID java.lang.Double
	 */
	public void setPARAM_ID(java.lang.Double newPARAM_ID) {
		_PARAM_ID = newPARAM_ID;
	}

	/**
	 * Retorna el valor del atributo PARAM_DESC.
	 * Creation date: (12/27/2005
	 * @return java.lang.String
	 */
	public java.lang.String getPARAM_DESC(){
			return _PARAM_DESC;
	}

	/**
	 * Asigna el atributo PARAM_DESC
	 * Creation date: (12/27/2005
	 * @param newPARAM_DESC java.lang.String
	 */
	public void setPARAM_DESC(java.lang.String newPARAM_DESC) {
		_PARAM_DESC = newPARAM_DESC;
	}

	/**
	 * Retorna el valor del atributo PARAM_VLR.
	 * Creation date: (12/27/2005
	 * @return java.lang.String
	 */
	public java.lang.String getPARAM_VLR(){
			return _PARAM_VLR;
	}

	/**
	 * Asigna el atributo PARAM_VLR
	 * Creation date: (12/27/2005
	 * @param newPARAM_VLR java.lang.String
	 */
	public void setPARAM_VLR(java.lang.String newPARAM_VLR) {
		_PARAM_VLR = newPARAM_VLR;
	}

	/**
	 * Retorna el nombre de la tabla TX_PARAM_SIST
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TX_PARAM_SIST
	 */
	public void start() {
		String _fields[] = {PARAM_ID,PARAM_DESC,PARAM_VLR};
		fields = _fields;
		String _keyFields[] = {"PARAM_ID"};
		keyFields = _keyFields;
		dbProp = false;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public Object getValueField(String field) { 
		if (field.equals(PARAM_ID)) {
			return _PARAM_ID;
		} else if (field.equals(PARAM_DESC)) {
			return _PARAM_DESC;
		} else if (field.equals(PARAM_VLR)) {
			return _PARAM_VLR;
		}
		return null;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public void setValueField(String field, Object value) { 
	  if(value!=null){
		if (field.equals(PARAM_ID)) {
			setPARAM_ID((java.lang.Double) value );
		} else if (field.equals(PARAM_DESC)) {
			setPARAM_DESC((java.lang.String) value );
		} else if (field.equals(PARAM_VLR)) {
			setPARAM_VLR((java.lang.String) value );
		}
	  }

	}
	/**
	 * Retorna un array con los tipos de datos de la BD, es usado para los prepared statement
	 * @return Retorna array de enteros con el tipo de dato en BD cada uno de los atributos
	 */
	public int getSQLFieldType(String field) {
		if (field.equals(PARAM_ID)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(PARAM_DESC)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(PARAM_VLR)) {
			return java.sql.Types.VARCHAR;
		}
		return 0;
	}
}
