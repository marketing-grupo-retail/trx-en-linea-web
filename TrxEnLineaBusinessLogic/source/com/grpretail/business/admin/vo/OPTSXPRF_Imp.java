package com.grpretail.business.admin.vo;

/**
 * @(#) OPTSXPRF.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 25/06/2004
 */ 

/**
 * Clase que permite acceso a la tabla OPTSXPRF y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class OPTSXPRF_Imp extends jdao.data.DataAdv implements OPTSXPRF, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>OPTSXPRF</B>
	 */
	public static final String NAME = "MOL_OPTSXPRF";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>OPTSXPRF</B>
	 */
	public static final String ID = "ID";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _ID;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_PERF</B>
	 * de la tabla <B>OPTSXPRF</B>
	 */
	public static final String ID_PERF = "ID_PERF";

	/**
	 * Atributo para manejar el campo <B>ID_PERF</B>
	 * de la tabla <B>ID_PERF</B>
	 */
	private java.lang.Integer _ID_PERF;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_OPTS</B>
	 * de la tabla <B>OPTSXPRF</B>
	 */
	public static final String ID_OPTS = "ID_OPTS";

	/**
	 * Atributo para manejar el campo <B>ID_OPTS</B>
	 * de la tabla <B>ID_OPTS</B>
	 */
	private java.lang.Integer _ID_OPTS;

	/**
	 * Metodo Constructor basico
	 */
	public OPTSXPRF_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo OPTSXPRF con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public OPTSXPRF_Imp( java.lang.Integer _ID) { 
	this._ID = _ID;
}
	/**
	 * Crea un nuevo OPTSXPRF con los campos de la tabla
	 * @param pID java.lang.Integer;
	 * @param pID_PERF java.lang.Integer;
	 * @param pID_OPTS java.lang.Integer;
	 */
	public OPTSXPRF_Imp( java.lang.Integer pID,java.lang.Integer pID_PERF,java.lang.Integer pID_OPTS) { 
		this._ID = pID;
		this._ID_PERF = pID_PERF;
		this._ID_OPTS = pID_OPTS;
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
	 * Retorna el valor del atributo ID_PERF.
	 * Creation date: (06/25/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_PERF(){
			return _ID_PERF;
	}

	/**
	 * Asigna el atributo ID_PERF
	 * Creation date: (06/25/2004
	 * @param newID_PERF java.lang.Integer
	 */
	public void setID_PERF(java.lang.Integer newID_PERF) {
		_ID_PERF = newID_PERF;
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
	 * Retorna el nombre de la tabla OPTSXPRF
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla OPTSXPRF
	 */
	public void start() {
		String _fields[] = {ID,ID_PERF,ID_OPTS};
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
		} else if (field.equals(ID_PERF)) {
			return _ID_PERF;
		} else if (field.equals(ID_OPTS)) {
			return _ID_OPTS;
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
		} else if (field.equals(ID_PERF)) {
			setID_PERF((java.lang.Integer) value );
		} else if (field.equals(ID_OPTS)) {
			setID_OPTS((java.lang.Integer) value );
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
		} else if (field.equals(ID_PERF)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(ID_OPTS)) {
			return java.sql.Types.INTEGER;
		}
		return 0;
	}
}
