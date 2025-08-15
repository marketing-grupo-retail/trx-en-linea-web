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
 * Excepci�n de perfil no encontrado
 * 
 * @author ASIC
 */
public class PerfilNotFoundException extends ServiceException {

	/**
	 * Constructor de PerfilNotFoundException.
	 */
    public PerfilNotFoundException() {
        super("PerfilNotFoundException");
    }
}
