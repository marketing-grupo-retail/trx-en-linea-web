package com.grpretail.business.admin.vo;

/**
 * @(#) TIPO.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 25/06/2004
 */ 

/**
 * Clase que permite acceso a la tabla TIPO y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TIPO_Imp extends jdao.data.DataAdv implements TIPO, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TIPO</B>
	 */
	public static final String NAME = "MOL_TIPO";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>TIPO</B>
	 */
	public static final String ID = "ID";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _ID;

	/**
	 * Atributo que contiene el nombre del campo <B>NOMBRE</B>
	 * de la tabla <B>TIPO</B>
	 */
	public static final String NOMBRE = "NOMBRE";

	/**
	 * Atributo para manejar el campo <B>NOMBRE</B>
	 * de la tabla <B>NOMBRE</B>
	 */
	private java.lang.String _NOMBRE;

	/**
	 * Metodo Constructor basico
	 */
	public TIPO_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo TIPO con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public TIPO_Imp( java.lang.Integer _ID) { 
	this._ID = _ID;
}
	/**
	 * Crea un nuevo TIPO con los campos de la tabla
	 * @param pID java.lang.Integer;
	 * @param pNOMBRE java.lang.String;
	 */
	public TIPO_Imp( java.lang.Integer pID,java.lang.String pNOMBRE) { 
		this._ID = pID;
		this._NOMBRE = pNOMBRE;
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
	 * Retorna el valor del atributo NOMBRE.
	 * Creation date: (06/25/2004
	 * @return java.lang.String
	 */
	public java.lang.String getNOMBRE(){
			return _NOMBRE;
	}

	/**
	 * Asigna el atributo NOMBRE
	 * Creation date: (06/25/2004
	 * @param newNOMBRE java.lang.String
	 */
	public void setNOMBRE(java.lang.String newNOMBRE) {
		_NOMBRE = newNOMBRE;
	}

	/**
	 * Retorna el nombre de la tabla TIPO
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TIPO
	 */
	public void start() {
		String _fields[] = {ID,NOMBRE};
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
		} else if (field.equals(NOMBRE)) {
			return _NOMBRE;
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
		} else if (field.equals(NOMBRE)) {
			setNOMBRE((java.lang.String) value );
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
		} else if (field.equals(NOMBRE)) {
			return java.sql.Types.VARCHAR;
		}
		return 0;
	}
}
