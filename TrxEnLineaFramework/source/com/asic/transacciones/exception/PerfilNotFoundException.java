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
 * Excepción de perfil no encontrado
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
