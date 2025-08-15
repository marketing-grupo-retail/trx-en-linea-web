/*
 * Creado el Jun 20, 2005
 */
package com.asic.transacciones.helpers;

import java.security.PublicKey;
import java.util.List;



import com.asic.framework.exception.ServiceException;
import com.asic.framework.helpers.AbstractHelper;
import com.asic.transacciones.delegate.MQAdminBusinessDelegate;

/**
 * @author admin
 */
public class MQAdminHelper extends AbstractHelper {

	

	
	public void enviarMensajeCola(Object pMsg) throws com.asic.framework.exception.ServiceException, ServiceException{
		((MQAdminBusinessDelegate)getService(MQAdminBusinessDelegate.class)).enviarMensajeCola(pMsg);
	}
	
	public static void main(String []ar){
		MQAdminHelper helper_ = new MQAdminHelper();
		try {
			helper_.enviarMensajeCola("prueba 1");
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
