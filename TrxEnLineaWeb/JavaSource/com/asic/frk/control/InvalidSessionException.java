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
 * @author ramm
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generaci�n de c�digo&gt;C�digo y comentarios
 */
public class InvalidSessionException extends Exception {

	/**
	 * Excepci�n lanzada cuando la sesi�n es invalida.
	 */
	public InvalidSessionException() {
		super("InvalidSessionException");
	}

	public InvalidSessionException(String str_) {
			super(str_);
	}
}
