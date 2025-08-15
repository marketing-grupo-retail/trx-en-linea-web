/*
 * Created on Jul 29, 2004
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
public interface DBConfig {

	/**
	 * @return
	 */
	public String getDRIVER();

	/**
	 * @return
	 */
	public String getLOGIN();

	/**
	 * @return
	 */
	public String getNOMBRE();

	/**
	 * @return
	 */
	public String getPASSWORD();

	/**
	 * @return
	 */
	public String getURL();

	/**
	 * @param string
	 */
	public void setDRIVER(String newDRIVER);

	/**
	 * @param string
	 */
	public void setLOGIN(String newLOGIN);

	/**
	 * @param string
	 */
	public void setNOMBRE(String newNOMBRE);

	/**
	 * @param string
	 */
	public void setPASSWORD(String newPASSWORD);

	/**
	 * @param string
	 */
	public void setURL(String newURL);

}
