/*
 * Proyecto: VisaWeb
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * All riths Reserved.
 *
 * $Id: ApplicationInitServlet.java,v 1.1 2019/12/18 17:31:07 Alfonso Exp $
 *
 */
package com.asic.framework.servlets;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.BusinessDelegateFactoryAdapter;
import com.asic.transacciones.helpers.ConversionParamHelper;

/**
 * JDOC Class Def
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class ApplicationInitServlet extends HttpServlet implements Servlet {
    //	private static LogHelper log = LogHelper.getInstance(ApplicationInitServlet.class);

    /**
     * Called by the application server on startup.  Be sure that this servlet
     * is the first one called (startup parameter in web.xml !!)
     *
     * @throws ServletException DOCUMENT ME!
     */
    public void init() throws ServletException {  
        loadAppDelegateConfig();
    }

    /**
     * JDOC Method Def
     *
     * @throws ServletException DOCUMENT ME!
     */
    private void loadAppDelegateConfig() throws ServletException {
        //String appConfigFile_ = getServletConfig().getInitParameter("com.asic.framework.servlets.properties");
		String appConfigFile_ = "/WEB-INF/application-delegate.properties";
        System.out.println("appConfigFile->"+appConfigFile_);

        // ensure init parameters (as detailed in the web.xml) are present
        if (appConfigFile_ == null) {
            throw new ServletException(
                "No 'com.asic.framework.servlets.properties' Init Parameter supplied in web.xml");
        }

        try {
            //Properties properties = new Properties();
            //System.out.println("getServletContext().getRealPath(appConfigFile_)->"+getServletContext().getRealPath(appConfigFile_));
            /*properties.load(new java.io.FileInputStream(
                    getServletContext().getRealPath(appConfigFile_)));*/

            // initialize the delegate factory
            //System.out.println("properties.getProperty('com.asic.framework.services.factory')"+properties.getProperty("com.asic.framework.services.factory"));
            String str_ = "com.asic.framework.factory.ApplicationDelegateFactory";
            //BusinessDelegateFactoryAdapter.init(properties.getProperty(
            //        "com.asic.framework.services.factory"));
			BusinessDelegateFactoryAdapter.init(str_);                    

            LogWriter.getLog().log(LogWriter.INFO,
                "ApplicationInitServlet - Initialization complete [ok]");
                
			loadParametros();
			    
        } catch (ServiceException e) {
            String msg = e.getClass().getName()
                + ", on application initialization , message: "
                + e.getMessage();

            LogWriter.getLog().log(LogWriter.WARNING,
                "ApplicationInitServlet has failed to start up correctly, message: ServiceException: "
                + e.getMessage());
            LogWriter.getLog().log(LogWriter.WARNING, msg, e);

            throw new ServletException(msg, e);
        } /*catch (FileNotFoundException e) {
            LogWriter.getLog().log(LogWriter.WARNING,
                "ApplicationInitServlet has failed to start up correctly, message: FileNotFoundException: "
                + e.getMessage());
        } catch (IOException e) {
            LogWriter.getLog().log(LogWriter.WARNING,
                "ApplicationInitServlet has failed to start up correctly, message: IOException: "
                + e.getMessage());
        }*/
    }
    
	/**
	 * JDOC Method Def
	 *
	 * @throws ServletException DOCUMENT ME!
	 */
	private void loadParametros() throws ServiceException {
		/*
		ConversionParamHelper helper_ = ConversionParamHelper.getInstancia();
		ServletContext sc_ = getServletContext();
		helper_.setParams(sc_);
		helper_.setStringsParams(sc_);
		*/
		
	}
       
}
