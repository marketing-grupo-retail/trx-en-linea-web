package com.asic.transacciones.vo;


/**
 * @(#) TX_USER_DATA.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 14/02/2006
 */ 

/**
 * Clase que permite acceso a la tabla TX_USER_DATA y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TX_USER_DATA_Imp extends jdao.data.DataAdv implements TX_USER_DATA, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String NAME = "TX_USER_DATA";
	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETY</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String OFFSETY = "OFFSETY";

	/**
	 * Atributo para manejar el campo <B>OFFSETY</B>
	 * de la tabla <B>OFFSETY</B>
	 */
	private java.lang.String _OFFSETY;

	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETX</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String OFFSETX = "OFFSETX";

	/**
	 * Atributo para manejar el campo <B>OFFSETX</B>
	 * de la tabla <B>OFFSETX</B>
	 */
	private java.lang.String _OFFSETX;

	/**
	 * Atributo que contiene el nombre del campo <B>STORE</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String STORE = "STORE";

	/**
	 * Atributo para manejar el campo <B>STORE</B>
	 * de la tabla <B>STORE</B>
	 */
	private java.lang.String _STORE;

	/**
	 * Atributo que contiene el nombre del campo <B>TERMINAL</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String TERMINAL = "TERMINAL";

	/**
	 * Atributo para manejar el campo <B>TERMINAL</B>
	 * de la tabla <B>TERMINAL</B>
	 */
	private java.lang.String _TERMINAL;

	/**
	 * Atributo que contiene el nombre del campo <B>TRANSNUM</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String TRANSNUM = "TRANSNUM";

	/**
	 * Atributo para manejar el campo <B>TRANSNUM</B>
	 * de la tabla <B>TRANSNUM</B>
	 */
	private java.lang.String _TRANSNUM;

	/**
	 * Atributo que contiene el nombre del campo <B>DAY</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DAY = "DAY";

	/**
	 * Atributo para manejar el campo <B>DAY</B>
	 * de la tabla <B>DAY</B>
	 */
	private java.lang.String _DAY;

	/**
	 * Atributo que contiene el nombre del campo <B>TIME</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.lang.String _TIME;

	/**
	 * Atributo que contiene el nombre del campo <B>TYPE</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String TYPE = "TYPE";

	/**
	 * Atributo para manejar el campo <B>TYPE</B>
	 * de la tabla <B>TYPE</B>
	 */
	private java.lang.String _TYPE;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA1</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA1 = "DATA1";

	/**
	 * Atributo para manejar el campo <B>DATA1</B>
	 * de la tabla <B>DATA1</B>
	 */
	private java.lang.String _DATA1;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA2</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA2 = "DATA2";

	/**
	 * Atributo para manejar el campo <B>DATA2</B>
	 * de la tabla <B>DATA2</B>
	 */
	private java.lang.String _DATA2;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA3</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA3 = "DATA3";

	/**
	 * Atributo para manejar el campo <B>DATA3</B>
	 * de la tabla <B>DATA3</B>
	 */
	private java.lang.String _DATA3;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA4</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA4 = "DATA4";

	/**
	 * Atributo para manejar el campo <B>DATA4</B>
	 * de la tabla <B>DATA4</B>
	 */
	private java.lang.String _DATA4;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA5</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA5 = "DATA5";

	/**
	 * Atributo para manejar el campo <B>DATA5</B>
	 * de la tabla <B>DATA5</B>
	 */
	private java.lang.String _DATA5;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA6</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA6 = "DATA6";

	/**
	 * Atributo para manejar el campo <B>DATA6</B>
	 * de la tabla <B>DATA6</B>
	 */
	private java.lang.String _DATA6;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA7</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA7 = "DATA7";

	/**
	 * Atributo para manejar el campo <B>DATA7</B>
	 * de la tabla <B>DATA7</B>
	 */
	private java.lang.String _DATA7;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA8</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA8 = "DATA8";

	/**
	 * Atributo para manejar el campo <B>DATA8</B>
	 * de la tabla <B>DATA8</B>
	 */
	private java.lang.String _DATA8;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA9</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA9 = "DATA9";

	/**
	 * Atributo para manejar el campo <B>DATA9</B>
	 * de la tabla <B>DATA9</B>
	 */
	private java.lang.String _DATA9;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA10</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA10 = "DATA10";

	/**
	 * Atributo para manejar el campo <B>DATA10</B>
	 * de la tabla <B>DATA10</B>
	 */
	private java.lang.String _DATA10;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA11</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA11 = "DATA11";

	/**
	 * Atributo para manejar el campo <B>DATA11</B>
	 * de la tabla <B>DATA11</B>
	 */
	private java.lang.String _DATA11;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA12</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA12 = "DATA12";

	/**
	 * Atributo para manejar el campo <B>DATA12</B>
	 * de la tabla <B>DATA12</B>
	 */
	private java.lang.String _DATA12;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA13</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA13 = "DATA13";

	/**
	 * Atributo para manejar el campo <B>DATA13</B>
	 * de la tabla <B>DATA13</B>
	 */
	private java.lang.String _DATA13;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA14</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA14 = "DATA14";

	/**
	 * Atributo para manejar el campo <B>DATA14</B>
	 * de la tabla <B>DATA14</B>
	 */
	private java.lang.String _DATA14;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA15</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA15 = "DATA15";

	/**
	 * Atributo para manejar el campo <B>DATA15</B>
	 * de la tabla <B>DATA15</B>
	 */
	private java.lang.String _DATA15;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA16</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA16 = "DATA16";

	/**
	 * Atributo para manejar el campo <B>DATA16</B>
	 * de la tabla <B>DATA16</B>
	 */
	private java.lang.String _DATA16;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA17</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA17 = "DATA17";

	/**
	 * Atributo para manejar el campo <B>DATA17</B>
	 * de la tabla <B>DATA17</B>
	 */
	private java.lang.String _DATA17;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA18</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA18 = "DATA18";

	/**
	 * Atributo para manejar el campo <B>DATA18</B>
	 * de la tabla <B>DATA18</B>
	 */
	private java.lang.String _DATA18;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA19</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA19 = "DATA19";

	/**
	 * Atributo para manejar el campo <B>DATA19</B>
	 * de la tabla <B>DATA19</B>
	 */
	private java.lang.String _DATA19;

	/**
	 * Atributo que contiene el nombre del campo <B>DATA20</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String DATA20 = "DATA20";

	/**
	 * Atributo para manejar el campo <B>DATA20</B>
	 * de la tabla <B>DATA20</B>
	 */
	private java.lang.String _DATA20;

	/**
	 * Atributo que contiene el nombre del campo <B>TIPO</B>
	 * de la tabla <B>TX_USER_DATA</B>
	 */
	public static final String TIPO = "TIPO";

	/**
	 * Atributo para manejar el campo <B>TIPO</B>
	 * de la tabla <B>TIPO</B>
	 */
	private java.lang.String _TIPO;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_RECHAZO</B>
	 * de la tabla <B>TX_USER_DATA</B>
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
	public TX_USER_DATA_Imp() {
		super();
		start();
	}

	/**
	 * Crea un nuevo TX_USER_DATA con los campos de la tabla
	 * @param pOFFSETY java.lang.String;
	 * @param pOFFSETX java.lang.String;
	 * @param pSTORE java.lang.String;
	 * @param pTERMINAL java.lang.String;
	 * @param pTRANSNUM java.lang.String;
	 * @param pDAY java.lang.String;
	 * @param pTIME java.lang.String;
	 * @param pTYPE java.lang.String;
	 * @param pDATA1 java.lang.String;
	 * @param pDATA2 java.lang.String;
	 * @param pDATA3 java.lang.String;
	 * @param pDATA4 java.lang.String;
	 * @param pDATA5 java.lang.String;
	 * @param pDATA6 java.lang.String;
	 * @param pDATA7 java.lang.String;
	 * @param pDATA8 java.lang.String;
	 * @param pDATA9 java.lang.String;
	 * @param pDATA10 java.lang.String;
	 * @param pDATA11 java.lang.String;
	 * @param pDATA12 java.lang.String;
	 * @param pDATA13 java.lang.String;
	 * @param pDATA14 java.lang.String;
	 * @param pDATA15 java.lang.String;
	 * @param pDATA16 java.lang.String;
	 * @param pDATA17 java.lang.String;
	 * @param pDATA18 java.lang.String;
	 * @param pDATA19 java.lang.String;
	 * @param pDATA20 java.lang.String;
	 * @param pTIPO java.lang.String;
	 * @param pID_RECHAZO java.lang.Double;
	 */
	public TX_USER_DATA_Imp( java.lang.String pOFFSETY,java.lang.String pOFFSETX,java.lang.String pSTORE,java.lang.String pTERMINAL,java.lang.String pTRANSNUM,java.lang.String pDAY,java.lang.String pTIME,java.lang.String pTYPE,java.lang.String pDATA1,java.lang.String pDATA2,java.lang.String pDATA3,java.lang.String pDATA4,java.lang.String pDATA5,java.lang.String pDATA6,java.lang.String pDATA7,java.lang.String pDATA8,java.lang.String pDATA9,java.lang.String pDATA10,java.lang.String pDATA11,java.lang.String pDATA12,java.lang.String pDATA13,java.lang.String pDATA14,java.lang.String pDATA15,java.lang.String pDATA16,java.lang.String pDATA17,java.lang.String pDATA18,java.lang.String pDATA19,java.lang.String pDATA20,java.lang.String pTIPO,java.lang.Double pID_RECHAZO) { 
		this._OFFSETY = pOFFSETY;
		this._OFFSETX = pOFFSETX;
		this._STORE = pSTORE;
		this._TERMINAL = pTERMINAL;
		this._TRANSNUM = pTRANSNUM;
		this._DAY = pDAY;
		this._TIME = pTIME;
		this._TYPE = pTYPE;
		this._DATA1 = pDATA1;
		this._DATA2 = pDATA2;
		this._DATA3 = pDATA3;
		this._DATA4 = pDATA4;
		this._DATA5 = pDATA5;
		this._DATA6 = pDATA6;
		this._DATA7 = pDATA7;
		this._DATA8 = pDATA8;
		this._DATA9 = pDATA9;
		this._DATA10 = pDATA10;
		this._DATA11 = pDATA11;
		this._DATA12 = pDATA12;
		this._DATA13 = pDATA13;
		this._DATA14 = pDATA14;
		this._DATA15 = pDATA15;
		this._DATA16 = pDATA16;
		this._DATA17 = pDATA17;
		this._DATA18 = pDATA18;
		this._DATA19 = pDATA19;
		this._DATA20 = pDATA20;
		this._TIPO = pTIPO;
		this._ID_RECHAZO = pID_RECHAZO;
	}

	/**
	 * Retorna el valor del atributo OFFSETY.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getOFFSETY(){
			return _OFFSETY;
	}

	/**
	 * Asigna el atributo OFFSETY
	 * Creation date: (02/14/2006
	 * @param newOFFSETY java.lang.String
	 */
	public void setOFFSETY(java.lang.String newOFFSETY) {
		_OFFSETY = newOFFSETY;
	}

	/**
	 * Retorna el valor del atributo OFFSETX.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getOFFSETX(){
			return _OFFSETX;
	}

	/**
	 * Asigna el atributo OFFSETX
	 * Creation date: (02/14/2006
	 * @param newOFFSETX java.lang.String
	 */
	public void setOFFSETX(java.lang.String newOFFSETX) {
		_OFFSETX = newOFFSETX;
	}

	/**
	 * Retorna el valor del atributo STORE.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getSTORE(){
			return _STORE;
	}

	/**
	 * Asigna el atributo STORE
	 * Creation date: (02/14/2006
	 * @param newSTORE java.lang.String
	 */
	public void setSTORE(java.lang.String newSTORE) {
		_STORE = newSTORE;
	}

	/**
	 * Retorna el valor del atributo TERMINAL.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTERMINAL(){
			return _TERMINAL;
	}

	/**
	 * Asigna el atributo TERMINAL
	 * Creation date: (02/14/2006
	 * @param newTERMINAL java.lang.String
	 */
	public void setTERMINAL(java.lang.String newTERMINAL) {
		_TERMINAL = newTERMINAL;
	}

	/**
	 * Retorna el valor del atributo TRANSNUM.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTRANSNUM(){
			return _TRANSNUM;
	}

	/**
	 * Asigna el atributo TRANSNUM
	 * Creation date: (02/14/2006
	 * @param newTRANSNUM java.lang.String
	 */
	public void setTRANSNUM(java.lang.String newTRANSNUM) {
		_TRANSNUM = newTRANSNUM;
	}

	/**
	 * Retorna el valor del atributo DAY.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDAY(){
			return _DAY;
	}

	/**
	 * Asigna el atributo DAY
	 * Creation date: (02/14/2006
	 * @param newDAY java.lang.String
	 */
	public void setDAY(java.lang.String newDAY) {
		_DAY = newDAY;
	}

	/**
	 * Retorna el valor del atributo TIME.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTIME(){
			return _TIME;
	}

	/**
	 * Asigna el atributo TIME
	 * Creation date: (02/14/2006
	 * @param newTIME java.lang.String
	 */
	public void setTIME(java.lang.String newTIME) {
		_TIME = newTIME;
	}

	/**
	 * Retorna el valor del atributo TYPE.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTYPE(){
			return _TYPE;
	}

	/**
	 * Asigna el atributo TYPE
	 * Creation date: (02/14/2006
	 * @param newTYPE java.lang.String
	 */
	public void setTYPE(java.lang.String newTYPE) {
		_TYPE = newTYPE;
	}

	/**
	 * Retorna el valor del atributo DATA1.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA1(){
			return _DATA1;
	}

	/**
	 * Asigna el atributo DATA1
	 * Creation date: (02/14/2006
	 * @param newDATA1 java.lang.String
	 */
	public void setDATA1(java.lang.String newDATA1) {
		_DATA1 = newDATA1;
	}

	/**
	 * Retorna el valor del atributo DATA2.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA2(){
			return _DATA2;
	}

	/**
	 * Asigna el atributo DATA2
	 * Creation date: (02/14/2006
	 * @param newDATA2 java.lang.String
	 */
	public void setDATA2(java.lang.String newDATA2) {
		_DATA2 = newDATA2;
	}

	/**
	 * Retorna el valor del atributo DATA3.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA3(){
			return _DATA3;
	}

	/**
	 * Asigna el atributo DATA3
	 * Creation date: (02/14/2006
	 * @param newDATA3 java.lang.String
	 */
	public void setDATA3(java.lang.String newDATA3) {
		_DATA3 = newDATA3;
	}

	/**
	 * Retorna el valor del atributo DATA4.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA4(){
			return _DATA4;
	}

	/**
	 * Asigna el atributo DATA4
	 * Creation date: (02/14/2006
	 * @param newDATA4 java.lang.String
	 */
	public void setDATA4(java.lang.String newDATA4) {
		_DATA4 = newDATA4;
	}

	/**
	 * Retorna el valor del atributo DATA5.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA5(){
			return _DATA5;
	}

	/**
	 * Asigna el atributo DATA5
	 * Creation date: (02/14/2006
	 * @param newDATA5 java.lang.String
	 */
	public void setDATA5(java.lang.String newDATA5) {
		_DATA5 = newDATA5;
	}

	/**
	 * Retorna el valor del atributo DATA6.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA6(){
			return _DATA6;
	}

	/**
	 * Asigna el atributo DATA6
	 * Creation date: (02/14/2006
	 * @param newDATA6 java.lang.String
	 */
	public void setDATA6(java.lang.String newDATA6) {
		_DATA6 = newDATA6;
	}

	/**
	 * Retorna el valor del atributo DATA7.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA7(){
			return _DATA7;
	}

	/**
	 * Asigna el atributo DATA7
	 * Creation date: (02/14/2006
	 * @param newDATA7 java.lang.String
	 */
	public void setDATA7(java.lang.String newDATA7) {
		_DATA7 = newDATA7;
	}

	/**
	 * Retorna el valor del atributo DATA8.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA8(){
			return _DATA8;
	}

	/**
	 * Asigna el atributo DATA8
	 * Creation date: (02/14/2006
	 * @param newDATA8 java.lang.String
	 */
	public void setDATA8(java.lang.String newDATA8) {
		_DATA8 = newDATA8;
	}

	/**
	 * Retorna el valor del atributo DATA9.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA9(){
			return _DATA9;
	}

	/**
	 * Asigna el atributo DATA9
	 * Creation date: (02/14/2006
	 * @param newDATA9 java.lang.String
	 */
	public void setDATA9(java.lang.String newDATA9) {
		_DATA9 = newDATA9;
	}

	/**
	 * Retorna el valor del atributo DATA10.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA10(){
			return _DATA10;
	}

	/**
	 * Asigna el atributo DATA10
	 * Creation date: (02/14/2006
	 * @param newDATA10 java.lang.String
	 */
	public void setDATA10(java.lang.String newDATA10) {
		_DATA10 = newDATA10;
	}

	/**
	 * Retorna el valor del atributo DATA11.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA11(){
			return _DATA11;
	}

	/**
	 * Asigna el atributo DATA11
	 * Creation date: (02/14/2006
	 * @param newDATA11 java.lang.String
	 */
	public void setDATA11(java.lang.String newDATA11) {
		_DATA11 = newDATA11;
	}

	/**
	 * Retorna el valor del atributo DATA12.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA12(){
			return _DATA12;
	}

	/**
	 * Asigna el atributo DATA12
	 * Creation date: (02/14/2006
	 * @param newDATA12 java.lang.String
	 */
	public void setDATA12(java.lang.String newDATA12) {
		_DATA12 = newDATA12;
	}

	/**
	 * Retorna el valor del atributo DATA13.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA13(){
			return _DATA13;
	}

	/**
	 * Asigna el atributo DATA13
	 * Creation date: (02/14/2006
	 * @param newDATA13 java.lang.String
	 */
	public void setDATA13(java.lang.String newDATA13) {
		_DATA13 = newDATA13;
	}

	/**
	 * Retorna el valor del atributo DATA14.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA14(){
			return _DATA14;
	}

	/**
	 * Asigna el atributo DATA14
	 * Creation date: (02/14/2006
	 * @param newDATA14 java.lang.String
	 */
	public void setDATA14(java.lang.String newDATA14) {
		_DATA14 = newDATA14;
	}

	/**
	 * Retorna el valor del atributo DATA15.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA15(){
			return _DATA15;
	}

	/**
	 * Asigna el atributo DATA15
	 * Creation date: (02/14/2006
	 * @param newDATA15 java.lang.String
	 */
	public void setDATA15(java.lang.String newDATA15) {
		_DATA15 = newDATA15;
	}

	/**
	 * Retorna el valor del atributo DATA16.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA16(){
			return _DATA16;
	}

	/**
	 * Asigna el atributo DATA16
	 * Creation date: (02/14/2006
	 * @param newDATA16 java.lang.String
	 */
	public void setDATA16(java.lang.String newDATA16) {
		_DATA16 = newDATA16;
	}

	/**
	 * Retorna el valor del atributo DATA17.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA17(){
			return _DATA17;
	}

	/**
	 * Asigna el atributo DATA17
	 * Creation date: (02/14/2006
	 * @param newDATA17 java.lang.String
	 */
	public void setDATA17(java.lang.String newDATA17) {
		_DATA17 = newDATA17;
	}

	/**
	 * Retorna el valor del atributo DATA18.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA18(){
			return _DATA18;
	}

	/**
	 * Asigna el atributo DATA18
	 * Creation date: (02/14/2006
	 * @param newDATA18 java.lang.String
	 */
	public void setDATA18(java.lang.String newDATA18) {
		_DATA18 = newDATA18;
	}

	/**
	 * Retorna el valor del atributo DATA19.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA19(){
			return _DATA19;
	}

	/**
	 * Asigna el atributo DATA19
	 * Creation date: (02/14/2006
	 * @param newDATA19 java.lang.String
	 */
	public void setDATA19(java.lang.String newDATA19) {
		_DATA19 = newDATA19;
	}

	/**
	 * Retorna el valor del atributo DATA20.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDATA20(){
			return _DATA20;
	}

	/**
	 * Asigna el atributo DATA20
	 * Creation date: (02/14/2006
	 * @param newDATA20 java.lang.String
	 */
	public void setDATA20(java.lang.String newDATA20) {
		_DATA20 = newDATA20;
	}

	/**
	 * Retorna el valor del atributo TIPO.
	 * Creation date: (02/14/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTIPO(){
			return _TIPO;
	}

	/**
	 * Asigna el atributo TIPO
	 * Creation date: (02/14/2006
	 * @param newTIPO java.lang.String
	 */
	public void setTIPO(java.lang.String newTIPO) {
		_TIPO = newTIPO;
	}

	/**
	 * Retorna el valor del atributo ID_RECHAZO.
	 * Creation date: (02/14/2006
	 * @return java.lang.Double
	 */
	public java.lang.Double getID_RECHAZO(){
			return _ID_RECHAZO;
	}

	/**
	 * Asigna el atributo ID_RECHAZO
	 * Creation date: (02/14/2006
	 * @param newID_RECHAZO java.lang.Double
	 */
	public void setID_RECHAZO(java.lang.Double newID_RECHAZO) {
		_ID_RECHAZO = newID_RECHAZO;
	}

	/**
	 * Retorna el nombre de la tabla TX_USER_DATA
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TX_USER_DATA
	 */
	public void start() {
		String _fields[] = {OFFSETY,OFFSETX,STORE,TERMINAL,TRANSNUM,DAY,TIME,TYPE,DATA1,DATA2,DATA3,DATA4,DATA5,DATA6,DATA7,DATA8,DATA9,DATA10,DATA11,DATA12,DATA13,DATA14,DATA15,DATA16,DATA17,DATA18,DATA19,DATA20,TIPO,ID_RECHAZO};
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
		} else if (field.equals(DATA7)) {
			return _DATA7;
		} else if (field.equals(DATA8)) {
			return _DATA8;
		} else if (field.equals(DATA9)) {
			return _DATA9;
		} else if (field.equals(DATA10)) {
			return _DATA10;
		} else if (field.equals(DATA11)) {
			return _DATA11;
		} else if (field.equals(DATA12)) {
			return _DATA12;
		} else if (field.equals(DATA13)) {
			return _DATA13;
		} else if (field.equals(DATA14)) {
			return _DATA14;
		} else if (field.equals(DATA15)) {
			return _DATA15;
		} else if (field.equals(DATA16)) {
			return _DATA16;
		} else if (field.equals(DATA17)) {
			return _DATA17;
		} else if (field.equals(DATA18)) {
			return _DATA18;
		} else if (field.equals(DATA19)) {
			return _DATA19;
		} else if (field.equals(DATA20)) {
			return _DATA20;
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
		} else if (field.equals(DATA7)) {
			setDATA7((java.lang.String) value );
		} else if (field.equals(DATA8)) {
			setDATA8((java.lang.String) value );
		} else if (field.equals(DATA9)) {
			setDATA9((java.lang.String) value );
		} else if (field.equals(DATA10)) {
			setDATA10((java.lang.String) value );
		} else if (field.equals(DATA11)) {
			setDATA11((java.lang.String) value );
		} else if (field.equals(DATA12)) {
			setDATA12((java.lang.String) value );
		} else if (field.equals(DATA13)) {
			setDATA13((java.lang.String) value );
		} else if (field.equals(DATA14)) {
			setDATA14((java.lang.String) value );
		} else if (field.equals(DATA15)) {
			setDATA15((java.lang.String) value );
		} else if (field.equals(DATA16)) {
			setDATA16((java.lang.String) value );
		} else if (field.equals(DATA17)) {
			setDATA17((java.lang.String) value );
		} else if (field.equals(DATA18)) {
			setDATA18((java.lang.String) value );
		} else if (field.equals(DATA19)) {
			setDATA19((java.lang.String) value );
		} else if (field.equals(DATA20)) {
			setDATA20((java.lang.String) value );
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
		} else if (field.equals(DATA7)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA8)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA9)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA10)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA11)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA12)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA13)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA14)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA15)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA16)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA17)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA18)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA19)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DATA20)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TIPO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ID_RECHAZO)) {
			return java.sql.Types.DECIMAL;
		}
		return 0;
	}
}
