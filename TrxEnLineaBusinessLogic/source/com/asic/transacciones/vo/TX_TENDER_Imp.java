package com.asic.transacciones.vo;
/**
 * @(#) TX_TENDER.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 18/11/2005
 */ 

/**
 * Clase que permite acceso a la tabla TX_TENDER y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TX_TENDER_Imp extends jdao.data.DataAdv implements TX_TENDER, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TX_TENDER</B>
	 */
	public static final String NAME = "TX_TENDER";
	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETY</B>
	 * de la tabla <B>TX_TENDER</B>
	 */
	public static final String OFFSETY = "OFFSETY";

	/**
	 * Atributo para manejar el campo <B>OFFSETY</B>
	 * de la tabla <B>OFFSETY</B>
	 */
	private java.lang.String _OFFSETY;

	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETX</B>
	 * de la tabla <B>TX_TENDER</B>
	 */
	public static final String OFFSETX = "OFFSETX";

	/**
	 * Atributo para manejar el campo <B>OFFSETX</B>
	 * de la tabla <B>OFFSETX</B>
	 */
	private java.lang.String _OFFSETX;

	/**
	 * Atributo que contiene el nombre del campo <B>STORE</B>
	 * de la tabla <B>TX_TENDER</B>
	 */
	public static final String STORE = "STORE";

	/**
	 * Atributo para manejar el campo <B>STORE</B>
	 * de la tabla <B>STORE</B>
	 */
	private java.lang.String _STORE;

	/**
	 * Atributo que contiene el nombre del campo <B>TERMINAL</B>
	 * de la tabla <B>TX_TENDER</B>
	 */
	public static final String TERMINAL = "TERMINAL";

	/**
	 * Atributo para manejar el campo <B>TERMINAL</B>
	 * de la tabla <B>TERMINAL</B>
	 */
	private java.lang.String _TERMINAL;

	/**
	 * Atributo que contiene el nombre del campo <B>TRANSNUM</B>
	 * de la tabla <B>TX_TENDER</B>
	 */
	public static final String TRANSNUM = "TRANSNUM";

	/**
	 * Atributo para manejar el campo <B>TRANSNUM</B>
	 * de la tabla <B>TRANSNUM</B>
	 */
	private java.lang.String _TRANSNUM;

	/**
	 * Atributo que contiene el nombre del campo <B>DAY</B>
	 * de la tabla <B>TX_TENDER</B>
	 */
	public static final String DAY = "DAY";

	/**
	 * Atributo para manejar el campo <B>DAY</B>
	 * de la tabla <B>DAY</B>
	 */
	private java.lang.String _DAY;

	/**
	 * Atributo que contiene el nombre del campo <B>TIME</B>
	 * de la tabla <B>TX_TENDER</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.lang.String _TIME;

	/**
	 * Atributo que contiene el nombre del campo <B>TYPE</B>
	 * de la tabla <B>TX_TENDER</B>
	 */
	public static final String TYPE = "TYPE";

	/**
	 * Atributo para manejar el campo <B>TYPE</B>
	 * de la tabla <B>TYPE</B>
	 */
	private java.lang.String _TYPE;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYPE</B>
	 * de la tabla <B>TX_TENDER</B>
	 */
	public static final String TENDTYPE = "TENDTYPE";

	/**
	 * Atributo para manejar el campo <B>TENDTYPE</B>
	 * de la tabla <B>TENDTYPE</B>
	 */
	private java.lang.String _TENDTYPE;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTENDE</B>
	 * de la tabla <B>TX_TENDER</B>
	 */
	public static final String AMTTENDE = "AMTTENDE";

	/**
	 * Atributo para manejar el campo <B>AMTTENDE</B>
	 * de la tabla <B>AMTTENDE</B>
	 */
	private java.lang.String _AMTTENDE;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTNFEE</B>
	 * de la tabla <B>TX_TENDER</B>
	 */
	public static final String AMTTNFEE = "AMTTNFEE";

	/**
	 * Atributo para manejar el campo <B>AMTTNFEE</B>
	 * de la tabla <B>AMTTNFEE</B>
	 */
	private java.lang.String _AMTTNFEE;

	/**
	 * Atributo que contiene el nombre del campo <B>CUSTOMER</B>
	 * de la tabla <B>TX_TENDER</B>
	 */
	public static final String CUSTOMER = "CUSTOMER";

	/**
	 * Atributo para manejar el campo <B>CUSTOMER</B>
	 * de la tabla <B>CUSTOMER</B>
	 */
	private java.lang.String _CUSTOMER;

	/**
	 * Atributo que contiene el nombre del campo <B>STATUS</B>
	 * de la tabla <B>TX_TENDER</B>
	 */
	public static final String STATUS = "STATUS";

	/**
	 * Atributo para manejar el campo <B>STATUS</B>
	 * de la tabla <B>STATUS</B>
	 */
	private java.lang.String _STATUS;

	/**
	 * Atributo que contiene el nombre del campo <B>TIPO</B>
	 * de la tabla <B>TX_TENDER</B>
	 */
	public static final String TIPO = "TIPO";

	/**
	 * Atributo para manejar el campo <B>TIPO</B>
	 * de la tabla <B>TIPO</B>
	 */
	private java.lang.String _TIPO;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_RECHAZO</B>
	 * de la tabla <B>TX_TENDER</B>
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
	public TX_TENDER_Imp() {
		super();
		start();
	}

	/**
	 * Crea un nuevo TX_TENDER con los campos de la tabla
	 * @param pOFFSETY java.lang.String;
	 * @param pOFFSETX java.lang.String;
	 * @param pSTORE java.lang.String;
	 * @param pTERMINAL java.lang.String;
	 * @param pTRANSNUM java.lang.String;
	 * @param pDAY java.lang.String;
	 * @param pTIME java.lang.String;
	 * @param pTYPE java.lang.String;
	 * @param pTENDTYPE java.lang.String;
	 * @param pAMTTENDE java.lang.String;
	 * @param pAMTTNFEE java.lang.String;
	 * @param pCUSTOMER java.lang.String;
	 * @param pSTATUS java.lang.String;
	 * @param pTIPO java.lang.String;
	 * @param pID_RECHAZO java.lang.Double;
	 */
	public TX_TENDER_Imp( java.lang.String pOFFSETY,java.lang.String pOFFSETX,java.lang.String pSTORE,java.lang.String pTERMINAL,java.lang.String pTRANSNUM,java.lang.String pDAY,java.lang.String pTIME,java.lang.String pTYPE,java.lang.String pTENDTYPE,java.lang.String pAMTTENDE,java.lang.String pAMTTNFEE,java.lang.String pCUSTOMER,java.lang.String pSTATUS,java.lang.String pTIPO,java.lang.Double pID_RECHAZO) { 
		this._OFFSETY = pOFFSETY;
		this._OFFSETX = pOFFSETX;
		this._STORE = pSTORE;
		this._TERMINAL = pTERMINAL;
		this._TRANSNUM = pTRANSNUM;
		this._DAY = pDAY;
		this._TIME = pTIME;
		this._TYPE = pTYPE;
		this._TENDTYPE = pTENDTYPE;
		this._AMTTENDE = pAMTTENDE;
		this._AMTTNFEE = pAMTTNFEE;
		this._CUSTOMER = pCUSTOMER;
		this._STATUS = pSTATUS;
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
	 * Retorna el valor del atributo TENDTYPE.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYPE(){
			return _TENDTYPE;
	}

	/**
	 * Asigna el atributo TENDTYPE
	 * Creation date: (11/18/2005
	 * @param newTENDTYPE java.lang.String
	 */
	public void setTENDTYPE(java.lang.String newTENDTYPE) {
		_TENDTYPE = newTENDTYPE;
	}

	/**
	 * Retorna el valor del atributo AMTTENDE.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTENDE(){
			return _AMTTENDE;
	}

	/**
	 * Asigna el atributo AMTTENDE
	 * Creation date: (11/18/2005
	 * @param newAMTTENDE java.lang.String
	 */
	public void setAMTTENDE(java.lang.String newAMTTENDE) {
		_AMTTENDE = newAMTTENDE;
	}

	/**
	 * Retorna el valor del atributo AMTTNFEE.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTNFEE(){
			return _AMTTNFEE;
	}

	/**
	 * Asigna el atributo AMTTNFEE
	 * Creation date: (11/18/2005
	 * @param newAMTTNFEE java.lang.String
	 */
	public void setAMTTNFEE(java.lang.String newAMTTNFEE) {
		_AMTTNFEE = newAMTTNFEE;
	}

	/**
	 * Retorna el valor del atributo CUSTOMER.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getCUSTOMER(){
			return _CUSTOMER;
	}

	/**
	 * Asigna el atributo CUSTOMER
	 * Creation date: (11/18/2005
	 * @param newCUSTOMER java.lang.String
	 */
	public void setCUSTOMER(java.lang.String newCUSTOMER) {
		_CUSTOMER = newCUSTOMER;
	}

	/**
	 * Retorna el valor del atributo STATUS.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getSTATUS(){
			return _STATUS;
	}

	/**
	 * Asigna el atributo STATUS
	 * Creation date: (11/18/2005
	 * @param newSTATUS java.lang.String
	 */
	public void setSTATUS(java.lang.String newSTATUS) {
		_STATUS = newSTATUS;
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
	 * Retorna el nombre de la tabla TX_TENDER
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TX_TENDER
	 */
	public void start() {
		String _fields[] = {OFFSETY,OFFSETX,STORE,TERMINAL,TRANSNUM,DAY,TIME,TYPE,TENDTYPE,AMTTENDE,AMTTNFEE,CUSTOMER,STATUS,TIPO,ID_RECHAZO};
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
		} else if (field.equals(TENDTYPE)) {
			return _TENDTYPE;
		} else if (field.equals(AMTTENDE)) {
			return _AMTTENDE;
		} else if (field.equals(AMTTNFEE)) {
			return _AMTTNFEE;
		} else if (field.equals(CUSTOMER)) {
			return _CUSTOMER;
		} else if (field.equals(STATUS)) {
			return _STATUS;
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
		} else if (field.equals(TENDTYPE)) {
			setTENDTYPE((java.lang.String) value );
		} else if (field.equals(AMTTENDE)) {
			setAMTTENDE((java.lang.String) value );
		} else if (field.equals(AMTTNFEE)) {
			setAMTTNFEE((java.lang.String) value );
		} else if (field.equals(CUSTOMER)) {
			setCUSTOMER((java.lang.String) value );
		} else if (field.equals(STATUS)) {
			setSTATUS((java.lang.String) value );
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
		} else if (field.equals(TENDTYPE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTENDE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTNFEE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(CUSTOMER)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(STATUS)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TIPO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ID_RECHAZO)) {
			return java.sql.Types.DECIMAL;
		}
		return 0;
	}
}
