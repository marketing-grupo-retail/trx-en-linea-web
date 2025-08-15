package com.grpretail.business.admin.vo;

/**
 * @(#) LOG_PROP.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 21/07/2004
 */ 

/**
 * Clase que permite acceso a la tabla LOG_PROP y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;



public class LOG_PROP_Imp extends jdao.data.DataAdv implements LOG_PROP, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>LOG_PROP</B>
	 */
	public static final String NAME = "MOL_LOG_PROP";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>LOG_PROP</B>
	 */
	public static final String ID = "ID";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _ID;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_USER</B>
	 * de la tabla <B>LOG_PROP</B>
	 */
	public static final String ID_USER = "ID_USER";

	/**
	 * Atributo para manejar el campo <B>ID_USER</B>
	 * de la tabla <B>ID_USER</B>
	 */
	private java.lang.Integer _ID_USER;

	/**
	 * Atributo que contiene el nombre del campo <B>CONXNAME</B>
	 * de la tabla <B>LOG_PROP</B>
	 */
	public static final String CONXNAME = "CONXNAME";

	/**
	 * Atributo para manejar el campo <B>CONXNAME</B>
	 * de la tabla <B>CONXNAME</B>
	 */
	private java.lang.String _CONXNAME;

	/**
	 * Atributo que contiene el nombre del campo <B>ACTUDATE</B>
	 * de la tabla <B>LOG_PROP</B>
	 */
	public static final String ACTUDATE = "ACTUDATE";

	/**
	 * Atributo para manejar el campo <B>ACTUDATE</B>
	 * de la tabla <B>ACTUDATE</B>
	 */
	private java.sql.Timestamp _ACTUDATE;

	/**
	 * Metodo Constructor basico
	 */
	public LOG_PROP_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo LOG_PROP con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public LOG_PROP_Imp( java.lang.Integer _ID) { 
	this._ID = _ID;
}
	/**
	 * Crea un nuevo LOG_PROP con los campos de la tabla
	 * @param pID java.lang.Integer;
	 * @param pID_USER java.lang.Integer;
	 * @param pCONXNAME java.lang.String;
	 * @param pACTUDATE java.sql.Timestamp;
	 */
	public LOG_PROP_Imp( java.lang.Integer pID,java.lang.Integer pID_USER,java.lang.String pCONXNAME,java.sql.Timestamp pACTUDATE) { 
		this._ID = pID;
		this._ID_USER = pID_USER;
		this._CONXNAME = pCONXNAME;
		this._ACTUDATE = pACTUDATE;
	}

	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (07/21/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID(){
			return _ID;
	}

	/**
	 * Asigna el atributo ID
	 * Creation date: (07/21/2004
	 * @param newID java.lang.Integer
	 */
	public void setID(java.lang.Integer newID) {
		_ID = newID;
	}

	/**
	 * Retorna el valor del atributo ID_USER.
	 * Creation date: (07/21/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_USER(){
			return _ID_USER;
	}

	/**
	 * Asigna el atributo ID_USER
	 * Creation date: (07/21/2004
	 * @param newID_USER java.lang.Integer
	 */
	public void setID_USER(java.lang.Integer newID_USER) {
		_ID_USER = newID_USER;
	}

	/**
	 * Retorna el valor del atributo CONXNAME.
	 * Creation date: (07/21/2004
	 * @return java.lang.String
	 */
	public java.lang.String getCONXNAME(){
			return _CONXNAME;
	}

	/**
	 * Asigna el atributo CONXNAME
	 * Creation date: (07/21/2004
	 * @param newCONXNAME java.lang.String
	 */
	public void setCONXNAME(java.lang.String newCONXNAME) {
		_CONXNAME = newCONXNAME;
	}

	/**
	 * Retorna el valor del atributo ACTUDATE.
	 * Creation date: (07/21/2004
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getACTUDATE(){
			return _ACTUDATE;
	}

	/**
	 * Asigna el atributo ACTUDATE
	 * Creation date: (07/21/2004
	 * @param newACTUDATE java.sql.Timestamp
	 */
	public void setACTUDATE(java.sql.Timestamp newACTUDATE) {
		_ACTUDATE = newACTUDATE;
	}

	/**
	 * Retorna el nombre de la tabla LOG_PROP
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla LOG_PROP
	 */
	public void start() {
		String _fields[] = {ID,ID_USER,CONXNAME,ACTUDATE};
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
		} else if (field.equals(CONXNAME)) {
			return _CONXNAME;
		} else if (field.equals(ACTUDATE)) {
			return _ACTUDATE;
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
		} else if (field.equals(CONXNAME)) {
			setCONXNAME((java.lang.String) value );
		} else if (field.equals(ACTUDATE)) {
			setACTUDATE((java.sql.Timestamp) value );
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
		} else if (field.equals(CONXNAME)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ACTUDATE)) {
			return java.sql.Types.TIMESTAMP;
		}
		return 0;
	}
}
