package com.asic.transacciones.vo;


/**
 * @(#) TX_PROCESO.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 24/02/2006
 */ 

/**
 * Clase que permite acceso a la tabla TX_PROCESO y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TX_PROCESO_Imp extends jdao.data.DataAdv implements TX_PROCESO, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TX_PROCESO</B>
	 */
	public static final String NAME = "TX_PROCESO";
	/**
	 * Atributo que contiene el nombre del campo <B>PROC_ID</B>
	 * de la tabla <B>TX_PROCESO</B>
	 */
	public static final String PROC_ID = "PROC_ID";

	/**
	 * Atributo para manejar el campo <B>PROC_ID</B>
	 * de la tabla <B>PROC_ID</B>
	 */
	private java.lang.Double _PROC_ID;

	/**
	 * Atributo que contiene el nombre del campo <B>PROC_DESC</B>
	 * de la tabla <B>TX_PROCESO</B>
	 */
	public static final String PROC_DESC = "PROC_DESC";

	/**
	 * Atributo para manejar el campo <B>PROC_DESC</B>
	 * de la tabla <B>PROC_DESC</B>
	 */
	private java.lang.String _PROC_DESC;

	/**
	 * Atributo que contiene el nombre del campo <B>PROC_ESTADO</B>
	 * de la tabla <B>TX_PROCESO</B>
	 */
	public static final String PROC_ESTADO = "PROC_ESTADO";

	/**
	 * Atributo para manejar el campo <B>PROC_ESTADO</B>
	 * de la tabla <B>PROC_ESTADO</B>
	 */
	private java.lang.String _PROC_ESTADO;

	/**
	 * Atributo que contiene el nombre del campo <B>AUDI_CREA</B>
	 * de la tabla <B>TX_PROCESO</B>
	 */
	public static final String AUDI_CREA = "AUDI_CREA";

	/**
	 * Atributo para manejar el campo <B>AUDI_CREA</B>
	 * de la tabla <B>AUDI_CREA</B>
	 */
	private java.lang.String _AUDI_CREA;

	/**
	 * Atributo que contiene el nombre del campo <B>AUDI_FHCREA</B>
	 * de la tabla <B>TX_PROCESO</B>
	 */
	public static final String AUDI_FHCREA = "AUDI_FHCREA";

	/**
	 * Atributo para manejar el campo <B>AUDI_FHCREA</B>
	 * de la tabla <B>AUDI_FHCREA</B>
	 */
	private java.sql.Timestamp _AUDI_FHCREA;

	/**
	 * Atributo que contiene el nombre del campo <B>AUDI_MOD</B>
	 * de la tabla <B>TX_PROCESO</B>
	 */
	public static final String AUDI_MOD = "AUDI_MOD";

	/**
	 * Atributo para manejar el campo <B>AUDI_MOD</B>
	 * de la tabla <B>AUDI_MOD</B>
	 */
	private java.lang.String _AUDI_MOD;

	/**
	 * Atributo que contiene el nombre del campo <B>AUDI_FHMOD</B>
	 * de la tabla <B>TX_PROCESO</B>
	 */
	public static final String AUDI_FHMOD = "AUDI_FHMOD";

	/**
	 * Atributo para manejar el campo <B>AUDI_FHMOD</B>
	 * de la tabla <B>AUDI_FHMOD</B>
	 */
	private java.sql.Timestamp _AUDI_FHMOD;

	/**
	 * Metodo Constructor basico
	 */
	public TX_PROCESO_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo TX_PROCESO con los campos de la llave primaria
 * @param _PROC_ID java.lang.Double;
 */
