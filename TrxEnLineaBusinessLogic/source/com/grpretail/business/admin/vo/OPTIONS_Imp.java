package com.grpretail.business.admin.vo;

import java.io.Serializable;

/**
 * @(#) OPTIONS.java
 * 
 * Copyright (c) 2002 ITFusion, All Rights Reserved.
 * 
 * Fecha Creación: 14/08/2004
 */ 

/**
 * Clase que permite acceso a la tabla OPTIONS y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

public class OPTIONS_Imp extends jdao.data.DataAdv implements OPTIONS, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>OPTIONS</B>
	 */
	public static final String NAME = "MOL_OPTIONS";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>OPTIONS</B>
	 */
	public static final String ID = "ID";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer _ID;

	/**
	 * Atributo que contiene el nombre del campo <B>NOMBRE</B>
	 * de la tabla <B>OPTIONS</B>
	 */
	public static final String NOMBRE = "NOMBRE";

	/**
	 * Atributo para manejar el campo <B>NOMBRE</B>
	 * de la tabla <B>NOMBRE</B>
	 */
	private java.lang.String _NOMBRE;

	/**
	 * Atributo que contiene el nombre del campo <B>JERARQUI</B>
	 * de la tabla <B>OPTIONS</B>
	 */
	public static final String JERARQUI = "JERARQUI";

	/**
	 * Atributo para manejar el campo <B>JERARQUI</B>
	 * de la tabla <B>JERARQUI</B>
	 */
	private java.lang.Integer _JERARQUI;

	/**
	 * Atributo que contiene el nombre del campo <B>ORDEN</B>
	 * de la tabla <B>OPTIONS</B>
	 */
	public static final String ORDEN = "ORDEN";

	/**
	 * Atributo para manejar el campo <B>ORDEN</B>
	 * de la tabla <B>ORDEN</B>
	 */
	private java.lang.Integer _ORDEN;

	/**
	 * Atributo que contiene el nombre del campo <B>TIPO</B>
	 * de la tabla <B>OPTIONS</B>
	 */
	public static final String TIPO = "TIPO";

	/**
	 * Atributo para manejar el campo <B>TIPO</B>
	 * de la tabla <B>TIPO</B>
	 */
	private java.lang.Integer _TIPO;

	/**
	 * Atributo que contiene el nombre del campo <B>ES_MENU</B>
	 * de la tabla <B>OPTIONS</B>
	 */
	public static final String ES_MENU = "ES_MENU";

	/**
	 * Atributo para manejar el campo <B>ES_MENU</B>
	 * de la tabla <B>ES_MENU</B>
	 */
	private java.lang.Integer _ES_MENU;

	/**
	 * Atributo que contiene el nombre del campo <B>DESCRIP</B>
	 * de la tabla <B>OPTIONS</B>
	 */
	public static final String DESCRIP = "DESCRIP";

	/**
	 * Atributo para manejar el campo <B>DESCRIP</B>
	 * de la tabla <B>DESCRIP</B>
	 */
	private java.lang.String _DESCRIP;

	/**
	 * Metodo Constructor basico
	 */
	public OPTIONS_Imp() {
		super();
		start();
	}

/**
 * Crea un nuevo OPTIONS con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */
