/*
 * Created on Dec 22, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.vo;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class MensajeError_Imp implements MensajeError{
	
	private String codigo;
		private String string;
		private String subString;
		private String valor;
		private String descripcion;
		private String offsetx;
	
		

		/**
		 * @return
		 */
		public String getCodigo() {
			return codigo;
		}

		/**
		 * @return
		 */
		public String getString() {
			return string;
		}

		/**
		 * @return
		 */
		public String getSubString() {
			return subString;
		}

		/**
		 * @return
		 */
		public String getValor() {
			return valor;
		}

		/**
		 * @param string
		 */
		public void setCodigo(String string) {
			codigo = string;
		}

		/**
		 * @param string
		 */
		public void setString(String string) {
			this.string = string;
		}

		/**
		 * @param string
		 */
		public void setSubString(String string) {
			subString = string;
		}

		/**
		 * @param string
		 */
		public void setValor(String string) {
			valor = string;
		}

		/**
		 * @return
		 */
		public String getDescripcion() {
			return descripcion;
		}

		/**
		 * @param string
		 */
		public void setDescripcion(String string) {
			descripcion = string;
		}

		/**
		 * @return
		 */
		public String getOffsetx() {
			return offsetx;
		}

		/**
		 * @param string
		 */
		public void setOffsetx(String string) {
			offsetx = string;
		}

}