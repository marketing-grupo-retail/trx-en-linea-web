/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: PCONFIG_Imp.java,v 1.1 2019/12/18 17:08:58 Alfonso Exp $
 *
 */
package com.grpretail.business.admin.vo;

/**
 * Clase que permite acceso a la tabla PCONFIG y a sus atributos.
 *
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class PCONFIG_Imp extends jdao.data.DataAdv implements PCONFIG, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>PCONFIG</B>
	 */
	public static final String NAME = "MOL_PCONFIG";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>PCONFIG</B>
	 */
	public static final String ID = "ID";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _ID;

	/**
	 * Atributo que contiene el nombre del campo <B>NOMBRE</B>
	 * de la tabla <B>PCONFIG</B>
	 */
	public static final String NOMBRE = "NOMBRE";

	/**
	 * Atributo para manejar el campo <B>NOMBRE</B>
	 * de la tabla <B>NOMBRE</B>
	 */
	private java.lang.String _NOMBRE;

	/**
	 * Atributo que contiene el nombre del campo <B>VALOR</B>
	 * de la tabla <B>PCONFIG</B>
	 */
	public static final String VALOR = "VALOR";

	/**
	 * Atributo para manejar el campo <B>VALOR</B>
	 * de la tabla <B>VALOR</B>
	 */
	private java.lang.String _VALOR;

	/**
	 * Atributo que contiene el nombre del campo <B>DESCRIP</B>
	 * de la tabla <B>PCONFIG</B>
	 */
	public static final String DESCRIP = "DESCRIP";

	/**
	 * Atributo para manejar el campo <B>DESCRIP</B>
	 * de la tabla <B>DESCRIP</B>
	 */
	private java.lang.String _DESCRIP;

	/**
	 * Metodo Constructor basico
	 */
	public PCONFIG_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo PCONFIG con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public PCONFIG_Imp( java.lang.Integer _ID) {
	this._ID = _ID;
}
	/**
	 * Crea un nuevo PCONFIG con los campos de la tabla
	 * @param pID java.lang.Integer;
	 * @param pNOMBRE java.lang.String;
	 * @param pVALOR java.lang.String;
	 * @param pDESCRIP java.lang.String;
	 */
	public PCONFIG_Imp( java.lang.Integer pID,java.lang.String pNOMBRE,java.lang.String pVALOR,java.lang.String pDESCRIP) {
		this._ID = pID;
		this._NOMBRE = pNOMBRE;
		this._VALOR = pVALOR;
		this._DESCRIP = pDESCRIP;
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
	 * Retorna el valor del atributo DESCRIP.
	 * Creation date: (05/04/2004
	 * @return java.lang.String
	 */
	public java.lang.String getDESCRIP(){
			return _DESCRIP;
	}

	/**
	 * Asigna el atributo DESCRIP
	 * Creation date: (05/04/2004
	 * @param newDESCRIP java.lang.String
	 */
	public void setDESCRIP(java.lang.String newDESCRIP) {
		_DESCRIP = newDESCRIP;
	}

	/**
	 * Retorna el nombre de la tabla PCONFIG
	 * @return Nombre de la tabla
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla PCONFIG
	 */
	public void start() {
		String _fields[] = {ID,NOMBRE,VALOR,DESCRIP};
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
		} else if (field.equals(VALOR)) {
			return _VALOR;
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
		} else if (field.equals(NOMBRE)) {
			setNOMBRE((java.lang.String) value );
		} else if (field.equals(VALOR)) {
			setVALOR((java.lang.String) value );
		} else if (field.equals(DESCRIP)) {
			setDESCRIP((java.lang.String) value );
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
		} else if (field.equals(VALOR)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DESCRIP)) {
			return java.sql.Types.VARCHAR;
		}
		return 0;
	}
}
