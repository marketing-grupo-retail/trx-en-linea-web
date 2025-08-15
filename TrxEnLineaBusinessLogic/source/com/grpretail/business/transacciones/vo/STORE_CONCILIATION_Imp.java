package com.grpretail.business.transacciones.vo;

/**
 * @(#) ALMACEN.java
 * 
 * Copyright (c) 2004 ASIC, All Rights Reserved.
 * 
 * Fecha Creación: 18/10/2004
 */ 

/**
 * Clase que permite acceso a la tabla ALMACEN y a sus atributos.
 * 
 * @author: null.
 * @version: null
 */

import java.io.Serializable;
import java.sql.Timestamp;


public class STORE_CONCILIATION_Imp implements STORE_CONCILIATION, Serializable {


	/**
	 * Atributo que contiene el nombre de la tabla <B>ALMACEN</B>
	 */
	//public static final String NAME = "GROSS_POSITIVE";
	/**
	 * Atributo que contiene el nombre del campo <B>ID</B>
	 * de la tabla <B>ALMACEN</B>
	 */
	//public static final String VALUE = "VALUE";
	//public static final String DAY = "DAY";	
	//public static final String FECHAHORA = "TFECHAHORA";

	/**
	 * Atributo para manejar el campo <B>ID</B>
	 * de la tabla <B>ID</B>
	 */
	private java.lang.Integer STORE_ID;
	
	private java.lang.Long GROSS_SALES;
	private java.lang.Long VOIDED_ITEMS;
	private java.lang.Long REFUNDED_ITEMS;
	private java.lang.Long TOTAL_DISCOUNTS;
	private java.lang.Long MISCELLA_AMOUNT;
	private java.lang.Long VOIDED_TRXS_AMT;
	private java.lang.Long ITM_GROSS_POSIT;
	private java.lang.Long ITM_GROSS_NEGAT; 
	private java.lang.Long CUST_TICKET_NUM;
	private java.lang.Long STORE_COUPONS;
	private java.lang.Long ITEMS_SOLDS_NUM;
	private java.lang.String FECHAHORA_INI;
	private java.lang.String FECHAHORA_FIN;


	/**
	 * Metodo Constructor basico
	 */
	public STORE_CONCILIATION_Imp() {
		super();
		//start();
	}

/**
 * Crea un nuevo ALMACEN con los campos de la llave primaria
 * @param _ID java.lang.Integer;
 */

	/*
	public GROSS_POSITIVE_Imp( java.lang.Integer pCODCCO, java.sql.Timestamp pFECHAHORA, java.sql.Date pDAY) { 
		this._STORE = pCODCCO;
		this._FECHAHORA = pFECHAHORA;
		this._DAY = pDAY;
	}

	public String getTableName() {
		return NAME;
	}
	*/

	
	/**
	 * @return
	 */
	public java.lang.Long getCUST_TICKET_NUM() {
		return CUST_TICKET_NUM;
	}

	/**
	 * @return
	 */
	public java.lang.String getFECHAHORA_FIN() {
		return FECHAHORA_FIN;
	}

	/**
	 * @return
	 */
	public java.lang.String getFECHAHORA_INI() {
		return FECHAHORA_INI;
	}

	/**
	 * @return
	 */
	public java.lang.Long getGROSS_SALES() {
		return GROSS_SALES;
	}

	/**
	 * @return
	 */
	public java.lang.Long getITEMS_SOLDS_NUM() {
		return ITEMS_SOLDS_NUM;
	}

	/**
	 * @return
	 */
	public java.lang.Long getITM_GROSS_NEGAT() {
		return ITM_GROSS_NEGAT;
	}

	/**
	 * @return
	 */
	public java.lang.Long getITM_GROSS_POSIT() {
		return ITM_GROSS_POSIT;
	}

	/**
	 * @return
	 */
	public java.lang.Long getMISCELLA_AMOUNT() {
		return MISCELLA_AMOUNT;
	}

	/**
	 * @return
	 */
	public java.lang.Long getREFUNDED_ITEMS() {
		return REFUNDED_ITEMS;
	}

	/**
	 * @return
	 */
	public java.lang.Long getSTORE_COUPONS() {
		return STORE_COUPONS;
	}

	/**
	 * @return
	 */
	public java.lang.Integer getSTORE_ID() {
		return STORE_ID;
	}

	/**
	 * @return
	 */
	public java.lang.Long getTOTAL_DISCOUNTS() {
		return TOTAL_DISCOUNTS;
	}

	/**
	 * @return
	 */
	public java.lang.Long getVOIDED_ITEMS() {
		return VOIDED_ITEMS;
	}

	/**
	 * @return
	 */
	public java.lang.Long getVOIDED_TRXS_AMT() {
		return VOIDED_TRXS_AMT;
	}

	/**
	 * @param long1
	 */
	public void setCUST_TICKET_NUM(java.lang.Long long1) {
		CUST_TICKET_NUM = long1;
	}

	/**
	 * @param string
	 */
	public void setFECHAHORA_FIN(java.lang.String string) {
		FECHAHORA_FIN = string;
	}

	/**
	 * @param string
	 */
	public void setFECHAHORA_INI(java.lang.String string) {
		FECHAHORA_INI = string;
	}

	/**
	 * @param long1
	 */
	public void setGROSS_SALES(java.lang.Long long1) {
		GROSS_SALES = long1;
	}

	/**
	 * @param long1
	 */
	public void setITEMS_SOLDS_NUM(java.lang.Long long1) {
		ITEMS_SOLDS_NUM = long1;
	}

	/**
	 * @param long1
	 */
	public void setITM_GROSS_NEGAT(java.lang.Long long1) {
		ITM_GROSS_NEGAT = long1;
	}

	/**
	 * @param long1
	 */
	public void setITM_GROSS_POSIT(java.lang.Long long1) {
		ITM_GROSS_POSIT = long1;
	}

	/**
	 * @param long1
	 */
	public void setMISCELLA_AMOUNT(java.lang.Long long1) {
		MISCELLA_AMOUNT = long1;
	}

	/**
	 * @param long1
	 */
	public void setREFUNDED_ITEMS(java.lang.Long long1) {
		REFUNDED_ITEMS = long1;
	}

	/**
	 * @param long1
	 */
	public void setSTORE_COUPONS(java.lang.Long long1) {
		STORE_COUPONS = long1;
	}

	/**
	 * @param integer
	 */
	public void setSTORE_ID(java.lang.Integer integer) {
		STORE_ID = integer;
	}

	/**
	 * @param long1
	 */
	public void setTOTAL_DISCOUNTS(java.lang.Long long1) {
		TOTAL_DISCOUNTS = long1;
	}

	/**
	 * @param long1
	 */
	public void setVOIDED_ITEMS(java.lang.Long long1) {
		VOIDED_ITEMS = long1;
	}

	/**
	 * @param long1
	 */
	public void setVOIDED_TRXS_AMT(java.lang.Long long1) {
		VOIDED_TRXS_AMT = long1;
	}

}
