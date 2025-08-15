/*
 * Created on Jul 23, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.grpretail.business.admin.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author db2admin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class OPTIONS_Ext_Imp extends OPTIONS_Imp implements OPTIONS_Ext {
	
	private String PATH = "";
	private List subMenu = new ArrayList();
	

	/**
	 * @return
	 */
	public String getPATH() {
		return PATH;
	}

	/**
	 * @param string
	 */
	public void setPATH(String newPATH) {
		PATH = newPATH;
	}
	/**
	 * @return
	 */
	public List getSubMenu() {
		return subMenu;
	}

	/**
	 * @param list
	 */
	public void setSubMenu(List list) {
		subMenu = list;
	}

}
