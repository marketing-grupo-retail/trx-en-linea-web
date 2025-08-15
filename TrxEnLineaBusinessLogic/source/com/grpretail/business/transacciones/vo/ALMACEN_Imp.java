package com.grpretail.business.transacciones.vo;

/**
 * @(#) ALMACEN.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 18/10/2004
 */ 

/**
 * Clase que permite acceso a la tabla ALMACEN y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class ALMACEN_Imp extends jdao.data.DataAdv implements ALMACEN, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>ALMACEN</B>
	 */
	public static final String NAME = "GCPOSAF1";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	public static final String CODCCO = "CODCCO";
	public static final String CODEMP = "CODEMP";	

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _CODCCO;
	private java.lang.Integer _CODEMP;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_CITY</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	public static final String ID_CITY = "ID_CITY";

	/**
	 * Atributo para manejar el campo <B>ID_CITY</B>
	 * de la tabla <B>ID_CITY</B>
	 */
	private java.lang.Integer _ID_CITY;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_DEPT</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	public static final String ID_DEPT = "ID_DEPT";

	/**
	 * Atributo para manejar el campo <B>ID_DEPT</B>
	 * de la tabla <B>ID_DEPT</B>
	 */
	private java.lang.Integer _ID_DEPT;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_PAIS</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	public static final String ID_PAIS = "ID_PAIS";

	/**
	 * Atributo para manejar el campo <B>ID_PAIS</B>
	 * de la tabla <B>ID_PAIS</B>
	 */
	private java.lang.Integer _ID_PAIS;

	/**
	 * Atributo que contiene el nombre del campo <B>IP</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	public static final String IP = "IP";

	/**
	 * Atributo para manejar el campo <B>IP</B>
	 * de la tabla <B>IP</B>
	 */
	private java.lang.String _IP;

	/**
	 * Atributo que contiene el nombre del campo <B>USER</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	public static final String AL_USER = "AL_USER";

	/**
	 * Atributo para manejar el campo <B>USER</B>
	 * de la tabla <B>USER</B>
	 */
	private java.lang.String _AL_USER;

	/**
	 * Atributo que contiene el nombre del campo <B>PASSWORD</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	public static final String PASSWORD = "PASSWORD";

	/**
	 * Atributo para manejar el campo <B>PASSWORD</B>
	 * de la tabla <B>PASSWORD</B>
	 */
	private java.lang.String _PASSWORD;

	/**
	 * Atributo que contiene el nombre del campo <B>NOMBRE</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	public static final String NOMBRE = "NOMBRE";

	/**
	 * Atributo para manejar el campo <B>NOMBRE</B>
	 * de la tabla <B>NOMBRE</B>
	 */
	private java.lang.String _NOMBRE;

	/**
	 * Atributo que contiene el nombre del campo <B>DIRECC</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	public static final String DIRECC = "DIRECC";

	/**
	 * Atributo para manejar el campo <B>DIRECC</B>
	 * de la tabla <B>DIRECC</B>
	 */
	private java.lang.String _DIRECC;

	/**
	 * Atributo que contiene el nombre del campo <B>TELEFONO</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	public static final String TELEFONO = "TELEFONO";

	/**
	 * Atributo para manejar el campo <B>TELEFONO</B>
	 * de la tabla <B>TELEFONO</B>
	 */
	private java.lang.String _TELEFONO;

	/**
	 * Atributo que contiene el nombre del campo <B>EMAIL</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	public static final String EMAIL = "EMAIL";

	/**
	 * Atributo para manejar el campo <B>EMAIL</B>
	 * de la tabla <B>EMAIL</B>
	 */
	private java.lang.String _EMAIL;

	/**
	 * Atributo que contiene el nombre del campo <B>ADM_NAME</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	public static final String ADM_NAME = "ADM_NAME";

	/**
	 * Atributo para manejar el campo <B>ADM_NAME</B>
	 * de la tabla <B>ADM_NAME</B>
	 */
	private java.lang.String _ADM_NAME;
	
	private java.lang.String _CITY_NAME;

	/**
	 * Metodo Constructor basico
	 */
	public ALMACEN_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo ALMACEN con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public ALMACEN_Imp( java.lang.Integer _CODCCO,Integer _CODEMP) { 
	this._CODCCO = _CODCCO;
	this._CODEMP = _CODEMP;
}
	/**
	 * Crea un nuevo ALMACEN con los campos de la tabla
	 * @param pID java.lang.Integer;
	 * @param pID_CITY java.lang.Integer;
	 * @param pID_DEPT java.lang.Integer;
	 * @param pID_PAIS java.lang.Integer;
	 * @param pIP java.lang.String;
	 * @param pUSER java.lang.String;
	 * @param pPASSWORD java.lang.String;
	 * @param pNOMBRE java.lang.String;
	 * @param pDIRECC java.lang.String;
	 * @param pTELEFONO java.lang.String;
	 * @param pEMAIL java.lang.String;
	 * @param pADM_NAME java.lang.String;
	 */
	public ALMACEN_Imp( java.lang.Integer pCODCCO,java.lang.Integer pCODEMP,java.lang.Integer pID_CITY,java.lang.Integer pID_DEPT,java.lang.Integer pID_PAIS,java.lang.String pIP,java.lang.String pAL_USER,java.lang.String pPASSWORD,java.lang.String pNOMBRE,java.lang.String pDIRECC,java.lang.String pTELEFONO,java.lang.String pEMAIL,java.lang.String pADM_NAME) { 
		this._CODCCO = pCODCCO;
		this._CODEMP = pCODEMP;
		this._ID_CITY = pID_CITY;
		this._ID_DEPT = pID_DEPT;
		this._ID_PAIS = pID_PAIS;
		this._IP = pIP;
		this._AL_USER = pAL_USER;
		this._PASSWORD = pPASSWORD;
		this._NOMBRE = pNOMBRE;
		this._DIRECC = pDIRECC;
		this._TELEFONO = pTELEFONO;
		this._EMAIL = pEMAIL;
		this._ADM_NAME = pADM_NAME;
	}

	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (10/18/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getCODCCO(){
			return _CODCCO;
	}

	public java.lang.Integer getCODEMP(){
			return _CODEMP;
	}

	/**
	 * Asigna el atributo ID
	 * Creation date: (10/18/2004
	 * @param newID java.lang.Integer
	 */
	public void setCODCCO(java.lang.Integer newCODCCO) {
		_CODCCO = newCODCCO;
	}
	
	public void setCODEMP(java.lang.Integer newCODEMP) {
		_CODEMP = newCODEMP;
	}	

	/**
	 * Retorna el valor del atributo ID_CITY.
	 * Creation date: (10/18/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_CITY(){
			return _ID_CITY;
	}

	/**
	 * Asigna el atributo ID_CITY
	 * Creation date: (10/18/2004
	 * @param newID_CITY java.lang.Integer
	 */
	public void setID_CITY(java.lang.Integer newID_CITY) {
		_ID_CITY = newID_CITY;
	}

	/**
	 * Retorna el valor del atributo ID_DEPT.
	 * Creation date: (10/18/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_DEPT(){
			return _ID_DEPT;
	}

	/**
	 * Asigna el atributo ID_DEPT
	 * Creation date: (10/18/2004
	 * @param newID_DEPT java.lang.Integer
	 */
	public void setID_DEPT(java.lang.Integer newID_DEPT) {
		_ID_DEPT = newID_DEPT;
	}

	/**
	 * Retorna el valor del atributo ID_PAIS.
	 * Creation date: (10/18/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID_PAIS(){
			return _ID_PAIS;
	}

	/**
	 * Asigna el atributo ID_PAIS
	 * Creation date: (10/18/2004
	 * @param newID_PAIS java.lang.Integer
	 */
	public void setID_PAIS(java.lang.Integer newID_PAIS) {
		_ID_PAIS = newID_PAIS;
	}

	/**
	 * Retorna el valor del atributo IP.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getIP(){
			return _IP;
	}

	/**
	 * Asigna el atributo IP
	 * Creation date: (10/18/2004
	 * @param newIP java.lang.String
	 */
	public void setIP(java.lang.String newIP) {
		_IP = newIP;
	}

	/**
	 * Retorna el valor del atributo USER.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getAL_USER(){
			return _AL_USER;
	}

	/**
	 * Asigna el atributo USER
	 * Creation date: (10/18/2004
	 * @param newUSER java.lang.String
	 */
	public void setAL_USER(java.lang.String newAL_USER) {
		_AL_USER = newAL_USER;
	}

	/**
	 * Retorna el valor del atributo PASSWORD.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getPASSWORD(){
			return _PASSWORD;
	}

	/**
	 * Asigna el atributo PASSWORD
	 * Creation date: (10/18/2004
	 * @param newPASSWORD java.lang.String
	 */
	public void setPASSWORD(java.lang.String newPASSWORD) {
		_PASSWORD = newPASSWORD;
	}

	/**
	 * Retorna el valor del atributo NOMBRE.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getNOMBRE(){
			return _NOMBRE;
	}

	/**
	 * Asigna el atributo NOMBRE
	 * Creation date: (10/18/2004
	 * @param newNOMBRE java.lang.String
	 */
	public void setNOMBRE(java.lang.String newNOMBRE) {
		_NOMBRE = newNOMBRE;
	}

	/**
	 * Retorna el valor del atributo DIRECC.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getDIRECC(){
			return _DIRECC;
	}

	/**
	 * Asigna el atributo DIRECC
	 * Creation date: (10/18/2004
	 * @param newDIRECC java.lang.String
	 */
	public void setDIRECC(java.lang.String newDIRECC) {
		_DIRECC = newDIRECC;
	}

	/**
	 * Retorna el valor del atributo TELEFONO.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getTELEFONO(){
			return _TELEFONO;
	}

	/**
	 * Asigna el atributo TELEFONO
	 * Creation date: (10/18/2004
	 * @param newTELEFONO java.lang.String
	 */
	public void setTELEFONO(java.lang.String newTELEFONO) {
		_TELEFONO = newTELEFONO;
	}

	/**
	 * Retorna el valor del atributo EMAIL.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getEMAIL(){
			return _EMAIL;
	}

	/**
	 * Asigna el atributo EMAIL
	 * Creation date: (10/18/2004
	 * @param newEMAIL java.lang.String
	 */
	public void setEMAIL(java.lang.String newEMAIL) {
		_EMAIL = newEMAIL;
	}

	/**
	 * Retorna el valor del atributo ADM_NAME.
	 * Creation date: (10/18/2004
	 * @return java.lang.String
	 */
	public java.lang.String getADM_NAME(){
			return _ADM_NAME;
	}

	/**
	 * Asigna el atributo ADM_NAME
	 * Creation date: (10/18/2004
	 * @param newADM_NAME java.lang.String
	 */
	public void setADM_NAME(java.lang.String newADM_NAME) {
		_ADM_NAME = newADM_NAME;
	}

	/**
	 * Retorna el nombre de la tabla ALMACEN
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}

	public void setCITY_NAME(java.lang.String newCITY_NAME){
		_CITY_NAME = newCITY_NAME;
	}
	
	public java.lang.String getCITY_NAME(){
		return _CITY_NAME;	
	}
	
	/**
	 * Inicia la configuracion de la tabla ALMACEN
	 */
	public void start() {
		String _fields[] = {CODCCO,CODEMP,ID_CITY,ID_DEPT,ID_PAIS,IP,AL_USER,PASSWORD,NOMBRE,DIRECC,TELEFONO,EMAIL,ADM_NAME};
		fields = _fields;
		String _keyFields[] = {"CODCCO,CODEMP"};
		keyFields = _keyFields;
		dbProp = false;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public Object getValueField(String field) { 
		if (field.equals(CODCCO)) {
			return _CODCCO;
		}else if (field.equals(CODEMP)) {
			return _CODEMP;
		} else if (field.equals(ID_CITY)) {
			return _ID_CITY;
		} else if (field.equals(ID_DEPT)) {
			return _ID_DEPT;
		} else if (field.equals(ID_PAIS)) {
			return _ID_PAIS;
		} else if (field.equals(IP)) {
			return _IP;
		} else if (field.equals(AL_USER)) {
			return _AL_USER;
		} else if (field.equals(PASSWORD)) {
			return _PASSWORD;
		} else if (field.equals(NOMBRE)) {
			return _NOMBRE;
		} else if (field.equals(DIRECC)) {
			return _DIRECC;
		} else if (field.equals(TELEFONO)) {
			return _TELEFONO;
		} else if (field.equals(EMAIL)) {
			return _EMAIL;
		} else if (field.equals(ADM_NAME)) {
			return _ADM_NAME;
		}
		return null;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public void setValueField(String field, Object value) { 
	  if(value!=null){
		if (field.equals(CODCCO)) {
			setCODCCO((java.lang.Integer) value );
		}else if (field.equals(CODEMP)) {
			setCODEMP((java.lang.Integer) value );
		} else if (field.equals(ID_CITY)) {
			setID_CITY((java.lang.Integer) value );
		} else if (field.equals(ID_DEPT)) {
			setID_DEPT((java.lang.Integer) value );
		} else if (field.equals(ID_PAIS)) {
			setID_PAIS((java.lang.Integer) value );
		} else if (field.equals(IP)) {
			setIP((java.lang.String) value );
		} else if (field.equals(AL_USER)) {
			setAL_USER((java.lang.String) value );
		} else if (field.equals(PASSWORD)) {
			setPASSWORD((java.lang.String) value );
		} else if (field.equals(NOMBRE)) {
			setNOMBRE((java.lang.String) value );
		} else if (field.equals(DIRECC)) {
			setDIRECC((java.lang.String) value );
		} else if (field.equals(TELEFONO)) {
			setTELEFONO((java.lang.String) value );
		} else if (field.equals(EMAIL)) {
			setEMAIL((java.lang.String) value );
		} else if (field.equals(ADM_NAME)) {
			setADM_NAME((java.lang.String) value );
		}
	  }

	}
	/**
	 * Retorna un array con los tipos de datos de la BD, es usado para los prepared statement
	 * @return Retorna array de enteros con el tipo de dato en BD cada uno de los atributos
	 */
	public int getSQLFieldType(String field) {
		if (field.equals(CODCCO)) {
			return java.sql.Types.INTEGER;
		}else if (field.equals(CODEMP)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(ID_CITY)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(ID_DEPT)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(ID_PAIS)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(IP)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AL_USER)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(PASSWORD)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(NOMBRE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DIRECC)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TELEFONO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(EMAIL)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ADM_NAME)) {
			return java.sql.Types.VARCHAR;
		}
		return 0;
	}
}
