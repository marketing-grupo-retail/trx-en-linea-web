/*
 * @(#)EmailException.java	$Date: 2019/12/18 17:08:59 $
 * 
 * Copyright 2002 Luis Mulato
 *
 * $Id: EmailClientService.java,v 1.1 2019/12/18 17:08:59 Alfonso Exp $
 */

package com.asic.framework.mail;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

import javax.activation.DataHandler;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Libreria para envio de correos.
 *
 * @version     1.0 - 14/10/2002
 * @author      <a href="mailto:luis_mulato@yahoo.com">Luis R. Mulato</a>
 */
public class EmailClientService {

	public static String TEXT_HTML_MIMETYPE = "text/html";

	private String password;

	private String user;
	
	private String mailOwner;

	private static EmailClientService emailClient = null;

	private String host;

	private Properties mailProperties;
	private Session mailSession;

	private EmailClientService(String pSnmp, boolean pDebug) {
		Properties aProperties = new Properties();

		setSnmp(pSnmp);
		aProperties.put("mail.smtp.host", pSnmp);
		//aProperties.put("mail.user", "gmonroy");
		//aProperties.put("mail.password", "GMyy5*6*");

		if (pDebug)
			aProperties.put("mail.debug", String.valueOf(pDebug));

		setMailSession(Session.getDefaultInstance(aProperties, null));
		getMailSession().setDebug(pDebug);
	}

	/**
	 * Constructor que utiliza login y password para el envio de correo
	 * @param pSnmpServer
	 * @param pDebug
	 * @param pUser
	 * @param pPassword
	 */
	public EmailClientService(
		String pSnmpServer,
		boolean pDebug,
		String pUser,
		String pPassword) {

		this(pSnmpServer, pDebug);
		setUser(pUser);
		setPassword(pPassword);


	}

	/**
	 * Envia correo con cuerpo en una linea ya formateado con sus
	 * respectivos saltos de linea.
	 * 
	 * @param pSubject	Titulo del correo
	 * @param pFrom		Propietario del mensaje
	 * @param pTo		Lista de Usuarios
	 * @param pBody		Cuerpo del mensaje
	 * @throws EmailClientException
	 */
	public void sendMail(
		String pSubject,
		String pFrom,
		String pTo,
		String pBody,
		String pMimeType)
		throws EmailClientException {

		Vector toAddress_ = new Vector();
		toAddress_.addElement(pTo);
		Vector body_ = new Vector();
		body_.addElement(pBody);
		// envia el correo
		sendMail(pSubject, pFrom, toAddress_, body_, pMimeType);
	}

	public void sendMail(
		String pSubject,
		String pFrom,
		Vector pTo,
		String pBody,
		String pMimeType)
		throws EmailClientException {

//		Vector toAddress_ = new Vector();
//		toAddress_.addElement(pTo);
		Vector body_ = new Vector();
		body_.addElement(pBody);
		// envia el correo
		sendMail(pSubject, pFrom, pTo, body_, pMimeType);
	}

	/**
	 * 
	 * Envia un correo a varios usuarios
	 * @param pSubject	Titulo del correo
	 * @param pFrom		Propietario del mensaje
	 * @param pTo		Lista de Usuarios
	 * @param pBody		Cuerpo del mensaje
	 * @throws EmailClientException
	 */
	public void sendMail(
		String pSubject,
		String pFrom,
		Vector pTo,
		Vector pBody,
		String pMimeType)
		throws EmailClientException {

		String cuerpo_ = "";
		for (Enumeration elems_ = pBody.elements();
			elems_.hasMoreElements();
			) {
			cuerpo_ += (String) elems_.nextElement() + "\n";
		}

		try {

			InternetAddress address_[] = getAddress(pTo);
			// crea un mensaje
			Message msg =
				createMessage(pSubject, pFrom, cuerpo_, address_, pMimeType);

			//			Transport.send(msg);
			sendMessage(address_, msg);

		} catch (Exception mex) {
			errorHandler(mex);
		}
	}

	private void sendMessage(InternetAddress[] pAddress, Message pMessage)
		throws NoSuchProviderException, MessagingException {
		// si existe usuario crea transporte con autenticacion
		if (getUser() != null && !getUser().equals("")) {

			Transport transport = getMailSession().getTransport("smtp");
			transport.connect(getSnmp(), getUser(), password);
			transport.sendMessage(pMessage, pAddress);

			// si no, envia directamente
		} else {
			Transport.send(pMessage);
		}
	}

