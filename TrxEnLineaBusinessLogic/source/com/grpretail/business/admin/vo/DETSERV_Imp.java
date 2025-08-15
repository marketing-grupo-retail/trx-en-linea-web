/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: DETSERV_Imp.java,v 1.1 2019/12/18 17:08:58 Alfonso Exp $
 *
 */
package com.grpretail.business.admin.vo;


import java.io.Serializable;

/**
 * Clase que permite acceso a la tabla DETSERV y a sus atributos.
 *
 * @author: null.
 * @version: null
 */

public class DETSERV_Imp extends jdao.data.DataAdv implements DETSERV, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>DETSERV</B>
	 */
	public static final String NAME = "MOL_DETSERV";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>DETSERV</B>
	 */
	public static final String ID = "ID";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _ID;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_SERV</B>
	 * de la tabla <B>DETSERV</B>
	 */
	public static final String ID_SERV = "ID_SERV";

	/**
	 * Atributo para manejar el campo <B>ID_SERV</B>
	 * de la tabla <B>ID_SERV</B>
	 */
	private java.lang.Integer _ID_SERV;

	/**
	 * Atributo que contiene el nombre del campo <B>NOMBRE</B>
	 * de la tabla <B>DETSERV</B>
	 */
	public static final String NOMBRE = "NOMBRE";

	/**
	 * Atributo para manejar el campo <B>NOMBRE</B>
	 * de la tabla <B>NOMBRE</B>
	 */
	private java.lang.String _NOMBRE;

	/**
	 * Atributo que contiene el nombre del campo <B>VALOR</B>
	 * de la tabla <B>DETSERV</B>
	 */
	public static final String VALOR = "VALOR";

	/**
	 * Atributo para manejar el campo <B>VALOR</B>
	 * de la tabla <B>VALOR</B>
	 */
	private java.lang.String _VALOR;

	/**
	 * Metodo Constructor basico
	 */
	public DETSERV_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo DETSERV con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public DETSERV_Imp( java.lang.Integer _ID) {
	this._ID = _ID;
}
	/**
	 * Crea un nuevo DETSERV con los campos de la tabla
	 * @param pID java.lang.Integer;
	 * @param pID_SERV java.lang.Integer;
	 * @param pNOMBRE java.lang.String;
	 * @param pVALOR java.lang.String;
	 */
	public DETSERV_Imp( java.lang.Integer pID,java.lang.Integer pID_SERV,java.lang.String pNOMBRE,java.lang.String pVALOR) {
		this._ID = pID;
		this._ID_SERV = pID_SERV;
		this._NOMBRE = pNOMBRE;
		this._VALOR = pVALOR;
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
	 * Retorna el valor del atributo NOMBRE.
	 * Creation date: (05/04/2004
	 * @return java.lang.String
	 */
	public java.lang.String getNOMBRE(){
			return _NOMBRE;
	}

	/**
	 * Asigna el atributo NOMBRE
	 * Creation date: (05/04/2004
	 * @param newNOMBRE java.lang.String
	 */
	public void setNOMBRE(java.lang.String newNOMBRE) {
		_NOMBRE = newNOMBRE;
	}

	/**
	 * Retorna el valor del atributo VALOR.
	 * Creation date: (05/04/2004
	 * @return java.lang.String
	 */
	public java.lang.String getVALOR(){
			return _VALOR;
	}

	/**
	 * Asigna el atributo VALOR
	 * Creation date: (05/04/2004
	 * @param newVALOR java.lang.String
	 */
	public void setVALOR(java.lang.String newVALOR) {
		_VALOR = newVALOR;
	}

	/**
	 * Retorna el nombre de la tabla DETSERV
	 * @return Nombre de la tabla
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla DETSERV
	 */
	public void start() {
		String _fields[] = {ID,ID_SERV,NOMBRE,VALOR};
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
		} else if (field.equals(NOMBRE)) {
			return _NOMBRE;
		} else if (field.equals(VALOR)) {
			return _VALOR;
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
		} else if (field.equals(NOMBRE)) {
			setNOMBRE((java.lang.String) value );
		} else if (field.equals(VALOR)) {
			setVALOR((java.lang.String) value );
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
		} else if (field.equals(NOMBRE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(VALOR)) {
			return java.sql.Types.VARCHAR;
		}
		return 0;
	}
}
