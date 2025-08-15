/*
 * Proyecto: VisaPagos
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * All riths Reserved.
 *
 * $Id: ProcesoStopTrigger.java,v 1.1 2019/12/18 17:08:59 Alfonso Exp $
 *
 */
package com.asic.transacciones.proceso;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.bean.AdminProcesosBean;
import com.asic.transacciones.util.Propiedad;
import com.asic.transacciones.vo.TX_PROCESO;

public class ProcesoStopTrigger extends Thread /*implements Serializable */ {

	private static boolean STOP = false;
	public final static String INACTIVO = "0";
	private boolean continuar = true;

	public ProcesoStopTrigger() throws ServiceException {

	}

	public void run() {
		AdminProcesosBean bean_ = new AdminProcesosBean();
		long pTiempo_ = Long.parseLong(Propiedad.getInstance().getPropiedad(Propiedad.TIEMPO_PROC_STOP, Propiedad.RESOURCE_BUNDLE_MSG));
		while (continuar) {

			try {
				TX_PROCESO vo_ = bean_.getProceso(AdminProcesosBean.PROC_TRIGGER_MQ);
				if (vo_ != null) {
					STOP = vo_.getPROC_ESTADO().equals(INACTIVO);

					if (STOP) {
						LogWriter.getLog().log(ProcesoStopTrigger.class, LogWriter.WARNING, "PROCESO DEL TRIGGER MQ INACTIVO...");
						//continuar = false;
					}
				}

			} catch (ServiceException ex) {
				LogWriter.getLog().log(ProcesoStopTrigger.class, LogWriter.SEVERE, "En ProcesoStopTrigger[ run() ]: " + ex.getRootCause(), ex);
			}

			try {
				Thread.sleep(pTiempo_);
			} catch (InterruptedException e) {
				LogWriter.getLog().log(ProcesoStopTrigger.class, LogWriter.SEVERE, "En ProcesoStopTrigger[ run() ]: " + e.getMessage(), e);
			}
		}

	}

	/**
	 * @return
	 */
	public static boolean isSTOP() {
		return STOP;
	}

	/**
	 * @param b
	 */
	public static void setSTOP(boolean b) {
		STOP = b;
	}

	/**
	 * @return
	 */
	public boolean isContinuar() {
		return continuar;
	}

	/**
	 * @param b
	 */
	public void setContinuar(boolean b) {
		continuar = b;
	}

}