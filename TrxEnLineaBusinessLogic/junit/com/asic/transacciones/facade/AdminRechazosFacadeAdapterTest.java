/*
 * Created on Jan 25, 2006
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.facade;

import java.util.List;
import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.vo.TX_RECHAZO;
import com.asic.transacciones.vo.TX_RECHAZO_Imp;

import junit.framework.TestCase;

/**
 * @author Kcadena
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class AdminRechazosFacadeAdapterTest extends TestCase {

	/**
	 * Constructor for AdminRechazosFacadeAdapterTest.
	 * @param arg0
	 */
	public AdminRechazosFacadeAdapterTest(String arg0) {
		super(arg0);
	}

	public void testGetRechazos() {
		
		AdminRechazosFacadeAdapter facade_ = new AdminRechazosFacadeAdapter();
		try {
			List list_ = facade_.getRechazos(1, 10);
			System.out.println(list_);
		} catch (ServiceException e) {
			e.printStackTrace();
		} 
	}
	
	public void testGetTransaccionRechazada(){
		
		AdminRechazosFacadeAdapter facade_ = new AdminRechazosFacadeAdapter();
		TX_RECHAZO vo_ = new TX_RECHAZO_Imp();
		vo_.setID_RECHAZO(new Double(1280));
		try {
			facade_.getTransaccionRechazada(vo_);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
