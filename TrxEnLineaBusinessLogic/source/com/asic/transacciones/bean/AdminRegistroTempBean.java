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

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import jdao.sql.DaoException;

import org.ramm.jwaf.dbutil.DBUtil;
import org.ramm.jwaf.jdao.TransactionDaoGroup;
import org.ramm.jwaf.logger.LogWriter;
import org.ramm.jwaf.patterns.dao.DAOClassNotFoundException;
import org.ramm.jwaf.patterns.dao.DAOCreationException;
import org.ramm.jwaf.patterns.dao.DAOLocator;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;
import org.ramm.jwaf.util.StringFormater;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.exception.StoreProcedureException;
import com.asic.framework.exception.TransactionExistsException;
import com.asic.framework.resources.ApplicationConfigFacadeAdapter;
import com.asic.framework.resources.ApplicationResources;
import com.asic.transacciones.dao.TPOS_DATA_ENTRY_DAO;
import com.asic.transacciones.dao.TPOS_DISCOUNT_DAO;
import com.asic.transacciones.dao.TPOS_EXCEPTION_LOG_DAO;
import com.asic.transacciones.dao.TPOS_HEADER_DAO;
import com.asic.transacciones.dao.TPOS_ITEMENTRY_DAO;
import com.asic.transacciones.dao.TPOS_ITEM_RECORD_CHANGE_DAO;
import com.asic.transacciones.dao.TPOS_MANAGER_OVERRIDE_DAO;
import com.asic.transacciones.dao.TPOS_OPERATOR_TRAINING_DAO;
import com.asic.transacciones.dao.TPOS_PRICE_CHANGE_DAO;
import com.asic.transacciones.dao.TPOS_STORE_CLOSING_DAO;
import com.asic.transacciones.dao.TPOS_TAX_DAO;
import com.asic.transacciones.dao.TPOS_TENDER2_DAO;
import com.asic.transacciones.dao.TPOS_TENDER_DAO;
import com.asic.transacciones.dao.TPOS_TILL_CHANGE_DAO;
import com.asic.transacciones.dao.TPOS_TRADING_STAMPS_DAO;
import com.asic.transacciones.dao.TPOS_USER_DATA_DAO;
import com.asic.transacciones.dao.jdao.TPOS_HEADER_JDAO;
import com.asic.transacciones.exception.TramaInvalidaException;
import com.asic.transacciones.util.Propiedad;
import com.asic.transacciones.vo.NumeroRegistros;
import com.asic.transacciones.vo.TPOS_DATA_ENTRY;
import com.asic.transacciones.vo.TPOS_DISCOUNT;
import com.asic.transacciones.vo.TPOS_EXCEPTION_LOG;
import com.asic.transacciones.vo.TPOS_HEADER;
import com.asic.transacciones.vo.TPOS_HEADER_Imp;
import com.asic.transacciones.vo.TPOS_ITEMENTRY;
import com.asic.transacciones.vo.TPOS_ITEMENTRY_Imp;
import com.asic.transacciones.vo.TPOS_ITEM_RECORD_CHANGE;
import com.asic.transacciones.vo.TPOS_MANAGER_OVERRIDE;
import com.asic.transacciones.vo.TPOS_OPERATOR_TRAINING;
import com.asic.transacciones.vo.TPOS_PRICE_CHANGE;
import com.asic.transacciones.vo.TPOS_STORE_CLOSING;
import com.asic.transacciones.vo.TPOS_STORE_CLOSING_Imp;
import com.asic.transacciones.vo.TPOS_TAX;
import com.asic.transacciones.vo.TPOS_TAX_Imp;
import com.asic.transacciones.vo.TPOS_TENDER;
import com.asic.transacciones.vo.TPOS_TENDER2;
import com.asic.transacciones.vo.TPOS_TENDER2_Imp;
import com.asic.transacciones.vo.TPOS_TENDER_Imp;
import com.asic.transacciones.vo.TPOS_TILL_CHANGE;
import com.asic.transacciones.vo.TPOS_TILL_CHANGE_Imp;
import com.asic.transacciones.vo.TPOS_TRADING_STAMPS;
import com.asic.transacciones.vo.TPOS_USER_DATA;
import com.asic.transacciones.vo.TPOS_USER_DATA_Imp;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TX_RECHAZO;
import com.asic.transacciones.vo.TX_RECHAZO_Imp;
import com.general.utils.StringFormatter;
//import com.asic.utils.StringFormater;

