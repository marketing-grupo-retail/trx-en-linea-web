package com.asic.transacciones.vo;


/**
 * @(#) TX_RECHAZO.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 10/02/2006
 */ 

/**
 * Clase que permite acceso a la tabla TX_RECHAZO y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TX_RECHAZO_Imp extends jdao.data.DataAdv implements TX_RECHAZO, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String NAME = "TX_RECHAZO";
	/**
	 * Atributo que contiene el nombre del campo <B>ID_RECHAZO</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String ID_RECHAZO = "ID_RECHAZO";

	/**
	 * Atributo para manejar el campo <B>ID_RECHAZO</B>
	 * de la tabla <B>ID_RECHAZO</B>
	 */
	private java.lang.Double _ID_RECHAZO;

	/**
	 * Atributo que contiene el nombre del campo <B>STORE</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String STORE = "STORE";

	/**
	 * Atributo para manejar el campo <B>STORE</B>
	 * de la tabla <B>STORE</B>
	 */
	private java.lang.String _STORE;

	/**
	 * Atributo que contiene el nombre del campo <B>TERMINAL</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String TERMINAL = "TERMINAL";

	/**
	 * Atributo para manejar el campo <B>TERMINAL</B>
	 * de la tabla <B>TERMINAL</B>
	 */
	private java.lang.String _TERMINAL;

	/**
	 * Atributo que contiene el nombre del campo <B>TRANSNUM</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String TRANSNUM = "TRANSNUM";

	/**
	 * Atributo para manejar el campo <B>TRANSNUM</B>
	 * de la tabla <B>TRANSNUM</B>
	 */
	private java.lang.String _TRANSNUM;

	/**
	 * Atributo que contiene el nombre del campo <B>DAY</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String DAY = "DAY";

	/**
	 * Atributo para manejar el campo <B>DAY</B>
	 * de la tabla <B>DAY</B>
	 */
	private java.lang.String _DAY;

	/**
	 * Atributo que contiene el nombre del campo <B>TIME</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.lang.String _TIME;

	/**
	 * Atributo que contiene el nombre del campo <B>ESTADO</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String ESTADO = "ESTADO";

	/**
	 * Atributo para manejar el campo <B>ESTADO</B>
	 * de la tabla <B>ESTADO</B>
	 */
	private java.lang.String _ESTADO;

	/**
	 * Atributo que contiene el nombre del campo <B>ERROR</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String ERROR = "ERROR";

	/**
	 * Atributo para manejar el campo <B>ERROR</B>
	 * de la tabla <B>ERROR</B>
	 */
	private java.lang.String _ERROR;

	/**
	 * Atributo que contiene el nombre del campo <B>COMENTARIO</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String COMENTARIO = "COMENTARIO";

	/**
	 * Atributo para manejar el campo <B>COMENTARIO</B>
	 * de la tabla <B>COMENTARIO</B>
	 */
	private java.lang.String _COMENTARIO;

	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETX</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String OFFSETX = "OFFSETX";

	/**
	 * Atributo para manejar el campo <B>OFFSETX</B>
	 * de la tabla <B>OFFSETX</B>
	 */
	private java.lang.String _OFFSETX;

	/**
	 * Atributo que contiene el nombre del campo <B>AUDI_CREA</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String AUDI_CREA = "AUDI_CREA";

	/**
	 * Atributo para manejar el campo <B>AUDI_CREA</B>
	 * de la tabla <B>AUDI_CREA</B>
	 */
	private java.lang.String _AUDI_CREA;

	/**
	 * Atributo que contiene el nombre del campo <B>AUDI_FHCREA</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String AUDI_FHCREA = "AUDI_FHCREA";

	/**
	 * Atributo para manejar el campo <B>AUDI_FHCREA</B>
	 * de la tabla <B>AUDI_FHCREA</B>
	 */
	private java.sql.Timestamp _AUDI_FHCREA;

	/**
	 * Atributo que contiene el nombre del campo <B>AUDI_MOD</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String AUDI_MOD = "AUDI_MOD";

	/**
	 * Atributo para manejar el campo <B>AUDI_MOD</B>
	 * de la tabla <B>AUDI_MOD</B>
	 */
	private java.lang.String _AUDI_MOD;

	/**
	 * Atributo que contiene el nombre del campo <B>AUDI_FHMOD</B>
	 * de la tabla <B>TX_RECHAZO</B>
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
	public TX_RECHAZO_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo TX_RECHAZO con los campos de la llave primaria
 * @param _ID_RECHAZO java.lang.Double;
 */
