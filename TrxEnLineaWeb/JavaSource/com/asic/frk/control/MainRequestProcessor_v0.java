/*
 * Proyecto: VisaWeb
 * 
 * Copyright (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * All rights Reserved.
 * 
 * Id:
 * 
 */
package com.asic.frk.control;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSessionBindingEvent;
//import javax.servlet.http.HttpSessionBindingListener;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.config.ActionConfig;
import org.apache.struts.tiles.TilesRequestProcessor;
import org.ramm.jwaf.logger.LogWriter;
import org.ramm.jwaf.logger.WebLogger;



/**
 * @author ramm
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class MainRequestProcessor_v0 extends TilesRequestProcessor {

	//private String authorization;

	//private String audit;

	//public static Hashtable hashInstancias;
	public final static String ID_PAG_HOME = "1";
	public final static String ACTION_REDIRECT = "/controlRedirect";
	public final static String ACTION_CONS_PAGE = "/controlConsPage";

	// monitorea la primera solicitud de action desde un request
	private static boolean TRACE = true;

	/* (no Javadoc)
	 * @see org.apache.struts.action.RequestProcessor#processPreprocess(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected boolean processPreprocess(
		HttpServletRequest pRequest,
		HttpServletResponse pResponse) {
		try {
			LogWriter.getLog().log(	this,LogWriter.FINEST,"Ingreso MainRequestProcessor "+pRequest.getSession().getId());
			
		} catch (Exception e) {
			LogWriter.getLog().log(
				this,
				LogWriter.FINEST,
				"Exception: in processPreprocess: " + e.getMessage());
		}
		return super.processPreprocess(pRequest, pResponse);
	}

	
	private String getActionPath(HttpServletRequest pRequest) {
			String actionPath_ = pRequest.getRequestURI();
			// quita el .do
			actionPath_ = actionPath_.substring(0, actionPath_.length() - 3);
			// quita el /VisaInterWeb y queda /directorio/action_path
			actionPath_ =
				actionPath_.substring(
					0 + pRequest.getContextPath().length(),
					actionPath_.length());
			return actionPath_;
		}
		
	private boolean validarActionPath(HttpServletRequest pRequest){
		
		String path_ = getActionPath(pRequest);
		return  path_.equalsIgnoreCase(ACTION_REDIRECT) || path_.equalsIgnoreCase(ACTION_CONS_PAGE);
	
		
		
	}

}
