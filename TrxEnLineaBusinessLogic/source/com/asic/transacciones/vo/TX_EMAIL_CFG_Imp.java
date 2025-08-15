package com.asic.transacciones.vo;


/**
 * @(#) TX_EMAIL_CFG.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 03/02/2006
 */ 

/**
 * Clase que permite acceso a la tabla TX_EMAIL_CFG y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TX_EMAIL_CFG_Imp extends jdao.data.DataAdv implements TX_EMAIL_CFG, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TX_EMAIL_CFG</B>
	 */
	public static final String NAME = "TX_EMAIL_CFG";
	/**
	 * Atributo que contiene el nombre del campo <B>EMAIL_ID</B>
	 * de la tabla <B>TX_EMAIL_CFG</B>
	 */
	public static final String EMAIL_ID = "EMAIL_ID";

	/**
	 * Atributo para manejar el campo <B>EMAIL_ID</B>
	 * de la tabla <B>EMAIL_ID</B>
	 */
	private java.lang.Double _EMAIL_ID;

	/**
	 * Atributo que contiene el nombre del campo <B>EMAIL_TXT</B>
	 * de la tabla <B>TX_EMAIL_CFG</B>
	 */
	public static final String EMAIL_TXT = "EMAIL_TXT";

	/**
	 * Atributo para manejar el campo <B>EMAIL_TXT</B>
	 * de la tabla <B>EMAIL_TXT</B>
	 */
	private java.lang.String _EMAIL_TXT;

	/**
	 * Atributo que contiene el nombre del campo <B>EMAIL_ASUNTO</B>
	 * de la tabla <B>TX_EMAIL_CFG</B>
	 */
	public static final String EMAIL_ASUNTO = "EMAIL_ASUNTO";

	/**
	 * Atributo para manejar el campo <B>EMAIL_ASUNTO</B>
	 * de la tabla <B>EMAIL_ASUNTO</B>
	 */
	private java.lang.String _EMAIL_ASUNTO;

	/**
	 * Atributo que contiene el nombre del campo <B>EMAIL_DESTINO</B>
	 * de la tabla <B>TX_EMAIL_CFG</B>
	 */
	public static final String EMAIL_DESTINO = "EMAIL_DESTINO";

	/**
	 * Atributo para manejar el campo <B>EMAIL_DESTINO</B>
	 * de la tabla <B>EMAIL_DESTINO</B>
	 */
	private java.lang.String _EMAIL_DESTINO;

	/**
	 * Metodo Constructor basico
	 */
	public TX_EMAIL_CFG_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo TX_EMAIL_CFG con los campos de la llave primaria
 * @param _EMAIL_ID java.lang.Double;
 */
