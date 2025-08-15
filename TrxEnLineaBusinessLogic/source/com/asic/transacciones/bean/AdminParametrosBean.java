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

import java.util.List;

import org.ramm.jwaf.dbutil.DBUtil;
import org.ramm.jwaf.logger.LogWriter;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.resources.ApplicationConfigFacadeAdapter;
import com.asic.framework.resources.ApplicationResources;
import com.asic.transacciones.vo.TX_PARAM_SIST;
import com.asic.transacciones.vo.TX_PARAM_SIST_Imp;

/**
 * @author ramm
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class AdminParametrosBean {
	
	public static final Integer HOST_MAIL= new Integer(1); 
	public static final Integer USER_ID_MAIL= new Integer(2); 
	public static final Integer CNT_ID_MAIL= new Integer(3); 
	public static final Integer DBUSER_MAIL= new Integer(4); 
	public static final Integer ALMACEN_ARCHIVOS = new Integer(5);
	
	private ApplicationConfigFacadeAdapter adapter_;

	public TX_PARAM_SIST getParametro(Integer pID) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		TX_PARAM_SIST vo_ = new TX_PARAM_SIST_Imp();
		try {
			
			List list_ = DBUtil.select("*", 
				adapter_.getDBTrxOnlineOwner() + "TX_PARAM_SIST p", 
				"p.param_id="+pID.intValue(),
				 TX_PARAM_SIST_Imp.class, 
				 ApplicationResources.TXONLINE_DB);
				 
			if (!list_.isEmpty())
				 vo_ =(TX_PARAM_SIST) list_.get(0);
				 
			return vo_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getParametro(...)]:" + e.getMessage(), e);
			throw new ServiceException("",	"error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getParametro(...)]:" + e.getMessage(), e);
			throw new ServiceException("",	"error.generic.dbaccess_failed", e);
		}
		
	}

}