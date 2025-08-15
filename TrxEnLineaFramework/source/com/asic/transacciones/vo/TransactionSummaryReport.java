/*
 * Created on Dec 13, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.vo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public interface TransactionSummaryReport extends Serializable{
	public long getCustsnumber();

	/**
	 * @return
	 */
	public long getDiscsamt();

	/**
	 * @return
	 */
	public long getGrossneg();

	/**
	 * @return
	 */
	public long getGrosspos();

	/**
	 * @return
	 */
	public long getGrosssales();

	/**
	 * @return
	 */
	public Timestamp getInsertdate();

	/**
	 * @return
	 */
	public long getItemsnumber();

	/**
	 * @return
	 */
	public long getNetamount();

	/**
	 * @return
	 */
	public long getNetsales();

	/**
	 * @return
	 */
	public long getRefundsamt();

	/**
	 * @return
	 */
	public Timestamp getStorclosdate();

	/**
	 * @return
	 */
	public long getStore();

	/**
	 * @return
	 */
	public long getStorecoups();
	
	/**
	 * @return
	 */
	public long getVoidsamt();

	/**
	 * @return
	 */
	public long getVoidtrxsamt();

	/**
	 * @param l
	 */
	public void setCustsnumber(long l);

	/**
	 * @param l
	 */
	public void setDiscsamt(long l);

	/**
	 * @param l
	 */
	public void setGrossneg(long l);

	/**
	 * @param l
	 */
	public void setGrosspos(long l);

	/**
	 * @param l
	 */
	public void setGrosssales(long l);

	/**
	 * @param timestamp
	 */
	public void setInsertdate(Timestamp timestamp);

	/**
	 * @param l
	 */
	public void setItemsnumber(long l);

	/**
	 * @param l
	 */
	public void setNetamount(long l);

	/**
	 * @param l
	 */
	public void setNetsales(long l);

	/**
	 * @param l
	 */
	public void setRefundsamt(long l);

	/**
	 * @param timestamp
	 */
	public void setStorclosdate(Timestamp timestamp);

	/**
	 * @param l
	 */
	public void setStore(long l);

	/**
	 * @param l
	 */
	public void setStorecoups(long l);

	/**
	 * @param l
	 */
	public void setVoidsamt(long l);

	/**
	 * @param l
	 */
	public void setVoidtrxsamt(long l);

}