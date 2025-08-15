package com.asic.transacciones.vo;
/**
 * @(#) TPOS_DISCOUNT.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 15/12/2005
 */ 

/**
 * Clase que permite acceso a la tabla TPOS_DISCOUNT y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TPOS_DISCOUNT_Imp extends jdao.data.DataAdv implements TPOS_DISCOUNT, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TPOS_DISCOUNT</B>
	 */
	public static final String NAME = "TPOS_DISCOUNT";
	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETY</B>
	 * de la tabla <B>TPOS_DISCOUNT</B>
	 */
	public static final String OFFSETY = "OFFSETY";

	/**
	 * Atributo para manejar el campo <B>OFFSETY</B>
	 * de la tabla <B>OFFSETY</B>
	 */
	private java.lang.Double _OFFSETY;

	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETX</B>
	 * de la tabla <B>TPOS_DISCOUNT</B>
	 */
	public static final String OFFSETX = "OFFSETX";

	/**
	 * Atributo para manejar el campo <B>OFFSETX</B>
	 * de la tabla <B>OFFSETX</B>
	 */
	private java.lang.Double _OFFSETX;

	/**
	 * Atributo que contiene el nombre del campo <B>STORE</B>
	 * de la tabla <B>TPOS_DISCOUNT</B>
	 */
	public static final String STORE = "STORE";

	/**
	 * Atributo para manejar el campo <B>STORE</B>
	 * de la tabla <B>STORE</B>
	 */
	private java.lang.Double _STORE;

	/**
	 * Atributo que contiene el nombre del campo <B>TERMINAL</B>
	 * de la tabla <B>TPOS_DISCOUNT</B>
	 */
	public static final String TERMINAL = "TERMINAL";

	/**
	 * Atributo para manejar el campo <B>TERMINAL</B>
	 * de la tabla <B>TERMINAL</B>
	 */
	private java.lang.Double _TERMINAL;

	/**
	 * Atributo que contiene el nombre del campo <B>TRANSNUM</B>
	 * de la tabla <B>TPOS_DISCOUNT</B>
	 */
	public static final String TRANSNUM = "TRANSNUM";

	/**
	 * Atributo para manejar el campo <B>TRANSNUM</B>
	 * de la tabla <B>TRANSNUM</B>
	 */
	private java.lang.Double _TRANSNUM;

	/**
	 * Atributo que contiene el nombre del campo <B>DAY</B>
	 * de la tabla <B>TPOS_DISCOUNT</B>
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
	 * de la tabla <B>TPOS_DISCOUNT</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.lang.Double _TIME;

	/**
	 * Atributo que contiene el nombre del campo <B>TYPE</B>
	 * de la tabla <B>TPOS_DISCOUNT</B>
	 */
	public static final String TYPE = "TYPE";

	/**
	 * Atributo para manejar el campo <B>TYPE</B>
	 * de la tabla <B>TYPE</B>
	 */
	private java.lang.Double _TYPE;

	/**
	 * Atributo que contiene el nombre del campo <B>DISGROUP</B>
	 * de la tabla <B>TPOS_DISCOUNT</B>
	 */
	public static final String DISGROUP = "DISGROUP";

	/**
	 * Atributo para manejar el campo <B>DISGROUP</B>
	 * de la tabla <B>DISGROUP</B>
	 */
	private java.lang.Double _DISGROUP;

	/**
	 * Atributo que contiene el nombre del campo <B>DISRATE</B>
	 * de la tabla <B>TPOS_DISCOUNT</B>
	 */
	public static final String DISRATE = "DISRATE";

	/**
	 * Atributo para manejar el campo <B>DISRATE</B>
	 * de la tabla <B>DISRATE</B>
	 */
	private java.lang.Double _DISRATE;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTDISCO</B>
	 * de la tabla <B>TPOS_DISCOUNT</B>
	 */
	public static final String AMTDISCO = "AMTDISCO";

	/**
	 * Atributo para manejar el campo <B>AMTDISCO</B>
	 * de la tabla <B>AMTDISCO</B>
	 */
	private java.lang.Double _AMTDISCO;

	/**
	 * Atributo que contiene el nombre del campo <B>TAXEXEMP</B>
	 * de la tabla <B>TPOS_DISCOUNT</B>
	 */
	public static final String TAXEXEMP = "TAXEXEMP";

	/**
	 * Atributo para manejar el campo <B>TAXEXEMP</B>
	 * de la tabla <B>TAXEXEMP</B>
	 */
	private java.lang.Double _TAXEXEMP;

	/**
	 * Atributo que contiene el nombre del campo <B>TIPO</B>
	 * de la tabla <B>TPOS_DISCOUNT</B>
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
	public TPOS_DISCOUNT_Imp() {
		super();
		start();
	}

	/**
	 * Crea un nuevo TPOS_DISCOUNT con los campos de la tabla
	 * @param pOFFSETY java.lang.Double;
	 * @param pOFFSETX java.lang.Double;
	 * @param pSTORE java.lang.Double;
	 * @param pTERMINAL java.lang.Double;
	 * @param pTRANSNUM java.lang.Double;
	 * @param pDAY java.sql.Timestamp;
	 * @param pTIME java.lang.Double;
	 * @param pTYPE java.lang.Double;
	 * @param pDISGROUP java.lang.Double;
	 * @param pDISRATE java.lang.Double;
	 * @param pAMTDISCO java.lang.Double;
	 * @param pTAXEXEMP java.lang.Double;
	 * @param pTIPO java.lang.String;
	 */
	public TPOS_DISCOUNT_Imp( java.lang.Double pOFFSETY,java.lang.Double pOFFSETX,java.lang.Double pSTORE,java.lang.Double pTERMINAL,java.lang.Double pTRANSNUM,java.sql.Timestamp pDAY,java.lang.Double pTIME,java.lang.Double pTYPE,java.lang.Double pDISGROUP,java.lang.Double pDISRATE,java.lang.Double pAMTDISCO,java.lang.Double pTAXEXEMP,java.lang.String pTIPO, java.sql.Timestamp pFECHAHORA) { 
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
	 * Retorna el valor del atributo DISGROUP.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getDISGROUP(){
			return _DISGROUP;
	}

	/**
	 * Asigna el atributo DISGROUP
	 * Creation date: (12/15/2005
	 * @param newDISGROUP java.lang.Double
	 */
	public void setDISGROUP(java.lang.Double newDISGROUP) {
		_DISGROUP = newDISGROUP;
	}

	/**
	 * Retorna el valor del atributo DISRATE.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getDISRATE(){
			return _DISRATE;
	}

	/**
	 * Asigna el atributo DISRATE
	 * Creation date: (12/15/2005
	 * @param newDISRATE java.lang.Double
	 */
	public void setDISRATE(java.lang.Double newDISRATE) {
		_DISRATE = newDISRATE;
	}

	/**
	 * Retorna el valor del atributo AMTDISCO.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getAMTDISCO(){
			return _AMTDISCO;
	}

	/**
	 * Asigna el atributo AMTDISCO
	 * Creation date: (12/15/2005
	 * @param newAMTDISCO java.lang.Double
	 */
	public void setAMTDISCO(java.lang.Double newAMTDISCO) {
		_AMTDISCO = newAMTDISCO;
	}

	/**
	 * Retorna el valor del atributo TAXEXEMP.
	 * Creation date: (12/15/2005
	 * @return java.lang.Double
	 */
	public java.lang.Double getTAXEXEMP(){
			return _TAXEXEMP;
	}

	/**
	 * Asigna el atributo TAXEXEMP
	 * Creation date: (12/15/2005
	 * @param newTAXEXEMP java.lang.Double
	 */
	public void setTAXEXEMP(java.lang.Double newTAXEXEMP) {
		_TAXEXEMP = newTAXEXEMP;
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
	 * Retorna el nombre de la tabla TPOS_DISCOUNT
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TPOS_DISCOUNT
	 */
	public void start() {
		String _fields[] = {OFFSETY,OFFSETX,STORE,TERMINAL,TRANSNUM,DAY,TIME,TYPE,DISGROUP,DISRATE,AMTDISCO,TAXEXEMP,TIPO,FECHAHORA};
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
		} else if (field.equals(DISGROUP)) {
			setDISGROUP((java.lang.Double) value );
		} else if (field.equals(DISRATE)) {
			setDISRATE((java.lang.Double) value );
		} else if (field.equals(AMTDISCO)) {
			setAMTDISCO((java.lang.Double) value );
		} else if (field.equals(TAXEXEMP)) {
			setTAXEXEMP((java.lang.Double) value );
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
		} else if (field.equals(DISGROUP)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(DISRATE)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(AMTDISCO)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(TAXEXEMP)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(TIPO)) {
			return java.sql.Types.VARCHAR;
		}
		return 0;
	}
}
