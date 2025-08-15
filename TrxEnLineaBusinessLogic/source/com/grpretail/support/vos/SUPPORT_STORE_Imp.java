package com.grpretail.support.vos;


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


public class SUPPORT_STORE_Imp extends jdao.data.DataAdv implements /*TX_RECHAZO,*/ Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String NAME = "TOL_SUPPORT_STORE";
	/**
	 * Atributo que contiene el nombre del campo <B>ID_RECHAZO</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String TOL_ID = "TOL_ID";

	/**
	 * Atributo para manejar el campo <B>ID_RECHAZO</B>
	 * de la tabla <B>ID_RECHAZO</B>
	 */
	private java.lang.Double _TOL_ID;

	/**
	 * Atributo que contiene el nombre del campo <B>STORE</B>
	 * de la tabla <B>TX_RECHAZO</B>
	 */
	public static final String TOL_NAME = "TOL_NAME";

	/**
	 * Atributo para manejar el campo <B>STORE</B>
	 * de la tabla <B>STORE</B>
	 */
	private java.lang.String _TOL_NAME;

	
	/**
	 * Metodo Constructor basico
	 */
	public SUPPORT_STORE_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo TX_RECHAZO con los campos de la llave primaria
 * @param _ID_RECHAZO java.lang.Double;
 */
public SUPPORT_STORE_Imp( java.lang.Double _ID_RECHAZO) { 
	this._TOL_ID = _ID_RECHAZO;
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
	public SUPPORT_STORE_Imp( java.lang.Double pTOL_ID,java.lang.String pTOL_NAME/*,java.lang.String pTERMINAL,java.lang.String pTRANSNUM,java.lang.String pDAY,java.lang.String pTIME,java.lang.String pESTADO,java.lang.String pERROR,java.lang.String pCOMENTARIO,java.lang.String pOFFSETX,java.lang.String pAUDI_CREA,java.sql.Timestamp pAUDI_FHCREA,java.lang.String pAUDI_MOD,java.sql.Timestamp pAUDI_FHMOD*/) { 
		this._TOL_ID = pTOL_ID;
		this._TOL_NAME = pTOL_NAME;
		/*this._TERMINAL = pTERMINAL;
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
		this._AUDI_FHMOD = pAUDI_FHMOD;*/
	}

	/**
	 * Retorna el valor del atributo ID_RECHAZO.
	 * Creation date: (02/10/2006
	 * @return java.lang.Double
	 */
	public java.lang.Double getTOL_ID(){
			return _TOL_ID;
	}

	/**
	 * Asigna el atributo ID_RECHAZO
	 * Creation date: (02/10/2006
	 * @param newID_RECHAZO java.lang.Double
	 */
	public void setTOL_ID(java.lang.Double newTOL_ID) {
		_TOL_ID = newTOL_ID;
	}

	/**
	 * Retorna el valor del atributo STORE.
	 * Creation date: (02/10/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTOL_NAME(){
			return _TOL_NAME;
	}

	/**
	 * Asigna el atributo STORE
	 * Creation date: (02/10/2006
	 * @param newSTORE java.lang.String
	 */
	public void setTOL_NAME(java.lang.String newTOL_NAME) {
		_TOL_NAME = newTOL_NAME;
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
		String _fields[] = {TOL_ID,TOL_NAME/*,TERMINAL,TRANSNUM,DAY,TIME,ESTADO,ERROR,COMENTARIO,OFFSETX,AUDI_CREA,AUDI_FHCREA,AUDI_MOD,AUDI_FHMOD*/};
		fields = _fields;
		String _keyFields[] = {"TOL_ID"};
		keyFields = _keyFields;
		dbProp = false;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public Object getValueField(String field) { 
		if (field.equals(TOL_ID)) {
			return _TOL_ID;
		} else if (field.equals(TOL_NAME)) {
			return _TOL_NAME;
		}/* else if (field.equals(TERMINAL)) {
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
		}*/
		return null;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public void setValueField(String field, Object value) { 
	  if(value!=null){
		if (field.equals(TOL_ID)) {
			setTOL_ID((java.lang.Double) value );
		} else if (field.equals(TOL_NAME)) {
			setTOL_NAME((java.lang.String) value );
		}/* else if (field.equals(TERMINAL)) {
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
		}*/
	  }

	}
	/**
	 * Retorna un array con los tipos de datos de la BD, es usado para los prepared statement
	 * @return Retorna array de enteros con el tipo de dato en BD cada uno de los atributos
	 */
	public int getSQLFieldType(String field) {
		if (field.equals(TOL_ID)) {
			return java.sql.Types.DECIMAL;
		} else if (field.equals(TOL_NAME)) {
			return java.sql.Types.VARCHAR;
		}/* else if (field.equals(TERMINAL)) {
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
		}*/
		return 0;
	}
}
