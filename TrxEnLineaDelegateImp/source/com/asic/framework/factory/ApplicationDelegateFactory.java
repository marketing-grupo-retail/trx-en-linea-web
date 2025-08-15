/*
 * Proyecto: VisaWeb
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * All riths Reserved.
 *
 * $Id: ApplicationDelegateFactory.java,v 1.1 2019/12/18 17:11:13 Alfonso Exp $
 *
 */
package com.asic.framework.factory;

import java.util.Hashtable;

import com.asic.framework.exception.ServiceException;

/**
 * JDOC Class Def
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class ApplicationDelegateFactory
    implements AbstractBusinessDelegateFactory {
    	
    private Hashtable services = new Hashtable();	
    	
		
    /** JDOC Field Def */
    private VOFactory voFactory;

    /**
     * Constructor for PiggyBankEJBDelegateFactory.
     */
    public ApplicationDelegateFactory() {
        super();
    }


    /* (no Javadoc)
     * @see com.asic.visaweb.business.factory.AbstractBusinessDelegateFactory#createVOBusinessDelegate()
     */
    public VOFactory createVOBusinessDelegate() throws ServiceException {
        if (voFactory == null) {
            voFactory = new VOFactory_Imp();
        }

        return voFactory;
    }

	public ServiceProvider getService(String pClassName)
		throws ServiceException {
		
		try {
			ServiceProvider service_ = (ServiceProvider)getServices().get(pClassName);
			if(service_ == null){
				Class srvClass_ = Class.forName(pClassName + "_Imp");
				service_ = (ServiceProvider)srvClass_.newInstance();
				getServices().put(pClassName,service_);
			}
			return service_;
		} catch (ClassNotFoundException e) {
			throw new ServiceException("ClassNotFoundException", e);
		} catch (InstantiationException e) {
			throw new ServiceException("InstantiationException", e);			
		} catch (IllegalAccessException e) {
			throw new ServiceException("IllegalAccessException", e);			
		}
	}

	/**
	 * Retorna el cache de servicios
	 * 
	 * @return
	 */
	public Hashtable getServices() {
		if(services == null){
			services = new Hashtable();
		}
		return services;
	}


}