public TX_PROCESO_Imp( java.lang.Double _PROC_ID) { 
	this._PROC_ID = _PROC_ID;
}
	/**
	 * Crea un nuevo TX_PROCESO con los campos de la tabla
	 * @param pPROC_ID java.lang.Double;
	 * @param pPROC_DESC java.lang.String;
	 * @param pPROC_ESTADO java.lang.String;
	 * @param pAUDI_CREA java.lang.String;
	 * @param pAUDI_FHCREA java.sql.Timestamp;
	 * @param pAUDI_MOD java.lang.String;
	 * @param pAUDI_FHMOD java.sql.Timestamp;
	 */
	public TX_PROCESO_Imp( java.lang.Double pPROC_ID,java.lang.String pPROC_DESC,java.lang.String pPROC_ESTADO,java.lang.String pAUDI_CREA,java.sql.Timestamp pAUDI_FHCREA,java.lang.String pAUDI_MOD,java.sql.Timestamp pAUDI_FHMOD) { 
		this._PROC_ID = pPROC_ID;
		this._PROC_DESC = pPROC_DESC;
		this._PROC_ESTADO = pPROC_ESTADO;
		this._AUDI_CREA = pAUDI_CREA;
		this._AUDI_FHCREA = pAUDI_FHCREA;
		this._AUDI_MOD = pAUDI_MOD;
		this._AUDI_FHMOD = pAUDI_FHMOD;
	}

	/**
	 * Retorna el valor del atributo PROC_ID.
	 * Creation date: (02/24/2006
	 * @return java.lang.Double
	 */
	public java.lang.Double getPROC_ID(){
			return _PROC_ID;
	}

	/**
	 * Asigna el atributo PROC_ID
	 * Creation date: (02/24/2006
	 * @param newPROC_ID java.lang.Double
	 */
	public void setPROC_ID(java.lang.Double newPROC_ID) {
		_PROC_ID = newPROC_ID;
	}

	/**
	 * Retorna el valor del atributo PROC_DESC.
	 * Creation date: (02/24/2006
	 * @return java.lang.String
	 */
	public java.lang.String getPROC_DESC(){
			return _PROC_DESC;
	}

	/**
	 * Asigna el atributo PROC_DESC
	 * Creation date: (02/24/2006
	 * @param newPROC_DESC java.lang.String
	 */
	public void setPROC_DESC(java.lang.String newPROC_DESC) {
		_PROC_DESC = newPROC_DESC;
	}

	/**
	 * Retorna el valor del atributo PROC_ESTADO.
	 * Creation date: (02/24/2006
	 * @return java.lang.String
	 */
	public java.lang.String getPROC_ESTADO(){
			return _PROC_ESTADO;
	}

	/**
	 * Asigna el atributo PROC_ESTADO
	 * Creation date: (02/24/2006
	 * @param newPROC_ESTADO java.lang.String
	 */
	public void setPROC_ESTADO(java.lang.String newPROC_ESTADO) {
		_PROC_ESTADO = newPROC_ESTADO;
	}

	/**
	 * Retorna el valor del atributo AUDI_CREA.
	 * Creation date: (02/24/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAUDI_CREA(){
			return _AUDI_CREA;
	}

	/**
	 * Asigna el atributo AUDI_CREA
	 * Creation date: (02/24/2006
	 * @param newAUDI_CREA java.lang.String
	 */
	public void setAUDI_CREA(java.lang.String newAUDI_CREA) {
		_AUDI_CREA = newAUDI_CREA;
	}

	/**
	 * Retorna el valor del atributo AUDI_FHCREA.
	 * Creation date: (02/24/2006
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getAUDI_FHCREA(){
			return _AUDI_FHCREA;
	}

	/**
	 * Asigna el atributo AUDI_FHCREA
	 * Creation date: (02/24/2006
	 * @param newAUDI_FHCREA java.sql.Timestamp
	 */
	public void setAUDI_FHCREA(java.sql.Timestamp newAUDI_FHCREA) {
		_AUDI_FHCREA = newAUDI_FHCREA;
	}

	/**
	 * Retorna el valor del atributo AUDI_MOD.
	 * Creation date: (02/24/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAUDI_MOD(){
			return _AUDI_MOD;
	}

	/**
	 * Asigna el atributo AUDI_MOD
	 * Creation date: (02/24/2006
	 * @param newAUDI_MOD java.lang.String
	 */
	public void setAUDI_MOD(java.lang.String newAUDI_MOD) {
		_AUDI_MOD = newAUDI_MOD;
	}

	/**
	 * Retorna el valor del atributo AUDI_FHMOD.
	 * Creation date: (02/24/2006
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getAUDI_FHMOD(){
			return _AUDI_FHMOD;
	}

	/**
	 * Asigna el atributo AUDI_FHMOD
	 * Creation date: (02/24/2006
	 * @param newAUDI_FHMOD java.sql.Timestamp
	 */
	public void setAUDI_FHMOD(java.sql.Timestamp newAUDI_FHMOD) {
		_AUDI_FHMOD = newAUDI_FHMOD;
	}

	/**
	 * Retorna el nombre de la tabla TX_PROCESO
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TX_PROCESO
	 */
	public void start() {
		String _fields[] = {PROC_ID,PROC_DESC,PROC_ESTADO,AUDI_CREA,AUDI_FHCREA,AUDI_MOD,AUDI_FHMOD};
		fields = _fields;
		String _keyFields[] = {"PROC_ID"};
		keyFields = _keyFields;
		dbProp = false;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public Object getValueField(String field) { 
		if (field.equals(PROC_ID)) {
			return _PROC_ID;
		} else if (field.equals(PROC_DESC)) {
			return _PROC_DESC;
		} else if (field.equals(PROC_ESTADO)) {
			return _PROC_ESTADO;
		} else if (field.equals(AUDI_CREA)) {
			return _AUDI_CREA;
		} else if (field.equals(AUDI_FHCREA)) {
			return _AUDI_FHCREA;
		} else if (field.equals(AUDI_MOD)) {
			return _AUDI_MOD;
		} else if (field.equals(AUDI_FHMOD)) {
			return _AUDI_FHMOD;
		}
		return null;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public void setValueField(String field, Object value) { 
	  if(value!=null){
		if (field.equals(PROC_ID)) {
			setPROC_ID((java.lang.Double) value );
		} else if (field.equals(PROC_DESC)) {
			setPROC_DESC((java.lang.String) value );
		} else if (field.equals(PROC_ESTADO)) {
			setPROC_ESTADO((java.lang.String) value );
		} else if (field.equals(AUDI_CREA)) {
			setAUDI_CREA((java.lang.String) value );
		} else if (field.equals(AUDI_FHCREA)) {
			setAUDI_FHCREA((java.sql.Timestamp) value );
		} else if (field.equals(AUDI_MOD)) {
			setAUDI_MOD((java.lang.String) value );
		} else if (field.equals(AUDI_FHMOD)) {
			setAUDI_FHMOD((java.sql.Timestamp) value );
		}
	  }

	}
	/**
	 * Retorna un array con los tipos de datos de la BD, es usado para los prepared statement
	 * @return Retorna array de enteros con el tipo de dato en BD cada uno de los atributos
	 */
	public int getSQLFieldType(String field) {
		if (field.equals(PROC_ID)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(PROC_DESC)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(PROC_ESTADO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AUDI_CREA)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AUDI_FHCREA)) {
			return java.sql.Types.TIMESTAMP;
		} else if (field.equals(AUDI_MOD)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AUDI_FHMOD)) {
			return java.sql.Types.TIMESTAMP;
		}
		return 0;
	}
}
