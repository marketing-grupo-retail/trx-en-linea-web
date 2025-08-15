/*
 * Proyecto: ASICG
 * 
 * Copyright (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * All rights Reserved.
 * 
 * Id:
 * 
 */
package com.asic.transacciones.bean;

import java.sql.Connection;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.ramm.jwaf.dbutil.DBUtil;
import org.ramm.jwaf.jdao.TransactionDaoGroup;
import org.ramm.jwaf.logger.LogWriter;
import org.ramm.jwaf.patterns.dao.DAOClassNotFoundException;
import org.ramm.jwaf.patterns.dao.DAOCreationException;
import org.ramm.jwaf.patterns.dao.DAOLocator;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.resources.ApplicationConfigFacadeAdapter;
import com.asic.framework.resources.ApplicationResources;
import com.asic.transacciones.dao.TX_DATA_ENTRY_DAO;
import com.asic.transacciones.dao.TX_DISCOUNT_DAO;
import com.asic.transacciones.dao.TX_EXCEPTION_LOG_DAO;
import com.asic.transacciones.dao.TX_HEADER_DAO;
import com.asic.transacciones.dao.TX_ITEMENTRY_DAO;
import com.asic.transacciones.dao.TX_ITEM_RECORD_CHANGE_DAO;
import com.asic.transacciones.dao.TX_MANAGER_OVERRIDE_DAO;
import com.asic.transacciones.dao.TX_OPERATOR_TRAINING_DAO;
import com.asic.transacciones.dao.TX_PRICE_CHANGE_DAO;
import com.asic.transacciones.dao.TX_RECHAZO_DAO;
import com.asic.transacciones.dao.TX_STORE_CLOSING_DAO;
import com.asic.transacciones.dao.TX_TAX_DAO;
import com.asic.transacciones.dao.TX_TENDER_DAO;
import com.asic.transacciones.dao.TX_TILL_CHANGE_DAO;
import com.asic.transacciones.dao.TX_TRADING_STAMPS_DAO;
import com.asic.transacciones.dao.TX_USER_DATA_DAO;
import com.asic.transacciones.util.Propiedad;
import com.asic.transacciones.vo.MensajeError;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TRANSACCION_Imp;
import com.asic.transacciones.vo.TX_DATA_ENTRY;
import com.asic.transacciones.vo.TX_DATA_ENTRY_Imp;
import com.asic.transacciones.vo.TX_DISCOUNT;
import com.asic.transacciones.vo.TX_DISCOUNT_Imp;
import com.asic.transacciones.vo.TX_EXCEPTION_LOG;
import com.asic.transacciones.vo.TX_EXCEPTION_LOG_Imp;
import com.asic.transacciones.vo.TX_HEADER;
import com.asic.transacciones.vo.TX_HEADER_Imp;
import com.asic.transacciones.vo.TX_ITEMENTRY;
import com.asic.transacciones.vo.TX_ITEMENTRY_Imp;
import com.asic.transacciones.vo.TX_ITEM_RECORD_CHANGE;
import com.asic.transacciones.vo.TX_ITEM_RECORD_CHANGE_Imp;
import com.asic.transacciones.vo.TX_MANAGER_OVERRIDE;
import com.asic.transacciones.vo.TX_MANAGER_OVERRIDE_Imp;
import com.asic.transacciones.vo.TX_OPERATOR_TRAINING;
import com.asic.transacciones.vo.TX_OPERATOR_TRAINING_Imp;
import com.asic.transacciones.vo.TX_PRICE_CHANGE;
import com.asic.transacciones.vo.TX_PRICE_CHANGE_Imp;
import com.asic.transacciones.vo.TX_RECHAZO;
import com.asic.transacciones.vo.TX_RECHAZO_Imp;
import com.asic.transacciones.vo.TX_STORE_CLOSING;
import com.asic.transacciones.vo.TX_STORE_CLOSING_Imp;
import com.asic.transacciones.vo.TX_TAX;
import com.asic.transacciones.vo.TX_TAX_Imp;
import com.asic.transacciones.vo.TX_TENDER;
import com.asic.transacciones.vo.TX_TENDER_Imp;
import com.asic.transacciones.vo.TX_TILL_CHANGE;
import com.asic.transacciones.vo.TX_TILL_CHANGE_Imp;
import com.asic.transacciones.vo.TX_TRADING_STAMPS;
import com.asic.transacciones.vo.TX_TRADING_STAMPS_Imp;
import com.asic.transacciones.vo.TX_USER_DATA;
import com.asic.transacciones.vo.TX_USER_DATA_Imp;
import com.grpretail.support.vos.SUPPORT_STORE_Imp;

