package com.grpretail.business.admin.vo;

/**
 * @(#) LOG_OPTS.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 25/06/2004
 */ 

/**
 * Clase que permite acceso a la tabla LOG_OPTS y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class LOG_OPTS_Imp extends jdao.data.DataAdv implements LOG_OPTS, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>LOG_OPTS</B>
	 */
	public static final String NAME = "MOL_LOG_OPTS";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>LOG_OPTS</B>
	 */
	public static final String ID = "ID";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _ID;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_USR</B>
	 * de la tabla <B>LOG_OPTS</B>
	 */
	public static final String ID_USR = "ID_USR";

	/**
	 * Atributo para manejar el campo <B>ID_USR</B>
	 * de la tabla <B>ID_USR</B>
	 */
	private java.lang.Integer _ID_USR;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_OPTS</B>
	 * de la tabla <B>LOG_OPTS</B>
	 */
	public static final String ID_OPTS = "ID_OPTS";

	/**
	 * Atributo para manejar el campo <B>ID_OPTS</B>
	 * de la tabla <B>ID_OPTS</B>
	 */
	private java.lang.Integer _ID_OPTS;

	/**
	 * Atributo que contiene el nombre del campo <B>TIME</B>
	 * de la tabla <B>LOG_OPTS</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.sql.Timestamp _TIME;
	
	public static final String DESCRIP = "DESRIP";
	
	private String _DESCRIP; 

	/**
	 * Metodo Constructor basico
	 */
	public LOG_OPTS_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo LOG_OPTS con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public LOG_OPTS_Imp( java.lang.Integer _ID) { 
	this._ID = _ID;
}
	/**
	 * Crea un nuevo LOG_OPTS con los campos de la tabla
	 * @param pID java.lang.Integer;
	 * @param pID_USR java.lang.Integer;
	 * @param pID_OPTS java.lang.Integer;
	 * @param pTIME java.sql.Timestamp;
	 */
	public LOG_OPTS_Imp( java.lang.Integer pID,java.lang.Integer pID_USR,java.lang.Integer pID_OPTS,java.sql.Timestamp pTIME,String pDESCRIP) { 
		this._ID = pID;
		this._ID_USR = pID_USR;
		this._ID_OPTS = pID_OPTS;
		this._TIME = pTIME;
		this._DESCRIP = pDESCRIP;
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
	 * Retorna el valor del atributo ID_USR.
	 * Creation date: (06/25/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_USR(){
			return _ID_USR;
	}

	/**
	 * Asigna el atributo ID_USR
	 * Creation date: (06/25/2004
	 * @param newID_USR java.lang.Integer
	 */
	public void setID_USR(java.lang.Integer newID_USR) {
		_ID_USR = newID_USR;
	}

	/**
	 * Retorna el valor del atributo ID_OPTS.
	 * Creation date: (06/25/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_OPTS(){
			return _ID_OPTS;
	}

	/**
	 * Asigna el atributo ID_OPTS
	 * Creation date: (06/25/2004
	 * @param newID_OPTS java.lang.Integer
	 */
	public void setID_OPTS(java.lang.Integer newID_OPTS) {
		_ID_OPTS = newID_OPTS;
	}

	/**
	 * Retorna el valor del atributo TIME.
	 * Creation date: (06/25/2004
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getTIME(){
			return _TIME;
	}

	/**
	 * Asigna el atributo TIME
	 * Creation date: (06/25/2004
	 * @param newTIME java.sql.Timestamp
	 */
	public void setTIME(java.sql.Timestamp newTIME) {
		_TIME = newTIME;
	}
	
	public String getDESCRIP(){
		return _DESCRIP;
	}
	
	public void setDESCRIP(String newDESCRIP){
		_DESCRIP = newDESCRIP;
	}

	/**
	 * Retorna el nombre de la tabla LOG_OPTS
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla LOG_OPTS
	 */
	public void start() {
		String _fields[] = {ID,ID_USR,ID_OPTS,TIME,DESCRIP};
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
		} else if (field.equals(ID_USR)) {
			return _ID_USR;
		} else if (field.equals(ID_OPTS)) {
			return _ID_OPTS;
		} else if (field.equals(TIME)) {
			return _TIME;
		} else if (field.equals(DESCRIP)) {
			return _DESCRIP;
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
		} else if (field.equals(ID_USR)) {
			setID_USR((java.lang.Integer) value );
		} else if (field.equals(ID_OPTS)) {
			setID_OPTS((java.lang.Integer) value );
		} else if (field.equals(TIME)) {
			setTIME((java.sql.Timestamp) value );
		} else if (field.equals(DESCRIP)) {
			setDESCRIP((String) value);
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
		} else if (field.equals(ID_USR)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(ID_OPTS)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(TIME)) {
			return java.sql.Types.TIMESTAMP;
		} else if (field.equals(DESCRIP)) {
			return java.sql.Types.VARCHAR;
		}
		return 0;
	}
}
