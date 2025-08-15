/*
 * Creado el 05-abr-06
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.transacciones.delegate;

import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceProvider;

/**
 * @author Administrador
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public interface DemoBusinessDelegate  extends ServiceProvider {
	public boolean insertRecord(Object pRecord)throws ServiceException;
	public boolean insertTransactionSummaryReportRecord(Object pTrx) throws ServiceException;
	public List getSupportStores() throws ServiceException;
}
