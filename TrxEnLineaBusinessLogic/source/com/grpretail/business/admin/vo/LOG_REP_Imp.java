package com.grpretail.business.admin.vo;

/**
 * @(#) LOG_REP.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 25/06/2004
 */ 

/**
 * Clase que permite acceso a la tabla LOG_REP y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class LOG_REP_Imp extends jdao.data.DataAdv implements LOG_REP, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>LOG_REP</B>
	 */
	public static final String NAME = "MOL_LOG_REP";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>LOG_REP</B>
	 */
	public static final String ID = "ID";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _ID;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_USER</B>
	 * de la tabla <B>LOG_REP</B>
	 */
	public static final String ID_USER = "ID_USER";

	/**
	 * Atributo para manejar el campo <B>ID_USER</B>
	 * de la tabla <B>ID_USER</B>
	 */
	private java.lang.Integer _ID_USER;

	/**
	 * Atributo que contiene el nombre del campo <B>TIME</B>
	 * de la tabla <B>LOG_REP</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.sql.Timestamp _TIME;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_REPS</B>
	 * de la tabla <B>LOG_REP</B>
	 */
	public static final String DESCRIP = "DESCRIP";

	/**
	 * Atributo para manejar el campo <B>ID_REPS</B>
	 * de la tabla <B>ID_REPS</B>
	 */
	private String _DESCRIP;

	/**
	 * Metodo Constructor basico
	 */
	public LOG_REP_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo LOG_REP con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public LOG_REP_Imp( java.lang.Integer _ID) { 
	this._ID = _ID;
}
	/**
	 * Crea un nuevo LOG_REP con los campos de la tabla
	 * @param pID java.lang.Integer;
	 * @param pID_USER java.lang.Integer;
	 * @param pID_REPS java.lang.Integer;
	 * @param pTIME java.sql.Time;
	 */
	public LOG_REP_Imp( java.lang.Integer pID,java.lang.Integer pID_USER,java.sql.Timestamp pTIME,String pDESCRIP) { 
		this._ID = pID;
		this._ID_USER = pID_USER;
		this._DESCRIP = pDESCRIP;
		this._TIME = pTIME;
	}

	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (06/25/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID(){
			return _ID;
	}

	/**
	 * Asigna el atributo ID
	 * Creation date: (06/25/2004
	 * @param newID java.lang.Integer
	 */
	public void setID(java.lang.Integer newID) {
		_ID = newID;
	}

	/**
	 * Retorna el valor del atributo ID_USER.
	 * Creation date: (06/25/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_USER(){
			return _ID_USER;
	}

	/**
	 * Asigna el atributo ID_USER
	 * Creation date: (06/25/2004
	 * @param newID_USER java.lang.Integer
	 */
	public void setID_USER(java.lang.Integer newID_USER) {
		_ID_USER = newID_USER;
	}

	/**
	 * Retorna el valor del atributo ID_REPS.
	 * Creation date: (06/25/2004
	 * @return java.lang.Integer
	 */
	public String getDESCRIP(){
			return _DESCRIP;
	}

	/**
	 * Asigna el atributo ID_REPS
	 * Creation date: (06/25/2004
	 * @param newID_REPS java.lang.Integer
	 */
	public void setDESCRIP(String newDESCRIP) {
		_DESCRIP = newDESCRIP;
	}

	/**
	 * Retorna el valor del atributo TIME.
	 * Creation date: (06/25/2004
	 * @return java.sql.Time
	 */
	public java.sql.Timestamp getTIME(){
			return _TIME;
	}

	/**
	 * Asigna el atributo TIME
	 * Creation date: (06/25/2004
	 * @param newTIME java.sql.Time
	 */
	public void setTIME(java.sql.Timestamp newTIME) {
		_TIME = newTIME;
	}

	/**
	 * Retorna el nombre de la tabla LOG_REP
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla LOG_REP
	 */
	public void start() {
		String _fields[] = {ID,ID_USER,TIME,DESCRIP};
		fields = _fields;
		String _keyFields[] = {"ID"};
		keyFields = _keyFields;
		dbProp = false;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public Object getValueField(String field) { 
		if (field.equals(ID)) {
			return _ID;
		} else if (field.equals(ID_USER)) {
			return _ID_USER;
		} else if (field.equals(DESCRIP)) {
			return _DESCRIP;
		} else if (field.equals(TIME)) {
			return _TIME;
		}
		return null;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public void setValueField(String field, Object value) { 
	  if(value!=null){
		if (field.equals(ID)) {
			setID((java.lang.Integer) value );
		} else if (field.equals(ID_USER)) {
			setID_USER((java.lang.Integer) value );
		} else if (field.equals(DESCRIP)) {
			setDESCRIP((String) value );
		} else if (field.equals(TIME)) {
			setTIME((java.sql.Timestamp) value );
		}
	  }

	}
	/**
	 * Retorna un array con los tipos de datos de la BD, es usado para los prepared statement
	 * @return Retorna array de enteros con el tipo de dato en BD cada uno de los atributos
	 */
	public int getSQLFieldType(String field) {
		if (field.equals(ID)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(ID_USER)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(DESCRIP)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TIME)) {
			return java.sql.Types.DATE;
		}
		return 0;
	}
}
