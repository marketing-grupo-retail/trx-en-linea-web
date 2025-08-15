/*
 * Created on Feb 27, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.bean;

import java.sql.Date;
import java.util.List;

import org.ramm.jwaf.dbutil.DBUtil;
import org.ramm.jwaf.logger.LogWriter;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.resources.ApplicationConfigFacadeAdapter;
import com.asic.framework.resources.ApplicationResources;
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
public class GenArchPlanosBean {
	private ApplicationConfigFacadeAdapter adapter_;
	
	public List getHeader(String pDay, String pStore, String pTipo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(HD.OFFSETY),' ') OFFSETY, NVL(TO_CHAR(HD.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(HD.STORE),' ') STORE,"+
						 "NVL(TO_CHAR(HD.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(HD.TRANSNUM),' ') TRANSNUM, NVL(TO_CHAR(HD.DAY,'YYMMDD'),' ') DAY, "+ //NVL(TO_DATE(HD.DAY),'') DAY, "+
						 "NVL(TO_CHAR(HD.TIME),' ')  TIME, NVL(TO_CHAR(HD.TRANSTYPE),' ') TRANSTYPE, NVL(TO_CHAR(HD.NUMSTRIN),' ')  NUMSTRIN,"+
						 "NVL(TO_CHAR(HD.OPERATOR),' ') OPERATOR, NVL(TO_CHAR(HD.PASSWORD),' ') PASSWORD, NVL(TO_CHAR(HD.GROSSPOS),' ') GROSSPOS,"+
						 "NVL(TO_CHAR(HD.GROSSNEG),' ') GROSSNEG, NVL(TO_CHAR(HD.RINGTIME),' ') RINGTIME,  NVL(TO_CHAR(HD.TENDERTI),' ') TENDERTI,"+
						 "NVL(TO_CHAR(HD.SPECIAL),' ') SPECIAL, NVL(TO_CHAR(HD.INACTIVE),' ') INACTIVE, NVL(TO_CHAR(HD.INDICAT11),' ') INDICAT11,"+
						 "NVL(TO_CHAR(HD.INDICAT12),' ') INDICAT12, NVL(TO_CHAR(HD.INDICAT13),' ') INDICAT13, NVL(TO_CHAR(HD.INDICAT14),' ') INDICAT14,"+
						 "NVL(TO_CHAR(HD.INDICAT15),' ') INDICAT15, NVL(TO_CHAR(HD.INDICAT16),' ') INDICAT16, NVL(TO_CHAR(HD.INDICAT17),' ') INDICAT17,"+
						 "NVL(TO_CHAR(HD.INDICAT18),' ') INDICAT18, NVL(TO_CHAR(HD.INDICAT19),' ') INDICAT19, NVL(TO_CHAR(HD.INDICAT110),' ') INDICAT110,"+
						 "NVL(TO_CHAR(HD.INDICAT111),' ') INDICAT111, NVL(TO_CHAR(HD.INDICAT112),' ') INDICAT112, NVL(TO_CHAR(HD.INDICAT113),' ') INDICAT113,"+
						 "NVL(TO_CHAR(HD.INDICAT114),' ') INDICAT114, NVL(TO_CHAR(HD.INDICAT115),' ') INDICAT115, NVL(TO_CHAR(HD.INDICAT116),' ') INDICAT116,"+
						 "NVL(TO_CHAR(HD.INDICAT117),' ') INDICAT117, NVL(TO_CHAR(HD.INDICAT118),' ') INDICAT118, NVL(TO_CHAR(HD.INDICAT119),' ') INDICAT119,"+
						 "NVL(TO_CHAR(HD.INDICAT120),' ') INDICAT120, NVL(TO_CHAR(HD.INDICAT121),' ') INDICAT121, NVL(TO_CHAR(HD.INDICAT122),' ') INDICAT122,"+
						 "NVL(TO_CHAR(HD.INDICAT123),' ') INDICAT123, NVL(TO_CHAR(HD.INDICAT124),' ') INDICAT124, NVL(TO_CHAR(HD.INDICAT125),' ') INDICAT125,"+
						 "NVL(TO_CHAR(HD.INDICAT126),' ') INDICAT126, NVL(TO_CHAR(HD.INDICAT127),' ') INDICAT127, NVL(TO_CHAR(HD.INDICAT128),' ') INDICAT128,"+
						 "NVL(TO_CHAR(HD.INDICAT129),' ') INDICAT129, NVL(TO_CHAR(HD.INDICAT130),' ') INDICAT130, NVL(TO_CHAR(HD.INDICAT131),' ') INDICAT131,"+
						 "NVL(TO_CHAR(HD.INDICAT132),' ') INDICAT132";
			 
		try { List lHd_= DBUtil.select(campos_, 
									 	adapter_.getAsicGOwner() + "TPOS_HEADER HD", 
									 	" TRUNC(HD.DAY)= TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
									 	" AND HD.STORE = '"+ pStore +"'"+
									 	" AND HD.TIPO = '"+ pTipo +"'", 
									 	TX_HEADER_Imp.class, ApplicationResources.ASICG_DB);
			return lHd_;
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, " ERROR DE CONEXION CON DB " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
	
	public List getItemEntry(String pDay, String pStore, String pTipo) throws ServiceException { /*OJO CON LOS PARAMETROS QUE RECIBE...*/
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(IT.OFFSETY),' ') OFFSETY, NVL(TO_CHAR(IT.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(IT.STORE),' ') STORE, "+
						 "NVL(TO_CHAR(IT.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(IT.TRANSNUM),' ') TRANSNUM, NVL(TO_CHAR(IT.DAY,'YYMMDD'),' ') DAY, "+
						 "NVL(TO_CHAR(IT.TIME),' ') TIME, NVL(TO_CHAR(IT.ITEMCODE),' ') ITEMCODE, NVL(TO_CHAR(IT.XPRICE),' ') XPRICE, "+
						 "NVL(TO_CHAR(IT.DEPARTME),' ') DEPARTME, NVL(TO_CHAR(IT.FAMILYNU1),' ') FAMILYNU1, NVL(TO_CHAR(IT.FAMILYNU2),' ') FAMILYNU2, "+
						 "NVL(TO_CHAR(IT.INDICAT11),' ') INDICAT11, NVL(TO_CHAR(IT.INDICAT12),' ') INDICAT12, NVL(TO_CHAR(IT.INDICAT13),' ') INDICAT13, "+
						 "NVL(TO_CHAR(IT.INDICAT14),' ') INDICAT14, NVL(TO_CHAR(IT.INDICAT15),' ') INDICAT15, NVL(TO_CHAR(IT.INDICAT16),' ') INDICAT16, "+
						 "NVL(TO_CHAR(IT.INDICAT17),' ') INDICAT17, NVL(TO_CHAR(IT.INDICAT18),' ') INDICAT18, NVL(TO_CHAR(IT.INDICAT19),' ') INDICAT19, "+
						 "NVL(TO_CHAR(IT.INDICAT110),' ') INDICAT110, NVL(TO_CHAR(IT.INDICAT111),' ') INDICAT111, NVL(TO_CHAR(IT.INDICAT112),' ') INDICAT112, "+
						 "NVL(TO_CHAR(IT.INDICAT113),' ') INDICAT113, NVL(TO_CHAR(IT.INDICAT114),' ') INDICAT114, NVL(TO_CHAR(IT.INDICAT115),' ') INDICAT115, "+
						 "NVL(TO_CHAR(IT.INDICAT116),' ') INDICAT116, NVL(TO_CHAR(IT.INDICAT21), '') INDICAT21, NVL(TO_CHAR(IT.INDICAT22),' ') INDICAT22, "+
						 "NVL(TO_CHAR(IT.INDICAT23),' ') INDICAT23, NVL(TO_CHAR(IT.INDICAT24),' ') INDICAT24, NVL(TO_CHAR(IT.INDICAT25),' ') INDICAT25, "+
						 "NVL(TO_CHAR(IT.INDICAT26),' ') INDICAT26, NVL(TO_CHAR(IT.INDICAT27),' ') INDICAT27, NVL(TO_CHAR(IT.INDICAT28),' ') INDICAT28, "+
						 "NVL(TO_CHAR(IT.INDICAT29),' ') INDICAT29, NVL(TO_CHAR(IT.INDICAT210),' ') INDICAT210, NVL(TO_CHAR(IT.INDICAT211),' ') INDICAT211, "+
						 "NVL(TO_CHAR(IT.INDICAT212),' ') INDICAT212, NVL(TO_CHAR(IT.INDICAT213),' ') INDICAT213, NVL(TO_CHAR(IT.INDICAT214),' ') INDICAT214, "+
						 "NVL(TO_CHAR(IT.INDICAT215),' ') INDICAT215, NVL(TO_CHAR(IT.INDICAT216),' ') INDICAT216, NVL(TO_CHAR(IT.INDICAT31),' ') INDICAT31, "+
						 "NVL(TO_CHAR(IT.INDICAT32),' ') INDICAT32, NVL(TO_CHAR(IT.MPGROUP),' ') MPGROUP, NVL(TO_CHAR(IT.DEALQUAN),' ') DEALQUAN, "+
						 "NVL(TO_CHAR(IT.PRICEMTH),' ') PRICEMTH, NVL(TO_CHAR(IT.SALEQUAN),' ') SALEQUAN, NVL(TO_CHAR(IT.SALEPRICE),' ') SALEPRICE, "+
						 "NVL(TO_CHAR(IT.QTYORWGT),' ') QTYORWGT, NVL(TO_CHAR(IT.INDICAT41),' ') INDICAT41, NVL(TO_CHAR(IT.INDICAT42),' ') INDICAT42, "+
						 "NVL(TO_CHAR(IT.INDICAT43),' ') INDICAT43, NVL(TO_CHAR(IT.INDICAT44),' ') INDICAT44, NVL(TO_CHAR(IT.INDICAT45),' ') INDICAT45, "+
						 "NVL(TO_CHAR(IT.INDICAT46),' ') INDICAT46, NVL(TO_CHAR(IT.INDICAT47),' ') INDICAT47, NVL(TO_CHAR(IT.INDICAT48),' ') INDICAT48, "+
						 "NVL(TO_CHAR(IT.PRCIVA),' ') PRCIVA";
		try {
			List lItemE_= DBUtil.select(campos_, 
										adapter_.getAsicGOwner() + "TPOS_ITEMENTRY IT", 
										" TRUNC(IT.DAY) = TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
										" AND IT.STORE = '"+ pStore +"'"+
										" AND IT.TIPO = '"+ pTipo +"'",
										TX_ITEMENTRY_Imp.class, ApplicationResources.ASICG_DB);
			return lItemE_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
	
	public List getDiscount(String pDay, String pStore, String pTipo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(DS.OFFSETY),' ') OFFSETY, NVL(TO_CHAR(DS.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(DS.STORE),' ') STORE, "+
						 "NVL(TO_CHAR(DS.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(DS.TRANSNUM),' ') TRANSNUM, NVL(TO_CHAR(DS.DAY,'YYMMDD'),' ') DAY, "+
						 "NVL(TO_CHAR(DS.TIME),' ') TIME, NVL(TO_CHAR(DS.TYPE),' ') TYPE, NVL(TO_CHAR(DS.DISGROUP),' ') DISGROUP, "+
						 "NVL(TO_CHAR(DS.DISRATE),' ') DISRATE, NVL(TO_CHAR(DS.AMTDISCO),' ') AMTDISCO, NVL(TO_CHAR(DS.TAXEXEMP),' ') TAXEXEMP";
		try {
			List lDs_= DBUtil.select(campos_, 
									 adapter_.getAsicGOwner() + "TPOS_DISCOUNT DS", 
									 " TRUNC(DS.DAY) = TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
									 " AND DS.STORE = '"+ pStore +"'"+
									 " AND DS.TIPO = '"+ pTipo +"'",
									 TX_DISCOUNT_Imp.class, ApplicationResources.ASICG_DB);
			return lDs_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
	
	public List getTax(String pDay, String pStore, String pTipo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(TX.OFFSETY),' ') OFFSETY, NVL(TO_CHAR(TX.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(TX.STORE),' ') STORE,"+
						 "NVL(TO_CHAR(TX.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(TX.TRANSNUM),' ') TRANSNUM, NVL(TO_CHAR(TX.DAY,'YYMMDD'),' ') DAY,"+
						 "NVL(TO_CHAR(TX.TIME),' ') TIME, NVL(TO_CHAR(TX.TYPE),' ') TYPE, NVL(TO_CHAR(TX.AMTTAXA),' ') AMTTAXA,"+
						 "NVL(TO_CHAR(TX.AMTTAXB),' ') AMTTAXB, NVL(TO_CHAR(TX.AMTTAXC),' ') AMTTAXC, NVL(TO_CHAR(TX.AMTTAXD),' ') AMTTAXD,"+
						 "NVL(TO_CHAR(TX.AMTTAXLEA),' ') AMTTAXLEA, NVL(TO_CHAR(TX.AMTTAXLEB),' ') AMTTAXLEB, NVL(TO_CHAR(TX.AMTTAXLEC),' ') AMTTAXLEC,"+
						 "NVL(TO_CHAR(TX.AMTTAXLED),' ') AMTTAXLED";
		try {
			List lTx_= DBUtil.select(campos_, 
									 adapter_.getAsicGOwner() + "TPOS_TAX TX", 
									 " TRUNC(TX.DAY) = TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
									 " AND TX.STORE = '"+ pStore +"'"+
									 " AND TX.TIPO = '"+ pTipo +"'", 
									 TX_TAX_Imp.class, ApplicationResources.ASICG_DB);
			return lTx_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
	
	public List getDataEntry(String pDay, String pStore, String pTipo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(DE.OFFSETY),' ') OFFSETY, NVL(TO_CHAR(DE.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(DE.STORE),' ') STORE, "+
						 "NVL(TO_CHAR(DE.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(DE.TRANSNUM),' ') TRANSNUM,  NVL(TO_CHAR(DE.DAY,'YYMMDD'),' ') DAY, "+
						 "NVL(TO_CHAR(DE.TIME),' ') TIME, NVL(TO_CHAR(DE.DATA1),' ') DATA1,  NVL(TO_CHAR(DE.DATA2),' ') DATA2, "+
						 "NVL(TO_CHAR(DE.DATA3),' ') DATA3,  NVL(TO_CHAR(DE.DATA4),' ') DATA4, NVL(TO_CHAR(DE.DATA5),' ') DATA5, "+
						 "NVL(TO_CHAR(DE.DATA6),' ') DATA6 ";
		try {
			List lDataE_= DBUtil.select(campos_, 
										adapter_.getAsicGOwner() + "TPOS_DATA_ENTRY DE", 
										" TRUNC(DE.DAY) = TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
									 	" AND DE.STORE = '"+ pStore +"'"+
									 	" AND DE.TIPO = '"+ pTipo +"'", 
									 	TX_DATA_ENTRY_Imp.class, ApplicationResources.ASICG_DB);
			return lDataE_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
	
	public List getExceptionLog(String pDay, String pStore, String pTipo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(EL.OFFSETY),' ') OFFSETY, NVL(TO_CHAR(EL.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(EL.STORE),' ') STORE, "+
						 "NVL(TO_CHAR(EL.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(EL.TRANSNUM),' ') TRANSNUM, NVL(TO_CHAR(EL.DAY,'YYMMDD'),' ') DAY, "+
						 "NVL(TO_CHAR(EL.TIME),' ') TIME, NVL(TO_CHAR(EL.LOGDATA),' ') LOGDATA";
		try {
			List lEl_= DBUtil.select(campos_, 
									  adapter_.getAsicGOwner() + "TPOS_EXCEPTION_LOG EL", 
									  " TRUNC(EL.DAY) = TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
									  " AND EL.STORE = '"+ pStore +"'"+
									  " AND EL.TIPO = '"+ pTipo +"'", 
									  TX_EXCEPTION_LOG_Imp.class, ApplicationResources.ASICG_DB);
			return lEl_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
	
	public List getManagerOverride(String pDay, String pStore, String pTipo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(MG.OFFSETY),' ')OFFSETY, NVL(TO_CHAR(MG.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(MG.STORE),' ') STORE, "+
						 "NVL(TO_CHAR(MG.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(MG.TRANSNUM),' ') TRANSNUM, NVL(TO_CHAR(MG.DAY,'YYMMDD'),' ') DAY, "+
						 "NVL(TO_CHAR(MG.TIME),' ') TIME, NVL(TO_CHAR(MG.OVERRIDE),' ') OVERRIDE, NVL(TO_CHAR(MG.REASON),' ') REASON";
		try {
			List lManOv_= DBUtil.select(campos_, 
										adapter_.getAsicGOwner() + "TPOS_MANAGER_OVERRIDE MG", 
										" TRUNC(MG.DAY) = TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
									  	" AND MG.STORE = '"+ pStore +"'"+
									  	" AND MG.TIPO = '"+ pTipo +"'", 
										TX_MANAGER_OVERRIDE_Imp.class, ApplicationResources.ASICG_DB);
			return lManOv_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
	
	public List getStoreClosing(String pDay, String pStore, String pTipo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(SC.OFFSETY),' ') OFFSETY, NVL(TO_CHAR(SC.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(SC.STORE),' ') STORE, "+
						 "NVL(TO_CHAR(SC.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(SC.TRANSNUM),' ') TRANSNUM, NVL(TO_CHAR(SC.DAY,'YYMMDD'),' ') DAY, "+
						 "NVL(TO_CHAR(SC.TIME),' ') TIME, NVL(TO_CHAR(SC.INDICAT2),' ') INDICAT2, NVL(TO_CHAR(SC.FECHAHORA),' ') FECHAHORA";
		try {
			List lStore_= DBUtil.select(campos_, 
										adapter_.getAsicGOwner() + "TPOS_STORE_CLOSING SC", 
										" TRUNC(SC.DAY) = TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
									  	" AND SC.STORE = '"+ pStore +"'"+
									  	" AND SC.TIPO = '"+ pTipo +"'", 
										TX_STORE_CLOSING_Imp.class, ApplicationResources.ASICG_DB);
			return lStore_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
	
	public List getItemRecordChange(String pDay, String pStore, String pTipo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(IR.OFFSETY),' ') OFFSETY, NVL(TO_CHAR(IR.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(IR.STORE),' ') STORE, "+
						 "NVL(TO_CHAR(IR.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(IR.TRANSNUM),' ') TRANSNUM, NVL(TO_CHAR(IR.DAY,'YYMMDD'),' ') DAY, "+
						 "NVL(TO_CHAR(IR.TIME),' ') TIME, NVL(TO_CHAR(IR.OLDDATA),' ') OLDDATA, NVL(TO_CHAR(IR.NEWDATA),' ') NEWDATA";
		try {
			List lIrc_= DBUtil.select(campos_, 
									  adapter_.getAsicGOwner() + "TPOS_ITEM_RECORD_CHANGE IR", 
									  " TRUNC(IR.DAY) = TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
									  " AND IR.STORE = '"+ pStore +"'"+
									  " AND IR.TIPO = '"+ pTipo +"'", 
									  TX_ITEM_RECORD_CHANGE_Imp.class, ApplicationResources.ASICG_DB);			
			return lIrc_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
	
	public List getOperatorTraining(String pDay, String pStore, String pTipo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(OT.OFFSETY),' ') OFFSETY, NVL(TO_CHAR(OT.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(OT.STORE),' ') STORE, "+
						 "NVL(TO_CHAR(OT.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(OT.TRANSNUM),' ') TRANSNUM, NVL(TO_CHAR(OT.DAY,'YYMMDD'),' ') DAY, "+
						 "NVL(TO_CHAR(OT.TIME),' ') TIME, NVL(TO_CHAR(OT.DATA1),' ') DATA1";
		try {
			List lOperator_= DBUtil.select(campos_, 
										   adapter_.getAsicGOwner() + "TPOS_OPERATOR_TRAINING OT", 
										   " TRUNC(OT.DAY) = TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
									  	   " AND OT.STORE = '"+ pStore +"'"+
									  	   " AND OT.TIPO = '"+ pTipo +"'", 
										   TX_OPERATOR_TRAINING_Imp.class, ApplicationResources.ASICG_DB);
			return lOperator_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
	
	public List getUserData(String pDay, String pStore, String pTipo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(UD.OFFSETY),' ') OFFSETY, NVL(TO_CHAR(UD.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(UD.STORE),' ') STORE, "+
						 "NVL(TO_CHAR(UD.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(UD.TRANSNUM),' ') TRANSNUM, NVL(TO_CHAR(UD.DAY,'YYMMDD'),' ') DAY, "+
						 "NVL(TO_CHAR(UD.TIME),' ') TIME, NVL(TO_CHAR(UD.TYPE),' ') TYPE, NVL(TO_CHAR(UD.DATA1),' ') DATA1, "+
						 "NVL(TO_CHAR(UD.DATA2),' ') DATA2, NVL(TO_CHAR(UD.DATA3),' ') DATA3, NVL(TO_CHAR(UD.DATA4),' ') DATA4, "+
						 "NVL(TO_CHAR(UD.DATA5),' ') DATA5, NVL(TO_CHAR(UD.DATA6),' ') DATA6, NVL(TO_CHAR(UD.DATA7),' ') DATA7, "+
						 "NVL(TO_CHAR(UD.DATA8),' ') DATA8, NVL(TO_CHAR(UD.DATA9),' ') DATA9, NVL(TO_CHAR(UD.DATA10),' '), DATA10, "+
						 "NVL(TO_CHAR(UD.DATA11),' ') DATA11, NVL(TO_CHAR(UD.DATA12),' ') DATA12, NVL(TO_CHAR(UD.DATA13),' ') DATA13, "+
						 "NVL(TO_CHAR(UD.DATA14),' ') DATA14, NVL(TO_CHAR(UD.DATA15),' ') DATA15, NVL(TO_CHAR(UD.DATA16),' ') DATA16, "+
						 "NVL(TO_CHAR(UD.DATA17),' ') DATA17, NVL(TO_CHAR(UD.DATA18),' ') DATA18, NVL(TO_CHAR(UD.DATA19),' ') DATA19, "+
						 "NVL(TO_CHAR(UD.DATA20),' ') DATA20";
		try {
			List lUser_= DBUtil.select(campos_, 
									   adapter_.getAsicGOwner() + "TPOS_USER_DATA UD", 
									   " TRUNC(UD.DAY) = TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
									   " AND UD.STORE = '"+ pStore +"'"+
									   " AND UD.TIPO = '"+ pTipo +"'", 
									   TX_USER_DATA_Imp.class, ApplicationResources.ASICG_DB);
			return lUser_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
	
	public List getTender(String pDay, String pStore, String pTipo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(TN.OFFSETY),' ') OFFSETY, NVL(TO_CHAR(TN.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(TN.STORE),' ') STORE, "+
						 "NVL(TO_CHAR(TN.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(TN.TRANSNUM),' ') TRANSNUM, NVL(TO_CHAR(TN.DAY,'YYMMDD'),' ') DAY, "+
						 "NVL(TO_CHAR(TN.TIME),' ') TIME, NVL(TO_CHAR(TN.TYPE),' ') TYPE, NVL(TO_CHAR(TN.TENDTYPE),' ') TENDTYPE, "+
						 "NVL(TO_CHAR(TN.AMTTENDE),' ') AMTTENDE, NVL(TO_CHAR(TN.AMTTNFEE),' ') AMTTNFEE, NVL(TO_CHAR(TN.CUSTOMER),' ') CUSTOMER, "+
						 "NVL(TO_CHAR(TN.STATUS),' ') STATUS";
		try {
			List lTender_= DBUtil.select(campos_, 
										 adapter_.getAsicGOwner() + "TPOS_TENDER TN", 
										 " TRUNC(TN.DAY) = TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
									  	 " AND TN.STORE = '"+ pStore +"'"+
									  	 " AND TN.TIPO = '"+ pTipo +"'", 
										 TX_TENDER_Imp.class, ApplicationResources.ASICG_DB);
			return lTender_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
	
	public List getTillChange(String pDay, String pStore, String pTipo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(TC.OFFSETY),' ') OFFSETY, NVL(TO_CHAR(TC.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(TC.STORE),' ') STORE, "+
						 "NVL(TO_CHAR(TC.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(TC.DAY,'YYMMDD'),' ') DAY, NVL(TO_CHAR(TC.TIME),' ') TIME, "+
						 "NVL(TO_CHAR(TC.TRANSNUM),' ') TRANSNUM, NVL(TO_CHAR(TC.NUMBERLOANS),' ') NUMBERLOANS, NVL(TO_CHAR(TC.AMTLOANS),' ') AMTLOANS, "+
						 "NVL(TO_CHAR(TC.NUMBERPKUPS),' ') NUMBERPKUPS, NVL(TO_CHAR(TC.AMTPKUPS),' ') AMTPKUPS, NVL(TO_CHAR(TC.TENDTYP11),' ') TENDTYP11, "+
						 "NVL(TO_CHAR(TC.AMTTEND11),' ') AMTTEND11, NVL(TO_CHAR(TC.TENDTYP12),' ') TENDTYP12, NVL(TO_CHAR(TC.AMTTEND12),' ') AMTTEND12, "+
						 "NVL(TO_CHAR(TC.TENDTYP13),' ') TENDTYP13, NVL(TO_CHAR(TC.AMTTEND13),' ') AMTTEND13, NVL(TO_CHAR(TC.TENDTYP14),' ') TENDTYP14, "+
						 "NVL(TO_CHAR(TC.AMTTEND14),' ') AMTTEND14, NVL(TO_CHAR(TC.TENDTYP15),' ') TENDTYP15, NVL(TO_CHAR(TC.AMTTEND15),' ') AMTTEND15, "+
						 "NVL(TO_CHAR(TC.TENDTYP16),' ') TENDTYP16, NVL(TO_CHAR(TC.AMTTEND16),' ') AMTTEND16, NVL(TO_CHAR(TC.TENDTYP17),' ') TENDTYP17, "+
						 "NVL(TO_CHAR(TC.AMTTEND17),' ') AMTTEND17, NVL(TO_CHAR(TC.TENDTYP18),' ') TENDTYP18, NVL(TO_CHAR(TC.AMTTEND18),' ') AMTTEND18, "+
						 "NVL(TO_CHAR(TC.TENDTYP21),' ') TENDTYP21, NVL(TO_CHAR(TC.AMTTEND21),' ') AMTTEND21, NVL(TO_CHAR(TC.TENDTYP22),' ') TENDTYP22, "+
						 "NVL(TO_CHAR(TC.AMTTEND22),' ') AMTTEND22, NVL(TO_CHAR(TC.TENDTYP23),' ') TENDTYP23, NVL(TO_CHAR(TC.AMTTEND23),' ') AMTTEND23, "+
						 "NVL(TO_CHAR(TC.TENDTYP24),' ') TENDTYP24, NVL(TO_CHAR(TC.AMTTEND24),' ') AMTTEND24, NVL(TO_CHAR(TC.TENDTYP25),' ') TENDTYP25, "+
						 "NVL(TO_CHAR(TC.AMTTEND25),' ') AMTTEND25, NVL(TO_CHAR(TC.TENDTYP26),' ') TENDTYP26, NVL(TO_CHAR(TC.AMTTEND26),' ') AMTTEND26, "+
						 "NVL(TO_CHAR(TC.TENDTYP27),' ') TENDTYP27, NVL(TO_CHAR(TC.AMTTEND27),' ') AMTTEND27, NVL(TO_CHAR(TC.TENDTYP28),' ') TENDTYP28, "+
						 "NVL(TO_CHAR(TC.AMTTEND28),' ') AMTTEND28";
		try {
			List lTill_= DBUtil.select(campos_, 
									   adapter_.getAsicGOwner() + "TPOS_TILL_CHANGE TC", 
									   " TRUNC(TC.DAY) = TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
									   " AND TC.STORE = '"+ pStore +"'"+
									   " AND TC.TIPO = '"+ pTipo +"'", 
									   TX_TILL_CHANGE_Imp.class, ApplicationResources.ASICG_DB);
			return lTill_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
	
	public List getPriceChange(String pDay, String pStore, String pTipo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(PC.OFFSETY),' ') OFFSETY, NVL(TO_CHAR(PC.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(PC.STORE),' ') STORE, "+
						 "NVL(TO_CHAR(PC.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(PC.TRANSNUM),' ') TRANSNUM, NVL(TO_CHAR(PC.DAY,'YYMMDD'),' ') DAY, "+
						 "NVL(TO_CHAR(PC.TIME),' ') TIME, NVL(TO_CHAR(PC.ITEMCODE),' ') ITEMCODE, NVL(TO_CHAR(PC.NEWDEALQ),' ') NEWDEALQ, "+
						 "NVL(TO_CHAR(PC.NEWPRICE),' ') NEWPRICE, NVL(TO_CHAR(PC.OLDDEALQ),' ') OLDDEALQ, NVL(TO_CHAR(PC.OLDPRICE),' ') OLDPRICE ";
		try {
			List lPrice_= DBUtil.select(campos_, 
										adapter_.getAsicGOwner() + "TPOS_PRICE_CHANGE PC", 
										" TRUNC(PC.DAY) = TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
									  	" AND PC.STORE = '"+ pStore +"'"+
									  	" AND PC.TIPO = '"+ pTipo +"'", 
										TX_PRICE_CHANGE_Imp.class, ApplicationResources.ASICG_DB);
			return lPrice_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
	
	public List getTradingStamps(String pDay, String pStore, String pTipo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		String campos_ = "NVL(TO_CHAR(TS.OFFSETY),' ') OFFSETY, NVL(TO_CHAR(TS.OFFSETX),' ') OFFSETX, NVL(TO_CHAR(TS.STORE),' ') STORE, "+
						 "NVL(TO_CHAR(TS.TERMINAL),' ') TERMINAL, NVL(TO_CHAR(TS.TRANSNUM),' ') TRANSNUM, NVL(TO_CHAR(TS.DAY,'YYMMDD'),' ') DAY, "+
						 "NVL(TO_CHAR(TS.TIME),' ') TIME, NVL(TO_CHAR(TS.STAMPS),' ') STAMPS";
		try {
			List lTrading_= DBUtil.select(campos_, 
										  adapter_.getAsicGOwner() + "TPOS_TRADING_STAMPS TS", 
										  " TRUNC(TS.DAY) = TO_DATE ('"+ pDay +"','yyyy-mm-dd')"+
									  	  " AND TS.STORE = '"+ pStore +"'"+
									  	  " AND TS.TIPO = '"+ pTipo +"'", 
										  TX_TRADING_STAMPS_Imp.class, ApplicationResources.ASICG_DB);
			return lTrading_;
			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}
}