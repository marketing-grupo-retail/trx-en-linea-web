package com.asic.transacciones.vo;
/**
 * @(#) TX_TAX.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 18/11/2005
 */ 

/**
 * Clase que permite acceso a la tabla TX_TAX y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TX_TAX_Imp extends jdao.data.DataAdv implements TX_TAX, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TX_TAX</B>
	 */
	public static final String NAME = "TX_TAX";
	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETY</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String OFFSETY = "OFFSETY";

	/**
	 * Atributo para manejar el campo <B>OFFSETY</B>
	 * de la tabla <B>OFFSETY</B>
	 */
	private java.lang.String _OFFSETY;

	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETX</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String OFFSETX = "OFFSETX";

	/**
	 * Atributo para manejar el campo <B>OFFSETX</B>
	 * de la tabla <B>OFFSETX</B>
	 */
	private java.lang.String _OFFSETX;

	/**
	 * Atributo que contiene el nombre del campo <B>STORE</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String STORE = "STORE";

	/**
	 * Atributo para manejar el campo <B>STORE</B>
	 * de la tabla <B>STORE</B>
	 */
	private java.lang.String _STORE;

	/**
	 * Atributo que contiene el nombre del campo <B>TERMINAL</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String TERMINAL = "TERMINAL";

	/**
	 * Atributo para manejar el campo <B>TERMINAL</B>
	 * de la tabla <B>TERMINAL</B>
	 */
	private java.lang.String _TERMINAL;

	/**
	 * Atributo que contiene el nombre del campo <B>TRANSNUM</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String TRANSNUM = "TRANSNUM";

	/**
	 * Atributo para manejar el campo <B>TRANSNUM</B>
	 * de la tabla <B>TRANSNUM</B>
	 */
	private java.lang.String _TRANSNUM;

	/**
	 * Atributo que contiene el nombre del campo <B>DAY</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String DAY = "DAY";

	/**
	 * Atributo para manejar el campo <B>DAY</B>
	 * de la tabla <B>DAY</B>
	 */
	private java.lang.String _DAY;

	/**
	 * Atributo que contiene el nombre del campo <B>TIME</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.lang.String _TIME;

	/**
	 * Atributo que contiene el nombre del campo <B>TYPE</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String TYPE = "TYPE";

	/**
	 * Atributo para manejar el campo <B>TYPE</B>
	 * de la tabla <B>TYPE</B>
	 */
	private java.lang.String _TYPE;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXA</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String AMTTAXA = "AMTTAXA";

	/**
	 * Atributo para manejar el campo <B>AMTTAXA</B>
	 * de la tabla <B>AMTTAXA</B>
	 */
	private java.lang.String _AMTTAXA;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXB</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String AMTTAXB = "AMTTAXB";

	/**
	 * Atributo para manejar el campo <B>AMTTAXB</B>
	 * de la tabla <B>AMTTAXB</B>
	 */
	private java.lang.String _AMTTAXB;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXC</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String AMTTAXC = "AMTTAXC";

	/**
	 * Atributo para manejar el campo <B>AMTTAXC</B>
	 * de la tabla <B>AMTTAXC</B>
	 */
	private java.lang.String _AMTTAXC;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXD</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String AMTTAXD = "AMTTAXD";

	/**
	 * Atributo para manejar el campo <B>AMTTAXD</B>
	 * de la tabla <B>AMTTAXD</B>
	 */
	private java.lang.String _AMTTAXD;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXLEA</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String AMTTAXLEA = "AMTTAXLEA";

	/**
	 * Atributo para manejar el campo <B>AMTTAXLEA</B>
	 * de la tabla <B>AMTTAXLEA</B>
	 */
	private java.lang.String _AMTTAXLEA;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXLEB</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String AMTTAXLEB = "AMTTAXLEB";

	/**
	 * Atributo para manejar el campo <B>AMTTAXLEB</B>
	 * de la tabla <B>AMTTAXLEB</B>
	 */
	private java.lang.String _AMTTAXLEB;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXLEC</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String AMTTAXLEC = "AMTTAXLEC";

	/**
	 * Atributo para manejar el campo <B>AMTTAXLEC</B>
	 * de la tabla <B>AMTTAXLEC</B>
	 */
	private java.lang.String _AMTTAXLEC;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTAXLED</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String AMTTAXLED = "AMTTAXLED";

	/**
	 * Atributo para manejar el campo <B>AMTTAXLED</B>
	 * de la tabla <B>AMTTAXLED</B>
	 */
	private java.lang.String _AMTTAXLED;

	/**
	 * Atributo que contiene el nombre del campo <B>TIPO</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String TIPO = "TIPO";

	/**
	 * Atributo para manejar el campo <B>TIPO</B>
	 * de la tabla <B>TIPO</B>
	 */
	private java.lang.String _TIPO;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_RECHAZO</B>
	 * de la tabla <B>TX_TAX</B>
	 */
	public static final String ID_RECHAZO = "ID_RECHAZO";

	/**
	 * Atributo para manejar el campo <B>ID_RECHAZO</B>
	 * de la tabla <B>ID_RECHAZO</B>
	 */
	private java.lang.Double _ID_RECHAZO;

	/**
	 * Metodo Constructor basico
	 */
	public TX_TAX_Imp() {
		super();
		start();
	}

	/**
	 * Crea un nuevo TX_TAX con los campos de la tabla
	 * @param pOFFSETY java.lang.String;
	 * @param pOFFSETX java.lang.String;
	 * @param pSTORE java.lang.String;
	 * @param pTERMINAL java.lang.String;
	 * @param pTRANSNUM java.lang.String;
	 * @param pDAY java.lang.String;
	 * @param pTIME java.lang.String;
	 * @param pTYPE java.lang.String;
	 * @param pAMTTAXA java.lang.String;
	 * @param pAMTTAXB java.lang.String;
	 * @param pAMTTAXC java.lang.String;
	 * @param pAMTTAXD java.lang.String;
	 * @param pAMTTAXLEA java.lang.String;
	 * @param pAMTTAXLEB java.lang.String;
	 * @param pAMTTAXLEC java.lang.String;
	 * @param pAMTTAXLED java.lang.String;
	 * @param pTIPO java.lang.String;
	 * @param pID_RECHAZO java.lang.Double;
	 */
	public TX_TAX_Imp( java.lang.String pOFFSETY,java.lang.String pOFFSETX,java.lang.String pSTORE,java.lang.String pTERMINAL,java.lang.String pTRANSNUM,java.lang.String pDAY,java.lang.String pTIME,java.lang.String pTYPE,java.lang.String pAMTTAXA,java.lang.String pAMTTAXB,java.lang.String pAMTTAXC,java.lang.String pAMTTAXD,java.lang.String pAMTTAXLEA,java.lang.String pAMTTAXLEB,java.lang.String pAMTTAXLEC,java.lang.String pAMTTAXLED,java.lang.String pTIPO,java.lang.Double pID_RECHAZO) { 
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
		this._ID_RECHAZO = pID_RECHAZO;
	}

	/**
	 * Retorna el valor del atributo OFFSETY.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getOFFSETY(){
			return _OFFSETY;
	}

	/**
	 * Asigna el atributo OFFSETY
	 * Creation date: (11/18/2005
	 * @param newOFFSETY java.lang.String
	 */
	public void setOFFSETY(java.lang.String newOFFSETY) {
		_OFFSETY = newOFFSETY;
	}

	/**
	 * Retorna el valor del atributo OFFSETX.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getOFFSETX(){
			return _OFFSETX;
	}

	/**
	 * Asigna el atributo OFFSETX
	 * Creation date: (11/18/2005
	 * @param newOFFSETX java.lang.String
	 */
	public void setOFFSETX(java.lang.String newOFFSETX) {
		_OFFSETX = newOFFSETX;
	}

	/**
	 * Retorna el valor del atributo STORE.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getSTORE(){
			return _STORE;
	}

	/**
	 * Asigna el atributo STORE
	 * Creation date: (11/18/2005
	 * @param newSTORE java.lang.String
	 */
	public void setSTORE(java.lang.String newSTORE) {
		_STORE = newSTORE;
	}

	/**
	 * Retorna el valor del atributo TERMINAL.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getTERMINAL(){
			return _TERMINAL;
	}

	/**
	 * Asigna el atributo TERMINAL
	 * Creation date: (11/18/2005
	 * @param newTERMINAL java.lang.String
	 */
	public void setTERMINAL(java.lang.String newTERMINAL) {
		_TERMINAL = newTERMINAL;
	}

	/**
	 * Retorna el valor del atributo TRANSNUM.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getTRANSNUM(){
			return _TRANSNUM;
	}

	/**
	 * Asigna el atributo TRANSNUM
	 * Creation date: (11/18/2005
	 * @param newTRANSNUM java.lang.String
	 */
	public void setTRANSNUM(java.lang.String newTRANSNUM) {
		_TRANSNUM = newTRANSNUM;
	}

	/**
	 * Retorna el valor del atributo DAY.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getDAY(){
			return _DAY;
	}

	/**
	 * Asigna el atributo DAY
	 * Creation date: (11/18/2005
	 * @param newDAY java.lang.String
	 */
	public void setDAY(java.lang.String newDAY) {
		_DAY = newDAY;
	}

	/**
	 * Retorna el valor del atributo TIME.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getTIME(){
			return _TIME;
	}

	/**
	 * Asigna el atributo TIME
	 * Creation date: (11/18/2005
	 * @param newTIME java.lang.String
	 */
	public void setTIME(java.lang.String newTIME) {
		_TIME = newTIME;
	}

	/**
	 * Retorna el valor del atributo TYPE.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getTYPE(){
			return _TYPE;
	}

	/**
	 * Asigna el atributo TYPE
	 * Creation date: (11/18/2005
	 * @param newTYPE java.lang.String
	 */
	public void setTYPE(java.lang.String newTYPE) {
		_TYPE = newTYPE;
	}

	/**
	 * Retorna el valor del atributo AMTTAXA.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTAXA(){
			return _AMTTAXA;
	}

	/**
	 * Asigna el atributo AMTTAXA
	 * Creation date: (11/18/2005
	 * @param newAMTTAXA java.lang.String
	 */
	public void setAMTTAXA(java.lang.String newAMTTAXA) {
		_AMTTAXA = newAMTTAXA;
	}

	/**
	 * Retorna el valor del atributo AMTTAXB.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTAXB(){
			return _AMTTAXB;
	}

	/**
	 * Asigna el atributo AMTTAXB
	 * Creation date: (11/18/2005
	 * @param newAMTTAXB java.lang.String
	 */
	public void setAMTTAXB(java.lang.String newAMTTAXB) {
		_AMTTAXB = newAMTTAXB;
	}

	/**
	 * Retorna el valor del atributo AMTTAXC.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTAXC(){
			return _AMTTAXC;
	}

	/**
	 * Asigna el atributo AMTTAXC
	 * Creation date: (11/18/2005
	 * @param newAMTTAXC java.lang.String
	 */
	public void setAMTTAXC(java.lang.String newAMTTAXC) {
		_AMTTAXC = newAMTTAXC;
	}

	/**
	 * Retorna el valor del atributo AMTTAXD.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTAXD(){
			return _AMTTAXD;
	}

	/**
	 * Asigna el atributo AMTTAXD
	 * Creation date: (11/18/2005
	 * @param newAMTTAXD java.lang.String
	 */
	public void setAMTTAXD(java.lang.String newAMTTAXD) {
		_AMTTAXD = newAMTTAXD;
	}

	/**
	 * Retorna el valor del atributo AMTTAXLEA.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTAXLEA(){
			return _AMTTAXLEA;
	}

	/**
	 * Asigna el atributo AMTTAXLEA
	 * Creation date: (11/18/2005
	 * @param newAMTTAXLEA java.lang.String
	 */
	public void setAMTTAXLEA(java.lang.String newAMTTAXLEA) {
		_AMTTAXLEA = newAMTTAXLEA;
	}

	/**
	 * Retorna el valor del atributo AMTTAXLEB.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTAXLEB(){
			return _AMTTAXLEB;
	}

	/**
	 * Asigna el atributo AMTTAXLEB
	 * Creation date: (11/18/2005
	 * @param newAMTTAXLEB java.lang.String
	 */
	public void setAMTTAXLEB(java.lang.String newAMTTAXLEB) {
		_AMTTAXLEB = newAMTTAXLEB;
	}

	/**
	 * Retorna el valor del atributo AMTTAXLEC.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTAXLEC(){
			return _AMTTAXLEC;
	}

	/**
	 * Asigna el atributo AMTTAXLEC
	 * Creation date: (11/18/2005
	 * @param newAMTTAXLEC java.lang.String
	 */
	public void setAMTTAXLEC(java.lang.String newAMTTAXLEC) {
		_AMTTAXLEC = newAMTTAXLEC;
	}

	/**
	 * Retorna el valor del atributo AMTTAXLED.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTAXLED(){
			return _AMTTAXLED;
	}

	/**
	 * Asigna el atributo AMTTAXLED
	 * Creation date: (11/18/2005
	 * @param newAMTTAXLED java.lang.String
	 */
	public void setAMTTAXLED(java.lang.String newAMTTAXLED) {
		_AMTTAXLED = newAMTTAXLED;
	}

	/**
	 * Retorna el valor del atributo TIPO.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getTIPO(){
			return _TIPO;
	}

	/**
	 * Asigna el atributo TIPO
	 * Creation date: (11/18/2005
	 * @param newTIPO java.lang.String
	 */
	public void setTIPO(java.lang.String newTIPO) {
		_TIPO = newTIPO;
	}

	/**
	 * Retorna el valor del atributo ID_RECHAZO.
	 * Creation date: (11/18/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getID_RECHAZO(){
			return _ID_RECHAZO;
	}

	/**
	 * Asigna el atributo ID_RECHAZO
	 * Creation date: (11/18/2005
	 * @param newID_RECHAZO java.lang.Double
	 */
	public void setID_RECHAZO(java.lang.Double newID_RECHAZO) {
		_ID_RECHAZO = newID_RECHAZO;
	}

	/**
	 * Retorna el nombre de la tabla TX_TAX
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TX_TAX
	 */
	public void start() {
		String _fields[] = {OFFSETY,OFFSETX,STORE,TERMINAL,TRANSNUM,DAY,TIME,TYPE,AMTTAXA,AMTTAXB,AMTTAXC,AMTTAXD,AMTTAXLEA,AMTTAXLEB,AMTTAXLEC,AMTTAXLED,TIPO,ID_RECHAZO};
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
		} else if (field.equals(ID_RECHAZO)) {
			return _ID_RECHAZO;
		}
		return null;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public void setValueField(String field, Object value) { 
	  if(value!=null){
		if (field.equals(OFFSETY)) {
			setOFFSETY((java.lang.String) value );
		} else if (field.equals(OFFSETX)) {
			setOFFSETX((java.lang.String) value );
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
		} else if (field.equals(TYPE)) {
			setTYPE((java.lang.String) value );
		} else if (field.equals(AMTTAXA)) {
			setAMTTAXA((java.lang.String) value );
		} else if (field.equals(AMTTAXB)) {
			setAMTTAXB((java.lang.String) value );
		} else if (field.equals(AMTTAXC)) {
			setAMTTAXC((java.lang.String) value );
		} else if (field.equals(AMTTAXD)) {
			setAMTTAXD((java.lang.String) value );
		} else if (field.equals(AMTTAXLEA)) {
			setAMTTAXLEA((java.lang.String) value );
		} else if (field.equals(AMTTAXLEB)) {
			setAMTTAXLEB((java.lang.String) value );
		} else if (field.equals(AMTTAXLEC)) {
			setAMTTAXLEC((java.lang.String) value );
		} else if (field.equals(AMTTAXLED)) {
			setAMTTAXLED((java.lang.String) value );
		} else if (field.equals(TIPO)) {
			setTIPO((java.lang.String) value );
		} else if (field.equals(ID_RECHAZO)) {
			setID_RECHAZO((java.lang.Double) value );
		}
	  }

	}
	/**
	 * Retorna un array con los tipos de datos de la BD, es usado para los prepared statement
	 * @return Retorna array de enteros con el tipo de dato en BD cada uno de los atributos
	 */
	public int getSQLFieldType(String field) {
		if (field.equals(OFFSETY)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(OFFSETX)) {
			return java.sql.Types.VARCHAR;
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
		} else if (field.equals(TYPE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTAXA)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTAXB)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTAXC)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTAXD)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTAXLEA)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTAXLEB)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTAXLEC)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTAXLED)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TIPO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ID_RECHAZO)) {
			return java.sql.Types.DECIMAL;
		}
		return 0;
	}
}
