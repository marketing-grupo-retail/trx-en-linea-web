package com.grpretail.trxonline.forms;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * Form bean for a Struts application.
 * Users may access 7 fields on this form:
 * <ul>
 * <li>btnBuscar - [your comment here]
 * <li>fecha - [your comment here]
 * <li>idObject - [your comment here]
 * <li>numeroTrx - [your comment here]
 * <li>terminal - [your comment here]
 * <li>listClientesSeleccionados - [your comment here]
 * <li>tienda - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class ReporteTrxForm extends ActionForm {

	//private String btnBuscar = null;
	//private String listClientesSeleccionados = null;
	

	private String tienda = null;
	private String terminal = null;
	private String numeroTrx = null;
	private String fecha = null;
	
	private String idObject = null;


//	/**
//	 * Get btnBuscar
//	 * @return String
//	 */
//	public String getBtnBuscar() {
//		return btnBuscar;
//	}
//
//	/**
//	 * Set btnBuscar
//	 * @param <code>String</code>
//	 */
//	public void setBtnBuscar(String b) {
//		this.btnBuscar = b;
//	}

	/**
	 * Get fecha
	 * @return String
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * Set fecha
	 * @param <code>String</code>
	 */
	public void setFecha(String f) {
		this.fecha = f;
	}

	/**
	 * Get numeroTrx
	 * @return String
	 */
	public String getNumeroTrx() {
		return numeroTrx;
	}

	/**
	 * Set numeroTrx
	 * @param <code>String</code>
	 */
	public void setNumeroTrx(String n) {
		this.numeroTrx = n;
	}

	/**
	 * Get idObject
	 * @return String
	 */
	public String getIdObject() {
		return idObject;
	}

	/**
	 * Set idObject
	 * @param <code>String</code>
	 */
	public void setIdObject(String i) {
		this.idObject = i;
	}

//	/**
//	 * Get listClientesSeleccionados
//	 * @return String
//	 */
//	public String getListClientesSeleccionados() {
//		return listClientesSeleccionados;
//	}
//
//	/**
//	 * Set listClientesSeleccionados
//	 * @param <code>String</code>
//	 */
//	public void setListClientesSeleccionados(String l) {
//		this.listClientesSeleccionados = l;
//	}

	/**
	 * Get terminal
	 * @return String
	 */
	public String getTerminal() {
		return terminal;
	}

	/**
	 * Set terminal
	 * @param <code>String</code>
	 */
	public void setTerminal(String t) {
		this.terminal = t;
	}

	/**
	 * Get tienda
	 * @return String
	 */
	public String getTienda() {
		return tienda;
	}

	/**
	 * Set tienda
	 * @param <code>String</code>
	 */
	public void setTienda(String t) {
		this.tienda = t;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		tienda = null;
		terminal = null;
		numeroTrx = null;
		fecha = null;
		idObject = null;
//		btnBuscar = null;
//		listClientesSeleccionados = null;

	}

	public ActionErrors validate(
		ActionMapping mapping,
		HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new org.apache.struts.action.ActionError("error.field.required"));
		// }
		return errors;

	}
}
