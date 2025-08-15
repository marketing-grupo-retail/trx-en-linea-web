/* Proyecto: Transacciones en linea Web
 * Copyright (C) 2004-2005 Asic S.A. Bogotá, Colombia.
 * All rights Reserved.
 * $Id: ItemRecordRechazoAction.java,v 1.1 2019/12/18 17:30:57 Alfonso Exp $
 */
package com.asic.transacciones.actions;

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
import com.asic.transacciones.vo.TRANSACCION;



public class ItemRecordRechazoAction extends BaseAction {

	private static final String TIPO_STRING = "8";
	private static final String ACCION_ENVIAR = "ACCION_ENVIAR";
	/** execute
	 * @param mapping DOCUMENT ME!
	 * @param form DOCUMENT ME!
	 * @param request DOCUMENT ME!
	 * @param response DOCUMENT ME!
	 * @return DOCUMENT ME!
	 * @throws Exception DOCUMENT ME! */

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward();
		HttpSession session_ = request.getSession(false);
		next = "init_itemrecord_rechazos.success";

		Message resp_ = null;
		DynaValidatorForm form_ = (DynaValidatorForm) form;
		TRANSACCION vo_ = (TRANSACCION) session_.getAttribute("transaccion");
		List listStrings_ = (List) form_.get("ir_string");
		String seccion_ =(String) form_.get("seccion");
		String accion_ = (String) form_.get("accion");
		
		if (listStrings_.isEmpty())
			listStrings_ = vo_.getItemRecordChange();
		else
			vo_.setItemRecordChange(listStrings_);

		form_.set("string", listStrings_);
		
		if (!seccion_.equals(TIPO_STRING)){
			next ="init_string_rechazos.success";
		}
		if (seccion_.equals(TIPO_STRING) && accion_.equalsIgnoreCase(ACCION_ENVIAR)){
			next ="enviar_string_rechazos.success";
		}

		return redirect(mapping, request, errors, next);
	}

	/*private void setErrorParameters(ServiceException e) {
		if (e.getMessage() != null) {
			// messageParameters.put("<nombre variable que se mostrará solo en caso de seteo de mensaje>", valor_variable);
		}
		// messageParameters.put("<nombre variable que siempre se mostrará en caso de error>", valor_variable);
	}*/
}
