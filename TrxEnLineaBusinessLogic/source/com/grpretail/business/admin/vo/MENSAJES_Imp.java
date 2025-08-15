package com.grpretail.business.admin.vo;


/**
 * @(#) MENSAJES.java
 * 
 * Copyright (c) 2002 ITFusion, All Rights Reserved.
 * 
 * Fecha Creación: 18/08/2004
 */ 

/**
 * Clase que permite acceso a la tabla MENSAJES y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;

public class MENSAJES_Imp extends jdao.data.DataAdv implements MENSAJES, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>MENSAJES</B>
	 */
	public static final String NAME = "MOL_MENSAJES";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>MENSAJES</B>
	 */
	public static final String ID = "ID";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _ID;

	/**
	 * Atributo que contiene el nombre del campo <B>MODULO</B>
	 * de la tabla <B>MENSAJES</B>
	 */
	public static final String MODULO = "MODULO";

	/**
	 * Atributo para manejar el campo <B>MODULO</B>
	 * de la tabla <B>MODULO</B>
	 */
	private java.lang.String _MODULO;

	/**
	 * Atributo que contiene el nombre del campo <B>MENSAJE</B>
	 * de la tabla <B>MENSAJES</B>
	 */
	public static final String MENSAJE = "MENSAJE";

	/**
	 * Atributo para manejar el campo <B>MENSAJE</B>
	 * de la tabla <B>MENSAJE</B>
	 */
	private java.lang.String _MENSAJE;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_AREA</B>
	 * de la tabla <B>MENSAJES</B>
	 */
	public static final String ID_AREA = "ID_AREA";

	/**
	 * Atributo para manejar el campo <B>ID_AREA</B>
	 * de la tabla <B>ID_AREA</B>
	 */
	private java.lang.Integer _ID_AREA;

	/**
	 * Metodo Constructor basico
	 */
	public MENSAJES_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo MENSAJES con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public MENSAJES_Imp( java.lang.Integer _ID) { 
	this._ID = _ID;
}
	/**
	 * Crea un nuevo MENSAJES con los campos de la tabla
	 * @param pID java.lang.Integer;
	 * @param pMODULO java.lang.String;
	 * @param pMENSAJE java.lang.String;
	 * @param pID_AREA java.lang.Integer;
	 */
	public MENSAJES_Imp( java.lang.Integer pID,java.lang.String pMODULO,java.lang.String pMENSAJE,java.lang.Integer pID_AREA) { 
		this._ID = pID;
		this._MODULO = pMODULO;
		this._MENSAJE = pMENSAJE;
		this._ID_AREA = pID_AREA;
	}

	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (08/18/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID(){
			return _ID;
	}

	/**
	 * Asigna el atributo ID
	 * Creation date: (08/18/2004
	 * @param newID java.lang.Integer
	 */
	public void setID(java.lang.Integer newID) {
		_ID = newID;
	}

	/**
	 * Retorna el valor del atributo MODULO.
	 * Creation date: (08/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getMODULO(){
			return _MODULO;
	}

	/**
	 * Asigna el atributo MODULO
	 * Creation date: (08/18/2004
	 * @param newMODULO java.lang.String
	 */
	public void setMODULO(java.lang.String newMODULO) {
		_MODULO = newMODULO;
	}

	/**
	 * Retorna el valor del atributo MENSAJE.
	 * Creation date: (08/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getMENSAJE(){
			return _MENSAJE;
	}

	/**
	 * Asigna el atributo MENSAJE
	 * Creation date: (08/18/2004
	 * @param newMENSAJE java.lang.String
	 */
	public void setMENSAJE(java.lang.String newMENSAJE) {
		_MENSAJE = newMENSAJE;
	}

	/**
	 * Retorna el valor del atributo ID_AREA.
	 * Creation date: (08/18/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_AREA(){
			return _ID_AREA;
	}

	/**
	 * Asigna el atributo ID_AREA
	 * Creation date: (08/18/2004
	 * @param newID_AREA java.lang.Integer
	 */
	public void setID_AREA(java.lang.Integer newID_AREA) {
		_ID_AREA = newID_AREA;
	}

	/**
	 * Retorna el nombre de la tabla MENSAJES
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla MENSAJES
	 */
	public void start() {
		String _fields[] = {ID,MODULO,MENSAJE,ID_AREA};
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
		} else if (field.equals(MODULO)) {
			return _MODULO;
		} else if (field.equals(MENSAJE)) {
			return _MENSAJE;
		} else if (field.equals(ID_AREA)) {
			return _ID_AREA;
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
		} else if (field.equals(MODULO)) {
			setMODULO((java.lang.String) value );
		} else if (field.equals(MENSAJE)) {
			setMENSAJE((java.lang.String) value );
		} else if (field.equals(ID_AREA)) {
			setID_AREA((java.lang.Integer) value );
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
		} else if (field.equals(MODULO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(MENSAJE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ID_AREA)) {
			return java.sql.Types.INTEGER;
		}
		return 0;
	}
}
