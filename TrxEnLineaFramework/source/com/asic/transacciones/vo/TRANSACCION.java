/*
 * Created on Dec 13, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public interface TRANSACCION extends Serializable{
	/**
	 * @return
	 */
	public abstract List getDataEntry();
	/**
	 * @return
	 */
	public abstract List getDiscount();
	/**
	 * @return
	 */
	public abstract List getExceptionLog();
	/**
	 * @return
	 */
	public abstract List getHeader();
	/**
	 * @return
	 */
	public abstract List getItemEntry();
	/**
	 * @return
	 */
	public abstract List getItemRecordChange();
	/**
	 * @return
	 */
	public abstract List getManagerOverride();
	/**
	 * @return
	 */
	public abstract List getPriceChange();
	/**
	 * @return
	 */
	public abstract List getStoreClosig();
	/**
	 * @return
	 */
	public abstract List getTax();
	/**
	 * @return
	 */
	public abstract List getTender();
	/**
	 * @return
	 */
	public abstract List getTillChange();
	/**
	 * @return
	 */
	public abstract List getTradingStamps();
	/**
	 * @return
	 */
	public abstract List getUserData();
	/**
	 * @param list
	 */
	public abstract void setDataEntry(List list);
	/**
	 * @param list
	 */
	public abstract void setDiscount(List list);
	/**
	 * @param list
	 */
	public abstract void setExceptionLog(List list);
	/**
	 * @param tx_header
	 */
	public abstract void setHeader(List tx_header);
	/**
	 * @param list
	 */
	public abstract void setItemEntry(List list);
	/**
	 * @param list
	 */
	public abstract void setItemRecordChange(List list);
	/**
	 * @param list
	 */
	public abstract void setManagerOverride(List list);
	/**
	 * @param list
	 */
	public abstract void setPriceChange(List list);
	/**
	 * @param list
	 */
	public abstract void setStoreClosig(List list);
	/**
	 * @param list
	 */
	public abstract void setTax(List list);
	/**
	 * @param list
	 */
	public abstract void setTender(List list);
	/**
	 * @param list
	 */
	public abstract void setTillChange(List list);
	/**
	 * @param list
	 */
	public abstract void setTradingStamps(List list);
	/**
	 * @param list
	 */
	public abstract void setUserData(List list);
	/**
	 * @return
	 */
	public abstract List getOperatorTraining();
	/**
	 * @param list
	 */
	public abstract void setOperatorTraining(List list);
	

}