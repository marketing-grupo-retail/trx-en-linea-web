package com.asic.transacciones.vo;


/**
 * @(#) TX_TILL_CHANGE.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 13/02/2006
 */ 

/**
 * Clase que permite acceso a la tabla TX_TILL_CHANGE y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TX_TILL_CHANGE_Imp extends jdao.data.DataAdv implements TX_TILL_CHANGE, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String NAME = "TX_TILL_CHANGE";
	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETY</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String OFFSETY = "OFFSETY";

	/**
	 * Atributo para manejar el campo <B>OFFSETY</B>
	 * de la tabla <B>OFFSETY</B>
	 */
	private java.lang.String _OFFSETY;

	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETX</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String OFFSETX = "OFFSETX";

	/**
	 * Atributo para manejar el campo <B>OFFSETX</B>
	 * de la tabla <B>OFFSETX</B>
	 */
	private java.lang.String _OFFSETX;

	/**
	 * Atributo que contiene el nombre del campo <B>STORE</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String STORE = "STORE";

	/**
	 * Atributo para manejar el campo <B>STORE</B>
	 * de la tabla <B>STORE</B>
	 */
	private java.lang.String _STORE;

	/**
	 * Atributo que contiene el nombre del campo <B>TERMINAL</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TERMINAL = "TERMINAL";

	/**
	 * Atributo para manejar el campo <B>TERMINAL</B>
	 * de la tabla <B>TERMINAL</B>
	 */
	private java.lang.String _TERMINAL;

	/**
	 * Atributo que contiene el nombre del campo <B>TRANSNUM</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TRANSNUM = "TRANSNUM";

	/**
	 * Atributo para manejar el campo <B>TRANSNUM</B>
	 * de la tabla <B>TRANSNUM</B>
	 */
	private java.lang.String _TRANSNUM;

	/**
	 * Atributo que contiene el nombre del campo <B>DAY</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String DAY = "DAY";

	/**
	 * Atributo para manejar el campo <B>DAY</B>
	 * de la tabla <B>DAY</B>
	 */
	private java.lang.String _DAY;

	/**
	 * Atributo que contiene el nombre del campo <B>TIME</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.lang.String _TIME;

	/**
	 * Atributo que contiene el nombre del campo <B>NUMBERLOANS</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String NUMBERLOANS = "NUMBERLOANS";

	/**
	 * Atributo para manejar el campo <B>NUMBERLOANS</B>
	 * de la tabla <B>NUMBERLOANS</B>
	 */
	private java.lang.String _NUMBERLOANS;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTLOANS</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTLOANS = "AMTLOANS";

	/**
	 * Atributo para manejar el campo <B>AMTLOANS</B>
	 * de la tabla <B>AMTLOANS</B>
	 */
	private java.lang.String _AMTLOANS;

	/**
	 * Atributo que contiene el nombre del campo <B>NUMBERPKUPS</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String NUMBERPKUPS = "NUMBERPKUPS";

	/**
	 * Atributo para manejar el campo <B>NUMBERPKUPS</B>
	 * de la tabla <B>NUMBERPKUPS</B>
	 */
	private java.lang.String _NUMBERPKUPS;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTPKUPS</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTPKUPS = "AMTPKUPS";

	/**
	 * Atributo para manejar el campo <B>AMTPKUPS</B>
	 * de la tabla <B>AMTPKUPS</B>
	 */
	private java.lang.String _AMTPKUPS;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP11</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP11 = "TENDTYP11";

	/**
	 * Atributo para manejar el campo <B>TENDTYP11</B>
	 * de la tabla <B>TENDTYP11</B>
	 */
	private java.lang.String _TENDTYP11;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND11</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND11 = "AMTTEND11";

	/**
	 * Atributo para manejar el campo <B>AMTTEND11</B>
	 * de la tabla <B>AMTTEND11</B>
	 */
	private java.lang.String _AMTTEND11;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP12</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP12 = "TENDTYP12";

	/**
	 * Atributo para manejar el campo <B>TENDTYP12</B>
	 * de la tabla <B>TENDTYP12</B>
	 */
	private java.lang.String _TENDTYP12;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND12</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND12 = "AMTTEND12";

	/**
	 * Atributo para manejar el campo <B>AMTTEND12</B>
	 * de la tabla <B>AMTTEND12</B>
	 */
	private java.lang.String _AMTTEND12;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP13</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP13 = "TENDTYP13";

	/**
	 * Atributo para manejar el campo <B>TENDTYP13</B>
	 * de la tabla <B>TENDTYP13</B>
	 */
	private java.lang.String _TENDTYP13;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND13</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND13 = "AMTTEND13";

	/**
	 * Atributo para manejar el campo <B>AMTTEND13</B>
	 * de la tabla <B>AMTTEND13</B>
	 */
	private java.lang.String _AMTTEND13;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP14</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP14 = "TENDTYP14";

	/**
	 * Atributo para manejar el campo <B>TENDTYP14</B>
	 * de la tabla <B>TENDTYP14</B>
	 */
	private java.lang.String _TENDTYP14;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND14</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND14 = "AMTTEND14";

	/**
	 * Atributo para manejar el campo <B>AMTTEND14</B>
	 * de la tabla <B>AMTTEND14</B>
	 */
	private java.lang.String _AMTTEND14;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP15</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP15 = "TENDTYP15";

	/**
	 * Atributo para manejar el campo <B>TENDTYP15</B>
	 * de la tabla <B>TENDTYP15</B>
	 */
	private java.lang.String _TENDTYP15;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND15</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND15 = "AMTTEND15";

	/**
	 * Atributo para manejar el campo <B>AMTTEND15</B>
	 * de la tabla <B>AMTTEND15</B>
	 */
	private java.lang.String _AMTTEND15;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP16</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP16 = "TENDTYP16";

	/**
	 * Atributo para manejar el campo <B>TENDTYP16</B>
	 * de la tabla <B>TENDTYP16</B>
	 */
	private java.lang.String _TENDTYP16;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND16</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND16 = "AMTTEND16";

	/**
	 * Atributo para manejar el campo <B>AMTTEND16</B>
	 * de la tabla <B>AMTTEND16</B>
	 */
	private java.lang.String _AMTTEND16;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP17</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP17 = "TENDTYP17";

	/**
	 * Atributo para manejar el campo <B>TENDTYP17</B>
	 * de la tabla <B>TENDTYP17</B>
	 */
	private java.lang.String _TENDTYP17;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND17</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND17 = "AMTTEND17";

	/**
	 * Atributo para manejar el campo <B>AMTTEND17</B>
	 * de la tabla <B>AMTTEND17</B>
	 */
	private java.lang.String _AMTTEND17;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP18</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP18 = "TENDTYP18";

	/**
	 * Atributo para manejar el campo <B>TENDTYP18</B>
	 * de la tabla <B>TENDTYP18</B>
	 */
	private java.lang.String _TENDTYP18;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND18</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND18 = "AMTTEND18";

	/**
	 * Atributo para manejar el campo <B>AMTTEND18</B>
	 * de la tabla <B>AMTTEND18</B>
	 */
	private java.lang.String _AMTTEND18;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP21</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP21 = "TENDTYP21";

	/**
	 * Atributo para manejar el campo <B>TENDTYP21</B>
	 * de la tabla <B>TENDTYP21</B>
	 */
	private java.lang.String _TENDTYP21;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND21</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND21 = "AMTTEND21";

	/**
	 * Atributo para manejar el campo <B>AMTTEND21</B>
	 * de la tabla <B>AMTTEND21</B>
	 */
	private java.lang.String _AMTTEND21;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP22</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP22 = "TENDTYP22";

	/**
	 * Atributo para manejar el campo <B>TENDTYP22</B>
	 * de la tabla <B>TENDTYP22</B>
	 */
	private java.lang.String _TENDTYP22;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND22</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND22 = "AMTTEND22";

	/**
	 * Atributo para manejar el campo <B>AMTTEND22</B>
	 * de la tabla <B>AMTTEND22</B>
	 */
	private java.lang.String _AMTTEND22;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP23</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP23 = "TENDTYP23";

	/**
	 * Atributo para manejar el campo <B>TENDTYP23</B>
	 * de la tabla <B>TENDTYP23</B>
	 */
	private java.lang.String _TENDTYP23;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND23</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND23 = "AMTTEND23";

	/**
	 * Atributo para manejar el campo <B>AMTTEND23</B>
	 * de la tabla <B>AMTTEND23</B>
	 */
	private java.lang.String _AMTTEND23;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP24</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP24 = "TENDTYP24";

	/**
	 * Atributo para manejar el campo <B>TENDTYP24</B>
	 * de la tabla <B>TENDTYP24</B>
	 */
	private java.lang.String _TENDTYP24;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND24</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND24 = "AMTTEND24";

	/**
	 * Atributo para manejar el campo <B>AMTTEND24</B>
	 * de la tabla <B>AMTTEND24</B>
	 */
	private java.lang.String _AMTTEND24;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP25</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP25 = "TENDTYP25";

	/**
	 * Atributo para manejar el campo <B>TENDTYP25</B>
	 * de la tabla <B>TENDTYP25</B>
	 */
	private java.lang.String _TENDTYP25;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND25</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND25 = "AMTTEND25";

	/**
	 * Atributo para manejar el campo <B>AMTTEND25</B>
	 * de la tabla <B>AMTTEND25</B>
	 */
	private java.lang.String _AMTTEND25;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP26</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP26 = "TENDTYP26";

	/**
	 * Atributo para manejar el campo <B>TENDTYP26</B>
	 * de la tabla <B>TENDTYP26</B>
	 */
	private java.lang.String _TENDTYP26;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND26</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND26 = "AMTTEND26";

	/**
	 * Atributo para manejar el campo <B>AMTTEND26</B>
	 * de la tabla <B>AMTTEND26</B>
	 */
	private java.lang.String _AMTTEND26;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP27</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP27 = "TENDTYP27";

	/**
	 * Atributo para manejar el campo <B>TENDTYP27</B>
	 * de la tabla <B>TENDTYP27</B>
	 */
	private java.lang.String _TENDTYP27;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND27</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND27 = "AMTTEND27";

	/**
	 * Atributo para manejar el campo <B>AMTTEND27</B>
	 * de la tabla <B>AMTTEND27</B>
	 */
	private java.lang.String _AMTTEND27;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDTYP28</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TENDTYP28 = "TENDTYP28";

	/**
	 * Atributo para manejar el campo <B>TENDTYP28</B>
	 * de la tabla <B>TENDTYP28</B>
	 */
	private java.lang.String _TENDTYP28;

	/**
	 * Atributo que contiene el nombre del campo <B>AMTTEND28</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String AMTTEND28 = "AMTTEND28";

	/**
	 * Atributo para manejar el campo <B>AMTTEND28</B>
	 * de la tabla <B>AMTTEND28</B>
	 */
	private java.lang.String _AMTTEND28;

	/**
	 * Atributo que contiene el nombre del campo <B>TIPO</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
	 */
	public static final String TIPO = "TIPO";

	/**
	 * Atributo para manejar el campo <B>TIPO</B>
	 * de la tabla <B>TIPO</B>
	 */
	private java.lang.String _TIPO;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_RECHAZO</B>
	 * de la tabla <B>TX_TILL_CHANGE</B>
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
	public TX_TILL_CHANGE_Imp() {
		super();
		start();
	}

	/**
	 * Crea un nuevo TX_TILL_CHANGE con los campos de la tabla
	 * @param pOFFSETY java.lang.String;
	 * @param pOFFSETX java.lang.String;
	 * @param pSTORE java.lang.String;
	 * @param pTERMINAL java.lang.String;
	 * @param pTRANSNUM java.lang.String;
	 * @param pDAY java.lang.String;
	 * @param pTIME java.lang.String;
	 * @param pNUMBERLOANS java.lang.String;
	 * @param pAMTLOANS java.lang.String;
	 * @param pNUMBERPKUPS java.lang.String;
	 * @param pAMTPKUPS java.lang.String;
	 * @param pTENDTYP11 java.lang.String;
	 * @param pAMTTEND11 java.lang.String;
	 * @param pTENDTYP12 java.lang.String;
	 * @param pAMTTEND12 java.lang.String;
	 * @param pTENDTYP13 java.lang.String;
	 * @param pAMTTEND13 java.lang.String;
	 * @param pTENDTYP14 java.lang.String;
	 * @param pAMTTEND14 java.lang.String;
	 * @param pTENDTYP15 java.lang.String;
	 * @param pAMTTEND15 java.lang.String;
	 * @param pTENDTYP16 java.lang.String;
	 * @param pAMTTEND16 java.lang.String;
	 * @param pTENDTYP17 java.lang.String;
	 * @param pAMTTEND17 java.lang.String;
	 * @param pTENDTYP18 java.lang.String;
	 * @param pAMTTEND18 java.lang.String;
	 * @param pTENDTYP21 java.lang.String;
	 * @param pAMTTEND21 java.lang.String;
	 * @param pTENDTYP22 java.lang.String;
	 * @param pAMTTEND22 java.lang.String;
	 * @param pTENDTYP23 java.lang.String;
	 * @param pAMTTEND23 java.lang.String;
	 * @param pTENDTYP24 java.lang.String;
	 * @param pAMTTEND24 java.lang.String;
	 * @param pTENDTYP25 java.lang.String;
	 * @param pAMTTEND25 java.lang.String;
	 * @param pTENDTYP26 java.lang.String;
	 * @param pAMTTEND26 java.lang.String;
	 * @param pTENDTYP27 java.lang.String;
	 * @param pAMTTEND27 java.lang.String;
	 * @param pTENDTYP28 java.lang.String;
	 * @param pAMTTEND28 java.lang.String;
	 * @param pTIPO java.lang.String;
	 * @param pID_RECHAZO java.lang.Double;
	 */
	public TX_TILL_CHANGE_Imp( java.lang.String pOFFSETY,java.lang.String pOFFSETX,java.lang.String pSTORE,java.lang.String pTERMINAL,java.lang.String pTRANSNUM,java.lang.String pDAY,java.lang.String pTIME,java.lang.String pNUMBERLOANS,java.lang.String pAMTLOANS,java.lang.String pNUMBERPKUPS,java.lang.String pAMTPKUPS,java.lang.String pTENDTYP11,java.lang.String pAMTTEND11,java.lang.String pTENDTYP12,java.lang.String pAMTTEND12,java.lang.String pTENDTYP13,java.lang.String pAMTTEND13,java.lang.String pTENDTYP14,java.lang.String pAMTTEND14,java.lang.String pTENDTYP15,java.lang.String pAMTTEND15,java.lang.String pTENDTYP16,java.lang.String pAMTTEND16,java.lang.String pTENDTYP17,java.lang.String pAMTTEND17,java.lang.String pTENDTYP18,java.lang.String pAMTTEND18,java.lang.String pTENDTYP21,java.lang.String pAMTTEND21,java.lang.String pTENDTYP22,java.lang.String pAMTTEND22,java.lang.String pTENDTYP23,java.lang.String pAMTTEND23,java.lang.String pTENDTYP24,java.lang.String pAMTTEND24,java.lang.String pTENDTYP25,java.lang.String pAMTTEND25,java.lang.String pTENDTYP26,java.lang.String pAMTTEND26,java.lang.String pTENDTYP27,java.lang.String pAMTTEND27,java.lang.String pTENDTYP28,java.lang.String pAMTTEND28,java.lang.String pTIPO,java.lang.Double pID_RECHAZO) { 
		this._OFFSETY = pOFFSETY;
		this._OFFSETX = pOFFSETX;
		this._STORE = pSTORE;
		this._TERMINAL = pTERMINAL;
		this._TRANSNUM = pTRANSNUM;
		this._DAY = pDAY;
		this._TIME = pTIME;
		this._NUMBERLOANS = pNUMBERLOANS;
		this._AMTLOANS = pAMTLOANS;
		this._NUMBERPKUPS = pNUMBERPKUPS;
		this._AMTPKUPS = pAMTPKUPS;
		this._TENDTYP11 = pTENDTYP11;
		this._AMTTEND11 = pAMTTEND11;
		this._TENDTYP12 = pTENDTYP12;
		this._AMTTEND12 = pAMTTEND12;
		this._TENDTYP13 = pTENDTYP13;
		this._AMTTEND13 = pAMTTEND13;
		this._TENDTYP14 = pTENDTYP14;
		this._AMTTEND14 = pAMTTEND14;
		this._TENDTYP15 = pTENDTYP15;
		this._AMTTEND15 = pAMTTEND15;
		this._TENDTYP16 = pTENDTYP16;
		this._AMTTEND16 = pAMTTEND16;
		this._TENDTYP17 = pTENDTYP17;
		this._AMTTEND17 = pAMTTEND17;
		this._TENDTYP18 = pTENDTYP18;
		this._AMTTEND18 = pAMTTEND18;
		this._TENDTYP21 = pTENDTYP21;
		this._AMTTEND21 = pAMTTEND21;
		this._TENDTYP22 = pTENDTYP22;
		this._AMTTEND22 = pAMTTEND22;
		this._TENDTYP23 = pTENDTYP23;
		this._AMTTEND23 = pAMTTEND23;
		this._TENDTYP24 = pTENDTYP24;
		this._AMTTEND24 = pAMTTEND24;
		this._TENDTYP25 = pTENDTYP25;
		this._AMTTEND25 = pAMTTEND25;
		this._TENDTYP26 = pTENDTYP26;
		this._AMTTEND26 = pAMTTEND26;
		this._TENDTYP27 = pTENDTYP27;
		this._AMTTEND27 = pAMTTEND27;
		this._TENDTYP28 = pTENDTYP28;
		this._AMTTEND28 = pAMTTEND28;
		this._TIPO = pTIPO;
		this._ID_RECHAZO = pID_RECHAZO;
	}

	/**
	 * Retorna el valor del atributo OFFSETY.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getOFFSETY(){
			return _OFFSETY;
	}

	/**
	 * Asigna el atributo OFFSETY
	 * Creation date: (02/13/2006
	 * @param newOFFSETY java.lang.String
	 */
	public void setOFFSETY(java.lang.String newOFFSETY) {
		_OFFSETY = newOFFSETY;
	}

	/**
	 * Retorna el valor del atributo OFFSETX.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getOFFSETX(){
			return _OFFSETX;
	}

	/**
	 * Asigna el atributo OFFSETX
	 * Creation date: (02/13/2006
	 * @param newOFFSETX java.lang.String
	 */
	public void setOFFSETX(java.lang.String newOFFSETX) {
		_OFFSETX = newOFFSETX;
	}

	/**
	 * Retorna el valor del atributo STORE.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getSTORE(){
			return _STORE;
	}

	/**
	 * Asigna el atributo STORE
	 * Creation date: (02/13/2006
	 * @param newSTORE java.lang.String
	 */
	public void setSTORE(java.lang.String newSTORE) {
		_STORE = newSTORE;
	}

	/**
	 * Retorna el valor del atributo TERMINAL.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTERMINAL(){
			return _TERMINAL;
	}

	/**
	 * Asigna el atributo TERMINAL
	 * Creation date: (02/13/2006
	 * @param newTERMINAL java.lang.String
	 */
	public void setTERMINAL(java.lang.String newTERMINAL) {
		_TERMINAL = newTERMINAL;
	}

	/**
	 * Retorna el valor del atributo TRANSNUM.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTRANSNUM(){
			return _TRANSNUM;
	}

	/**
	 * Asigna el atributo TRANSNUM
	 * Creation date: (02/13/2006
	 * @param newTRANSNUM java.lang.String
	 */
	public void setTRANSNUM(java.lang.String newTRANSNUM) {
		_TRANSNUM = newTRANSNUM;
	}

	/**
	 * Retorna el valor del atributo DAY.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getDAY(){
			return _DAY;
	}

	/**
	 * Asigna el atributo DAY
	 * Creation date: (02/13/2006
	 * @param newDAY java.lang.String
	 */
	public void setDAY(java.lang.String newDAY) {
		_DAY = newDAY;
	}

	/**
	 * Retorna el valor del atributo TIME.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTIME(){
			return _TIME;
	}

	/**
	 * Asigna el atributo TIME
	 * Creation date: (02/13/2006
	 * @param newTIME java.lang.String
	 */
	public void setTIME(java.lang.String newTIME) {
		_TIME = newTIME;
	}

	/**
	 * Retorna el valor del atributo NUMBERLOANS.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getNUMBERLOANS(){
			return _NUMBERLOANS;
	}

	/**
	 * Asigna el atributo NUMBERLOANS
	 * Creation date: (02/13/2006
	 * @param newNUMBERLOANS java.lang.String
	 */
	public void setNUMBERLOANS(java.lang.String newNUMBERLOANS) {
		_NUMBERLOANS = newNUMBERLOANS;
	}

	/**
	 * Retorna el valor del atributo AMTLOANS.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTLOANS(){
			return _AMTLOANS;
	}

	/**
	 * Asigna el atributo AMTLOANS
	 * Creation date: (02/13/2006
	 * @param newAMTLOANS java.lang.String
	 */
	public void setAMTLOANS(java.lang.String newAMTLOANS) {
		_AMTLOANS = newAMTLOANS;
	}

	/**
	 * Retorna el valor del atributo NUMBERPKUPS.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getNUMBERPKUPS(){
			return _NUMBERPKUPS;
	}

	/**
	 * Asigna el atributo NUMBERPKUPS
	 * Creation date: (02/13/2006
	 * @param newNUMBERPKUPS java.lang.String
	 */
	public void setNUMBERPKUPS(java.lang.String newNUMBERPKUPS) {
		_NUMBERPKUPS = newNUMBERPKUPS;
	}

	/**
	 * Retorna el valor del atributo AMTPKUPS.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTPKUPS(){
			return _AMTPKUPS;
	}

	/**
	 * Asigna el atributo AMTPKUPS
	 * Creation date: (02/13/2006
	 * @param newAMTPKUPS java.lang.String
	 */
	public void setAMTPKUPS(java.lang.String newAMTPKUPS) {
		_AMTPKUPS = newAMTPKUPS;
	}

	/**
	 * Retorna el valor del atributo TENDTYP11.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP11(){
			return _TENDTYP11;
	}

	/**
	 * Asigna el atributo TENDTYP11
	 * Creation date: (02/13/2006
	 * @param newTENDTYP11 java.lang.String
	 */
	public void setTENDTYP11(java.lang.String newTENDTYP11) {
		_TENDTYP11 = newTENDTYP11;
	}

	/**
	 * Retorna el valor del atributo AMTTEND11.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND11(){
			return _AMTTEND11;
	}

	/**
	 * Asigna el atributo AMTTEND11
	 * Creation date: (02/13/2006
	 * @param newAMTTEND11 java.lang.String
	 */
	public void setAMTTEND11(java.lang.String newAMTTEND11) {
		_AMTTEND11 = newAMTTEND11;
	}

	/**
	 * Retorna el valor del atributo TENDTYP12.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP12(){
			return _TENDTYP12;
	}

	/**
	 * Asigna el atributo TENDTYP12
	 * Creation date: (02/13/2006
	 * @param newTENDTYP12 java.lang.String
	 */
	public void setTENDTYP12(java.lang.String newTENDTYP12) {
		_TENDTYP12 = newTENDTYP12;
	}

	/**
	 * Retorna el valor del atributo AMTTEND12.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND12(){
			return _AMTTEND12;
	}

	/**
	 * Asigna el atributo AMTTEND12
	 * Creation date: (02/13/2006
	 * @param newAMTTEND12 java.lang.String
	 */
	public void setAMTTEND12(java.lang.String newAMTTEND12) {
		_AMTTEND12 = newAMTTEND12;
	}

	/**
	 * Retorna el valor del atributo TENDTYP13.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP13(){
			return _TENDTYP13;
	}

	/**
	 * Asigna el atributo TENDTYP13
	 * Creation date: (02/13/2006
	 * @param newTENDTYP13 java.lang.String
	 */
	public void setTENDTYP13(java.lang.String newTENDTYP13) {
		_TENDTYP13 = newTENDTYP13;
	}

	/**
	 * Retorna el valor del atributo AMTTEND13.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND13(){
			return _AMTTEND13;
	}

	/**
	 * Asigna el atributo AMTTEND13
	 * Creation date: (02/13/2006
	 * @param newAMTTEND13 java.lang.String
	 */
	public void setAMTTEND13(java.lang.String newAMTTEND13) {
		_AMTTEND13 = newAMTTEND13;
	}

	/**
	 * Retorna el valor del atributo TENDTYP14.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP14(){
			return _TENDTYP14;
	}

	/**
	 * Asigna el atributo TENDTYP14
	 * Creation date: (02/13/2006
	 * @param newTENDTYP14 java.lang.String
	 */
	public void setTENDTYP14(java.lang.String newTENDTYP14) {
		_TENDTYP14 = newTENDTYP14;
	}

	/**
	 * Retorna el valor del atributo AMTTEND14.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND14(){
			return _AMTTEND14;
	}

	/**
	 * Asigna el atributo AMTTEND14
	 * Creation date: (02/13/2006
	 * @param newAMTTEND14 java.lang.String
	 */
	public void setAMTTEND14(java.lang.String newAMTTEND14) {
		_AMTTEND14 = newAMTTEND14;
	}

	/**
	 * Retorna el valor del atributo TENDTYP15.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP15(){
			return _TENDTYP15;
	}

	/**
	 * Asigna el atributo TENDTYP15
	 * Creation date: (02/13/2006
	 * @param newTENDTYP15 java.lang.String
	 */
	public void setTENDTYP15(java.lang.String newTENDTYP15) {
		_TENDTYP15 = newTENDTYP15;
	}

	/**
	 * Retorna el valor del atributo AMTTEND15.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND15(){
			return _AMTTEND15;
	}

	/**
	 * Asigna el atributo AMTTEND15
	 * Creation date: (02/13/2006
	 * @param newAMTTEND15 java.lang.String
	 */
	public void setAMTTEND15(java.lang.String newAMTTEND15) {
		_AMTTEND15 = newAMTTEND15;
	}

	/**
	 * Retorna el valor del atributo TENDTYP16.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP16(){
			return _TENDTYP16;
	}

	/**
	 * Asigna el atributo TENDTYP16
	 * Creation date: (02/13/2006
	 * @param newTENDTYP16 java.lang.String
	 */
	public void setTENDTYP16(java.lang.String newTENDTYP16) {
		_TENDTYP16 = newTENDTYP16;
	}

	/**
	 * Retorna el valor del atributo AMTTEND16.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND16(){
			return _AMTTEND16;
	}

	/**
	 * Asigna el atributo AMTTEND16
	 * Creation date: (02/13/2006
	 * @param newAMTTEND16 java.lang.String
	 */
	public void setAMTTEND16(java.lang.String newAMTTEND16) {
		_AMTTEND16 = newAMTTEND16;
	}

	/**
	 * Retorna el valor del atributo TENDTYP17.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP17(){
			return _TENDTYP17;
	}

	/**
	 * Asigna el atributo TENDTYP17
	 * Creation date: (02/13/2006
	 * @param newTENDTYP17 java.lang.String
	 */
	public void setTENDTYP17(java.lang.String newTENDTYP17) {
		_TENDTYP17 = newTENDTYP17;
	}

	/**
	 * Retorna el valor del atributo AMTTEND17.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND17(){
			return _AMTTEND17;
	}

	/**
	 * Asigna el atributo AMTTEND17
	 * Creation date: (02/13/2006
	 * @param newAMTTEND17 java.lang.String
	 */
	public void setAMTTEND17(java.lang.String newAMTTEND17) {
		_AMTTEND17 = newAMTTEND17;
	}

	/**
	 * Retorna el valor del atributo TENDTYP18.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP18(){
			return _TENDTYP18;
	}

	/**
	 * Asigna el atributo TENDTYP18
	 * Creation date: (02/13/2006
	 * @param newTENDTYP18 java.lang.String
	 */
	public void setTENDTYP18(java.lang.String newTENDTYP18) {
		_TENDTYP18 = newTENDTYP18;
	}

	/**
	 * Retorna el valor del atributo AMTTEND18.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND18(){
			return _AMTTEND18;
	}

	/**
	 * Asigna el atributo AMTTEND18
	 * Creation date: (02/13/2006
	 * @param newAMTTEND18 java.lang.String
	 */
	public void setAMTTEND18(java.lang.String newAMTTEND18) {
		_AMTTEND18 = newAMTTEND18;
	}

	/**
	 * Retorna el valor del atributo TENDTYP21.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP21(){
			return _TENDTYP21;
	}

	/**
	 * Asigna el atributo TENDTYP21
	 * Creation date: (02/13/2006
	 * @param newTENDTYP21 java.lang.String
	 */
	public void setTENDTYP21(java.lang.String newTENDTYP21) {
		_TENDTYP21 = newTENDTYP21;
	}

	/**
	 * Retorna el valor del atributo AMTTEND21.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND21(){
			return _AMTTEND21;
	}

	/**
	 * Asigna el atributo AMTTEND21
	 * Creation date: (02/13/2006
	 * @param newAMTTEND21 java.lang.String
	 */
	public void setAMTTEND21(java.lang.String newAMTTEND21) {
		_AMTTEND21 = newAMTTEND21;
	}

	/**
	 * Retorna el valor del atributo TENDTYP22.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP22(){
			return _TENDTYP22;
	}

	/**
	 * Asigna el atributo TENDTYP22
	 * Creation date: (02/13/2006
	 * @param newTENDTYP22 java.lang.String
	 */
	public void setTENDTYP22(java.lang.String newTENDTYP22) {
		_TENDTYP22 = newTENDTYP22;
	}

	/**
	 * Retorna el valor del atributo AMTTEND22.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND22(){
			return _AMTTEND22;
	}

	/**
	 * Asigna el atributo AMTTEND22
	 * Creation date: (02/13/2006
	 * @param newAMTTEND22 java.lang.String
	 */
	public void setAMTTEND22(java.lang.String newAMTTEND22) {
		_AMTTEND22 = newAMTTEND22;
	}

	/**
	 * Retorna el valor del atributo TENDTYP23.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP23(){
			return _TENDTYP23;
	}

	/**
	 * Asigna el atributo TENDTYP23
	 * Creation date: (02/13/2006
	 * @param newTENDTYP23 java.lang.String
	 */
	public void setTENDTYP23(java.lang.String newTENDTYP23) {
		_TENDTYP23 = newTENDTYP23;
	}

	/**
	 * Retorna el valor del atributo AMTTEND23.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND23(){
			return _AMTTEND23;
	}

	/**
	 * Asigna el atributo AMTTEND23
	 * Creation date: (02/13/2006
	 * @param newAMTTEND23 java.lang.String
	 */
	public void setAMTTEND23(java.lang.String newAMTTEND23) {
		_AMTTEND23 = newAMTTEND23;
	}

	/**
	 * Retorna el valor del atributo TENDTYP24.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP24(){
			return _TENDTYP24;
	}

	/**
	 * Asigna el atributo TENDTYP24
	 * Creation date: (02/13/2006
	 * @param newTENDTYP24 java.lang.String
	 */
	public void setTENDTYP24(java.lang.String newTENDTYP24) {
		_TENDTYP24 = newTENDTYP24;
	}

	/**
	 * Retorna el valor del atributo AMTTEND24.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND24(){
			return _AMTTEND24;
	}

	/**
	 * Asigna el atributo AMTTEND24
	 * Creation date: (02/13/2006
	 * @param newAMTTEND24 java.lang.String
	 */
	public void setAMTTEND24(java.lang.String newAMTTEND24) {
		_AMTTEND24 = newAMTTEND24;
	}

	/**
	 * Retorna el valor del atributo TENDTYP25.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP25(){
			return _TENDTYP25;
	}

	/**
	 * Asigna el atributo TENDTYP25
	 * Creation date: (02/13/2006
	 * @param newTENDTYP25 java.lang.String
	 */
	public void setTENDTYP25(java.lang.String newTENDTYP25) {
		_TENDTYP25 = newTENDTYP25;
	}

	/**
	 * Retorna el valor del atributo AMTTEND25.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND25(){
			return _AMTTEND25;
	}

	/**
	 * Asigna el atributo AMTTEND25
	 * Creation date: (02/13/2006
	 * @param newAMTTEND25 java.lang.String
	 */
	public void setAMTTEND25(java.lang.String newAMTTEND25) {
		_AMTTEND25 = newAMTTEND25;
	}

	/**
	 * Retorna el valor del atributo TENDTYP26.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP26(){
			return _TENDTYP26;
	}

	/**
	 * Asigna el atributo TENDTYP26
	 * Creation date: (02/13/2006
	 * @param newTENDTYP26 java.lang.String
	 */
	public void setTENDTYP26(java.lang.String newTENDTYP26) {
		_TENDTYP26 = newTENDTYP26;
	}

	/**
	 * Retorna el valor del atributo AMTTEND26.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND26(){
			return _AMTTEND26;
	}

	/**
	 * Asigna el atributo AMTTEND26
	 * Creation date: (02/13/2006
	 * @param newAMTTEND26 java.lang.String
	 */
	public void setAMTTEND26(java.lang.String newAMTTEND26) {
		_AMTTEND26 = newAMTTEND26;
	}

	/**
	 * Retorna el valor del atributo TENDTYP27.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP27(){
			return _TENDTYP27;
	}

	/**
	 * Asigna el atributo TENDTYP27
	 * Creation date: (02/13/2006
	 * @param newTENDTYP27 java.lang.String
	 */
	public void setTENDTYP27(java.lang.String newTENDTYP27) {
		_TENDTYP27 = newTENDTYP27;
	}

	/**
	 * Retorna el valor del atributo AMTTEND27.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND27(){
			return _AMTTEND27;
	}

	/**
	 * Asigna el atributo AMTTEND27
	 * Creation date: (02/13/2006
	 * @param newAMTTEND27 java.lang.String
	 */
	public void setAMTTEND27(java.lang.String newAMTTEND27) {
		_AMTTEND27 = newAMTTEND27;
	}

	/**
	 * Retorna el valor del atributo TENDTYP28.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTENDTYP28(){
			return _TENDTYP28;
	}

	/**
	 * Asigna el atributo TENDTYP28
	 * Creation date: (02/13/2006
	 * @param newTENDTYP28 java.lang.String
	 */
	public void setTENDTYP28(java.lang.String newTENDTYP28) {
		_TENDTYP28 = newTENDTYP28;
	}

	/**
	 * Retorna el valor del atributo AMTTEND28.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getAMTTEND28(){
			return _AMTTEND28;
	}

	/**
	 * Asigna el atributo AMTTEND28
	 * Creation date: (02/13/2006
	 * @param newAMTTEND28 java.lang.String
	 */
	public void setAMTTEND28(java.lang.String newAMTTEND28) {
		_AMTTEND28 = newAMTTEND28;
	}

	/**
	 * Retorna el valor del atributo TIPO.
	 * Creation date: (02/13/2006
	 * @return java.lang.String
	 */
	public java.lang.String getTIPO(){
			return _TIPO;
	}

	/**
	 * Asigna el atributo TIPO
	 * Creation date: (02/13/2006
	 * @param newTIPO java.lang.String
	 */
	public void setTIPO(java.lang.String newTIPO) {
		_TIPO = newTIPO;
	}

	/**
	 * Retorna el valor del atributo ID_RECHAZO.
	 * Creation date: (02/13/2006
	 * @return java.lang.Double
	 */
	public java.lang.Double getID_RECHAZO(){
			return _ID_RECHAZO;
	}

	/**
	 * Asigna el atributo ID_RECHAZO
	 * Creation date: (02/13/2006
	 * @param newID_RECHAZO java.lang.Double
	 */
	public void setID_RECHAZO(java.lang.Double newID_RECHAZO) {
		_ID_RECHAZO = newID_RECHAZO;
	}

	/**
	 * Retorna el nombre de la tabla TX_TILL_CHANGE
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TX_TILL_CHANGE
	 */
	public void start() {
		String _fields[] = {OFFSETY,OFFSETX,STORE,TERMINAL,TRANSNUM,DAY,TIME,NUMBERLOANS,AMTLOANS,NUMBERPKUPS,AMTPKUPS,TENDTYP11,AMTTEND11,TENDTYP12,AMTTEND12,TENDTYP13,AMTTEND13,TENDTYP14,AMTTEND14,TENDTYP15,AMTTEND15,TENDTYP16,AMTTEND16,TENDTYP17,AMTTEND17,TENDTYP18,AMTTEND18,TENDTYP21,AMTTEND21,TENDTYP22,AMTTEND22,TENDTYP23,AMTTEND23,TENDTYP24,AMTTEND24,TENDTYP25,AMTTEND25,TENDTYP26,AMTTEND26,TENDTYP27,AMTTEND27,TENDTYP28,AMTTEND28,TIPO,ID_RECHAZO};
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
		} else if (field.equals(NUMBERLOANS)) {
			return _NUMBERLOANS;
		} else if (field.equals(AMTLOANS)) {
			return _AMTLOANS;
		} else if (field.equals(NUMBERPKUPS)) {
			return _NUMBERPKUPS;
		} else if (field.equals(AMTPKUPS)) {
			return _AMTPKUPS;
		} else if (field.equals(TENDTYP11)) {
			return _TENDTYP11;
		} else if (field.equals(AMTTEND11)) {
			return _AMTTEND11;
		} else if (field.equals(TENDTYP12)) {
			return _TENDTYP12;
		} else if (field.equals(AMTTEND12)) {
			return _AMTTEND12;
		} else if (field.equals(TENDTYP13)) {
			return _TENDTYP13;
		} else if (field.equals(AMTTEND13)) {
			return _AMTTEND13;
		} else if (field.equals(TENDTYP14)) {
			return _TENDTYP14;
		} else if (field.equals(AMTTEND14)) {
			return _AMTTEND14;
		} else if (field.equals(TENDTYP15)) {
			return _TENDTYP15;
		} else if (field.equals(AMTTEND15)) {
			return _AMTTEND15;
		} else if (field.equals(TENDTYP16)) {
			return _TENDTYP16;
		} else if (field.equals(AMTTEND16)) {
			return _AMTTEND16;
		} else if (field.equals(TENDTYP17)) {
			return _TENDTYP17;
		} else if (field.equals(AMTTEND17)) {
			return _AMTTEND17;
		} else if (field.equals(TENDTYP18)) {
			return _TENDTYP18;
		} else if (field.equals(AMTTEND18)) {
			return _AMTTEND18;
		} else if (field.equals(TENDTYP21)) {
			return _TENDTYP21;
		} else if (field.equals(AMTTEND21)) {
			return _AMTTEND21;
		} else if (field.equals(TENDTYP22)) {
			return _TENDTYP22;
		} else if (field.equals(AMTTEND22)) {
			return _AMTTEND22;
		} else if (field.equals(TENDTYP23)) {
			return _TENDTYP23;
		} else if (field.equals(AMTTEND23)) {
			return _AMTTEND23;
		} else if (field.equals(TENDTYP24)) {
			return _TENDTYP24;
		} else if (field.equals(AMTTEND24)) {
			return _AMTTEND24;
		} else if (field.equals(TENDTYP25)) {
			return _TENDTYP25;
		} else if (field.equals(AMTTEND25)) {
			return _AMTTEND25;
		} else if (field.equals(TENDTYP26)) {
			return _TENDTYP26;
		} else if (field.equals(AMTTEND26)) {
			return _AMTTEND26;
		} else if (field.equals(TENDTYP27)) {
			return _TENDTYP27;
		} else if (field.equals(AMTTEND27)) {
			return _AMTTEND27;
		} else if (field.equals(TENDTYP28)) {
			return _TENDTYP28;
		} else if (field.equals(AMTTEND28)) {
			return _AMTTEND28;
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
		} else if (field.equals(NUMBERLOANS)) {
			setNUMBERLOANS((java.lang.String) value );
		} else if (field.equals(AMTLOANS)) {
			setAMTLOANS((java.lang.String) value );
		} else if (field.equals(NUMBERPKUPS)) {
			setNUMBERPKUPS((java.lang.String) value );
		} else if (field.equals(AMTPKUPS)) {
			setAMTPKUPS((java.lang.String) value );
		} else if (field.equals(TENDTYP11)) {
			setTENDTYP11((java.lang.String) value );
		} else if (field.equals(AMTTEND11)) {
			setAMTTEND11((java.lang.String) value );
		} else if (field.equals(TENDTYP12)) {
			setTENDTYP12((java.lang.String) value );
		} else if (field.equals(AMTTEND12)) {
			setAMTTEND12((java.lang.String) value );
		} else if (field.equals(TENDTYP13)) {
			setTENDTYP13((java.lang.String) value );
		} else if (field.equals(AMTTEND13)) {
			setAMTTEND13((java.lang.String) value );
		} else if (field.equals(TENDTYP14)) {
			setTENDTYP14((java.lang.String) value );
		} else if (field.equals(AMTTEND14)) {
			setAMTTEND14((java.lang.String) value );
		} else if (field.equals(TENDTYP15)) {
			setTENDTYP15((java.lang.String) value );
		} else if (field.equals(AMTTEND15)) {
			setAMTTEND15((java.lang.String) value );
		} else if (field.equals(TENDTYP16)) {
			setTENDTYP16((java.lang.String) value );
		} else if (field.equals(AMTTEND16)) {
			setAMTTEND16((java.lang.String) value );
		} else if (field.equals(TENDTYP17)) {
			setTENDTYP17((java.lang.String) value );
		} else if (field.equals(AMTTEND17)) {
			setAMTTEND17((java.lang.String) value );
		} else if (field.equals(TENDTYP18)) {
			setTENDTYP18((java.lang.String) value );
		} else if (field.equals(AMTTEND18)) {
			setAMTTEND18((java.lang.String) value );
		} else if (field.equals(TENDTYP21)) {
			setTENDTYP21((java.lang.String) value );
		} else if (field.equals(AMTTEND21)) {
			setAMTTEND21((java.lang.String) value );
		} else if (field.equals(TENDTYP22)) {
			setTENDTYP22((java.lang.String) value );
		} else if (field.equals(AMTTEND22)) {
			setAMTTEND22((java.lang.String) value );
		} else if (field.equals(TENDTYP23)) {
			setTENDTYP23((java.lang.String) value );
		} else if (field.equals(AMTTEND23)) {
			setAMTTEND23((java.lang.String) value );
		} else if (field.equals(TENDTYP24)) {
			setTENDTYP24((java.lang.String) value );
		} else if (field.equals(AMTTEND24)) {
			setAMTTEND24((java.lang.String) value );
		} else if (field.equals(TENDTYP25)) {
			setTENDTYP25((java.lang.String) value );
		} else if (field.equals(AMTTEND25)) {
			setAMTTEND25((java.lang.String) value );
		} else if (field.equals(TENDTYP26)) {
			setTENDTYP26((java.lang.String) value );
		} else if (field.equals(AMTTEND26)) {
			setAMTTEND26((java.lang.String) value );
		} else if (field.equals(TENDTYP27)) {
			setTENDTYP27((java.lang.String) value );
		} else if (field.equals(AMTTEND27)) {
			setAMTTEND27((java.lang.String) value );
		} else if (field.equals(TENDTYP28)) {
			setTENDTYP28((java.lang.String) value );
		} else if (field.equals(AMTTEND28)) {
			setAMTTEND28((java.lang.String) value );
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
		} else if (field.equals(NUMBERLOANS)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTLOANS)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(NUMBERPKUPS)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTPKUPS)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP11)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND11)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP12)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND12)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP13)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND13)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP14)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND14)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP15)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND15)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP16)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND16)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP17)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND17)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP18)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND18)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP21)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND21)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP22)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND22)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP23)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND23)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP24)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND24)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP25)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND25)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP26)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND26)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP27)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND27)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDTYP28)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(AMTTEND28)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TIPO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ID_RECHAZO)) {
			return java.sql.Types.DECIMAL;
		}
		return 0;
	}
}
