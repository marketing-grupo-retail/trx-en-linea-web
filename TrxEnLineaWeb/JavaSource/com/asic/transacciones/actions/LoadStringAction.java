/* Proyecto: Transacciones en linea Web
 * Copyright (C) 2004-2005 Asic S.A. Bogotá, Colombia.
 * All rights Reserved.
 * $Id: LoadStringAction.java,v 1.1 2019/12/18 17:30:57 Alfonso Exp $
 */
package com.asic.transacciones.actions;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.ramm.jwaf.controller.flow.Message;
import com.asic.framework.actions.BaseAction;
import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceLocator;
import com.asic.framework.helpers.error.MessageHelper;
import com.asic.transacciones.delegate.AdminUsuariosBusinessDelegate;
import com.asic.transacciones.forms.ListarRechazosForm;
import com.asic.transacciones.forms.ModificarRechazoForm;
import com.asic.transacciones.forms.UserForm;
import com.asic.transacciones.helpers.AdminRechazosHelper;
import com.asic.transacciones.helpers.MQAdminHelper;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TX_RECHAZO;
import com.asic.transacciones.vo.USUARIO;

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

public class LoadStringAction extends BaseAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward();
		HttpSession session_ = request.getSession(false);
		next = "init_mod_rechazos.success";

		Message resp_ = null;

		ModificarRechazoForm form_ = (ModificarRechazoForm) form;
		TX_RECHAZO vo_ = (TX_RECHAZO) session_.getAttribute("rechazo");
		String seccion_ = form_.getSeccion().equals("")?"-1":form_.getSeccion();
		int secc_ = Integer.parseInt(seccion_);
		switch (secc_) {
			case 0 :
				next = "init_header_rechazos.success";
				break;
			case 1 :
				next = "init_itementry_rechazos.success";
				break;
			case 2 :
				next = "init_discount_rechazos.success";
				break;
			case 3 :
				next = "init_header_rechazos.success";
				break;
			case 4 :
				next = "init_header_rechazos.success";
				break;
			case 14 :
				next = "init_dataentry_rechazos.success";
				break;

			default :
				next = "load_modificar_string.error";
				break;
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