	/**
	 * Crea un mensaje dados los parametros recibidos
	 * @param pSubject
	 * @param pFrom
	 * @param pBody
	 * @param pAddress
	 * @param pMimeType		Si es null, crea el mensaje como texto plano
	 * @return
	 * @throws AddressException
	 * @throws MessagingException
	 */
	private Message createMessage(
		String pSubject,
		String pFrom,
		String pBody,
		InternetAddress[] pAddress,
		String pMimeType)
		throws AddressException, MessagingException {

		Message msg = new MimeMessage(getMailSession());
		msg.setFrom(new InternetAddress(pFrom));

		msg.setRecipients(Message.RecipientType.TO, pAddress);
		msg.setSubject(pSubject);
		msg.setSentDate(new Date());

		if (pMimeType == null) {
			msg.setText(pBody);
		} else {
			collect(pSubject, pBody, msg, pMimeType);
		}
		return msg;
	}

	public void collect(
		String pSubject,
		String pBody,
		Message msg,
		String pMimeType)
		throws MessagingException {

		String line;
		StringBuffer sb = new StringBuffer();
		sb.append("<HTML>\n");
		sb.append("<HEAD>\n");
		sb.append("<TITLE>\n");
		sb.append(pSubject + "\n");
		sb.append("</TITLE>\n");
		sb.append("</HEAD>\n");

		sb.append("<BODY>\n");

		sb.append(pBody);
		
		sb.append("\n");

		sb.append("</BODY>\n");
		sb.append("</HTML>\n");

		msg.setDataHandler(
			new DataHandler(new ByteArrayDataSource(sb.toString(), pMimeType)));
	}

	private InternetAddress[] getAddress(Vector pTo) throws AddressException {
		int size_ = pTo.size();
		int i = 0;
		InternetAddress[] address = new InternetAddress[size_];
		// extrae las direcciones requeridas
		for (Enumeration elems_ = pTo.elements();
			elems_.hasMoreElements();
			i++) {
			String add = (elems_.nextElement()).toString();
			address[i] = new InternetAddress(add);
		}
		return address;
	}

	private void errorHandler(Exception pMex) throws EmailClientException {

		String errMessage_ = (pMex != null) ? pMex.getMessage() : "";
		throw new EmailClientException(errMessage_, pMex);

	}

	/**
	 * Valida si una direccion de correo es valida
	 * @return true - si la direccion de correo es valida
	 *		   false - Si no lo es.
	 */
	public boolean valideAddress(String pAddress) {
		try {
			// si no hay arroba
			if ((pAddress.indexOf("@") == -1) // si hay :
				|| (pAddress.indexOf(":") != -1)) {
				return false;
			}
			// validacion forzada para filtrar direcciones
			// con espacios en blanco y otras
			InternetAddress.parse(pAddress);
		} catch (AddressException ex) {
			return false;
		}
		return true;
	}

	/**
	 * Inicializa el servicio de correo con servidor y estado de debug
	 * @param pSnmpServer
	 * @param pDebug
	 */
	public static void init(String pSnmp, boolean pDebug) {
		emailClient = new EmailClientService(pSnmp, pDebug);
	}

	/**
	 * Inicializa el servicio de correo con usuario y password
	 * @param pSnmpServer
	 * @param pDebug
	 * @param pUser
	 * @param pPassword
	 */
	public static void init(
		String pSnmpServer,
		boolean pDebug,
		String pUser,
		String pPassword) {

		emailClient =
			new EmailClientService(pSnmpServer, pDebug, pUser, pPassword);

	}

	public static EmailClientService getInstance() {
		return emailClient;
	}

	public void setSnmp(String pSnmp) {
		this.host = pSnmp;
	}

	public String getSnmp() {
		return host;
	}

	public void setUser(String pUser) {
		this.user = pUser;
	}

	public String getUser() {
		return user;
	}

	private void setMailSession(Session mailSession) {
		this.mailSession = mailSession;
	}

	private Session getMailSession() {
		return mailSession;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param string
	 */
	public void setPassword(String string) {
		password = string;
	}

	/**
	 * @return
	 */
	public String getMailOwner() {
		return mailOwner;
	}

	/**
	 * @param string
	 */
	public void setMailOwner(String string) {
		mailOwner = string;
	}

}
