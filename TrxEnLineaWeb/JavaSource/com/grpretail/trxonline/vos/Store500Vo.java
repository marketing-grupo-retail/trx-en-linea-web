/*
 * Created on 31/01/2023
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.grpretail.trxonline.vos;

/**
 * @author Usuario
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Store500Vo {
	long storeGrossSales;
	long storeVoids;
	long storeDiscounts;
	long storeTicketsNum;
	long storeSoldItemsNum;
	long storeMiscellaneousAmt;
	
	/**
	 * @return
	 */
	public Store500Vo(){
		storeGrossSales = -1;
		storeVoids = -1;
		storeDiscounts = -1;
		storeTicketsNum = -1;
		storeSoldItemsNum = -1;
		storeMiscellaneousAmt = -1;
	}
	
	public long getStoreDiscounts() {
		return storeDiscounts;
	}

	/**
	 * @return
	 */
	public long getStoreGrossSales() {
		return storeGrossSales;
	}

	/**
	 * @return
	 */
	public long getStoreMiscellaneousAmt() {
		return storeMiscellaneousAmt;
	}

	/**
	 * @return
	 */
	public long getStoreSoldItemsNum() {
		return storeSoldItemsNum;
	}

	/**
	 * @return
	 */
	public long getStoreTicketsNum() {
		return storeTicketsNum;
	}

	/**
	 * @return
	 */
	public long getStoreVoids() {
		return storeVoids;
	}

	/**
	 * @param l
	 */
	public void setStoreDiscounts(long l) {
		storeDiscounts = l;
	}

	/**
	 * @param l
	 */
	public void setStoreGrossSales(long l) {
		storeGrossSales = l;
	}

	/**
	 * @param l
	 */
	public void setStoreMiscellaneousAmt(long l) {
		storeMiscellaneousAmt = l;
	}

	/**
	 * @param l
	 */
	public void setStoreSoldItemsNum(long l) {
		storeSoldItemsNum = l;
	}

	/**
	 * @param l
	 */
	public void setStoreTicketsNum(long l) {
		storeTicketsNum = l;
	}

	/**
	 * @param l
	 */
	public void setStoreVoids(long l) {
		storeVoids = l;
	}

}
