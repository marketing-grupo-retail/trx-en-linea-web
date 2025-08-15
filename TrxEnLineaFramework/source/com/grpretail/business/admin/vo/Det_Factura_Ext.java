/*
 * Created on Jul 19, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.grpretail.business.admin.vo;


/**
 * @author JuanR
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public interface Det_Factura_Ext extends DET_FAC {

	/**
	 * @return
	 */
	public abstract String getLOGIN();
	/**
	 * @return
	 */
	public abstract String getNOMBRE();
	
	/**
	 * @return
	 */
	public Integer getTOTAL();

	/**
	 * @param integer
	 */
	public void setTOTAL(Integer newTOTAL);
	/**
	 * @param string
	 */
	public abstract void setLOGIN(String newLOGIN);
	/**
	 * @param string
	 */
	public abstract void setNOMBRE(String newNOMBRE);

}
