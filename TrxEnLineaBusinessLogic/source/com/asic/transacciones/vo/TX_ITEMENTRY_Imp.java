package com.asic.transacciones.vo;
/**
 * @(#) TX_ITEMENTRY.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 18/11/2005
 */ 

/**
 * Clase que permite acceso a la tabla TX_ITEMENTRY y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;


public class TX_ITEMENTRY_Imp extends jdao.data.DataAdv implements TX_ITEMENTRY, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String NAME = "TX_ITEMENTRY";
	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETY</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String OFFSETY = "OFFSETY";

	/**
	 * Atributo para manejar el campo <B>OFFSETY</B>
	 * de la tabla <B>OFFSETY</B>
	 */
	private java.lang.String _OFFSETY;

	/**
	 * Atributo que contiene el nombre del campo <B>OFFSETX</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String OFFSETX = "OFFSETX";

	/**
	 * Atributo para manejar el campo <B>OFFSETX</B>
	 * de la tabla <B>OFFSETX</B>
	 */
	private java.lang.String _OFFSETX;

	/**
	 * Atributo que contiene el nombre del campo <B>STORE</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String STORE = "STORE";

	/**
	 * Atributo para manejar el campo <B>STORE</B>
	 * de la tabla <B>STORE</B>
	 */
	private java.lang.String _STORE;

	/**
	 * Atributo que contiene el nombre del campo <B>TERMINAL</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String TERMINAL = "TERMINAL";

	/**
	 * Atributo para manejar el campo <B>TERMINAL</B>
	 * de la tabla <B>TERMINAL</B>
	 */
	private java.lang.String _TERMINAL;

	/**
	 * Atributo que contiene el nombre del campo <B>TRANSNUM</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String TRANSNUM = "TRANSNUM";

	/**
	 * Atributo para manejar el campo <B>TRANSNUM</B>
	 * de la tabla <B>TRANSNUM</B>
	 */
	private java.lang.String _TRANSNUM;

	/**
	 * Atributo que contiene el nombre del campo <B>DAY</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String DAY = "DAY";

	/**
	 * Atributo para manejar el campo <B>DAY</B>
	 * de la tabla <B>DAY</B>
	 */
	private java.lang.String _DAY;

	/**
	 * Atributo que contiene el nombre del campo <B>TIME</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String TIME = "TIME";

	/**
	 * Atributo para manejar el campo <B>TIME</B>
	 * de la tabla <B>TIME</B>
	 */
	private java.lang.String _TIME;

	/**
	 * Atributo que contiene el nombre del campo <B>ITEMCODE</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String ITEMCODE = "ITEMCODE";

	/**
	 * Atributo para manejar el campo <B>ITEMCODE</B>
	 * de la tabla <B>ITEMCODE</B>
	 */
	private java.lang.String _ITEMCODE;

	/**
	 * Atributo que contiene el nombre del campo <B>XPRICE</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String XPRICE = "XPRICE";

	/**
	 * Atributo para manejar el campo <B>XPRICE</B>
	 * de la tabla <B>XPRICE</B>
	 */
	private java.lang.String _XPRICE;

	/**
	 * Atributo que contiene el nombre del campo <B>DEPARTME</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String DEPARTME = "DEPARTME";

	/**
	 * Atributo para manejar el campo <B>DEPARTME</B>
	 * de la tabla <B>DEPARTME</B>
	 */
	private java.lang.String _DEPARTME;

	/**
	 * Atributo que contiene el nombre del campo <B>FAMILYNU1</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String FAMILYNU1 = "FAMILYNU1";

	/**
	 * Atributo para manejar el campo <B>FAMILYNU1</B>
	 * de la tabla <B>FAMILYNU1</B>
	 */
	private java.lang.String _FAMILYNU1;

	/**
	 * Atributo que contiene el nombre del campo <B>FAMILYNU2</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String FAMILYNU2 = "FAMILYNU2";

	/**
	 * Atributo para manejar el campo <B>FAMILYNU2</B>
	 * de la tabla <B>FAMILYNU2</B>
	 */
	private java.lang.String _FAMILYNU2;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT11</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT11 = "INDICAT11";

	/**
	 * Atributo para manejar el campo <B>INDICAT11</B>
	 * de la tabla <B>INDICAT11</B>
	 */
	private java.lang.String _INDICAT11;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT12</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT12 = "INDICAT12";

	/**
	 * Atributo para manejar el campo <B>INDICAT12</B>
	 * de la tabla <B>INDICAT12</B>
	 */
	private java.lang.String _INDICAT12;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT13</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT13 = "INDICAT13";

	/**
	 * Atributo para manejar el campo <B>INDICAT13</B>
	 * de la tabla <B>INDICAT13</B>
	 */
	private java.lang.String _INDICAT13;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT14</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT14 = "INDICAT14";

	/**
	 * Atributo para manejar el campo <B>INDICAT14</B>
	 * de la tabla <B>INDICAT14</B>
	 */
	private java.lang.String _INDICAT14;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT15</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT15 = "INDICAT15";

	/**
	 * Atributo para manejar el campo <B>INDICAT15</B>
	 * de la tabla <B>INDICAT15</B>
	 */
	private java.lang.String _INDICAT15;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT16</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT16 = "INDICAT16";

	/**
	 * Atributo para manejar el campo <B>INDICAT16</B>
	 * de la tabla <B>INDICAT16</B>
	 */
	private java.lang.String _INDICAT16;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT17</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT17 = "INDICAT17";

	/**
	 * Atributo para manejar el campo <B>INDICAT17</B>
	 * de la tabla <B>INDICAT17</B>
	 */
	private java.lang.String _INDICAT17;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT18</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT18 = "INDICAT18";

	/**
	 * Atributo para manejar el campo <B>INDICAT18</B>
	 * de la tabla <B>INDICAT18</B>
	 */
	private java.lang.String _INDICAT18;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT19</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT19 = "INDICAT19";

	/**
	 * Atributo para manejar el campo <B>INDICAT19</B>
	 * de la tabla <B>INDICAT19</B>
	 */
	private java.lang.String _INDICAT19;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT110</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT110 = "INDICAT110";

	/**
	 * Atributo para manejar el campo <B>INDICAT110</B>
	 * de la tabla <B>INDICAT110</B>
	 */
	private java.lang.String _INDICAT110;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT111</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT111 = "INDICAT111";

	/**
	 * Atributo para manejar el campo <B>INDICAT111</B>
	 * de la tabla <B>INDICAT111</B>
	 */
	private java.lang.String _INDICAT111;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT112</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT112 = "INDICAT112";

	/**
	 * Atributo para manejar el campo <B>INDICAT112</B>
	 * de la tabla <B>INDICAT112</B>
	 */
	private java.lang.String _INDICAT112;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT113</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT113 = "INDICAT113";

	/**
	 * Atributo para manejar el campo <B>INDICAT113</B>
	 * de la tabla <B>INDICAT113</B>
	 */
	private java.lang.String _INDICAT113;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT114</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT114 = "INDICAT114";

	/**
	 * Atributo para manejar el campo <B>INDICAT114</B>
	 * de la tabla <B>INDICAT114</B>
	 */
	private java.lang.String _INDICAT114;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT115</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT115 = "INDICAT115";

	/**
	 * Atributo para manejar el campo <B>INDICAT115</B>
	 * de la tabla <B>INDICAT115</B>
	 */
	private java.lang.String _INDICAT115;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT116</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT116 = "INDICAT116";

	/**
	 * Atributo para manejar el campo <B>INDICAT116</B>
	 * de la tabla <B>INDICAT116</B>
	 */
	private java.lang.String _INDICAT116;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT21</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT21 = "INDICAT21";

	/**
	 * Atributo para manejar el campo <B>INDICAT21</B>
	 * de la tabla <B>INDICAT21</B>
	 */
	private java.lang.String _INDICAT21;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT22</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT22 = "INDICAT22";

	/**
	 * Atributo para manejar el campo <B>INDICAT22</B>
	 * de la tabla <B>INDICAT22</B>
	 */
	private java.lang.String _INDICAT22;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT23</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT23 = "INDICAT23";

	/**
	 * Atributo para manejar el campo <B>INDICAT23</B>
	 * de la tabla <B>INDICAT23</B>
	 */
	private java.lang.String _INDICAT23;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT24</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT24 = "INDICAT24";

	/**
	 * Atributo para manejar el campo <B>INDICAT24</B>
	 * de la tabla <B>INDICAT24</B>
	 */
	private java.lang.String _INDICAT24;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT25</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT25 = "INDICAT25";

	/**
	 * Atributo para manejar el campo <B>INDICAT25</B>
	 * de la tabla <B>INDICAT25</B>
	 */
	private java.lang.String _INDICAT25;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT26</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT26 = "INDICAT26";

	/**
	 * Atributo para manejar el campo <B>INDICAT26</B>
	 * de la tabla <B>INDICAT26</B>
	 */
	private java.lang.String _INDICAT26;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT27</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT27 = "INDICAT27";

	/**
	 * Atributo para manejar el campo <B>INDICAT27</B>
	 * de la tabla <B>INDICAT27</B>
	 */
	private java.lang.String _INDICAT27;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT28</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT28 = "INDICAT28";

	/**
	 * Atributo para manejar el campo <B>INDICAT28</B>
	 * de la tabla <B>INDICAT28</B>
	 */
	private java.lang.String _INDICAT28;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT29</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT29 = "INDICAT29";

	/**
	 * Atributo para manejar el campo <B>INDICAT29</B>
	 * de la tabla <B>INDICAT29</B>
	 */
	private java.lang.String _INDICAT29;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT210</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT210 = "INDICAT210";

	/**
	 * Atributo para manejar el campo <B>INDICAT210</B>
	 * de la tabla <B>INDICAT210</B>
	 */
	private java.lang.String _INDICAT210;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT211</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT211 = "INDICAT211";

	/**
	 * Atributo para manejar el campo <B>INDICAT211</B>
	 * de la tabla <B>INDICAT211</B>
	 */
	private java.lang.String _INDICAT211;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT212</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT212 = "INDICAT212";

	/**
	 * Atributo para manejar el campo <B>INDICAT212</B>
	 * de la tabla <B>INDICAT212</B>
	 */
	private java.lang.String _INDICAT212;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT213</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT213 = "INDICAT213";

	/**
	 * Atributo para manejar el campo <B>INDICAT213</B>
	 * de la tabla <B>INDICAT213</B>
	 */
	private java.lang.String _INDICAT213;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT214</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT214 = "INDICAT214";

	/**
	 * Atributo para manejar el campo <B>INDICAT214</B>
	 * de la tabla <B>INDICAT214</B>
	 */
	private java.lang.String _INDICAT214;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT215</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT215 = "INDICAT215";

	/**
	 * Atributo para manejar el campo <B>INDICAT215</B>
	 * de la tabla <B>INDICAT215</B>
	 */
	private java.lang.String _INDICAT215;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT216</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT216 = "INDICAT216";

	/**
	 * Atributo para manejar el campo <B>INDICAT216</B>
	 * de la tabla <B>INDICAT216</B>
	 */
	private java.lang.String _INDICAT216;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT31</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT31 = "INDICAT31";

	/**
	 * Atributo para manejar el campo <B>INDICAT31</B>
	 * de la tabla <B>INDICAT31</B>
	 */
	private java.lang.String _INDICAT31;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT32</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT32 = "INDICAT32";

	/**
	 * Atributo para manejar el campo <B>INDICAT32</B>
	 * de la tabla <B>INDICAT32</B>
	 */
	private java.lang.String _INDICAT32;

	/**
	 * Atributo que contiene el nombre del campo <B>MPGROUP</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String MPGROUP = "MPGROUP";

	/**
	 * Atributo para manejar el campo <B>MPGROUP</B>
	 * de la tabla <B>MPGROUP</B>
	 */
	private java.lang.String _MPGROUP;

	/**
	 * Atributo que contiene el nombre del campo <B>DEALQUAN</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String DEALQUAN = "DEALQUAN";

	/**
	 * Atributo para manejar el campo <B>DEALQUAN</B>
	 * de la tabla <B>DEALQUAN</B>
	 */
	private java.lang.String _DEALQUAN;

	/**
	 * Atributo que contiene el nombre del campo <B>PRICEMTH</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String PRICEMTH = "PRICEMTH";

	/**
	 * Atributo para manejar el campo <B>PRICEMTH</B>
	 * de la tabla <B>PRICEMTH</B>
	 */
	private java.lang.String _PRICEMTH;

	/**
	 * Atributo que contiene el nombre del campo <B>SALEQUAN</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String SALEQUAN = "SALEQUAN";

	/**
	 * Atributo para manejar el campo <B>SALEQUAN</B>
	 * de la tabla <B>SALEQUAN</B>
	 */
	private java.lang.String _SALEQUAN;

	/**
	 * Atributo que contiene el nombre del campo <B>SALEPRICE</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String SALEPRICE = "SALEPRICE";

	/**
	 * Atributo para manejar el campo <B>SALEPRICE</B>
	 * de la tabla <B>SALEPRICE</B>
	 */
	private java.lang.String _SALEPRICE;

	/**
	 * Atributo que contiene el nombre del campo <B>QTYORWGT</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String QTYORWGT = "QTYORWGT";

	/**
	 * Atributo para manejar el campo <B>QTYORWGT</B>
	 * de la tabla <B>QTYORWGT</B>
	 */
	private java.lang.String _QTYORWGT;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT41</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT41 = "INDICAT41";

	/**
	 * Atributo para manejar el campo <B>INDICAT41</B>
	 * de la tabla <B>INDICAT41</B>
	 */
	private java.lang.String _INDICAT41;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT42</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT42 = "INDICAT42";

	/**
	 * Atributo para manejar el campo <B>INDICAT42</B>
	 * de la tabla <B>INDICAT42</B>
	 */
	private java.lang.String _INDICAT42;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT43</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT43 = "INDICAT43";

	/**
	 * Atributo para manejar el campo <B>INDICAT43</B>
	 * de la tabla <B>INDICAT43</B>
	 */
	private java.lang.String _INDICAT43;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT44</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT44 = "INDICAT44";

	/**
	 * Atributo para manejar el campo <B>INDICAT44</B>
	 * de la tabla <B>INDICAT44</B>
	 */
	private java.lang.String _INDICAT44;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT45</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT45 = "INDICAT45";

	/**
	 * Atributo para manejar el campo <B>INDICAT45</B>
	 * de la tabla <B>INDICAT45</B>
	 */
	private java.lang.String _INDICAT45;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT46</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT46 = "INDICAT46";

	/**
	 * Atributo para manejar el campo <B>INDICAT46</B>
	 * de la tabla <B>INDICAT46</B>
	 */
	private java.lang.String _INDICAT46;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT47</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT47 = "INDICAT47";

	/**
	 * Atributo para manejar el campo <B>INDICAT47</B>
	 * de la tabla <B>INDICAT47</B>
	 */
	private java.lang.String _INDICAT47;

	/**
	 * Atributo que contiene el nombre del campo <B>INDICAT48</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String INDICAT48 = "INDICAT48";

	/**
	 * Atributo para manejar el campo <B>INDICAT48</B>
	 * de la tabla <B>INDICAT48</B>
	 */
	private java.lang.String _INDICAT48;

	/**
	 * Atributo que contiene el nombre del campo <B>PRCIVA</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String PRCIVA = "PRCIVA";

	/**
	 * Atributo para manejar el campo <B>PRCIVA</B>
	 * de la tabla <B>PRCIVA</B>
	 */
	private java.lang.String _PRCIVA;

	/**
	 * Atributo que contiene el nombre del campo <B>TIPO</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
	 */
	public static final String TIPO = "TIPO";

	/**
	 * Atributo para manejar el campo <B>TIPO</B>
	 * de la tabla <B>TIPO</B>
	 */
	private java.lang.String _TIPO;

	/**
	 * Atributo que contiene el nombre del campo <B>ID_RECHAZO</B>
	 * de la tabla <B>TX_ITEMENTRY</B>
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
	public TX_ITEMENTRY_Imp() {
		super();
		start();
	}

	/**
	 * Crea un nuevo TX_ITEMENTRY con los campos de la tabla
	 * @param pOFFSETY java.lang.String;
	 * @param pOFFSETX java.lang.String;
	 * @param pSTORE java.lang.String;
	 * @param pTERMINAL java.lang.String;
	 * @param pTRANSNUM java.lang.String;
	 * @param pDAY java.lang.String;
	 * @param pTIME java.lang.String;
	 * @param pITEMCODE java.lang.String;
	 * @param pXPRICE java.lang.String;
	 * @param pDEPARTME java.lang.String;
	 * @param pFAMILYNU1 java.lang.String;
	 * @param pFAMILYNU2 java.lang.String;
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
	 * @param pINDICAT21 java.lang.String;
	 * @param pINDICAT22 java.lang.String;
	 * @param pINDICAT23 java.lang.String;
	 * @param pINDICAT24 java.lang.String;
	 * @param pINDICAT25 java.lang.String;
	 * @param pINDICAT26 java.lang.String;
	 * @param pINDICAT27 java.lang.String;
	 * @param pINDICAT28 java.lang.String;
	 * @param pINDICAT29 java.lang.String;
	 * @param pINDICAT210 java.lang.String;
	 * @param pINDICAT211 java.lang.String;
	 * @param pINDICAT212 java.lang.String;
	 * @param pINDICAT213 java.lang.String;
	 * @param pINDICAT214 java.lang.String;
	 * @param pINDICAT215 java.lang.String;
	 * @param pINDICAT216 java.lang.String;
	 * @param pINDICAT31 java.lang.String;
	 * @param pINDICAT32 java.lang.String;
	 * @param pMPGROUP java.lang.String;
	 * @param pDEALQUAN java.lang.String;
	 * @param pPRICEMTH java.lang.String;
	 * @param pSALEQUAN java.lang.String;
	 * @param pSALEPRICE java.lang.String;
	 * @param pQTYORWGT java.lang.String;
	 * @param pINDICAT41 java.lang.String;
	 * @param pINDICAT42 java.lang.String;
	 * @param pINDICAT43 java.lang.String;
	 * @param pINDICAT44 java.lang.String;
	 * @param pINDICAT45 java.lang.String;
	 * @param pINDICAT46 java.lang.String;
	 * @param pINDICAT47 java.lang.String;
	 * @param pINDICAT48 java.lang.String;
	 * @param pPRCIVA java.lang.String;
	 * @param pTIPO java.lang.String;
	 * @param pID_RECHAZO java.lang.Double;
	 */
	public TX_ITEMENTRY_Imp( java.lang.String pOFFSETY,java.lang.String pOFFSETX,java.lang.String pSTORE,java.lang.String pTERMINAL,java.lang.String pTRANSNUM,java.lang.String pDAY,java.lang.String pTIME,java.lang.String pITEMCODE,java.lang.String pXPRICE,java.lang.String pDEPARTME,java.lang.String pFAMILYNU1,java.lang.String pFAMILYNU2,java.lang.String pINDICAT11,java.lang.String pINDICAT12,java.lang.String pINDICAT13,java.lang.String pINDICAT14,java.lang.String pINDICAT15,java.lang.String pINDICAT16,java.lang.String pINDICAT17,java.lang.String pINDICAT18,java.lang.String pINDICAT19,java.lang.String pINDICAT110,java.lang.String pINDICAT111,java.lang.String pINDICAT112,java.lang.String pINDICAT113,java.lang.String pINDICAT114,java.lang.String pINDICAT115,java.lang.String pINDICAT116,java.lang.String pINDICAT21,java.lang.String pINDICAT22,java.lang.String pINDICAT23,java.lang.String pINDICAT24,java.lang.String pINDICAT25,java.lang.String pINDICAT26,java.lang.String pINDICAT27,java.lang.String pINDICAT28,java.lang.String pINDICAT29,java.lang.String pINDICAT210,java.lang.String pINDICAT211,java.lang.String pINDICAT212,java.lang.String pINDICAT213,java.lang.String pINDICAT214,java.lang.String pINDICAT215,java.lang.String pINDICAT216,java.lang.String pINDICAT31,java.lang.String pINDICAT32,java.lang.String pMPGROUP,java.lang.String pDEALQUAN,java.lang.String pPRICEMTH,java.lang.String pSALEQUAN,java.lang.String pSALEPRICE,java.lang.String pQTYORWGT,java.lang.String pINDICAT41,java.lang.String pINDICAT42,java.lang.String pINDICAT43,java.lang.String pINDICAT44,java.lang.String pINDICAT45,java.lang.String pINDICAT46,java.lang.String pINDICAT47,java.lang.String pINDICAT48,java.lang.String pPRCIVA,java.lang.String pTIPO,java.lang.Double pID_RECHAZO) { 
		this._OFFSETY = pOFFSETY;
		this._OFFSETX = pOFFSETX;
		this._STORE = pSTORE;
		this._TERMINAL = pTERMINAL;
		this._TRANSNUM = pTRANSNUM;
		this._DAY = pDAY;
		this._TIME = pTIME;
		this._ITEMCODE = pITEMCODE;
		this._XPRICE = pXPRICE;
		this._DEPARTME = pDEPARTME;
		this._FAMILYNU1 = pFAMILYNU1;
		this._FAMILYNU2 = pFAMILYNU2;
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
		this._INDICAT21 = pINDICAT21;
		this._INDICAT22 = pINDICAT22;
		this._INDICAT23 = pINDICAT23;
		this._INDICAT24 = pINDICAT24;
		this._INDICAT25 = pINDICAT25;
		this._INDICAT26 = pINDICAT26;
		this._INDICAT27 = pINDICAT27;
		this._INDICAT28 = pINDICAT28;
		this._INDICAT29 = pINDICAT29;
		this._INDICAT210 = pINDICAT210;
		this._INDICAT211 = pINDICAT211;
		this._INDICAT212 = pINDICAT212;
		this._INDICAT213 = pINDICAT213;
		this._INDICAT214 = pINDICAT214;
		this._INDICAT215 = pINDICAT215;
		this._INDICAT216 = pINDICAT216;
		this._INDICAT31 = pINDICAT31;
		this._INDICAT32 = pINDICAT32;
		this._MPGROUP = pMPGROUP;
		this._DEALQUAN = pDEALQUAN;
		this._PRICEMTH = pPRICEMTH;
		this._SALEQUAN = pSALEQUAN;
		this._SALEPRICE = pSALEPRICE;
		this._QTYORWGT = pQTYORWGT;
		this._INDICAT41 = pINDICAT41;
		this._INDICAT42 = pINDICAT42;
		this._INDICAT43 = pINDICAT43;
		this._INDICAT44 = pINDICAT44;
		this._INDICAT45 = pINDICAT45;
		this._INDICAT46 = pINDICAT46;
		this._INDICAT47 = pINDICAT47;
		this._INDICAT48 = pINDICAT48;
		this._PRCIVA = pPRCIVA;
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
	 * Retorna el valor del atributo ITEMCODE.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getITEMCODE(){
			return _ITEMCODE;
	}

	/**
	 * Asigna el atributo ITEMCODE
	 * Creation date: (11/18/2005
	 * @param newITEMCODE java.lang.String
	 */
	public void setITEMCODE(java.lang.String newITEMCODE) {
		_ITEMCODE = newITEMCODE;
	}

	/**
	 * Retorna el valor del atributo XPRICE.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getXPRICE(){
			return _XPRICE;
	}

	/**
	 * Asigna el atributo XPRICE
	 * Creation date: (11/18/2005
	 * @param newXPRICE java.lang.String
	 */
	public void setXPRICE(java.lang.String newXPRICE) {
		_XPRICE = newXPRICE;
	}

	/**
	 * Retorna el valor del atributo DEPARTME.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getDEPARTME(){
			return _DEPARTME;
	}

	/**
	 * Asigna el atributo DEPARTME
	 * Creation date: (11/18/2005
	 * @param newDEPARTME java.lang.String
	 */
	public void setDEPARTME(java.lang.String newDEPARTME) {
		_DEPARTME = newDEPARTME;
	}

	/**
	 * Retorna el valor del atributo FAMILYNU1.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getFAMILYNU1(){
			return _FAMILYNU1;
	}

	/**
	 * Asigna el atributo FAMILYNU1
	 * Creation date: (11/18/2005
	 * @param newFAMILYNU1 java.lang.String
	 */
	public void setFAMILYNU1(java.lang.String newFAMILYNU1) {
		_FAMILYNU1 = newFAMILYNU1;
	}

	/**
	 * Retorna el valor del atributo FAMILYNU2.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getFAMILYNU2(){
			return _FAMILYNU2;
	}

	/**
	 * Asigna el atributo FAMILYNU2
	 * Creation date: (11/18/2005
	 * @param newFAMILYNU2 java.lang.String
	 */
	public void setFAMILYNU2(java.lang.String newFAMILYNU2) {
		_FAMILYNU2 = newFAMILYNU2;
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
	 * Retorna el valor del atributo INDICAT21.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT21(){
			return _INDICAT21;
	}

	/**
	 * Asigna el atributo INDICAT21
	 * Creation date: (11/18/2005
	 * @param newINDICAT21 java.lang.String
	 */
	public void setINDICAT21(java.lang.String newINDICAT21) {
		_INDICAT21 = newINDICAT21;
	}

	/**
	 * Retorna el valor del atributo INDICAT22.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT22(){
			return _INDICAT22;
	}

	/**
	 * Asigna el atributo INDICAT22
	 * Creation date: (11/18/2005
	 * @param newINDICAT22 java.lang.String
	 */
	public void setINDICAT22(java.lang.String newINDICAT22) {
		_INDICAT22 = newINDICAT22;
	}

	/**
	 * Retorna el valor del atributo INDICAT23.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT23(){
			return _INDICAT23;
	}

	/**
	 * Asigna el atributo INDICAT23
	 * Creation date: (11/18/2005
	 * @param newINDICAT23 java.lang.String
	 */
	public void setINDICAT23(java.lang.String newINDICAT23) {
		_INDICAT23 = newINDICAT23;
	}

	/**
	 * Retorna el valor del atributo INDICAT24.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT24(){
			return _INDICAT24;
	}

	/**
	 * Asigna el atributo INDICAT24
	 * Creation date: (11/18/2005
	 * @param newINDICAT24 java.lang.String
	 */
	public void setINDICAT24(java.lang.String newINDICAT24) {
		_INDICAT24 = newINDICAT24;
	}

	/**
	 * Retorna el valor del atributo INDICAT25.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT25(){
			return _INDICAT25;
	}

	/**
	 * Asigna el atributo INDICAT25
	 * Creation date: (11/18/2005
	 * @param newINDICAT25 java.lang.String
	 */
	public void setINDICAT25(java.lang.String newINDICAT25) {
		_INDICAT25 = newINDICAT25;
	}

	/**
	 * Retorna el valor del atributo INDICAT26.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT26(){
			return _INDICAT26;
	}

	/**
	 * Asigna el atributo INDICAT26
	 * Creation date: (11/18/2005
	 * @param newINDICAT26 java.lang.String
	 */
	public void setINDICAT26(java.lang.String newINDICAT26) {
		_INDICAT26 = newINDICAT26;
	}

	/**
	 * Retorna el valor del atributo INDICAT27.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT27(){
			return _INDICAT27;
	}

	/**
	 * Asigna el atributo INDICAT27
	 * Creation date: (11/18/2005
	 * @param newINDICAT27 java.lang.String
	 */
	public void setINDICAT27(java.lang.String newINDICAT27) {
		_INDICAT27 = newINDICAT27;
	}

	/**
	 * Retorna el valor del atributo INDICAT28.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT28(){
			return _INDICAT28;
	}

	/**
	 * Asigna el atributo INDICAT28
	 * Creation date: (11/18/2005
	 * @param newINDICAT28 java.lang.String
	 */
	public void setINDICAT28(java.lang.String newINDICAT28) {
		_INDICAT28 = newINDICAT28;
	}

	/**
	 * Retorna el valor del atributo INDICAT29.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT29(){
			return _INDICAT29;
	}

	/**
	 * Asigna el atributo INDICAT29
	 * Creation date: (11/18/2005
	 * @param newINDICAT29 java.lang.String
	 */
	public void setINDICAT29(java.lang.String newINDICAT29) {
		_INDICAT29 = newINDICAT29;
	}

	/**
	 * Retorna el valor del atributo INDICAT210.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT210(){
			return _INDICAT210;
	}

	/**
	 * Asigna el atributo INDICAT210
	 * Creation date: (11/18/2005
	 * @param newINDICAT210 java.lang.String
	 */
	public void setINDICAT210(java.lang.String newINDICAT210) {
		_INDICAT210 = newINDICAT210;
	}

	/**
	 * Retorna el valor del atributo INDICAT211.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT211(){
			return _INDICAT211;
	}

	/**
	 * Asigna el atributo INDICAT211
	 * Creation date: (11/18/2005
	 * @param newINDICAT211 java.lang.String
	 */
	public void setINDICAT211(java.lang.String newINDICAT211) {
		_INDICAT211 = newINDICAT211;
	}

	/**
	 * Retorna el valor del atributo INDICAT212.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT212(){
			return _INDICAT212;
	}

	/**
	 * Asigna el atributo INDICAT212
	 * Creation date: (11/18/2005
	 * @param newINDICAT212 java.lang.String
	 */
	public void setINDICAT212(java.lang.String newINDICAT212) {
		_INDICAT212 = newINDICAT212;
	}

	/**
	 * Retorna el valor del atributo INDICAT213.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT213(){
			return _INDICAT213;
	}

	/**
	 * Asigna el atributo INDICAT213
	 * Creation date: (11/18/2005
	 * @param newINDICAT213 java.lang.String
	 */
	public void setINDICAT213(java.lang.String newINDICAT213) {
		_INDICAT213 = newINDICAT213;
	}

	/**
	 * Retorna el valor del atributo INDICAT214.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT214(){
			return _INDICAT214;
	}

	/**
	 * Asigna el atributo INDICAT214
	 * Creation date: (11/18/2005
	 * @param newINDICAT214 java.lang.String
	 */
	public void setINDICAT214(java.lang.String newINDICAT214) {
		_INDICAT214 = newINDICAT214;
	}

	/**
	 * Retorna el valor del atributo INDICAT215.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT215(){
			return _INDICAT215;
	}

	/**
	 * Asigna el atributo INDICAT215
	 * Creation date: (11/18/2005
	 * @param newINDICAT215 java.lang.String
	 */
	public void setINDICAT215(java.lang.String newINDICAT215) {
		_INDICAT215 = newINDICAT215;
	}

	/**
	 * Retorna el valor del atributo INDICAT216.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT216(){
			return _INDICAT216;
	}

	/**
	 * Asigna el atributo INDICAT216
	 * Creation date: (11/18/2005
	 * @param newINDICAT216 java.lang.String
	 */
	public void setINDICAT216(java.lang.String newINDICAT216) {
		_INDICAT216 = newINDICAT216;
	}

	/**
	 * Retorna el valor del atributo INDICAT31.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT31(){
			return _INDICAT31;
	}

	/**
	 * Asigna el atributo INDICAT31
	 * Creation date: (11/18/2005
	 * @param newINDICAT31 java.lang.String
	 */
	public void setINDICAT31(java.lang.String newINDICAT31) {
		_INDICAT31 = newINDICAT31;
	}

	/**
	 * Retorna el valor del atributo INDICAT32.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT32(){
			return _INDICAT32;
	}

	/**
	 * Asigna el atributo INDICAT32
	 * Creation date: (11/18/2005
	 * @param newINDICAT32 java.lang.String
	 */
	public void setINDICAT32(java.lang.String newINDICAT32) {
		_INDICAT32 = newINDICAT32;
	}

	/**
	 * Retorna el valor del atributo MPGROUP.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getMPGROUP(){
			return _MPGROUP;
	}

	/**
	 * Asigna el atributo MPGROUP
	 * Creation date: (11/18/2005
	 * @param newMPGROUP java.lang.String
	 */
	public void setMPGROUP(java.lang.String newMPGROUP) {
		_MPGROUP = newMPGROUP;
	}

	/**
	 * Retorna el valor del atributo DEALQUAN.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getDEALQUAN(){
			return _DEALQUAN;
	}

	/**
	 * Asigna el atributo DEALQUAN
	 * Creation date: (11/18/2005
	 * @param newDEALQUAN java.lang.String
	 */
	public void setDEALQUAN(java.lang.String newDEALQUAN) {
		_DEALQUAN = newDEALQUAN;
	}

	/**
	 * Retorna el valor del atributo PRICEMTH.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getPRICEMTH(){
			return _PRICEMTH;
	}

	/**
	 * Asigna el atributo PRICEMTH
	 * Creation date: (11/18/2005
	 * @param newPRICEMTH java.lang.String
	 */
	public void setPRICEMTH(java.lang.String newPRICEMTH) {
		_PRICEMTH = newPRICEMTH;
	}

	/**
	 * Retorna el valor del atributo SALEQUAN.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getSALEQUAN(){
			return _SALEQUAN;
	}

	/**
	 * Asigna el atributo SALEQUAN
	 * Creation date: (11/18/2005
	 * @param newSALEQUAN java.lang.String
	 */
	public void setSALEQUAN(java.lang.String newSALEQUAN) {
		_SALEQUAN = newSALEQUAN;
	}

	/**
	 * Retorna el valor del atributo SALEPRICE.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getSALEPRICE(){
			return _SALEPRICE;
	}

	/**
	 * Asigna el atributo SALEPRICE
	 * Creation date: (11/18/2005
	 * @param newSALEPRICE java.lang.String
	 */
	public void setSALEPRICE(java.lang.String newSALEPRICE) {
		_SALEPRICE = newSALEPRICE;
	}

	/**
	 * Retorna el valor del atributo QTYORWGT.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getQTYORWGT(){
			return _QTYORWGT;
	}

	/**
	 * Asigna el atributo QTYORWGT
	 * Creation date: (11/18/2005
	 * @param newQTYORWGT java.lang.String
	 */
	public void setQTYORWGT(java.lang.String newQTYORWGT) {
		_QTYORWGT = newQTYORWGT;
	}

	/**
	 * Retorna el valor del atributo INDICAT41.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT41(){
			return _INDICAT41;
	}

	/**
	 * Asigna el atributo INDICAT41
	 * Creation date: (11/18/2005
	 * @param newINDICAT41 java.lang.String
	 */
	public void setINDICAT41(java.lang.String newINDICAT41) {
		_INDICAT41 = newINDICAT41;
	}

	/**
	 * Retorna el valor del atributo INDICAT42.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT42(){
			return _INDICAT42;
	}

	/**
	 * Asigna el atributo INDICAT42
	 * Creation date: (11/18/2005
	 * @param newINDICAT42 java.lang.String
	 */
	public void setINDICAT42(java.lang.String newINDICAT42) {
		_INDICAT42 = newINDICAT42;
	}

	/**
	 * Retorna el valor del atributo INDICAT43.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT43(){
			return _INDICAT43;
	}

	/**
	 * Asigna el atributo INDICAT43
	 * Creation date: (11/18/2005
	 * @param newINDICAT43 java.lang.String
	 */
	public void setINDICAT43(java.lang.String newINDICAT43) {
		_INDICAT43 = newINDICAT43;
	}

	/**
	 * Retorna el valor del atributo INDICAT44.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT44(){
			return _INDICAT44;
	}

	/**
	 * Asigna el atributo INDICAT44
	 * Creation date: (11/18/2005
	 * @param newINDICAT44 java.lang.String
	 */
	public void setINDICAT44(java.lang.String newINDICAT44) {
		_INDICAT44 = newINDICAT44;
	}

	/**
	 * Retorna el valor del atributo INDICAT45.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT45(){
			return _INDICAT45;
	}

	/**
	 * Asigna el atributo INDICAT45
	 * Creation date: (11/18/2005
	 * @param newINDICAT45 java.lang.String
	 */
	public void setINDICAT45(java.lang.String newINDICAT45) {
		_INDICAT45 = newINDICAT45;
	}

	/**
	 * Retorna el valor del atributo INDICAT46.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT46(){
			return _INDICAT46;
	}

	/**
	 * Asigna el atributo INDICAT46
	 * Creation date: (11/18/2005
	 * @param newINDICAT46 java.lang.String
	 */
	public void setINDICAT46(java.lang.String newINDICAT46) {
		_INDICAT46 = newINDICAT46;
	}

	/**
	 * Retorna el valor del atributo INDICAT47.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT47(){
			return _INDICAT47;
	}

	/**
	 * Asigna el atributo INDICAT47
	 * Creation date: (11/18/2005
	 * @param newINDICAT47 java.lang.String
	 */
	public void setINDICAT47(java.lang.String newINDICAT47) {
		_INDICAT47 = newINDICAT47;
	}

	/**
	 * Retorna el valor del atributo INDICAT48.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getINDICAT48(){
			return _INDICAT48;
	}

	/**
	 * Asigna el atributo INDICAT48
	 * Creation date: (11/18/2005
	 * @param newINDICAT48 java.lang.String
	 */
	public void setINDICAT48(java.lang.String newINDICAT48) {
		_INDICAT48 = newINDICAT48;
	}

	/**
	 * Retorna el valor del atributo PRCIVA.
	 * Creation date: (11/18/2005
	 * @return java.lang.String
	 */
	public java.lang.String getPRCIVA(){
			return _PRCIVA;
	}

	/**
	 * Asigna el atributo PRCIVA
	 * Creation date: (11/18/2005
	 * @param newPRCIVA java.lang.String
	 */
	public void setPRCIVA(java.lang.String newPRCIVA) {
		_PRCIVA = newPRCIVA;
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
	 * Retorna el nombre de la tabla TX_ITEMENTRY
	 * @return Nombre de la tabla 
	 */
	public String getTableName() {
		return NAME;
	}
	/**
	 * Inicia la configuracion de la tabla TX_ITEMENTRY
	 */
	public void start() {
		String _fields[] = {OFFSETY,OFFSETX,STORE,TERMINAL,TRANSNUM,DAY,TIME,ITEMCODE,XPRICE,DEPARTME,FAMILYNU1,FAMILYNU2,INDICAT11,INDICAT12,INDICAT13,INDICAT14,INDICAT15,INDICAT16,INDICAT17,INDICAT18,INDICAT19,INDICAT110,INDICAT111,INDICAT112,INDICAT113,INDICAT114,INDICAT115,INDICAT116,INDICAT21,INDICAT22,INDICAT23,INDICAT24,INDICAT25,INDICAT26,INDICAT27,INDICAT28,INDICAT29,INDICAT210,INDICAT211,INDICAT212,INDICAT213,INDICAT214,INDICAT215,INDICAT216,INDICAT31,INDICAT32,MPGROUP,DEALQUAN,PRICEMTH,SALEQUAN,SALEPRICE,QTYORWGT,INDICAT41,INDICAT42,INDICAT43,INDICAT44,INDICAT45,INDICAT46,INDICAT47,INDICAT48,PRCIVA,TIPO,ID_RECHAZO};
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
		} else if (field.equals(ITEMCODE)) {
			return _ITEMCODE;
		} else if (field.equals(XPRICE)) {
			return _XPRICE;
		} else if (field.equals(DEPARTME)) {
			return _DEPARTME;
		} else if (field.equals(FAMILYNU1)) {
			return _FAMILYNU1;
		} else if (field.equals(FAMILYNU2)) {
			return _FAMILYNU2;
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
		} else if (field.equals(INDICAT21)) {
			return _INDICAT21;
		} else if (field.equals(INDICAT22)) {
			return _INDICAT22;
		} else if (field.equals(INDICAT23)) {
			return _INDICAT23;
		} else if (field.equals(INDICAT24)) {
			return _INDICAT24;
		} else if (field.equals(INDICAT25)) {
			return _INDICAT25;
		} else if (field.equals(INDICAT26)) {
			return _INDICAT26;
		} else if (field.equals(INDICAT27)) {
			return _INDICAT27;
		} else if (field.equals(INDICAT28)) {
			return _INDICAT28;
		} else if (field.equals(INDICAT29)) {
			return _INDICAT29;
		} else if (field.equals(INDICAT210)) {
			return _INDICAT210;
		} else if (field.equals(INDICAT211)) {
			return _INDICAT211;
		} else if (field.equals(INDICAT212)) {
			return _INDICAT212;
		} else if (field.equals(INDICAT213)) {
			return _INDICAT213;
		} else if (field.equals(INDICAT214)) {
			return _INDICAT214;
		} else if (field.equals(INDICAT215)) {
			return _INDICAT215;
		} else if (field.equals(INDICAT216)) {
			return _INDICAT216;
		} else if (field.equals(INDICAT31)) {
			return _INDICAT31;
		} else if (field.equals(INDICAT32)) {
			return _INDICAT32;
		} else if (field.equals(MPGROUP)) {
			return _MPGROUP;
		} else if (field.equals(DEALQUAN)) {
			return _DEALQUAN;
		} else if (field.equals(PRICEMTH)) {
			return _PRICEMTH;
		} else if (field.equals(SALEQUAN)) {
			return _SALEQUAN;
		} else if (field.equals(SALEPRICE)) {
			return _SALEPRICE;
		} else if (field.equals(QTYORWGT)) {
			return _QTYORWGT;
		} else if (field.equals(INDICAT41)) {
			return _INDICAT41;
		} else if (field.equals(INDICAT42)) {
			return _INDICAT42;
		} else if (field.equals(INDICAT43)) {
			return _INDICAT43;
		} else if (field.equals(INDICAT44)) {
			return _INDICAT44;
		} else if (field.equals(INDICAT45)) {
			return _INDICAT45;
		} else if (field.equals(INDICAT46)) {
			return _INDICAT46;
		} else if (field.equals(INDICAT47)) {
			return _INDICAT47;
		} else if (field.equals(INDICAT48)) {
			return _INDICAT48;
		} else if (field.equals(PRCIVA)) {
			return _PRCIVA;
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
		} else if (field.equals(ITEMCODE)) {
			setITEMCODE((java.lang.String) value );
		} else if (field.equals(XPRICE)) {
			setXPRICE((java.lang.String) value );
		} else if (field.equals(DEPARTME)) {
			setDEPARTME((java.lang.String) value );
		} else if (field.equals(FAMILYNU1)) {
			setFAMILYNU1((java.lang.String) value );
		} else if (field.equals(FAMILYNU2)) {
			setFAMILYNU2((java.lang.String) value );
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
		} else if (field.equals(INDICAT21)) {
			setINDICAT21((java.lang.String) value );
		} else if (field.equals(INDICAT22)) {
			setINDICAT22((java.lang.String) value );
		} else if (field.equals(INDICAT23)) {
			setINDICAT23((java.lang.String) value );
		} else if (field.equals(INDICAT24)) {
			setINDICAT24((java.lang.String) value );
		} else if (field.equals(INDICAT25)) {
			setINDICAT25((java.lang.String) value );
		} else if (field.equals(INDICAT26)) {
			setINDICAT26((java.lang.String) value );
		} else if (field.equals(INDICAT27)) {
			setINDICAT27((java.lang.String) value );
		} else if (field.equals(INDICAT28)) {
			setINDICAT28((java.lang.String) value );
		} else if (field.equals(INDICAT29)) {
			setINDICAT29((java.lang.String) value );
		} else if (field.equals(INDICAT210)) {
			setINDICAT210((java.lang.String) value );
		} else if (field.equals(INDICAT211)) {
			setINDICAT211((java.lang.String) value );
		} else if (field.equals(INDICAT212)) {
			setINDICAT212((java.lang.String) value );
		} else if (field.equals(INDICAT213)) {
			setINDICAT213((java.lang.String) value );
		} else if (field.equals(INDICAT214)) {
			setINDICAT214((java.lang.String) value );
		} else if (field.equals(INDICAT215)) {
			setINDICAT215((java.lang.String) value );
		} else if (field.equals(INDICAT216)) {
			setINDICAT216((java.lang.String) value );
		} else if (field.equals(INDICAT31)) {
			setINDICAT31((java.lang.String) value );
		} else if (field.equals(INDICAT32)) {
			setINDICAT32((java.lang.String) value );
		} else if (field.equals(MPGROUP)) {
			setMPGROUP((java.lang.String) value );
		} else if (field.equals(DEALQUAN)) {
			setDEALQUAN((java.lang.String) value );
		} else if (field.equals(PRICEMTH)) {
			setPRICEMTH((java.lang.String) value );
		} else if (field.equals(SALEQUAN)) {
			setSALEQUAN((java.lang.String) value );
		} else if (field.equals(SALEPRICE)) {
			setSALEPRICE((java.lang.String) value );
		} else if (field.equals(QTYORWGT)) {
			setQTYORWGT((java.lang.String) value );
		} else if (field.equals(INDICAT41)) {
			setINDICAT41((java.lang.String) value );
		} else if (field.equals(INDICAT42)) {
			setINDICAT42((java.lang.String) value );
		} else if (field.equals(INDICAT43)) {
			setINDICAT43((java.lang.String) value );
		} else if (field.equals(INDICAT44)) {
			setINDICAT44((java.lang.String) value );
		} else if (field.equals(INDICAT45)) {
			setINDICAT45((java.lang.String) value );
		} else if (field.equals(INDICAT46)) {
			setINDICAT46((java.lang.String) value );
		} else if (field.equals(INDICAT47)) {
			setINDICAT47((java.lang.String) value );
		} else if (field.equals(INDICAT48)) {
			setINDICAT48((java.lang.String) value );
		} else if (field.equals(PRCIVA)) {
			setPRCIVA((java.lang.String) value );
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
		} else if (field.equals(ITEMCODE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(XPRICE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DEPARTME)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(FAMILYNU1)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(FAMILYNU2)) {
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
		} else if (field.equals(INDICAT21)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT22)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT23)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT24)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT25)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT26)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT27)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT28)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT29)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT210)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT211)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT212)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT213)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT214)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT215)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT216)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT31)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT32)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(MPGROUP)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(DEALQUAN)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(PRICEMTH)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(SALEQUAN)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(SALEPRICE)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(QTYORWGT)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT41)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT42)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT43)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT44)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT45)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT46)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT47)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(INDICAT48)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(PRCIVA)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(TIPO)) {
			return java.sql.Types.VARCHAR;
		} else if (field.equals(ID_RECHAZO)) {
			return java.sql.Types.DECIMAL;
		}
		return 0;
	}
}
