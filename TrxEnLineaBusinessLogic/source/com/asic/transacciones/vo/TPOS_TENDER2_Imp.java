package com.asic.transacciones.vo;
/**
 * @(#) TPOS_TENDER.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 15/12/2005
 */ 

/**
 * Clase que permite acceso a la tabla TPOS_TENDER y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TPOS_TENDER2_Imp extends jdao.data.DataAdv implements TPOS_TENDER2, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TPOS_TENDER</B>
	 */
	public static final String NAME = "TPOS_TENDER";
	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETY</B>
	 * de la tabla <B>TPOS_TENDER</B>
	 */
	public static final String OFFSETY = "OFFSETY";

	/**
	 * Atributo para manejar el campo <B>OFFSETY</B>
	 * de la tabla <B>OFFSETY</B>
	 */
	private java.lang.Double _OFFSETY;

	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETX</B>
	 * de la tabla <B>TPOS_TENDER</B>
	 */
	public static final String OFFSETX = "OFFSETX";

	/**
	 * Atributo para manejar el campo <B>OFFSETX</B>
	 * de la tabla <B>OFFSETX</B>
	 */
	private java.lang.Double _OFFSETX;

	/**
	 * Atributo que contiene el nombre del campo <B>STORE</B>
	 * de la tabla <B>TPOS_TENDER</B>
	 */
	public static final String STORE = "STORE";

	/**
	 * Atributo para manejar el campo <B>STORE</B>
	 * de la tabla <B>STORE</B>
	 */
	private java.lang.Double _STORE;

	/**
	 * Atributo que contiene el nombre del campo <B>TERMINAL</B>
	 * de la tabla <B>TPOS_TENDER</B>
	 */
	public static final String TERMINAL = "TERMINAL";

	/**
	 * Atributo para manejar el campo <B>TERMINAL</B>
	 * de la tabla <B>TERMINAL</B>
	 */
	private java.lang.Double _TERMINAL;

	/**
	 * Atributo que contiene el nombre del campo <B>TRANSNUM</B>
	 * de la tabla <B>TPOS_TENDER</B>
	 */
	public static final String TRANSNUM = "TRANSNUM";

	/**
	 * Atributo para manejar el campo <B>TRANSNUM</B>
	 * de la tabla <B>TRANSNUM</B>
	 */
	private java.lang.Double _TRANSNUM;

	/**
	 * Atributo que contiene el nombre del campo <B>DAY</B>
	 * de la tabla <B>TPOS_TENDER</B>
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
	 * de la tabla <B>TPOS_TENDER</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.lang.Double _TIME;

	/**
	 * Atributo que contiene el nombre del campo <B>TYPE</B>
	 * de la tabla <B>TPOS_TENDER</B>
	 */
	public static final String TYPE = "TYPE";

	/**
	 * Atributo para manejar el campo <B>TYPE</B>
	 * de la tabla <B>TYPE</B>
	 */
	private java.lang.Double _TYPE;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYPE</B>
	 * de la tabla <B>TPOS_TENDER</B>
	 */
	public static final String TENDTYPE = "TENDTYPE";

	/**
	 * Atributo para manejar el campo <B>TENDTYPE</B>
	 * de la tabla <B>TENDTYPE</B>
	 */
	private java.lang.Double _TENDTYPE;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTENDE</B>
	 * de la tabla <B>TPOS_TENDER</B>
	 */
	public static final String AMTTENDE = "AMTTENDE";

	/**
	 * Atributo para manejar el campo <B>AMTTENDE</B>
	 * de la tabla <B>AMTTENDE</B>
	 */
	private java.lang.Double _AMTTENDE;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTNFEE</B>
	 * de la tabla <B>TPOS_TENDER</B>
	 */
	public static final String AMTTNFEE = "AMTTNFEE";

	/**
	 * Atributo para manejar el campo <B>AMTTNFEE</B>
	 * de la tabla <B>AMTTNFEE</B>
	 */
	private java.lang.Double _AMTTNFEE;



	/**
	 * Atributo que contiene el nombre del campo <B>STATUS</B>
	 * de la tabla <B>TPOS_TENDER</B>
	 */
	public static final String STATUS = "STATUS";

	/**
	 * Atributo para manejar el campo <B>STATUS</B>
	 * de la tabla <B>STATUS</B>
	 */
	private java.lang.Double _STATUS;

	/**
	 * Atributo que contiene el nombre del campo <B>TIPO</B>
	 * de la tabla <B>TPOS_TENDER</B>
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
	public TPOS_TENDER2_Imp() {
		super();
		start();
	}

	/**
	 * Crea un nuevo TPOS_TENDER con los campos de la tabla
	 * @param pOFFSETY java.lang.Double;
	 * @param pOFFSETX java.lang.Double;
	 * @param pSTORE java.lang.Double;
	 * @param pTERMINAL java.lang.Double;
	 * @param pTRANSNUM java.lang.Double;
	 * @param pDAY java.sql.Timestamp;
	 * @param pTIME java.lang.Double;
	 * @param pTYPE java.lang.Double;
	 * @param pTENDTYPE java.lang.Double;
	 * @param pAMTTENDE java.lang.Double;
	 * @param pAMTTNFEE java.lang.Double;
	 * @param pSTATUS java.lang.Double;
	 * @param pTIPO java.lang.String;
	 */
	public TPOS_TENDER2_Imp( java.lang.Double pOFFSETY,java.lang.Double pOFFSETX,java.lang.Double pSTORE,java.lang.Double pTERMINAL,java.lang.Double pTRANSNUM,java.sql.Timestamp pDAY,java.lang.Double pTIME,java.lang.Double pTYPE,java.lang.Double pTENDTYPE,java.lang.Double pAMTTENDE,java.lang.Double pAMTTNFEE,java.lang.Double pSTATUS,java.lang.String pTIPO, java.sql.Timestamp pFECHAHORA) { 
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
		this._STATUS = pSTATUS;
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
	 * @return java.lang.Double
	 */
	public java.lang.Double getTIME(){
			return _TIME;
	}

	/**
	 * Asigna el atributo TIME
	 * Creation date: (12/15/2005
	 * @param newTIME java.lang.Double
	 */
	public void setTIME(java.lang.Double newTIME) {
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
	 * Retorna el valor del atributo TENDTYPE.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getTENDTYPE(){
			return _TENDTYPE;
	}

	/**
	 * Asigna el atributo TENDTYPE
	 * Creation date: (12/15/2005
	 * @param newTENDTYPE java.lang.Double
	 */
	public void setTENDTYPE(java.lang.Double newTENDTYPE) {
		_TENDTYPE = newTENDTYPE;
	}

	/**
	 * Retorna el valor del atributo AMTTENDE.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getAMTTENDE(){
			return _AMTTENDE;
	}

	/**
	 * Asigna el atributo AMTTENDE
	 * Creation date: (12/15/2005
	 * @param newAMTTENDE java.lang.Double
	 */
	public void setAMTTENDE(java.lang.Double newAMTTENDE) {
		_AMTTENDE = newAMTTENDE;
	}

	/**
	 * Retorna el valor del atributo AMTTNFEE.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getAMTTNFEE(){
			return _AMTTNFEE;
	}

	/**
	 * Asigna el atributo AMTTNFEE
	 * Creation date: (12/15/2005
	 * @param newAMTTNFEE java.lang.Double
	 */
	public void setAMTTNFEE(java.lang.Double newAMTTNFEE) {
		_AMTTNFEE = newAMTTNFEE;
	}


	/**
	 * Retorna el valor del atributo STATUS.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getSTATUS(){
			return _STATUS;
	}

	/**
	 * Asigna el atributo STATUS
	 * Creation date: (12/15/2005
	 * @param newSTATUS java.lang.Double
	 */
	public void setSTATUS(java.lang.Double newSTATUS) {
		_STATUS = newSTATUS;
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
	 * Retorna el nombre de la tabla TPOS_TENDER
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TPOS_TENDER
	 */
	public void start() {
		String _fields[] = {OFFSETY,OFFSETX,STORE,TERMINAL,TRANSNUM,DAY,TIME,TYPE,TENDTYPE,AMTTENDE,AMTTNFEE,STATUS,TIPO,FECHAHORA};
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
		} else if (field.equals(TENDTYPE)) {
			return _TENDTYPE;
		} else if (field.equals(AMTTENDE)) {
			return _AMTTENDE;
		} else if (field.equals(AMTTNFEE)) {
			return _AMTTNFEE;
		} else if (field.equals(STATUS)) {
			return _STATUS;
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
			setTIME((java.lang.Double) value );
		} else if (field.equals(TYPE)) {
			setTYPE((java.lang.Double) value );
		} else if (field.equals(TENDTYPE)) {
			setTENDTYPE((java.lang.Double) value );
		} else if (field.equals(AMTTENDE)) {
			setAMTTENDE((java.lang.Double) value );
		} else if (field.equals(AMTTNFEE)) {
			setAMTTNFEE((java.lang.Double) value );
		} else if (field.equals(STATUS)) {
			setSTATUS((java.lang.Double) value );
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
			return java.sql.Types.DECIMAL;
		} else if (field.equals(TYPE)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(TENDTYPE)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(AMTTENDE)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(AMTTNFEE)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(STATUS)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(TIPO)) {
			return java.sql.Types.VARCHAR;
		}else if (field.equals(FECHAHORA)) {
			return java.sql.Types.TIMESTAMP;
		}
		return 0;
	}
}
