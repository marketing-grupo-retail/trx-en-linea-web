/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: PRFLXUSR_Imp.java,v 1.1 2019/12/18 17:08:58 Alfonso Exp $
 *
 */
package com.grpretail.business.admin.vo;

/**
 * Clase que permite acceso a la tabla PRFLXUSR y a sus atributos.
 *
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class PRFLXUSR_Imp extends jdao.data.DataAdv implements PRFLXUSR, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>PRFLXUSR</B>
	 */
	public static final String NAME = "MOL_PRFLXUSR";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>PRFLXUSR</B>
	 */
	public static final String ID = "ID";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _ID;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_USR</B>
	 * de la tabla <B>PRFLXUSR</B>
	 */
	public static final String ID_USR = "ID_USR";

	/**
	 * Atributo para manejar el campo <B>ID_USR</B>
	 * de la tabla <B>ID_USR</B>
	 */
	private java.lang.Integer _ID_USR;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_PERFIL</B>
	 * de la tabla <B>PRFLXUSR</B>
	 */
	public static final String ID_PERFIL = "ID_PERFIL";

	/**
	 * Atributo para manejar el campo <B>ID_PERFIL</B>
	 * de la tabla <B>ID_PERFIL</B>
	 */
	private java.lang.Integer _ID_PERFIL;

	/**
	 * Metodo Constructor basico
	 */
	public PRFLXUSR_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo PRFLXUSR con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public PRFLXUSR_Imp( java.lang.Integer _ID) {
	this._ID = _ID;
}
	/**
	 * Crea un nuevo PRFLXUSR con los campos de la tabla
	 * @param pID java.lang.Integer;
	 * @param pID_USR java.lang.Integer;
	 * @param pID_PERFIL java.lang.Integer;
	 */
	public PRFLXUSR_Imp( java.lang.Integer pID,java.lang.Integer pID_USR,java.lang.Integer pID_PERFIL) {
		this._ID = pID;
		this._ID_USR = pID_USR;
		this._ID_PERFIL = pID_PERFIL;
	}

	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (05/03/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID(){
			return _ID;
	}

	/**
	 * Asigna el atributo ID
	 * Creation date: (05/03/2004
	 * @param newID java.lang.Integer
	 */
	public void setID(java.lang.Integer newID) {
		_ID = newID;
	}

	/**
	 * Retorna el valor del atributo ID_USR.
	 * Creation date: (05/03/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_USR(){
			return _ID_USR;
	}

	/**
	 * Asigna el atributo ID_USR
	 * Creation date: (05/03/2004
	 * @param newID_USR java.lang.Integer
	 */
	public void setID_USR(java.lang.Integer newID_USR) {
		_ID_USR = newID_USR;
	}

	/**
	 * Retorna el valor del atributo ID_PERFIL.
	 * Creation date: (05/03/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_PERFIL(){
			return _ID_PERFIL;
	}

	/**
	 * Asigna el atributo ID_PERFIL
	 * Creation date: (05/03/2004
	 * @param newID_PERFIL java.lang.Integer
	 */
	public void setID_PERFIL(java.lang.Integer newID_PERFIL) {
		_ID_PERFIL = newID_PERFIL;
	}

	/**
	 * Retorna el nombre de la tabla PRFLXUSR
	 * @return Nombre de la tabla
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla PRFLXUSR
	 */
	public void start() {
		String _fields[] = {ID,ID_USR,ID_PERFIL};
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
		} else if (field.equals(ID_PERFIL)) {
			return _ID_PERFIL;
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
		} else if (field.equals(ID_PERFIL)) {
			setID_PERFIL((java.lang.Integer) value );
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
		} else if (field.equals(ID_PERFIL)) {
			return java.sql.Types.INTEGER;
		}
		return 0;
	}
}
