package com.asic.transacciones.vo;


/**
 * @(#) TX_DATA_ENTRY.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 18/11/2005
 */ 

/**
 * Clase que permite acceso a la tabla TX_DATA_ENTRY y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TX_DATA_ENTRY_Imp extends jdao.data.DataAdv implements TX_DATA_ENTRY, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String NAME = "TX_DATA_ENTRY";
	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETY</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String OFFSETY = "OFFSETY";

	/**
	 * Atributo para manejar el campo <B>OFFSETY</B>
	 * de la tabla <B>OFFSETY</B>
	 */
	private java.lang.String _OFFSETY;

	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETX</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String OFFSETX = "OFFSETX";

	/**
	 * Atributo para manejar el campo <B>OFFSETX</B>
	 * de la tabla <B>OFFSETX</B>
	 */
	private java.lang.String _OFFSETX;

	/**
	 * Atributo que contiene el nombre del campo <B>STORE</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String STORE = "STORE";

	/**
	 * Atributo para manejar el campo <B>STORE</B>
	 * de la tabla <B>STORE</B>
	 */
	private java.lang.String _STORE;

	/**
	 * Atributo que contiene el nombre del campo <B>TERMINAL</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String TERMINAL = "TERMINAL";

	/**
	 * Atributo para manejar el campo <B>TERMINAL</B>
	 * de la tabla <B>TERMINAL</B>
	 */
	private java.lang.String _TERMINAL;

	/**
	 * Atributo que contiene el nombre del campo <B>TRANSNUM</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String TRANSNUM = "TRANSNUM";

	/**
	 * Atributo para manejar el campo <B>TRANSNUM</B>
	 * de la tabla <B>TRANSNUM</B>
	 */
	private java.lang.String _TRANSNUM;

	/**
	 * Atributo que contiene el nombre del campo <B>DAY</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String DAY = "DAY";

	/**
	 * Atributo para manejar el campo <B>DAY</B>
	 * de la tabla <B>DAY</B>
	 */
	private java.lang.String _DAY;

	/**
	 * Atributo que contiene el nombre del campo <B>TIME</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.lang.String _TIME;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA1</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String DATA1 = "DATA1";

	/**
	 * Atributo para manejar el campo <B>DATA1</B>
	 * de la tabla <B>DATA1</B>
	 */
	private java.lang.String _DATA1;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA2</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String DATA2 = "DATA2";

	/**
	 * Atributo para manejar el campo <B>DATA2</B>
	 * de la tabla <B>DATA2</B>
	 */
	private java.lang.String _DATA2;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA3</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String DATA3 = "DATA3";

	/**
	 * Atributo para manejar el campo <B>DATA3</B>
	 * de la tabla <B>DATA3</B>
	 */
	private java.lang.String _DATA3;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA4</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String DATA4 = "DATA4";

	/**
	 * Atributo para manejar el campo <B>DATA4</B>
	 * de la tabla <B>DATA4</B>
	 */
	private java.lang.String _DATA4;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA5</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String DATA5 = "DATA5";

	/**
	 * Atributo para manejar el campo <B>DATA5</B>
	 * de la tabla <B>DATA5</B>
	 */
	private java.lang.String _DATA5;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA6</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String DATA6 = "DATA6";

	/**
	 * Atributo para manejar el campo <B>DATA6</B>
	 * de la tabla <B>DATA6</B>
	 */
	private java.lang.String _DATA6;

	/**
	 * Atributo que contiene el nombre del campo <B>TIPO</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
	 */
	public static final String TIPO = "TIPO";

	/**
	 * Atributo para manejar el campo <B>TIPO</B>
	 * de la tabla <B>TIPO</B>
	 */
	private java.lang.String _TIPO;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_RECHAZO</B>
	 * de la tabla <B>TX_DATA_ENTRY</B>
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
	public TX_DATA_ENTRY_Imp() {
		super();
		start();
	}

	/**
	 * Crea un nuevo TX_DATA_ENTRY con los campos de la tabla
	 * @param pOFFSETY java.lang.String;
	 * @param pOFFSETX java.lang.String;
	 * @param pSTORE java.lang.String;
	 * @param pTERMINAL java.lang.String;
	 * @param pTRANSNUM java.lang.String;
	 * @param pDAY java.lang.String;
	 * @param pTIME java.lang.String;
	 * @param pDATA1 java.lang.String;
	 * @param pDATA2 java.lang.String;
	 * @param pDATA3 java.lang.String;
	 * @param pDATA4 java.lang.String;
	 * @param pDATA5 java.lang.String;
	 * @param pDATA6 java.lang.String;
	 * @param pTIPO java.lang.String;
	 * @param pID_RECHAZO java.lang.Double;
	 */
	public TX_DATA_ENTRY_Imp( java.lang.String pOFFSETY,java.lang.String pOFFSETX,java.lang.String pSTORE,java.lang.String pTERMINAL,java.lang.String pTRANSNUM,java.lang.String pDAY,java.lang.String pTIME,java.lang.String pDATA1,java.lang.String pDATA2,java.lang.String pDATA3,java.lang.String pDATA4,java.lang.String pDATA5,java.lang.String pDATA6,java.lang.String pTIPO,java.lang.Double pID_RECHAZO) { 
		this._OFFSETY = pOFFSETY;
		this._OFFSETX = pOFFSETX;
		this._STORE = pSTORE;
		this._TERMINAL = pTERMINAL;
		this._TRANSNUM = pTRANSNUM;
		this._DAY = pDAY;
		this._TIME = pTIME;
		this._DATA1 = pDATA1;
		this._DATA2 = pDATA2;
		this._DATA3 = pDATA3;
		this._DATA4 = pDATA4;
		this._DATA5 = pDATA5;
		this._DATA6 = pDATA6;
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
	 * Retorna el valor del atributo DATA1.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getDATA1(){
			return _DATA1;
	}

	/**
	 * Asigna el atributo DATA1
	 * Creation date: (11/18/2005
	 * @param newDATA1 java.lang.String
	 */
	public void setDATA1(java.lang.String newDATA1) {
		_DATA1 = newDATA1;
	}

	/**
	 * Retorna el valor del atributo DATA2.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getDATA2(){
			return _DATA2;
	}

	/**
	 * Asigna el atributo DATA2
	 * Creation date: (11/18/2005
	 * @param newDATA2 java.lang.String
	 */
	public void setDATA2(java.lang.String newDATA2) {
		_DATA2 = newDATA2;
	}

	/**
	 * Retorna el valor del atributo DATA3.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getDATA3(){
			return _DATA3;
	}

	/**
	 * Asigna el atributo DATA3
	 * Creation date: (11/18/2005
	 * @param newDATA3 java.lang.String
	 */
	public void setDATA3(java.lang.String newDATA3) {
		_DATA3 = newDATA3;
	}

	/**
	 * Retorna el valor del atributo DATA4.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getDATA4(){
			return _DATA4;
	}

	/**
	 * Asigna el atributo DATA4
	 * Creation date: (11/18/2005
	 * @param newDATA4 java.lang.String
	 */
	public void setDATA4(java.lang.String newDATA4) {
		_DATA4 = newDATA4;
	}

	/**
	 * Retorna el valor del atributo DATA5.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getDATA5(){
			return _DATA5;
	}

	/**
	 * Asigna el atributo DATA5
	 * Creation date: (11/18/2005
	 * @param newDATA5 java.lang.String
	 */
	public void setDATA5(java.lang.String newDATA5) {
		_DATA5 = newDATA5;
	}

	/**
	 * Retorna el valor del atributo DATA6.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getDATA6(){
			return _DATA6;
	}

	/**
	 * Asigna el atributo DATA6
	 * Creation date: (11/18/2005
	 * @param newDATA6 java.lang.String
	 */
	public void setDATA6(java.lang.String newDATA6) {
		_DATA6 = newDATA6;
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
	 * Retorna el nombre de la tabla TX_DATA_ENTRY
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TX_DATA_ENTRY
	 */
	public void start() {
		String _fields[] = {OFFSETY,OFFSETX,STORE,TERMINAL,TRANSNUM,DAY,TIME,DATA1,DATA2,DATA3,DATA4,DATA5,DATA6,TIPO,ID_RECHAZO};
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
		} else if (field.equals(DATA1)) {
			return _DATA1;
		} else if (field.equals(DATA2)) {
			return _DATA2;
		} else if (field.equals(DATA3)) {
			return _DATA3;
		} else if (field.equals(DATA4)) {
			return _DATA4;
		} else if (field.equals(DATA5)) {
			return _DATA5;
		} else if (field.equals(DATA6)) {
			return _DATA6;
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
		} else if (field.equals(DATA1)) {
			setDATA1((java.lang.String) value );
		} else if (field.equals(DATA2)) {
			setDATA2((java.lang.String) value );
		} else if (field.equals(DATA3)) {
			setDATA3((java.lang.String) value );
		} else if (field.equals(DATA4)) {
			setDATA4((java.lang.String) value );
		} else if (field.equals(DATA5)) {
			setDATA5((java.lang.String) value );
		} else if (field.equals(DATA6)) {
			setDATA6((java.lang.String) value );
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
		} else if (field.equals(DATA1)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA2)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA3)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA4)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA5)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA6)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TIPO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ID_RECHAZO)) {
			return java.sql.Types.DECIMAL;
		}
		return 0;
	}
}
