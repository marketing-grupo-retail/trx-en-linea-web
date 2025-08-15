/*
 * Created on Jul 8, 2004
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
public interface LOG_OPTS_Ext extends LOG_OPTS {
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
	public abstract String getCANTI();
	/**
	 * @return
	 */
	public abstract String getPRECIO();
	/**
	 * @return
	 */
	public abstract Integer getTOTAL();	
	/**
	 * @return
	 */
	public String getDESC_OPTS() ;

	/**
	 * @param string
	 */
	public void setDESC_OPTS(String newDESC) ;

	/**
	 * @param string
	 */
	public abstract void setLOGIN(String newLOGIN);
	/**
	 * @param string
	 */
	public abstract void setNOMBRE(String newNOMBRE);
	/**
	 * @param string
	 */
	public abstract void setCANTI(String newCANTI);
	/**
	 * @param string
	 */
	public abstract void setPRECIO(String newPRECIO);
	/**
	 * @param string
	 */
	public abstract void setTOTAL(Integer newTOTAL);
}