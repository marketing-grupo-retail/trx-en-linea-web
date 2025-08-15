package com.asic.transacciones.vo;


/**
 * @(#) ORGMSTEE.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 28/02/2006
 */ 

/**
 * Clase que permite acceso a la tabla ORGMSTEE y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class ORGMSTEE_Imp extends jdao.data.DataAdv implements ORGMSTEE, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>ORGMSTEE</B>
	 */
	public static final String NAME = "ORGMSTEE";
	/**
	 * Atributo que contiene el nombre del campo <B>ORG_LVL_NUMBER</B>
	 * de la tabla <B>ORGMSTEE</B>
	 */
	public static final String ORG_LVL_NUMBER = "ORG_LVL_NUMBER";

	/**
	 * Atributo para manejar el campo <B>ORG_LVL_NUMBER</B>
	 * de la tabla <B>ORG_LVL_NUMBER</B>
	 */
	private java.lang.String _ORG_LVL_NUMBER;

	/**
	 * Atributo que contiene el nombre del campo <B>ORG_NAME_FULL</B>
	 * de la tabla <B>ORGMSTEE</B>
	 */
	public static final String ORG_NAME_FULL = "ORG_NAME_FULL";

	/**
	 * Atributo para manejar el campo <B>ORG_NAME_FULL</B>
	 * de la tabla <B>ORG_NAME_FULL</B>
	 */
	private java.lang.String _ORG_NAME_FULL;

	/**
	 * Atributo que contiene el nombre del campo <B>ORG_IS_STORE</B>
	 * de la tabla <B>ORGMSTEE</B>
	 */
	public static final String ORG_IS_STORE = "ORG_IS_STORE";

	/**
	 * Atributo para manejar el campo <B>ORG_IS_STORE</B>
	 * de la tabla <B>ORG_IS_STORE</B>
	 */
	private java.lang.String _ORG_IS_STORE;

	/**
	 * Metodo Constructor basico
	 */
	public ORGMSTEE_Imp() {
		super();
		start();
	}

	/**
	 * Crea un nuevo ORGMSTEE con los campos de la tabla
	 * @param pORG_LVL_NUMBER java.lang.String;
	 * @param pORG_NAME_FULL java.lang.String;
	 * @param pORG_IS_STORE java.lang.String;
	 */
	public ORGMSTEE_Imp( java.lang.String pORG_LVL_NUMBER,java.lang.String pORG_NAME_FULL,java.lang.String pORG_IS_STORE) { 
		this._ORG_LVL_NUMBER = pORG_LVL_NUMBER;
		this._ORG_NAME_FULL = pORG_NAME_FULL;
		this._ORG_IS_STORE = pORG_IS_STORE;
	}

	/**
	 * Retorna el valor del atributo ORG_LVL_NUMBER.
	 * Creation date: (02/28/2006
	 * @return java.lang.String
	 */
	public java.lang.String getORG_LVL_NUMBER(){
			return _ORG_LVL_NUMBER;
	}

	/**
	 * Asigna el atributo ORG_LVL_NUMBER
	 * Creation date: (02/28/2006
	 * @param newORG_LVL_NUMBER java.lang.String
	 */
	public void setORG_LVL_NUMBER(java.lang.String newORG_LVL_NUMBER) {
		_ORG_LVL_NUMBER = newORG_LVL_NUMBER;
	}

	/**
	 * Retorna el valor del atributo ORG_NAME_FULL.
	 * Creation date: (02/28/2006
	 * @return java.lang.String
	 */
	public java.lang.String getORG_NAME_FULL(){
			return _ORG_NAME_FULL;
	}

	/**
	 * Asigna el atributo ORG_NAME_FULL
	 * Creation date: (02/28/2006
	 * @param newORG_NAME_FULL java.lang.String
	 */
	public void setORG_NAME_FULL(java.lang.String newORG_NAME_FULL) {
		_ORG_NAME_FULL = newORG_NAME_FULL;
	}

	/**
	 * Retorna el valor del atributo ORG_IS_STORE.
	 * Creation date: (02/28/2006
	 * @return java.lang.String
	 */
	public java.lang.String getORG_IS_STORE(){
			return _ORG_IS_STORE;
	}

	/**
	 * Asigna el atributo ORG_IS_STORE
	 * Creation date: (02/28/2006
	 * @param newORG_IS_STORE java.lang.String
	 */
	public void setORG_IS_STORE(java.lang.String newORG_IS_STORE) {
		_ORG_IS_STORE = newORG_IS_STORE;
	}

	/**
	 * Retorna el nombre de la tabla ORGMSTEE
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla ORGMSTEE
	 */
	public void start() {
		String _fields[] = {ORG_LVL_NUMBER,ORG_NAME_FULL,ORG_IS_STORE};
		fields = _fields;
		dbProp = false;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public Object getValueField(String field) { 
		if (field.equals(ORG_LVL_NUMBER)) {
			return _ORG_LVL_NUMBER;
		} else if (field.equals(ORG_NAME_FULL)) {
			return _ORG_NAME_FULL;
		} else if (field.equals(ORG_IS_STORE)) {
			return _ORG_IS_STORE;
		}
		return null;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public void setValueField(String field, Object value) { 
	  if(value!=null){
		if (field.equals(ORG_LVL_NUMBER)) {
			setORG_LVL_NUMBER((java.lang.String) value );
		} else if (field.equals(ORG_NAME_FULL)) {
			setORG_NAME_FULL((java.lang.String) value );
		} else if (field.equals(ORG_IS_STORE)) {
			setORG_IS_STORE((java.lang.String) value );
		}
	  }

	}
	/**
	 * Retorna un array con los tipos de datos de la BD, es usado para los prepared statement
	 * @return Retorna array de enteros con el tipo de dato en BD cada uno de los atributos
	 */
	public int getSQLFieldType(String field) {
		if (field.equals(ORG_LVL_NUMBER)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ORG_NAME_FULL)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ORG_IS_STORE)) {
			return java.sql.Types.VARCHAR;
		}
		return 0;
	}
}
