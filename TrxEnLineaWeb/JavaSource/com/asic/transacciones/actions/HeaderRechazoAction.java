/* Proyecto: Transacciones en linea Web
 * Copyright (C) 2004-2005 Asic S.A. Bogotá, Colombia.
 * All rights Reserved.
 * $Id: HeaderRechazoAction.java,v 1.1 2019/12/18 17:30:57 Alfonso Exp $
 */
package com.asic.transacciones.actions;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;
import org.ramm.jwaf.controller.flow.Message;

import com.asic.framework.actions.BaseAction;
import com.asic.transacciones.forms.HeaderRechazoForm;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TX_HEADER;

/**
 * <p>Class Name: ListarRechazadosAction </p>
 * <p>Description: 
 * Clase encargada de ejecutar el bean para el RequestHelper 
 * y retornar la página siguiente, creando antes el array que
 * contiene el listado que se va a desplegar </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: ASIC Consulting Group </p>
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $ */

public class HeaderRechazoAction extends BaseAction {


	private static final String ACCION_ENVIAR = "ACCION_ENVIAR";
	private static final String TIPO_STRING = "0";
	/** execute
	 * @param mapping DOCUMENT ME!
	 * @param form DOCUMENT ME!
	 * @param request DOCUMENT ME!
	 * @param response DOCUMENT ME!
	 * @return DOCUMENT ME!
	 * @throws Exception DOCUMENT ME! */

	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		
		throws Exception {
		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward();
		HttpSession session_ = request.getSession(false);
		next ="init_header_rechazos.success";
		
		Message resp_ = null;
		DynaValidatorForm form_ =(DynaValidatorForm) form;
		TRANSACCION vo_ = (TRANSACCION) session_.getAttribute("transaccion");
		List header_ = (List) form_.get("string");
		String seccion_ =(String) form_.get("seccion");
		String accion_ = (String) form_.get("accion");
		
		
		if (header_.isEmpty())
			header_ = vo_.getHeader();
		else
			vo_.setHeader(header_);
			
		form_.set("string",header_);
		
		if (!seccion_.equals(TIPO_STRING)){
			next ="init_string_rechazos.success";
		}
		if (seccion_.equals(TIPO_STRING) && accion_.equalsIgnoreCase(ACCION_ENVIAR)){
			next ="enviar_string_rechazos.success";
		}
		
		/*for (Iterator iter = header_.iterator(); iter.hasNext();) {
			TX_HEADER el_ = (TX_HEADER) iter.next();
			el_.getOFFSETX();
		}*/
		
		return redirect(mapping, request, errors, next);
	}

	/*private void setErrorParameters(ServiceException e) {
		if (e.getMessage() != null) {
			// messageParameters.put("<nombre variable que se mostrará solo en caso de seteo de mensaje>", valor_variable);
		}
		// messageParameters.put("<nombre variable que siempre se mostrará en caso de error>", valor_variable);
	}*/
}
