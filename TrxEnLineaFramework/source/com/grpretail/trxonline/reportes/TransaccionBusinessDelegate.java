/*
 * Created on Jan 25, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.grpretail.trxonline.reportes;

import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceProvider;
import com.asic.transacciones.vo.TPOS_HEADER;
import com.asic.transacciones.vo.TRANSACCION;

/**
 * @author Kcadena
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public interface TransaccionBusinessDelegate extends ServiceProvider{
	
	public List getTransacciones(TPOS_HEADER pHeader, int pPosIni, int pPosFin) throws ServiceException;

	/**
	 * @param pHeader
	 * @param pPosIni
	 * @param pPosFin
	 * @return
	 */
	public TRANSACCION getDetalleTransacciones(TPOS_HEADER pHeader, int pPosIni, int pPosFin) throws ServiceException;
}
