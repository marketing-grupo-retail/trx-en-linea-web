package com.asic.transacciones.vo;
/**
 * @(#) TX_HEADER.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 18/11/2005
 */ 

/**
 * Clase que permite acceso a la tabla TX_HEADER y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TX_HEADER_Imp extends jdao.data.DataAdv implements TX_HEADER, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TX_HEADER</B>
	 */
	public static final String NAME = "TX_HEADER";
	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETY</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String OFFSETY = "OFFSETY";

	/**
	 * Atributo para manejar el campo <B>OFFSETY</B>
	 * de la tabla <B>OFFSETY</B>
	 */
	private java.lang.String _OFFSETY;

	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETX</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String OFFSETX = "OFFSETX";

	/**
	 * Atributo para manejar el campo <B>OFFSETX</B>
	 * de la tabla <B>OFFSETX</B>
	 */
	private java.lang.String _OFFSETX;

	/**
	 * Atributo que contiene el nombre del campo <B>STORE</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String STORE = "STORE";

	/**
	 * Atributo para manejar el campo <B>STORE</B>
	 * de la tabla <B>STORE</B>
	 */
	private java.lang.String _STORE;

	/**
	 * Atributo que contiene el nombre del campo <B>TERMINAL</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String TERMINAL = "TERMINAL";

	/**
	 * Atributo para manejar el campo <B>TERMINAL</B>
	 * de la tabla <B>TERMINAL</B>
	 */
	private java.lang.String _TERMINAL;

	/**
	 * Atributo que contiene el nombre del campo <B>TRANSNUM</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String TRANSNUM = "TRANSNUM";

	/**
	 * Atributo para manejar el campo <B>TRANSNUM</B>
	 * de la tabla <B>TRANSNUM</B>
	 */
	private java.lang.String _TRANSNUM;

	/**
	 * Atributo que contiene el nombre del campo <B>DAY</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String DAY = "DAY";

	/**
	 * Atributo para manejar el campo <B>DAY</B>
	 * de la tabla <B>DAY</B>
	 */
	private java.lang.String _DAY;

	/**
	 * Atributo que contiene el nombre del campo <B>TIME</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.lang.String _TIME;

	/**
	 * Atributo que contiene el nombre del campo <B>TRANSTYPE</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String TRANSTYPE = "TRANSTYPE";

	/**
	 * Atributo para manejar el campo <B>TRANSTYPE</B>
	 * de la tabla <B>TRANSTYPE</B>
	 */
	private java.lang.String _TRANSTYPE;

	/**
	 * Atributo que contiene el nombre del campo <B>NUMSTRIN</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String NUMSTRIN = "NUMSTRIN";

	/**
	 * Atributo para manejar el campo <B>NUMSTRIN</B>
	 * de la tabla <B>NUMSTRIN</B>
	 */
	private java.lang.String _NUMSTRIN;

	/**
	 * Atributo que contiene el nombre del campo <B>OPERATOR</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String OPERATOR = "OPERATOR";

	/**
	 * Atributo para manejar el campo <B>OPERATOR</B>
	 * de la tabla <B>OPERATOR</B>
	 */
	private java.lang.String _OPERATOR;

	/**
	 * Atributo que contiene el nombre del campo <B>PASSWORD</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String PASSWORD = "PASSWORD";

	/**
	 * Atributo para manejar el campo <B>PASSWORD</B>
	 * de la tabla <B>PASSWORD</B>
	 */
	private java.lang.String _PASSWORD;

	/**
	 * Atributo que contiene el nombre del campo <B>GROSSPOS</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String GROSSPOS = "GROSSPOS";

	/**
	 * Atributo para manejar el campo <B>GROSSPOS</B>
	 * de la tabla <B>GROSSPOS</B>
	 */
	private java.lang.String _GROSSPOS;

	/**
	 * Atributo que contiene el nombre del campo <B>GROSSNEG</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String GROSSNEG = "GROSSNEG";

	/**
	 * Atributo para manejar el campo <B>GROSSNEG</B>
	 * de la tabla <B>GROSSNEG</B>
	 */
	private java.lang.String _GROSSNEG;

	/**
	 * Atributo que contiene el nombre del campo <B>RINGTIME</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String RINGTIME = "RINGTIME";

	/**
	 * Atributo para manejar el campo <B>RINGTIME</B>
	 * de la tabla <B>RINGTIME</B>
	 */
	private java.lang.String _RINGTIME;

	/**
	 * Atributo que contiene el nombre del campo <B>TENDERTI</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String TENDERTI = "TENDERTI";

	/**
	 * Atributo para manejar el campo <B>TENDERTI</B>
	 * de la tabla <B>TENDERTI</B>
	 */
	private java.lang.String _TENDERTI;

	/**
	 * Atributo que contiene el nombre del campo <B>SPECIAL</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String SPECIAL = "SPECIAL";

	/**
	 * Atributo para manejar el campo <B>SPECIAL</B>
	 * de la tabla <B>SPECIAL</B>
	 */
	private java.lang.String _SPECIAL;

	/**
	 * Atributo que contiene el nombre del campo <B>INACTIVE</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INACTIVE = "INACTIVE";

	/**
	 * Atributo para manejar el campo <B>INACTIVE</B>
	 * de la tabla <B>INACTIVE</B>
	 */
	private java.lang.String _INACTIVE;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT11</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT11 = "INDICAT11";

	/**
	 * Atributo para manejar el campo <B>INDICAT11</B>
	 * de la tabla <B>INDICAT11</B>
	 */
	private java.lang.String _INDICAT11;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT12</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT12 = "INDICAT12";

	/**
	 * Atributo para manejar el campo <B>INDICAT12</B>
	 * de la tabla <B>INDICAT12</B>
	 */
	private java.lang.String _INDICAT12;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT13</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT13 = "INDICAT13";

	/**
	 * Atributo para manejar el campo <B>INDICAT13</B>
	 * de la tabla <B>INDICAT13</B>
	 */
	private java.lang.String _INDICAT13;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT14</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT14 = "INDICAT14";

	/**
	 * Atributo para manejar el campo <B>INDICAT14</B>
	 * de la tabla <B>INDICAT14</B>
	 */
	private java.lang.String _INDICAT14;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT15</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT15 = "INDICAT15";

	/**
	 * Atributo para manejar el campo <B>INDICAT15</B>
	 * de la tabla <B>INDICAT15</B>
	 */
	private java.lang.String _INDICAT15;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT16</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT16 = "INDICAT16";

	/**
	 * Atributo para manejar el campo <B>INDICAT16</B>
	 * de la tabla <B>INDICAT16</B>
	 */
	private java.lang.String _INDICAT16;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT17</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT17 = "INDICAT17";

	/**
	 * Atributo para manejar el campo <B>INDICAT17</B>
	 * de la tabla <B>INDICAT17</B>
	 */
	private java.lang.String _INDICAT17;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT18</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT18 = "INDICAT18";

	/**
	 * Atributo para manejar el campo <B>INDICAT18</B>
	 * de la tabla <B>INDICAT18</B>
	 */
	private java.lang.String _INDICAT18;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT19</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT19 = "INDICAT19";

	/**
	 * Atributo para manejar el campo <B>INDICAT19</B>
	 * de la tabla <B>INDICAT19</B>
	 */
	private java.lang.String _INDICAT19;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT110</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT110 = "INDICAT110";

	/**
	 * Atributo para manejar el campo <B>INDICAT110</B>
	 * de la tabla <B>INDICAT110</B>
	 */
	private java.lang.String _INDICAT110;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT111</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT111 = "INDICAT111";

	/**
	 * Atributo para manejar el campo <B>INDICAT111</B>
	 * de la tabla <B>INDICAT111</B>
	 */
	private java.lang.String _INDICAT111;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT112</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT112 = "INDICAT112";

	/**
	 * Atributo para manejar el campo <B>INDICAT112</B>
	 * de la tabla <B>INDICAT112</B>
	 */
	private java.lang.String _INDICAT112;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT113</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT113 = "INDICAT113";

	/**
	 * Atributo para manejar el campo <B>INDICAT113</B>
	 * de la tabla <B>INDICAT113</B>
	 */
	private java.lang.String _INDICAT113;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT114</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT114 = "INDICAT114";

	/**
	 * Atributo para manejar el campo <B>INDICAT114</B>
	 * de la tabla <B>INDICAT114</B>
	 */
	private java.lang.String _INDICAT114;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT115</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT115 = "INDICAT115";

	/**
	 * Atributo para manejar el campo <B>INDICAT115</B>
	 * de la tabla <B>INDICAT115</B>
	 */
	private java.lang.String _INDICAT115;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT116</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT116 = "INDICAT116";

	/**
	 * Atributo para manejar el campo <B>INDICAT116</B>
	 * de la tabla <B>INDICAT116</B>
	 */
	private java.lang.String _INDICAT116;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT117</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT117 = "INDICAT117";

	/**
	 * Atributo para manejar el campo <B>INDICAT117</B>
	 * de la tabla <B>INDICAT117</B>
	 */
	private java.lang.String _INDICAT117;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT118</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT118 = "INDICAT118";

	/**
	 * Atributo para manejar el campo <B>INDICAT118</B>
	 * de la tabla <B>INDICAT118</B>
	 */
	private java.lang.String _INDICAT118;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT119</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT119 = "INDICAT119";

	/**
	 * Atributo para manejar el campo <B>INDICAT119</B>
	 * de la tabla <B>INDICAT119</B>
	 */
	private java.lang.String _INDICAT119;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT120</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT120 = "INDICAT120";

	/**
	 * Atributo para manejar el campo <B>INDICAT120</B>
	 * de la tabla <B>INDICAT120</B>
	 */
	private java.lang.String _INDICAT120;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT121</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT121 = "INDICAT121";

	/**
	 * Atributo para manejar el campo <B>INDICAT121</B>
	 * de la tabla <B>INDICAT121</B>
	 */
	private java.lang.String _INDICAT121;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT122</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT122 = "INDICAT122";

	/**
	 * Atributo para manejar el campo <B>INDICAT122</B>
	 * de la tabla <B>INDICAT122</B>
	 */
	private java.lang.String _INDICAT122;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT123</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT123 = "INDICAT123";

	/**
	 * Atributo para manejar el campo <B>INDICAT123</B>
	 * de la tabla <B>INDICAT123</B>
	 */
	private java.lang.String _INDICAT123;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT124</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT124 = "INDICAT124";

	/**
	 * Atributo para manejar el campo <B>INDICAT124</B>
	 * de la tabla <B>INDICAT124</B>
	 */
	private java.lang.String _INDICAT124;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT125</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT125 = "INDICAT125";

	/**
	 * Atributo para manejar el campo <B>INDICAT125</B>
	 * de la tabla <B>INDICAT125</B>
	 */
	private java.lang.String _INDICAT125;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT126</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT126 = "INDICAT126";

	/**
	 * Atributo para manejar el campo <B>INDICAT126</B>
	 * de la tabla <B>INDICAT126</B>
	 */
	private java.lang.String _INDICAT126;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT127</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT127 = "INDICAT127";

	/**
	 * Atributo para manejar el campo <B>INDICAT127</B>
	 * de la tabla <B>INDICAT127</B>
	 */
	private java.lang.String _INDICAT127;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT128</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT128 = "INDICAT128";

	/**
	 * Atributo para manejar el campo <B>INDICAT128</B>
	 * de la tabla <B>INDICAT128</B>
	 */
	private java.lang.String _INDICAT128;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT129</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT129 = "INDICAT129";

	/**
	 * Atributo para manejar el campo <B>INDICAT129</B>
	 * de la tabla <B>INDICAT129</B>
	 */
	private java.lang.String _INDICAT129;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT130</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT130 = "INDICAT130";

	/**
	 * Atributo para manejar el campo <B>INDICAT130</B>
	 * de la tabla <B>INDICAT130</B>
	 */
	private java.lang.String _INDICAT130;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT131</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT131 = "INDICAT131";

	/**
	 * Atributo para manejar el campo <B>INDICAT131</B>
	 * de la tabla <B>INDICAT131</B>
	 */
	private java.lang.String _INDICAT131;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT132</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String INDICAT132 = "INDICAT132";

	/**
	 * Atributo para manejar el campo <B>INDICAT132</B>
	 * de la tabla <B>INDICAT132</B>
	 */
	private java.lang.String _INDICAT132;

	/**
	 * Atributo que contiene el nombre del campo <B>TIPO</B>
	 * de la tabla <B>TX_HEADER</B>
	 */
	public static final String TIPO = "TIPO";

	/**
	 * Atributo para manejar el campo <B>TIPO</B>
	 * de la tabla <B>TIPO</B>
	 */
	private java.lang.String _TIPO;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_RECHAZO</B>
	 * de la tabla <B>TX_HEADER</B>
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
	public TX_HEADER_Imp() {
		super();
		start();
	}

	/**
	 * Crea un nuevo TX_HEADER con los campos de la tabla
	 * @param pOFFSETY java.lang.String;
	 * @param pOFFSETX java.lang.String;
	 * @param pSTORE java.lang.String;
	 * @param pTERMINAL java.lang.String;
	 * @param pTRANSNUM java.lang.String;
	 * @param pDAY java.lang.String;
	 * @param pTIME java.lang.String;
	 * @param pTRANSTYPE java.lang.String;
	 * @param pNUMSTRIN java.lang.String;
	 * @param pOPERATOR java.lang.String;
	 * @param pPASSWORD java.lang.String;
	 * @param pGROSSPOS java.lang.String;
	 * @param pGROSSNEG java.lang.String;
	 * @param pRINGTIME java.lang.String;
	 * @param pTENDERTI java.lang.String;
	 * @param pSPECIAL java.lang.String;
	 * @param pINACTIVE java.lang.String;
	 * @param pINDICAT11 java.lang.String;
	 * @param pINDICAT12 java.lang.String;
	 * @param pINDICAT13 java.lang.String;
	 * @param pINDICAT14 java.lang.String;
	 * @param pINDICAT15 java.lang.String;
	 * @param pINDICAT16 java.lang.String;
	 * @param pINDICAT17 java.lang.String;
	 * @param pINDICAT18 java.lang.String;
	 * @param pINDICAT19 java.lang.String;
	 * @param pINDICAT110 java.lang.String;
	 * @param pINDICAT111 java.lang.String;
	 * @param pINDICAT112 java.lang.String;
	 * @param pINDICAT113 java.lang.String;
	 * @param pINDICAT114 java.lang.String;
	 * @param pINDICAT115 java.lang.String;
	 * @param pINDICAT116 java.lang.String;
	 * @param pINDICAT117 java.lang.String;
	 * @param pINDICAT118 java.lang.String;
	 * @param pINDICAT119 java.lang.String;
	 * @param pINDICAT120 java.lang.String;
	 * @param pINDICAT121 java.lang.String;
	 * @param pINDICAT122 java.lang.String;
	 * @param pINDICAT123 java.lang.String;
	 * @param pINDICAT124 java.lang.String;
	 * @param pINDICAT125 java.lang.String;
	 * @param pINDICAT126 java.lang.String;
	 * @param pINDICAT127 java.lang.String;
	 * @param pINDICAT128 java.lang.String;
	 * @param pINDICAT129 java.lang.String;
	 * @param pINDICAT130 java.lang.String;
	 * @param pINDICAT131 java.lang.String;
	 * @param pINDICAT132 java.lang.String;
	 * @param pTIPO java.lang.String;
	 * @param pID_RECHAZO java.lang.Double;
	 */
	public TX_HEADER_Imp( java.lang.String pOFFSETY,java.lang.String pOFFSETX,java.lang.String pSTORE,java.lang.String pTERMINAL,java.lang.String pTRANSNUM,java.lang.String pDAY,java.lang.String pTIME,java.lang.String pTRANSTYPE,java.lang.String pNUMSTRIN,java.lang.String pOPERATOR,java.lang.String pPASSWORD,java.lang.String pGROSSPOS,java.lang.String pGROSSNEG,java.lang.String pRINGTIME,java.lang.String pTENDERTI,java.lang.String pSPECIAL,java.lang.String pINACTIVE,java.lang.String pINDICAT11,java.lang.String pINDICAT12,java.lang.String pINDICAT13,java.lang.String pINDICAT14,java.lang.String pINDICAT15,java.lang.String pINDICAT16,java.lang.String pINDICAT17,java.lang.String pINDICAT18,java.lang.String pINDICAT19,java.lang.String pINDICAT110,java.lang.String pINDICAT111,java.lang.String pINDICAT112,java.lang.String pINDICAT113,java.lang.String pINDICAT114,java.lang.String pINDICAT115,java.lang.String pINDICAT116,java.lang.String pINDICAT117,java.lang.String pINDICAT118,java.lang.String pINDICAT119,java.lang.String pINDICAT120,java.lang.String pINDICAT121,java.lang.String pINDICAT122,java.lang.String pINDICAT123,java.lang.String pINDICAT124,java.lang.String pINDICAT125,java.lang.String pINDICAT126,java.lang.String pINDICAT127,java.lang.String pINDICAT128,java.lang.String pINDICAT129,java.lang.String pINDICAT130,java.lang.String pINDICAT131,java.lang.String pINDICAT132,java.lang.String pTIPO,java.lang.Double pID_RECHAZO) { 
		this._OFFSETY = pOFFSETY;
		this._OFFSETX = pOFFSETX;
		this._STORE = pSTORE;
		this._TERMINAL = pTERMINAL;
		this._TRANSNUM = pTRANSNUM;
		this._DAY = pDAY;
		this._TIME = pTIME;
		this._TRANSTYPE = pTRANSTYPE;
		this._NUMSTRIN = pNUMSTRIN;
		this._OPERATOR = pOPERATOR;
		this._PASSWORD = pPASSWORD;
		this._GROSSPOS = pGROSSPOS;
		this._GROSSNEG = pGROSSNEG;
		this._RINGTIME = pRINGTIME;
		this._TENDERTI = pTENDERTI;
		this._SPECIAL = pSPECIAL;
		this._INACTIVE = pINACTIVE;
		this._INDICAT11 = pINDICAT11;
		this._INDICAT12 = pINDICAT12;
		this._INDICAT13 = pINDICAT13;
		this._INDICAT14 = pINDICAT14;
		this._INDICAT15 = pINDICAT15;
		this._INDICAT16 = pINDICAT16;
		this._INDICAT17 = pINDICAT17;
		this._INDICAT18 = pINDICAT18;
		this._INDICAT19 = pINDICAT19;
		this._INDICAT110 = pINDICAT110;
		this._INDICAT111 = pINDICAT111;
		this._INDICAT112 = pINDICAT112;
		this._INDICAT113 = pINDICAT113;
		this._INDICAT114 = pINDICAT114;
		this._INDICAT115 = pINDICAT115;
		this._INDICAT116 = pINDICAT116;
		this._INDICAT117 = pINDICAT117;
		this._INDICAT118 = pINDICAT118;
		this._INDICAT119 = pINDICAT119;
		this._INDICAT120 = pINDICAT120;
		this._INDICAT121 = pINDICAT121;
		this._INDICAT122 = pINDICAT122;
		this._INDICAT123 = pINDICAT123;
		this._INDICAT124 = pINDICAT124;
		this._INDICAT125 = pINDICAT125;
		this._INDICAT126 = pINDICAT126;
		this._INDICAT127 = pINDICAT127;
		this._INDICAT128 = pINDICAT128;
		this._INDICAT129 = pINDICAT129;
		this._INDICAT130 = pINDICAT130;
		this._INDICAT131 = pINDICAT131;
		this._INDICAT132 = pINDICAT132;
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
	 * Retorna el valor del atributo TRANSTYPE.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getTRANSTYPE(){
			return _TRANSTYPE;
	}

	/**
	 * Asigna el atributo TRANSTYPE
	 * Creation date: (11/18/2005
	 * @param newTRANSTYPE java.lang.String
	 */
	public void setTRANSTYPE(java.lang.String newTRANSTYPE) {
		_TRANSTYPE = newTRANSTYPE;
	}

	/**
	 * Retorna el valor del atributo NUMSTRIN.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getNUMSTRIN(){
			return _NUMSTRIN;
	}

	/**
	 * Asigna el atributo NUMSTRIN
	 * Creation date: (11/18/2005
	 * @param newNUMSTRIN java.lang.String
	 */
	public void setNUMSTRIN(java.lang.String newNUMSTRIN) {
		_NUMSTRIN = newNUMSTRIN;
	}

	/**
	 * Retorna el valor del atributo OPERATOR.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getOPERATOR(){
			return _OPERATOR;
	}

	/**
	 * Asigna el atributo OPERATOR
	 * Creation date: (11/18/2005
	 * @param newOPERATOR java.lang.String
	 */
	public void setOPERATOR(java.lang.String newOPERATOR) {
		_OPERATOR = newOPERATOR;
	}

	/**
	 * Retorna el valor del atributo PASSWORD.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getPASSWORD(){
			return _PASSWORD;
	}

	/**
	 * Asigna el atributo PASSWORD
	 * Creation date: (11/18/2005
	 * @param newPASSWORD java.lang.String
	 */
	public void setPASSWORD(java.lang.String newPASSWORD) {
		_PASSWORD = newPASSWORD;
	}

	/**
	 * Retorna el valor del atributo GROSSPOS.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getGROSSPOS(){
			return _GROSSPOS;
	}

	/**
	 * Asigna el atributo GROSSPOS
	 * Creation date: (11/18/2005
	 * @param newGROSSPOS java.lang.String
	 */
	public void setGROSSPOS(java.lang.String newGROSSPOS) {
		_GROSSPOS = newGROSSPOS;
	}

	/**
	 * Retorna el valor del atributo GROSSNEG.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getGROSSNEG(){
			return _GROSSNEG;
	}

	/**
	 * Asigna el atributo GROSSNEG
	 * Creation date: (11/18/2005
	 * @param newGROSSNEG java.lang.String
	 */
	public void setGROSSNEG(java.lang.String newGROSSNEG) {
		_GROSSNEG = newGROSSNEG;
	}

	/**
	 * Retorna el valor del atributo RINGTIME.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getRINGTIME(){
			return _RINGTIME;
	}

	/**
	 * Asigna el atributo RINGTIME
	 * Creation date: (11/18/2005
	 * @param newRINGTIME java.lang.String
	 */
	public void setRINGTIME(java.lang.String newRINGTIME) {
		_RINGTIME = newRINGTIME;
	}

	/**
	 * Retorna el valor del atributo TENDERTI.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getTENDERTI(){
			return _TENDERTI;
	}

	/**
	 * Asigna el atributo TENDERTI
	 * Creation date: (11/18/2005
	 * @param newTENDERTI java.lang.String
	 */
	public void setTENDERTI(java.lang.String newTENDERTI) {
		_TENDERTI = newTENDERTI;
	}

	/**
	 * Retorna el valor del atributo SPECIAL.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getSPECIAL(){
			return _SPECIAL;
	}

	/**
	 * Asigna el atributo SPECIAL
	 * Creation date: (11/18/2005
	 * @param newSPECIAL java.lang.String
	 */
	public void setSPECIAL(java.lang.String newSPECIAL) {
		_SPECIAL = newSPECIAL;
	}

	/**
	 * Retorna el valor del atributo INACTIVE.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINACTIVE(){
			return _INACTIVE;
	}

	/**
	 * Asigna el atributo INACTIVE
	 * Creation date: (11/18/2005
	 * @param newINACTIVE java.lang.String
	 */
	public void setINACTIVE(java.lang.String newINACTIVE) {
		_INACTIVE = newINACTIVE;
	}

	/**
	 * Retorna el valor del atributo INDICAT11.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT11(){
			return _INDICAT11;
	}

	/**
	 * Asigna el atributo INDICAT11
	 * Creation date: (11/18/2005
	 * @param newINDICAT11 java.lang.String
	 */
	public void setINDICAT11(java.lang.String newINDICAT11) {
		_INDICAT11 = newINDICAT11;
	}

	/**
	 * Retorna el valor del atributo INDICAT12.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT12(){
			return _INDICAT12;
	}

	/**
	 * Asigna el atributo INDICAT12
	 * Creation date: (11/18/2005
	 * @param newINDICAT12 java.lang.String
	 */
	public void setINDICAT12(java.lang.String newINDICAT12) {
		_INDICAT12 = newINDICAT12;
	}

	/**
	 * Retorna el valor del atributo INDICAT13.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT13(){
			return _INDICAT13;
	}

	/**
	 * Asigna el atributo INDICAT13
	 * Creation date: (11/18/2005
	 * @param newINDICAT13 java.lang.String
	 */
	public void setINDICAT13(java.lang.String newINDICAT13) {
		_INDICAT13 = newINDICAT13;
	}

	/**
	 * Retorna el valor del atributo INDICAT14.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT14(){
			return _INDICAT14;
	}

	/**
	 * Asigna el atributo INDICAT14
	 * Creation date: (11/18/2005
	 * @param newINDICAT14 java.lang.String
	 */
	public void setINDICAT14(java.lang.String newINDICAT14) {
		_INDICAT14 = newINDICAT14;
	}

	/**
	 * Retorna el valor del atributo INDICAT15.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT15(){
			return _INDICAT15;
	}

	/**
	 * Asigna el atributo INDICAT15
	 * Creation date: (11/18/2005
	 * @param newINDICAT15 java.lang.String
	 */
	public void setINDICAT15(java.lang.String newINDICAT15) {
		_INDICAT15 = newINDICAT15;
	}

	/**
	 * Retorna el valor del atributo INDICAT16.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT16(){
			return _INDICAT16;
	}

	/**
	 * Asigna el atributo INDICAT16
	 * Creation date: (11/18/2005
	 * @param newINDICAT16 java.lang.String
	 */
	public void setINDICAT16(java.lang.String newINDICAT16) {
		_INDICAT16 = newINDICAT16;
	}

	/**
	 * Retorna el valor del atributo INDICAT17.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT17(){
			return _INDICAT17;
	}

	/**
	 * Asigna el atributo INDICAT17
	 * Creation date: (11/18/2005
	 * @param newINDICAT17 java.lang.String
	 */
	public void setINDICAT17(java.lang.String newINDICAT17) {
		_INDICAT17 = newINDICAT17;
	}

	/**
	 * Retorna el valor del atributo INDICAT18.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT18(){
			return _INDICAT18;
	}

	/**
	 * Asigna el atributo INDICAT18
	 * Creation date: (11/18/2005
	 * @param newINDICAT18 java.lang.String
	 */
	public void setINDICAT18(java.lang.String newINDICAT18) {
		_INDICAT18 = newINDICAT18;
	}

	/**
	 * Retorna el valor del atributo INDICAT19.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT19(){
			return _INDICAT19;
	}

	/**
	 * Asigna el atributo INDICAT19
	 * Creation date: (11/18/2005
	 * @param newINDICAT19 java.lang.String
	 */
	public void setINDICAT19(java.lang.String newINDICAT19) {
		_INDICAT19 = newINDICAT19;
	}

	/**
	 * Retorna el valor del atributo INDICAT110.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT110(){
			return _INDICAT110;
	}

	/**
	 * Asigna el atributo INDICAT110
	 * Creation date: (11/18/2005
	 * @param newINDICAT110 java.lang.String
	 */
	public void setINDICAT110(java.lang.String newINDICAT110) {
		_INDICAT110 = newINDICAT110;
	}

	/**
	 * Retorna el valor del atributo INDICAT111.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT111(){
			return _INDICAT111;
	}

	/**
	 * Asigna el atributo INDICAT111
	 * Creation date: (11/18/2005
	 * @param newINDICAT111 java.lang.String
	 */
	public void setINDICAT111(java.lang.String newINDICAT111) {
		_INDICAT111 = newINDICAT111;
	}

	/**
	 * Retorna el valor del atributo INDICAT112.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT112(){
			return _INDICAT112;
	}

	/**
	 * Asigna el atributo INDICAT112
	 * Creation date: (11/18/2005
	 * @param newINDICAT112 java.lang.String
	 */
	public void setINDICAT112(java.lang.String newINDICAT112) {
		_INDICAT112 = newINDICAT112;
	}

	/**
	 * Retorna el valor del atributo INDICAT113.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT113(){
			return _INDICAT113;
	}

	/**
	 * Asigna el atributo INDICAT113
	 * Creation date: (11/18/2005
	 * @param newINDICAT113 java.lang.String
	 */
	public void setINDICAT113(java.lang.String newINDICAT113) {
		_INDICAT113 = newINDICAT113;
	}

	/**
	 * Retorna el valor del atributo INDICAT114.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT114(){
			return _INDICAT114;
	}

	/**
	 * Asigna el atributo INDICAT114
	 * Creation date: (11/18/2005
	 * @param newINDICAT114 java.lang.String
	 */
	public void setINDICAT114(java.lang.String newINDICAT114) {
		_INDICAT114 = newINDICAT114;
	}

	/**
	 * Retorna el valor del atributo INDICAT115.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT115(){
			return _INDICAT115;
	}

	/**
	 * Asigna el atributo INDICAT115
	 * Creation date: (11/18/2005
	 * @param newINDICAT115 java.lang.String
	 */
	public void setINDICAT115(java.lang.String newINDICAT115) {
		_INDICAT115 = newINDICAT115;
	}

	/**
	 * Retorna el valor del atributo INDICAT116.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT116(){
			return _INDICAT116;
	}

	/**
	 * Asigna el atributo INDICAT116
	 * Creation date: (11/18/2005
	 * @param newINDICAT116 java.lang.String
	 */
	public void setINDICAT116(java.lang.String newINDICAT116) {
		_INDICAT116 = newINDICAT116;
	}

	/**
	 * Retorna el valor del atributo INDICAT117.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT117(){
			return _INDICAT117;
	}

	/**
	 * Asigna el atributo INDICAT117
	 * Creation date: (11/18/2005
	 * @param newINDICAT117 java.lang.String
	 */
	public void setINDICAT117(java.lang.String newINDICAT117) {
		_INDICAT117 = newINDICAT117;
	}

	/**
	 * Retorna el valor del atributo INDICAT118.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT118(){
			return _INDICAT118;
	}

	/**
	 * Asigna el atributo INDICAT118
	 * Creation date: (11/18/2005
	 * @param newINDICAT118 java.lang.String
	 */
	public void setINDICAT118(java.lang.String newINDICAT118) {
		_INDICAT118 = newINDICAT118;
	}

	/**
	 * Retorna el valor del atributo INDICAT119.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT119(){
			return _INDICAT119;
	}

	/**
	 * Asigna el atributo INDICAT119
	 * Creation date: (11/18/2005
	 * @param newINDICAT119 java.lang.String
	 */
	public void setINDICAT119(java.lang.String newINDICAT119) {
		_INDICAT119 = newINDICAT119;
	}

	/**
	 * Retorna el valor del atributo INDICAT120.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT120(){
			return _INDICAT120;
	}

	/**
	 * Asigna el atributo INDICAT120
	 * Creation date: (11/18/2005
	 * @param newINDICAT120 java.lang.String
	 */
	public void setINDICAT120(java.lang.String newINDICAT120) {
		_INDICAT120 = newINDICAT120;
	}

	/**
	 * Retorna el valor del atributo INDICAT121.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT121(){
			return _INDICAT121;
	}

	/**
	 * Asigna el atributo INDICAT121
	 * Creation date: (11/18/2005
	 * @param newINDICAT121 java.lang.String
	 */
	public void setINDICAT121(java.lang.String newINDICAT121) {
		_INDICAT121 = newINDICAT121;
	}

	/**
	 * Retorna el valor del atributo INDICAT122.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT122(){
			return _INDICAT122;
	}

	/**
	 * Asigna el atributo INDICAT122
	 * Creation date: (11/18/2005
	 * @param newINDICAT122 java.lang.String
	 */
	public void setINDICAT122(java.lang.String newINDICAT122) {
		_INDICAT122 = newINDICAT122;
	}

	/**
	 * Retorna el valor del atributo INDICAT123.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT123(){
			return _INDICAT123;
	}

	/**
	 * Asigna el atributo INDICAT123
	 * Creation date: (11/18/2005
	 * @param newINDICAT123 java.lang.String
	 */
	public void setINDICAT123(java.lang.String newINDICAT123) {
		_INDICAT123 = newINDICAT123;
	}

	/**
	 * Retorna el valor del atributo INDICAT124.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT124(){
			return _INDICAT124;
	}

	/**
	 * Asigna el atributo INDICAT124
	 * Creation date: (11/18/2005
	 * @param newINDICAT124 java.lang.String
	 */
	public void setINDICAT124(java.lang.String newINDICAT124) {
		_INDICAT124 = newINDICAT124;
	}

	/**
	 * Retorna el valor del atributo INDICAT125.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT125(){
			return _INDICAT125;
	}

	/**
	 * Asigna el atributo INDICAT125
	 * Creation date: (11/18/2005
	 * @param newINDICAT125 java.lang.String
	 */
	public void setINDICAT125(java.lang.String newINDICAT125) {
		_INDICAT125 = newINDICAT125;
	}

	/**
	 * Retorna el valor del atributo INDICAT126.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT126(){
			return _INDICAT126;
	}

	/**
	 * Asigna el atributo INDICAT126
	 * Creation date: (11/18/2005
	 * @param newINDICAT126 java.lang.String
	 */
	public void setINDICAT126(java.lang.String newINDICAT126) {
		_INDICAT126 = newINDICAT126;
	}

	/**
	 * Retorna el valor del atributo INDICAT127.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT127(){
			return _INDICAT127;
	}

	/**
	 * Asigna el atributo INDICAT127
	 * Creation date: (11/18/2005
	 * @param newINDICAT127 java.lang.String
	 */
	public void setINDICAT127(java.lang.String newINDICAT127) {
		_INDICAT127 = newINDICAT127;
	}

	/**
	 * Retorna el valor del atributo INDICAT128.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT128(){
			return _INDICAT128;
	}

	/**
	 * Asigna el atributo INDICAT128
	 * Creation date: (11/18/2005
	 * @param newINDICAT128 java.lang.String
	 */
	public void setINDICAT128(java.lang.String newINDICAT128) {
		_INDICAT128 = newINDICAT128;
	}

	/**
	 * Retorna el valor del atributo INDICAT129.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT129(){
			return _INDICAT129;
	}

	/**
	 * Asigna el atributo INDICAT129
	 * Creation date: (11/18/2005
	 * @param newINDICAT129 java.lang.String
	 */
	public void setINDICAT129(java.lang.String newINDICAT129) {
		_INDICAT129 = newINDICAT129;
	}

	/**
	 * Retorna el valor del atributo INDICAT130.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT130(){
			return _INDICAT130;
	}

	/**
	 * Asigna el atributo INDICAT130
	 * Creation date: (11/18/2005
	 * @param newINDICAT130 java.lang.String
	 */
	public void setINDICAT130(java.lang.String newINDICAT130) {
		_INDICAT130 = newINDICAT130;
	}

	/**
	 * Retorna el valor del atributo INDICAT131.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT131(){
			return _INDICAT131;
	}

	/**
	 * Asigna el atributo INDICAT131
	 * Creation date: (11/18/2005
	 * @param newINDICAT131 java.lang.String
	 */
	public void setINDICAT131(java.lang.String newINDICAT131) {
		_INDICAT131 = newINDICAT131;
	}

	/**
	 * Retorna el valor del atributo INDICAT132.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT132(){
			return _INDICAT132;
	}

	/**
	 * Asigna el atributo INDICAT132
	 * Creation date: (11/18/2005
	 * @param newINDICAT132 java.lang.String
	 */
	public void setINDICAT132(java.lang.String newINDICAT132) {
		_INDICAT132 = newINDICAT132;
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
	 * Retorna el nombre de la tabla TX_HEADER
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TX_HEADER
	 */
	public void start() {
		String _fields[] = {OFFSETY,OFFSETX,STORE,TERMINAL,TRANSNUM,DAY,TIME,TRANSTYPE,NUMSTRIN,OPERATOR,PASSWORD,GROSSPOS,GROSSNEG,RINGTIME,TENDERTI,SPECIAL,INACTIVE,INDICAT11,INDICAT12,INDICAT13,INDICAT14,INDICAT15,INDICAT16,INDICAT17,INDICAT18,INDICAT19,INDICAT110,INDICAT111,INDICAT112,INDICAT113,INDICAT114,INDICAT115,INDICAT116,INDICAT117,INDICAT118,INDICAT119,INDICAT120,INDICAT121,INDICAT122,INDICAT123,INDICAT124,INDICAT125,INDICAT126,INDICAT127,INDICAT128,INDICAT129,INDICAT130,INDICAT131,INDICAT132,TIPO,ID_RECHAZO};
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
		} else if (field.equals(TRANSTYPE)) {
			return _TRANSTYPE;
		} else if (field.equals(NUMSTRIN)) {
			return _NUMSTRIN;
		} else if (field.equals(OPERATOR)) {
			return _OPERATOR;
		} else if (field.equals(PASSWORD)) {
			return _PASSWORD;
		} else if (field.equals(GROSSPOS)) {
			return _GROSSPOS;
		} else if (field.equals(GROSSNEG)) {
			return _GROSSNEG;
		} else if (field.equals(RINGTIME)) {
			return _RINGTIME;
		} else if (field.equals(TENDERTI)) {
			return _TENDERTI;
		} else if (field.equals(SPECIAL)) {
			return _SPECIAL;
		} else if (field.equals(INACTIVE)) {
			return _INACTIVE;
		} else if (field.equals(INDICAT11)) {
			return _INDICAT11;
		} else if (field.equals(INDICAT12)) {
			return _INDICAT12;
		} else if (field.equals(INDICAT13)) {
			return _INDICAT13;
		} else if (field.equals(INDICAT14)) {
			return _INDICAT14;
		} else if (field.equals(INDICAT15)) {
			return _INDICAT15;
		} else if (field.equals(INDICAT16)) {
			return _INDICAT16;
		} else if (field.equals(INDICAT17)) {
			return _INDICAT17;
		} else if (field.equals(INDICAT18)) {
			return _INDICAT18;
		} else if (field.equals(INDICAT19)) {
			return _INDICAT19;
		} else if (field.equals(INDICAT110)) {
			return _INDICAT110;
		} else if (field.equals(INDICAT111)) {
			return _INDICAT111;
		} else if (field.equals(INDICAT112)) {
			return _INDICAT112;
		} else if (field.equals(INDICAT113)) {
			return _INDICAT113;
		} else if (field.equals(INDICAT114)) {
			return _INDICAT114;
		} else if (field.equals(INDICAT115)) {
			return _INDICAT115;
		} else if (field.equals(INDICAT116)) {
			return _INDICAT116;
		} else if (field.equals(INDICAT117)) {
			return _INDICAT117;
		} else if (field.equals(INDICAT118)) {
			return _INDICAT118;
		} else if (field.equals(INDICAT119)) {
			return _INDICAT119;
		} else if (field.equals(INDICAT120)) {
			return _INDICAT120;
		} else if (field.equals(INDICAT121)) {
			return _INDICAT121;
		} else if (field.equals(INDICAT122)) {
			return _INDICAT122;
		} else if (field.equals(INDICAT123)) {
			return _INDICAT123;
		} else if (field.equals(INDICAT124)) {
			return _INDICAT124;
		} else if (field.equals(INDICAT125)) {
			return _INDICAT125;
		} else if (field.equals(INDICAT126)) {
			return _INDICAT126;
		} else if (field.equals(INDICAT127)) {
			return _INDICAT127;
		} else if (field.equals(INDICAT128)) {
			return _INDICAT128;
		} else if (field.equals(INDICAT129)) {
			return _INDICAT129;
		} else if (field.equals(INDICAT130)) {
			return _INDICAT130;
		} else if (field.equals(INDICAT131)) {
			return _INDICAT131;
		} else if (field.equals(INDICAT132)) {
			return _INDICAT132;
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
		} else if (field.equals(TRANSTYPE)) {
			setTRANSTYPE((java.lang.String) value );
		} else if (field.equals(NUMSTRIN)) {
			setNUMSTRIN((java.lang.String) value );
		} else if (field.equals(OPERATOR)) {
			setOPERATOR((java.lang.String) value );
		} else if (field.equals(PASSWORD)) {
			setPASSWORD((java.lang.String) value );
		} else if (field.equals(GROSSPOS)) {
			setGROSSPOS((java.lang.String) value );
		} else if (field.equals(GROSSNEG)) {
			setGROSSNEG((java.lang.String) value );
		} else if (field.equals(RINGTIME)) {
			setRINGTIME((java.lang.String) value );
		} else if (field.equals(TENDERTI)) {
			setTENDERTI((java.lang.String) value );
		} else if (field.equals(SPECIAL)) {
			setSPECIAL((java.lang.String) value );
		} else if (field.equals(INACTIVE)) {
			setINACTIVE((java.lang.String) value );
		} else if (field.equals(INDICAT11)) {
			setINDICAT11((java.lang.String) value );
		} else if (field.equals(INDICAT12)) {
			setINDICAT12((java.lang.String) value );
		} else if (field.equals(INDICAT13)) {
			setINDICAT13((java.lang.String) value );
		} else if (field.equals(INDICAT14)) {
			setINDICAT14((java.lang.String) value );
		} else if (field.equals(INDICAT15)) {
			setINDICAT15((java.lang.String) value );
		} else if (field.equals(INDICAT16)) {
			setINDICAT16((java.lang.String) value );
		} else if (field.equals(INDICAT17)) {
			setINDICAT17((java.lang.String) value );
		} else if (field.equals(INDICAT18)) {
			setINDICAT18((java.lang.String) value );
		} else if (field.equals(INDICAT19)) {
			setINDICAT19((java.lang.String) value );
		} else if (field.equals(INDICAT110)) {
			setINDICAT110((java.lang.String) value );
		} else if (field.equals(INDICAT111)) {
			setINDICAT111((java.lang.String) value );
		} else if (field.equals(INDICAT112)) {
			setINDICAT112((java.lang.String) value );
		} else if (field.equals(INDICAT113)) {
			setINDICAT113((java.lang.String) value );
		} else if (field.equals(INDICAT114)) {
			setINDICAT114((java.lang.String) value );
		} else if (field.equals(INDICAT115)) {
			setINDICAT115((java.lang.String) value );
		} else if (field.equals(INDICAT116)) {
			setINDICAT116((java.lang.String) value );
		} else if (field.equals(INDICAT117)) {
			setINDICAT117((java.lang.String) value );
		} else if (field.equals(INDICAT118)) {
			setINDICAT118((java.lang.String) value );
		} else if (field.equals(INDICAT119)) {
			setINDICAT119((java.lang.String) value );
		} else if (field.equals(INDICAT120)) {
			setINDICAT120((java.lang.String) value );
		} else if (field.equals(INDICAT121)) {
			setINDICAT121((java.lang.String) value );
		} else if (field.equals(INDICAT122)) {
			setINDICAT122((java.lang.String) value );
		} else if (field.equals(INDICAT123)) {
			setINDICAT123((java.lang.String) value );
		} else if (field.equals(INDICAT124)) {
			setINDICAT124((java.lang.String) value );
		} else if (field.equals(INDICAT125)) {
			setINDICAT125((java.lang.String) value );
		} else if (field.equals(INDICAT126)) {
			setINDICAT126((java.lang.String) value );
		} else if (field.equals(INDICAT127)) {
			setINDICAT127((java.lang.String) value );
		} else if (field.equals(INDICAT128)) {
			setINDICAT128((java.lang.String) value );
		} else if (field.equals(INDICAT129)) {
			setINDICAT129((java.lang.String) value );
		} else if (field.equals(INDICAT130)) {
			setINDICAT130((java.lang.String) value );
		} else if (field.equals(INDICAT131)) {
			setINDICAT131((java.lang.String) value );
		} else if (field.equals(INDICAT132)) {
			setINDICAT132((java.lang.String) value );
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
		} else if (field.equals(TRANSTYPE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(NUMSTRIN)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(OPERATOR)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(PASSWORD)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(GROSSPOS)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(GROSSNEG)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(RINGTIME)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TENDERTI)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(SPECIAL)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INACTIVE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT11)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT12)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT13)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT14)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT15)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT16)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT17)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT18)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT19)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT110)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT111)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT112)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT113)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT114)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT115)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT116)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT117)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT118)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT119)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT120)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT121)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT122)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT123)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT124)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT125)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT126)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT127)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT128)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT129)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT130)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT131)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT132)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TIPO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ID_RECHAZO)) {
			return java.sql.Types.DECIMAL;
		}
		return 0;
	}
}
