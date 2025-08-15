/*
 * Proyecto: VisaWeb
 *
 * Copyright (C) 2004-2005 Asic S.A. Bogotá, Colombia.
 * All rights Reserved.
 *
 * $Id: CrearUsuarioAction.java,v 1.1 2019/12/18 17:30:57 Alfonso Exp $
 *
 */
package com.asic.transacciones.actions;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import com.asic.transacciones.forms.UserForm;
import com.asic.transacciones.helpers.MQAdminHelper;
import com.asic.transacciones.vo.USUARIO;



/**
 * <p>Class Name: CrearUsuarioAction </p>
 *
 * <p>Description: 
 * Clase encargada de ejecutar el bean para el RequestHelper 
 * y retornar la página siguiente, creando antes el array que
 * contiene el listado que se va a desplegar </p>
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * <p>Company: ASIC Consulting Group </p>
 *
 * @author $Author: Alfonso $
 * 
 * @version $Revision: 1.1 $
 */
public class CrearUsuarioAction extends BaseAction {

	private final String COMMAND = "CrearUsuarioCommand";
	
	/**
	 */
	public CrearUsuarioAction() {
		super();
	}

	/**
	 * execute
	 *
	 * @param mapping DOCUMENT ME!
	 * @param form DOCUMENT ME!
	 * @param request DOCUMENT ME!
	 * @param response DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws Exception DOCUMENT ME!
	 */
	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws Exception {
		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward();

		Message resp_ = null;

		// TODO: errores específicos de campos de la forma se manejan con ActionErrors

		try {

			//HttpSession session_ = request.getSession(false);
 				
			((AdminUsuariosBusinessDelegate) ServiceLocator.getService(
			  AdminUsuariosBusinessDelegate.class)).createUsuario((USUARIO)((UserForm)form).getVO());				
			/*MQAdminHelper helper_ = new MQAdminHelper();
			
			helper_.enviarMensajeCola("prueba 1");*/
					
			
			messageParameters.put("<user>", ((UserForm)form).getLogin() ); 
			setServiceSuccessMessage(request, "Mensaje", MessageHelper.parseResourceMessage("report.user.creado", messageParameters));
			next = "crear_usuario.success";
			
		}

		catch (ServiceException e) {
			
			if (e.getErrorCode()!=null ){
				
				// Procesa errores específicos de la lógica de negocio 
				setErrorParameters(e);
				setServiceErrorMessage(request, e, "Error", MessageHelper.parseResourceMessage(e.getErrorCode(), messageParameters));
			}
			else{		
				// Procesa errores de servicio genéricos
				//setServiceErrorMessage(request, e, "Error", "Error inesperado durante creación de usuario" );
				next = errorProcess(this, request, errors, e);
				//setServiceErrorMessage(request, e, "Error", e.getMessage());
			}			
		}
		
		catch (Exception e) {
			// Procesa errores generales desconocidos 
			next = errorProcess(this, request, errors, e);
		}

		return redirect(mapping, request, errors, next);
	}

	private void setErrorParameters(ServiceException e) {
		if ( e.getMessage() != null ){
			// messageParameters.put("<nombre variable que se mostrará solo en caso de seteo de mensaje>", valor_variable);
		}
		
		// messageParameters.put("<nombre variable que siempre se mostrará en caso de error>", valor_variable);
	}


}
