/*
 * Proyecto: ASIC Admin Usuarios
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * All rigths Reserved.
 *
 * $Id: HeaderRechazoForm.java,v 1.1 2019/12/18 17:31:05 Alfonso Exp $
 *
 */
package com.asic.transacciones.forms;

import java.sql.Timestamp;
import java.util.List;

import org.apache.struts.action.ActionForm;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceLocator;
import com.asic.framework.forms.BaseForm;
import com.asic.transacciones.vo.TX_HEADER;
import com.asic.transacciones.vo.USUARIO;

/**
 * JDOC Class Def
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */

public class HeaderRechazoForm extends BaseForm {
	
	String comentario;
	int seccion;
	String []offsetx;
	
	
	/*public HeaderRechazoForm() throws ServiceException {

		  super();
		  setVO((TX_HEADER)ServiceLocator.getVO(TX_HEADER.class));
	  }*/
	/**
	 * @return
	 */
	public String getComentario() {
		return comentario;
	}

	/**
	 * @return
	 */
	public int getSeccion() {
		return seccion;
	}

	/**
	 * @param string
	 */
	public void setComentario(String string) {
		comentario = string;
	}

	/**
	 * @param string
	 */
	public void setSeccion(int string) {
		seccion = string;
	}

	/**
	 * @return
	 */
	public String[] getOffsetx() {
		return offsetx;
	}

	/**
	 * @param strings
	 */
	public void setOffsetx(String[] strings) {
		offsetx = strings;
	}

}

