
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
public interface MensajeError{

	/**
	 * @return
	 */
	public abstract String getCodigo();
	/**
	 * @return
	 */
	public abstract String getString();
	/**
	 * @return
	 */
	public abstract String getSubString();
	/**
	 * @return
	 */
	public abstract String getValor();
	/**
	 * @param string
	 */
	public abstract void setCodigo(String string);
	/**
	 * @param string
	 */
	public abstract void setString(String string);
	/**
	 * @param string
	 */
	public abstract void setSubString(String string);
	/**
	 * @param string
	 */
	public abstract void setValor(String string);
	
	public abstract String getDescripcion() ;

	/**
	* @param string
	*/
	public abstract void setDescripcion(String string) ;
	
	public abstract String getOffsetx();
	
	public abstract void setOffsetx(String string) ;
	
}
