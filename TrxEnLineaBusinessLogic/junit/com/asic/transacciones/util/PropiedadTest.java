/*
 * Created on Dec 13, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.util;

import java.util.Hashtable;
import java.util.MissingResourceException;

import org.ramm.jwaf.locator.FailedLocatingPropertiesFileException;
import org.ramm.jwaf.logger.LogPrinter;
import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;

import junit.framework.TestCase;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class PropiedadTest extends TestCase {

	
	Hashtable hash =  new Hashtable();
	/**
	 * Constructor for PropiedadTest.
	 * @param arg0
	 */
	public PropiedadTest(String arg0) {
		super(arg0);
	}

	public void testGetPropiedad() {
	}

	public void testGetPropiedades() {
		
		LogPrinter l=	LogWriter.getLog();
		LogWriter.getLog("archivos").log(LogWriter.WARNING, "Objeto nulo obtenido del metodo --> ");
	
		Propiedad props = Propiedad.getInstance();
		try {
			hash = props.getPropiedadesValidacion(Propiedad.RESOURCE_BUNDLE_CFG);
			int i= hash.size();
			System.out.println(i);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
