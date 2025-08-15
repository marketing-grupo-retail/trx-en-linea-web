/*
 * Proyecto: <Proyect Name>
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: LogReportsBean.java,v 1.1 2019/12/18 17:31:06 Alfonso Exp $
 *
 */
package com.grpretail.admin.actions.log;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ResourceBundle;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceLocator;
import com.asic.utils.locator.ResourceLocator;
import com.grpretail.business.admin.AuditoriaBusinessDelegate;
import com.grpretail.business.admin.vo.OPTIONS;
import com.grpretail.business.admin.vo.ReportBean;

/**
 * <ASIC:Definicion de Clase>
 *
 * <Ejemplo de Uso (opcional)>
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class LogReportsBean {

	public static void insertLog(String pUserId, String pMessage, Hashtable pVariables){

		try {
			ResourceBundle rb_ = ResourceLocator.get("com.grpretail.resources.ApplicationResources");
			StringBuffer sb_ = new StringBuffer(rb_.getString(pMessage));
			for(Enumeration e = pVariables.keys();e.hasMoreElements(); ){
				String key_ = (String) e.nextElement();
				int ini_ = sb_.toString().indexOf((String) key_);
				int fin_ = ini_ + key_.length();
				sb_.replace(ini_, fin_, (String)pVariables.get(key_));
			}
			ReportBean.insertReport(Integer.parseInt(pUserId),
									new Timestamp((new Date()).getTime()),
									sb_.toString());

		} catch (Exception e) {
			LogWriter.getLog().log(LogWriter.WARNING,"insertLogReport",e);
		}
	}

	/**
	 * Retorna la opcion dado el id
	 *
	 * @param pId
	 * @return
	 */
	public OPTIONS getOption(String pId) throws ServiceException{

		AuditoriaBusinessDelegate audit_ = (AuditoriaBusinessDelegate)
			ServiceLocator.getService(AuditoriaBusinessDelegate.class);
		return audit_.getOpcion(pId);

	}



}
