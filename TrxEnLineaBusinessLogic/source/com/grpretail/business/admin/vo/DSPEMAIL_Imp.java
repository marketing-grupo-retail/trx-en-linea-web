/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: DSPEMAIL_Imp.java,v 1.1 2019/12/18 17:08:58 Alfonso Exp $
 *
 */
package com.grpretail.business.admin.vo;

/**
 * Clase que permite acceso a la tabla DSPEMAIL y a sus atributos.
 *
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class DSPEMAIL_Imp extends jdao.data.DataAdv implements DSPEMAIL, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>DSPEMAIL</B>
	 */
	public static final String NAME = "MOL_DSPEMAIL";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>DSPEMAIL</B>
	 */
	public static final String ID = "ID";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _ID;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_SERV</B>
	 * de la tabla <B>DSPEMAIL</B>
	 */
	public static final String ID_SERV = "ID_SERV";

	/**
	 * Atributo para manejar el campo <B>ID_SERV</B>
	 * de la tabla <B>ID_SERV</B>
	 */
	private java.lang.Integer _ID_SERV;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_USER</B>
	 * de la tabla <B>DSPEMAIL</B>
	 */
	public static final String ID_USER = "ID_USER";

	/**
	 * Atributo para manejar el campo <B>ID_USER</B>
	 * de la tabla <B>ID_USER</B>
	 */
	private java.lang.Integer _ID_USER;

	/**
	 * Metodo Constructor basico
	 */
	public DSPEMAIL_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo DSPEMAIL con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public DSPEMAIL_Imp( java.lang.Integer _ID) {
	this._ID = _ID;
}
	/**
	 * Crea un nuevo DSPEMAIL con los campos de la tabla
	 * @param pID java.lang.Integer;
	 * @param pID_SERV java.lang.Integer;
	 * @param pID_USER java.lang.Integer;
	 */
	public DSPEMAIL_Imp( java.lang.Integer pID,java.lang.Integer pID_SERV,java.lang.Integer pID_USER) {
		this._ID = pID;
		this._ID_SERV = pID_SERV;
		this._ID_USER = pID_USER;
	}

	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (05/04/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID(){
			return _ID;
	}

	/**
	 * Asigna el atributo ID
	 * Creation date: (05/04/2004
	 * @param newID java.lang.Integer
	 */
	public void setID(java.lang.Integer newID) {
		_ID = newID;
	}

	/**
	 * Retorna el valor del atributo ID_SERV.
	 * Creation date: (05/04/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_SERV(){
			return _ID_SERV;
	}

	/**
	 * Asigna el atributo ID_SERV
	 * Creation date: (05/04/2004
	 * @param newID_SERV java.lang.Integer
	 */
	public void setID_SERV(java.lang.Integer newID_SERV) {
		_ID_SERV = newID_SERV;
	}

	/**
	 * Retorna el valor del atributo ID_USER.
	 * Creation date: (05/04/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_USER(){
			return _ID_USER;
	}

	/**
	 * Asigna el atributo ID_USER
	 * Creation date: (05/04/2004
	 * @param newID_USER java.lang.Integer
	 */
	public void setID_USER(java.lang.Integer newID_USER) {
		_ID_USER = newID_USER;
	}

	/**
	 * Retorna el nombre de la tabla DSPEMAIL
	 * @return Nombre de la tabla
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla DSPEMAIL
	 */
	public void start() {
		String _fields[] = {ID,ID_SERV,ID_USER};
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
		} else if (field.equals(ID_SERV)) {
			return _ID_SERV;
		} else if (field.equals(ID_USER)) {
			return _ID_USER;
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
		} else if (field.equals(ID_SERV)) {
			setID_SERV((java.lang.Integer) value );
		} else if (field.equals(ID_USER)) {
			setID_USER((java.lang.Integer) value );
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
		} else if (field.equals(ID_SERV)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(ID_USER)) {
			return java.sql.Types.INTEGER;
		}
		return 0;
	}
}
