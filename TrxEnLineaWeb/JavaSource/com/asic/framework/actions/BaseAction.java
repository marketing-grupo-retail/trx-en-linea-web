/*
 * Proyecto: Visaweb
 * 
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * All riths Reserved.
 * 
 * $Id: BaseAction.java,v 1.1 2019/12/18 17:31:05 Alfonso Exp $
 * 
 */
package com.asic.framework.actions;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.ramm.jwaf.controller.flow.Message;
import org.ramm.jwaf.logger.LogWriter;
import org.ramm.jwaf.patterns.dao.DAOClassNotFoundException;
import org.ramm.jwaf.patterns.dao.DAOCreationException;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.AbstractBusinessDelegateFactory;
import com.asic.framework.factory.BusinessDelegateFactoryAdapter;
import com.asic.framework.factory.ServiceLocator;
import com.asic.framework.factory.ServiceProvider;


/**
 * Clase base para todos los action 
 * 
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class BaseAction extends AbstractAction {
    /** JDOC Field Def */
    AbstractBusinessDelegateFactory businessDelegateFactory;
	protected String next = "generic.error";
	protected Hashtable messageParameters = new Hashtable();
    
    /**
     * JDOC Method Def
     *
     * @return DOCUMENT ME!
     *
     * @throws ServiceException DOCUMENT ME!
     */
    protected AbstractBusinessDelegateFactory getBusinessDelegateFactory()
        throws ServiceException {
        return businessDelegateFactory = BusinessDelegateFactoryAdapter
            .getInstanceImp();
    }


    /**
     * JDOC Method Def
     *
     * @param pClass DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ServiceException DOCUMENT ME!
     */
    protected Object getVO(Class pClass) throws ServiceException {
        return ServiceLocator.getVO(pClass);
    }

	protected ServiceProvider getService(Class pClassService) throws ServiceException {
		ServiceProvider service_ = null;

		try {
                                                    
			service_ = ServiceLocator.getService(pClassService);
                                               
		} catch (ServiceException e) {
			LogWriter.getLog().log(this, LogWriter.WARNING,
				"getService: ex", e);
			throw e;
		}

		return service_;
	}    
    
    /**
     * JDOC Method Def
     *
     * @param pRequest DOCUMENT ME!
     * @param pErrors DOCUMENT ME!
     * @param pExc DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String errorProcess(Object pCatcher, HttpServletRequest pRequest,
        ActionErrors pErrors, Exception pExc) {
        String next_ = "generic.error";
        Message msg_ = null;

        if (pExc instanceof ServiceException) {
            return errorServiceProcess(pCatcher, pRequest, pErrors,
                (ServiceException) pExc);
        }

        try {
            throw pExc;

            //valida excepciones generales conocidas
            // si no ninguna hace tratamiento general
        } catch (Exception e) {
			LogWriter.getLog().log(pCatcher, LogWriter.WARNING, "errorProcess:", e);
            msg_ = new Message("Exception", e.getMessage());
            msg_.setSourceException(e);
            pErrors.add("generic_error",
                new ActionError("error.generic.unknown_failed"));
            next_ = "generic.error";
        }

        pRequest.setAttribute("message", msg_);

        return next_;
    }

    /**
     * JDOC Method Def
     *
     * @param request DOCUMENT ME!
     * @param pErrors DOCUMENT ME!
     * @param pExc DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String errorServiceProcess(Object pCatcher, HttpServletRequest request,
        ActionErrors pErrors, ServiceException pExc) {
        String next_ = "generic.error";
        Message msg_ = null;

        try {
            throw (Exception) pExc.getRootCause();
        } catch (DAOClassNotFoundException e) {
			LogWriter.getLog().log(pCatcher, LogWriter.WARNING, 
				"errorServiceProcess:DAOClassNotFoundException", e);
			msg_ = new Message("Error en Servicio", "Acceso a datos no disponible.");
//			msg_ = new Message("DAOClassNotFoundException", e.getMessage());
            msg_.setSourceException(e);
            
            pErrors.add("generic_error",
                new ActionError("error.generic.dao_class_not_fount"));
            next_ = "generic.error";
            
        } catch (DAOCreationException e) {
			LogWriter.getLog().log(pCatcher, LogWriter.WARNING, 
				"errorServiceProcess:DAOCreationException", e);
//            msg_ = new Message("DAOCreationException", e.getMessage());
			msg_ = new Message("Error en Servicio", "No es posible crear acceso a datos.");
            msg_.setSourceException(e);
            pErrors.add("generic_error",
                new ActionError("error.generic.dao_creaction_failed"));
            next_ = "generic.error";
        } catch (ConnectionFailedException e) {
			Exception cause_ = (Exception) e.getCause();
			String causeMessage_ =
				(cause_ != null) ? cause_.getMessage() : e.getMessage();				
			LogWriter.getLog().log(pCatcher, LogWriter.WARNING, 
				"errorServiceProcess:ConnectionFailedException",cause_);
        	
            msg_ = new Message("Error en Servicio",
				"Falla en conexión a datos.");
            msg_.setSourceException((e.getCause() != null) ? e.getCause() : e);
            pErrors.add("generic_error",
                new ActionError("error.generic.connection_failed"));
            next_ = "generic.error";
        } catch (DBAccessException e) {
			Exception cause_ = (Exception) e.getCause();
			String causeMessage_ =
				(cause_ != null) ? cause_.getMessage() : e.getMessage();				
			LogWriter.getLog().log(pCatcher, LogWriter.WARNING, 
				"errorServiceProcess:ConnectionFailedException",cause_);        	
        	
            msg_ = new Message("Error en Servicio",
                    "Falla en consulta a datos.");
            msg_.setSourceException((e.getCause() != null) ? e.getCause() : e);
            pErrors.add("generic_error",
                new ActionError("error.generic.dbaccess_failed"));
            next_ = "generic.error";
        } catch (Exception e) {
			LogWriter.getLog().log(pCatcher, LogWriter.WARNING, 
							"errorServiceProcess:Exception", e);
							        	
            msg_ = new Message("Error ", e.getMessage());
            msg_.setSourceException(e);
            pErrors.add("generic_error",
                new ActionError("error.generic.unknown_failed"));
            next_ = "generic.error";
        }

        request.setAttribute("message", msg_);

        return next_;
    }
    	               
	protected void setServiceErrorMessage(HttpServletRequest request, ServiceException e, String title, String message ) {
		Message resp_;
		resp_ = new Message(title, message );
		resp_.setSourceException(e);
		request.setAttribute("mensaje", resp_);
	}    
	
	protected void setServiceSuccessMessage(HttpServletRequest request, String title, String message ) {
		Message resp_;
		resp_ = new Message(title, message );
		request.setAttribute("mensaje", resp_);
	}    	
    
    
}