/**
 * @author ramm
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class AdminRegistroTempBean {

	//private static Hashtable mensajesHash;
	private ApplicationConfigFacadeAdapter adapter_;
	public static String ITEM_ADDIONAL_INFO_USER_DATA 							= "62"; // Detalle productos para factura electrónica
	public static String ITEM_SMALLBILL_ADDIONAL_INFO_USER_DATA 				= "63";
	public static String ITEM_ELECT_BILL_VII_ADDIONAL_INFO_USER_DATA 			= "65"; // User Data de facturación electrónica versión Carvajal
	public static String CREDIT_NOTE_ELECT_BILL_VII_ADDIONAL_INFO_USER_DATA 	= "67"; // User Data de nota crédito facturación electrónica versión Carvajal
	
	
	
	public static String ITEM_TAXES_ADDIONAL_INFO_USER_DATA = "20221102";
	public static String TO_SEND_ELECT_BILL_STATUS = "A"; // A: A enviar
	public static String TO_PROC_INV_ONLINE_STATUS = "A"; // A: A procesar
	
	// CACS: Estados nueva facturación electrónica Carvajal
	public static String ID_SENDED_SCARVAJAL_ELECT_BILL_STATUS 				= "1"; // Enviado en linea
	public static String ID_TO_SEND_I_CARVAJAL_ELECT_BILL_STATUS 			= "2"; // A enviar. Facturado en POS x contingencia sin conexión a Carvajal
	public static String ID_TO_SEND_II_CARVAJAL_ELECT_BILL_STATUS 			= "3"; // A enviar. Facturado en POS x contingencia con conexión a Carvajal. Puede haber una factura a anular en Carvajal
	// Estos dos estados no se deberían usar desde este módulo. Solo informativos
	public static String ID_SENDED_SEND_I_CARVAJAL_ELECT_BILL_STATUS 		= "4"; // Enviado a Carvajal tenían el estado 2 antes de ser enviado
	public static String ID_SENDED_SEND_II_CARVAJAL_ELECT_BILL_STATUS 		= "5"; // Enviado a Carvajal tenían el estado 3 antes de ser enviado}
	public static String ID_REVIEW_TRX_CARVAJAL_ELECT_BILL_STATUS 			= "6"; // Para revisar, no debería pasar.
	//CACS: Estados de manejo de nota crédito
	public static String ID_TO_SEND_NC_CARVAJAL_ELECT_BILL_STATUS 			= "a"; // A enviar. Facturado en POS x contingencia sin conexión a Carvajal
	
	
	// CACS: Flags user data facturación electrónica Carvajal
	public static String ID_SENDED_CARVAJAL_ELECT_BILL_UD_FLAG 			= "01"; // Enviado en linea
	public static String ID_TO_SEND_I_CARVAJAL_ELECT_BILL_UD_FLAG 		= "02"; // A enviar. Facturado en POS x contingencia sin conexión a Carvajal
	public static String ID_TO_SEND_II_CARVAJAL_ELECT_BILL_UD_FLAG 		= "03"; // A enviar. Facturado en POS x contingencia con conexión a Carvajal. Puede haber una factura a anular en Carvajal	
		
	//private Timestamp day;
	//private Double store;
	//private Double terminal;
	//private String time;
	//private Double transnum;
	//private String tipo;

	private Object getDAO(Class pClase) throws ServiceException{
		try {
			return DAOLocator.getDAO(pClase);
		} catch (DAOClassNotFoundException e) {
			throw new ServiceException("DAOClassNotFoundException",e);
		} catch (DAOCreationException e) {
			throw new ServiceException("DAOCreationException",e);
		}
	}

	public boolean existsTrx(TRANSACCION pVo) throws ServiceException {
		try {
			System.out.println("Desde existsTrx");
			TPOS_HEADER vo_;
			TPOS_HEADER_DAO daoHeader_ = null;
			TPOS_STORE_CLOSING_DAO daoStoreClosing_ = null;
			//try {
				//TPOS_HEADER_DAO daoHeader_ = (TPOS_HEADER_DAO) DAOLocator.getDAO(TPOS_HEADER_DAO.class);
				daoHeader_ = (TPOS_HEADER_DAO)getDAO(TPOS_HEADER_DAO.class);
				//TPOS_HEADER_JDAO daoHeader_ = new TPOS_HEADER_JDAO();
			/*} catch (Exception e) {
				e.printStackTrace();
				
			}*/

			List pHeader_ = pVo.getHeader();
			if (pHeader_ != null && !pHeader_.isEmpty()){
				
				TPOS_HEADER tpos_ = (TPOS_HEADER) pHeader_.get(0);
				TPOS_HEADER newTpos_ = new  TPOS_HEADER_Imp();
				newTpos_.setSTORE(tpos_.getSTORE());
				newTpos_.setTERMINAL(tpos_.getTERMINAL());
				newTpos_.setTRANSNUM(tpos_.getTRANSNUM());
				newTpos_.setDAY(tpos_.getDAY());
				newTpos_.setTIME(tpos_.getTIME());
				vo_ = daoHeader_.findByPK(newTpos_);
				//List lst_ = daoHeader_.selectVO(newTpos_);
				if (vo_!=null && vo_.getTRANSNUM()!=null){
					System.out.println("Trx already exists");
					throw new TransactionExistsException("Trx already exists");
				}else
					return false;	
			}else{
				List pStoreClosing_ = pVo.getStoreClosig();
				if (pStoreClosing_ != null && !pStoreClosing_.isEmpty()){
					daoStoreClosing_ = (TPOS_STORE_CLOSING_DAO)getDAO(TPOS_STORE_CLOSING_DAO.class);
					TPOS_STORE_CLOSING tposSC_ = (TPOS_STORE_CLOSING) pStoreClosing_.get(0);
					TPOS_STORE_CLOSING newTposSC_ = new  TPOS_STORE_CLOSING_Imp();
					newTposSC_.setSTORE(tposSC_.getSTORE());
					//newTposSC_.setTERMINAL(tposSC_.getTERMINAL());
					//newTposSC_.setTRANSNUM(tposSC_.getTRANSNUM());
					newTposSC_.setDAY(tposSC_.getDAY());
					//newTpos_.setTIME(tpos_.getTIME());
					TPOS_STORE_CLOSING voSC_;
					voSC_ = daoStoreClosing_.findByPK(newTposSC_);
					//List lst_ = daoHeader_.selectVO(newTpos_);
					if (voSC_!=null && voSC_.getFECHAHORA()!=null){
						System.out.println("Trx Store Closing already exists");
						throw new TransactionExistsException("Trx Store Closing already exists");
					}else
						return false;					
				}	
				return true;
			}
				//return false;

		} catch (ConnectionFailedException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertTransaccion(...)]: " + e.getMessage(), e.getCause());
			throw new ServiceException("ConnectionFailedException","error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertTransaccion(...)]: " + e.getMessage(), e.getCause());
			throw new ServiceException("DBAccessException","error.generic.dbaccess_failed", e);
		} 
	}	

	public TransactionDaoGroup getDaoGroup(TRANSACCION pVo)throws ConnectionFailedException, DBAccessException {
		TransactionDaoGroup group_ = null;
		TPOS_ITEMENTRY_DAO daoItemEntry_ = null;
		try {
			//TPOS_HEADER_DAO daoHeader_ = (TPOS_HEADER_DAO) DAOLocator.getDAO(TPOS_HEADER_DAO.class);
			daoItemEntry_ = (TPOS_ITEMENTRY_DAO)getDAO(TPOS_ITEMENTRY_DAO.class);
			//TPOS_HEADER_JDAO daoHeader_ = new TPOS_HEADER_JDAO();
		} catch (Exception e) {
			e.printStackTrace();
		}
		group_ = new TransactionDaoGroup(daoItemEntry_.getPool());
		Connection conn_ = group_.getGroupConn();
		group_.beginTrx();
		group_.addDao(daoItemEntry_);	
		return group_;	
	}
	
	public boolean isBigTransaction(TRANSACCION pVo){
		return pVo.getItemEntry().size()>30;
	}
	
	public List insertTransaccion(TRANSACCION pVo) throws ServiceException {
		TransactionDaoGroup group_ = null;
		List listRet_ = new ArrayList();
		try {

			/*TPOS_ITEMENTRY_DAO daoItemEntry_ = null;
			try {
				//TPOS_HEADER_DAO daoHeader_ = (TPOS_HEADER_DAO) DAOLocator.getDAO(TPOS_HEADER_DAO.class);
				daoItemEntry_ = (TPOS_ITEMENTRY_DAO)getDAO(TPOS_ITEMENTRY_DAO.class);
				//TPOS_HEADER_JDAO daoHeader_ = new TPOS_HEADER_JDAO();
			} catch (Exception e) {
				e.printStackTrace();
			}

			group_ = new TransactionDaoGroup(daoItemEntry_.getPool());
			Connection conn_ = group_.getGroupConn();
			group_.beginTrx();

			group_.addDao(daoItemEntry_); */
			
			group_ = getDaoGroup(pVo);

			List pHeader_ = pVo.getHeader();
												
			if (pHeader_ != null && !pHeader_.isEmpty()){
					boolean boolInsertHeader_ = true;
					try{
						// CACS: Se llenan los datos de itementries desde los user datas
						fillItemEntryTaxesAdditionalData(pVo);						
						// CACS: Se llenan los datos de itementries desde los user datas
						fillItemEntryAdditionalData(pVo);
												
						boolInsertHeader_ = insertItemEntry(pVo, group_);
						if (isBigTransaction(pVo)){
							group_.commit();
							group_ = getDaoGroup(pVo);
							group_.beginTrx();							
						}

					} catch (DBAccessException e){
						e.printStackTrace();
						boolInsertHeader_ = false;
						//CACS: Febrero 25/2014 lo vamos a dejar continuar para no perder los registros que ya se insertaron.
						
						//makeRollBack(group_, e);
						
						/*System.out.println(e.getCause().getLocalizedMessage());
						System.out.println(e.getCause().getMessage());
						System.out.println(e.getLocalizedMessage());
						System.out.println(e.getMessage());
						System.out.println(e.hashCode());
						System.out.println(e.isSqlException());*/
						
						//CACS: Febrero 25/2014 lo vamos a dejar continuar para no perder los registros que ya se insertaron.
						
						//if (e.getCause().getLocalizedMessage().startsWith("ORA-00001")){ // El registro que se quiere insertar ya había sido insertado.
							/*System.out.println("Este es");
							try {
								group_.commit();
							} catch (DBAccessException e2) {
								e2.printStackTrace();
								throw new ServiceException("DBAccessException","error.generic.dbaccess_failed", e);
							}*/
							System.out.println("Se debe contar el número de headers");							
							/*deleteItemEntries(pVo);
							deleteDataEntries(pVo);
							deleteDiscounts(pVo);
							//deleteException(pVo);
							deleteItemRecordChanges(pVo);
							deleteManagerOverrides(pVo);
							deleteOperatorTrainings(pVo);
							deletePriceChanges(pVo);
							//deleteStore(pVo);
							deleteTaxes(pVo);
							deleteTenders(pVo);
							deleteTillChanges(pVo);
							deleteTradingStamps(pVo);
							deleteUserDatas(pVo);*/							
						//}
						//throw e;
								
					}
					
					try{
						if(boolInsertHeader_)
							boolInsertHeader_ = insertDataEntry(pVo, group_);
						else
							insertDataEntry(pVo, group_);
					} catch (DBAccessException e){
						e.printStackTrace();
						boolInsertHeader_ = false;
						/*makeRollBack(group_, e);
						if (e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
							deleteDataEntries(pVo);
							deleteDiscounts(pVo);
							deleteItemRecordChanges(pVo);
							deleteManagerOverrides(pVo);
							deleteOperatorTrainings(pVo);
							deletePriceChanges(pVo);
							deleteTaxes(pVo);
							deleteTenders(pVo);
							deleteTillChanges(pVo);
							deleteTradingStamps(pVo);
							//deleteUserDatas(pVo);							
						}*/
						throw e;
					}													
					try{
						if(boolInsertHeader_)
							boolInsertHeader_ =	insertDiscount(pVo, group_);
						else
							insertDiscount(pVo, group_);
					} catch (DBAccessException e){
						e.printStackTrace();
						boolInsertHeader_ = false;
						/*makeRollBack(group_, e);
						if (e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
							deleteDiscounts(pVo);
							deleteItemRecordChanges(pVo);
							deleteManagerOverrides(pVo);
							deleteOperatorTrainings(pVo);
							deletePriceChanges(pVo);
							deleteTaxes(pVo);
							deleteTenders(pVo);
							deleteTillChanges(pVo);
							deleteTradingStamps(pVo);
							//deleteUserDatas(pVo);							
						}*/
						throw e;
					}					
					
					/*try{*/
						insertException(pVo, group_);
					/*} catch (DBAccessException e){
						e.printStackTrace();
						makeRollBack(group_, e);
						if (e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
							deleteException(pVo);							
						}
						throw e;
					}*/					
					
					try{
						if(boolInsertHeader_)
							boolInsertHeader_ =	insertItemRecord(pVo, group_);
						else
							insertItemRecord(pVo, group_);
					} catch (DBAccessException e){
						e.printStackTrace();
						boolInsertHeader_ = false;
						/*makeRollBack(group_, e);						
						if (e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
							deleteItemRecordChanges(pVo);
							deleteManagerOverrides(pVo);
							deleteOperatorTrainings(pVo);
							deletePriceChanges(pVo);
							deleteTaxes(pVo);
							deleteTenders(pVo);
							deleteTillChanges(pVo);
							deleteTradingStamps(pVo);
							//deleteUserDatas(pVo);							
						}*/
						throw e;
					}					
					
					try{
						if(boolInsertHeader_)
							boolInsertHeader_ =	insertManager(pVo, group_);
						else
							insertManager(pVo, group_);
					} catch (DBAccessException e){
						e.printStackTrace();
						boolInsertHeader_ = false;
						/*makeRollBack(group_, e);
						if (e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
							deleteManagerOverrides(pVo);
							deleteOperatorTrainings(pVo);
							deletePriceChanges(pVo);
							deleteTaxes(pVo);
							deleteTenders(pVo);
							deleteTillChanges(pVo);
							deleteTradingStamps(pVo);
							//deleteUserDatas(pVo);							
						}*/
						throw e;
					}					
					
					
					try{
						if(boolInsertHeader_)
							boolInsertHeader_ =	insertOperator(pVo, group_);
						else
							insertOperator(pVo, group_);	
					} catch (DBAccessException e){
						e.printStackTrace();
						boolInsertHeader_ = false;
						/*makeRollBack(group_, e);
						if (e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
							deleteOperatorTrainings(pVo);
							deletePriceChanges(pVo);
							deleteTaxes(pVo);
							deleteTenders(pVo);
							deleteTillChanges(pVo);
							deleteTradingStamps(pVo);
							//deleteUserDatas(pVo);							
						}*/
						throw e;
					}					
					try{
						if(boolInsertHeader_)
							boolInsertHeader_ =	insertPrice(pVo, group_);
						else
							insertPrice(pVo, group_);
					} catch (DBAccessException e){
						e.printStackTrace();
						boolInsertHeader_ = false;
						/*makeRollBack(group_, e);
						if (e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
							deletePriceChanges(pVo);
							deleteTaxes(pVo);
							deleteTenders(pVo);
							deleteTillChanges(pVo);
							deleteTradingStamps(pVo);
							//deleteUserDatas(pVo);							
						}*/
						throw e;
					}					
					insertStore(pVo, group_);
					
					try{
						if(boolInsertHeader_)
							boolInsertHeader_ =	insertTax(pVo, group_);
						else
							insertTax(pVo, group_);
					} catch (DBAccessException e){
						e.printStackTrace();
						boolInsertHeader_ = false;
						/*makeRollBack(group_, e);
						if (e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
							deleteTaxes(pVo);
							deleteTenders(pVo);
							deleteTillChanges(pVo);
							deleteTradingStamps(pVo);
							//deleteUserDatas(pVo);							
						}*/
						throw e;
					}					
					
					try{
						if(boolInsertHeader_)
							boolInsertHeader_ = insertTender(pVo, group_);
						else
							insertTender(pVo, group_);
					} catch (DBAccessException e){
						e.printStackTrace();
						boolInsertHeader_ = false;
						/*makeRollBack(group_, e);
						if (e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
							deleteTenders(pVo);
							deleteTillChanges(pVo);
							deleteTradingStamps(pVo);
							//deleteUserDatas(pVo);							
						}*/
						throw e;
					}					
					try{
						if(boolInsertHeader_)
							boolInsertHeader_ = insertTill(pVo, group_);
						else
							insertTill(pVo, group_);
					} catch (DBAccessException e){
						e.printStackTrace();
						boolInsertHeader_ = false;
						/*makeRollBack(group_, e);
						if (e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
							deleteTillChanges(pVo);
							deleteTradingStamps(pVo);
							//deleteUserDatas(pVo);							
						}*/
						throw e;
					}					
					
					try{
						if(boolInsertHeader_)
							boolInsertHeader_ =	insertTrading(pVo, group_);
						else
							insertTrading(pVo, group_);
					} catch (DBAccessException e){
						e.printStackTrace();
						boolInsertHeader_ = false;
						/*makeRollBack(group_, e);
						if (e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
							deleteTradingStamps(pVo);
							//deleteUserDatas(pVo);							
						}*/
						throw e;
					}					
					try{
						System.out.println("Revisando User Datas");
						// CACS: Filtrar User Datas
						// User datas de inventarios en línea
						int udCounter_ = 0;
						Iterator iter = pVo.getUserData().iterator();
						while(iter.hasNext()) {
							TPOS_USER_DATA vo_ = (TPOS_USER_DATA) iter.next();
							if(vo_.getDATA1().equals("20221102")){
								System.out.println("ES EL USER DATA DE IMPUESTOS PARA INVENTARIOS EN LINEA");
								pVo.getUserData().remove(vo_);
								iter = pVo.getUserData().iterator();
								udCounter_++;
							}	
						}
						//User datas de factura electrónica
						//boolean exit_ = false;
						boolean existElecBillUDFlag_ = false; // Flag que me indica sí la trx es de Factura Electrónica
						int udElecBillCounter_ = 0;
						iter = pVo.getUserData().iterator();
						while(iter.hasNext() /*&& !existElecBillUDFlag_*/) {
							TPOS_USER_DATA vo_ = (TPOS_USER_DATA) iter.next();
							if(vo_.getDATA1().equals(ITEM_ADDIONAL_INFO_USER_DATA)){
								System.out.println("ES EL USER DATA DE FACTURA ELECTRONICA");
								// CACS: Hay que actualizar el estado del registro para envio(factura electrónica) para que sea encontrado por la 
								// la tarea
								if(udElecBillCounter_ == 0){
									TPOS_HEADER_DAO daoHeader_ = null;
									daoHeader_ = (TPOS_HEADER_DAO)getDAO(TPOS_HEADER_DAO.class);
									TPOS_HEADER tpos_ = (TPOS_HEADER) pHeader_.get(0);
									tpos_.setELECT_BILL_STATUS(TO_SEND_ELECT_BILL_STATUS);
									existElecBillUDFlag_ = true;
								}	
								//int i = daoHeader_.insert(tpos_);
								//if(i<1)
									//throw new Exception("Error insertando encabezado en la DB");								
								
								/*
								pVo.getUserData().remove(vo_);
								iter = pVo.getUserData().iterator();
								udCounter_++;
								*/
								//exit_ = true;
								
								udElecBillCounter_++;
							}	
						}
						if(existElecBillUDFlag_){
							System.out.println("Removiendo user datas de factura electrOnioca...");						
							// Se remueven los user datas de Factura Electrónica(DATA1 = 62)
							udCounter_ = 1;
							iter = pVo.getUserData().iterator();
							while(iter.hasNext() && udCounter_<udElecBillCounter_) {
								TPOS_USER_DATA vo_ = (TPOS_USER_DATA) iter.next();
								if(vo_.getDATA1().equals(ITEM_ADDIONAL_INFO_USER_DATA)){
									System.out.println("ES EL USER DATA DE FACTURA ELECTRONICA");
									//if(udCounter_ > 0){
										pVo.getUserData().remove(vo_);
										iter = pVo.getUserData().iterator();
									//}else
										//System.out.println("El primero en la lista no se borra");
									udCounter_++;		
								}	
							}
						}else
							System.out.println("No hay user datas de factura electrOnioca");
							
						boolean exit_ = false;
						
						if(existElecBillUDFlag_){
							iter = pVo.getUserData().iterator();
							while(iter.hasNext() && !exit_) {
								TPOS_USER_DATA vo_ = (TPOS_USER_DATA) iter.next();
								if(vo_.getDATA1().equals(ITEM_ELECT_BILL_VII_ADDIONAL_INFO_USER_DATA)){
									System.out.println("ES EL USER DATA DE FACTURA ELECTRONICA CARVAJAL");
									TPOS_HEADER tpos_ = (TPOS_HEADER) pHeader_.get(0);
									if(vo_.getDATA2().equals(ID_SENDED_CARVAJAL_ELECT_BILL_UD_FLAG)) // Enviado en línea
										tpos_.setELECT_BILL_STATUS(ID_SENDED_SCARVAJAL_ELECT_BILL_STATUS);
									else if(vo_.getDATA2().equals(ID_TO_SEND_I_CARVAJAL_ELECT_BILL_UD_FLAG)) // Contigencia sin conexión Carvajal
										tpos_.setELECT_BILL_STATUS(ID_TO_SEND_I_CARVAJAL_ELECT_BILL_STATUS);
									else if(vo_.getDATA2().equals(ID_TO_SEND_II_CARVAJAL_ELECT_BILL_UD_FLAG)) // Contigencia sin conexión Carvajal
										tpos_.setELECT_BILL_STATUS(ID_TO_SEND_II_CARVAJAL_ELECT_BILL_STATUS);										
									else
										tpos_.setELECT_BILL_STATUS(ID_REVIEW_TRX_CARVAJAL_ELECT_BILL_STATUS);
									exit_ = true;
								}else if(vo_.getDATA1().equals(CREDIT_NOTE_ELECT_BILL_VII_ADDIONAL_INFO_USER_DATA)){
									System.out.println("ES EL USER DATA DE FACTURA ELECTRONICA NOTA CREDITO CARVAJAL");
									TPOS_HEADER tpos_ = (TPOS_HEADER) pHeader_.get(0);
									tpos_.setELECT_BILL_STATUS(ID_TO_SEND_NC_CARVAJAL_ELECT_BILL_STATUS);
									exit_ = true;
								}		
							}						
						}		
							
						/*								
						if(existElecBillUDFlag_){
							System.out.println("Hay que adicionar un user data para dejar rastreo");
							TPOS_USER_DATA newUserData_ = new TPOS_USER_DATA_Imp();
							newUserData_.setDATA1(ITEM_ADDIONAL_INFO_USER_DATA);
							pVo.getUserData().add(newUserData_); 
						}
						*/
						//User datas de minifacturas para envio a factura electrónica a Expressmed
						int typeDataToInsert_ = 0; // Se inicia en cero la idea es que sirva para prender flags.
						exit_ = false;
						//udCounter_ = 0;
						iter = pVo.getUserData().iterator();
						while(iter.hasNext() && !exit_) {
							TPOS_USER_DATA vo_ = (TPOS_USER_DATA) iter.next();
							if(vo_.getDATA1().equals(ITEM_SMALLBILL_ADDIONAL_INFO_USER_DATA)){
								System.out.println("ES EL USER DATA DE MINIFACTURA PARA FACTURA ELECTRONICA");
								// CACS: Hay que actualizar el estado del registro para envio(factura electrónica) para que sea encontrado por la 
								// la tarea
								typeDataToInsert_ = typeDataToInsert_ + 1; // Se suma 1 para que prenda el primer bit
								exit_ = true;
							}	
						}						
						System.out.println("User Datas ya revisados");
						TPOS_HEADER tpos_ = (TPOS_HEADER) pHeader_.get(0);
						tpos_.setTIPO(typeDataToInsert_+"");
												
						if(boolInsertHeader_)
							boolInsertHeader_ =	insertUserData(pVo, group_);
						else
							insertUserData(pVo, group_);
						//group_ = getDaoGroup(pVo);						
						//group_.commit();
					} catch (DBAccessException e){
						boolInsertHeader_ = false;
						//e.printStackTrace();
					//CACS: Febrero 25/2014 lo vamos a dejar continuar para no perder los registros que ya se insertaron.
					/*	makeRollBack(group_, e);
						if (e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
							deleteUserDatas(pVo);							
						}*/
						throw e;
					}					

					//mensajesHash = Propiedad.getInstance().getPropiedades(Propiedad.RESOURCE_BUNDLE_MSG);

				try {
					group_.commit();
				} catch (DBAccessException e) {
					LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertTransaccion(...)]: " + e.getMessage());
					boolInsertHeader_ = false;
					/*try{
						group_.rollBack();
					}catch(Exception e2){e2.printStackTrace();}catch(Throwable t){t.printStackTrace();}*/
					throw new ServiceException("DBAccessException","error.generic.dbaccess_failed", e);
				}
				
				TPOS_HEADER_DAO daoHeader_ = null;
				daoHeader_ = (TPOS_HEADER_DAO)getDAO(TPOS_HEADER_DAO.class);
				TPOS_HEADER tpos_ = (TPOS_HEADER) pHeader_.get(0);				
				if(tpos_ != null && tpos_.getTRANSTYPE().intValue() != 0){
					System.out.println("No es una trx de venta");
					if(boolInsertHeader_){
						System.out.println("Insertando encabezado ...");
						int i = daoHeader_.insert(tpos_);
						if(i<1)
							throw new Exception("Error insertando encabezado en la DB");	
					}else{
						System.out.println("No se una trx de venta pero no tiene prendido flag boolInsertHeader_");
						throw new Exception("Error insertando encabezado en la DB");
					}
							
						
				}else if (isCorrectTotalEntriesNumber(pVo)){
				//if(boolInsertHeader_){ // En teoría todo fue insertado satisfactoriamente
					//if(pHeader_.get(0) != null){
						//TPOS_HEADER tpos_ = (TPOS_HEADER) pHeader_.get(0);
						if(tpos_ != null && tpos_.getTRANSTYPE().intValue() == 0){
							System.out.println("Es una trx de venta. Se prende flag para inventarios en lInea");
							tpos_.setIL_ESTADO(TO_PROC_INV_ONLINE_STATUS);
						}else
							System.out.println("NO es una trx de venta. NO se prende flag para inventarios en lInea");	
					//}
											
					int i = daoHeader_.insert(tpos_);
					if(i<1)
						throw new Exception("Error insertando encabezado en la DB");
				}else
					throw new DBAccessException ("Falló en la integridad de la trama. No se inserta header");						
	
				/*}else{ // No insertó correctamente el encabezado.
					throw new Exception("Error insertando encabezado en la DB");			
				}*/
			}else{
				//insertItemEntry(pVo, group_);
				insertDataEntry(pVo, group_);
				//insertDiscount(pVo, group_);
				insertException(pVo, group_);
				//insertItemRecord(pVo, group_);
				insertManager(pVo, group_);
				insertOperator(pVo, group_);
				//insertPrice(pVo, group_);
				insertStore(pVo, group_);
				//insertTax(pVo, group_);
				//insertTender(pVo, group_);
				//insertTill(pVo, group_);
				insertTrading(pVo, group_);
				//insertUserData(pVo, group_);
				try {
					group_.commit();
				} catch (DBAccessException e) {
					LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertTransaccion(...)]: " + e.getMessage());
					try{
						group_.rollBack();
					}catch(Exception e2){
						e2.printStackTrace();
					}catch(Throwable t){
						t.printStackTrace();
					}
					throw new ServiceException("DBAccessException","error.generic.dbaccess_failed", e);
				}							
			}
			listRet_.add(new Integer(0));
		} catch (DAOClassNotFoundException e) {
			e.printStackTrace();
			//LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertTransaccion(...)]: " + e.getMessage(), e);
			//makeRollBack(group_, e);
			try {
				group_.commit();
			} catch (DBAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			throw new ServiceException("DAOClassNotFoundException","error.generic.dao_class_not_fount", e);
		} catch (DAOCreationException e) {
			//LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertTransaccion(...)]: " + e.getMessage(), e);
			e.printStackTrace();
			//makeRollBack(group_, e);
			try {
				group_.commit();
			} catch (DBAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
			throw new ServiceException("DAOCreationException","error.generic.dao_creaction_failed", e);
		} catch (ConnectionFailedException e) {
			//LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertTransaccion(...)]: " + e.getMessage(), e.getCause());
			e.printStackTrace();
			//makeRollBack(group_, e);
			try {
				group_.commit();
			} catch (DBAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
			throw new ServiceException("ConnectionFailedException","error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			//LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertTransaccion(...)]: " + e.getMessage(), e.getCause());
			//makeRollBack(group_, e);
			try {
				group_.commit();
			} catch (DBAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
			throw new ServiceException("DBAccessException","error.generic.dbaccess_failed", e);
		/*} catch (NullPointerException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertTransaccion(...)]:" + e.getMessage(), e);
			makeRollBack(group_, e);
			throw new ServiceException("NullPointerException","error.generic.unknown_failed", e);
		*/} catch (TramaInvalidaException e) {
			//LogWriter.getLog().log(this, LogWriter.WARNING, "En [insertTransaccion(...)]:" + e.getMessage(), e);
			e.printStackTrace();
			//makeRollBack(group_, e);
			try {
				group_.commit();
			} catch (DBAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
			return listRet_;
		} catch (Exception e) {
			e.printStackTrace();
			//LogWriter.getLog().log(this, LogWriter.SEVERE, "En [insertTransaccion(...)]: " + e.getMessage(), e);
			//makeRollBack(group_, e);
			try {
				group_.commit();
			} catch (DBAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
			throw new ServiceException("StoreProcedureException","error.generic.store_procedure", e);
		}

		return listRet_;
	}

	private boolean isCorrectTotalEntriesNumber (TRANSACCION pVo) throws ConnectionFailedException,DBAccessException {
		System.out.println("Validando integridad");
		boolean answer_ = true;
		NumeroRegistros reg_ = null;
		TPOS_HEADER vo_ = null;
		List list_;
		if (pVo.getHeader()!=null && !pVo.getHeader().isEmpty()){
			vo_ = (TPOS_HEADER) pVo.getHeader().get(0);
			if (pVo.getItemEntry()!=null && !pVo.getItemEntry().isEmpty()){
				//vo_ = (TPOS_ITEMENTRY) pVo.getItemEntry().get(0);
				//Connection conn_ = DBUtil.getConn("");
				// CACS: Verificamos cantidad de items entry
				/*
				list_ = DBUtil.select("count(*) num_reg", 
						"TPOS_ITEMENTRY", 
								"STORE=" + vo_.getSTORE()+" AND " +
								"TERMINAL="+vo_.getTERMINAL()+" AND " + 
								"TRANSNUM="+vo_.getTRANSNUM()+" AND " +
								"DAY=TO_DATE('"+StringFormatter.align((vo_.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
												StringFormatter.align((vo_.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
												StringFormatter.align(vo_.getDAY().getDate()+"",2,'0',0,2)+" "+
												StringFormatter.align(vo_.getDAY().getHours()+"",2,'0',0,2)+":"+
												StringFormatter.align(vo_.getDAY().getMinutes()+"",2,'0',0,2)+":"+
												StringFormatter.align(vo_.getDAY().getSeconds()+"",2,'0',0,2)+
												"','yyyy-mm-dd HH24:MI:SS')",
						 NumeroRegistros.class, 
						 ApplicationResources.TXONLINE_DB);
				System.out.println("Validó items entries");	 
				if (!list_.isEmpty()){
					 reg_ = (NumeroRegistros) list_.get(0);
					 answer_ = reg_.getNum_reg()== pVo.getItemEntry().size();
				}else // La consulta no encontró los registros que estaba buscando.
					return false;
				*/

				TPOS_ITEMENTRY_DAO daoItemEntry_ = null;
				try {
					daoItemEntry_ = (TPOS_ITEMENTRY_DAO)getDAO(TPOS_ITEMENTRY_DAO.class);
				} catch (ServiceException e) {
					System.out.println("Excepción obteniendo DAO de Item Entry");
					e.printStackTrace();
					return false;
				}						
				//TPOS_HEADER tpos_ = (TPOS_HEADER) pHeader_.get(0);
				TPOS_ITEMENTRY newTpos_ = new  TPOS_ITEMENTRY_Imp();
				//newTpos_.setOFFSETX(vo_.getOFFSETX());
				newTpos_.setSTORE(vo_.getSTORE());
				newTpos_.setTERMINAL(vo_.getTERMINAL());
				newTpos_.setTRANSNUM(vo_.getTRANSNUM());
				newTpos_.setDAY(vo_.getDAY());
				newTpos_.setTIME(vo_.getTIME());
				List lst_ = daoItemEntry_.selectVO(newTpos_);
				//List lst_ = daoHeader_.selectVO(newTpos_);
				System.out.println("Validó Item Entries");		
				if (lst_!=null)
					System.out.println("Tamaño lista->"+lst_.size());
				else
					System.out.println("Lista es nula");
					
				if (lst_!=null && lst_.size()  == pVo.getItemEntry().size()){
					System.out.println("Item Entries completos");
					answer_ = true;
				}else{
					System.out.println("Item Entries NO están completos");
					return false;
				}
					
			}		
			if (answer_ && pVo.getUserData()!=null && !pVo.getUserData().isEmpty()){ // CACS Pasó la validación de los item entries y hay user datas para validar.
			   //CACS: Verificamos cantidad de user datas
			   
			   /*
			   list_ = DBUtil.select("count(*) num_reg", 
							   "TPOS_USER_DATA", 
							   "STORE=" + vo_.getSTORE()+" AND " +
							   "TERMINAL="+vo_.getTERMINAL()+" AND " + 
							   "TRANSNUM="+vo_.getTRANSNUM()+" AND " +
							   "DAY=TO_DATE('"+StringFormatter.align((vo_.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
											   StringFormatter.align((vo_.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
											   StringFormatter.align(vo_.getDAY().getDate()+"",2,'0',0,2)+" "+
											   StringFormatter.align(vo_.getDAY().getHours()+"",2,'0',0,2)+":"+
											   StringFormatter.align(vo_.getDAY().getMinutes()+"",2,'0',0,2)+":"+
											   StringFormatter.align(vo_.getDAY().getSeconds()+"",2,'0',0,2)+
											   "','yyyy-mm-dd HH24:MI:SS')",
						NumeroRegistros.class, 
						ApplicationResources.TXONLINE_DB);
				   System.out.println("Validó user datas");
				   if (!list_.isEmpty()){
						reg_ = (NumeroRegistros) list_.get(0);
						answer_ = reg_.getNum_reg()== pVo.getUserData().size();
				   }else // La consulta no encontró los registros que estaba buscando.
					   return false;
				*/
				
				//TPOS_USER_DATA userDataVo_;					


				TPOS_USER_DATA_DAO daoUserData_ = null;
				try {
					daoUserData_ = (TPOS_USER_DATA_DAO)getDAO(TPOS_USER_DATA_DAO.class);
				} catch (ServiceException e) {
					System.out.println("Excepción obteniendo DAO de TAX");
					e.printStackTrace();
					return false;
				}						
				//TPOS_HEADER tpos_ = (TPOS_HEADER) pHeader_.get(0);
				TPOS_USER_DATA newTpos_ = new  TPOS_USER_DATA_Imp();
				//newTpos_.setOFFSETX(vo_.getOFFSETX());
				newTpos_.setSTORE(vo_.getSTORE());
				newTpos_.setTERMINAL(vo_.getTERMINAL());
				newTpos_.setTRANSNUM(vo_.getTRANSNUM());
				newTpos_.setDAY(vo_.getDAY());
				newTpos_.setTIME(vo_.getTIME());
				List lst_ = daoUserData_.selectVO(newTpos_);
				//List lst_ = daoHeader_.selectVO(newTpos_);
				System.out.println("Validó user datas");		
				if (lst_!=null)
					System.out.println("Tamaño lista->"+lst_.size());
				else
					System.out.println("Lista es nula");
					
				if (lst_!=null && lst_.size()  == pVo.getUserData().size()){
					System.out.println("User datas están completos");
					answer_ = true;
				}else{
					if(lst_!=null && lst_.size()  >= pVo.getUserData().size()){
						System.out.println("Hay mAs user datas de los que deberIa.");
						answer_ = true;
					}else{
						System.out.println("User datas NO están completos");
						return false;
					}	
				}
								
			}				
			if (answer_ && pVo.getTender()!=null && !pVo.getTender().isEmpty()){ // CACS Pasó la validación de los user datas y hay tender para validar.
			   //CACS: Verificamos cantidad de tenders


			   System.out.println("Validando primer string de tenders");
			   TPOS_TENDER2 tenderVo_;					
			   TPOS_TENDER voTender_ = (TPOS_TENDER) (pVo.getTender().get(0));


			   TPOS_TENDER2_DAO daoTender_ = null;
			   try {
					daoTender_ = (TPOS_TENDER2_DAO)getDAO(TPOS_TENDER2_DAO.class);
			   } catch (ServiceException e) {
				   System.out.println("Excepción obteniendo DAO de TENDER");
				   e.printStackTrace();
				   return false;
			   }						
			   //TPOS_HEADER tpos_ = (TPOS_HEADER) pHeader_.get(0);
			   TPOS_TENDER2 newTpos_ = new  TPOS_TENDER2_Imp();
			   newTpos_.setOFFSETX(voTender_.getOFFSETX());
			   newTpos_.setSTORE(voTender_.getSTORE());
			   newTpos_.setTERMINAL(voTender_.getTERMINAL());
			   newTpos_.setTRANSNUM(voTender_.getTRANSNUM());
			   newTpos_.setDAY(voTender_.getDAY());
			   newTpos_.setTIME(voTender_.getTIME());
			   tenderVo_ = daoTender_.findByPK(newTpos_);
			   //List lst_ = daoHeader_.selectVO(newTpos_);
			   System.out.println("ValidO primer tender");					
			   if (tenderVo_!=null && tenderVo_.getTRANSNUM()!=null){
				   System.out.println("Tender existe");
				   answer_ = true;
			   }else{
				   System.out.println("Tender NO existe");
				   return false;
			   }

				
				
				/*
			   list_ = DBUtil.select("count(*) num_reg", 
							   "TPOS_TENDER", 
							   "STORE=" + vo_.getSTORE()+" AND " +
							   "TERMINAL="+vo_.getTERMINAL()+" AND " + 
							   "TRANSNUM="+vo_.getTRANSNUM()+" AND " +
							   "DAY='"+StringFormatter.align((vo_.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
															   StringFormatter.align((vo_.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
															   StringFormatter.align(vo_.getDAY().getDate()+"",2,'0',0,2)+"' AND "+
															   //StringFormatter.align(vo_.getDAY().getHours()+"",2,'0',0,2)+":"+
															   //StringFormatter.align(vo_.getDAY().getMinutes()+"",2,'0',0,2)+":"+
															   //StringFormatter.align(vo_.getDAY().getSeconds()+"",2,'0',0,2)+"') AND "+
							   "TIME="+vo_.getTIME(),//ECS Select para jt400 DB2
											   
						NumeroRegistros.class, 
						ApplicationResources.TXONLINE_DB);
				   System.out.println("Validó tenders");
				   if (!list_.isEmpty()){
						reg_ = (NumeroRegistros) list_.get(0);
						answer_ = reg_.getNum_reg()== pVo.getTender().size();
				   }else// La consulta no encontró los registros que estaba buscando.
					   return false;
				*/
				/*
				TPOS_TENDER_DAO daoTender_ = null;
				try {
					daoTender_ = (TPOS_TENDER_DAO)getDAO(TPOS_TENDER_DAO.class);
				} catch (ServiceException e) {
					System.out.println("Excepción obteniendo DAO de Tender");
					e.printStackTrace();
					return false;
				}						
				//TPOS_HEADER tpos_ = (TPOS_HEADER) pHeader_.get(0);
				TPOS_TENDER newTpos_ = new  TPOS_TENDER_Imp();
				//newTpos_.setOFFSETX(vo_.getOFFSETX());
				newTpos_.setSTORE(vo_.getSTORE());
				newTpos_.setTERMINAL(vo_.getTERMINAL());
				newTpos_.setTRANSNUM(vo_.getTRANSNUM());
				newTpos_.setDAY(vo_.getDAY());
				newTpos_.setTIME(new Double(vo_.getTIME()));
				List lst_ = daoTender_.selectVO(newTpos_);
				//List lst_ = daoHeader_.selectVO(newTpos_);
				System.out.println("Validó Tenders");		
				if (lst_!=null)
					System.out.println("Tamaño lista->"+lst_.size());
				else
					System.out.println("Lista es nula");
					
				if (lst_!=null && lst_.size()  == pVo.getTender().size()){
					System.out.println("Tenders completos");
					answer_ = true;
				}else{
					System.out.println("Tenders NO están completos");
					return false;
				}				
	   			*/					 						   								 	
			}
			if (answer_ && pVo.getTax()!=null && !pVo.getTax().isEmpty()){ // CACS Pasó la validación de los tenders y hay taxes para validar.
			   //CACS: Verificamos cantidad de taxes
				if (pVo.getTax().size()==1){ // Deberia haber un solo string de impuestos (Tipo 07)
					System.out.println("Tiene un solo string de tax");
					TPOS_TAX taxVo_;					
					TPOS_TAX voTax_ = (TPOS_TAX) (pVo.getTax().get(0));


					TPOS_TAX_DAO daoTax_ = null;
					try {
						daoTax_ = (TPOS_TAX_DAO)getDAO(TPOS_TAX_DAO.class);
						System.out.println("DAO obtenido");
					} catch (ServiceException e) {
						System.out.println("Excepción obteniendo DAO de TAX");
						e.printStackTrace();
						return false;
					}						
					//TPOS_HEADER tpos_ = (TPOS_HEADER) pHeader_.get(0);
					TPOS_TAX newTpos_ = new  TPOS_TAX_Imp();
					newTpos_.setOFFSETX(voTax_.getOFFSETX());
					newTpos_.setSTORE(voTax_.getSTORE());
					newTpos_.setTERMINAL(voTax_.getTERMINAL());
					newTpos_.setTRANSNUM(voTax_.getTRANSNUM());
					newTpos_.setDAY(voTax_.getDAY());
					newTpos_.setTIME(voTax_.getTIME());
					taxVo_ = daoTax_.findByPK(newTpos_);
					//List lst_ = daoHeader_.selectVO(newTpos_);
					System.out.println("Validó taxes");					
					if (taxVo_!=null && taxVo_.getTRANSNUM()!=null){
						System.out.println("Tax existe");
						answer_ = true;
					}else{
						System.out.println("Tax NO existe");
						return false;
					}
					
					
				   /*list_ = DBUtil.select("count(*) num_reg", 
								   "TPOS_TAX", 
								   "OFFSETX=" + voTax_.getOFFSETX()+" AND " +
								   "STORE=" + vo_.getSTORE()+" AND " +
								   "TERMINAL="+vo_.getTERMINAL()+" AND " + 
								   "TRANSNUM="+vo_.getTRANSNUM()+" AND " +
								   "DAY=TO_DATE('"+StringFormatter.align((vo_.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
												   StringFormatter.align((vo_.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
												   StringFormatter.align(vo_.getDAY().getDate()+"",2,'0',0,2)+" "+
												   StringFormatter.align(vo_.getDAY().getHours()+"",2,'0',0,2)+":"+
												   StringFormatter.align(vo_.getDAY().getMinutes()+"",2,'0',0,2)+":"+
												   StringFormatter.align(vo_.getDAY().getSeconds()+"",2,'0',0,2)+
												   "','yyyy-mm-dd HH24:MI:SS')",
							NumeroRegistros.class, 
							ApplicationResources.TXONLINE_DB);
					*/		
				}else{ // Tiene más de un string de impuestos. No deberia pasar.
					System.out.println("Tiene más de un string de tax");
					list_ = DBUtil.select("count(*) num_reg", 
									"TPOS_TAX", 
									"STORE=" + vo_.getSTORE()+" AND " +
									"TERMINAL="+vo_.getTERMINAL()+" AND " + 
									"TRANSNUM="+vo_.getTRANSNUM()+" AND " +
									"DAY=DATE('"+StringFormatter.align((vo_.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
													StringFormatter.align((vo_.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
													StringFormatter.align(vo_.getDAY().getDate()+"",2,'0',0,2)+" "+
													StringFormatter.align(vo_.getDAY().getHours()+"",2,'0',0,2)+":"+
													StringFormatter.align(vo_.getDAY().getMinutes()+"",2,'0',0,2)+":"+
													StringFormatter.align(vo_.getDAY().getSeconds()+"",2,'0',0,2)+"') AND "+
									"TIME="+vo_.getTIME(),//ECS Select para jt400 DB2
									/*/"DAY=TO_DATE('"+StringFormatter.align((vo_.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
																		StringFormatter.align((vo_.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
																		StringFormatter.align(vo_.getDAY().getDate()+"",2,'0',0,2)+" "+
																		StringFormatter.align(vo_.getDAY().getHours()+"",2,'0',0,2)+":"+
																		StringFormatter.align(vo_.getDAY().getMinutes()+"",2,'0',0,2)+":"+
																		StringFormatter.align(vo_.getDAY().getSeconds()+"",2,'0',0,2)+
																		"','yyyy-mm-dd HH24:MI:SS')",/*/
							 NumeroRegistros.class, 
							 ApplicationResources.TXONLINE_DB);
					System.out.println("Validó taxes");							 
					if (!list_.isEmpty()){
						 reg_ = (NumeroRegistros) list_.get(0);
						 answer_ = reg_.getNum_reg()== pVo.getTax().size();
					}else// La consulta no encontró los registros que estaba buscando.
						return false;	
				}
			}
			if (answer_ && pVo.getTillChange()!=null && !pVo.getTillChange().isEmpty()){ // CACS Pasó la validación de los taxes y hay till changes para validar.
			   //CACS: Verificamos cantidad de till changes
			   /*								 	
			   list_ = DBUtil.select("count(*) num_reg", 
							   "TPOS_TILL_CHANGE", 
							   "STORE=" + vo_.getSTORE()+" AND " +
							   "TERMINAL="+vo_.getTERMINAL()+" AND " + 
							   "TRANSNUM="+vo_.getTRANSNUM()+" AND " +
							   "DAY=TO_DATE('"+StringFormatter.align((vo_.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
											   StringFormatter.align((vo_.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
											   StringFormatter.align(vo_.getDAY().getDate()+"",2,'0',0,2)+" "+
											   StringFormatter.align(vo_.getDAY().getHours()+"",2,'0',0,2)+":"+
											   StringFormatter.align(vo_.getDAY().getMinutes()+"",2,'0',0,2)+":"+
											   StringFormatter.align(vo_.getDAY().getSeconds()+"",2,'0',0,2)+
											   "','yyyy-mm-dd HH24:MI:SS')",
						NumeroRegistros.class, 
						ApplicationResources.TXONLINE_DB);
				   System.out.println("Validó till changes");
				   if (!list_.isEmpty()){
						reg_ = (NumeroRegistros) list_.get(0);
						answer_ = reg_.getNum_reg()== pVo.getTillChange().size();
				   }else// La consulta no encontró los registros que estaba buscando.
					   return false;
				*/

				TPOS_TILL_CHANGE_DAO daoTillChange_ = null;
				try {
					daoTillChange_ = (TPOS_TILL_CHANGE_DAO)getDAO(TPOS_TILL_CHANGE_DAO.class);
				} catch (ServiceException e) {
					System.out.println("Excepción obteniendo DAO de Till Change");
					e.printStackTrace();
					return false;
				}						
				//TPOS_HEADER tpos_ = (TPOS_HEADER) pHeader_.get(0);
				TPOS_TILL_CHANGE newTpos_ = new  TPOS_TILL_CHANGE_Imp();
				//newTpos_.setOFFSETX(vo_.getOFFSETX());
				newTpos_.setSTORE(vo_.getSTORE());
				newTpos_.setTERMINAL(vo_.getTERMINAL());
				newTpos_.setTRANSNUM(vo_.getTRANSNUM());
				newTpos_.setDAY(vo_.getDAY());
				newTpos_.setTIME(vo_.getTIME());
				List lst_ = daoTillChange_.selectVO(newTpos_);
				//List lst_ = daoHeader_.selectVO(newTpos_);
				System.out.println("Validó Till Changes");		
				if (lst_!=null)
					System.out.println("Tamaño lista->"+lst_.size());
				else
					System.out.println("Lista es nula");
					
				if (lst_!=null && lst_.size()  == pVo.getTillChange().size()){
					System.out.println("Till changes completos");
					answer_ = true;
				}else{
					System.out.println("Till changes NO están completos");
					return false;
				}
					   								 	
			}											
		}else{ 
			System.out.println("Transacción no tiene header no debería pasar");
			/*if (((TPOS_HEADER) pVo.getHeader().get(0)).getTRANSTYPE().intValue()==0)
				return false;*/
		}
		System.out.println("Fin valida integridad");
		if (!answer_)
			System.out.println("Falló validación de integridad");
		return answer_;
	}
	
	private boolean isCorrectItemEntryEntriesNumber (TRANSACCION pVo) throws ConnectionFailedException,DBAccessException {
		System.out.println("Validando integridad");
		boolean answer_ = false;
		NumeroRegistros reg_ = null;
		TPOS_HEADER vo_ = null;
		List list_;
		if (pVo.getHeader()!=null && !pVo.getHeader().isEmpty()){
			vo_ = (TPOS_HEADER) pVo.getHeader().get(0);
			if (pVo.getItemEntry()!=null && !pVo.getItemEntry().isEmpty()){
				//vo_ = (TPOS_ITEMENTRY) pVo.getItemEntry().get(0);
				//Connection conn_ = DBUtil.getConn("");
				// CACS: Verificamos cantidad de items entry
				list_ = DBUtil.select("count(*) num_reg", 
						"TPOS_ITEMENTRY", 
								"STORE=" + vo_.getSTORE()+" AND " +
								"TERMINAL="+vo_.getTERMINAL()+" AND " + 
								"TRANSNUM="+vo_.getTRANSNUM()+" AND " +
								"DAY=DATE('"+StringFormatter.align((vo_.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
												StringFormatter.align((vo_.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
												StringFormatter.align(vo_.getDAY().getDate()+"",2,'0',0,2)+" "+
												StringFormatter.align(vo_.getDAY().getHours()+"",2,'0',0,2)+":"+
												StringFormatter.align(vo_.getDAY().getMinutes()+"",2,'0',0,2)+":"+
												StringFormatter.align(vo_.getDAY().getSeconds()+"",2,'0',0,2)+"')",//ECS Select para jt400 DB2
								/*/"DAY=TO_DATE('"+StringFormatter.align((vo_.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
												StringFormatter.align((vo_.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
												StringFormatter.align(vo_.getDAY().getDate()+"",2,'0',0,2)+" "+
												StringFormatter.align(vo_.getDAY().getHours()+"",2,'0',0,2)+":"+
												StringFormatter.align(vo_.getDAY().getMinutes()+"",2,'0',0,2)+":"+
												StringFormatter.align(vo_.getDAY().getSeconds()+"",2,'0',0,2)+
												"','yyyy-mm-dd HH24:MI:SS')",/*/
						 NumeroRegistros.class, 
						 ApplicationResources.TXONLINE_DB);
					 
				if (!list_.isEmpty()){
					 reg_ = (NumeroRegistros) list_.get(0);
					 answer_ = reg_.getNum_reg()== pVo.getItemEntry().size();
				}else // La consulta no encontró los registros que estaba buscando.
					return false;
			}		
		}else{ 
			System.out.println("Transacción no tiene header no debería pasar");
			/*if (((TPOS_HEADER) pVo.getHeader().get(0)).getTRANSTYPE().intValue()==0)
				return false;*/
		}
		System.out.println("Fin valida integridad");
		if (!answer_)
			System.out.println("Falló validación de número de item entries");
		return answer_;
	}
	
	private boolean isCorrectUserDataEntriesNumber (TRANSACCION pVo) throws ConnectionFailedException,DBAccessException {
		System.out.println("Validando integridad de user datas");
		boolean answer_ = false;
		NumeroRegistros reg_ = null;
		TPOS_HEADER vo_ = null;
		List list_;
		if (pVo.getHeader()!=null && !pVo.getHeader().isEmpty()){
			vo_ = (TPOS_HEADER) pVo.getHeader().get(0);
			if (pVo.getUserData()!=null && !pVo.getUserData().isEmpty()){ // CACS Pasó la validación de los item entries y hay user datas para validar.
			   //CACS: Verificamos cantidad de user datas
			   list_ = DBUtil.select("count(*) num_reg", 
							   "TPOS_USER_DATA", 
							   "STORE=" + vo_.getSTORE()+" AND " +
							   "TERMINAL="+vo_.getTERMINAL()+" AND " + 
							   "TRANSNUM="+vo_.getTRANSNUM()+" AND " +
      						   "DAY=DATE('"+StringFormatter.align((vo_.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
											   StringFormatter.align((vo_.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
											   StringFormatter.align(vo_.getDAY().getDate()+"",2,'0',0,2)+" "+
											   StringFormatter.align(vo_.getDAY().getHours()+"",2,'0',0,2)+":"+
											   StringFormatter.align(vo_.getDAY().getMinutes()+"",2,'0',0,2)+":"+
											   StringFormatter.align(vo_.getDAY().getSeconds()+"",2,'0',0,2)+"')",//ECS Select para jt400 DB2
							   /*/"DAY=TO_DATE('"+StringFormatter.align((vo_.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
											   StringFormatter.align((vo_.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
											   StringFormatter.align(vo_.getDAY().getDate()+"",2,'0',0,2)+" "+
											   StringFormatter.align(vo_.getDAY().getHours()+"",2,'0',0,2)+":"+
											   StringFormatter.align(vo_.getDAY().getMinutes()+"",2,'0',0,2)+":"+
											   StringFormatter.align(vo_.getDAY().getSeconds()+"",2,'0',0,2)+
											   "','yyyy-mm-dd HH24:MI:SS')",/*/
						NumeroRegistros.class, 
						ApplicationResources.TXONLINE_DB);
				 
			   if (!list_.isEmpty()){
					reg_ = (NumeroRegistros) list_.get(0);
					answer_ = reg_.getNum_reg()== pVo.getUserData().size();
			   }else // La consulta no encontró los registros que estaba buscando.
				   return false;					 	
			}
		}else{ 
			System.out.println("Transacción no tiene header no debería pasar");
			/*if (((TPOS_HEADER) pVo.getHeader().get(0)).getTRANSTYPE().intValue()==0)
				return false;*/
		}
		System.out.println("Fin valida integridad");
		if (!answer_)
			System.out.println("Falló validación de número de user datas");
		return answer_;
	}

	private boolean insertUserData(TRANSACCION pVo, TransactionDaoGroup group_) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		boolean validatedStringNumber_ = false;
		TPOS_USER_DATA_DAO daoUserData_ = (TPOS_USER_DATA_DAO) DAOLocator.getDAO(TPOS_USER_DATA_DAO.class);
		group_.addDao(daoUserData_);
		for (Iterator iter = pVo.getUserData().iterator(); iter.hasNext();) {
			TPOS_USER_DATA vo_ = (TPOS_USER_DATA) iter.next();
			try{
				//int result_ = daoUserData_.insert(vo_, true);
				int result_ = daoUserData_.insert(vo_, false);//apsm en as400 no puede se transaccional por que requiere que la BD este journalizada
				if (result_<1)
					throw new DBAccessException("Error insertando User Data");			
				//llenarDatosStoreProc(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM(), vo_.getTIPO());
			} catch (DBAccessException e){
				// La razón NO fue porque el registro ya existía en ese caso no lo dejamos continuar
				if (!e.getCause().getLocalizedMessage().startsWith("[SQL0803] Se ha especificado valor de clave duplicada") && !e.getCause().getLocalizedMessage().startsWith("DB2 SQL error: SQLCODE: -803, SQLSTATE: 23505, SQLERRMC: 1")  && !e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
					System.out.println("Este es");
					e.printStackTrace();
					throw e;							
				}else{ // El registro ya existe en la DB se mira si ya están todos los items entries para no continuar. Esta validación solo se
						// hace si es una trx tan grande como para tener más de 10 item entries.
					 System.out.println("Registro user data ya estA en la DB");
					 /*if(!validatedStringNumber_ && pVo.getUserData().size()>10 && isCorrectUserDataEntriesNumber(pVo))
						 return true;
					 else*/
						validatedStringNumber_ = true;
							 
				 }
			}			
		}
		return true;
	}

	private boolean insertTrading(TRANSACCION pVo, TransactionDaoGroup group_) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TPOS_TRADING_STAMPS_DAO daoTrading_ = (TPOS_TRADING_STAMPS_DAO) DAOLocator.getDAO(TPOS_TRADING_STAMPS_DAO.class);
		group_.addDao(daoTrading_);
		for (Iterator iter = pVo.getTradingStamps().iterator(); iter.hasNext();) {
			TPOS_TRADING_STAMPS vo_ = (TPOS_TRADING_STAMPS) iter.next();
			try{
				//int result_ = daoTrading_.insert(vo_, true);
				int result_ = daoTrading_.insert(vo_, false);//apsm en as400 no puede se transaccional por que requiere que la BD este journalizada
				if (result_<1)
					throw new DBAccessException("Error insertando Data Entry");			
				//llenarDatosStoreProc(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM(), vo_.getTIPO());
			} catch (DBAccessException e){
				// La razón NO fue porque el registro ya existía en ese caso no lo dejamos continuar
				if (!e.getCause().getLocalizedMessage().startsWith("[SQL0803] Se ha especificado valor de clave duplicada") && !e.getCause().getLocalizedMessage().startsWith("DB2 SQL error: SQLCODE: -803, SQLSTATE: 23505, SQLERRMC: 1")  && !e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
					e.printStackTrace();					
					System.out.println("Este es");
					throw e;							
				}else
					System.out.println("Registro trading ya estA en la DB");
			}
		}
		return true;
	}

	private boolean insertTill(TRANSACCION pVo, TransactionDaoGroup group_) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TPOS_TILL_CHANGE_DAO daoTill_ = (TPOS_TILL_CHANGE_DAO) DAOLocator.getDAO(TPOS_TILL_CHANGE_DAO.class);
		group_.addDao(daoTill_);
		for (Iterator iter = pVo.getTillChange().iterator(); iter.hasNext();) {
			TPOS_TILL_CHANGE vo_ = (TPOS_TILL_CHANGE) iter.next();
			try{
				//int result_ = daoTill_.insert(vo_, true);
				int result_ = daoTill_.insert(vo_, false);//apsm en as400 no puede se transaccional por que requiere que la BD este journalizada				
				if (result_<1)
					throw new DBAccessException("Error insertando Data Entry");			
				//llenarDatosStoreProc(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM(), vo_.getTIPO());
			} catch (DBAccessException e){
				// La razón NO fue porque el registro ya existía en ese caso no lo dejamos continuar
				if (!e.getCause().getLocalizedMessage().startsWith("[SQL0803] Se ha especificado valor de clave duplicada") && !e.getCause().getLocalizedMessage().startsWith("DB2 SQL error: SQLCODE: -803, SQLSTATE: 23505, SQLERRMC: 1")  && !e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
					e.printStackTrace();					
					System.out.println("Este es");
					throw e;							
				}else
					System.out.println("Registro till ya estA en la DB");
			}				
		}
		return true;
	}

	private boolean insertTender(TRANSACCION pVo, TransactionDaoGroup group_) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TPOS_TENDER_DAO daoTender_ = (TPOS_TENDER_DAO) DAOLocator.getDAO(TPOS_TENDER_DAO.class);
		group_.addDao(daoTender_);
		
		for (Iterator iter = pVo.getTender().iterator(); iter.hasNext();) {
			TPOS_TENDER vo_ = (TPOS_TENDER) iter.next();
			try{
				//int result_ = daoTender_.insert(vo_, true);
				int result_ = daoTender_.insert(vo_, false);// apsm en as400 no puede se transaccional por que requiere que la BD este journalizada
				if (result_<1)
					throw new DBAccessException("Error insertando Data Entry");
				//Double time_ = vo_.getTIME();
				//llenarDatosStoreProc(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), time_!= null ? time_.toString():null, vo_.getTRANSNUM(), vo_.getTIPO());
			} catch (DBAccessException e){
				// La razón NO fue porque el registro ya existía en ese caso no lo dejamos continuar
				if (!e.getCause().getLocalizedMessage().startsWith("[SQL0803] Se ha especificado valor de clave duplicada") && !e.getCause().getLocalizedMessage().startsWith("DB2 SQL error: SQLCODE: -803, SQLSTATE: 23505, SQLERRMC: 1")  && !e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
					e.printStackTrace();					
					System.out.println("Este es");
					throw e;							
				}else
					System.out.println("Registro tender ya estA en la DB");
			}				
		}
		return true;
	}

	private boolean insertTax(TRANSACCION pVo, TransactionDaoGroup group_) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TPOS_TAX_DAO daoTax_ = (TPOS_TAX_DAO) DAOLocator.getDAO(TPOS_TAX_DAO.class);
		group_.addDao(daoTax_);
		for (Iterator iter = pVo.getTax().iterator(); iter.hasNext();) {
			try{
				TPOS_TAX vo_ = (TPOS_TAX) iter.next();
				//int result_ = daoTax_.insert(vo_, true);
				int result_ = daoTax_.insert(vo_, false);// apsm en as400 no puede se transaccional por que requiere que la BD este journalizada
				if (result_<1)
					throw new DBAccessException("Error insertando Tax");
				//llenarDatosStoreProc(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM(), vo_.getTIPO());
			} catch (DBAccessException e){
				// La razón NO fue porque el registro ya existía en ese caso no lo dejamos continuar
				if (!e.getCause().getLocalizedMessage().startsWith("[SQL0803] Se ha especificado valor de clave duplicada") && !e.getCause().getLocalizedMessage().startsWith("DB2 SQL error: SQLCODE: -803, SQLSTATE: 23505, SQLERRMC: 1")  && !e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
					e.printStackTrace();;					
					System.out.println("Este es");
					throw e;							
				}else
					System.out.println("Registro ya estA en la DB");
			}	
		}
		return true;
	}

	private void insertStore(TRANSACCION pVo, TransactionDaoGroup group_) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TPOS_STORE_CLOSING_DAO daoStore_ = (TPOS_STORE_CLOSING_DAO) DAOLocator.getDAO(TPOS_STORE_CLOSING_DAO.class);
		group_.addDao(daoStore_);
		for (Iterator iter = pVo.getStoreClosig().iterator(); iter.hasNext();) {
			TPOS_STORE_CLOSING vo_ = (TPOS_STORE_CLOSING) iter.next();
			//int result_ = daoStore_.insert(vo_, true);
			int result_ = daoStore_.insert(vo_, false);// apsm en as400 no puede se transaccional por que requiere que la BD este journalizada
			if (result_<1)
				throw new DBAccessException("Error insertando Data Entry");
			//llenarDatosStoreProc(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM(), vo_.getTIPO());
		}
	}

	private boolean insertPrice(TRANSACCION pVo, TransactionDaoGroup group_) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TPOS_PRICE_CHANGE_DAO daoPrice_ = (TPOS_PRICE_CHANGE_DAO) DAOLocator.getDAO(TPOS_PRICE_CHANGE_DAO.class);
		group_.addDao(daoPrice_);
		for (Iterator iter = pVo.getPriceChange().iterator(); iter.hasNext();) {
			TPOS_PRICE_CHANGE vo_ = (TPOS_PRICE_CHANGE) iter.next();
			try{
				//int result_ = daoPrice_.insert(vo_, true);
				int result_ = daoPrice_.insert(vo_, false);// apsm en as400 no puede se transaccional por que requiere que la BD este journalizada
				if (result_<1)
					throw new DBAccessException("Error insertando Data Entry");
				//llenarDatosStoreProc(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM(), vo_.getTIPO());
			} catch (DBAccessException e){
				// La razón NO fue porque el registro ya existía en ese caso no lo dejamos continuar
				if (!e.getCause().getLocalizedMessage().startsWith("[SQL0803] Se ha especificado valor de clave duplicada") && !e.getCause().getLocalizedMessage().startsWith("DB2 SQL error: SQLCODE: -803, SQLSTATE: 23505, SQLERRMC: 1")  && !e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
					e.printStackTrace();					
					System.out.println("Este es");
					throw e;							
				}else
					System.out.println("Registro price ya estA en la DB");
			}				
		}
		return true;
	}

	private boolean insertManager(TRANSACCION pVo, TransactionDaoGroup group_) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TPOS_MANAGER_OVERRIDE_DAO daoManager_ = (TPOS_MANAGER_OVERRIDE_DAO) DAOLocator.getDAO(TPOS_MANAGER_OVERRIDE_DAO.class);
		group_.addDao(daoManager_);
		for (Iterator iter = pVo.getManagerOverride().iterator(); iter.hasNext();) {
			TPOS_MANAGER_OVERRIDE vo_ = (TPOS_MANAGER_OVERRIDE) iter.next();
			try{
//				int result_ = daoManager_.insert(vo_, true);
				int result_ = daoManager_.insert(vo_, false);// apsm en as400 no puede se transaccional por que requiere que la BD este journalizada
				if (result_<1)
					throw new DBAccessException("Error insertando Data Entry");
				//llenarDatosStoreProc(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM(), vo_.getTIPO());
			} catch (DBAccessException e){
				// La razón NO fue porque el registro ya existía en ese caso no lo dejamos continuar
				if (!e.getCause().getLocalizedMessage().startsWith("[SQL0803] Se ha especificado valor de clave duplicada") && !e.getCause().getLocalizedMessage().startsWith("DB2 SQL error: SQLCODE: -803, SQLSTATE: 23505, SQLERRMC: 1")  && !e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
					e.printStackTrace();
					System.out.println("Este es");
					throw e;							
				}else
					System.out.println("Registro manager override ya estA en la DB");
			}				
		}
		return true;
	}

	private boolean insertOperator(TRANSACCION pVo, TransactionDaoGroup group_) throws DAOClassNotFoundException, DAOCreationException, ConnectionFailedException, DBAccessException {
		TPOS_OPERATOR_TRAINING_DAO daoOperator_ = (TPOS_OPERATOR_TRAINING_DAO) DAOLocator.getDAO(TPOS_OPERATOR_TRAINING_DAO.class);
		group_.addDao(daoOperator_);
		for (Iterator iter = pVo.getOperatorTraining().iterator(); iter.hasNext();) {
			TPOS_OPERATOR_TRAINING vo_ = (TPOS_OPERATOR_TRAINING) iter.next();
			try{			
				//int result_ = daoOperator_.insert(vo_, true);
				int result_ = daoOperator_.insert(vo_, false);// apsm en as400 no puede se transaccional por que requiere que la BD este journalizada
				if (result_<1)
					throw new DBAccessException("Error insertando Data Entry");
				//llenarDatosStoreProc(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM(), vo_.getTIPO());
			} catch (DBAccessException e){
				// La razón NO fue porque el registro ya existía en ese caso no lo dejamos continuar
				if (!e.getCause().getLocalizedMessage().startsWith("[SQL0803] Se ha especificado valor de clave duplicada") && !e.getCause().getLocalizedMessage().startsWith("DB2 SQL error: SQLCODE: -803, SQLSTATE: 23505, SQLERRMC: 1")  && !e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
					e.printStackTrace();					
					System.out.println("Este es");
					throw e;							
				}else
					System.out.println("Registro operator ya estA en la DB");
			}				
		}
		return true;
	}

	private boolean insertItemRecord(TRANSACCION pVo, TransactionDaoGroup group_) throws ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		TPOS_ITEM_RECORD_CHANGE_DAO daoItemRecord_ = (TPOS_ITEM_RECORD_CHANGE_DAO) DAOLocator.getDAO(TPOS_ITEM_RECORD_CHANGE_DAO.class);
		group_.addDao(daoItemRecord_);
		for (Iterator iter = pVo.getItemRecordChange().iterator(); iter.hasNext();) {
			TPOS_ITEM_RECORD_CHANGE vo_ = (TPOS_ITEM_RECORD_CHANGE) iter.next();
			try{
				//int result_ = daoItemRecord_.insert(vo_, true);
				int result_ = daoItemRecord_.insert(vo_, false);// apsm en as400 no puede se transaccional por que requiere que la BD este journalizada
				if (result_<1)
					throw new DBAccessException("Error insertando Data Entry");
				//llenarDatosStoreProc(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM(), vo_.getTIPO());
			} catch (DBAccessException e){
				// La razón NO fue porque el registro ya existía en ese caso no lo dejamos continuar
				if (!e.getCause().getLocalizedMessage().startsWith("[SQL0803] Se ha especificado valor de clave duplicada") && !e.getCause().getLocalizedMessage().startsWith("DB2 SQL error: SQLCODE: -803, SQLSTATE: 23505, SQLERRMC: 1")  && !e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
					e.printStackTrace();
					System.out.println("Este es");
					throw e;							
				}else
					System.out.println("Registro item record ya estA en la DB");
			}				
		}
		return true;
	}

	private void insertException(TRANSACCION pVo, TransactionDaoGroup group_) throws ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		TPOS_EXCEPTION_LOG_DAO daoException_ = (TPOS_EXCEPTION_LOG_DAO) DAOLocator.getDAO(TPOS_EXCEPTION_LOG_DAO.class);
		group_.addDao(daoException_);
		for (Iterator iter = pVo.getExceptionLog().iterator(); iter.hasNext();) {
			TPOS_EXCEPTION_LOG vo_ = (TPOS_EXCEPTION_LOG) iter.next();
			try{
				//int result_ = daoException_.insert(vo_, true);
				int result_ = daoException_.insert(vo_, false);// apsm en as400 no puede se transaccional por que requiere que la BD este journalizada
				if (result_<1)
					throw new DBAccessException("Error insertando Exception");			
				//llenarDatosStoreProc(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM(), vo_.getTIPO());
			} catch (DBAccessException e){
				// La razón NO fue porque el registro ya existía en ese caso no lo dejamos continuar
				if (!e.getCause().getLocalizedMessage().startsWith("[SQL0803] Se ha especificado valor de clave duplicada") && !e.getCause().getLocalizedMessage().startsWith("DB2 SQL error: SQLCODE: -803, SQLSTATE: 23505, SQLERRMC: 1")  && !e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
					e.printStackTrace();					
					System.out.println("Este es");
					throw e;							
				}else
					System.out.println("Registro exception ya estA en la DB");
			}				
		}
	}

	private boolean insertDiscount(TRANSACCION pVo, TransactionDaoGroup group_) throws ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		TPOS_DISCOUNT_DAO daoDiscount_ = (TPOS_DISCOUNT_DAO) DAOLocator.getDAO(TPOS_DISCOUNT_DAO.class);
		group_.addDao(daoDiscount_);
		for (Iterator iter = pVo.getDiscount().iterator(); iter.hasNext();) {
			TPOS_DISCOUNT vo_ = (TPOS_DISCOUNT) iter.next();
			try{
				//int result_ = daoDiscount_.insert(vo_, true);
				int result_ = daoDiscount_.insert(vo_, false);//apsm en as400 no puede se transaccional por que requiere que la BD este journalizada
				//Double time_ = vo_.getTIME();
				if (result_<1)
					throw new DBAccessException("Error insertando Data Entry");			
				//llenarDatosStoreProc(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), time_!=null?time_.toString():null, vo_.getTRANSNUM(), vo_.getTIPO());
			} catch (DBAccessException e){
				// La razón NO fue porque el registro ya existía en ese caso no lo dejamos continuar
				if (!e.getCause().getLocalizedMessage().startsWith("[SQL0803] Se ha especificado valor de clave duplicada") && !e.getCause().getLocalizedMessage().startsWith("DB2 SQL error: SQLCODE: -803, SQLSTATE: 23505, SQLERRMC: 1") && !e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
					e.printStackTrace();
					System.out.println("Este es");
					throw e;							
				}else
					System.out.println("Registro ya estA en la DB");
			}				
		}
		return true;
	}

	private boolean insertDataEntry(TRANSACCION pVo, TransactionDaoGroup group_) throws ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		TPOS_DATA_ENTRY_DAO daoDataEntry_ = (TPOS_DATA_ENTRY_DAO) DAOLocator.getDAO(TPOS_DATA_ENTRY_DAO.class);
		group_.addDao(daoDataEntry_);
		for (Iterator iter = pVo.getDataEntry().iterator(); iter.hasNext();) {
			TPOS_DATA_ENTRY vo_ = (TPOS_DATA_ENTRY) iter.next();
			try{
				//int result_ = daoDataEntry_.insert(vo_, true);
				int result_ = daoDataEntry_.insert(vo_, false);//apsm en as400 no puede se transaccional por que requiere que la BD este journalizada
				if (result_<1)
					throw new DBAccessException("Error insertando Data Entry");			
			} catch (DBAccessException e){
				// La razón NO fue porque el registro ya existía en ese caso no lo dejamos continuar
				if (!e.getCause().getLocalizedMessage().startsWith("[SQL0803] Se ha especificado valor de clave duplicada") && !e.getCause().getLocalizedMessage().startsWith("DB2 SQL error: SQLCODE: -803, SQLSTATE: 23505, SQLERRMC: 1") && !e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
					e.printStackTrace();
					System.out.println("Este es");
					throw e;							
				}else
					System.out.println("Registro data entry ya estA en la DB");
			}
		}
		return true;
	}

	private boolean insertItemEntry(TRANSACCION pVo, TransactionDaoGroup group_) throws ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		boolean validatedStringNumber_ = false; // Indica si ya se hizo una validación del número de item entries para esta transacción.
		TPOS_ITEMENTRY_DAO daoItemEntry_ = (TPOS_ITEMENTRY_DAO) DAOLocator.getDAO(TPOS_ITEMENTRY_DAO.class);
		group_.addDao(daoItemEntry_);
		if (pVo.getItemEntry().size()>20)
			System.out.println("Esta es una trx grande");
		for (Iterator iter = pVo.getItemEntry().iterator(); iter.hasNext();) {
			TPOS_ITEMENTRY vo_ = (TPOS_ITEMENTRY) iter.next();
			try{
//				int result_ = daoItemEntry_.insert(vo_, true);
				int result_ = daoItemEntry_.insert(vo_, false);// apsm en as400 no puede se transaccional por que requiere que la BD este journalizada
				if (result_<1){
					throw new DBAccessException("Error insertando Item Entry");
				}
			} catch (DBAccessException e){
				// La razón NO fue porque el registro ya existía en ese caso no lo dejamos continuar
				System.out.println("e.getCause().getLocalizedMessage()->"+e.getCause().getLocalizedMessage());
				if (!e.getCause().getLocalizedMessage().startsWith("[SQL0803] Se ha especificado valor de clave duplicada") && !e.getCause().getLocalizedMessage().startsWith("DB2 SQL error: SQLCODE: -803, SQLSTATE: 23505, SQLERRMC: 1") && !e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
					e.printStackTrace();
					System.out.println("Este es");
					throw e;							
				}else{ // El registro ya existe en la DB se mira si ya están todos los items entries para no continuar. Esta validación solo se
					   // hace si es una trx tan grande como para tener más de 10 item entries.
					System.out.println("Registro ya estA en la DB");
					if(!validatedStringNumber_ && pVo.getItemEntry().size()>10 && isCorrectItemEntryEntriesNumber(pVo))
						return true;
					else
					   validatedStringNumber_ = true;						
					 
				}
			}
			//llenarDatosStoreProc(vo_.getDAY(), vo_.getSTORE(), vo_.getTERMINAL(), vo_.getTIME(), vo_.getTRANSNUM(), vo_.getTIPO());
		}
		return true;
	}
	
	
	private boolean fillItemEntryTaxesAdditionalData(TRANSACCION pVo) throws ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		//boolean validatedStringNumber_ = false; // Indica si ya se hizo una validación del número de item entries para esta transacción.
		for (Iterator iter = pVo.getItemEntry().iterator(); iter.hasNext();) {
			TPOS_ITEMENTRY currItmVo_ = (TPOS_ITEMENTRY) iter.next();
			System.out.println("Item code IE->"+currItmVo_.getITEMCODE().toString());
			double dIEEntryQuantity_ = 0;
			double dIEUnitPrice_ = 0;
			double dIEEntryAmount_ = 0;
			try{
				if(currItmVo_.getQTYORWGT().doubleValue() == 0){
					dIEEntryQuantity_ = 1;
				}else{
					dIEEntryQuantity_ = currItmVo_.getQTYORWGT().doubleValue();
				}	
			}catch(Exception e){e.printStackTrace();}
			try{
				if(currItmVo_.getQTYORWGT().doubleValue() == 0){
					dIEUnitPrice_ = currItmVo_.getXPRICE().doubleValue();
				}else{
					dIEUnitPrice_ = currItmVo_.getSALEPRICE().doubleValue();
				}	
			}catch(Exception e){e.printStackTrace();}
			try{
				dIEEntryAmount_ = currItmVo_.getXPRICE().doubleValue(); 
			}catch(Exception e){e.printStackTrace();}				
			String operation_ = "00";
			if(currItmVo_.getINDICAT31()!=null && (currItmVo_.getINDICAT31().equals("2") || currItmVo_.getINDICAT31().equals("8"))){
				operation_ = "01";
				//System.out.println("udVo_.getDATA11()->"+udVo_.getDATA11());	
			}			
			boolean exit_ = false;
			for (Iterator udIter = pVo.getUserData().iterator(); udIter.hasNext() && !exit_;) {
				TPOS_USER_DATA udVo_ = (TPOS_USER_DATA) udIter.next();
				if(udVo_ != null && udVo_.getDATA1() != null && udVo_.getDATA1().equals(ITEM_TAXES_ADDIONAL_INFO_USER_DATA)){
					double dUdItemCode_ = 0;
					double dUdUnitPrice_ = 0;
					
					// Cantidad en la entrada
					double dUdEntryQuantity_ = 0;
					

					// Precio total entrada
					double dUdEntryAmount_ = 0;
					
					
					try{
						dUdItemCode_ = Double.parseDouble(udVo_.getDATA2());
					}catch(Exception e){e.printStackTrace();}
					try{
						dUdUnitPrice_ = Double.parseDouble(udVo_.getDATA3());
					}catch(Exception e){e.printStackTrace();}

					try{
						dUdEntryQuantity_ = Double.parseDouble(udVo_.getDATA5());
					}catch(Exception e){e.printStackTrace();}					

					

					try{
						dUdEntryAmount_ = Double.parseDouble(udVo_.getDATA4());
						//System.out.println("udVo_.getDATA4()->"+udVo_.getDATA4());
						//System.out.println("udVo_.getDATA11()->"+udVo_.getDATA11());
						//if(udVo_.getDATA4().equals("0135700"))
							//System.out.println("Este parece ser");
						// Intento de ajuste para datos mal guardados(Signo en dato que debe ser positivo)
						// Almacén 515 Terminal: 7 Trx: 93 Fechahora: 2023-03-09 12:44 
						if(dUdEntryAmount_ != dIEEntryAmount_ && operation_.equals("01") && udVo_.getDATA4().length()>2 && (udVo_.getDATA4().startsWith("13") || udVo_.getDATA4().startsWith("013"))){
							
							double dTmpUdEntryAmount_ = 0;
							if(udVo_.getDATA4().startsWith("13"))
								dTmpUdEntryAmount_ = Double.parseDouble(udVo_.getDATA4().substring(2));
							else if(udVo_.getDATA4().startsWith("013")) 
								dTmpUdEntryAmount_ = Double.parseDouble(udVo_.getDATA4().substring(3));
							if(dTmpUdEntryAmount_ == dIEEntryAmount_)
								dUdEntryAmount_ = dTmpUdEntryAmount_;
						}	
						 
					}catch(Exception e){e.printStackTrace();}					
										
						
					//System.out.println("Item code UD->"+dUdItemCode_+" Precio unitario IE->"+dIEUnitPrice_+" Precio unitario UD->"+dUdUnitPrice_+" INDICAT17->"+currItmVo_.getINDICAT17()+" udVo_.getDATA11()->"+udVo_.getDATA11());
						
					if (currItmVo_.getITEMCODE().doubleValue() == dUdItemCode_ && dUdEntryQuantity_ == dIEEntryQuantity_ && dUdEntryAmount_ == dIEEntryAmount_ &&
						operation_.equals(udVo_.getDATA11()) && 
						(dIEUnitPrice_ == dUdUnitPrice_ /*|| currItmVo_.getINDICAT17().equals("1")*/)){ // Indicat 17 = 1 es pesable
						System.out.println("EncontrO el Item");
						int iVATTaxRate_ = 0;
						double dConsumTaxRate_ = 0;
						//String exenExcludFlag_ = "0";// Excento
						
						double dVATBaseValue_ = 0;
						double dVATValue_ = 0;
						
						try{
							iVATTaxRate_ = Integer.parseInt(udVo_.getDATA6());
						}catch(Exception e){e.printStackTrace();}
	
						try{
							dConsumTaxRate_ = Double.parseDouble(udVo_.getDATA7());
						}catch(Exception e){e.printStackTrace();}				
						/*
						String measureUnit_ = udVo_.getDATA8();
						if(measureUnit_.length()>3)
							measureUnit_ = measureUnit_.substring(0,3);
						currItmVo_.setUNIDMEDIDA(measureUnit_);
						*/
						String excepmtExcludedFlag_ = udVo_.getDATA8();
						if (excepmtExcludedFlag_ != null && excepmtExcludedFlag_.equals("01"))
							currItmVo_.setTIPO("1"); //Excluído
						else
							currItmVo_.setTIPO("0"); //Excento

						try{
							dVATBaseValue_ = Double.parseDouble(udVo_.getDATA9());
						}catch(Exception e){e.printStackTrace();}
						
						try{
							dVATValue_ = Double.parseDouble(udVo_.getDATA10());
						}catch(Exception e){e.printStackTrace();}									

						if(operation_.equals("01") && udVo_.getDATA9().length()>2){
							System.out.println("Es una anulaciOn o devoluciOn");
							if(dIEEntryAmount_ != (dVATBaseValue_ + dVATValue_)){
								System.out.println("La suma no coincide. Se valida sI el dato estA con negativos");
								double dTmpUdVATBaseAmount_ = dVATBaseValue_;
								if(udVo_.getDATA9().startsWith("13") || udVo_.getDATA9().startsWith("013")){
									dTmpUdVATBaseAmount_ = 0;
									if(udVo_.getDATA9().startsWith("13"))
										dTmpUdVATBaseAmount_ = Double.parseDouble(udVo_.getDATA9().substring(2));
									else if(udVo_.getDATA9().startsWith("013")) 
										dTmpUdVATBaseAmount_ = Double.parseDouble(udVo_.getDATA9().substring(3));
									//if(dTmpUdEntryAmount_ == dIEEntryAmount_)
										//dUdEntryAmount_ = dTmpUdEntryAmount_;
								}
								double dTmpUdVATAmount_ = dVATValue_;
								if(udVo_.getDATA10().length()>2 && (udVo_.getDATA10().startsWith("13") || udVo_.getDATA10().startsWith("013"))){
									dTmpUdVATAmount_ = 0;
									if(udVo_.getDATA10().startsWith("13"))
										dTmpUdVATAmount_ = Double.parseDouble(udVo_.getDATA10().substring(2));
									else if(udVo_.getDATA10().startsWith("013")) 
										dTmpUdVATAmount_ = Double.parseDouble(udVo_.getDATA10().substring(3));
									//if(dTmpUdEntryAmount_ == dIEEntryAmount_)
										//dUdEntryAmount_ = dTmpUdEntryAmount_;
								}
								if(dIEEntryAmount_ == (dTmpUdVATBaseAmount_ + dTmpUdVATAmount_)){
									System.out.println("TransformaciOn de negativos a positivos correcta");
									dVATBaseValue_ = dTmpUdVATBaseAmount_;
									dVATValue_ = dTmpUdVATAmount_;
								}else
									System.out.println("No se pudo ajustar el valor transformando valores de negativos a positivos");
								
							}else
								System.out.println("La suma coincide");
						}
							
						//
						currItmVo_.setPRCIVA(new Double(iVATTaxRate_));
						currItmVo_.setIMPCONRATE(new Double(dConsumTaxRate_));
						
						currItmVo_.setVATTAXAMT(new Double(dVATValue_));
						currItmVo_.setVATBASEAMT(new Double(dVATBaseValue_));
						
						//currItmVo_.setDESCUENTO(new Double(dDiscount_));
						exit_ = true;							
					}
				}		
			}			
		}
		return true;
	}	
	
	private boolean fillItemEntryAdditionalData(TRANSACCION pVo) throws ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		boolean validatedStringNumber_ = false; // Indica si ya se hizo una validación del número de item entries para esta transacción.
		for (Iterator iter = pVo.getItemEntry().iterator(); iter.hasNext();) {
			TPOS_ITEMENTRY currItmVo_ = (TPOS_ITEMENTRY) iter.next();
			System.out.println("Item code IE->"+currItmVo_.getITEMCODE().toString());
			boolean exit_ = false;
			for (Iterator udIter = pVo.getUserData().iterator(); udIter.hasNext() && !exit_;) {
				TPOS_USER_DATA udVo_ = (TPOS_USER_DATA) udIter.next();
				if(udVo_ != null && udVo_.getDATA1() != null && udVo_.getDATA1().equals(ITEM_ADDIONAL_INFO_USER_DATA)){
					double dUdItemCode_ = 0;
					double dUdUnitPrice_ = 0;
					double dIEUnitPrice_ = 0;
					try{
						dUdItemCode_ = Double.parseDouble(udVo_.getDATA2());
					}catch(Exception e){e.printStackTrace();}
					try{
						dUdUnitPrice_ = Double.parseDouble(udVo_.getDATA3());
					}catch(Exception e){e.printStackTrace();}
					try{
						if(currItmVo_.getQTYORWGT().doubleValue() == 0){
							dIEUnitPrice_ = currItmVo_.getXPRICE().doubleValue();
						}else{
							dIEUnitPrice_ = currItmVo_.getSALEPRICE().doubleValue();
						}	
					}catch(Exception e){e.printStackTrace();}						
						
					//System.out.println("Item code UD->"+dUdItemCode_+" Precio unitario IE->"+dIEUnitPrice_+" Precio unitario UD->"+dUdUnitPrice_+" INDICAT17->"+currItmVo_.getINDICAT17());	
					if (currItmVo_.getITEMCODE().doubleValue() == dUdItemCode_ && (dIEUnitPrice_ == dUdUnitPrice_ || currItmVo_.getINDICAT17().equals("1"))){
						System.out.println("EncontrO el Item");
						int iVATTaxRate_ = 0;
						double dDiscount_ = 0;
						double dConsumTaxRate_ = 0;
						try{
							iVATTaxRate_ = Integer.parseInt(udVo_.getDATA5());
						}catch(Exception e){e.printStackTrace();}
	
						try{
							dDiscount_ = Double.parseDouble(udVo_.getDATA10());
						}catch(Exception e){e.printStackTrace();}
	
						try{
							dConsumTaxRate_ = Double.parseDouble(udVo_.getDATA7());
						}catch(Exception e){e.printStackTrace();}				
				
						String measureUnit_ = udVo_.getDATA8();
						if(measureUnit_.length()>3)
							measureUnit_ = measureUnit_.substring(0,3);
						currItmVo_.setUNIDMEDIDA(measureUnit_);
						String excepmtExcludedFlag_ = udVo_.getDATA6();
						if (excepmtExcludedFlag_ != null && excepmtExcludedFlag_.equals("01"))
							currItmVo_.setTIPO("1");
						else
							currItmVo_.setTIPO("0");
						
						// 26 Octubre 2023 Control cambios ICUI
						double dIcuiTaxRate_ = 0;	
						try{
							System.out.println("ICUI Tax Rate->"+udVo_.getDATA12());
							dIcuiTaxRate_ = Double.parseDouble(udVo_.getDATA12());
						}catch(Exception e){e.printStackTrace();}							
						currItmVo_.setICUITAXRATE(new Double(dIcuiTaxRate_));
						
						//String sectionDepartment_ = currItmAddInfReg_.getData9();
						double dSectionDepartment_ = 0;	
						try{
							System.out.println("SecciOn departamento desde user data->"+udVo_.getDATA9());
							dSectionDepartment_ = Double.parseDouble(udVo_.getDATA9());
						}catch(Exception e){e.printStackTrace();}							
						currItmVo_.setFAMILYNU1(new Double(dSectionDepartment_));
							
							
						//
						currItmVo_.setPRCIVA(new Double(iVATTaxRate_));
						
						currItmVo_.setIMPCONRATE(new Double(dConsumTaxRate_));
						
						currItmVo_.setDESCUENTO(new Double(dDiscount_));
						exit_ = true;							
					}
				}		
			}			
			
			//try{

			
			/*} catch (DBAccessException e){
				// La razón NO fue porque el registro ya existía en ese caso no lo dejamos continuar
				System.out.println("e.getCause().getLocalizedMessage()->"+e.getCause().getLocalizedMessage());
				if (!e.getCause().getLocalizedMessage().startsWith("[SQL0803] Se ha especificado valor de clave duplicada") && !e.getCause().getLocalizedMessage().startsWith("DB2 SQL error: SQLCODE: -803, SQLSTATE: 23505, SQLERRMC: 1") && !e.getCause().getLocalizedMessage().startsWith("ORA-00001")){
					e.printStackTrace();
					System.out.println("Este es");
					throw e;							
				}else{ // El registro ya existe en la DB se mira si ya están todos los items entries para no continuar. Esta validación solo se
					   // hace si es una trx tan grande como para tener más de 10 item entries.
					System.out.println("Registro ya estA en la DB");
					if(!validatedStringNumber_ && pVo.getItemEntry().size()>10 && isCorrectItemEntryEntriesNumber(pVo))
						return true;
					else
					   validatedStringNumber_ = true;						
					 
				}
			}*/
		}
		return true;
	}
	
	private int deleteItemEntries(TRANSACCION pVo) throws ServiceException, ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		int result_ = 0;
		if (pVo.getItemEntry().get(0)!=null) {
			TPOS_ITEMENTRY vo_ = (TPOS_ITEMENTRY) pVo.getItemEntry().get(0);
			result_ = deleteItemEntries(vo_);
		}
		return result_;
	}	

	private void deleteDataEntries(TRANSACCION pVo) throws ServiceException, ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		int result_ = 0;
		if (pVo.getDataEntry()!=null && pVo.getDataEntry().size()>0) {
			TPOS_DATA_ENTRY vo_ = (TPOS_DATA_ENTRY) pVo.getDataEntry().get(0);
			//int result_ = daoItemEntry_.delete(vo_);
			result_ = deleteDataEntries(vo_);
		}
	}

	private void deleteDiscounts(TRANSACCION pVo) throws ServiceException, ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		int result_ = 0;
		if (pVo.getDiscount()!= null && pVo.getDiscount().size()>0) {
			TPOS_DISCOUNT vo_ = (TPOS_DISCOUNT) pVo.getDiscount().get(0);
			//int result_ = daoItemEntry_.delete(vo_);
			result_ = deleteDiscounts(vo_);
		}
	}
		
	private void deleteItemRecordChanges(TRANSACCION pVo) throws ServiceException, ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		int result_ = 0;
		if (pVo.getItemRecordChange()!=null && pVo.getItemRecordChange().size()>0) {
			TPOS_ITEM_RECORD_CHANGE vo_ = (TPOS_ITEM_RECORD_CHANGE) pVo.getItemRecordChange().get(0);
			//int result_ = daoItemEntry_.delete(vo_);
			result_ = deleteItemRecordChanges(vo_);
		}
	}
			
	private void deleteManagerOverrides(TRANSACCION pVo) throws ServiceException, ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		int result_ = 0;
		if (pVo.getManagerOverride()!=null && pVo.getManagerOverride().size()>0) {
			TPOS_MANAGER_OVERRIDE vo_ = (TPOS_MANAGER_OVERRIDE) pVo.getManagerOverride().get(0);
			//int result_ = daoItemEntry_.delete(vo_);
			result_ = deleteManagerOverrides(vo_);
		}
	}

	private void deleteOperatorTrainings(TRANSACCION pVo) throws ServiceException, ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		int result_ = 0;
		if (pVo.getOperatorTraining()!=null && pVo.getOperatorTraining().size()>0) {
			TPOS_OPERATOR_TRAINING vo_ = (TPOS_OPERATOR_TRAINING) pVo.getOperatorTraining().get(0);
			//int result_ = daoItemEntry_.delete(vo_);
			result_ = deleteOperatorTrainings(vo_);
		}
	}
					
	private void deletePriceChanges(TRANSACCION pVo) throws ServiceException, ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		int result_ = 0;
		if (pVo.getPriceChange()!=null && pVo.getPriceChange().size()>0) {
			TPOS_PRICE_CHANGE vo_ = (TPOS_PRICE_CHANGE) pVo.getPriceChange().get(0);
			//int result_ = daoItemEntry_.delete(vo_);
			result_ = deletePriceChanges(vo_);
		}
	}
	
	private void deleteUserDatas(TRANSACCION pVo) throws ServiceException, ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		int result_ = 0;
		if (pVo.getUserData()!=null && pVo.getUserData().size()>0) {
			TPOS_USER_DATA vo_ = (TPOS_USER_DATA) pVo.getUserData().get(0);
			//int result_ = daoItemEntry_.delete(vo_);
			result_ = deleteUserDatas(vo_);
		}
	}	
	
	private void deleteTaxes(TRANSACCION pVo) throws ServiceException, ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		int result_ = 0;
		if (pVo.getTax()!=null && pVo.getTax().size()>0) {
			TPOS_TAX vo_ = (TPOS_TAX) pVo.getTax().get(0);
			//int result_ = daoItemEntry_.delete(vo_);
			result_ = deleteTaxes(vo_);
		}
	}
		
	private void deleteTenders(TRANSACCION pVo) throws ServiceException, ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		int result_ = 0;
		if (pVo.getTender()!=null && pVo.getTender().size()>0) {
			TPOS_TENDER vo_ = (TPOS_TENDER) pVo.getTender().get(0);
			//int result_ = daoItemEntry_.delete(vo_);
			result_ = deleteTenders(vo_);
		}
	}
			
	private void deleteTillChanges(TRANSACCION pVo) throws ServiceException, ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		int result_ = 0;
		if (pVo.getTillChange()!=null && pVo.getTillChange().size()>0) {
			TPOS_TILL_CHANGE vo_ = (TPOS_TILL_CHANGE) pVo.getTillChange().get(0);
			//int result_ = daoItemEntry_.delete(vo_);
			result_ = deleteTillChanges(vo_);
		}
	}
	
	private void deleteTradingStamps(TRANSACCION pVo) throws ServiceException, ConnectionFailedException, DBAccessException, DAOClassNotFoundException, DAOCreationException {
		int result_ = 0;
		if (pVo.getTradingStamps()!=null && pVo.getTradingStamps().size()>0) {
			TPOS_TRADING_STAMPS vo_ = (TPOS_TRADING_STAMPS) pVo.getTradingStamps().get(0);
			//int result_ = daoItemEntry_.delete(vo_);
			result_ = deleteTradingStamps(vo_);
		}
	}

	public int deleteUserDatas(TPOS_USER_DATA pVo) throws /*ServiceException,*/DBAccessException,ConnectionFailedException {
		int result_ = 0;
		String where_ = "STORE="+pVo.getSTORE()+" AND " +
						"TERMINAL="+pVo.getTERMINAL()+" AND " + 
						"TRANSNUM="+pVo.getTRANSNUM()+" AND " +
		 				"DAY=DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+"')";//ECS Select para jt400 DB2
						/*/"DAY=TO_DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+
										"','yyyy-mm-dd HH24:MI:SS')";/*/
							//pRecord,FIELD_SEPARATOR + FIELD_SEPARATOR,FIELD_SEPARATOR + NULL_STRING + FIELD_SEPARATOR) + (pRecord.endsWith(FIELD_SEPARATOR) ? NULL_STRING : "");
			//StringFormatter.align(String.valueOf(cal_.get(Calendar.DAY_OF_YEAR)),3,'0',0,3)
		result_ = DBUtil.delete("TPOS_USER_DATA",where_);
		return result_;
	}					

	private void makeRollBack(TransactionDaoGroup group_, Exception e) throws ServiceException {
		
			try {
				if (group_ != null && group_.getGroupConn()!=null)
					group_.rollBack();
			} catch (DBAccessException e1) {
				LogWriter.getLog().log(this, LogWriter.SEVERE, "En [makeRollBack(...)]:" + e.getMessage(), e);
				throw new ServiceException("DBAccessException","error.generic.connection_failed", e);
			}
	}

	/*private void invocarProcedimientoCargue(Connection connection, String pNombre, TPOS_ITEMENTRY pItem) throws StoreProcedureException  {
		CallableStatement cs;
		//		Call a procedure with one IN parameter
		try {
			cs = connection.prepareCall("{call " + pNombre + "(?,?,?,?,?,?)}");

			if (pItem != null)
				cs.setDouble(5, pItem.getITEMCODE().doubleValue());
			else
				cs.setNull(5, Types.DOUBLE);

			//Set the value for the IN parameter
			if (day != null)
				cs.setDate(1, new Date(day.getTime()));
			else 
				cs.setNull(1, Types.TIMESTAMP);
			
			if (store != null)
				cs.setDouble(2, store.doubleValue());
			else
				cs.setNull(2, Types.DOUBLE);
			
			if (terminal != null)
				cs.setDouble(3, terminal.doubleValue());
			else
				cs.setNull(3, Types.DOUBLE);
			
			if (transnum != null)
				cs.setDouble(4, transnum.doubleValue());
			else
				cs.setNull(4, Types.DOUBLE);
			
			if (tipo != null)
				cs.setString(6, tipo);
			else
				cs.setNull(6, Types.VARCHAR);
			// Execute the stored procedure
			cs.execute();
		} catch (SQLException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [invocarProcedimientoCargue(...)]:" + e.getMessage(), e);
			throw new StoreProcedureException ("StoreProcedureException", e);
		}

	}*/

	/*private List invocarFuncionValidacion(Connection connection, String pNombre) throws StoreProcedureException  {
		List retList_ = new ArrayList(2);
		CallableStatement cs;
		//Call a procedure with one IN parameter
		try {
			cs = connection.prepareCall("{? = call " + pNombre + "(?,?,?,?,?)}");
			//	Set the value for the IN parameter
			if (day != null)
				cs.setDate(2, new Date(day.getTime()));
			else
				cs.setNull(2, Types.TIMESTAMP);
			
			if (store != null)	
				cs.setDouble(3, store.doubleValue());
			else 
				cs.setNull(3, Types.DOUBLE);
			
			if( terminal != null)
				cs.setDouble(4, terminal.doubleValue());
			else
				cs.setNull(4, Types.DOUBLE);
			
			if (transnum!=null)
				cs.setDouble(5, transnum.doubleValue());
			else
				cs.setNull(5, Types.DOUBLE);

			//parametros de salida
			cs.registerOutParameter(1, Types.NUMERIC);
			cs.registerOutParameter(6, Types.VARCHAR);
			// Execute the stored procedure
			cs.execute();
			int retValue_ = cs.getInt(1);
			String retMensaje_ = cs.getString(6);

			retList_.add(new Integer(retValue_));
			retList_.add(retMensaje_);

		} catch (SQLException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [invocarProcedimientoValidacion(...)]:" + e.getMessage(), e);
			throw new StoreProcedureException ("StoreProcedureException", e);
		}
		return retList_;

	}*/

	private void invocarProcedimientoDB(Connection connection) throws StoreProcedureException {
		CallableStatement cs;
		try {
			cs = connection.prepareCall("{? = call GET_HEADERS}");

			// Register the type of the return value
			cs.registerOutParameter(1, Types.INTEGER);

			// Execute and retrieve the returned value
			cs.execute();
			String retValue = cs.getString(1);

			int i = retValue.length();
		} catch (SQLException e) {
			throw new StoreProcedureException ("StoreProcedureException", e);
		}

	}
	

	/*private void llenarDatosStoreProc(Timestamp pDay, Double pStore, Double pTerminal, String pTime, Double pTransnum, String pTipo) {
		if (day==null || store==null || terminal ==null || time ==null || transnum==null){		
			day = pDay;
			store = pStore;
			terminal = pTerminal;
			time =pTime;
			transnum = pTransnum;
			tipo = pTipo;
		}
	}*/
	
	public List getTransRecibidas() throws ServiceException {
		//@ TODO hacer consulta real
		adapter_ = new ApplicationConfigFacadeAdapter();
		TX_RECHAZO vo_ = new TX_RECHAZO_Imp();
		try {	
			return DBUtil.select("*", 
				adapter_.getDBTrxOnlineOwner() + "TX_RECHAZO R,"+adapter_.getAsicGOwner()+"TPOS_HEADER H", 
				 "R.STORE = H.STORE",
			TX_RECHAZO_Imp.class, 
				 ApplicationResources.TXONLINE_DB);			
		} catch (ConnectionFailedException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getTransRecibidas(...)]:" + e.getMessage(), e);
			throw new ServiceException("",	"error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getTransRecibidas(...)]:" + e.getMessage(), e);
			throw new ServiceException("",	"error.generic.dbaccess_failed", e);
		}
	}
	
	public int deleteItemEntries(TPOS_ITEMENTRY pVo) throws ServiceException {
		int result_ = 0;
		try {
			String where_ = "STORE="+pVo.getSTORE()+" AND " +
							"TERMINAL="+pVo.getTERMINAL()+" AND " + 
							"TRANSNUM="+pVo.getTRANSNUM()+" AND " +
							"DAY=DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
											StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
											StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
											StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
											StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
											StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+"')";//ECS Select para jt400 DB2
							/*/"DAY=TO_DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
											StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
											StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
											StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
											StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
											StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+
											"','yyyy-mm-dd HH24:MI:SS')";/*/
							//pRecord,FIELD_SEPARATOR + FIELD_SEPARATOR,FIELD_SEPARATOR + NULL_STRING + FIELD_SEPARATOR) + (pRecord.endsWith(FIELD_SEPARATOR) ? NULL_STRING : "");
			//StringFormatter.align(String.valueOf(cal_.get(Calendar.DAY_OF_YEAR)),3,'0',0,3)
			result_ = DBUtil.delete("TPOS_ITEMENTRY",where_); 
			return result_;
		} catch (ConnectionFailedException e) {
			//LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getTransRecibidas(...)]:" + e.getMessage(), e);
			throw new ServiceException("",	"error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			//LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getTransRecibidas(...)]:" + e.getMessage(), e);
			e.printStackTrace();
			throw new ServiceException("",	"error.generic.dbaccess_failed", e);
		}
	}	
	public int deleteTenders(TPOS_TENDER pVo) throws /*ServiceException,*/DBAccessException,ConnectionFailedException {
		int result_ = 0;
		String where_ = "STORE="+pVo.getSTORE()+" AND " +
						"TERMINAL="+pVo.getTERMINAL()+" AND " + 
						"TRANSNUM="+pVo.getTRANSNUM()+" AND " +
						"DAY=DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+"')";//ECS Select para jt400 DB2
						/*/"DAY=TO_DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+
										"','yyyy-mm-dd HH24:MI:SS')";/*/
							//pRecord,FIELD_SEPARATOR + FIELD_SEPARATOR,FIELD_SEPARATOR + NULL_STRING + FIELD_SEPARATOR) + (pRecord.endsWith(FIELD_SEPARATOR) ? NULL_STRING : "");
			//StringFormatter.align(String.valueOf(cal_.get(Calendar.DAY_OF_YEAR)),3,'0',0,3)
		result_ = DBUtil.delete("TPOS_TENDER",where_);
		return result_;
	}
		
	public int deleteTaxes(TPOS_TAX pVo) throws /*ServiceException,*/DBAccessException,ConnectionFailedException {
		int result_ = 0;
		String where_ = "STORE="+pVo.getSTORE()+" AND " +
						"TERMINAL="+pVo.getTERMINAL()+" AND " + 
						"TRANSNUM="+pVo.getTRANSNUM()+" AND " +
						"DAY=DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+"')";	//ECS Select para jt400 DB2					
						/*/"DAY=TO_DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+
										"','yyyy-mm-dd HH24:MI:SS')";/*/
							//pRecord,FIELD_SEPARATOR + FIELD_SEPARATOR,FIELD_SEPARATOR + NULL_STRING + FIELD_SEPARATOR) + (pRecord.endsWith(FIELD_SEPARATOR) ? NULL_STRING : "");
			//StringFormatter.align(String.valueOf(cal_.get(Calendar.DAY_OF_YEAR)),3,'0',0,3)
		result_ = DBUtil.delete("TPOS_TAX",where_);
		return result_;
	}
	
	public int deleteManagerOverrides(TPOS_MANAGER_OVERRIDE pVo) throws /*ServiceException,*/DBAccessException,ConnectionFailedException {
		int result_ = 0;
		String where_ = "STORE="+pVo.getSTORE()+" AND " +
						"TERMINAL="+pVo.getTERMINAL()+" AND " + 
						"TRANSNUM="+pVo.getTRANSNUM()+" AND " +
						"DAY=DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+"')";//ECS Select para jt400 DB2
						/*/"DAY=TO_DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+
										"','yyyy-mm-dd HH24:MI:SS')";/*/
							//pRecord,FIELD_SEPARATOR + FIELD_SEPARATOR,FIELD_SEPARATOR + NULL_STRING + FIELD_SEPARATOR) + (pRecord.endsWith(FIELD_SEPARATOR) ? NULL_STRING : "");
			//StringFormatter.align(String.valueOf(cal_.get(Calendar.DAY_OF_YEAR)),3,'0',0,3)
		result_ = DBUtil.delete("TPOS_MANAGER_OVERRIDE",where_);
		return result_;
	}	

	public int deleteDataEntries(TPOS_DATA_ENTRY pVo) throws /*ServiceException,*/DBAccessException,ConnectionFailedException {
		int result_ = 0;
		String where_ = "STORE="+pVo.getSTORE()+" AND " +
						"TERMINAL="+pVo.getTERMINAL()+" AND " + 
						"TRANSNUM="+pVo.getTRANSNUM()+" AND " +
						"DAY=DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+"')";//ECS Select para jt400 DB2
						/*/"DAY=TO_DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+
										"','yyyy-mm-dd HH24:MI:SS')";/*/
							//pRecord,FIELD_SEPARATOR + FIELD_SEPARATOR,FIELD_SEPARATOR + NULL_STRING + FIELD_SEPARATOR) + (pRecord.endsWith(FIELD_SEPARATOR) ? NULL_STRING : "");
			//StringFormatter.align(String.valueOf(cal_.get(Calendar.DAY_OF_YEAR)),3,'0',0,3)
		result_ = DBUtil.delete("TPOS_DATA_ENTRY",where_);
		return result_;
	}
		
	public int deleteDiscounts(TPOS_DISCOUNT pVo) throws /*ServiceException,*/DBAccessException,ConnectionFailedException {
		int result_ = 0;
		String where_ = "STORE="+pVo.getSTORE()+" AND " +
						"TERMINAL="+pVo.getTERMINAL()+" AND " + 
						"TRANSNUM="+pVo.getTRANSNUM()+" AND " +
						"DAY=DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+"')";//ECS Select para jt400 DB2
						/*/"DAY=TO_DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+
										"','yyyy-mm-dd HH24:MI:SS')";/*/
							//pRecord,FIELD_SEPARATOR + FIELD_SEPARATOR,FIELD_SEPARATOR + NULL_STRING + FIELD_SEPARATOR) + (pRecord.endsWith(FIELD_SEPARATOR) ? NULL_STRING : "");
			//StringFormatter.align(String.valueOf(cal_.get(Calendar.DAY_OF_YEAR)),3,'0',0,3)
		result_ = DBUtil.delete("TPOS_DISCOUNT",where_);
		return result_;
	}

	public int deleteItemRecordChanges(TPOS_ITEM_RECORD_CHANGE pVo) throws /*ServiceException,*/DBAccessException,ConnectionFailedException {
		int result_ = 0;
		String where_ = "STORE="+pVo.getSTORE()+" AND " +
						"TERMINAL="+pVo.getTERMINAL()+" AND " + 
						"TRANSNUM="+pVo.getTRANSNUM()+" AND " +
						"DAY=DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+"')";//ECS Select para jt400 DB2
						/*/"DAY=TO_DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+
										"','yyyy-mm-dd HH24:MI:SS')";/*/
							//pRecord,FIELD_SEPARATOR + FIELD_SEPARATOR,FIELD_SEPARATOR + NULL_STRING + FIELD_SEPARATOR) + (pRecord.endsWith(FIELD_SEPARATOR) ? NULL_STRING : "");
			//StringFormatter.align(String.valueOf(cal_.get(Calendar.DAY_OF_YEAR)),3,'0',0,3)
		result_ = DBUtil.delete("TPOS_ITEM_RECORD_CHANGE",where_);
		return result_;
	}
	
	public int deleteOperatorTrainings(TPOS_OPERATOR_TRAINING pVo) throws /*ServiceException,*/DBAccessException,ConnectionFailedException {
		int result_ = 0;
		String where_ = "STORE="+pVo.getSTORE()+" AND " +
						"TERMINAL="+pVo.getTERMINAL()+" AND " + 
						"TRANSNUM="+pVo.getTRANSNUM()+" AND " +
						"DAY=DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+"')";//ECS Select para jt400 DB2
						/*/"DAY=TO_DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+
										"','yyyy-mm-dd HH24:MI:SS')";/*/
							//pRecord,FIELD_SEPARATOR + FIELD_SEPARATOR,FIELD_SEPARATOR + NULL_STRING + FIELD_SEPARATOR) + (pRecord.endsWith(FIELD_SEPARATOR) ? NULL_STRING : "");
			//StringFormatter.align(String.valueOf(cal_.get(Calendar.DAY_OF_YEAR)),3,'0',0,3)
		result_ = DBUtil.delete("TPOS_OPERATOR_TRAINING",where_);
		return result_;
	}
					
	public int deletePriceChanges(TPOS_PRICE_CHANGE pVo) throws /*ServiceException,*/DBAccessException,ConnectionFailedException {
		int result_ = 0;
		String where_ = "STORE="+pVo.getSTORE()+" AND " +
						"TERMINAL="+pVo.getTERMINAL()+" AND " + 
						"TRANSNUM="+pVo.getTRANSNUM()+" AND " +
						"DAY=DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
									StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
									StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
									StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
									StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
									StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+"')";//ECS Select para jt400 DB2
						/*/"DAY=TO_DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+
										"','yyyy-mm-dd HH24:MI:SS')";/*/
							//pRecord,FIELD_SEPARATOR + FIELD_SEPARATOR,FIELD_SEPARATOR + NULL_STRING + FIELD_SEPARATOR) + (pRecord.endsWith(FIELD_SEPARATOR) ? NULL_STRING : "");
			//StringFormatter.align(String.valueOf(cal_.get(Calendar.DAY_OF_YEAR)),3,'0',0,3)
		result_ = DBUtil.delete("TPOS_PRICE_CHANGE",where_);
		return result_;
	}
							
	public int deleteTillChanges(TPOS_TILL_CHANGE pVo) throws /*ServiceException,*/DBAccessException,ConnectionFailedException {
		int result_ = 0;
		String where_ = "STORE="+pVo.getSTORE()+" AND " +
						"TERMINAL="+pVo.getTERMINAL()+" AND " + 
						"TRANSNUM="+pVo.getTRANSNUM()+" AND " +
						"DAY=DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+"')";//ECS Select para jt400 DB2
						/*/"DAY=TO_DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+
										"','yyyy-mm-dd HH24:MI:SS')";/*/
							//pRecord,FIELD_SEPARATOR + FIELD_SEPARATOR,FIELD_SEPARATOR + NULL_STRING + FIELD_SEPARATOR) + (pRecord.endsWith(FIELD_SEPARATOR) ? NULL_STRING : "");
			//StringFormatter.align(String.valueOf(cal_.get(Calendar.DAY_OF_YEAR)),3,'0',0,3)
		result_ = DBUtil.delete("TPOS_TILL_CHANGE",where_);
		return result_;
	}							

	public int deleteTradingStamps(TPOS_TRADING_STAMPS pVo) throws /*ServiceException,*/DBAccessException,ConnectionFailedException {
		int result_ = 0;
		String where_ = "STORE="+pVo.getSTORE()+" AND " +
						"TERMINAL="+pVo.getTERMINAL()+" AND " + 
						"TRANSNUM="+pVo.getTRANSNUM()+" AND " +
						"DAY=DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+"')";//ECS Select para jt400 DB2
						/*/"DAY=TO_DATE('"+StringFormatter.align((pVo.getDAY().getYear()+1900)+"",4,'0',0,4)+"-"+
										StringFormatter.align((pVo.getDAY().getMonth()+1)+"",2,'0',0,2)+"-"+
										StringFormatter.align(pVo.getDAY().getDate()+"",2,'0',0,2)+" "+
										StringFormatter.align(pVo.getDAY().getHours()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getMinutes()+"",2,'0',0,2)+":"+
										StringFormatter.align(pVo.getDAY().getSeconds()+"",2,'0',0,2)+
										"','yyyy-mm-dd HH24:MI:SS')";/*/
							//pRecord,FIELD_SEPARATOR + FIELD_SEPARATOR,FIELD_SEPARATOR + NULL_STRING + FIELD_SEPARATOR) + (pRecord.endsWith(FIELD_SEPARATOR) ? NULL_STRING : "");
			//StringFormatter.align(String.valueOf(cal_.get(Calendar.DAY_OF_YEAR)),3,'0',0,3)
		result_ = DBUtil.delete("TPOS_TRADING_STAMPS",where_);
		return result_;
	}	
	
}