/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: AUDIT_Imp.java,v 1.1 2019/12/18 17:08:58 Alfonso Exp $
 *
 */
package com.grpretail.business.admin.vo;


import java.io.Serializable;


/**
 * Clase que permite acceso a la tabla AUDIT y a sus atributos.
 *
 * @author: null.
 * @version: null
 */
public class AUDIT_Imp extends jdao.data.DataAdv implements AUDIT, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>AUDIT</B>
	 */
	public static final String NAME = "MOL_AUDIT";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>AUDIT</B>
	 */
	public static final String ID = "ID";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _ID;

	/**
	 * Atributo que contiene el nombre del campo <B>FECHA</B>
	 * de la tabla <B>AUDIT</B>
	 */
	public static final String FECHA = "FECHA";

	/**
	 * Atributo para manejar el campo <B>FECHA</B>
	 * de la tabla <B>FECHA</B>
	 */
	private java.lang.String _FECHA;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_USER</B>
	 * de la tabla <B>AUDIT</B>
	 */
	public static final String ID_USER = "ID_USER";

	/**
	 * Atributo para manejar el campo <B>ID_USER</B>
	 * de la tabla <B>ID_USER</B>
	 */
	private java.lang.Integer _ID_USER;

	/**
	 * Atributo que contiene el nombre del campo <B>SERV</B>
	 * de la tabla <B>AUDIT</B>
	 */
	public static final String SERV = "SERV";

	/**
	 * Atributo para manejar el campo <B>SERV</B>
	 * de la tabla <B>SERV</B>
	 */
	private java.lang.String _SERV;

	/**
	 * Atributo que contiene el nombre del campo <B>DESCRIP</B>
	 * de la tabla <B>AUDIT</B>
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
	public AUDIT_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo AUDIT con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public AUDIT_Imp( java.lang.Integer _ID) {
	this._ID = _ID;
}
	/**
	 * Crea un nuevo AUDIT con los campos de la tabla
	 * @param pID java.lang.Integer;
	 * @param pFECHA java.lang.String;
	 * @param pID_USER java.lang.Integer;
	 * @param pSERV java.lang.String;
	 * @param pDESCRIP java.lang.String;
	 */
	public AUDIT_Imp( java.lang.Integer pID,java.lang.String pFECHA,java.lang.Integer pID_USER,java.lang.String pSERV,java.lang.String pDESCRIP) {
		this._ID = pID;
		this._FECHA = pFECHA;
		this._ID_USER = pID_USER;
		this._SERV = pSERV;
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
	 * Retorna el valor del atributo FECHA.
	 * Creation date: (05/04/2004
	 * @return java.lang.String
	 */
	public java.lang.String getFECHA(){
			return _FECHA;
	}

	/**
	 * Asigna el atributo FECHA
	 * Creation date: (05/04/2004
	 * @param newFECHA java.lang.String
	 */
	public void setFECHA(java.lang.String newFECHA) {
		_FECHA = newFECHA;
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
	 * Retorna el valor del atributo SERV.
	 * Creation date: (05/04/2004
	 * @return java.lang.String
	 */
	public java.lang.String getSERV(){
			return _SERV;
	}

	/**
	 * Asigna el atributo SERV
	 * Creation date: (05/04/2004
	 * @param newSERV java.lang.String
	 */
	public void setSERV(java.lang.String newSERV) {
		_SERV = newSERV;
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
	 * Retorna el nombre de la tabla AUDIT
	 * @return Nombre de la tabla
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla AUDIT
	 */
	public void start() {
		String _fields[] = {ID,FECHA,ID_USER,SERV,DESCRIP};
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
		} else if (field.equals(FECHA)) {
			return _FECHA;
		} else if (field.equals(ID_USER)) {
			return _ID_USER;
		} else if (field.equals(SERV)) {
			return _SERV;
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
		} else if (field.equals(FECHA)) {
			setFECHA((java.lang.String) value );
		} else if (field.equals(ID_USER)) {
			setID_USER((java.lang.Integer) value );
		} else if (field.equals(SERV)) {
			setSERV((java.lang.String) value );
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
		} else if (field.equals(FECHA)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ID_USER)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(SERV)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DESCRIP)) {
			return java.sql.Types.VARCHAR;
		}
		return 0;
	}
}