public OPTIONS_Imp( java.lang.Integer _ID) { 
	this._ID = _ID;
}
	/**
	 * Crea un nuevo OPTIONS con los campos de la tabla
	 * @param pID java.lang.Integer;
	 * @param pNOMBRE java.lang.String;
	 * @param pJERARQUI java.lang.Integer;
	 * @param pORDEN java.lang.Integer;
	 * @param pTIPO java.lang.Integer;
	 * @param pES_MENU java.lang.Integer;
	 * @param pDESCRIP java.lang.String;
	 */
	public OPTIONS_Imp( java.lang.Integer pID,java.lang.String pNOMBRE,java.lang.Integer pJERARQUI,java.lang.Integer pORDEN,java.lang.Integer pTIPO,java.lang.Integer pES_MENU,java.lang.String pDESCRIP) { 
		this._ID = pID;
		this._NOMBRE = pNOMBRE;
		this._JERARQUI = pJERARQUI;
		this._ORDEN = pORDEN;
		this._TIPO = pTIPO;
		this._ES_MENU = pES_MENU;
		this._DESCRIP = pDESCRIP;
	}

	/**
	 * Retorna el valor del atributo ID.
	 * Creation date: (08/14/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getID(){
			return _ID;
	}

	/**
	 * Asigna el atributo ID
	 * Creation date: (08/14/2004
	 * @param newID java.lang.Integer
	 */
	public void setID(java.lang.Integer newID) {
		_ID = newID;
	}

	/**
	 * Retorna el valor del atributo NOMBRE.
	 * Creation date: (08/14/2004
	 * @return java.lang.String
	 */
	public java.lang.String getNOMBRE(){
			return _NOMBRE;
	}

	/**
	 * Asigna el atributo NOMBRE
	 * Creation date: (08/14/2004
	 * @param newNOMBRE java.lang.String
	 */
	public void setNOMBRE(java.lang.String newNOMBRE) {
		_NOMBRE = newNOMBRE;
	}

	/**
	 * Retorna el valor del atributo JERARQUI.
	 * Creation date: (08/14/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getJERARQUI(){
			return _JERARQUI;
	}

	/**
	 * Asigna el atributo JERARQUI
	 * Creation date: (08/14/2004
	 * @param newJERARQUI java.lang.Integer
	 */
	public void setJERARQUI(java.lang.Integer newJERARQUI) {
		_JERARQUI = newJERARQUI;
	}

	/**
	 * Retorna el valor del atributo ORDEN.
	 * Creation date: (08/14/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getORDEN(){
			return _ORDEN;
	}

	/**
	 * Asigna el atributo ORDEN
	 * Creation date: (08/14/2004
	 * @param newORDEN java.lang.Integer
	 */
	public void setORDEN(java.lang.Integer newORDEN) {
		_ORDEN = newORDEN;
	}

	/**
	 * Retorna el valor del atributo TIPO.
	 * Creation date: (08/14/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getTIPO(){
			return _TIPO;
	}

	/**
	 * Asigna el atributo TIPO
	 * Creation date: (08/14/2004
	 * @param newTIPO java.lang.Integer
	 */
	public void setTIPO(java.lang.Integer newTIPO) {
		_TIPO = newTIPO;
	}

	/**
	 * Retorna el valor del atributo ES_MENU.
	 * Creation date: (08/14/2004
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getES_MENU(){
			return _ES_MENU;
	}

	/**
	 * Asigna el atributo ES_MENU
	 * Creation date: (08/14/2004
	 * @param newES_MENU java.lang.Integer
	 */
	public void setES_MENU(java.lang.Integer newES_MENU) {
		_ES_MENU = newES_MENU;
	}

	/**
	 * Retorna el valor del atributo DESCRIP.
	 * Creation date: (08/14/2004
	 * @return java.lang.String
	 */
	public java.lang.String getDESCRIP(){
			return _DESCRIP;
	}

	/**
	 * Asigna el atributo DESCRIP
	 * Creation date: (08/14/2004
	 * @param newDESCRIP java.lang.String
	 */
	public void setDESCRIP(java.lang.String newDESCRIP) {
		_DESCRIP = newDESCRIP;
	}

	/**
	 * Retorna el nombre de la tabla OPTIONS
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla OPTIONS
	 */
	public void start() {
		String _fields[] = {ID,NOMBRE,JERARQUI,ORDEN,TIPO,ES_MENU,DESCRIP};
		fields = _fields;
		String _keyFields[] = {"ID"};
		keyFields = _keyFields;
		dbProp = true;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public Object getValueField(String field) { 
		if (field.equals(ID)) {
			return _ID;
		} else if (field.equals(NOMBRE)) {
			return _NOMBRE;
		} else if (field.equals(JERARQUI)) {
			return _JERARQUI;
		} else if (field.equals(ORDEN)) {
			return _ORDEN;
		} else if (field.equals(TIPO)) {
			return _TIPO;
		} else if (field.equals(ES_MENU)) {
			return _ES_MENU;
		} else if (field.equals(DESCRIP)) {
			return _DESCRIP;
		}
		return null;
	}
	/**
	 * Asigna el valor a cada uno de los campos
	 */
	public void setValueField(String field, Object value) { 
	  if(value!=null){
		if (field.equals(ID)) {
			setID((java.lang.Integer) value );
		} else if (field.equals(NOMBRE)) {
			setNOMBRE((java.lang.String) value );
		} else if (field.equals(JERARQUI)) {
			setJERARQUI((java.lang.Integer) value );
		} else if (field.equals(ORDEN)) {
			setORDEN((java.lang.Integer) value );
		} else if (field.equals(TIPO)) {
			setTIPO((java.lang.Integer) value );
		} else if (field.equals(ES_MENU)) {
			setES_MENU((java.lang.Integer) value );
		} else if (field.equals(DESCRIP)) {
			setDESCRIP((java.lang.String) value );
		}
	  }

	}
	/**
	 * Retorna un array con los tipos de datos de la BD, es usado para los prepared statement
	 * @return Retorna array de enteros con el tipo de dato en BD cada uno de los atributos
	 */
	public int getSQLFieldType(String field) {
		if (field.equals(ID)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(NOMBRE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(JERARQUI)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(ORDEN)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(TIPO)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(ES_MENU)) {
			return java.sql.Types.INTEGER;
		} else if (field.equals(DESCRIP)) {
			return java.sql.Types.VARCHAR;
		}
		return 0;
	}
}
