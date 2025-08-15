/*
 * Created on Feb 27, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.facade;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.bean.GenArchPlanosBean;
import com.asic.transacciones.delegate.GenArchPlanosBusinessDelegate;
import com.asic.transacciones.vo.TX_DATA_ENTRY_Imp;
import com.asic.transacciones.vo.TX_DISCOUNT_Imp;
import com.asic.transacciones.vo.TX_EXCEPTION_LOG_Imp;
import com.asic.transacciones.vo.TX_HEADER_Imp;
import com.asic.transacciones.vo.TX_ITEMENTRY_Imp;
import com.asic.transacciones.vo.TX_ITEM_RECORD_CHANGE_Imp;
import com.asic.transacciones.vo.TX_MANAGER_OVERRIDE_Imp;
import com.asic.transacciones.vo.TX_OPERATOR_TRAINING_Imp;
import com.asic.transacciones.vo.TX_PRICE_CHANGE_Imp;
import com.asic.transacciones.vo.TX_STORE_CLOSING_Imp;
import com.asic.transacciones.vo.TX_TAX_Imp;
import com.asic.transacciones.vo.TX_TENDER_Imp;
import com.asic.transacciones.vo.TX_TILL_CHANGE_Imp;
import com.asic.transacciones.vo.TX_TRADING_STAMPS_Imp;
import com.asic.transacciones.vo.TX_USER_DATA_Imp;

/**
 * @author Kcadena
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class GenArchPlanosFacadeAdapter implements GenArchPlanosBusinessDelegate{
	String nomArch_;
	String strToInsert_="";
	private SimpleDateFormat sdfFecha = new SimpleDateFormat("yyMMdd");
	
	public String getHeader(String pDay, String pStore, String pTipo)throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean(); 
		nomArch_ ="HD";
		List lst_ = bean_.getHeader(pDay, pStore, pTipo);
		//Iterator bean_ = bean_.getHeader().iterator();
		Iterator it_= lst_.iterator();
		TX_HEADER_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_HEADER_Imp)it_.next();
			//String fecha_ = sdfFecha.format(new Date (tmp_.getDAY().getTime()));
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getTRANSNUM().trim()+","+
			tmp_.getDAY()+","+tmp_.getTIME().trim()+","+tmp_.getTRANSTYPE().trim()+","+
			tmp_.getNUMSTRIN().trim()+","+tmp_.getOPERATOR().trim()+","+tmp_.getPASSWORD().trim()+","+
			tmp_.getGROSSPOS().trim()+","+tmp_.getGROSSNEG().trim()+","+tmp_.getRINGTIME().trim()+","+
			tmp_.getTENDERTI().trim()+","+tmp_.getSPECIAL().trim()+","+tmp_.getINACTIVE().trim()+","+
			tmp_.getINDICAT11()+","+tmp_.getINDICAT12()+","+tmp_.getINDICAT13()+","+tmp_.getINDICAT14()+","+
			tmp_.getINDICAT15()+","+tmp_.getINDICAT16()+","+tmp_.getINDICAT17()+","+tmp_.getINDICAT18()+","+
			tmp_.getINDICAT19()+","+tmp_.getINDICAT110()+","+tmp_.getINDICAT111()+","+tmp_.getINDICAT112()+","+
			tmp_.getINDICAT113()+","+tmp_.getINDICAT114()+","+tmp_.getINDICAT115()+","+tmp_.getINDICAT116()+","+
			tmp_.getINDICAT117()+","+tmp_.getINDICAT118()+","+tmp_.getINDICAT119()+","+tmp_.getINDICAT120()+","+
			tmp_.getINDICAT121()+","+tmp_.getINDICAT122()+","+tmp_.getINDICAT123()+","+tmp_.getINDICAT124()+","+
			tmp_.getINDICAT125()+","+tmp_.getINDICAT126()+","+tmp_.getINDICAT127()+","+tmp_.getINDICAT128()+","+
			tmp_.getINDICAT129()+","+tmp_.getINDICAT130()+","+tmp_.getINDICAT131()+","+tmp_.getINDICAT132()+'\n';
		}	
		return strToInsert_; 
	}
	
	public String getItemEntry(String pDay, String pStore, String pTipo) throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean();
		nomArch_ ="IT";
		List lst_ = bean_.getItemEntry(pDay, pStore, pTipo);
		Iterator it_= lst_.iterator();
		TX_ITEMENTRY_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_ITEMENTRY_Imp)it_.next();
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getTRANSNUM().trim()+","+
			tmp_.getDAY()+","+tmp_.getTIME().trim()+","+tmp_.getITEMCODE().trim()+","+
			tmp_.getXPRICE().trim()+","+tmp_.getDEPARTME().trim()+","+tmp_.getFAMILYNU1().trim()+","+
			tmp_.getFAMILYNU2().trim()+","+tmp_.getINDICAT11()+","+tmp_.getINDICAT12()+","+tmp_.getINDICAT13()+","+
			tmp_.getINDICAT14()+","+tmp_.getINDICAT15()+","+tmp_.getINDICAT16()+","+tmp_.getINDICAT17()+","+
			tmp_.getINDICAT18()+","+tmp_.getINDICAT19()+","+tmp_.getINDICAT110()+","+tmp_.getINDICAT111()+","+
			tmp_.getINDICAT112()+","+tmp_.getINDICAT113()+","+tmp_.getINDICAT114()+","+tmp_.getINDICAT115()+","+
			tmp_.getINDICAT116()+","+tmp_.getINDICAT21()+","+tmp_.getINDICAT22()+","+tmp_.getINDICAT23()+","+
			tmp_.getINDICAT24()+","+tmp_.getINDICAT25()+","+tmp_.getINDICAT26()+","+tmp_.getINDICAT27()+","+
			tmp_.getINDICAT28()+","+tmp_.getINDICAT29()+","+tmp_.getINDICAT210()+","+tmp_.getINDICAT211()+","+
			tmp_.getINDICAT212()+","+tmp_.getINDICAT213()+","+tmp_.getINDICAT214()+","+tmp_.getINDICAT215()+","+
			tmp_.getINDICAT216()+","+tmp_.getINDICAT31()+","+tmp_.getINDICAT32()+","+tmp_.getMPGROUP().trim()+","+
			tmp_.getDEALQUAN().trim()+","+tmp_.getPRICEMTH().trim()+","+tmp_.getSALEQUAN().trim()+","+
			tmp_.getSALEPRICE().trim()+","+tmp_.getQTYORWGT().trim()+","+tmp_.getINDICAT41()+","+
			tmp_.getINDICAT42()+","+tmp_.getINDICAT43()+","+tmp_.getINDICAT44()+","+tmp_.getINDICAT45()+","+
			tmp_.getINDICAT46()+","+tmp_.getINDICAT47()+","+tmp_.getINDICAT48()+","+tmp_.getPRCIVA().trim()+'\n';	
		}
		return strToInsert_;
	}
	
	public String getDataEntry(String pDay, String pStore, String pTipo) throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean();
		nomArch_ ="DE";
		List lst_ = bean_.getDataEntry(pDay, pStore, pTipo);
		Iterator it_= lst_.iterator();
		TX_DATA_ENTRY_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_DATA_ENTRY_Imp)it_.next();
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getTRANSNUM().trim()+","+
			tmp_.getDAY()+","+tmp_.getTIME().trim()+","+tmp_.getDATA1().trim()+","+tmp_.getDATA2().trim()+","+
			tmp_.getDATA3().trim()+","+tmp_.getDATA4().trim()+","+tmp_.getDATA5().trim()+","+tmp_.getDATA6().trim()+'\n';
		}
		return strToInsert_;
	}
	
	public String getDiscount(String pDay, String pStore, String pTipo) throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean();
		nomArch_ ="DS";
		List lst_ = bean_.getDiscount(pDay, pStore, pTipo);
		Iterator it_= lst_.iterator();
		TX_DISCOUNT_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_DISCOUNT_Imp)it_.next();
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getTRANSNUM().trim()+","+
			tmp_.getDAY()+","+tmp_.getTIME().trim()+","+
			tmp_.getTYPE().trim()+","+tmp_.getDISGROUP().trim()+","+tmp_.getDISRATE().trim()+","+
			tmp_.getAMTDISCO().trim()+","+tmp_.getTAXEXEMP().trim()+'\n';
		}
		return strToInsert_;
	}
	
	public String getExceptionLog(String pDay, String pStore, String pTipo) throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean();
		nomArch_ ="EL";
		List lst_ = bean_.getExceptionLog(pDay, pStore, pTipo);
		Iterator it_= lst_.iterator();
		TX_EXCEPTION_LOG_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_EXCEPTION_LOG_Imp)it_.next();
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getTRANSNUM().trim()+","+
			tmp_.getDAY()+","+tmp_.getTIME().trim()+","+
			tmp_.getLOGDATA().trim()+'\n';
		}
		return strToInsert_;
	}
	
	public String getItemRecordChange(String pDay, String pStore, String pTipo) throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean();
		nomArch_ ="IR";
		List lst_ = bean_.getItemRecordChange(pDay, pStore, pTipo);
		Iterator it_= lst_.iterator();
		TX_ITEM_RECORD_CHANGE_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_ITEM_RECORD_CHANGE_Imp)it_.next();
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getTRANSNUM().trim()+","+
			tmp_.getDAY()+","+tmp_.getTIME().trim()+","+tmp_.getOLDDATA().trim()+","+
			tmp_.getNEWDATA().trim()+'\n';
		}
		return strToInsert_;
	}
	
	public String getManagerOverride(String pDay, String pStore, String pTipo) throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean();
		nomArch_ ="MG";
		List lst_ = bean_.getManagerOverride(pDay, pStore, pTipo);
		Iterator it_= lst_.iterator();
		TX_MANAGER_OVERRIDE_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_MANAGER_OVERRIDE_Imp)it_.next();
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getTRANSNUM().trim()+","+
			tmp_.getDAY()+","+tmp_.getTIME().trim()+","+
			tmp_.getOVERRIDE().trim()+","+tmp_.getREASON()+'\n';
		}
		return strToInsert_;
	}
	
	public String getOperatorTraining(String pDay, String pStore, String pTipo) throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean();
		nomArch_ ="OT";
		List lst_ = bean_.getOperatorTraining(pDay, pStore, pTipo);
		Iterator it_= lst_.iterator();
		TX_OPERATOR_TRAINING_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_OPERATOR_TRAINING_Imp)it_.next();
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getTRANSNUM().trim()+","+
			tmp_.getDAY()+","+tmp_.getTIME().trim()+","+tmp_.getDATA1()+'\n';
			
		}
		return strToInsert_;
	}
	
	public String getPriceChange(String pDay, String pStore, String pTipo) throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean();
		nomArch_ ="PC";
		List lst_ = bean_.getPriceChange(pDay, pStore, pTipo);
		Iterator it_= lst_.iterator();
		TX_PRICE_CHANGE_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_PRICE_CHANGE_Imp)it_.next();
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getTRANSNUM().trim()+","+
			tmp_.getDAY()+","+tmp_.getTIME().trim()+","+
			tmp_.getITEMCODE().trim()+","+tmp_.getNEWDEALQ().trim()+","+tmp_.getNEWPRICE().trim()+","+
			tmp_.getOLDDEALQ().trim()+","+tmp_.getOLDPRICE().trim()+'\n';
		}
		return strToInsert_;
	}
	
	public String getStoreClosing(String pDay, String pStore, String pTipo) throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean();
		nomArch_ ="SC";
		List lst_ = bean_.getStoreClosing(pDay, pStore, pTipo);
		Iterator it_= lst_.iterator();
		TX_STORE_CLOSING_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_STORE_CLOSING_Imp)it_.next();
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getTRANSNUM().trim()+","+
			tmp_.getDAY()+","+tmp_.getTIME().trim()+","+
			tmp_.getINDICAT2().trim()+","+tmp_.getFECHAHORA().trim()+'\n';
		}
		return strToInsert_;
	}
	
	public String getTax(String pDay, String pStore, String pTipo) throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean();
		nomArch_ ="TX";
		List lst_ = bean_.getTax(pDay, pStore, pTipo);
		Iterator it_= lst_.iterator();
		TX_TAX_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_TAX_Imp)it_.next();
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getTRANSNUM().trim()+","+
			tmp_.getDAY()+","+tmp_.getTIME().trim()+","+
			tmp_.getAMTTAXA().trim()+","+tmp_.getAMTTAXB().trim()+","+tmp_.getAMTTAXC().trim()+","+
			tmp_.getAMTTAXD().trim()+","+tmp_.getAMTTAXLEA().trim()+","+tmp_.getAMTTAXLEB().trim()+","+
			tmp_.getAMTTAXLEC().trim()+","+tmp_.getAMTTAXLED().trim()+'\n';
		}
		return strToInsert_;
	}
	
	public String getTender(String pDay, String pStore, String pTipo) throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean();
		nomArch_ ="TN";
		List lst_ = bean_.getTender(pDay, pStore, pTipo);
		Iterator it_= lst_.iterator();
		TX_TENDER_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_TENDER_Imp)it_.next();
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getTRANSNUM().trim()+","+
			tmp_.getDAY()+","+tmp_.getTIME().trim()+","+
			tmp_.getTYPE().trim()+","+tmp_.getTENDTYPE().trim()+","+tmp_.getAMTTENDE().trim()+","+
			tmp_.getAMTTNFEE().trim()+","+tmp_.getCUSTOMER().trim()+","+tmp_.getSTATUS().trim()+'\n';
		}
		return strToInsert_;
	}
	
	public String getTillChange(String pDay, String pStore, String pTipo) throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean();
		nomArch_ ="TC";
		List lst_ = bean_.getTillChange(pDay, pStore, pTipo);
		Iterator it_= lst_.iterator();
		TX_TILL_CHANGE_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_TILL_CHANGE_Imp)it_.next();
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getDAY()+","+
			tmp_.getTIME().trim()+","+tmp_.getTRANSNUM().trim()+","+tmp_.getNUMBERLOANS().trim()+","+
			tmp_.getAMTLOANS().trim()+","+tmp_.getNUMBERPKUPS().trim()+","+tmp_.getTENDTYP11().trim()+","+
			tmp_.getAMTTEND11().trim()+","+tmp_.getTENDTYP12().trim()+","+tmp_.getAMTTEND12().trim()+","+
			tmp_.getTENDTYP13().trim()+","+tmp_.getAMTTEND13().trim()+","+tmp_.getTENDTYP14().trim()+","+
			tmp_.getAMTTEND14().trim()+","+tmp_.getTENDTYP15().trim()+","+tmp_.getAMTTEND15().trim()+","+
			tmp_.getTENDTYP16().trim()+","+tmp_.getAMTTEND16().trim()+","+tmp_.getTENDTYP17().trim()+","+
			tmp_.getAMTTEND17().trim()+","+tmp_.getTENDTYP18().trim()+","+tmp_.getAMTTEND18().trim()+","+
			tmp_.getTENDTYP21().trim()+","+tmp_.getAMTTEND21().trim()+","+tmp_.getTENDTYP22().trim()+","+
			tmp_.getAMTTEND22().trim()+","+tmp_.getTENDTYP23().trim()+","+tmp_.getAMTTEND23().trim()+","+
			tmp_.getTENDTYP24().trim()+","+tmp_.getAMTTEND24().trim()+","+tmp_.getTENDTYP25().trim()+","+
			tmp_.getAMTTEND25().trim()+","+tmp_.getTENDTYP26().trim()+","+tmp_.getTENDTYP26().trim()+","+
			tmp_.getTENDTYP27().trim()+","+tmp_.getAMTTEND27().trim()+","+tmp_.getTENDTYP28().trim()+","+
			tmp_.getAMTTEND28().trim()+'\n';
		}
		return strToInsert_;
	}
	
	public String getTradingStamps(String pDay, String pStore, String pTipo) throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean();
		nomArch_ ="TS";
		List lst_ = bean_.getTradingStamps(pDay, pStore, pTipo);
		Iterator it_= lst_.iterator();
		TX_TRADING_STAMPS_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_TRADING_STAMPS_Imp)it_.next();
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getTRANSNUM().trim()+","+
			tmp_.getDAY()+","+tmp_.getTIME().trim()+","+tmp_.getSTAMPS().trim()+'\n';
		}
		return strToInsert_;
	}
	
	public String getUserData(String pDay, String pStore, String pTipo) throws ServiceException{
		GenArchPlanosBean bean_ = new GenArchPlanosBean();
		nomArch_ ="UD";
		List lst_ = bean_.getUserData(pDay, pStore, pTipo);
		Iterator it_= lst_.iterator();
		TX_USER_DATA_Imp tmp_;
		while (it_.hasNext()){
			tmp_=(TX_USER_DATA_Imp)it_.next();
			strToInsert_= strToInsert_+tmp_.getOFFSETY().trim()+","+tmp_.getOFFSETX().trim()+","+
			tmp_.getSTORE().trim()+","+tmp_.getTERMINAL().trim()+","+tmp_.getTRANSNUM().trim()+","+
			tmp_.getDAY()+","+tmp_.getTIME().trim()+","+tmp_.getTYPE().trim()+","+
			tmp_.getDATA1()+","+tmp_.getDATA2()+","+tmp_.getDATA3()+","+tmp_.getDATA4()+","+tmp_.getDATA5()+","+
			tmp_.getDATA6()+","+tmp_.getDATA7()+","+tmp_.getDATA8()+","+tmp_.getDATA9()+","+tmp_.getDATA10()+","+
			tmp_.getDATA11()+","+tmp_.getDATA12()+","+tmp_.getDATA13()+","+tmp_.getDATA14()+","+tmp_.getDATA15()+","+
			tmp_.getDATA16()+","+tmp_.getDATA17()+","+tmp_.getDATA18()+","+tmp_.getDATA19()+","+tmp_.getDATA20()+'\n';
		}
		return strToInsert_;
	}
	
	public String getName(){
		return nomArch_;
	}
}