/**
 * @author ramm
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class SupportProcessBean {

	private ApplicationConfigFacadeAdapter adapter_;
	private String day;
	private String store;
	private String terminal;
	private String time;
	private String transnum;
	private String offsetx;

	/**
	 * Inserta un nuevo usuario y lo retorna
	 * 
	 * @param pUser
	 * @return
	 * @throws ServiceException
	 */
	public void insertRechazo(TRANSACCION pVo, List pError) throws ServiceException {

		TransactionDaoGroup group_ = null;
		List listRet_ = new ArrayList();
		String msg_ = "";
		MensajeError mensaje_;

		try {

			List errors_;

			TX_RECHAZO_DAO rechazoDao_ = (TX_RECHAZO_DAO) DAOLocator.getDAO(TX_RECHAZO_DAO.class);
			TX_RECHAZO vo_ = new TX_RECHAZO_Imp();
			vo_.setAUDI_CREA("SISTEMA");
			vo_.setAUDI_FHCREA(Timestamp.valueOf(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(Calendar.getInstance().getTime())));
			vo_.setERROR(getMensaje(pError, true));
			vo_.setESTADO("0");
			vo_.setOFFSETX(offsetx);

			group_ = new TransactionDaoGroup(rechazoDao_.getPool());
			Connection conn_ = group_.getGroupConn();
			group_.addDao(rechazoDao_);

			group_.beginTrx();

			int id_ = rechazoDao_.insert(vo_, true);
			insertHeader(pVo, group_, id_);
			insertItemDataEntry(pVo, group_, id_);
			insertDataEntry(pVo, group_, id_);
			insertDiscount(pVo, group_, id_);
			insertException(pVo, group_, id_);
			insertItemRecord(pVo, group_, id_);
			insertManager(pVo, group_, id_);
			insertOperator(pVo, group_, id_);
			insertPrice(pVo, group_, id_);
			insertStore(pVo, group_, id_);
			insertTax(pVo, group_, id_);
			insertTender(pVo, group_, id_);
			insertTill(pVo, group_, id_);
			insertTrading(pVo, group_, id_);
			insertUserData(pVo, group_, id_);
			setInfoRechazo(vo_);
			updateRechazo(vo_, id_, group_);

		} catch (DAOClassNotFoundException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertRechazo(...)]: " + e.getMessage(), e);
			makeRollBack(group_, e);
			throw new ServiceException("DAOClassNotFoundException", "error.generic.dao_class_not_fount", e);
		} catch (DAOCreationException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertRechazo(...)]: " + e.getMessage(), e);
			makeRollBack(group_, e);
			throw new ServiceException("DAOCreationException", "error.generic.dao_creaction_failed", e);
		} catch (ConnectionFailedException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertRechazo(...)]: " + e.getMessage(), e.getCause());
			makeRollBack(group_, e);
			throw new ServiceException("ConnectionFailedException", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertRechazo(...)]: " + e.getMessage(), e.getCause());
			makeRollBack(group_, e);
			throw new ServiceException("DBAccessException", "error.generic.dbaccess_failed", e);
		} catch (NullPointerException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertRechazo(...)]:" + e.getMessage(), e);
			makeRollBack(group_, e);
			throw new ServiceException("NullPointerException", "error.generic.unknown_failed", e);
		}

		try {
			group_.commit();
		} catch (DBAccessException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertRechazo(...)]: " + e.getMessage());
			throw new ServiceException("DBAccessException", "error.generic.dbaccess_failed", e);
		}

	}

	private void setInfoRechazo(TX_RECHAZO vo_) {

		vo_.setDAY(day);
		vo_.setSTORE(store);
		vo_.setTERMINAL(terminal);
		vo_.setTIME(time);
		vo_.setTRANSNUM(transnum);

	}

	private void updateRechazo(TX_RECHAZO vo_, int pId, TransactionDaoGroup pGroup) throws ServiceException {
		try {
			vo_.setID_RECHAZO(new Double(pId));
			TX_RECHAZO_DAO rechazoDao_ = (TX_RECHAZO_DAO) DAOLocator.getDAO(TX_RECHAZO_DAO.class);
			rechazoDao_.update(vo_, true);
		} catch (DAOClassNotFoundException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [updateRechazo(...)]: " + e.getMessage(), e);
			makeRollBack(pGroup, e);
			throw new ServiceException("DAOClassNotFoundException", "error.generic.dao_class_not_fount", e);
		} catch (DAOCreationException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [updateRechazo(...)]: " + e.getMessage(), e);
			makeRollBack(pGroup, e);
			throw new ServiceException("DAOCreationException", "error.generic.dao_creaction_failed", e);
		} catch (ConnectionFailedException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [updateRechazo(...)]: " + e.getMessage(), e.getCause());
			makeRollBack(pGroup, e);
			throw new ServiceException("ConnectionFailedException", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [updateRechazo(...)]: " + e.getMessage(), e.getCause());
			makeRollBack(pGroup, e);
			throw new ServiceException("DBAccessException", "error.generic.dbaccess_failed", e);
		}
	}

	public String getMensaje(List pError, boolean pValidarLong) {
		MensajeError mensaje_;
		String msg_ = "";
		offsetx = "";
		List errors_;
		String long_;
		int maxLong_;

		if (pError != null && !pError.isEmpty()) {
			errors_ = ((List) pError.subList(1, pError.size()));
			for (Iterator iter = errors_.iterator(); iter.hasNext();) {
				mensaje_ = (MensajeError) iter.next();
				msg_ += mensaje_.getDescripcion();
				offsetx += mensaje_.getString() + "=" + mensaje_.getOffsetx() == null ? "-" : mensaje_.getOffsetx() + "<BR>";
			}
		}
		Propiedad prop_ = Propiedad.getInstance();
		long_ = prop_.getPropiedad(Propiedad.MAX_LONG_ERROR, Propiedad.RESOURCE_BUNDLE_MSG);
		maxLong_ = Integer.parseInt(long_);

		if (msg_.length() > maxLong_ && pValidarLong)
			msg_ = msg_.substring(0, maxLong_) + "...";

		maxLong_ = Integer.parseInt(prop_.getPropiedad(Propiedad.MAX_LONG_OFFSETX, Propiedad.RESOURCE_BUNDLE_MSG));
		if (offsetx.length() > maxLong_ && pValidarLong)
			offsetx = offsetx.substring(0, maxLong_) + "...";

		return msg_;
	}

	private void insertHeader(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {

		for (Iterator iter = pVo.getHeader().iterator(); iter.hasNext();) {
			TX_HEADER vo_ = (TX_HEADER) iter.next();
			TX_HEADER_DAO daoHeader_ = (TX_HEADER_DAO) DAOLocator.getDAO(TX_HEADER_DAO.class);
			group_.addDao(daoHeader_);
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoHeader_.insert(vo_, true);

		}

	}

	private void llenarVoRechazo(String pDay, String pStore, String pTerminal, String pTime, String pTransnum) {
		if (rechazoCargado()) {
			day = pDay;
			store = pStore;
			terminal = pTerminal;
			time = pTime;
			transnum = pTransnum;
		}
	}

	private boolean rechazoCargado() {
		return day == null || store == null || terminal == null || time == null || transnum == null;
	}

	private void insertUserData(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_USER_DATA_DAO daoUserData_ = (TX_USER_DATA_DAO) DAOLocator.getDAO(TX_USER_DATA_DAO.class);
		group_.addDao(daoUserData_);
		for (Iterator iter = pVo.getUserData().iterator(); iter.hasNext();) {
			TX_USER_DATA vo_ = (TX_USER_DATA) iter.next();
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoUserData_.insert(vo_, true);

		}
	}

	private void insertTrading(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_TRADING_STAMPS_DAO daoTrading_ = (TX_TRADING_STAMPS_DAO) DAOLocator.getDAO(TX_TRADING_STAMPS_DAO.class);
		group_.addDao(daoTrading_);
		for (Iterator iter = pVo.getTradingStamps().iterator(); iter.hasNext();) {
			TX_TRADING_STAMPS vo_ = (TX_TRADING_STAMPS) iter.next();
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoTrading_.insert(vo_, true);
		}
	}

	private void insertTill(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_TILL_CHANGE_DAO daoTill_ = (TX_TILL_CHANGE_DAO) DAOLocator.getDAO(TX_TILL_CHANGE_DAO.class);
		group_.addDao(daoTill_);
		for (Iterator iter = pVo.getTillChange().iterator(); iter.hasNext();) {
			TX_TILL_CHANGE vo_ = (TX_TILL_CHANGE) iter.next();
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoTill_.insert(vo_, true);
		}
	}

	private void insertTender(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_TENDER_DAO daoTender_ = (TX_TENDER_DAO) DAOLocator.getDAO(TX_TENDER_DAO.class);
		group_.addDao(daoTender_);
		for (Iterator iter = pVo.getTender().iterator(); iter.hasNext();) {
			TX_TENDER vo_ = (TX_TENDER) iter.next();
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoTender_.insert(vo_, true);
		}
	}

	private void insertTax(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_TAX_DAO daoTax_ = (TX_TAX_DAO) DAOLocator.getDAO(TX_TAX_DAO.class);
		group_.addDao(daoTax_);
		for (Iterator iter = pVo.getTax().iterator(); iter.hasNext();) {
			TX_TAX vo_ = (TX_TAX) iter.next();
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoTax_.insert(vo_, true);
		}
	}

	private void insertStore(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_STORE_CLOSING_DAO daoStore_ = (TX_STORE_CLOSING_DAO) DAOLocator.getDAO(TX_STORE_CLOSING_DAO.class);
		group_.addDao(daoStore_);
		for (Iterator iter = pVo.getStoreClosig().iterator(); iter.hasNext();) {
			TX_STORE_CLOSING vo_ = (TX_STORE_CLOSING) iter.next();
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoStore_.insert(vo_, true);
		}
	}

	private void insertPrice(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_PRICE_CHANGE_DAO daoPrice_ = (TX_PRICE_CHANGE_DAO) DAOLocator.getDAO(TX_PRICE_CHANGE_DAO.class);
		group_.addDao(daoPrice_);
		for (Iterator iter = pVo.getPriceChange().iterator(); iter.hasNext();) {
			TX_PRICE_CHANGE vo_ = (TX_PRICE_CHANGE) iter.next();
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoPrice_.insert(vo_, true);
		}
	}

	private void insertManager(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_MANAGER_OVERRIDE_DAO daoManager_ = (TX_MANAGER_OVERRIDE_DAO) DAOLocator.getDAO(TX_MANAGER_OVERRIDE_DAO.class);
		group_.addDao(daoManager_);
		for (Iterator iter = pVo.getManagerOverride().iterator(); iter.hasNext();) {
			TX_MANAGER_OVERRIDE vo_ = (TX_MANAGER_OVERRIDE) iter.next();
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoManager_.insert(vo_, true);
		}
	}

	private void insertOperator(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_OPERATOR_TRAINING_DAO daoOperator_ = (TX_OPERATOR_TRAINING_DAO) DAOLocator.getDAO(TX_OPERATOR_TRAINING_DAO.class);
		group_.addDao(daoOperator_);
		for (Iterator iter = pVo.getOperatorTraining().iterator(); iter.hasNext();) {
			TX_OPERATOR_TRAINING vo_ = (TX_OPERATOR_TRAINING) iter.next();
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoOperator_.insert(vo_, true);
		}
	}

	private void insertItemRecord(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		TX_ITEM_RECORD_CHANGE_DAO daoItemRecord_ = (TX_ITEM_RECORD_CHANGE_DAO) DAOLocator.getDAO(TX_ITEM_RECORD_CHANGE_DAO.class);
		group_.addDao(daoItemRecord_);
		for (Iterator iter = pVo.getItemRecordChange().iterator(); iter.hasNext();) {
			TX_ITEM_RECORD_CHANGE vo_ = (TX_ITEM_RECORD_CHANGE) iter.next();
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoItemRecord_.insert(vo_, true);
		}
	}

	private void insertException(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		TX_EXCEPTION_LOG_DAO daoException_ = (TX_EXCEPTION_LOG_DAO) DAOLocator.getDAO(TX_EXCEPTION_LOG_DAO.class);
		group_.addDao(daoException_);
		for (Iterator iter = pVo.getExceptionLog().iterator(); iter.hasNext();) {
			TX_EXCEPTION_LOG vo_ = (TX_EXCEPTION_LOG) iter.next();
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoException_.insert(vo_, true);
		}
	}

	private void insertDiscount(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		TX_DISCOUNT_DAO daoDiscount_ = (TX_DISCOUNT_DAO) DAOLocator.getDAO(TX_DISCOUNT_DAO.class);
		group_.addDao(daoDiscount_);
		for (Iterator iter = pVo.getDiscount().iterator(); iter.hasNext();) {
			TX_DISCOUNT vo_ = (TX_DISCOUNT) iter.next();
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoDiscount_.insert(vo_, true);
		}
	}

	private void insertDataEntry(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		TX_DATA_ENTRY_DAO daoDataEntry_ = (TX_DATA_ENTRY_DAO) DAOLocator.getDAO(TX_DATA_ENTRY_DAO.class);
		group_.addDao(daoDataEntry_);
		for (Iterator iter = pVo.getDataEntry().iterator(); iter.hasNext();) {
			TX_DATA_ENTRY vo_ = (TX_DATA_ENTRY) iter.next();
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoDataEntry_.insert(vo_, true);
		}
	}

	private void insertItemDataEntry(TRANSACCION pVo, TransactionDaoGroup group_, int pId) throws ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		TX_ITEMENTRY_DAO daoItemEntry_ = (TX_ITEMENTRY_DAO) DAOLocator.getDAO(TX_ITEMENTRY_DAO.class);
		group_.addDao(daoItemEntry_);
		for (Iterator iter = pVo.getItemEntry().iterator(); iter.hasNext();) {
			TX_ITEMENTRY vo_ = (TX_ITEMENTRY) iter.next();
			vo_.setID_RECHAZO(new Double(pId));
			llenarVoRechazo(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM());
			daoItemEntry_.insert(vo_, true);
		}
	}

	private void makeRollBack(TransactionDaoGroup group_, Exception e) throws ServiceException {
		try {
			if (group_ != null && group_.getGroupConn() != null)
				group_.rollBack();
		} catch (DBAccessException ex) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [makeRollBack(...)]:" + ex.getMessage(), ex);
			throw new ServiceException("DBAccessException", "error.generic.connection_failed", ex);
		}
	}

	public List getSupportStores() throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		try {
			//List l_ = DBUtil.select("R.*", 
			//adapter_.getDBTrxOnlineOwner() + 
			//"TOL_SUPPORT_STORE R ORDER BY R.DAY, R.TIME DESC", null, "", TX_RECHAZO_Imp.class, ApplicationResources.TXONLINE_DB, pInic, pNumfilas);
			List l_ = DBUtil.select("*", 
					"TOL_SUPPORT_STORE p", 
					"p.TOL_ID > 0 and p.TOL_EXEC = 1 ORDER BY p.TOL_ID asc",
					SUPPORT_STORE_Imp.class, 
					 ApplicationResources.TXONLINE_DB);	
			return l_;

		} catch (ConnectionFailedException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}
	}

	public TRANSACCION getTransaccionRechazada(TX_RECHAZO pVo) throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		TRANSACCION vo_ =  new TRANSACCION_Imp();
		try {
			vo_.setHeader(getHeader(pVo));
			vo_.setDataEntry(getDataEntry(pVo));
			vo_.setDiscount(getDiscount(pVo));
			vo_.setExceptionLog(getException(pVo));
			vo_.setItemEntry(getItemEntry(pVo));
			vo_.setItemRecordChange(getItemRecord(pVo));
			vo_.setManagerOverride(getManager(pVo));
			vo_.setOperatorTraining(getOperator(pVo));
			vo_.setPriceChange(getPrice(pVo));
			vo_.setStoreClosig(getStore(pVo));
			vo_.setTax(getTax(pVo));
			vo_.setTender(getTender(pVo));
			vo_.setTillChange(getTill(pVo));
			vo_.setTradingStamps(getTrading(pVo));
			vo_.setUserData(getUserData(pVo));
			
			return vo_;
			
		} catch (DAOClassNotFoundException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getTransaccionRechazada(...)]: " + e.getMessage(), e);
			throw new ServiceException("DAOClassNotFoundException", "error.generic.dao_class_not_fount", e);
		} catch (DAOCreationException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getTransaccionRechazada(...)]: " + e.getMessage(), e);
			throw new ServiceException("DAOCreationException", "error.generic.dao_creaction_failed", e);
		} catch (ConnectionFailedException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getTransaccionRechazada(...)]: " + e.getMessage(), e.getCause());
			throw new ServiceException("ConnectionFailedException", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getTransaccionRechazada(...)]: " + e.getMessage(), e.getCause());
			throw new ServiceException("DBAccessException", "error.generic.dbaccess_failed", e);
		} 
		

	}

	public List getHeader(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_HEADER vo_ = new TX_HEADER_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_HEADER_DAO daoHeader_ = (TX_HEADER_DAO) DAOLocator.getDAO(TX_HEADER_DAO.class);
		return daoHeader_.selectVO(vo_);

	}

	public List getItemEntry(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_ITEMENTRY vo_ = new TX_ITEMENTRY_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_ITEMENTRY_DAO dao_ = (TX_ITEMENTRY_DAO) DAOLocator.getDAO(TX_ITEMENTRY_DAO.class);
		return dao_.selectVO(vo_);
	}
	
	public List getDataEntry(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_DATA_ENTRY vo_ = new TX_DATA_ENTRY_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_DATA_ENTRY_DAO dao_ = (TX_DATA_ENTRY_DAO) DAOLocator.getDAO(TX_DATA_ENTRY_DAO.class);
		return dao_.selectVO(vo_);
	}
	
	public List getDiscount(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_DISCOUNT vo_ = new TX_DISCOUNT_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_DISCOUNT_DAO dao_ = (TX_DISCOUNT_DAO) DAOLocator.getDAO(TX_DISCOUNT_DAO.class);
		return dao_.selectVO(vo_);
	}
	
	public List getException(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_EXCEPTION_LOG vo_ = new TX_EXCEPTION_LOG_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_EXCEPTION_LOG_DAO dao_ = (TX_EXCEPTION_LOG_DAO) DAOLocator.getDAO(TX_EXCEPTION_LOG_DAO.class);
		return dao_.selectVO(vo_);
	}
	
	public List getItemRecord(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_ITEM_RECORD_CHANGE vo_ = new TX_ITEM_RECORD_CHANGE_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_ITEM_RECORD_CHANGE_DAO dao_ = (TX_ITEM_RECORD_CHANGE_DAO) DAOLocator.getDAO(TX_ITEM_RECORD_CHANGE_DAO.class);
		return dao_.selectVO(vo_);
	}
	
	public List getManager(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_MANAGER_OVERRIDE vo_ = new TX_MANAGER_OVERRIDE_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_MANAGER_OVERRIDE_DAO dao_ = (TX_MANAGER_OVERRIDE_DAO) DAOLocator.getDAO(TX_MANAGER_OVERRIDE_DAO.class);
		return dao_.selectVO(vo_);
	}
	
	public List getOperator(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_OPERATOR_TRAINING vo_ = new TX_OPERATOR_TRAINING_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_OPERATOR_TRAINING_DAO dao_ = (TX_OPERATOR_TRAINING_DAO) DAOLocator.getDAO(TX_OPERATOR_TRAINING_DAO.class);
		return dao_.selectVO(vo_);
	}
	
	public List getPrice(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_PRICE_CHANGE vo_ = new TX_PRICE_CHANGE_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_PRICE_CHANGE_DAO dao_ = (TX_PRICE_CHANGE_DAO) DAOLocator.getDAO(TX_PRICE_CHANGE_DAO.class);
		return dao_.selectVO(vo_);
	}

	public List getStore(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_STORE_CLOSING vo_ = new TX_STORE_CLOSING_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_STORE_CLOSING_DAO dao_ = (TX_STORE_CLOSING_DAO) DAOLocator.getDAO(TX_STORE_CLOSING_DAO.class);
		return dao_.selectVO(vo_);
	}
	
	public List getTax(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_TAX vo_ = new TX_TAX_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_TAX_DAO dao_ = (TX_TAX_DAO) DAOLocator.getDAO(TX_TAX_DAO.class);
		return dao_.selectVO(vo_);
	}

	public List getTender(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_TENDER vo_ = new TX_TENDER_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_TENDER_DAO dao_ = (TX_TENDER_DAO) DAOLocator.getDAO(TX_TENDER_DAO.class);
		return dao_.selectVO(vo_);
	}
	
	public List getTill(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_TILL_CHANGE vo_ = new TX_TILL_CHANGE_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_TILL_CHANGE_DAO dao_ = (TX_TILL_CHANGE_DAO) DAOLocator.getDAO(TX_TILL_CHANGE_DAO.class);
		return dao_.selectVO(vo_);
	}

	public List getTrading(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_TRADING_STAMPS vo_ = new TX_TRADING_STAMPS_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_TRADING_STAMPS_DAO dao_ = (TX_TRADING_STAMPS_DAO) DAOLocator.getDAO(TX_TRADING_STAMPS_DAO.class);
		return dao_.selectVO(vo_);
	}
	
	public List getUserData(TX_RECHAZO pVo) throws ServiceException, DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TX_USER_DATA vo_ = new TX_USER_DATA_Imp();
		vo_.setID_RECHAZO(pVo.getID_RECHAZO());
		TX_USER_DATA_DAO dao_ = (TX_USER_DATA_DAO) DAOLocator.getDAO(TX_USER_DATA_DAO.class);
		return dao_.selectVO(vo_);
	}
	
	public List getRechazo(TX_RECHAZO pVo) throws ServiceException{
		adapter_ = new ApplicationConfigFacadeAdapter();
		try {
			return DBUtil.select("*", 
					adapter_.getDBTrxOnlineOwner() + "TX_RECHAZO p", 
					"p.ID_RECHAZO ="+pVo.getID_RECHAZO(),
					TX_RECHAZO_Imp.class, 
					 ApplicationResources.TXONLINE_DB);	 
	
		} catch (ConnectionFailedException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getRechazo(...)]: " + e.getMessage(), e.getCause());
			throw new ServiceException("ConnectionFailedException", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getRechazo(...)]: " + e.getMessage(), e.getCause());
			throw new ServiceException("DBAccessException", "error.generic.dbaccess_failed", e);
		} 

	
	}
}