/*
 * Creado el Jun 20, 2005
 */
package com.asic.transacciones.helpers;

import java.security.PublicKey;
import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.helpers.AbstractHelper;
import com.asic.transacciones.delegate.AdminRechazosBusinessDelegate;
import com.asic.transacciones.delegate.MQAdminBusinessDelegate;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TX_RECHAZO;

/**
 * @author admin
 */
public class AdminRechazosHelper extends AbstractHelper {

	public List getRechazos(int pInic, int pNumFilas) throws ServiceException, com.asic.framework.exception.ServiceException {
		AdminRechazosBusinessDelegate adm_ = (AdminRechazosBusinessDelegate) getService(AdminRechazosBusinessDelegate.class);
		return adm_.getRechazos(pInic, pNumFilas);
	
	}

	public TRANSACCION getTransaccionRechazada(TX_RECHAZO pVo) throws ServiceException, com.asic.framework.exception.ServiceException {
		AdminRechazosBusinessDelegate adm_ = (AdminRechazosBusinessDelegate) getService(AdminRechazosBusinessDelegate.class);
		return adm_.getTransaccionRechazada(pVo);

	}
	
	public List getRechazo(TX_RECHAZO pVo) throws ServiceException{
		AdminRechazosBusinessDelegate adm_ = (AdminRechazosBusinessDelegate) getService(AdminRechazosBusinessDelegate.class);
		return adm_.getRechazo(pVo);
		
	}

}
