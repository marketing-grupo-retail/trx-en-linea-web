/*
 * Proyecto: ASIC Admin Usuarios
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * All rigths Reserved.
 *
 * $Id: ListarRechazosForm.java,v 1.1 2019/12/18 17:31:05 Alfonso Exp $
 *
 */
package com.asic.transacciones.forms;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceLocator;
import com.asic.framework.forms.BaseForm;
import com.asic.transacciones.vo.USUARIO;

/**
 * JDOC Class Def
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */

public class ListarRechazosForm extends BaseForm {
	
	List rechazados;
	String seleccion = null;
	public List getRechazados() {
		return rechazados;
	}
	
	public void setRechazados(List list) {
		rechazados = list;
	}
	
	public String getSeleccion(){
		return seleccion;
	}
	
	public void setSeleccion(String selec){
		seleccion = selec;
	}
	
	public ActionErrors validate(ActionMapping arg0, HttpServletRequest arg1) {
		ActionErrors er_ = super.validate(arg0, arg1);
		
		return super.validate(arg0, arg1);

	}
}

