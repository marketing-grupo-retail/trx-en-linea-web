/*
 * Created on Jan 25, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.facade;

import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.bean.AdminRechazosBean;
import com.asic.transacciones.delegate.AdminRechazosBusinessDelegate;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TX_RECHAZO;

/**
 * @author Kcadena
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class AdminRechazosFacadeAdapter implements AdminRechazosBusinessDelegate{

	public List getRechazos(int pInic, int	pNumfilas)throws ServiceException {
		AdminRechazosBean bean_ = new  AdminRechazosBean(); 
		return bean_.getRechazos(pInic, pNumfilas);

	}

	public TRANSACCION getTransaccionRechazada(TX_RECHAZO pVo) throws ServiceException {
		AdminRechazosBean bean_ = new  AdminRechazosBean(); 
		return bean_.getTransaccionRechazada(pVo);
	
	}
	
	public List getRechazo(TX_RECHAZO pVo) throws ServiceException{
		AdminRechazosBean bean_ = new  AdminRechazosBean(); 
		return bean_.getRechazo(pVo);
	}
}
