/*
 * Proyecto: VisaWeb
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * All riths Reserved.
 *
 * Id:
 *
 */
package com.asic.transacciones.exception;

import com.asic.framework.exception.ServiceException;

/**
 * Excepción de usuario desconocido
 * 
 * @author ASIC
 */
public class UserUnknowException extends ServiceException {

	/**
	 * Constructor de UserUnknowException.
	 */
    public UserUnknowException() {
        super("UserUnknowException");
    }
}
