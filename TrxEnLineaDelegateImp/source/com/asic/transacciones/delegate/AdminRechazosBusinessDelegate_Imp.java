/*
 * Created on Jan 25, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.delegate;

import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.facade.AdminRechazosFacadeAdapter;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TX_RECHAZO;

/**
 * @author Kcadena
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class AdminRechazosBusinessDelegate_Imp implements AdminRechazosBusinessDelegate {

	/* (non-Javadoc)
	 * @see com.asic.transacciones.delegate.AdminRechazosBusinessDelegate#getRechazos()
	 */
	public List getRechazos(int pInic, int	pNumfilas) throws ServiceException {
	
		AdminRechazosFacadeAdapter facade_ = new AdminRechazosFacadeAdapter();
		return facade_.getRechazos(pInic, pNumfilas);
	}

	/* (non-Javadoc)
	 * @see com.asic.transacciones.delegate.AdminRechazosBusinessDelegate#getTransaccionRechazada(com.asic.transacciones.vo.TX_RECHAZO)
	 */
	public TRANSACCION getTransaccionRechazada(TX_RECHAZO pVo) throws ServiceException {
		AdminRechazosFacadeAdapter facade_ = new AdminRechazosFacadeAdapter();
		return facade_.getTransaccionRechazada(pVo);
	}

	/* (non-Javadoc)
	 * @see com.asic.transacciones.delegate.AdminRechazosBusinessDelegate#getRechazo(com.asic.transacciones.vo.TX_RECHAZO)
	 */
	public List getRechazo(TX_RECHAZO pVo) throws ServiceException {
		AdminRechazosFacadeAdapter facade_ = new AdminRechazosFacadeAdapter();
		return facade_.getRechazo(pVo);
	}
}
