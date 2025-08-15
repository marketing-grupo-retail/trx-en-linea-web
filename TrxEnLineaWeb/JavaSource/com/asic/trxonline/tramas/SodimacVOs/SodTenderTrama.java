/*
 * Creado el 8/11/2005
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.trxonline.tramas.SodimacVOs;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceLocator;
import com.asic.transacciones.vo.TX_TENDER;
import com.asic.trxonline.sma.strings.TenderString;

/**
 * @author Javier
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class SodTenderTrama extends TenderString {
	
	private TX_TENDER stringRecord;


	public SodTenderTrama(String pRecord) {
		super(pRecord);
	}

	public void fillData() throws ServiceException {
		stringRecord = (TX_TENDER) ServiceLocator.getVO(TX_TENDER.class);
		Class clase_ = stringRecord.getClass();
		Object retObj_ = null;
		Field[] fields_ = clase_.getDeclaredFields();

		for (int i = 0; i < fields_.length; i++) {
			Field fd_ = fields_[i];
			String fdName_ = fd_.getName();

			if (fdName_.startsWith("_") && !fdName_.equals("_ID_RECHAZO")) {
				try {
					String retorno_ = (String) invocarMetodo(this, "get" + fdName_.substring(1), new Class[] {
					}, null);
					invocarMetodo(stringRecord, "set" + fdName_.substring(1), new Class[] { String.class }, new Object[] { retorno_ });
				} catch (ServiceException e) {
					LogWriter.getLog().log(LogWriter.FINEST, "[fillData(...), Metodo set/get no hallado para el atributo :" + fdName_, e);
					//throw new ServiceException("Exception", e);
				}
			}
		}

	}

	private Object invocarMetodo(Object pObject, String pMetodo, Class[] pParametros, Object[] pObjetos) throws ServiceException {

		try {
			Method method_ = pObject.getClass().getMethod(pMetodo, pParametros);
			return method_.invoke(pObject, pObjetos);

		} catch (IllegalArgumentException e) {
			LogWriter.getLog().log(LogWriter.FINEST, "[invocarMetodo(...)", e);
			throw new ServiceException("Exception", e);
		} catch (SecurityException e) {
			LogWriter.getLog().log(LogWriter.FINEST, "[invocarMetodo(...)", e);
			throw new ServiceException("Exception", e);
		} catch (NoSuchMethodException e) {
			LogWriter.getLog().log(LogWriter.FINEST, "[invocarMetodo(...)", e);
			throw new ServiceException("Exception", e);
		} catch (IllegalAccessException e) {
			LogWriter.getLog().log(LogWriter.FINEST, "[invocarMetodo(...)", e);
			throw new ServiceException("Exception", e);
		} catch (
		InvocationTargetException e) {
			LogWriter.getLog().log(LogWriter.FINEST, "[invocarMetodo(...)", e);
			throw new ServiceException("Exception", e);
		}
	}

	public String getCUSTOMER(){
		if (getInfo(4)!=null && getInfo(4).length()>22)
			return getInfo(4).substring(0,22);
		if (getInfo(4)!=null && !getInfo(4).trim().equals(""))
			return getInfo(4);
		return "00";
	}

	/**
	 * @return
	 */
	public TX_TENDER getStringRecord() {
		return stringRecord;
	}
	
 

}
