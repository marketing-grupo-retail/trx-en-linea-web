/*
 * Creado el 03-jun-07
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.grpretail.trxonline.helpers;

import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.helpers.AbstractHelper;
import com.asic.transacciones.vo.TPOS_HEADER;
import com.asic.transacciones.vo.TRANSACCION;

/**
 * @author Administrador
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class TransaccionHelper extends AbstractHelper {
	
	public List getTransacciones(TPOS_HEADER pHeader, int pPosIni, int pPosFin) throws ServiceException {
		return getTransaccionService().getTransacciones(pHeader, pPosIni, pPosFin);
	}

	/**
	 * @param object_
	 * @param posIni_
	 * @param numFilas_
	 * @return
	 */
	public TRANSACCION getDetalleTransacciones(TPOS_HEADER pHeader, int pPosIni, int pPosFin)  throws ServiceException {
		return getTransaccionService().getDetalleTransacciones(pHeader, pPosIni, pPosFin);
	}
	

}
