/*
 * Created on 14/07/2011
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.grpretail.trxonline.reportes;

import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.vo.TPOS_HEADER;
import com.asic.transacciones.vo.TRANSACCION;

/**
 * @author Andrea
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TransaccionBusinessDelegate_Imp implements TransaccionBusinessDelegate {

	private TransaccionFacadeAdapter facade_ = null;
	/* (non-Javadoc)
	 * @see com.grpretail.trxonline.reportes.TransaccionBusinessDelegate#getTransacciones(com.asic.transacciones.vo.TPOS_HEADER, int, int)
	 */
	public List getTransacciones(TPOS_HEADER pHeader, int pPosIni, int pPosFin) throws ServiceException {
		facade_ = new TransaccionFacadeAdapter();
		return facade_.getTransacciones(pHeader, pPosIni, pPosFin);
	}
	/* (non-Javadoc)
	 * @see com.grpretail.trxonline.reportes.TransaccionBusinessDelegate#getDetalleTransacciones(com.asic.transacciones.vo.TPOS_HEADER, int, int)
	 */
	public TRANSACCION getDetalleTransacciones(TPOS_HEADER pHeader, int pPosIni, int pPosFin) throws ServiceException {
		facade_ = new TransaccionFacadeAdapter();
		return facade_.getDetalleTransacciones(pHeader, pPosIni, pPosFin);
	}

}
