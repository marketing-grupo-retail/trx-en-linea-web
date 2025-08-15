/*
 * Created on Mar 16, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.facade;

import java.util.List;

import com.asic.transacciones.bean.ValidadorStringsTransBean;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.framework.exception.ServiceException;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ValidadorStringsFacadeAdapter {

	public List validarTrama(TRANSACCION pVo) throws ServiceException {
		ValidadorStringsTransBean bean_= new ValidadorStringsTransBean();
		return bean_.validarTrama(pVo);

	}
}
