/*
 * Proyecto: VisaPagos
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * All riths Reserved.
 *
 * $Id: GestorEmailLotusService.java,v 1.1 2019/12/18 17:09:00 Alfonso Exp $
 *
 */
package com.asic.framework.mail.lotus;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

import org.ramm.jwaf.logger.LogWriter;


import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.bean.AdminParametrosBean;
import com.asic.transacciones.vo.TX_PARAM_SIST;
import com.asic.transacciones.vo.TX_PARAM_SIST_Imp;

/**
 * Implementacion GestorEmail
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class GestorEmailLotusService {

	
	public GestorEmailLotusService()throws ServiceException{
		//configurarMailService();
	}

	
	public void enviarMensaje(Vector pDestino, Vector pMensaje, String pAsunto) throws ServiceException {
		LotusMailer mailer_ = new  LotusMailer();
		mailer_.initLotusMailer(configurarMailService());
		mailer_.sendMail(pDestino,pAsunto,pMensaje);
	}
	
	private EmailClientLotusConfig configurarMailService() throws ServiceException {
		EmailClientLotusConfig config = new EmailClientLotusConfig();
		try {
			AdminParametrosBean param_ = new AdminParametrosBean();
			TX_PARAM_SIST vo_ = new TX_PARAM_SIST_Imp();
			
			config.setServidor(param_.getParametro(AdminParametrosBean.HOST_MAIL).getPARAM_VLR());
			config.setPassword(param_.getParametro(AdminParametrosBean.CNT_ID_MAIL).getPARAM_VLR());
			config.setUserId(param_.getParametro(AdminParametrosBean.USER_ID_MAIL).getPARAM_VLR());
			config.setDbUser(param_.getParametro(AdminParametrosBean.DBUSER_MAIL).getPARAM_VLR());
			
		} catch (ServiceException e) {
			LogWriter.getLog().log(GestorEmailLotusService.class, LogWriter.SEVERE, "En [setMailConfig()]: " + e.getRootCause(), e);
			throw new ServiceException("Al intentar leer un parámetro del sistema necesario para el envio de correo electrónico", e);
		}
		return config;
		
	}
	

}