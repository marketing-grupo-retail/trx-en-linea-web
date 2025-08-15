/*
 * Creado el 05-abr-06
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.transacciones.helpers;

import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.helpers.AbstractHelper;
import com.asic.transacciones.delegate.DemoBusinessDelegate;

/**
 * @author Administrador
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class DemoHelper  extends AbstractHelper {
	
	public boolean insertRecord(Object pTrx) throws ServiceException, com.asic.framework.exception.ServiceException {
		DemoBusinessDelegate dbd_ = (DemoBusinessDelegate)getService(DemoBusinessDelegate.class);
		return dbd_.insertRecord(pTrx);
	
	}

	public boolean insertTransactionSummaryReportRecord(Object pTrx) throws ServiceException, com.asic.framework.exception.ServiceException {
		DemoBusinessDelegate dbd_ = (DemoBusinessDelegate)getService(DemoBusinessDelegate.class);
		return dbd_.insertRecord(pTrx);
	
	}

	public List getSupportStores() throws ServiceException {
		DemoBusinessDelegate dbd_ = (DemoBusinessDelegate)getService(DemoBusinessDelegate.class);
		return dbd_.getSupportStores();
	}

	/*public TRANSACCION getTransaccionRechazada(TX_RECHAZO pVo) throws ServiceException, com.asic.framework.exception.ServiceException {
		AdminRechazosBusinessDelegate adm_ = (AdminRechazosBusinessDelegate) getService(AdminRechazosBusinessDelegate.class);
		return adm_.getTransaccionRechazada(pVo);

	}
	
	public List getRechazo(TX_RECHAZO pVo) throws ServiceException{
		AdminRechazosBusinessDelegate adm_ = (AdminRechazosBusinessDelegate) getService(AdminRechazosBusinessDelegate.class);
		return adm_.getRechazo(pVo);
		
	}*/
}
