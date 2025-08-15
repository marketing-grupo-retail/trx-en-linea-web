package com.grpretail.business.transacciones.vo;

import java.sql.Timestamp;

/**
 * @(#) ALMACEN.java
 * 
 * Copyright (c) 2002 ITFusion, All Rights Reserved.
 * 
 * Fecha Creación: 18/10/2004
 */ 

/**
 * Información
 * 
 * @author: null.
 * @version: null
 */

public interface STORE_CONCILIATION { 

	public abstract java.lang.Long getCUST_TICKET_NUM();

	/**
	 * @return
	 */
	public abstract java.lang.String getFECHAHORA_FIN();

	/**
	 * @return
	 */
	public abstract java.lang.String getFECHAHORA_INI();

	/**
	 * @return
	 */
	public abstract java.lang.Long getGROSS_SALES();

	/**
	 * @return
	 */
	public abstract java.lang.Long getITEMS_SOLDS_NUM();

	/**
	 * @return
	 */
	public abstract java.lang.Long getITM_GROSS_NEGAT();

	/**
	 * @return
	 */
	public abstract java.lang.Long getITM_GROSS_POSIT();

	/**
	 * @return
	 */
	public abstract java.lang.Long getMISCELLA_AMOUNT();

	/**
	 * @return
	 */
	public abstract java.lang.Long getREFUNDED_ITEMS();

	/**
	 * @return
	 */
	public abstract java.lang.Long getSTORE_COUPONS();

	/**
	 * @return
	 */
	public abstract java.lang.Integer getSTORE_ID();

	/**
	 * @return
	 */
	public abstract java.lang.Long getTOTAL_DISCOUNTS();

	/**
	 * @return
	 */
	public abstract java.lang.Long getVOIDED_ITEMS();

	/**
	 * @return
	 */
	public abstract java.lang.Long getVOIDED_TRXS_AMT();

	/**
	 * @param long1
	 */
	public abstract void setCUST_TICKET_NUM(java.lang.Long long1);

	/**
	 * @param string
	 */
	public abstract void setFECHAHORA_FIN(java.lang.String string);

	/**
	 * @param string
	 */
	public abstract void setFECHAHORA_INI(java.lang.String string);

	/**
	 * @param long1
	 */
	public abstract void setGROSS_SALES(java.lang.Long long1);

	/**
	 * @param long1
	 */
	public abstract void setITEMS_SOLDS_NUM(java.lang.Long long1);

	/**
	 * @param long1
	 */
	public abstract void setITM_GROSS_NEGAT(java.lang.Long long1);

	/**
	 * @param long1
	 */
	public abstract void setITM_GROSS_POSIT(java.lang.Long long1);

	/**
	 * @param long1
	 */
	public abstract void setMISCELLA_AMOUNT(java.lang.Long long1);

	/**
	 * @param long1
	 */
	public abstract void setREFUNDED_ITEMS(java.lang.Long long1);

	/**
	 * @param long1
	 */
	public abstract void setSTORE_COUPONS(java.lang.Long long1);

	/**
	 * @param integer
	 */
	public abstract void setSTORE_ID(java.lang.Integer integer);

	/**
	 * @param long1
	 */
	public abstract void setTOTAL_DISCOUNTS(java.lang.Long long1);

	/**
	 * @param long1
	 */
	public abstract void setVOIDED_ITEMS(java.lang.Long long1);

	/**
	 * @param long1
	 */
	public abstract void setVOIDED_TRXS_AMT(java.lang.Long long1);


}
