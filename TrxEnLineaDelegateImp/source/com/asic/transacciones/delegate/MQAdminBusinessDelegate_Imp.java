/*
 * Created on Nov 16, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.delegate;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.facade.MQAdminFacadeAdapter;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class MQAdminBusinessDelegate_Imp implements MQAdminBusinessDelegate {

	/* (non-Javadoc)
	 * @see com.asic.transacciones.delegate.MQAdminBusinessDelegate#enviarMensajeCola(java.lang.Object)
	 */
	public void enviarMensajeCola(Object pObj) throws ServiceException {
		MQAdminFacadeAdapter facade_ = new MQAdminFacadeAdapter();
		facade_.enviarMensajeCola(pObj);
	}

}
