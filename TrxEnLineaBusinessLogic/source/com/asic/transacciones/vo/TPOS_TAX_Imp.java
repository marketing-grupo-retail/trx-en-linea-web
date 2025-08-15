package com.asic.transacciones.vo;
/**
 * @(#) TPOS_TAX.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 15/12/2005
 */ 

/**
 * Clase que permite acceso a la tabla TPOS_TAX y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TPOS_TAX_Imp extends jdao.data.DataAdv implements TPOS_TAX, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TPOS_TAX</B>
	 */
	public static final String NAME = "TPOS_TAX";
	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETY</B>
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String OFFSETY = "OFFSETY";

	/**
	 * Atributo para manejar el campo <B>OFFSETY</B>
	 * de la tabla <B>OFFSETY</B>
	 */
	private java.lang.Double _OFFSETY;

	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETX</B>
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String OFFSETX = "OFFSETX";

	/**
	 * Atributo para manejar el campo <B>OFFSETX</B>
	 * de la tabla <B>OFFSETX</B>
	 */
	private java.lang.Double _OFFSETX;

	/**
	 * Atributo que contiene el nombre del campo <B>STORE</B>
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String STORE = "STORE";

	/**
	 * Atributo para manejar el campo <B>STORE</B>
	 * de la tabla <B>STORE</B>
	 */
	private java.lang.Double _STORE;

	/**
	 * Atributo que contiene el nombre del campo <B>TERMINAL</B>
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String TERMINAL = "TERMINAL";

	/**
	 * Atributo para manejar el campo <B>TERMINAL</B>
	 * de la tabla <B>TERMINAL</B>
	 */
	private java.lang.Double _TERMINAL;

	/**
	 * Atributo que contiene el nombre del campo <B>TRANSNUM</B>
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String TRANSNUM = "TRANSNUM";

	/**
	 * Atributo para manejar el campo <B>TRANSNUM</B>
	 * de la tabla <B>TRANSNUM</B>
	 */
	private java.lang.Double _TRANSNUM;

	/**
	 * Atributo que contiene el nombre del campo <B>DAY</B>
	 * de la tabla <B>TPOS_TAX</B>
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
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.lang.String _TIME;

	/**
	 * Atributo que contiene el nombre del campo <B>TYPE</B>
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String TYPE = "TYPE";

	/**
	 * Atributo para manejar el campo <B>TYPE</B>
	 * de la tabla <B>TYPE</B>
	 */
	private java.lang.Double _TYPE;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXA</B>
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String AMTTAXA = "AMTTAXA";

	/**
	 * Atributo para manejar el campo <B>AMTTAXA</B>
	 * de la tabla <B>AMTTAXA</B>
	 */
	private java.lang.Double _AMTTAXA;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXB</B>
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String AMTTAXB = "AMTTAXB";

	/**
	 * Atributo para manejar el campo <B>AMTTAXB</B>
	 * de la tabla <B>AMTTAXB</B>
	 */
	private java.lang.Double _AMTTAXB;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXC</B>
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String AMTTAXC = "AMTTAXC";

	/**
	 * Atributo para manejar el campo <B>AMTTAXC</B>
	 * de la tabla <B>AMTTAXC</B>
	 */
	private java.lang.Double _AMTTAXC;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXD</B>
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String AMTTAXD = "AMTTAXD";

	/**
	 * Atributo para manejar el campo <B>AMTTAXD</B>
	 * de la tabla <B>AMTTAXD</B>
	 */
	private java.lang.Double _AMTTAXD;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXLEA</B>
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String AMTTAXLEA = "AMTTAXLEA";

	/**
	 * Atributo para manejar el campo <B>AMTTAXLEA</B>
	 * de la tabla <B>AMTTAXLEA</B>
	 */
	private java.lang.Double _AMTTAXLEA;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXLEB</B>
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String AMTTAXLEB = "AMTTAXLEB";

	/**
	 * Atributo para manejar el campo <B>AMTTAXLEB</B>
	 * de la tabla <B>AMTTAXLEB</B>
	 */
	private java.lang.Double _AMTTAXLEB;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXLEC</B>
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String AMTTAXLEC = "AMTTAXLEC";

	/**
	 * Atributo para manejar el campo <B>AMTTAXLEC</B>
	 * de la tabla <B>AMTTAXLEC</B>
	 */
	private java.lang.Double _AMTTAXLEC;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXLED</B>
	 * de la tabla <B>TPOS_TAX</B>
	 */
	public static final String AMTTAXLED = "AMTTAXLED";

	/**
	 * Atributo para manejar el campo <B>AMTTAXLED</B>
	 * de la tabla <B>AMTTAXLED</B>
	 */
	private java.lang.Double _AMTTAXLED;

	/**
	 * Atributo que contiene el nombre del campo <B>TIPO</B>
	 * de la tabla <B>TPOS_TAX</B>
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
	public TPOS_TAX_Imp() {
		super();
		start();
	}

	/**
	 * Crea un nuevo TPOS_TAX con los campos de la tabla
	 * @param pOFFSETY java.lang.Double;
	 * @param pOFFSETX java.lang.Double;
	 * @param pSTORE java.lang.Double;
	 * @param pTERMINAL java.lang.Double;
	 * @param pTRANSNUM java.lang.Double;
	 * @param pDAY java.sql.Timestamp;
	 * @param pTIME java.lang.String;
	 * @param pTYPE java.lang.Double;
	 * @param pAMTTAXA java.lang.Double;
	 * @param pAMTTAXB java.lang.Double;
	 * @param pAMTTAXC java.lang.Double;
	 * @param pAMTTAXD java.lang.Double;
	 * @param pAMTTAXLEA java.lang.Double;
	 * @param pAMTTAXLEB java.lang.Double;
	 * @param pAMTTAXLEC java.lang.Double;
	 * @param pAMTTAXLED java.lang.Double;
	 * @param pTIPO java.lang.String;
	 */
	public TPOS_TAX_Imp( java.lang.Double pOFFSETY,java.lang.Double pOFFSETX,java.lang.Double pSTORE,java.lang.Double pTERMINAL,java.lang.Double pTRANSNUM,java.sql.Timestamp pDAY,java.lang.String pTIME,java.lang.Double pTYPE,java.lang.Double pAMTTAXA,java.lang.Double pAMTTAXB,java.lang.Double pAMTTAXC,java.lang.Double pAMTTAXD,java.lang.Double pAMTTAXLEA,java.lang.Double pAMTTAXLEB,java.lang.Double pAMTTAXLEC,java.lang.Double pAMTTAXLED,java.lang.String pTIPO, java.sql.Timestamp pFECHAHORA) { 
		this._OFFSETY = pOFFSETY;
		this._OFFSETX = pOFFSETX;
		this._STORE = pSTORE;
		this._TERMINAL = pTERMINAL;
		this._TRANSNUM = pTRANSNUM;
		this._DAY = pDAY;
		this._TIME = pTIME;
		this._TYPE = pTYPE;
		this._AMTTAXA = pAMTTAXA;
		this._AMTTAXB = pAMTTAXB;
		this._AMTTAXC = pAMTTAXC;
		this._AMTTAXD = pAMTTAXD;
		this._AMTTAXLEA = pAMTTAXLEA;
		this._AMTTAXLEB = pAMTTAXLEB;
		this._AMTTAXLEC = pAMTTAXLEC;
		this._AMTTAXLED = pAMTTAXLED;
		this._TIPO = pTIPO;
		this._FECHAHORA = pFECHAHORA;
	}

	/**
	 * Retorna el valor del atributo OFFSETY.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getOFFSETY(){
			return _OFFSETY;
	}

	/**
	 * Asigna el atributo OFFSETY
	 * Creation date: (12/15/2005
	 * @param newOFFSETY java.lang.Double
	 */
	public void setOFFSETY(java.lang.Double newOFFSETY) {
		_OFFSETY = newOFFSETY;
	}

	/**
	 * Retorna el valor del atributo OFFSETX.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getOFFSETX(){
			return _OFFSETX;
	}

	/**
	 * Asigna el atributo OFFSETX
	 * Creation date: (12/15/2005
	 * @param newOFFSETX java.lang.Double
	 */
	public void setOFFSETX(java.lang.Double newOFFSETX) {
		_OFFSETX = newOFFSETX;
	}

	/**
	 * Retorna el valor del atributo STORE.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getSTORE(){
			return _STORE;
	}

	/**
	 * Asigna el atributo STORE
	 * Creation date: (12/15/2005
	 * @param newSTORE java.lang.Double
	 */
	public void setSTORE(java.lang.Double newSTORE) {
		_STORE = newSTORE;
	}

	/**
	 * Retorna el valor del atributo TERMINAL.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getTERMINAL(){
			return _TERMINAL;
	}

	/**
	 * Asigna el atributo TERMINAL
	 * Creation date: (12/15/2005
	 * @param newTERMINAL java.lang.Double
	 */
	public void setTERMINAL(java.lang.Double newTERMINAL) {
		_TERMINAL = newTERMINAL;
	}

	/**
	 * Retorna el valor del atributo TRANSNUM.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getTRANSNUM(){
			return _TRANSNUM;
	}

	/**
	 * Asigna el atributo TRANSNUM
	 * Creation date: (12/15/2005
	 * @param newTRANSNUM java.lang.Double
	 */
	public void setTRANSNUM(java.lang.Double newTRANSNUM) {
		_TRANSNUM = newTRANSNUM;
	}

	/**
	 * Retorna el valor del atributo DAY.
	 * Creation date: (12/15/2005
	 * @return java.sql.Timestamp
	 */
	public java.sql.Timestamp getDAY(){
			return _DAY;
	}

	/**
	 * Asigna el atributo DAY
	 * Creation date: (12/15/2005
	 * @param newDAY java.sql.Timestamp
	 */
	public void setDAY(java.sql.Timestamp newDAY) {
		_DAY = newDAY;
		_FECHAHORA = newDAY;
	}

	/**
	 * Retorna el valor del atributo TIME.
	 * Creation date: (12/15/2005
	 * @return java.lang.String
	 */
	public java.lang.String getTIME(){
			return _TIME;
	}

	/**
	 * Asigna el atributo TIME
	 * Creation date: (12/15/2005
	 * @param newTIME java.lang.String
	 */
	public void setTIME(java.lang.String newTIME) {
		_TIME = newTIME;
	}

	/**
	 * Retorna el valor del atributo TYPE.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getTYPE(){
			return _TYPE;
	}

	/**
	 * Asigna el atributo TYPE
	 * Creation date: (12/15/2005
	 * @param newTYPE java.lang.Double
	 */
	public void setTYPE(java.lang.Double newTYPE) {
		_TYPE = newTYPE;
	}

	/**
	 * Retorna el valor del atributo AMTTAXA.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getAMTTAXA(){
			return _AMTTAXA;
	}

	/**
	 * Asigna el atributo AMTTAXA
	 * Creation date: (12/15/2005
	 * @param newAMTTAXA java.lang.Double
	 */
	public void setAMTTAXA(java.lang.Double newAMTTAXA) {
		_AMTTAXA = newAMTTAXA;
	}

	/**
	 * Retorna el valor del atributo AMTTAXB.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getAMTTAXB(){
			return _AMTTAXB;
	}

	/**
	 * Asigna el atributo AMTTAXB
	 * Creation date: (12/15/2005
	 * @param newAMTTAXB java.lang.Double
	 */
	public void setAMTTAXB(java.lang.Double newAMTTAXB) {
		_AMTTAXB = newAMTTAXB;
	}

	/**
	 * Retorna el valor del atributo AMTTAXC.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getAMTTAXC(){
			return _AMTTAXC;
	}

	/**
	 * Asigna el atributo AMTTAXC
	 * Creation date: (12/15/2005
	 * @param newAMTTAXC java.lang.Double
	 */
	public void setAMTTAXC(java.lang.Double newAMTTAXC) {
		_AMTTAXC = newAMTTAXC;
	}

	/**
	 * Retorna el valor del atributo AMTTAXD.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getAMTTAXD(){
			return _AMTTAXD;
	}

	/**
	 * Asigna el atributo AMTTAXD
	 * Creation date: (12/15/2005
	 * @param newAMTTAXD java.lang.Double
	 */
	public void setAMTTAXD(java.lang.Double newAMTTAXD) {
		_AMTTAXD = newAMTTAXD;
	}

	/**
	 * Retorna el valor del atributo AMTTAXLEA.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getAMTTAXLEA(){
			return _AMTTAXLEA;
	}

	/**
	 * Asigna el atributo AMTTAXLEA
	 * Creation date: (12/15/2005
	 * @param newAMTTAXLEA java.lang.Double
	 */
	public void setAMTTAXLEA(java.lang.Double newAMTTAXLEA) {
		_AMTTAXLEA = newAMTTAXLEA;
	}

	/**
	 * Retorna el valor del atributo AMTTAXLEB.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getAMTTAXLEB(){
			return _AMTTAXLEB;
	}

	/**
	 * Asigna el atributo AMTTAXLEB
	 * Creation date: (12/15/2005
	 * @param newAMTTAXLEB java.lang.Double
	 */
	public void setAMTTAXLEB(java.lang.Double newAMTTAXLEB) {
		_AMTTAXLEB = newAMTTAXLEB;
	}

	/**
	 * Retorna el valor del atributo AMTTAXLEC.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getAMTTAXLEC(){
			return _AMTTAXLEC;
	}

	/**
	 * Asigna el atributo AMTTAXLEC
	 * Creation date: (12/15/2005
	 * @param newAMTTAXLEC java.lang.Double
	 */
	public void setAMTTAXLEC(java.lang.Double newAMTTAXLEC) {
		_AMTTAXLEC = newAMTTAXLEC;
	}

	/**
	 * Retorna el valor del atributo AMTTAXLED.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getAMTTAXLED(){
			return _AMTTAXLED;
	}

	/**
	 * Asigna el atributo AMTTAXLED
	 * Creation date: (12/15/2005
	 * @param newAMTTAXLED java.lang.Double
	 */
	public void setAMTTAXLED(java.lang.Double newAMTTAXLED) {
		_AMTTAXLED = newAMTTAXLED;
	}

	/**
	 * Retorna el valor del atributo TIPO.
	 * Creation date: (12/15/2005
	 * @return java.lang.String
	 */
	public java.lang.String getTIPO(){
			return _TIPO;
	}

	/**
	 * Asigna el atributo TIPO
	 * Creation date: (12/15/2005
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
	 * Retorna el nombre de la tabla TPOS_TAX
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TPOS_TAX
	 */
	public void start() {
		String _fields[] = {OFFSETY,OFFSETX,STORE,TERMINAL,TRANSNUM,DAY,TIME,TYPE,AMTTAXA,AMTTAXB,AMTTAXC,AMTTAXD,AMTTAXLEA,AMTTAXLEB,AMTTAXLEC,AMTTAXLED,TIPO,FECHAHORA};
		fields = _fields;
		String _keyFields[] = {"OFFSETX", "STORE", "TERMINAL", "TRANSNUM", "DAY", "TIME"};
		keyFields = _keyFields;		
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
		} else if (field.equals(TYPE)) {
			return _TYPE;
		} else if (field.equals(AMTTAXA)) {
			return _AMTTAXA;
		} else if (field.equals(AMTTAXB)) {
			return _AMTTAXB;
		} else if (field.equals(AMTTAXC)) {
			return _AMTTAXC;
		} else if (field.equals(AMTTAXD)) {
			return _AMTTAXD;
		} else if (field.equals(AMTTAXLEA)) {
			return _AMTTAXLEA;
		} else if (field.equals(AMTTAXLEB)) {
			return _AMTTAXLEB;
		} else if (field.equals(AMTTAXLEC)) {
			return _AMTTAXLEC;
		} else if (field.equals(AMTTAXLED)) {
			return _AMTTAXLED;
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
		} else if (field.equals(TYPE)) {
			setTYPE((java.lang.Double) value );
		} else if (field.equals(AMTTAXA)) {
			setAMTTAXA((java.lang.Double) value );
		} else if (field.equals(AMTTAXB)) {
			setAMTTAXB((java.lang.Double) value );
		} else if (field.equals(AMTTAXC)) {
			setAMTTAXC((java.lang.Double) value );
		} else if (field.equals(AMTTAXD)) {
			setAMTTAXD((java.lang.Double) value );
		} else if (field.equals(AMTTAXLEA)) {
			setAMTTAXLEA((java.lang.Double) value );
		} else if (field.equals(AMTTAXLEB)) {
			setAMTTAXLEB((java.lang.Double) value );
		} else if (field.equals(AMTTAXLEC)) {
			setAMTTAXLEC((java.lang.Double) value );
		} else if (field.equals(AMTTAXLED)) {
			setAMTTAXLED((java.lang.Double) value );
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
		} else if (field.equals(TYPE)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(AMTTAXA)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(AMTTAXB)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(AMTTAXC)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(AMTTAXD)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(AMTTAXLEA)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(AMTTAXLEB)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(AMTTAXLEC)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(AMTTAXLED)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(TIPO)) {
			return java.sql.Types.VARCHAR;
		}else if (field.equals(FECHAHORA)) {
			return java.sql.Types.TIMESTAMP;
		}
		return 0;
	}
}
