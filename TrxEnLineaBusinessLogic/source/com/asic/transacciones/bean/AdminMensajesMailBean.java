/*
 * Proyecto: ASICG
 * 
 * Copyright (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * All rights Reserved.
 * 
 * Id:
 * 
 */
package com.asic.transacciones.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

import org.ramm.jwaf.dbutil.DBUtil;
import org.ramm.jwaf.logger.LogWriter;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.mail.GestorEmailService;
import com.asic.framework.mail.lotus.GestorEmailLotusService;
import com.asic.framework.resources.ApplicationConfigFacadeAdapter;
import com.asic.framework.resources.ApplicationResources;
import com.asic.transacciones.vo.TX_EMAIL_CFG;
import com.asic.transacciones.vo.TX_EMAIL_CFG_Imp;
import com.asic.transacciones.vo.TX_PARAM_SIST;
import com.asic.transacciones.vo.TX_PARAM_SIST_Imp;


public class AdminMensajesMailBean {

	public final static Integer FALLO_CONX = new Integer(1);
	public final static Integer TRX_RECHAZADA = new Integer(2);
	public final static Integer FALLO_STORE_PROC = new Integer(3);

	private ApplicationConfigFacadeAdapter adapter_;

	public TX_EMAIL_CFG getMensaje(Integer pId) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		TX_EMAIL_CFG vo_ = new TX_EMAIL_CFG_Imp();
		try {

			List list_ = DBUtil.select("*", adapter_.getDBTrxOnlineOwner() + "TX_EMAIL_CFG p", "p.EMAIL_ID=" + pId.intValue(), TX_EMAIL_CFG_Imp.class, ApplicationResources.TXONLINE_DB);
			if (!list_.isEmpty())
				vo_ = (TX_EMAIL_CFG) list_.get(0);

			return vo_;

		} catch (ConnectionFailedException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getMensaje(...)]:" + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getMensaje(...)]:" + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}

	}

	public void enviarMensaje(Integer pId, Vector pMsgAdicional) /*throws ServiceException*/ {

		try {
			TX_EMAIL_CFG vo_ = getMensaje(pId);

			//GestorEmailLotusService sv_ = new GestorEmailLotusService();
			//@TODO CAMBIAR SERVICIO DE CORREO POR  GestorEmailService ! ! !
			GestorEmailService sv_ = new GestorEmailService();
			Vector dest_ = new Vector(getDestinosTokenComa(vo_.getEMAIL_DESTINO()));
			
			Vector body_ = new Vector();
			body_.add(vo_.getEMAIL_TXT());
			body_.addAll(pMsgAdicional);
			sv_.enviarMensaje(dest_, body_, vo_.getEMAIL_ASUNTO());
			
		} catch (ServiceException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [enviarMensaje(...)]:" + e.getMessage(), e);
			//throw e;
		}

	}

	public List getDestinosTokenComa(String pDestino) {
		ArrayList list_ = new ArrayList();
		String elementos_ = pDestino;
		StringTokenizer tok_ = new StringTokenizer(elementos_.trim(), ",");
		String subCad_, label_, valor_ = "";

		while (tok_.hasMoreTokens()) {
			subCad_ = tok_.nextToken();
			if (subCad_ != "")
				list_.add(subCad_);

		}
		return list_;
	}

}