/*
 * Created on Jan 25, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.delegate;

import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceProvider;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TX_RECHAZO;

/**
 * @author Kcadena
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public interface AdminRechazosBusinessDelegate extends ServiceProvider{
	
	public List getRechazos(int pInic, int	pNumfilas)throws ServiceException;

	public TRANSACCION getTransaccionRechazada(TX_RECHAZO pVo) throws ServiceException ;
	
	public List getRechazo(TX_RECHAZO pVo) throws ServiceException;
}
