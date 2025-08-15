/*
 * Proyecto: VisaPagos
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * All riths Reserved.
 *
 * $Id: GestorEmailService.java,v 1.1 2019/12/18 17:08:59 Alfonso Exp $
 *
 */
package com.asic.framework.mail;

import java.util.Vector;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.bean.AdminParametrosBean;
import com.asic.transacciones.vo.TX_PARAM_SIST;
import com.asic.transacciones.vo.TX_PARAM_SIST_Imp;

public class GestorEmailService {

	private static String asunto;
	private static EmailClientConfig config;
	private static boolean debug = false;

	public GestorEmailService() throws ServiceException {
		if (config == null)
			configurarMailService();
		inicializarParametrosEmail();
	}

	private static void inicializarParametrosEmail() throws ServiceException {

		EmailClientService.init(config.getSnmp(), debug);
		EmailClientService.getInstance().setSnmp(config.getSnmp());
		EmailClientService.getInstance().setUser(config.getUser());
		EmailClientService.getInstance().setPassword(config.getPassword());
		EmailClientService.getInstance().setMailOwner(config.getMailOwner());

	}

	public void enviarMensaje(Vector pDestino, Vector pMensaje, String pAsunto) throws ServiceException {
		try {
			EmailClientService.getInstance().sendMail(pAsunto, EmailClientService.getInstance().getMailOwner(), pDestino, pMensaje, EmailClientService.TEXT_HTML_MIMETYPE);
		} catch (EmailClientException e) {
			LogWriter.getLog().log(GestorEmailService.class, LogWriter.SEVERE, "En [enviarMensaje()]: " + e.getRootCause(), e);
			throw new ServiceException("En enviar Mensaje con Asunto:" + pAsunto + " MailOwner:" + EmailClientService.getInstance().getMailOwner() + " Destino:" + pDestino.get(0) + " Mensaje:" + pMensaje, e);
		} catch (NullPointerException e) {
			LogWriter.getLog().log(GestorEmailService.class, LogWriter.SEVERE, "En enviar Mensaje con Asunto:" + pAsunto + " MailOwner:" + EmailClientService.getInstance().getMailOwner() + " Destino:" + pDestino.get(0) + " Mensaje:" + pMensaje + e.getMessage(), e);
		}
	}

	public static void setMailConfig(String pIpSmtp, String pCorreoUser, String pPassword, String pFrom) throws ServiceException {
		EmailClientConfig config = new EmailClientConfig();

		config.setSnmp(pIpSmtp);
		if (pCorreoUser != null)
			config.setUser(pCorreoUser);
		if (pPassword != null)
			config.setPassword(pPassword);
		config.setMailOwner(pFrom);

	}
	
	private void configurarMailService() throws ServiceException {
		
		config = new EmailClientConfig();
			try {
				AdminParametrosBean param_ = new AdminParametrosBean();
				TX_PARAM_SIST vo_ = new TX_PARAM_SIST_Imp();
			
				config.setSnmp(param_.getParametro(AdminParametrosBean.HOST_MAIL).getPARAM_VLR());
				config.setPassword(param_.getParametro(AdminParametrosBean.CNT_ID_MAIL).getPARAM_VLR());
				config.setMailOwner(param_.getParametro(AdminParametrosBean.USER_ID_MAIL).getPARAM_VLR());
				config.setUser(param_.getParametro(AdminParametrosBean.USER_ID_MAIL).getPARAM_VLR());
				LogWriter.getLog().log(GestorEmailService.class, LogWriter.INFO, "En [configurarMailService()]: Parametros de Servicio Correo configurados exitosamente.");
			
			} catch (ServiceException e) {
				LogWriter.getLog().log(GestorEmailService.class, LogWriter.SEVERE, "En [setMailConfig()]: " + e.getRootCause(), e);
				throw new ServiceException("Al intentar leer un parámetro del sistema necesario para el envio de correo electrónico", e);
			}
		
		
		}

}