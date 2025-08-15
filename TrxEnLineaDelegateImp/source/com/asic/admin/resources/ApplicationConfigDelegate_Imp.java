/*
 * Proyecto: ASIC Admin Usuarios
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * All rights Reserved.
 *
 * $Id: ApplicationConfigDelegate_Imp.java,v 1.1 2019/12/18 17:11:13 Alfonso Exp $
 *
 */
package com.asic.admin.resources;

import com.asic.framework.resources.ApplicationConfigFacadeAdapter;
import com.asic.framework.exception.ServiceException;
import com.asic.framework.resources.ApplicationConfigDelegate;


/**
 * JDOC Class Def
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class ApplicationConfigDelegate_Imp implements ApplicationConfigDelegate {
    /** JDOC Field Def */
    private ApplicationConfigFacadeAdapter adapter_;

    /* (no Javadoc)
     * @see com.asic.admin.resources.ApplicationConfigBusinessDelegate#get(java.lang.String)
     */
    public String get(String pName) throws ServiceException {
        adapter_ = new ApplicationConfigFacadeAdapter();

        return adapter_.get(pName);
    }

     /* (no Javadoc)
     * @see com.asic.admin.resources.ApplicationConfigBusinessDelegate#getBool(java.lang.String)
     */
    public boolean getBool(String pName) throws ServiceException {
        adapter_ = new ApplicationConfigFacadeAdapter();

        return adapter_.getBool(pName);
    }

	/* (no Javadoc)
	 * @see com.asic.admin.resources.ApplicationConfigBusinessDelegate#isValidPort(java.lang.String)
	 */
	public boolean isValidPort(String pPort) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();

		return adapter_.isValidPort(pPort);
	}

	
	

}
