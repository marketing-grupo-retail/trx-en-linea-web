/*
 * Created on 08-nov-21
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.grpretail.trxonline.vos;

/**
 * @author Alfonso
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class StoreVo {
	long storeNumber;
	String name;
	
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return
	 */
	public long getStoreNumber() {
		return storeNumber;
	}

	/**
	 * @param string
	 */
	public void setName(String string) {
		name = string;
	}

	/**
	 * @param l
	 */
	public void setStoreNumber(long l) {
		storeNumber = l;
	}

}
