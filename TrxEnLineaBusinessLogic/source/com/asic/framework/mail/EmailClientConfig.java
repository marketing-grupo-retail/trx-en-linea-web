/*
 * Creado el 31/05/2004
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.framework.mail;

/**
 * @author Administrador
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class EmailClientConfig {
	
	private String user;
	
	private String password;
	
	private String mailOwner;
	
	private String snmp;

	/**
	 * 
	 */
	public EmailClientConfig() {
		super();
	}

	/**
	 * @return
	 */
	public String getMailOwner() {
		return mailOwner;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return
	 */
	public String getSnmp() {
		return snmp;
	}

	/**
	 * @return
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param string
	 */
	public void setMailOwner(String string) {
		mailOwner = string;
	}

	/**
	 * @param string
	 */
	public void setPassword(String string) {
		password = string;
	}

	/**
	 * @param string
	 */
	public void setSnmp(String string) {
		snmp = string;
	}

	/**
	 * @param string
	 */
	public void setUser(String string) {
		user = string;
	}

}