public TX_EMAIL_CFG_Imp( java.lang.Double _EMAIL_ID) { 
	this._EMAIL_ID = _EMAIL_ID;
}
	/**
	 * Crea un nuevo TX_EMAIL_CFG con los campos de la tabla
	 * @param pEMAIL_ID java.lang.Double;
	 * @param pEMAIL_TXT java.lang.String;
	 * @param pEMAIL_ASUNTO java.lang.String;
	 * @param pEMAIL_DESTINO java.lang.String;
	 */
	public TX_EMAIL_CFG_Imp( java.lang.Double pEMAIL_ID,java.lang.String pEMAIL_TXT,java.lang.String pEMAIL_ASUNTO,java.lang.String pEMAIL_DESTINO) { 
		this._EMAIL_ID = pEMAIL_ID;
		this._EMAIL_TXT = pEMAIL_TXT;
		this._EMAIL_ASUNTO = pEMAIL_ASUNTO;
		this._EMAIL_DESTINO = pEMAIL_DESTINO;
	}

	/**
	 * Retorna el valor del atributo EMAIL_ID.
	 * Creation date: (02/03/2006
	 * @return java.lang.Double
	 */
	public java.lang.Double getEMAIL_ID(){
			return _EMAIL_ID;
	}

	/**
	 * Asigna el atributo EMAIL_ID
	 * Creation date: (02/03/2006
	 * @param newEMAIL_ID java.lang.Double
	 */
	public void setEMAIL_ID(java.lang.Double newEMAIL_ID) {
		_EMAIL_ID = newEMAIL_ID;
	}

	/**
	 * Retorna el valor del atributo EMAIL_TXT.
	 * Creation date: (02/03/2006
	 * @return java.lang.String
	 */
	public java.lang.String getEMAIL_TXT(){
			return _EMAIL_TXT;
	}

	/**
	 * Asigna el atributo EMAIL_TXT
	 * Creation date: (02/03/2006
	 * @param newEMAIL_TXT java.lang.String
	 */
	public void setEMAIL_TXT(java.lang.String newEMAIL_TXT) {
		_EMAIL_TXT = newEMAIL_TXT;
	}

	/**
	 * Retorna el valor del atributo EMAIL_ASUNTO.
	 * Creation date: (02/03/2006
	 * @return java.lang.String
	 */
	public java.lang.String getEMAIL_ASUNTO(){
			return _EMAIL_ASUNTO;
	}

	/**
	 * Asigna el atributo EMAIL_ASUNTO
	 * Creation date: (02/03/2006
	 * @param newEMAIL_ASUNTO java.lang.String
	 */
	public void setEMAIL_ASUNTO(java.lang.String newEMAIL_ASUNTO) {
		_EMAIL_ASUNTO = newEMAIL_ASUNTO;
	}

	/**
	 * Retorna el valor del atributo EMAIL_DESTINO.
	 * Creation date: (02/03/2006
	 * @return java.lang.String
	 */
	public java.lang.String getEMAIL_DESTINO(){
			return _EMAIL_DESTINO;
	}

	/**
	 * Asigna el atributo EMAIL_DESTINO
	 * Creation date: (02/03/2006
	 * @param newEMAIL_DESTINO java.lang.String
	 */
	public void setEMAIL_DESTINO(java.lang.String newEMAIL_DESTINO) {
		_EMAIL_DESTINO = newEMAIL_DESTINO;
	}

	/**
	 * Retorna el nombre de la tabla TX_EMAIL_CFG
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TX_EMAIL_CFG
	 */
	public void start() {
		String _fields[] = {EMAIL_ID,EMAIL_TXT,EMAIL_ASUNTO,EMAIL_DESTINO};
		fields = _fields;
		String _keyFields[] = {"EMAIL_ID"};
		keyFields = _keyFields;
		dbProp = false;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public Object getValueField(String field) { 
		if (field.equals(EMAIL_ID)) {
			return _EMAIL_ID;
		} else if (field.equals(EMAIL_TXT)) {
			return _EMAIL_TXT;
		} else if (field.equals(EMAIL_ASUNTO)) {
			return _EMAIL_ASUNTO;
		} else if (field.equals(EMAIL_DESTINO)) {
			return _EMAIL_DESTINO;
		}
		return null;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public void setValueField(String field, Object value) { 
	  if(value!=null){
		if (field.equals(EMAIL_ID)) {
			setEMAIL_ID((java.lang.Double) value );
		} else if (field.equals(EMAIL_TXT)) {
			setEMAIL_TXT((java.lang.String) value );
		} else if (field.equals(EMAIL_ASUNTO)) {
			setEMAIL_ASUNTO((java.lang.String) value );
		} else if (field.equals(EMAIL_DESTINO)) {
			setEMAIL_DESTINO((java.lang.String) value );
		}
	  }

	}
	/**
	 * Retorna un array con los tipos de datos de la BD, es usado para los prepared statement
	 * @return Retorna array de enteros con el tipo de dato en BD cada uno de los atributos
	 */
	public int getSQLFieldType(String field) {
		if (field.equals(EMAIL_ID)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(EMAIL_TXT)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(EMAIL_ASUNTO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(EMAIL_DESTINO)) {
			return java.sql.Types.VARCHAR;
		}
		return 0;
	}
}
