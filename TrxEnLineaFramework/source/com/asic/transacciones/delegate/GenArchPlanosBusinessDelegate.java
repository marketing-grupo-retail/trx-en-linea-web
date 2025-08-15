/*
 * Created on Feb 27, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.delegate;

import java.sql.Date;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceProvider;

/**
 * @author Kcadena
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

public interface GenArchPlanosBusinessDelegate extends ServiceProvider {
	
	public String getHeader(String pDay, String pStore, String pTipo) throws ServiceException;
	
	public String getDataEntry(String pDay, String pStore, String pTipo) throws ServiceException;
	
	public String getDiscount(String pDay, String pStore, String pTipo) throws ServiceException;
	
	public String getExceptionLog(String pDay, String pStore, String pTipo) throws ServiceException;
	
	public String getItemEntry(String pDay, String pStore, String pTipo) throws ServiceException;
	
	public String getItemRecordChange(String pDay, String pStore, String pTipo) throws ServiceException;
	
	public String getManagerOverride(String pDay, String pStore, String pTipo) throws ServiceException;
	
	public String getOperatorTraining(String pDay, String pStore, String pTipo) throws ServiceException;
	
	public String getPriceChange(String pDay, String pStore, String pTipo) throws ServiceException;
	
	public String getTillChange(String pDay, String pStore, String pTipo) throws ServiceException;
	
	public String getStoreClosing(String pDay, String pStore, String pTipo) throws ServiceException;
	
	public String getTax(String pDay, String pStore, String pTipo) throws ServiceException;
	
	public String getTender(String pDay, String pStore, String pTipo) throws ServiceException;
	
	public String getTradingStamps(String pDay, String pStore, String pTipo) throws ServiceException;
	
	public String getUserData(String pDay, String pStore, String pTipo) throws ServiceException;
}
