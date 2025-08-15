package com.asic.transacciones.vo;
/**
 * @(#) TX_DISCOUNT.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 18/11/2005
 */ 

/**
 * Clase que permite acceso a la tabla TX_DISCOUNT y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TX_DISCOUNT_Imp extends jdao.data.DataAdv implements TX_DISCOUNT, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TX_DISCOUNT</B>
	 */
	public static final String NAME = "TX_DISCOUNT";
	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETY</B>
	 * de la tabla <B>TX_DISCOUNT</B>
	 */
	public static final String OFFSETY = "OFFSETY";

	/**
	 * Atributo para manejar el campo <B>OFFSETY</B>
	 * de la tabla <B>OFFSETY</B>
	 */
	private java.lang.String _OFFSETY;

	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETX</B>
	 * de la tabla <B>TX_DISCOUNT</B>
	 */
	public static final String OFFSETX = "OFFSETX";

	/**
	 * Atributo para manejar el campo <B>OFFSETX</B>
	 * de la tabla <B>OFFSETX</B>
	 */
	private java.lang.String _OFFSETX;

	/**
	 * Atributo que contiene el nombre del campo <B>STORE</B>
	 * de la tabla <B>TX_DISCOUNT</B>
	 */
	public static final String STORE = "STORE";

	/**
	 * Atributo para manejar el campo <B>STORE</B>
	 * de la tabla <B>STORE</B>
	 */
	private java.lang.String _STORE;

	/**
	 * Atributo que contiene el nombre del campo <B>TERMINAL</B>
	 * de la tabla <B>TX_DISCOUNT</B>
	 */
	public static final String TERMINAL = "TERMINAL";

	/**
	 * Atributo para manejar el campo <B>TERMINAL</B>
	 * de la tabla <B>TERMINAL</B>
	 */
	private java.lang.String _TERMINAL;

	/**
	 * Atributo que contiene el nombre del campo <B>TRANSNUM</B>
	 * de la tabla <B>TX_DISCOUNT</B>
	 */
	public static final String TRANSNUM = "TRANSNUM";

	/**
	 * Atributo para manejar el campo <B>TRANSNUM</B>
	 * de la tabla <B>TRANSNUM</B>
	 */
	private java.lang.String _TRANSNUM;

	/**
	 * Atributo que contiene el nombre del campo <B>DAY</B>
	 * de la tabla <B>TX_DISCOUNT</B>
	 */
	public static final String DAY = "DAY";

	/**
	 * Atributo para manejar el campo <B>DAY</B>
	 * de la tabla <B>DAY</B>
	 */
	private java.lang.String _DAY;

	/**
	 * Atributo que contiene el nombre del campo <B>TIME</B>
	 * de la tabla <B>TX_DISCOUNT</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.lang.String _TIME;

	/**
	 * Atributo que contiene el nombre del campo <B>TYPE</B>
	 * de la tabla <B>TX_DISCOUNT</B>
	 */
	public static final String TYPE = "TYPE";

	/**
	 * Atributo para manejar el campo <B>TYPE</B>
	 * de la tabla <B>TYPE</B>
	 */
	private java.lang.String _TYPE;

	/**
	 * Atributo que contiene el nombre del campo <B>DISGROUP</B>
	 * de la tabla <B>TX_DISCOUNT</B>
	 */
	public static final String DISGROUP = "DISGROUP";

	/**
	 * Atributo para manejar el campo <B>DISGROUP</B>
	 * de la tabla <B>DISGROUP</B>
	 */
	private java.lang.String _DISGROUP;

	/**
	 * Atributo que contiene el nombre del campo <B>DISRATE</B>
	 * de la tabla <B>TX_DISCOUNT</B>
	 */
	public static final String DISRATE = "DISRATE";

	/**
	 * Atributo para manejar el campo <B>DISRATE</B>
	 * de la tabla <B>DISRATE</B>
	 */
	private java.lang.String _DISRATE;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTDISCO</B>
	 * de la tabla <B>TX_DISCOUNT</B>
	 */
	public static final String AMTDISCO = "AMTDISCO";

	/**
	 * Atributo para manejar el campo <B>AMTDISCO</B>
	 * de la tabla <B>AMTDISCO</B>
	 */
	private java.lang.String _AMTDISCO;

	/**
	 * Atributo que contiene el nombre del campo <B>TAXEXEMP</B>
	 * de la tabla <B>TX_DISCOUNT</B>
	 */
	public static final String TAXEXEMP = "TAXEXEMP";

	/**
	 * Atributo para manejar el campo <B>TAXEXEMP</B>
	 * de la tabla <B>TAXEXEMP</B>
	 */
	private java.lang.String _TAXEXEMP;

	/**
	 * Atributo que contiene el nombre del campo <B>TIPO</B>
	 * de la tabla <B>TX_DISCOUNT</B>
	 */
	public static final String TIPO = "TIPO";

	/**
	 * Atributo para manejar el campo <B>TIPO</B>
	 * de la tabla <B>TIPO</B>
	 */
	private java.lang.String _TIPO;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_RECHAZO</B>
	 * de la tabla <B>TX_DISCOUNT</B>
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
	public TX_DISCOUNT_Imp() {
		super();
		start();
	}

	/**
	 * Crea un nuevo TX_DISCOUNT con los campos de la tabla
	 * @param pOFFSETY java.lang.String;
	 * @param pOFFSETX java.lang.String;
	 * @param pSTORE java.lang.String;
	 * @param pTERMINAL java.lang.String;
	 * @param pTRANSNUM java.lang.String;
	 * @param pDAY java.lang.String;
	 * @param pTIME java.lang.String;
	 * @param pTYPE java.lang.String;
	 * @param pDISGROUP java.lang.String;
	 * @param pDISRATE java.lang.String;
	 * @param pAMTDISCO java.lang.String;
	 * @param pTAXEXEMP java.lang.String;
	 * @param pTIPO java.lang.String;
	 * @param pID_RECHAZO java.lang.Double;
	 */
	public TX_DISCOUNT_Imp( java.lang.String pOFFSETY,java.lang.String pOFFSETX,java.lang.String pSTORE,java.lang.String pTERMINAL,java.lang.String pTRANSNUM,java.lang.String pDAY,java.lang.String pTIME,java.lang.String pTYPE,java.lang.String pDISGROUP,java.lang.String pDISRATE,java.lang.String pAMTDISCO,java.lang.String pTAXEXEMP,java.lang.String pTIPO,java.lang.Double pID_RECHAZO) { 
		this._OFFSETY = pOFFSETY;
		this._OFFSETX = pOFFSETX;
		this._STORE = pSTORE;
		this._TERMINAL = pTERMINAL;
		this._TRANSNUM = pTRANSNUM;
		this._DAY = pDAY;
		this._TIME = pTIME;
		this._TYPE = pTYPE;
		this._DISGROUP = pDISGROUP;
		this._DISRATE = pDISRATE;
		this._AMTDISCO = pAMTDISCO;
		this._TAXEXEMP = pTAXEXEMP;
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
	 * Retorna el valor del atributo DISGROUP.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getDISGROUP(){
			return _DISGROUP;
	}

	/**
	 * Asigna el atributo DISGROUP
	 * Creation date: (11/18/2005
	 * @param newDISGROUP java.lang.String
	 */
	public void setDISGROUP(java.lang.String newDISGROUP) {
		_DISGROUP = newDISGROUP;
	}

	/**
	 * Retorna el valor del atributo DISRATE.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getDISRATE(){
			return _DISRATE;
	}

	/**
	 * Asigna el atributo DISRATE
	 * Creation date: (11/18/2005
	 * @param newDISRATE java.lang.String
	 */
	public void setDISRATE(java.lang.String newDISRATE) {
		_DISRATE = newDISRATE;
	}

	/**
	 * Retorna el valor del atributo AMTDISCO.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getAMTDISCO(){
			return _AMTDISCO;
	}

	/**
	 * Asigna el atributo AMTDISCO
	 * Creation date: (11/18/2005
	 * @param newAMTDISCO java.lang.String
	 */
	public void setAMTDISCO(java.lang.String newAMTDISCO) {
		_AMTDISCO = newAMTDISCO;
	}

	/**
	 * Retorna el valor del atributo TAXEXEMP.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getTAXEXEMP(){
			return _TAXEXEMP;
	}

	/**
	 * Asigna el atributo TAXEXEMP
	 * Creation date: (11/18/2005
	 * @param newTAXEXEMP java.lang.String
	 */
	public void setTAXEXEMP(java.lang.String newTAXEXEMP) {
		_TAXEXEMP = newTAXEXEMP;
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
	 * Retorna el nombre de la tabla TX_DISCOUNT
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TX_DISCOUNT
	 */
	public void start() {
		String _fields[] = {OFFSETY,OFFSETX,STORE,TERMINAL,TRANSNUM,DAY,TIME,TYPE,DISGROUP,DISRATE,AMTDISCO,TAXEXEMP,TIPO,ID_RECHAZO};
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
		} else if (field.equals(DISGROUP)) {
			return _DISGROUP;
		} else if (field.equals(DISRATE)) {
			return _DISRATE;
		} else if (field.equals(AMTDISCO)) {
			return _AMTDISCO;
		} else if (field.equals(TAXEXEMP)) {
			return _TAXEXEMP;
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
		} else if (field.equals(DISGROUP)) {
			setDISGROUP((java.lang.String) value );
		} else if (field.equals(DISRATE)) {
			setDISRATE((java.lang.String) value );
		} else if (field.equals(AMTDISCO)) {
			setAMTDISCO((java.lang.String) value );
		} else if (field.equals(TAXEXEMP)) {
			setTAXEXEMP((java.lang.String) value );
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
		} else if (field.equals(DISGROUP)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DISRATE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTDISCO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TAXEXEMP)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TIPO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ID_RECHAZO)) {
			return java.sql.Types.DECIMAL;
		}
		return 0;
	}
}
