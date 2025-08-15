/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * Id:
 *
 */
package com.grpretail.control;

import java.util.Hashtable;

/**
 * @author LuisL
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class SessionAdmin {

	private static SessionAdmin instance;

	private Hashtable hashUserSession;

	private SessionAdmin(){
		hashUserSession = new Hashtable();
	}

	/** Este hashtable tiene el login del usuario como llave, y un Vector como valor.
	 * La primera posición del Vector tiene el id del usuario, la segunda el id de la sesión
	 * y la tercera contiene un Integer con el número de intentos fallidos de login seguidos.
	 * @return
	 */
	public Hashtable getHashUserSession() {
		return hashUserSession;
	}

	/**
	 * @return
	 */
	public static SessionAdmin getInstance() {
		if (instance == null){
			instance = new SessionAdmin();
		}
		return instance;
	}

	/**
	 * @param hashtable
	 */
	public void setHashUserSession(Hashtable hashtable) {
		hashUserSession = hashtable;
	}

	/**
	 * @param admin
	 */
	public void setInstance(SessionAdmin admin) {
		instance = admin;
	}

}
