/*
 * Created on Jul 23, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.grpretail.business.admin.vo;

import java.util.List;

/**
 * DOCUMENT ME!
 *
 * @author IsaG To change the template for this generated type comment go to
 *         Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and
 *         Comments
 */
public interface OPTIONS_Ext extends OPTIONS{
    /**
     * DOCUMENT ME!
     *
     * @return
     */
    public abstract String getPATH();
	public abstract void setPATH( String newPATH );
	
	public abstract List getSubMenu();
	
	public abstract void setSubMenu(List pSubMenues);
}
