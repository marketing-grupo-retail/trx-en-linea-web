package com.asic.transacciones.vo;


/**
 * @(#) TPOS_ITEM_RECORD_CHANGE.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 13/02/2006
 */ 

/**
 * Clase que permite acceso a la tabla TPOS_ITEM_RECORD_CHANGE y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TPOS_ITEM_RECORD_CHANGE_Imp extends jdao.data.DataAdv implements TPOS_ITEM_RECORD_CHANGE, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TPOS_ITEM_RECORD_CHANGE</B>
	 */
	public static final String NAME = "TPOS_ITEM_RECORD_CHANGE";
	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETY</B>
	 * de la tabla <B>TPOS_ITEM_RECORD_CHANGE</B>
	 */
	public static final String OFFSETY = "OFFSETY";

	/**
	 * Atributo para manejar el campo <B>OFFSETY</B>
	 * de la tabla <B>OFFSETY</B>
	 */
	private java.lang.Double _OFFSETY;

	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETX</B>
	 * de la tabla <B>TPOS_ITEM_RECORD_CHANGE</B>
	 */
	public static final String OFFSETX = "OFFSETX";

	/**
	 * Atributo para manejar el campo <B>OFFSETX</B>
	 * de la tabla <B>OFFSETX</B>
	 */
	private java.lang.Double _OFFSETX;

	/**
	 * Atributo que contiene el nombre del campo <B>STORE</B>
	 * de la tabla <B>TPOS_ITEM_RECORD_CHANGE</B>
	 */
	public static final String STORE = "STORE";

	/**
	 * Atributo para manejar el campo <B>STORE</B>
	 * de la tabla <B>STORE</B>
	 */
	private java.lang.Double _STORE;

	/**
	 * Atributo que contiene el nombre del campo <B>TERMINAL</B>
	 * de la tabla <B>TPOS_ITEM_RECORD_CHANGE</B>
	 */
	public static final String TERMINAL = "TERMINAL";

	/**
	 * Atributo para manejar el campo <B>TERMINAL</B>
	 * de la tabla <B>TERMINAL</B>
	 */
	private java.lang.Double _TERMINAL;

	/**
	 * Atributo que contiene el nombre del campo <B>TRANSNUM</B>
	 * de la tabla <B>TPOS_ITEM_RECORD_CHANGE</B>
	 */
	public static final String TRANSNUM = "TRANSNUM";

	/**
	 * Atributo para manejar el campo <B>TRANSNUM</B>
	 * de la tabla <B>TRANSNUM</B>
	 */
	private java.lang.Double _TRANSNUM;

	/**
	 * Atributo que contiene el nombre del campo <B>DAY</B>
	 * de la tabla <B>TPOS_ITEM_RECORD_CHANGE</B>
	 */
	public static final String DAY = "DAY";

	/**
	 * Atributo para manejar el campo <B>DAY</B>
	 * de la tabla <B>DAY</B>
	 */
	private java.sql.Timestamp _DAY;
	
	private java.sql.Timestamp _FECHAHORA;

	/**
	 * Atributo que contiene el nombre del campo <B>TIME</B>
	 * de la tabla <B>TPOS_ITEM_RECORD_CHANGE</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.lang.String _TIME;

	/**
	 * Atributo que contiene el nombre del campo <B>OLDDATA</B>
	 * de la tabla <B>TPOS_ITEM_RECORD_CHANGE</B>
	 */
	public static final String OLDDATA = "OLDDATA";

	/**
	 * Atributo para manejar el campo <B>OLDDATA</B>
	 * de la tabla <B>OLDDATA</B>
	 */
	private java.lang.String _OLDDATA;

	/**
	 * Atributo que contiene el nombre del campo <B>NEWDATA</B>
	 * de la tabla <B>TPOS_ITEM_RECORD_CHANGE</B>
	 */
	public static final String NEWDATA = "NEWDATA";

	/**
	 * Atributo para manejar el campo <B>NEWDATA</B>
	 * de la tabla <B>NEWDATA</B>
	 */
	private java.lang.String _NEWDATA;

	/**
	 * Atributo que contiene el nombre del campo <B>TIPO</B>
	 * de la tabla <B>TPOS_ITEM_RECORD_CHANGE</B>
	 */
	public static final String TIPO = "TIPO";
	
	public static final String FECHAHORA = "FECHAHORA";

	/**
	 * Atributo para manejar el campo <B>TIPO</B>
	 * de la tabla <B>TIPO</B>
	 */
	private java.lang.String _TIPO;

	/**
	 * Metodo Constructor basico
	 */
	public TPOS_ITEM_RECORD_CHANGE_Imp() {
		super();
		start();
	}

	/**
	 * Crea un nuevo TPOS_ITEM_RECORD_CHANGE con los campos de la tabla
	 * @param pOFFSETY java.lang.Double;
	 * @param pOFFSETX java.lang.Double;
	 * @param pSTORE java.lang.Double;
	 * @param pTERMINAL java.lang.Double;
	 * @param pTRANSNUM java.lang.Double;
	 * @param pDAY java.sql.Timestamp;
	 * @param pTIME java.lang.String;
	 * @param pOLDDATA java.lang.String;
	 * @param pNEWDATA java.lang.String;
	 * @param pTIPO java.lang.String;
	 */
	public TPOS_ITEM_RECORD_CHANGE_Imp( java.lang.Double pOFFSETY,java.lang.Double pOFFSETX,java.lang.Double pSTORE,java.lang.Double pTERMINAL,java.lang.Double pTRANSNUM,java.sql.Timestamp pDAY,java.lang.String pTIME,java.lang.String pOLDDATA,java.lang.String pNEWDATA,java.lang.String pTIPO, java.sql.Timestamp pFECHAHORA) { 
		this._OFFSETY = pOFFSETY;
		this._OFFSETX = pOFFSETX;
		this._STORE = pSTORE;
		this._TERMINAL = pTERMINAL;
		this._TRANSNUM = pTRANSNUM;
		this._DAY = pDAY;
		this._TIME = pTIME;
		this._OLDDATA = pOLDDATA;
		this._NEWDATA = pNEWDATA;
		this._TIPO = pTIPO;
		this._FECHAHORA = pFECHAHORA;
	}

	/**
	 * Retorna el valor del atributo OFFSETY.
	 * Creation date: (02/13/2006
	 * @return java.lang.Double
	 */
	public java.lang.Double getOFFSETY(){
			return _OFFSETY;
	}

	/**
	 * Asigna el atributo OFFSETY
	 * Creation date: (02/13/2006
	 * @param newOFFSETY java.lang.Double
	 */
	public void setOFFSETY(java.lang.Double newOFFSETY) {
		_OFFSETY = newOFFSETY;
	}

	/**
	 * Retorna el valor del atributo OFFSETX.
	 * Creation date: (02/13/2006
	 * @return java.lang.Double
	 */
	public java.lang.Double getOFFSETX(){
			return _OFFSETX;
	}

	/**
	 * Asigna el atributo OFFSETX
	 * Creation date: (02/13/2006
	 * @param newOFFSETX java.lang.Double
	 */
	public void setOFFSETX(java.lang.Double newOFFSETX) {
		_OFFSETX = newOFFSETX;
	}

	/**
	 * Retorna el valor del atributo STORE.
	 * Creation date: (02/13/2006
	 * @return java.lang.Double
	 */
	public java.lang.Double getSTORE(){
			return _STORE;
	}

	/**
	 * Asigna el atributo STORE
	 * Creation date: (02/13/2006
	 * @param newSTORE java.lang.Double
	 */
	public void setSTORE(java.lang.Double newSTORE) {
		_STORE = newSTORE;
	}

	/**
	 * Retorna el valor del atributo TERMINAL.
	 * Creation date: (02/13/2006
	 * @return java.lang.Double
	 */
	public java.lang.Double getTERMINAL(){
			return _TERMINAL;
	}

	/**
	 * Asigna el atributo TERMINAL
	 * Creation date: (02/13/2006
	 * @param newTERMINAL java.lang.Double
	 */
	public void setTERMINAL(java.lang.Double newTERMINAL) {
		_TERMINAL = newTERMINAL;
	}

	/**
	 * Retorna el valor del atributo TRANSNUM.
	 * Creation date: (02/13/2006
	 * @return java.lang.Double
	 */
	public java.lang.Double getTRANSNUM(){
			return _TRANSNUM;
	}

	/**
	 * Asigna el atributo TRANSNUM
	 * Creation date: (02/13/2006
	 * @param newTRANSNUM java.lang.Double
	 */
	public void setTRANSNUM(java.lang.Double newTRANSNUM) {
		_TRANSNUM = newTRANSNUM;
	}

	/**
	 * Retorna el valor del atributo DAY.
	 * Creation date: (02/13/2006
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getDAY(){
			return _DAY;
	}

	/**
	 * Asigna el atributo DAY
	 * Creation date: (02/13/2006
	 * @param newDAY java.sql.Timestamp
	 */
	public void setDAY(java.sql.Timestamp newDAY) {
		_DAY = newDAY;
		_FECHAHORA = newDAY;
	}

	/**
	 * Retorna el valor del atributo TIME.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTIME(){
			return _TIME;
	}

	/**
	 * Asigna el atributo TIME
	 * Creation date: (02/13/2006
	 * @param newTIME java.lang.String
	 */
	public void setTIME(java.lang.String newTIME) {
		_TIME = newTIME;
	}

	/**
	 * Retorna el valor del atributo OLDDATA.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getOLDDATA(){
			return _OLDDATA;
	}

	/**
	 * Asigna el atributo OLDDATA
	 * Creation date: (02/13/2006
	 * @param newOLDDATA java.lang.String
	 */
	public void setOLDDATA(java.lang.String newOLDDATA) {
		_OLDDATA = newOLDDATA;
	}

	/**
	 * Retorna el valor del atributo NEWDATA.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getNEWDATA(){
			return _NEWDATA;
	}

	/**
	 * Asigna el atributo NEWDATA
	 * Creation date: (02/13/2006
	 * @param newNEWDATA java.lang.String
	 */
	public void setNEWDATA(java.lang.String newNEWDATA) {
		_NEWDATA = newNEWDATA;
	}

	/**
	 * Retorna el valor del atributo TIPO.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTIPO(){
			return _TIPO;
	}

	/**
	 * Asigna el atributo TIPO
	 * Creation date: (02/13/2006
	 * @param newTIPO java.lang.String
	 */
	public void setTIPO(java.lang.String newTIPO) {
		_TIPO = newTIPO;
	}

	public java.sql.Timestamp getFECHAHORA(){
			return _DAY;
	}

	public void setFECHAHORA(java.sql.Timestamp newDAY) {
		_FECHAHORA = newDAY;
	}

	/**
	 * Retorna el nombre de la tabla TPOS_ITEM_RECORD_CHANGE
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TPOS_ITEM_RECORD_CHANGE
	 */
	public void start() {
		String _fields[] = {OFFSETY,OFFSETX,STORE,TERMINAL,TRANSNUM,DAY,TIME,OLDDATA,NEWDATA,TIPO,FECHAHORA};
		fields = _fields;
		dbProp = false;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public Object getValueField(String field) { 
		if (field.equals(OFFSETY)) {
			return _OFFSETY;
		} else if (field.equals(OFFSETX)) {
			return _OFFSETX;
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
		} else if (field.equals(OLDDATA)) {
			return _OLDDATA;
		} else if (field.equals(NEWDATA)) {
			return _NEWDATA;
		} else if (field.equals(TIPO)) {
			return _TIPO;
		}else if (field.equals(FECHAHORA)) {
			return _FECHAHORA;
		}
		return null;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public void setValueField(String field, Object value) { 
	  if(value!=null){
		if (field.equals(OFFSETY)) {
			setOFFSETY((java.lang.Double) value );
		} else if (field.equals(OFFSETX)) {
			setOFFSETX((java.lang.Double) value );
		} else if (field.equals(STORE)) {
			setSTORE((java.lang.Double) value );
		} else if (field.equals(TERMINAL)) {
			setTERMINAL((java.lang.Double) value );
		} else if (field.equals(TRANSNUM)) {
			setTRANSNUM((java.lang.Double) value );
		} else if (field.equals(DAY)) {
			setDAY((java.sql.Timestamp) value );
		} else if (field.equals(TIME)) {
			setTIME((java.lang.String) value );
		} else if (field.equals(OLDDATA)) {
			setOLDDATA((java.lang.String) value );
		} else if (field.equals(NEWDATA)) {
			setNEWDATA((java.lang.String) value );
		} else if (field.equals(TIPO)) {
			setTIPO((java.lang.String) value );
		}else if (field.equals(FECHAHORA)) {
			setFECHAHORA((java.sql.Timestamp) value );
		}
	  }

	}
	/**
	 * Retorna un array con los tipos de datos de la BD, es usado para los prepared statement
	 * @return Retorna array de enteros con el tipo de dato en BD cada uno de los atributos
	 */
	public int getSQLFieldType(String field) {
		if (field.equals(OFFSETY)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(OFFSETX)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(STORE)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(TERMINAL)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(TRANSNUM)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(DAY)) {
			return java.sql.Types.TIMESTAMP;
		} else if (field.equals(TIME)) {
			return java.sql.Types.CHAR;
		} else if (field.equals(OLDDATA)) {
			return java.sql.Types.CHAR;
		} else if (field.equals(NEWDATA)) {
			return java.sql.Types.CHAR;
		} else if (field.equals(TIPO)) {
			return java.sql.Types.VARCHAR;
		}else if (field.equals(FECHAHORA)) {
			return java.sql.Types.TIMESTAMP;
		}
		return 0;
	}
}
