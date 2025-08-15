package com.asic.transacciones.vo;


/**
 * @(#) TX_DESTINO_EMAIL.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 27/12/2005
 */ 

/**
 * Clase que permite acceso a la tabla TX_DESTINO_EMAIL y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TX_DESTINO_EMAIL_Imp extends jdao.data.DataAdv implements TX_DESTINO_EMAIL, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TX_DESTINO_EMAIL</B>
	 */
	public static final String NAME = "TX_DESTINO_EMAIL";
	/**
	 * Atributo que contiene el nombre del campo <B>DESTINO_ID</B>
	 * de la tabla <B>TX_DESTINO_EMAIL</B>
	 */
	public static final String DESTINO_ID = "DESTINO_ID";

	/**
	 * Atributo para manejar el campo <B>DESTINO_ID</B>
	 * de la tabla <B>DESTINO_ID</B>
	 */
	private java.lang.Double _DESTINO_ID;

	/**
	 * Atributo que contiene el nombre del campo <B>DESTINO_DIR</B>
	 * de la tabla <B>TX_DESTINO_EMAIL</B>
	 */
	public static final String DESTINO_DIR = "DESTINO_DIR";

	/**
	 * Atributo para manejar el campo <B>DESTINO_DIR</B>
	 * de la tabla <B>DESTINO_DIR</B>
	 */
	private java.lang.String _DESTINO_DIR;

	/**
	 * Atributo que contiene el nombre del campo <B>EMAIL_ID</B>
	 * de la tabla <B>TX_DESTINO_EMAIL</B>
	 */
	public static final String EMAIL_ID = "EMAIL_ID";

	/**
	 * Atributo para manejar el campo <B>EMAIL_ID</B>
	 * de la tabla <B>EMAIL_ID</B>
	 */
	private java.lang.Double _EMAIL_ID;

	/**
	 * Metodo Constructor basico
	 */
	public TX_DESTINO_EMAIL_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo TX_DESTINO_EMAIL con los campos de la llave primaria
 * @param _DESTINO_ID java.lang.Double;
 * @param _EMAIL_ID java.lang.Double;
 */
public TX_DESTINO_EMAIL_Imp( java.lang.Double _DESTINO_ID,java.lang.Double _EMAIL_ID) { 
	this._DESTINO_ID = _DESTINO_ID;
	this._EMAIL_ID = _EMAIL_ID;
}
	/**
	 * Crea un nuevo TX_DESTINO_EMAIL con los campos de la tabla
	 * @param pDESTINO_ID java.lang.Double;
	 * @param pDESTINO_DIR java.lang.String;
	 * @param pEMAIL_ID java.lang.Double;
	 */
	public TX_DESTINO_EMAIL_Imp( java.lang.Double pDESTINO_ID,java.lang.String pDESTINO_DIR,java.lang.Double pEMAIL_ID) { 
		this._DESTINO_ID = pDESTINO_ID;
		this._DESTINO_DIR = pDESTINO_DIR;
		this._EMAIL_ID = pEMAIL_ID;
	}

	/**
	 * Retorna el valor del atributo DESTINO_ID.
	 * Creation date: (12/27/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getDESTINO_ID(){
			return _DESTINO_ID;
	}

	/**
	 * Asigna el atributo DESTINO_ID
	 * Creation date: (12/27/2005
	 * @param newDESTINO_ID java.lang.Double
	 */
	public void setDESTINO_ID(java.lang.Double newDESTINO_ID) {
		_DESTINO_ID = newDESTINO_ID;
	}

	/**
	 * Retorna el valor del atributo DESTINO_DIR.
	 * Creation date: (12/27/2005
	 * @return java.lang.String
	 */
	public java.lang.String getDESTINO_DIR(){
			return _DESTINO_DIR;
	}

	/**
	 * Asigna el atributo DESTINO_DIR
	 * Creation date: (12/27/2005
	 * @param newDESTINO_DIR java.lang.String
	 */
	public void setDESTINO_DIR(java.lang.String newDESTINO_DIR) {
		_DESTINO_DIR = newDESTINO_DIR;
	}

	/**
	 * Retorna el valor del atributo EMAIL_ID.
	 * Creation date: (12/27/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getEMAIL_ID(){
			return _EMAIL_ID;
	}

	/**
	 * Asigna el atributo EMAIL_ID
	 * Creation date: (12/27/2005
	 * @param newEMAIL_ID java.lang.Double
	 */
	public void setEMAIL_ID(java.lang.Double newEMAIL_ID) {
		_EMAIL_ID = newEMAIL_ID;
	}

	/**
	 * Retorna el nombre de la tabla TX_DESTINO_EMAIL
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TX_DESTINO_EMAIL
	 */
	public void start() {
		String _fields[] = {DESTINO_ID,DESTINO_DIR,EMAIL_ID};
		fields = _fields;
		String _keyFields[] = {"DESTINO_ID","EMAIL_ID"};
		keyFields = _keyFields;
		dbProp = false;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public Object getValueField(String field) { 
		if (field.equals(DESTINO_ID)) {
			return _DESTINO_ID;
		} else if (field.equals(DESTINO_DIR)) {
			return _DESTINO_DIR;
		} else if (field.equals(EMAIL_ID)) {
			return _EMAIL_ID;
		}
		return null;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public void setValueField(String field, Object value) { 
	  if(value!=null){
		if (field.equals(DESTINO_ID)) {
			setDESTINO_ID((java.lang.Double) value );
		} else if (field.equals(DESTINO_DIR)) {
			setDESTINO_DIR((java.lang.String) value );
		} else if (field.equals(EMAIL_ID)) {
			setEMAIL_ID((java.lang.Double) value );
		}
	  }

	}
	/**
	 * Retorna un array con los tipos de datos de la BD, es usado para los prepared statement
	 * @return Retorna array de enteros con el tipo de dato en BD cada uno de los atributos
	 */
	public int getSQLFieldType(String field) {
		if (field.equals(DESTINO_ID)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(DESTINO_DIR)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(EMAIL_ID)) {
			return java.sql.Types.DECIMAL;
		}
		return 0;
	}
}
