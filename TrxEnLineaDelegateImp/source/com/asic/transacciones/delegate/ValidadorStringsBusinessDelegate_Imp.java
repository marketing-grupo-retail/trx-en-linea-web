/*
 * Created on Jan 25, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.delegate;

import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.facade.ValidadorStringsFacadeAdapter;
import com.asic.transacciones.vo.TRANSACCION;

/**
 * @author Kcadena
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ValidadorStringsBusinessDelegate_Imp implements ValidadorStringsBusinessDelegate {

	/* (non-Javadoc)
	 * @see com.asic.transacciones.delegate.ValidadorStringsBusinessDelegate#validarTrama(com.asic.transacciones.vo.TRANSACCION)
	 */
	public List validarTrama(TRANSACCION pVo) throws ServiceException {
		ValidadorStringsFacadeAdapter facade_ = new ValidadorStringsFacadeAdapter();
		return facade_.validarTrama(pVo);
	}

	
}