public TX_RECHAZO_Imp( java.lang.Double _ID_RECHAZO) { 
	this._ID_RECHAZO = _ID_RECHAZO;
}
	/**
	 * Crea un nuevo TX_RECHAZO con los campos de la tabla
	 * @param pID_RECHAZO java.lang.Double;
	 * @param pSTORE java.lang.String;
	 * @param pTERMINAL java.lang.String;
	 * @param pTRANSNUM java.lang.String;
	 * @param pDAY java.lang.String;
	 * @param pTIME java.lang.String;
	 * @param pESTADO java.lang.String;
	 * @param pERROR java.lang.String;
	 * @param pCOMENTARIO java.lang.String;
	 * @param pOFFSETX java.lang.String;
	 * @param pAUDI_CREA java.lang.String;
	 * @param pAUDI_FHCREA java.sql.Timestamp;
	 * @param pAUDI_MOD java.lang.String;
	 * @param pAUDI_FHMOD java.sql.Timestamp;
	 */
	public TX_RECHAZO_Imp( java.lang.Double pID_RECHAZO,java.lang.String pSTORE,java.lang.String pTERMINAL,java.lang.String pTRANSNUM,java.lang.String pDAY,java.lang.String pTIME,java.lang.String pESTADO,java.lang.String pERROR,java.lang.String pCOMENTARIO,java.lang.String pOFFSETX,java.lang.String pAUDI_CREA,java.sql.Timestamp pAUDI_FHCREA,java.lang.String pAUDI_MOD,java.sql.Timestamp pAUDI_FHMOD) { 
		this._ID_RECHAZO = pID_RECHAZO;
		this._STORE = pSTORE;
		this._TERMINAL = pTERMINAL;
		this._TRANSNUM = pTRANSNUM;
		this._DAY = pDAY;
		this._TIME = pTIME;
		this._ESTADO = pESTADO;
		this._ERROR = pERROR;
		this._COMENTARIO = pCOMENTARIO;
		this._OFFSETX = pOFFSETX;
		this._AUDI_CREA = pAUDI_CREA;
		this._AUDI_FHCREA = pAUDI_FHCREA;
		this._AUDI_MOD = pAUDI_MOD;
		this._AUDI_FHMOD = pAUDI_FHMOD;
	}

	/**
	 * Retorna el valor del atributo ID_RECHAZO.
	 * Creation date: (02/10/2006
	 * @return java.lang.Double
	 */
	public java.lang.Double getID_RECHAZO(){
			return _ID_RECHAZO;
	}

	/**
	 * Asigna el atributo ID_RECHAZO
	 * Creation date: (02/10/2006
	 * @param newID_RECHAZO java.lang.Double
	 */
	public void setID_RECHAZO(java.lang.Double newID_RECHAZO) {
		_ID_RECHAZO = newID_RECHAZO;
	}

	/**
	 * Retorna el valor del atributo STORE.
	 * Creation date: (02/10/2006
	 * @return java.lang.String
	 */
	public java.lang.String getSTORE(){
			return _STORE;
	}

	/**
	 * Asigna el atributo STORE
	 * Creation date: (02/10/2006
	 * @param newSTORE java.lang.String
	 */
	public void setSTORE(java.lang.String newSTORE) {
		_STORE = newSTORE;
	}

	/**
	 * Retorna el valor del atributo TERMINAL.
	 * Creation date: (02/10/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTERMINAL(){
			return _TERMINAL;
	}

	/**
	 * Asigna el atributo TERMINAL
	 * Creation date: (02/10/2006
	 * @param newTERMINAL java.lang.String
	 */
	public void setTERMINAL(java.lang.String newTERMINAL) {
		_TERMINAL = newTERMINAL;
	}

	/**
	 * Retorna el valor del atributo TRANSNUM.
	 * Creation date: (02/10/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTRANSNUM(){
			return _TRANSNUM;
	}

	/**
	 * Asigna el atributo TRANSNUM
	 * Creation date: (02/10/2006
	 * @param newTRANSNUM java.lang.String
	 */
	public void setTRANSNUM(java.lang.String newTRANSNUM) {
		_TRANSNUM = newTRANSNUM;
	}

	/**
	 * Retorna el valor del atributo DAY.
	 * Creation date: (02/10/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDAY(){
			return _DAY;
	}

	/**
	 * Asigna el atributo DAY
	 * Creation date: (02/10/2006
	 * @param newDAY java.lang.String
	 */
	public void setDAY(java.lang.String newDAY) {
		_DAY = newDAY;
	}

	/**
	 * Retorna el valor del atributo TIME.
	 * Creation date: (02/10/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTIME(){
			return _TIME;
	}

	/**
	 * Asigna el atributo TIME
	 * Creation date: (02/10/2006
	 * @param newTIME java.lang.String
	 */
	public void setTIME(java.lang.String newTIME) {
		_TIME = newTIME;
	}

	/**
	 * Retorna el valor del atributo ESTADO.
	 * Creation date: (02/10/2006
	 * @return java.lang.String
	 */
	public java.lang.String getESTADO(){
			return _ESTADO;
	}

	/**
	 * Asigna el atributo ESTADO
	 * Creation date: (02/10/2006
	 * @param newESTADO java.lang.String
	 */
	public void setESTADO(java.lang.String newESTADO) {
		_ESTADO = newESTADO;
	}

	/**
	 * Retorna el valor del atributo ERROR.
	 * Creation date: (02/10/2006
	 * @return java.lang.String
	 */
	public java.lang.String getERROR(){
			return _ERROR;
	}

	/**
	 * Asigna el atributo ERROR
	 * Creation date: (02/10/2006
	 * @param newERROR java.lang.String
	 */
	public void setERROR(java.lang.String newERROR) {
		_ERROR = newERROR;
	}

	/**
	 * Retorna el valor del atributo COMENTARIO.
	 * Creation date: (02/10/2006
	 * @return java.lang.String
	 */
	public java.lang.String getCOMENTARIO(){
			return _COMENTARIO;
	}

	/**
	 * Asigna el atributo COMENTARIO
	 * Creation date: (02/10/2006
	 * @param newCOMENTARIO java.lang.String
	 */
	public void setCOMENTARIO(java.lang.String newCOMENTARIO) {
		_COMENTARIO = newCOMENTARIO;
	}

	/**
	 * Retorna el valor del atributo OFFSETX.
	 * Creation date: (02/10/2006
	 * @return java.lang.String
	 */
	public java.lang.String getOFFSETX(){
			return _OFFSETX;
	}

	/**
	 * Asigna el atributo OFFSETX
	 * Creation date: (02/10/2006
	 * @param newOFFSETX java.lang.String
	 */
	public void setOFFSETX(java.lang.String newOFFSETX) {
		_OFFSETX = newOFFSETX;
	}

	/**
	 * Retorna el valor del atributo AUDI_CREA.
	 * Creation date: (02/10/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAUDI_CREA(){
			return _AUDI_CREA;
	}

	/**
	 * Asigna el atributo AUDI_CREA
	 * Creation date: (02/10/2006
	 * @param newAUDI_CREA java.lang.String
	 */
	public void setAUDI_CREA(java.lang.String newAUDI_CREA) {
		_AUDI_CREA = newAUDI_CREA;
	}

	/**
	 * Retorna el valor del atributo AUDI_FHCREA.
	 * Creation date: (02/10/2006
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getAUDI_FHCREA(){
			return _AUDI_FHCREA;
	}

	/**
	 * Asigna el atributo AUDI_FHCREA
	 * Creation date: (02/10/2006
	 * @param newAUDI_FHCREA java.sql.Timestamp
	 */
	public void setAUDI_FHCREA(java.sql.Timestamp newAUDI_FHCREA) {
		_AUDI_FHCREA = newAUDI_FHCREA;
	}

	/**
	 * Retorna el valor del atributo AUDI_MOD.
	 * Creation date: (02/10/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAUDI_MOD(){
			return _AUDI_MOD;
	}

	/**
	 * Asigna el atributo AUDI_MOD
	 * Creation date: (02/10/2006
	 * @param newAUDI_MOD java.lang.String
	 */
	public void setAUDI_MOD(java.lang.String newAUDI_MOD) {
		_AUDI_MOD = newAUDI_MOD;
	}

	/**
	 * Retorna el valor del atributo AUDI_FHMOD.
	 * Creation date: (02/10/2006
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getAUDI_FHMOD(){
			return _AUDI_FHMOD;
	}

	/**
	 * Asigna el atributo AUDI_FHMOD
	 * Creation date: (02/10/2006
	 * @param newAUDI_FHMOD java.sql.Timestamp
	 */
	public void setAUDI_FHMOD(java.sql.Timestamp newAUDI_FHMOD) {
		_AUDI_FHMOD = newAUDI_FHMOD;
	}

	/**
	 * Retorna el nombre de la tabla TX_RECHAZO
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TX_RECHAZO
	 */
	public void start() {
		String _fields[] = {ID_RECHAZO,STORE,TERMINAL,TRANSNUM,DAY,TIME,ESTADO,ERROR,COMENTARIO,OFFSETX,AUDI_CREA,AUDI_FHCREA,AUDI_MOD,AUDI_FHMOD};
		fields = _fields;
		String _keyFields[] = {"ID_RECHAZO"};
		keyFields = _keyFields;
		dbProp = false;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public Object getValueField(String field) { 
		if (field.equals(ID_RECHAZO)) {
			return _ID_RECHAZO;
		} else if (field.equals(STORE)) {
			return _STORE;
		} else if (field.equals(TERMINAL)) {
			return _TERMINAL;
		} else if (field.equals(TRANSNUM)) {
			return _TRANSNUM;
		} else if (field.equals(DAY)) {
			return _DAY;
		} else if (field.equals(TIME)) {
			return _TIME;
		} else if (field.equals(ESTADO)) {
			return _ESTADO;
		} else if (field.equals(ERROR)) {
			return _ERROR;
		} else if (field.equals(COMENTARIO)) {
			return _COMENTARIO;
		} else if (field.equals(OFFSETX)) {
			return _OFFSETX;
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
		if (field.equals(ID_RECHAZO)) {
			setID_RECHAZO((java.lang.Double) value );
		} else if (field.equals(STORE)) {
			setSTORE((java.lang.String) value );
		} else if (field.equals(TERMINAL)) {
			setTERMINAL((java.lang.String) value );
		} else if (field.equals(TRANSNUM)) {
			setTRANSNUM((java.lang.String) value );
		} else if (field.equals(DAY)) {
			setDAY((java.lang.String) value );
		} else if (field.equals(TIME)) {
			setTIME((java.lang.String) value );
		} else if (field.equals(ESTADO)) {
			setESTADO((java.lang.String) value );
		} else if (field.equals(ERROR)) {
			setERROR((java.lang.String) value );
		} else if (field.equals(COMENTARIO)) {
			setCOMENTARIO((java.lang.String) value );
		} else if (field.equals(OFFSETX)) {
			setOFFSETX((java.lang.String) value );
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
		if (field.equals(ID_RECHAZO)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(STORE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TERMINAL)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TRANSNUM)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DAY)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TIME)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ESTADO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ERROR)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(COMENTARIO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(OFFSETX)) {
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
