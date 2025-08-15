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
 * @author 
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public interface ValidadorStringsBusinessDelegate extends ServiceProvider{
	
	public List validarTrama(TRANSACCION pVo) throws ServiceException;
}
