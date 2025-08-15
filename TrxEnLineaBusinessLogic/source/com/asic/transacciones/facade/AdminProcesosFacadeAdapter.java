/*
 * Proyecto: ASIC Admin Usuarios
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * All riths Reserved.
 *
 * $Id: AdminProcesosFacadeAdapter.java,v 1.1 2019/12/18 17:08:59 Alfonso Exp $
 *
 */
package com.asic.transacciones.facade;

import java.sql.Date;
import java.util.List;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.bean.AdminProcesosBean;
import com.asic.transacciones.bean.AdminUsuariosBean;
import com.asic.transacciones.delegate.AdminUsuariosBusinessDelegate;
import com.asic.transacciones.exception.InvalidAccessException;
import com.asic.transacciones.exception.UserUnknowException;
import com.asic.transacciones.proceso.ProcesoStopTrigger;
import com.asic.transacciones.vo.TX_PROCESO;
import com.asic.transacciones.vo.USUARIO;

/**
 * JDOC Class Def
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class AdminProcesosFacadeAdapter {
	
	
	public boolean getEstadoProcTrigger() throws ServiceException {
		AdminProcesosBean bean_ = new AdminProcesosBean();
		try {
			TX_PROCESO vo_ = bean_.getProceso(AdminProcesosBean.PROC_TRIGGER_MQ);
			
			if (vo_ != null)
				return vo_.getPROC_ESTADO().equals(ProcesoStopTrigger.INACTIVO);
			else
				throw new ServiceException("PROCESO STOP TRIGGER no se encontro registrado en el sistema.");

		} catch (ServiceException ex) {
			LogWriter.getLog().log(AdminProcesosFacadeAdapter.class, LogWriter.SEVERE, "En getEstadoProcTrigger() ]: " + ex.getRootCause(), ex);
			throw ex;
		}

		
	}

}