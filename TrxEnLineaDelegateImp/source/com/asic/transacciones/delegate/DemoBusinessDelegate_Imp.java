/*
 * Creado el 05-abr-06
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.transacciones.delegate;

import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.facade.ProcesarTransaccionFacadeAdapter;
import com.asic.transacciones.facade.SupportFacadeAdapter;
import com.asic.transacciones.vo.TRANSACCION;

/**
 * @author Administrador
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class DemoBusinessDelegate_Imp implements DemoBusinessDelegate {
	public boolean insertRecord(Object pRecord) throws ServiceException {
		ProcesarTransaccionFacadeAdapter facade_ = new ProcesarTransaccionFacadeAdapter();
		return facade_.procesarTransaccionDemo((TRANSACCION)pRecord);
	}
	
	public boolean insertTransactionSummaryReportRecord(Object pTrx) throws ServiceException{
		return true;
	}
	
	public List getSupportStores() throws ServiceException{
	//public boolean insertTransactionSummaryReportRecord(Object pTrx) throws ServiceException{
		SupportFacadeAdapter facade_ = new SupportFacadeAdapter();
		return facade_.getSupportStores();
	}	
}
