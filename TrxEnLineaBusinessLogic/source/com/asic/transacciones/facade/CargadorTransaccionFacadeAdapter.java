/*
 * Created on Nov 29, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.facade;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class CargadorTransaccionFacadeAdapter {

	public static void main(String[] args) {
		ProcesarTransaccionFacadeAdapter adapter_ = new ProcesarTransaccionFacadeAdapter();
		try {
			adapter_.procesarTransaccion();
		} catch (ServiceException e) {
			LogWriter.getLog().log(CargadorTransaccionFacadeAdapter.class, LogWriter.SEVERE, "En [main(...)]: " + e.getMessage());
		}
	}
}
