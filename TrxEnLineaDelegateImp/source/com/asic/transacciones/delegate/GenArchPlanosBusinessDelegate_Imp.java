/*
 * Created on Feb 27, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.delegate;

import java.sql.Date;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.facade.GenArchPlanosFacadeAdapter;

/**
 * @author Kcadena
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class GenArchPlanosBusinessDelegate_Imp implements GenArchPlanosBusinessDelegate{
	
	GenArchPlanosFacadeAdapter facade_ = new GenArchPlanosFacadeAdapter();
	
	public String getHeader(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getHeader(pDay, pStore, pTipo);
	}
	
	public String getDataEntry(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getDataEntry(pDay, pStore, pTipo);
	}
	
	public String getDiscount(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getDiscount(pDay, pStore, pTipo);
	}
	
	public String getExceptionLog(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getExceptionLog(pDay, pStore, pTipo);
	}
	
	public String getItemEntry(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getItemEntry(pDay, pStore, pTipo);
	}
	
	public String getItemRecordChange(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getItemRecordChange(pDay, pStore, pTipo);
	}
	
	public String getManagerOverride(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getManagerOverride(pDay, pStore, pTipo);
	}
	
	public String getOperatorTraining(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getOperatorTraining(pDay, pStore, pTipo);
	}
	
	public String getPriceChange(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getPriceChange(pDay, pStore, pTipo);
	}
	
	public String getTillChange(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getTillChange(pDay, pStore, pTipo);
	}
	
	public String getStoreClosing(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getStoreClosing(pDay, pStore, pTipo);
	}
	
	public String getTax(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getTax(pDay, pStore, pTipo);
	}
	
	public String getTender(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getTender(pDay, pStore, pTipo);
	}
	
	public String getTradingStamps(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getTradingStamps(pDay, pStore, pTipo);
	}
	
	public String getUserData(String pDay, String pStore, String pTipo) throws ServiceException {
		return facade_.getUserData(pDay, pStore, pTipo);
	}
}
