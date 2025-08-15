/*
 * Created on Dec 13, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.vo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TransactionSummaryReport_Imp implements TransactionSummaryReport {

	private long store; // Almacén
	private long grosssales; // Ventas brutas
	private long voidsamt; // Anulaciones
	private long refundsamt; // Devoluciones
	private long discsamt; // Descuentos
	private long netsales; // Ventas netas
	private long voidtrxsamt; // Monto trx anuladas
	private long grosspos; // Gross positivo
	private long grossneg; // Gross negativo
	private long netamount; //Monto neto // Monto Neto
	private long custsnumber; // Número de clientes
	private long itemsnumber; // Número de ítems
	private long storecoups; // Número de cupones de almacén
	private Timestamp storclosdate; // Store Closing Date
	private Timestamp insertdate;  // Fecha hora de inserción del registro
	
	/**
	 * @return
	 */
	public long getCustsnumber() {
		return custsnumber;
	}

	/**
	 * @return
	 */
	public long getDiscsamt() {
		return discsamt;
	}

	/**
	 * @return
	 */
	public long getGrossneg() {
		return grossneg;
	}

	/**
	 * @return
	 */
	public long getGrosspos() {
		return grosspos;
	}

	/**
	 * @return
	 */
	public long getGrosssales() {
		return grosssales;
	}

	/**
	 * @return
	 */
	public Timestamp getInsertdate() {
		return insertdate;
	}

	/**
	 * @return
	 */
	public long getItemsnumber() {
		return itemsnumber;
	}

	/**
	 * @return
	 */
	public long getNetamount() {
		return netamount;
	}

	/**
	 * @return
	 */
	public long getNetsales() {
		return netsales;
	}

	/**
	 * @return
	 */
	public long getRefundsamt() {
		return refundsamt;
	}

	/**
	 * @return
	 */
	public Timestamp getStorclosdate() {
		return storclosdate;
	}

	/**
	 * @return
	 */
	public long getStore() {
		return store;
	}

	/**
	 * @return
	 */
	public long getStorecoups() {
		return storecoups;
	}

	/**
	 * @return
	 */
	public long getVoidsamt() {
		return voidsamt;
	}

	/**
	 * @return
	 */
	public long getVoidtrxsamt() {
		return voidtrxsamt;
	}

	/**
	 * @param l
	 */
	public void setCustsnumber(long l) {
		custsnumber = l;
	}

	/**
	 * @param l
	 */
	public void setDiscsamt(long l) {
		discsamt = l;
	}

	/**
	 * @param l
	 */
	public void setGrossneg(long l) {
		grossneg = l;
	}

	/**
	 * @param l
	 */
	public void setGrosspos(long l) {
		grosspos = l;
	}

	/**
	 * @param l
	 */
	public void setGrosssales(long l) {
		grosssales = l;
	}

	/**
	 * @param timestamp
	 */
	public void setInsertdate(Timestamp timestamp) {
		insertdate = timestamp;
	}

	/**
	 * @param l
	 */
	public void setItemsnumber(long l) {
		itemsnumber = l;
	}

	/**
	 * @param l
	 */
	public void setNetamount(long l) {
		netamount = l;
	}

	/**
	 * @param l
	 */
	public void setNetsales(long l) {
		netsales = l;
	}

	/**
	 * @param l
	 */
	public void setRefundsamt(long l) {
		refundsamt = l;
	}

	/**
	 * @param timestamp
	 */
	public void setStorclosdate(Timestamp timestamp) {
		storclosdate = timestamp;
	}

	/**
	 * @param l
	 */
	public void setStore(long l) {
		store = l;
	}

	/**
	 * @param l
	 */
	public void setStorecoups(long l) {
		storecoups = l;
	}

	/**
	 * @param l
	 */
	public void setVoidsamt(long l) {
		voidsamt = l;
	}

	/**
	 * @param l
	 */
	public void setVoidtrxsamt(long l) {
		voidtrxsamt = l;
	}

}
