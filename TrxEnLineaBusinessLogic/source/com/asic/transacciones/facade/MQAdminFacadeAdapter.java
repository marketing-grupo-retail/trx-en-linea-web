/*
 * Created on Nov 16, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.facade;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.delegate.MQAdminBusinessDelegate;
import com.asic.transacciones.util.jmsmq.MQAdminBean;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class MQAdminFacadeAdapter implements MQAdminBusinessDelegate{

	/* (non-Javadoc)
	 * @see com.asic.transacciones.delegate.MQAdminBusinessDelegate#enviarMensajeCola(java.lang.Object)
	 */
	public void enviarMensajeCola(Object pObj) throws ServiceException /*throws ServiceException*/ {
		MQAdminBean mqa_ = new  MQAdminBean();
		mqa_.enviarACola(pObj);
		
	}
	
	public void leerMensajeCola(Object pObj) throws ServiceException {
		MQAdminBean mqa_ = new  MQAdminBean();
		mqa_.recibirMensaje();
		
	}
	
	

}
