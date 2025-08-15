/*
 * Proyecto: VisaWeb
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogot�, Colombia.
 * All riths Reserved.
 *
 * Id:
 *
 */
package com.asic.transacciones.exception;

import com.asic.framework.exception.ServiceException;

/**
 * Excepci�n de usuario desconocido
 * 
 * @author ASIC
 */
public class TramaInvalidaException extends ServiceException {

	/**
	 * Constructor de InvalidTramaException.
	 */
    public TramaInvalidaException() {
        super("InvalidTramaException");
    }
}
