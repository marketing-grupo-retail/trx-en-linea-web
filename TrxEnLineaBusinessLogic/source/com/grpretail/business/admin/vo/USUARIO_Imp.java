/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: USUARIO_Imp.java,v 1.1 2019/12/18 17:08:58 Alfonso Exp $
 *
 */
package com.grpretail.business.admin.vo;

/**
 * Clase que permite acceso a la tabla USUARIO y a sus atributos.
 *
 * @author: null.
 * @version: null
 */

import java.io.Serializable;
import java.sql.Timestamp;


public class USUARIO_Imp extends jdao.data.DataAdv implements USUARIO, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>USUARIO</B>
	 */
	public static final String NAME = "MOL_USUARIO";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>USUARIO</B>
	 */
	public static final String ID = "ID";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _ID;

	/**
	 * Atributo que contiene el nombre del campo <B>LOGIN</B>
	 * de la tabla <B>USUARIO</B>
	 */
	public static final String LOGIN = "LOGIN";

	/**
	 * Atributo para manejar el campo <B>LOGIN</B>
	 * de la tabla <B>LOGIN</B>
	 */
	private java.lang.String _LOGIN;

	/**
	 * Atributo que contiene el nombre del campo <B>PASSWORD</B>
	 * de la tabla <B>USUARIO</B>
	 */
	public static final String PASSWORD = "PASSWORD";

	/**
	 * Atributo para manejar el campo <B>PASSWORD</B>
	 * de la tabla <B>PASSWORD</B>
	 */
	private java.lang.String _PASSWORD;

	/**
	 * Atributo que contiene el nombre del campo <B>NOMBRE</B>
	 * de la tabla <B>USUARIO</B>
	 */
	public static final String NOMBRE = "NOMBRE";

	/**
	 * Atributo para manejar el campo <B>NOMBRE</B>
	 * de la tabla <B>NOMBRE</B>
	 */
	private java.lang.String _NOMBRE;

	/**
	 * Atributo que contiene el nombre del campo <B>APELLIDO</B>
	 * de la tabla <B>USUARIO</B>
	 */
	public static final String APELLIDO = "APELLIDO";

	/**
	 * Atributo para manejar el campo <B>APELLIDO</B>
	 * de la tabla <B>APELLIDO</B>
	 */
	private java.lang.String _APELLIDO;

	/**
	 * Atributo que contiene el nombre del campo <B>EMAIL</B>
	 * de la tabla <B>USUARIO</B>
	 */
	public static final String EMAIL = "EMAIL";

	/**
	 * Atributo para manejar el campo <B>EMAIL</B>
	 * de la tabla <B>EMAIL</B>
	 */
	private java.lang.String _EMAIL;

	/**
	 * Atributo que contiene el nombre del campo <B>ESTADO</B>
	 * de la tabla <B>USUARIO</B>
	 */
	public static final String ESTADO = "ESTADO";

	/**
	 * Atributo para manejar el campo <B>ESTADO</B>
	 * de la tabla <B>ESTADO</B>
	 */
	private java.lang.String _ESTADO;

	public static final String INGRDATE = "INGRDATE";

	private Timestamp _INGRDATE;

	public static final String RETIDATE = "RETIDATE";

	private Timestamp _RETIDATE;

	/**
	 * Metodo Constructor basico
	 */
	public USUARIO_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo USUARIO con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public USUARIO_Imp( java.lang.Integer _ID) {
	this._ID = _ID;
}
	/**
	 * Crea un nuevo USUARIO con los campos de la tabla
	 * @param pID java.lang.Integer;
	 * @param pLOGIN java.lang.String;
	 * @param pPASSWORD java.lang.String;
	 * @param pNOMBRE java.lang.String;
	 * @param pAPELLIDO java.lang.String;
	 * @param pEMAIL java.lang.String;
	 * @param pESTADO java.lang.String;
	 */
	public USUARIO_Imp( java.lang.Integer pID,java.lang.String pLOGIN,java.lang.String pPASSWORD,java.lang.String pNOMBRE,java.lang.String pAPELLIDO,java.lang.String pEMAIL,java.lang.String pESTADO,Timestamp pINGRDATE,Timestamp pRETIDATE) {
		this._ID = pID;
		this._LOGIN = pLOGIN;
		this._PASSWORD = pPASSWORD;
		this._NOMBRE = pNOMBRE;
		this._APELLIDO = pAPELLIDO;
		this._EMAIL = pEMAIL;
		this._ESTADO = pESTADO;
		this._INGRDATE = pINGRDATE;
		this._RETIDATE = pRETIDATE;
	}

	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (05/10/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID(){
			return _ID;
	}

	/**
	 * Asigna el atributo ID
	 * Creation date: (05/10/2004
	 * @param newID java.lang.Integer
	 */
	public void setID(java.lang.Integer newID) {
		_ID = newID;
	}

	/**
	 * Retorna el valor del atributo LOGIN.
	 * Creation date: (05/10/2004
	 * @return java.lang.String
	 */
	public java.lang.String getLOGIN(){
			return _LOGIN;
	}

	/**
	 * Asigna el atributo LOGIN
	 * Creation date: (05/10/2004
	 * @param newLOGIN java.lang.String
	 */
	public void setLOGIN(java.lang.String newLOGIN) {
		_LOGIN = newLOGIN;
	}

	/**
	 * Retorna el valor del atributo PASSWORD.
	 * Creation date: (05/10/2004
	 * @return java.lang.String
	 */
	public java.lang.String getPASSWORD(){
			return _PASSWORD;
	}

	/**
	 * Asigna el atributo PASSWORD
	 * Creation date: (05/10/2004
	 * @param newPASSWORD java.lang.String
	 */
	public void setPASSWORD(java.lang.String newPASSWORD) {
		_PASSWORD = newPASSWORD;
	}

	/**
	 * Retorna el valor del atributo NOMBRE.
	 * Creation date: (05/10/2004
	 * @return java.lang.String
	 */
	public java.lang.String getNOMBRE(){
			return _NOMBRE;
	}

	/**
	 * Asigna el atributo NOMBRE
	 * Creation date: (05/10/2004
	 * @param newNOMBRE java.lang.String
	 */
	public void setNOMBRE(java.lang.String newNOMBRE) {
		_NOMBRE = newNOMBRE;
	}

	/**
	 * Retorna el valor del atributo APELLIDO.
	 * Creation date: (05/10/2004
	 * @return java.lang.String
	 */
	public java.lang.String getAPELLIDO(){
			return _APELLIDO;
	}

	/**
	 * Asigna el atributo APELLIDO
	 * Creation date: (05/10/2004
	 * @param newAPELLIDO java.lang.String
	 */
	public void setAPELLIDO(java.lang.String newAPELLIDO) {
		_APELLIDO = newAPELLIDO;
	}

	/**
	 * Retorna el valor del atributo EMAIL.
	 * Creation date: (05/10/2004
	 * @return java.lang.String
	 */
	public java.lang.String getEMAIL(){
			return _EMAIL;
	}

	/**
	 * Asigna el atributo EMAIL
	 * Creation date: (05/10/2004
	 * @param newEMAIL java.lang.String
	 */
	public void setEMAIL(java.lang.String newEMAIL) {
		_EMAIL = newEMAIL;
	}

	/**
	 * Retorna el valor del atributo ESTADO.
	 * Creation date: (05/10/2004
	 * @return java.lang.String
	 */
	public java.lang.String getESTADO(){
			return _ESTADO;
	}

	/**
	 * Asigna el atributo ESTADO
	 * Creation date: (05/10/2004
	 * @param newESTADO java.lang.String
	 */
	public void setESTADO(java.lang.String newESTADO) {
		_ESTADO = newESTADO;
	}

	/**
	 * Retorna el nombre de la tabla USUARIO
	 * @return Nombre de la tabla
	 */
	public String getTableName() {
		return NAME;
	}

	public Timestamp getINGRDATE(){
		return _INGRDATE;
	}

	public void setINGRDATE(Timestamp newINGRDATE){
		_INGRDATE = newINGRDATE;
	}

	public Timestamp getRETIDATE(){
		return _RETIDATE;
	}

	public void setRETIDATE(Timestamp newRETIDATE){
		_RETIDATE = newRETIDATE;
	}

	/**
	 * Inicia la configuracion de la tabla USUARIO
	 */
	public void start() {
		String _fields[] = {ID,LOGIN,PASSWORD,NOMBRE,APELLIDO,EMAIL,ESTADO,INGRDATE,RETIDATE};
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
		} else if (field.equals(LOGIN)) {
			return _LOGIN;
		} else if (field.equals(PASSWORD)) {
			return _PASSWORD;
		} else if (field.equals(NOMBRE)) {
			return _NOMBRE;
		} else if (field.equals(APELLIDO)) {
			return _APELLIDO;
		}else if (field.equals(EMAIL)) {
			return _EMAIL;
		} else if (field.equals(ESTADO)) {
			return _ESTADO;
		} else if (field.equals(INGRDATE)) {
			return _INGRDATE;
		} else if (field.equals(RETIDATE)) {
			return _RETIDATE;
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
		} else if (field.equals(LOGIN)) {
			setLOGIN((java.lang.String) value );
		} else if (field.equals(PASSWORD)) {
			setPASSWORD((java.lang.String) value );
		} else if (field.equals(NOMBRE)) {
			setNOMBRE((java.lang.String) value );
		} else if (field.equals(APELLIDO)) {
			setAPELLIDO((java.lang.String) value );
		} else if (field.equals(EMAIL)) {
			setEMAIL((java.lang.String) value );
		} else if (field.equals(ESTADO)) {
			setESTADO((java.lang.String) value );
		} else if (field.equals(INGRDATE)) {
			setINGRDATE((Timestamp) value );
		} else if (field.equals(RETIDATE)) {
			setRETIDATE((Timestamp) value );
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
		} else if (field.equals(LOGIN)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(PASSWORD)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(NOMBRE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(APELLIDO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(EMAIL)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ESTADO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INGRDATE)) {
			return java.sql.Types.TIMESTAMP;
		} else if (field.equals(RETIDATE)) {
			return java.sql.Types.TIMESTAMP;
		}
		return 0;
	}
}
