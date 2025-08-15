/*
 * Created on Feb 2, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.framework.mail.lotus;

import java.util.Vector;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.mail.GestorEmailService;

import junit.framework.TestCase;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class GestorEmailLotusServiceTest extends TestCase {

	/**
	 * Constructor for GestorEmailLotusServiceTest.
	 * @param arg0
	 */
	public GestorEmailLotusServiceTest(String arg0) {
		super(arg0);
	}

	public void testEnviarMensaje() {
		try {
			GestorEmailService sv_ = new GestorEmailService();
			Vector dest_ = new Vector();
			dest_.add("celticsss@yahoo.es");
			Vector body_ = new Vector();
			body_.add("Mail de prueba 4");
			sv_.enviarMensaje(dest_,body_,"Test Mail Test Mail Test Mail Test Mail");
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
