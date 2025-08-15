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
import java.sql.Timestamp;


public class STORE_CLOSING_Imp extends jdao.data.DataAdv implements STORE_CLOSING, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>ALMACEN</B>
	 */
	public static final String NAME = "TPOS_STORE_CLOSING";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	public static final String STORE = "STORE";
	public static final String DAY = "DAY";	
	public static final String FECHAHORA = "TFECHAHORA";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _STORE;
	private java.sql.Date _DAY;
	private java.sql.Timestamp _FECHAHORA;


	/**
	 * Metodo Constructor basico
	 */
	public STORE_CLOSING_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo ALMACEN con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public STORE_CLOSING_Imp( java.lang.Integer _CODCCO,java.sql.Timestamp _FECHAHORA) { 
	this._STORE = _CODCCO;
	this._FECHAHORA = _FECHAHORA;
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
	public STORE_CLOSING_Imp( java.lang.Integer pCODCCO, java.sql.Timestamp pFECHAHORA, java.sql.Date pDAY) { 
		this._STORE = pCODCCO;
		this._FECHAHORA = pFECHAHORA;
		this._DAY = pDAY;
	}

	public String getTableName() {
		return NAME;
	}

	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (10/18/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getSTORE(){
			return _STORE;
	}

	public java.sql.Date getDAY(){
			return _DAY;
	}

	public  java.sql.Timestamp getFECHAHORA(){
			return _FECHAHORA;
	}	

	/**
	 * Asigna el atributo ID
	 * Creation date: (10/18/2004
	 * @param newID java.lang.Integer
	 */
	public void setSTORE(java.lang.Integer newCODCCO) {
		_STORE = newCODCCO;
	}
	
	public void setDAY(java.sql.Date newDAY) {
		_DAY = newDAY;
	}	

	public void setFECHAHORA(java.sql.Timestamp newFECHAHORA) {
		_FECHAHORA = newFECHAHORA;
	}

	
	/**
	 * Inicia la configuracion de la tabla ALMACEN
	 */
	public void start() {
		String _fields[] = {STORE,DAY,FECHAHORA};
		fields = _fields;
		String _keyFields[] = {"STORE,FECHAHORA"};
		keyFields = _keyFields;
		dbProp = false;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public Object getValueField(String field) { 
		if (field.equals(STORE)) {
			return _STORE;
		}else if (field.equals(DAY)) {
			return _DAY;
		} else if (field.equals(FECHAHORA)) {
			return _FECHAHORA;
		}
		return null;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public void setValueField(String field, Object value) { 
	  if(value!=null){
		if (field.equals(STORE)) {
			setSTORE((java.lang.Integer) value );
		}else if (field.equals(DAY)) {
			setDAY((java.sql.Date) value );
		} else if (field.equals(FECHAHORA)) {
			setFECHAHORA((java.sql.Timestamp) value );
		}
	  }

	}
	/**
	 * Retorna un array con los tipos de datos de la BD, es usado para los prepared statement
	 * @return Retorna array de enteros con el tipo de dato en BD cada uno de los atributos
	 */
	public int getSQLFieldType(String field) {
		if (field.equals(STORE)) {
			return java.sql.Types.INTEGER;
		}else if (field.equals(DAY)) {
			return java.sql.Types.DATE;
		} else if (field.equals(FECHAHORA)) {
			return java.sql.Types.TIMESTAMP;
		} 
		return 0;
	}
}
