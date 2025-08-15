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

import com.asic.ac.utils.StringFormatter;
import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceLocator;
import com.asic.transacciones.vo.TX_ITEMENTRY;
import com.asic.trxonline.sma.strings.ItemEntryString;

/**
 * @author Javier
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class SodItemEntryTrama extends ItemEntryString {

	private TX_ITEMENTRY stringRecord;
	private String IvaValue;

	public SodItemEntryTrama(String pRecord) {
		super(pRecord);
	}
	
	public void fillData() throws ServiceException {
		stringRecord = (TX_ITEMENTRY) ServiceLocator.getVO(TX_ITEMENTRY.class);
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
		} catch (InvocationTargetException e) {
			LogWriter.getLog().log(LogWriter.FINEST, "[invocarMetodo(...)", e);
			throw new ServiceException("Exception", e);
		}
	}

	public String getINDICAT1(int pBitIndex){
		int PosInString_=5;
		//System.out.println("Indicat1 en decimal->"+getInfo(PosInString_));
		Long itmp_=null;
		String tmp_=null;
		int newIndex_;
		if(getIndicat1()==null){		
			if(getInfo(PosInString_)==null)
				return "0";
			try{	
				itmp_=new Long(getInfo(PosInString_));
			}catch (Exception e){
				return null;			
			}
			tmp_=Long.toBinaryString(itmp_.longValue());
			setIndicat1(StringFormatter.align(tmp_,16,'0',0,16));
		}
		if(getIndicat1()!=null){
			if (pBitIndex<=8){
				if(getIndicat1().length()>=8){
					newIndex_ = 9-pBitIndex;
					//System.out.println(getIndicat1());
					//System.out.println(getIndicat1().substring((newIndex_-1),newIndex_));
					return getIndicat1().substring((newIndex_-1),newIndex_);
				}					 		
			}else if (getIndicat1().length()>=16){
				newIndex_ = 25-pBitIndex;
				//System.out.println(getIndicat1().substring((newIndex_-1),newIndex_));
				return getIndicat1().substring((newIndex_-1),newIndex_);				
			}

		}		
		return "0";
	}

	/**
	 * @return
	 */
	public TX_ITEMENTRY getStringRecord() {
		return stringRecord;
	}

	/**
	 * @return
	 */
	public String getPRCIVA() {
		return IvaValue;
	}

	/**
	 * @param string
	 */
	public void setPRCIVA(String string) {
		IvaValue = string;
	}
	
	public java.lang.String getSALEPRICE(){
		if (getItemEntryExt()!=null){
			if (getItemEntryExt().getSALEPRICE().length()>10)
				return getItemEntryExt().getSALEPRICE().substring(0,10);
			return getItemEntryExt().getSALEPRICE();
			
		}
			
		return "00";
	}	

}
