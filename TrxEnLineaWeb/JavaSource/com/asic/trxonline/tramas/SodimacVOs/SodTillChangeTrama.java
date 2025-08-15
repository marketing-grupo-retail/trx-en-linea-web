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
import java.util.StringTokenizer;
import java.util.Vector;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceLocator;
import com.asic.transacciones.vo.TX_TILL_CHANGE;
import com.asic.trxonline.sma.strings.TillChangeString;
import com.general.utils.StringFormatter;
import com.general.utils.pos.InfoParser;

/**
 * @author Javier
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class SodTillChangeTrama extends TillChangeString {

	private TX_TILL_CHANGE stringRecord;
	private final static int STRING_TOTAL_FIELDS_NUMBER = 38;

	public SodTillChangeTrama(String pRecord) {
		super(pRecord);
		String str_ = StringFormatter.replace(pRecord,FIELD_SEPARATOR + FIELD_SEPARATOR,FIELD_SEPARATOR + NULL_STRING + FIELD_SEPARATOR) + (pRecord.endsWith(FIELD_SEPARATOR) ? NULL_STRING : "");
		StringTokenizer strToken_ = new StringTokenizer(str_, FIELD_SEPARATOR);
		/*for(int i = 0; strToken_.hasMoreTokens(); i++)
		{
			String value_ = strToken_.nextToken();
			//setData(value_, i);
			System.out.println(value_);
		}*/
				
		//StringTokenizer strToken_ = new StringTokenizer(pRecord, FIELD_SEPARATOR);
		int fieldsNum_ = strToken_.countTokens();
		/*while (strToken_.hasMoreTokens()){
			String str_ = strToken_.nextToken();
			System.out.println(str_);
		}*/	
		Vector data_ = getData();
		for(int j = fieldsNum_; j<STRING_TOTAL_FIELDS_NUMBER/*PARSE_ARRAY.length*/; j++)
		{
			//setData(null, i);
			data_.setElementAt(null, j);
		}	
		//
		//for (int i=pParseArray.length		
		//
	}
	
	public void fillData() throws ServiceException {
		stringRecord = (TX_TILL_CHANGE) ServiceLocator.getVO(TX_TILL_CHANGE.class);
		Class clase_ = stringRecord.getClass();
		Object retObj_ = null;
		Field[] fields_ = clase_.getDeclaredFields();

		for (int i = 0; i < fields_.length; i++) { // CACS: Vamos a hacer un for inicial para que fije el delimitador ya que no todas las veces trae los nombres de los campos en el orden que los necesitamos.
			Field fd_ = fields_[i];
			String fdName_ = fd_.getName();
			//System.out.println("fnName_->"+fdName_);	
			if (fdName_.startsWith("_") && !fdName_.equals("_ID_RECHAZO")) {
				try {
					String retorno_ = (String) invocarMetodo(this, "get" + fdName_.substring(1), new Class[] {
					}, null);
					//System.out.println("Valor retornado->"+retorno_);
					//invocarMetodo(stringRecord, "set" + fdName_.substring(1), new Class[] { String.class }, new Object[] { retorno_ });
				} catch (ServiceException e) {
					//LogWriter.getLog().log(LogWriter.FINEST, "[fillData(...), Metodo set/get no hallado para el atributo :" + fdName_, e);
					//throw new ServiceException("Exception", e);
				}
			}
		}

		for (int i = 0; i < fields_.length; i++) {
			Field fd_ = fields_[i];
			String fdName_ = fd_.getName();
			//System.out.println("fnName_->"+fdName_);	
			if (fdName_.startsWith("_") && !fdName_.equals("_ID_RECHAZO")) {
				try {
					String retorno_ = (String) invocarMetodo(this, "get" + fdName_.substring(1), new Class[] {
					}, null);
					//System.out.println("Valor retornado->"+retorno_);
					invocarMetodo(stringRecord, "set" + fdName_.substring(1), new Class[] { String.class }, new Object[] { retorno_ });
				} catch (ServiceException e) {
					LogWriter.getLog().log(LogWriter.FINEST, "[fillData(...), Metodo set/get no hallado para el atributo :" + fdName_, e);
					throw new ServiceException("Exception", e);
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

	/**
	 * @return
	 */
	public TX_TILL_CHANGE getStringRecord() {
		return stringRecord;
	}
	
	/*public String getTENDTYP21(){
		
		if (getDelimiter()){
			if (isLimit(getInfo(22-(21-getPosition())))||getLimitFound())
				return null;
			String answer_ = null;
			if (getInfo(22-(21-getPosition()))!=null && !getInfo(22-(21-getPosition())).trim().equals(""))
				answer_ = getInfo(22-(21-getPosition()));			
			return answer_;			
		}

		if (isLimit(getInfo(22))||getLimitFound())
			return null;
		String answer_ = null;		
		if (getInfo(22)!=null && !getInfo(22).trim().equals(""))			
			answer_ = getInfo(22).trim();	
		return InfoParser.staticUnPack(answer_);
	}
	
	boolean isLimit(String pType){
		if (pType==null && pType.trim().equals("")){
			setLimitFound(true);
			return true;			
		}
		return false;
	}*/		

	/*public String getTENDTYP12(){
		if (getDelimiter() || isDelimiter(getInfo(7),7))
			return null;
		if (getInfo(7).equals(""))
			return "0";		
		return KeyedFileUtils.unPack2(getInfo(7));
	}

	public String getAMTTEND12(){
		if (getDelimiter())
			return null;
		if (getInfo(8).equals(""))
			return "0";	
		return KeyedFileUtils.unPack2(getInfo(8));
	}

	boolean isDelimiter(String pType, int pPosition){
		if (pType.equals("99")||pType.equals("98")||pType.equals("97")||pType.equals("96")||pType.equals("95")){
			setDelimiter(true);
			setPosition(pPosition);
			return true;			
		}
		return false;
	}*/

}
