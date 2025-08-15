/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogot�, Colombia.
 * * All rights Reserved.
 *
 * Id:
 *
 */
package com.asic.frk.control;

/**
 * Excepcion lanzada cuando el usuario intenta acceder a una accion sobre la
 * cual no tiene permisos.
 * @author ramm
 */
public class InvalidActionAccessException extends Exception {

	public InvalidActionAccessException(){

		super("InvalidActionAccessException");
	}

}
