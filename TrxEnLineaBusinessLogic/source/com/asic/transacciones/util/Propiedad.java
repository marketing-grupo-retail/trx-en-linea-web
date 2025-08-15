/*
 * Proyecto: <Proyect Name>
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: Propiedad.java,v 1.1 2019/12/18 17:09:00 Alfonso Exp $
 *
 */
package com.asic.transacciones.util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;


/**
 * Propiedad
 *
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class Propiedad {

	public static final String RESOURCE_BUNDLE_CFG ="com.asic.transacciones.resources.estructura_trx";
	public static final String RESOURCE_BUNDLE_MSG ="com.asic.transacciones.resources.mensajes_cfg";
	public static final String RESOURCE_BUNDLE_PARAMS ="com.asic.transacciones.resources.parametros_cfg";
	public static final String SO = "file.property.SO";
	public static final String MAX_LONG_ERROR = "maxima.longitud.msg";
	public static final String MAX_LONG_OFFSETX = "maxima.longitud.offsetx";
	public static final String TIEMPO_PROC_STOP="proc_stop.tiempo";
	private static Hashtable reglasValHash;
	private static Hashtable mensajesHash;

	private static ResourceBundle resourceLang;
	private static ResourceBundle resourceConfig;
	private static Propiedad unicaInstancia;

	/**
	 * 
	 */
	private Propiedad() {	}

	/**
	 * 
	 * @param pPropiedad
	 * @return
	 */
	public String getPropiedad(String pPropiedad, String pBundle) {
		try {
			if (resourceConfig == null)
				resourceConfig = ResourceBundle.getBundle(pBundle);
			
			return resourceConfig.getString(pPropiedad);

		} catch (Exception e) {
			LogWriter.getLog().log(LogWriter.WARNING, "getPropiedad", e);
			return "";
		}

	}

	public Hashtable getPropiedadesValidacion(String pBundle) throws ServiceException {
	
		Hashtable propsHash = new Hashtable();
		Hashtable detalleHash = new Hashtable();
			try {
				//if (resourceConfig == null)
				resourceConfig = ResourceBundle.getBundle(pBundle);
				
				Enumeration claves_ = resourceConfig.getKeys();
				
				while (claves_.hasMoreElements()){
					String key_ = (String) claves_.nextElement();
					String val_ = resourceConfig.getString(key_).trim();
					int pos_ =  key_.indexOf(".");
					String prefixKey_ = key_.substring(0,pos_);
					String nombreKey_ = key_.substring(pos_+1,key_.length());
					
					if (propsHash.containsKey(prefixKey_)){
						detalleHash = (Hashtable) propsHash.get(prefixKey_);
						detalleHash.put(nombreKey_,val_);	
					}
					else{
						detalleHash = new Hashtable();
						detalleHash.put(nombreKey_,val_);	
						propsHash.put(prefixKey_, detalleHash);
					}
				}

			} catch (Exception e) {
				LogWriter.getLog().log(LogWriter.WARNING, "[getPropiedadesValidacion(...)", e);
				throw new ServiceException("Exception", e);
			}
			return propsHash;
		}
	
	public Hashtable getPropiedades(String pBundle) throws ServiceException {
	
			Hashtable propsHash = new Hashtable();
			
				try {
					resourceConfig = ResourceBundle.getBundle(pBundle);
				
					Enumeration claves_ = resourceConfig.getKeys();
				
					while (claves_.hasMoreElements()){
						String key_ = (String) claves_.nextElement();
						String val_ = resourceConfig.getString(key_).trim();
						propsHash.put(key_, val_);
					}

				} catch (Exception e) {
					LogWriter.getLog().log(LogWriter.WARNING, "[getPropiedades(...)", e);
					throw new ServiceException("Exception", e);
				}
				return propsHash;
			}

	public static Propiedad getInstance() {
		if (unicaInstancia == null)
			unicaInstancia = new Propiedad();
		return unicaInstancia;
	}

	
	/**
	 * @return
	 */
	public Hashtable getMensajesHash() throws ServiceException {
	
		if (mensajesHash == null)
			try {
				mensajesHash = Propiedad.getInstance().getPropiedades(Propiedad.RESOURCE_BUNDLE_MSG);
			} catch (ServiceException e) {
				LogWriter.getLog().log(LogWriter.WARNING, "[getMensajesHash(...)", e);
				throw new ServiceException("Exception", e);

			}

		return mensajesHash;
	}

	/**
	 * @return
	 */
	public  Hashtable getReglasValHash() throws ServiceException {
		if (reglasValHash==null)
		try {
			reglasValHash = Propiedad.getInstance().getPropiedadesValidacion(Propiedad.RESOURCE_BUNDLE_CFG);
		} catch (ServiceException e) {
			LogWriter.getLog().log(LogWriter.WARNING, "[getReglasValHash(...)", e);
			throw new ServiceException("Exception", e);

		}
		return reglasValHash;
	}

}
