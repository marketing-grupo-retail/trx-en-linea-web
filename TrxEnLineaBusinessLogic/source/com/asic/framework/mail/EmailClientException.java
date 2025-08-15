/*
 * Proyecto: VisaWeb
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * All riths Reserved.
 *
 * $Id: EmailClientException.java,v 1.1 2019/12/18 17:08:59 Alfonso Exp $
 *
 */
package com.asic.framework.mail;

import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;

/**
 * Excepcion generada en el envio de correo.
 * 
 * Ejemplo:
 * 		EmailClientException ex_ = ...
 * 		...
 * 		// inicializa la lista 
 * 		// (no es necesario si es la primera vez que se recorre)
 * 		ex_.restartException();
 * 		ex_.getMessage();
 * 		for(;ex_.hasMoreExceptions();){
 * 			actEx_ = ex_.getActualException();
 * 			String message_ = actEx_.getMessage();
 * 			actEx_.printStackTrace(); 			
 * 			if(ex_.isSendMessageException()){
 * 				ex_.processNextException();
 * 				System.out.println(ex_.getInvalidAddressList());
 * 				System.out.println(ex_.getValidSendAddressList());
 * 				System.out.println(ex_.getValidUnsendAddressList());
 * 			}
 * 		}
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class EmailClientException extends Exception {
	/** JDOC Field Def */
	private Exception rootException;

	private Exception actualException;

	private Address[] invalidAddress;
	private Address[] validUnsend;
	private Address[] validSend;

	/**
	 *Crea una nueva excepcion de correo
	 *
	 * @param pMessage DOCUMENT ME!
	 * @param pException DOCUMENT ME!
	 */
	public EmailClientException(String pMessage, Exception pException) {
		super(pMessage);
		rootException = pException;
		actualException = rootException;
	}
	
	/**
	 * Retorna si hay nuevas excepciones
	 * @return true si hay nuevas, false en caso contrario
	 */
	public boolean hasMoreExceptions(){
		return (actualException != null)?true:false;		
	}
	/**
	 * Retorna si la expcicion actual fue causada por el envio.
	 * @return true si fue causa del envio, false en caso contrario
	 */
	public boolean isSendMessageException(){
		return (actualException != null && actualException instanceof SendFailedException)?true:false;
	}
	
	public void restartException(){
		actualException = rootException;
	}

	public void processNextException() {

		if(actualException != null){
			// si es una excepcion de envio actualiza las direcciones invalidas
			if (actualException instanceof SendFailedException) {
				SendFailedException sfex_ = (SendFailedException) actualException;
				
				setInvalidAddress(sfex_.getInvalidAddresses());
				setValidUnsend(sfex_.getValidUnsentAddresses());
				setValidSend(sfex_.getValidSentAddresses());
			}
			// valida si existe una excepcion siguiente
			if (actualException instanceof MessagingException){		
				actualException = ((MessagingException) actualException).getNextException();
			}else{
				actualException = null;
			}			
		}		
	}
	
	
	
	/**
	 * @return
	 */
	public Exception getRootCause() {
		return rootException;
	}

	/**
	 * @return
	 */
	public Address[] getInvalidAddress() {
		return invalidAddress;
	}

	/**
	 * Envia las direcciones invalidas separadas por comas
	 * o null si no existe
	 * @return Direcciones invalidas
	 */
	public String getInvalidAddressList() {

		return getAddressList(invalidAddress);
	}

	/**
	 * Envia las direcciones validas enviadas separadas por comas
	 * o null si no existe
	 * @return Direcciones invalidas
	 */
	public String getValidSendAddressList() {
		return getAddressList(validSend);
	}

	/**
	 * Envia las direcciones invalidas separadas por comas
	 * o null si no existe
	 * @return Direcciones invalidas
	 */
	public String getValidUnsendAddressList() {

		return getAddressList(validUnsend);
	}

	private String getAddressList(Address[] pAddress) {
		String res_ = null;
		if (pAddress != null) {
			res_ = "";
			for (int i = 0; i < pAddress.length; i++) {
				res_ += pAddress[i] + ",";
			}
		}
		return res_;
	}

	/**
	 * @return
	 */
	public Address[] getValidSend() {
		return validSend;
	}

	/**
	 * @return
	 */
	public Address[] getValidUnsend() {
		return validUnsend;
	}

	/**
	 * @param addresses
	 */
	public void setInvalidAddress(Address[] addresses) {
		invalidAddress = addresses;
	}

	/**
	 * @param addresses
	 */
	public void setValidSend(Address[] addresses) {
		validSend = addresses;
	}

	/**
	 * @param addresses
	 */
	public void setValidUnsend(Address[] addresses) {
		validUnsend = addresses;
	}

	/**
	 * Retorna la expcion actualmente procesada
	 * @return
	 */
	public Exception getActualException() {
		return actualException;
	}

}
