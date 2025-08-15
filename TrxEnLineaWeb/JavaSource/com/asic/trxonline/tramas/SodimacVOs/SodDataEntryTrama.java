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
import com.asic.transacciones.vo.TX_DATA_ENTRY;
import com.asic.transacciones.vo.TX_DATA_ENTRY_Imp;
import com.asic.trxonline.sma.strings.DataEntryString;

/**
 * @author Javier
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class SodDataEntryTrama extends DataEntryString {

	public static final String SOD_DATA_ENTRY_1="27112000";
	public static final String SOD_DATA_ENTRY_2="27122000";

	private TX_DATA_ENTRY stringRecord;
	/**
	 * @param arg0
	 * @param arg1
	 */
	public SodDataEntryTrama(String pRecord) {
		super(pRecord);

	}

	public void fillData() throws ServiceException {
		stringRecord = (TX_DATA_ENTRY) ServiceLocator.getVO(TX_DATA_ENTRY.class);
		Class clase_ = stringRecord.getClass();
		Object retObj_ = null;
		Field[] fields_ = clase_.getDeclaredFields();

		for (int i = 0; i < fields_.length; i++) {
			Field fd_ = fields_[i];
			String fdName_ = fd_.getName();
			
			if (fdName_.startsWith("_") && !fdName_.equals("_ID_RECHAZO")) {
				try {
					String retorno_ = (String) invocarMetodo(this, "get" + fdName_.substring(1),new Class[] {}, null);
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
		} catch (InvocationTargetException e) {
			LogWriter.getLog().log(LogWriter.FINEST, "[invocarMetodo(...)", e);
			throw new ServiceException("Exception", e);
		}
	}
	
	public static void main(String arg[]){
		SodDataEntryTrama  dataE_ = new SodDataEntryTrama("");
		try {
			dataE_.fillData();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	/**
	 * @return
	 */
	public TX_DATA_ENTRY getStringRecord() {
		return stringRecord;
	}
	
	public String getDATA1(){
		if (getUserData(1)!=null && getUserData(1).length()>40)				
			return getUserData(1).substring(0,40);
		else		
			return getUserData(1);
	}

	public String getDATA2(){
		/*if (getUserData(1)!=null && getUserData(1).equals(SOD_DATA_ENTRY_1)&& getUserData(2).length()>=19)
			return getUserData(2).substring(3,19);
		if (getUserData(1)!=null && getUserData(1).equals(SOD_DATA_ENTRY_2)&& getUserData(2).length()>=19)
			return getUserData(2).substring(3,19);*/
		if (getUserData(2)!=null && getUserData(2).length()>40)				
			return getUserData(2).substring(0,40);
		else
			return getUserData(2);
	}

	public String getDATA3(){
		if (getUserData(3)!=null && getUserData(3).length()>40)				
			return getUserData(3).substring(0,40);
		else	
			return getUserData(3);
	}

	public String getDATA4(){
		if (getUserData(4)!=null && getUserData(4).length()>40)				
			return getUserData(4).substring(0,40);
		else		
			return getUserData(4);
	}

	public String getDATA5(){
		if (getUserData(5)!=null && getUserData(5).length()>40)				
			return getUserData(5).substring(0,40);
		else		
			return getUserData(5);
	}

	public String getDATA6(){
		if (getUserData(6)!=null && getUserData(6).length()>40)				
			return getUserData(6).substring(0,40);
		else		
			return getUserData(6);
	}	

}
