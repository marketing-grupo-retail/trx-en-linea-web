/*
 * Proyecto: <Proyect Name>
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: MessageHelper.java,v 1.1 2019/12/18 17:31:06 Alfonso Exp $
 *
 */
package com.asic.framework.helpers.error;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import org.ramm.jwaf.locator.FailedLocatingPropertiesFileException;
import org.ramm.jwaf.locator.ResourceLocator;
import org.ramm.jwaf.logger.LogWriter;


/**
 * <ASIC:Definicion de Clase>
 *
 * <Ejemplo de Uso (opcional)>
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class MessageHelper {

	/**
	 * Método para interpretar una cadena de error de un archivo de propiedades 
	 * con sus parámetros
	 *
	 * @param pMessage 
	 * @param pVariables
	 * 
	 * @return void
	 */
	public static String parseResourceMessage(
		String pMessage,
		Hashtable pVariables) {

		try {

			Locale locale = new java.util.Locale("","");
			ResourceBundle rb_= ResourceBundle.getBundle("ApplicationResources",locale);
			//ResourceBundle rb_ = ResourceLocator.get("ApplicationResources");
			StringBuffer sb_ = new StringBuffer(rb_.getString(pMessage));
			if (pVariables == null) {
				return sb_.toString();
			}

			for (Enumeration e = pVariables.keys(); e.hasMoreElements();) {
				String key_ = (String) e.nextElement();
				int ini_ = sb_.toString().indexOf((String) key_);
				if (ini_ != -1) {
					int fin_ = ini_ + key_.length();
					sb_.replace(ini_, fin_, (String) pVariables.get(key_));
				}
			}
			return sb_.toString();

		} catch (Exception e) {
			LogWriter.getLog().log(LogWriter.WARNING, "parseResourceMessage", e);
			return null;
		}
	}
	
	public static String parseResourceMessage(String pMessage) {
		return parseResourceMessage(pMessage, null);
	}

	public static Hashtable getVariables(String pMessage, String pVariables) {
		Hashtable hash_= new Hashtable();
		try {
			ResourceBundle rb_  = ResourceLocator.get("ApplicationResources");
			StringBuffer sb_ = new StringBuffer(rb_.getString(pMessage));

			if (sb_ != null && sb_.length() > 0) {
				StringTokenizer tok_ = new StringTokenizer(sb_.toString());
				String sub_;
				while (tok_.hasMoreTokens()) {
					sub_ = tok_.nextToken();
					if (sub_.startsWith("<")&& sub_.endsWith(">")){
						hash_.put(sub_.substring(1,sub_.length()-1),"");
					}					
				}
			}

		} catch (FailedLocatingPropertiesFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return hash_;

	}
	
	
	public static void main(String arg[]){
		MessageHelper.getVariables("report.user.creado","");
	}
}
