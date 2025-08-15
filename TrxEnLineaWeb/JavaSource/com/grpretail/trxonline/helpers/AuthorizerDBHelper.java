
package com.grpretail.trxonline.helpers;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.ramm.jwaf.dbutil.DBUtil;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.ac.utils.Relleno;
import com.asic.ac.utils.SqlUtils;
import com.asic.ac.utils.StringFormatter;
import com.grpretail.business.transacciones.vo.STORE_CONCILIATION;
import com.grpretail.trxonline.exception.StoreNotFoundException;
import com.grpretail.trxonline.utils.BusinessLogicParameters;
import com.grpretail.trxonline.vos.RegistersVo;

import com.asic.author.manager.request.RequestsHandler;

/**
 * @author Usuario
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class AuthorizerDBHelper {
	
	protected static Hashtable aHashBusinessLogicParams;
	public static final String BUSINESSSETTINGS_FILENAME	= "BusinessParams";
	
	public static boolean insertSupportStore(String pStoreNumber){
		// Insertar en registro de la tabla llegadas_del_POS
		try{
			int store_ = Integer.parseInt(pStoreNumber);
			String sentencia_ = "INSERT INTO " + BusinessLogicParameters.DB_TABLA_TOL_SUPPORT_STORES + " (" + 
				//BusinessLogicParameters.DB_COLUM_DSI_ID + "," + 
				BusinessLogicParameters.DB_COLUM_TOL_STORE_ID	+ "," + 
				BusinessLogicParameters.DB_COLUM_TOL_STORE_NAME	 + 
			") VALUES (" + 
					//"SELECT MAX("," +//"SQ_LLEGADAS_DE_POS.NEXTVAL," +
					store_+"," +					 
					"'NO NAME'" +
				")";
			int reintentos_=0;	
			boolean pending_=true;
			while(pending_ && reintentos_<2){
				pending_ = !SqlUtils.insertaRegistro(
					sentencia_,
					RequestsHandler.getCnxClassName(""),
					RequestsHandler.getCnxUrl(""),
					RequestsHandler.getCnxUserID(""),
					RequestsHandler.getCnxPassword("")
				);
				
				reintentos_++;
			}		
			if (pending_)
				return false;
			return true;		
		}catch(Exception e){
			return false;
		}catch(Throwable t){			
			t.printStackTrace();
			return false;
		}
		//return true;		
	}

	public static boolean existsConciliationRegister(String pStoreNumber, String pStrInDateTime, String pStrFinDateTime) throws DBAccessException, StoreNotFoundException{
		int store_ = Integer.parseInt(pStoreNumber);	
		RegistersVo numReg_=new RegistersVo();
		numReg_.setNumber(0); 
		String select_ =
				"COUNT(*) number ";
		String from_ = "TOL_STORE_CONCILIATION";
		String where_= "TSC_STORE_ID="+pStoreNumber+" AND TSC_FECHAHORA_INI='"+pStrInDateTime+"' AND TSC_FECHAHORA_FIN='"+pStrFinDateTime+"'";

		System.out.println("Sentencia->"+select_+from_+where_);		
		List res_;
		int reintentos_=1;
		boolean pending_=true;
		while(pending_ && reintentos_<=3){
			try {
				res_ = DBUtil.select(select_, from_, where_, RegistersVo.class);
				Iterator iterator_=res_.iterator();
				numReg_=(RegistersVo)iterator_.next();
				pending_=false;
			} catch (ConnectionFailedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			} catch (DBAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			}catch (Exception e){
				e.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			}catch (Throwable t){
				t.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			}/*finally{
				reintentos_++;
			}*/
		}
		if(numReg_.getNumber() == 0)
			//throw new StoreNotFoundException("Store not found in DB");
			return false;	
		return true;		
	}

	public static boolean insertStoreConciliation(STORE_CONCILIATION objToInsert_){
		// Insertar en registro de la tabla llegadas_del_POS
		try{
			//int store_ = Integer.parseInt(pStoreNumber);
			String sentencia_ = "INSERT INTO TOL_STORE_CONCILIATION (" + 
									"TSC_STORE_ID,"+
									"TSC_GROSS_SALES,"+    
									"TSC_VOIDED_ITEMS,"+
									"TSC_REFUNDED_ITEMS,"+
									"TSC_TOTAL_DISCOUNTS,"+
									"TSC_MISCELLA_AMOUNT,"+
									"TSC_VOIDED_TRXS_AMT,"+
									"TSC_ITM_GROSS_POSIT,"+
									"TSC_ITM_GROSS_NEGAT,"+
									"TSC_CUST_TICKET_NUM,"+
									"TSC_STORE_COUPONS,"+
									"TSC_ITEMS_SOLDS_NUM,"+
									"TSC_FECHAHORA_INI,"+
									"TSC_FECHAHORA_FIN"+
								")VALUES("+
									objToInsert_.getSTORE_ID().intValue()+","+ 
									objToInsert_.getGROSS_SALES().longValue()+","+    
									objToInsert_.getVOIDED_ITEMS().longValue()+","+
									objToInsert_.getREFUNDED_ITEMS().longValue()+","+
									objToInsert_.getTOTAL_DISCOUNTS().longValue()+","+
									objToInsert_.getMISCELLA_AMOUNT().longValue()+","+
									objToInsert_.getVOIDED_TRXS_AMT().longValue()+","+
									objToInsert_.getITM_GROSS_POSIT().longValue()+","+
									objToInsert_.getITM_GROSS_NEGAT().longValue()+","+
									objToInsert_.getCUST_TICKET_NUM().longValue()+","+
									objToInsert_.getSTORE_COUPONS().longValue()+","+
									objToInsert_.getITEMS_SOLDS_NUM()+","+
									"'"+objToInsert_.getFECHAHORA_INI()+"',"+
									"'"+objToInsert_.getFECHAHORA_FIN()+"'"+
								")";
			System.out.println("Sentencia de inserciOn:"+sentencia_);					 								

			int reintentos_=0;	
			boolean pending_=true;
			while(pending_ && reintentos_<2){
				pending_ = !SqlUtils.insertaRegistro(
					sentencia_,
					RequestsHandler.getCnxClassName(""),
					RequestsHandler.getCnxUrl(""),
					RequestsHandler.getCnxUserID(""),
					RequestsHandler.getCnxPassword("")
				);
				
				reintentos_++;
			}		
			if (pending_)
				return false;
			return true;		
		}catch(Exception e){
			return false;
		}catch(Throwable t){			
			t.printStackTrace();
			return false;
		}
		//return true;		
	}		
	
	public static boolean existsDBStore(String pStoreNumber) throws DBAccessException, StoreNotFoundException{
		int store_ = Integer.parseInt(pStoreNumber);	
		RegistersVo numReg_=new RegistersVo();
		numReg_.setNumber(0); 
		String select_ =
				"COUNT(*) number ";
		String from_ =
				BusinessLogicParameters.DB_TABLA_TOL_SUPPORT_STORES;//+","+BusinessLogicParameters.DB_TABLA_CLIENTE;
		String where_=  BusinessLogicParameters.DB_COLUM_TOL_STORE_ID+"="+store_;

		System.out.println("Sentencia->"+select_+from_+where_);		
		List res_;
		int reintentos_=1;
		boolean pending_=true;
		while(pending_ && reintentos_<=3){
			try {
				res_ = DBUtil.select(select_, from_, where_, RegistersVo.class);
				Iterator iterator_=res_.iterator();
				numReg_=(RegistersVo)iterator_.next();
				pending_=false;
			} catch (ConnectionFailedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			} catch (DBAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			}catch (Exception e){
				e.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			}catch (Throwable t){
				t.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			}/*finally{
				reintentos_++;
			}*/
		}
		if(numReg_.getNumber() == 0)
			throw new StoreNotFoundException("Store not found in DB");	
		return true;		
	}
		
	/*	
	public static List getCustomerBenefits(String pIdCustomer, List pCommercialStructureList, String pDate) throws DBAccessException, CustomerNotFoundException{
		//CustomerBenefitVo answer_=null;
		List answer_=null;
		//RegistersVo numReg_=new RegistersVo();
		//numReg_.setNumberReg(0);
		String select_ = BusinessLogicParameters.DB_COLUM_BCL_ID_CLIENTE+" idCliente, " + 
						 BusinessLogicParameters.DB_COLUM_BCL_ESTRUCTURA_COMERCIAL+" estructura, " +
						 BusinessLogicParameters.DB_COLUM_BCL_FECHA_VALIDACION+" fecha, " + 
						 "("+BusinessLogicParameters.DB_COLUM_BCL_MAXIMA_CANTIDAD_BENEFICIO+ "-" +
						 BusinessLogicParameters.DB_COLUM_BCL_CANTIDAD_BENEFICIOS_USADOS+") beneficios ";
		String from_ =
				BusinessLogicParameters.DB_TABLA_BENEFICIOS_CLIENTES;//+","+BusinessLogicParameters.DB_TABLA_CLIENTE;
		String where_=  BusinessLogicParameters.DB_COLUM_BCL_ID_CLIENTE+"="+pIdCustomer+" AND "+
					    BusinessLogicParameters.DB_COLUM_BCL_FECHA_VALIDACION+"="+pDate+" AND "+
					    BusinessLogicParameters.DB_COLUM_BCL_ESTRUCTURA_COMERCIAL+" IN (";
						for (int i=0;i<pCommercialStructureList.size();i++){
							String currComStrucuture_ = (String)pCommercialStructureList.get(i);
							if (i > 0)
								where_ +=  ",";
							where_ +=  currComStrucuture_;
						}
						where_ +=  ")";

		System.out.println("Sentencia->"+select_+from_+where_);		
		//List res_;
		//int reintentos_=1;
		//boolean pending_=true;
		//while(pending_ && reintentos_<=pNumRep){
			//try {
				answer_ = DBUtil.select(select_, from_, where_, CustomerBenefitVo.class, BusinessLogicParameters.ID_DATABASE_MERC);
					
				//Iterator iterator_=res_.iterator();
				//answer_=(CustomerBenefitVo)res_.get(0);
				//pending_=false;
			} catch (ConnectionFailedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DBAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e){
				e.printStackTrace();
			}catch (Throwable t){
				t.printStackTrace();
			}finally{
				reintentos_++;
			}
		//}
		//if (reintentos_>3)
		//	throw new DBAccessException("No se pudo consulta en la DB");
		return answer_;
	}

	public static boolean isThereCustomerBenefitsRegister(TransaccionVO pTrxVo) throws DBAccessException, CustomerNotFoundException{
		//CustomerBenefitVo answer_=null;
		RegistersVo numReg_=new RegistersVo();
		numReg_.setNumber(0); 
		String select_ =
				"COUNT(*) number ";
		String from_ =
				BusinessLogicParameters.DB_TABLA_BENEFICIOS_CLIENTES;//+","+BusinessLogicParameters.DB_TABLA_CLIENTE;
		String where_=  BusinessLogicParameters.DB_COLUM_BCL_ID_CLIENTE+"="+pTrxVo.getNumero_documento()+" AND "+
					    BusinessLogicParameters.DB_COLUM_BCL_FECHA_VALIDACION+"="+pTrxVo.getFechaDiaSinIVA()+" AND "+
					    BusinessLogicParameters.DB_COLUM_BCL_ESTRUCTURA_COMERCIAL+"="+pTrxVo.getEstructuraComercial();

		System.out.println("Sentencia->"+select_+from_+where_);		
		List res_;
		//int reintentos_=1;
		//boolean pending_=true;
		//while(pending_ && reintentos_<=){
			try {
				res_ = DBUtil.select(select_, from_, where_, RegistersVo.class);
				Iterator iterator_=res_.iterator();
				numReg_=(RegistersVo)iterator_.next();
				//pending_=false;
			} catch (ConnectionFailedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			} catch (DBAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			}catch (Exception e){
				e.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			}catch (Throwable t){
				t.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			}
		return numReg_.getNumber()>0;		
	}
*/		
/*
	public static PointsRegisterVo getCustomerPoints(String pIdCustomer) throws DBAccessException, CustomerNotFoundException{
		PointsRegisterVo answer_=null;
		//RegistersVo numReg_=new RegistersVo();
		//numReg_.setNumberReg(0);

		String select_ = BusinessLogicParameters.DB_COLUM_LPC_TOTAL_POINTS+" totalPoints, "+
						 BusinessLogicParameters.DB_COLUM_LPC_TOTAL_REDEM_POINTS+" redemPoints, "+
		//String select_ = BusinessLogicParameters.DB_COLUM_CL_ID + " id," + 
						 BusinessLogicParameters.DB_COLUM_CL_ID_TIPOCLIENTE + " typeId," + 
						 BusinessLogicParameters.DB_COLUM_CL_NOMBRES + " firstName," + 
						 BusinessLogicParameters.DB_COLUM_CL_APELLIDOS + " lastName,"+						 
						 BusinessLogicParameters.DB_COLUM_LPC_TOTAL_SOLD + " totalSold";

		String from_ =
				BusinessLogicParameters.DB_TABLA_PUNTOS_CLIENTE;//+","+BusinessLogicParameters.DB_TABLA_CLIENTE;
		String where_=//BusinessLogicParameters.DB_COLUM_LPC_ID_CLIENTE+"="+BusinessLogicParameters.DB_COLUM_CL_ID+" AND "+
					  BusinessLogicParameters.DB_COLUM_LPC_ID_CLIENTE+"="+pIdCustomer;
		System.out.println("Sentencia->"+select_+from_+where_);		
		List res_;
		//int reintentos_=1;
		//boolean pending_=true;
		//while(pending_ && reintentos_<=pNumRep){
			//try {
				res_ = DBUtil.select(select_, from_, where_, PointsRegisterVo.class, ApplicationResources.MRKTPLUS_DB_2);
				if (res_!=null && res_.size()==0){
					

					throw new CustomerNotFoundException("Cliente no encontrado en la db");
			
					//answer_.setFPointsToExpire(new Long(0));
					//return answer_;
				}
					
				//Iterator iterator_=res_.iterator();
				answer_=(PointsRegisterVo)res_.get(0);
				//pending_=false;
			} catch (ConnectionFailedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DBAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e){
				e.printStackTrace();
			}catch (Throwable t){
				t.printStackTrace();
			}finally{
				reintentos_++;
			}
		//}
		//if (reintentos_>3)
		//	throw new DBAccessException("No se pudo consulta en la DB");
		return answer_;
	}	
	
	public static boolean insertLoyaltyTrx(TransaccionVO pTrxVo, boolean pAddFlag) throws Exception{
		// Insertar en registro de la tabla llegadas_del_POS
		//try{
				
			//String tipoVariedad = pPayment.getTipoVariedad()!=null?pPayment.getTipoVariedad().trim():"";
			if (!isThereLoyaltyTrx(pTrxVo)){
	
				String date_ = pTrxVo.getFecha_hora_trx_pos()!=null?pTrxVo.getFecha_hora_trx_pos().trim():"0";
				date_ = date_.length()>=12?date_.substring(0,10):Relleno.carga(date_,10,'0',0,10);
				String store_ = pTrxVo.getTienda()!=null?pTrxVo.getTienda().trim():"0";
				store_ = store_.length()>3?store_.substring(store_.length()-3,store_.length()):Relleno.carga(store_,3,'0',0,3);
				String terminal_ = pTrxVo.getTerminal()!=null?pTrxVo.getTerminal().trim():"0";
				terminal_ = terminal_.length()>3?terminal_.substring(terminal_.length()-3,terminal_.length()):Relleno.carga(terminal_,3,'0',0,3);
				String trx_ = pTrxVo.getNum_factura()!=null?pTrxVo.getNum_factura().trim():"0";
				trx_ = trx_.length()>3?trx_.substring(trx_.length()-3,trx_.length()):Relleno.carga(trx_,3,'0',0,3);
				String strTrxKey_ = date_ + store_ + terminal_ + trx_;
				if (isThereCustomerBenefitsRegister(pTrxVo)){
					// Sí ya existe un registro se actualiza
					String sentence_ =  " UPDATE " + BusinessLogicParameters.DB_TABLA_BENEFICIOS_CLIENTES; 
										if (pAddFlag)
											sentence_ += " SET " + 	 BusinessLogicParameters.DB_COLUM_BCL_CANTIDAD_BENEFICIOS_USADOS + "=" + BusinessLogicParameters.DB_COLUM_BCL_CANTIDAD_BENEFICIOS_USADOS +"+"+pTrxVo.getBeneficiosUsados()+",";
										else
											sentence_ += " SET " + 	 BusinessLogicParameters.DB_COLUM_BCL_CANTIDAD_BENEFICIOS_USADOS + "=" + BusinessLogicParameters.DB_COLUM_BCL_CANTIDAD_BENEFICIOS_USADOS +"-"+pTrxVo.getBeneficiosUsados()+",";
										sentence_ += BusinessLogicParameters.DB_COLUM_BCL_TRX_KEY_1 + "='" +strTrxKey_+"',"+
					 							  	 BusinessLogicParameters.DB_COLUM_BCL_TRX_KEY_2 + "=" + BusinessLogicParameters.DB_COLUM_BCL_TRX_KEY_1+","+
					 							  	 BusinessLogicParameters.DB_COLUM_BCL_TRX_KEY_3 + "=" + BusinessLogicParameters.DB_COLUM_BCL_TRX_KEY_2;
					 
					String filter_ = BusinessLogicParameters.DB_COLUM_BCL_ID_CLIENTE+"="+pTrxVo.getNumero_documento()+" AND "+
				    				 BusinessLogicParameters.DB_COLUM_BCL_FECHA_VALIDACION+"="+pTrxVo.getFechaDiaSinIVA()+" AND "+
				    				 BusinessLogicParameters.DB_COLUM_BCL_ESTRUCTURA_COMERCIAL+"="+pTrxVo.getEstructuraComercial()+" AND "+
									 BusinessLogicParameters.DB_COLUM_BCL_TRX_KEY_1 + "<>'" + strTrxKey_+"' AND "+
									 BusinessLogicParameters.DB_COLUM_BCL_TRX_KEY_2 + "<>'" + strTrxKey_+"' AND "+
									 BusinessLogicParameters.DB_COLUM_BCL_TRX_KEY_3 + "<>'" + strTrxKey_+"'";					
					
					//while(pending_ && reintentos_<=3){
						int dbUpdateAnswer_ = SqlUtils.actualizaTabla(
										sentence_ +" WHERE "+filter_,
										PosRequestsHandler.getCnxClassName(""),
										PosRequestsHandler.getCnxUrl(""),
										PosRequestsHandler.getCnxUserID(""),
										PosRequestsHandler.getCnxPassword("")
										);
						if(dbUpdateAnswer_>=0){ // Registro fue actualizado satisfactoriamente o ya había sido actualizado
								if (!insertCustomerTrxRegister(pTrxVo))
									throw new DBAccessException("Error insertando trx de lealtad");										
						}else{ //  Hubo problemas con la base de datos
							System.out.println("Error actualizando registro de puntos");
							throw new DBAccessException("Error actualizando registro de puntos");
						}
				}else{
					// Si no existe un registro para el cliente se inserta
					if(!insertTrxCustomerCategoryRegister(pTrxVo, strTrxKey_)){
						throw new DBAccessException("Error insertando registro cliente uso de categorIas");
					}else
						if (!insertCustomerTrxRegister(pTrxVo))
							throw new DBAccessException("Error insertando trx de lealtad");					
				}
					
	//				reintentos_++;
				//}		
	//			if (pending_)
	//				return false;
				return true;		
		
	//		}catch(Exception e){
	//			
	//			return false;
	//		}catch(Throwable t){			
	//			t.printStackTrace();
	//			return false;
	//		}
			//return true;
			}else{
				System.out.println("Trx ya fue registrada anteriormente");
				//throw new TrxAlreadyRegisteredException("Trx lealtad ya fue registrada anteriormente");
				return true;
			}	
	}	

	public static boolean insertTrxCustomerCategoryRegister(TransaccionVO pTrxVo, String pKey) throws DBAccessException{
		// Insertar en registro de la tabla llegadas_del_POS
		try{
			String sentencia_ = "INSERT INTO " + BusinessLogicParameters.DB_TABLA_BENEFICIOS_CLIENTES + " (" + 
				//BusinessLogicParameters.DB_COLUM_LTL_ID + "," +
				BusinessLogicParameters.DB_COLUM_BCL_ID_CLIENTE + "," + 
				BusinessLogicParameters.DB_COLUM_BCL_ESTRUCTURA_COMERCIAL	+ "," + 
				BusinessLogicParameters.DB_COLUM_BCL_FECHA_VALIDACION	 + "," + 
				BusinessLogicParameters.DB_COLUM_BCL_MAXIMA_CANTIDAD_BENEFICIO + "," + 	
				BusinessLogicParameters.DB_COLUM_BCL_CANTIDAD_BENEFICIOS_USADOS + "," +
				BusinessLogicParameters.DB_COLUM_BCL_TRX_KEY_1 +
			") VALUES (" + 
					//"SELECT MAX("," +//"SQ_LLEGADAS_DE_POS.NEXTVAL," +
					pTrxVo.getNumero_documento().trim()+"," +					 
					//"'" + pTrxVo.getNumero_documento().trim() + "'," +
					pTrxVo.getEstructuraComercial().trim() + "," +
					pTrxVo.getFechaDiaSinIVA().trim() + "," +
					pTrxVo.getMaxBeneficios().trim() + "," +
					pTrxVo.getBeneficiosUsados() + "," +
					"'" + pKey + "'" +
				")";
			int reintentos_=0;	
			boolean pending_=true;
			while(pending_ && reintentos_<2){
				pending_ = !SqlUtils.insertaRegistro(
					sentencia_,
					PosRequestsHandler.getCnxClassName(""),
					PosRequestsHandler.getCnxUrl(""),
					PosRequestsHandler.getCnxUserID(""),
					PosRequestsHandler.getCnxPassword("")
				);
				
				reintentos_++;
			}		
			if (pending_)
				return false;
			return true;		
		}catch(Exception e){
			return false;
		}catch(Throwable t){			
			t.printStackTrace();
			return false;
		}
		//return true;
	}	
	/*
	public static boolean isThereLoyaltyTrx(TransaccionVO pTrxVo) throws DBAccessException{
		//boolean answer_=false;
		RegistersVo numReg_=new RegistersVo();
		numReg_.setNumber(0); 
		String select_ =
				"COUNT(*) number ";
		String from_ =
						BusinessLogicParameters.DB_TABLA_TRX_DIA_SIN_IVA;
		String where_=	//pFilter + " AND " + 
						BusinessLogicParameters.DB_COLUM_DSI_TIENDA + "=" + 							"'" + pTrxVo.getTienda().trim() + "' AND " +                                              
						BusinessLogicParameters.DB_COLUM_DSI_NUM_TERMINAL + "=" + 		    "'" + StringFormatter.align(pTrxVo.getTerminal().trim(),6,'0',0,6) + "' AND " +               
						BusinessLogicParameters.DB_COLUM_DSI_OPERADOR + "=" + 	          "'" + StringFormatter.align(pTrxVo.getOperador().trim(),10,'0',0,10) + "' AND " +             
						BusinessLogicParameters.DB_COLUM_DSI_NUM_FACTURA + "=" + 		      "'" + StringFormatter.align(pTrxVo.getNum_factura().trim(),6,'0',0,6) + "' AND " +            
						BusinessLogicParameters.DB_COLUM_DSI_FECH_HORA_TRX_POS	 + "=" +  "'" + BusinessLogicParameters.PAR_CENTURY + pTrxVo.getFecha_hora_trx_pos().trim() + "' AND " +
						BusinessLogicParameters.DB_COLUM_DSI_ESTRUCTURA	 + "=" +  pTrxVo.getEstructuraComercial().trim() + " AND " +
						BusinessLogicParameters.DB_COLUM_DSI_FECHA_EVENTO + "=" + pTrxVo.getFechaDiaSinIVA().trim();
		System.out.println("Sentencia->"+select_+from_+where_);		
		List res_;
		//int reintentos_=1;
		//boolean pending_=true;
		//while(pending_ && reintentos_<=){
			try {
				res_ = DBUtil.select(select_, from_, where_, RegistersVo.class);
				Iterator iterator_=res_.iterator();
				numReg_=(RegistersVo)iterator_.next();
				//pending_=false;
			} catch (ConnectionFailedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			} catch (DBAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			}catch (Exception e){
				e.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			}catch (Throwable t){
				t.printStackTrace();
				throw new DBAccessException("Error buscando trx de lealtad en DB");
			}
		//}
		//if (reintentos_>3)
		//	throw new DBAccessException("Error haciendo consulta en la tabla REV_MULT");
		return numReg_.getNumber()>0;			
	}	
*/	
	/*
	public static BonusRegisterVo getCustomerBonus(String pIdCustomer, String pNumBono) throws DBAccessException, BonusNotFoundException{
		BonusRegisterVo answer_=null;
		//RegistersVo numReg_=new RegistersVo();
		//numReg_.setNumberReg(0);
		String select_ = BusinessLogicParameters.DB_COLUM_LBL_VALOR + " value2, "+
						 "("+BusinessLogicParameters.DB_COLUM_LBL_VALOR+"-"+BusinessLogicParameters.DB_COLUM_LBL_VALOR_USADO+")" + " balance, "+
						 BusinessLogicParameters.DB_COLUM_LBL_ESTADO + " status";						 
		String from_ = 	BusinessLogicParameters.DB_TABLA_BONOS_LEALTAD;//+","+BusinessLogicParameters.DB_TABLA_CLIENTE;
		String where_ = BusinessLogicParameters.DB_COLUM_LBL_ID_CLIENTE + "=" + pIdCustomer + " AND " +
						BusinessLogicParameters.DB_COLUM_LBL_NUMERO + "=" + pNumBono;
		System.out.println("Sentencia->"+select_+from_+where_);		
		List res_;
		res_ = DBUtil.select(select_, from_, where_, BonusRegisterVo.class);
		if (res_!=null && res_.size()==0){
			throw new BonusNotFoundException("Bono no encontrado en la db");
		}
		answer_=(BonusRegisterVo)res_.get(0);
		return answer_;
	}

	public static boolean updateBonus(String pIdCustomer, String pNumBono, String pUsedAmt, String pStore, String pTerminal, String pTrx, String pDateTime, String pOperator) throws DBAccessException, BonusNotFoundException{
		boolean answer_=true;
		String sentence_ =  " UPDATE " + BusinessLogicParameters.DB_TABLA_BONOS_LEALTAD + 
							" SET " + BusinessLogicParameters.DB_COLUM_LBL_ESTADO + "='" + getBusinessLogicParam(BusinessLogicParameters.ID_USED_BONOS_STATUS).getValue()+"',"+
									BusinessLogicParameters.DB_COLUM_LBL_VALOR_USADO + "=" + pUsedAmt+","+
									BusinessLogicParameters.DB_COLUM_LBL_FECHA_USO + "=" + BusinessLogicParameters.PAR_CURRENT_TIMESTAMP_FUNTION_NAME + ", " +
									BusinessLogicParameters.DB_COLUM_LBL_STORE+ "='" + pStore+"', "+			
									BusinessLogicParameters.DB_COLUM_LBL_TERMINAL + "='" + pTerminal +"', "+
									BusinessLogicParameters.DB_COLUM_LBL_TRX + "='" + pTrx +"', "+
									BusinessLogicParameters.DB_COLUM_LBL_POS_FECHA_HORA	 + "=TIMESTAMP('20" + pDateTime + "'), "+
									BusinessLogicParameters.DB_COLUM_LBL_OPERATOR + "='" + pOperator +"'";

		String filter_ =	BusinessLogicParameters.DB_COLUM_LBL_ID_CLIENTE+"="+pIdCustomer+" AND "+
							BusinessLogicParameters.DB_COLUM_LBL_NUMERO+"="+pNumBono;

		int dbUpdateAnswer_ = SqlUtils.actualizaTabla(
						sentence_ +" WHERE "+filter_,
						PosRequestsHandler.getCnxClassName(""),
						PosRequestsHandler.getCnxUrl(""),
						PosRequestsHandler.getCnxUserID(""),
						PosRequestsHandler.getCnxPassword("")
						);
		if(dbUpdateAnswer_>0){ // Registro fue actualizado satisfactoriamente o ya había sido actualizado
			System.out.println("Bono actualizado satisfactoriamente");
		}else if (dbUpdateAnswer_==0){
			System.out.println("Bono no encontrado para actualización en la DB");
			throw new BonusNotFoundException("Bono no encontrado para actualización en la DB");
		}else{ //  Hubo problemas con la base de datos
			System.out.println("Error actualizando registro de puntos");
			throw new DBAccessException("Error actulizando bono en la DB");
		}
		return answer_;
	}
	
	
	
	public static boolean updateRedemptionCustomerPoints(TransaccionVO pTrxVo) throws DBAccessException{
		// Insertar en registro de la tabla llegadas_del_POS
		//try{
				
			//String tipoVariedad = pPayment.getTipoVariedad()!=null?pPayment.getTipoVariedad().trim():"";
			String sign_ = "+";
			//if (pOption==2) // acumulacion puntos
			//	sign_ = "-";
			String date_ = pTrxVo.getFecha_hora_trx_pos()!=null?pTrxVo.getFecha_hora_trx_pos().trim():"0";
			date_ = date_.length()>=12?date_.substring(0,10):Relleno.carga(date_,10,'0',0,10);
			String store_ = pTrxVo.getTienda()!=null?pTrxVo.getTienda().trim():"0";
			store_ = store_.length()>3?store_.substring(store_.length()-3,store_.length()):Relleno.carga(store_,3,'0',0,3);
			String terminal_ = pTrxVo.getTerminal()!=null?pTrxVo.getTerminal().trim():"0";
			terminal_ = terminal_.length()>3?terminal_.substring(terminal_.length()-3,terminal_.length()):Relleno.carga(terminal_,3,'0',0,3);
			String trx_ = pTrxVo.getNum_factura()!=null?pTrxVo.getNum_factura().trim():"0";
			trx_ = trx_.length()>3?trx_.substring(trx_.length()-3,trx_.length()):Relleno.carga(trx_,3,'0',0,3);
			String strTrxKey_ = date_ + store_ + terminal_ + trx_;
			
			String sentence_ =  " UPDATE " + BusinessLogicParameters.DB_TABLA_PUNTOS_CLIENTE + 
								" SET " + BusinessLogicParameters.DB_COLUM_LPC_TOTAL_REDEM_POINTS + "=" + BusinessLogicParameters.DB_COLUM_LPC_TOTAL_REDEM_POINTS + sign_ + pTrxVo.getPuntos_redimidos_trx()+","+
										BusinessLogicParameters.DB_COLUM_LPC_TOTAL_POINTS + "=" + BusinessLogicParameters.DB_COLUM_LPC_TOTAL_POINTS + "+" +pTrxVo.getPuntos_acum_trx()+","+
										BusinessLogicParameters.DB_COLUM_LPC_LAST_TRX_REDEM_POINTS + "=" + pTrxVo.getPuntos_redimidos_trx()+","+
										BusinessLogicParameters.DB_COLUM_LPC_TRX_KEY_1 + "='" +strTrxKey_+"',"+
										BusinessLogicParameters.DB_COLUM_LPC_TRX_KEY_2 + "=" + BusinessLogicParameters.DB_COLUM_LPC_TRX_KEY_1+","+
										BusinessLogicParameters.DB_COLUM_LPC_TRX_KEY_3 + "=" + BusinessLogicParameters.DB_COLUM_LPC_TRX_KEY_2+","+
										BusinessLogicParameters.DB_COLUM_LPC_TRX_KEY_4 + "=" + BusinessLogicParameters.DB_COLUM_LPC_TRX_KEY_3+","+
										BusinessLogicParameters.DB_COLUM_LPC_TRX_KEY_5 + "=" + BusinessLogicParameters.DB_COLUM_LPC_TRX_KEY_4;
										  //BusinessLogicParameters.DB_COLUM_LPC_PERIOD_POINTS + "=" + BusinessLogicParameters.DB_COLUM_LPC_PERIOD_POINTS + sign_ + pTrxVo.getPuntos_periodo();
										  
			String filter_ =	BusinessLogicParameters.DB_COLUM_LPC_ID_CLIENTE+"="+pTrxVo.getNumero_documento()+" AND "+
								BusinessLogicParameters.DB_COLUM_LPC_COMPANY_ID+"=1 AND " +
								BusinessLogicParameters.DB_COLUM_LPC_TRX_KEY_1 + "<>'" + strTrxKey_+"' AND "+
								BusinessLogicParameters.DB_COLUM_LPC_TRX_KEY_2 + "<>'" + strTrxKey_+"' AND "+
								BusinessLogicParameters.DB_COLUM_LPC_TRX_KEY_3 + "<>'" + strTrxKey_+"' AND "+
								BusinessLogicParameters.DB_COLUM_LPC_TRX_KEY_4 + "<>'" + strTrxKey_+"' AND "+
								BusinessLogicParameters.DB_COLUM_LPC_TRX_KEY_5 + "<>'" + strTrxKey_+"'";								
				//BusinessLogicParameters.DB_COLUM_PCL_PERMANENT_POINTS + "," + 
				//BusinessLogicParameters.DB_COLUM_PCL_PERIOD_POINTS	+ 
			//int reintentos_=0;	
			//boolean pending_=true;
			//while(pending_ && reintentos_<=3){
				
				int dbUpdateAnswer_ = SqlUtils.actualizaTabla(
								sentence_ +" WHERE "+filter_,
								PosRequestsHandler.getCnxClassName(""),
								PosRequestsHandler.getCnxUrl(""),
								PosRequestsHandler.getCnxUserID(""),
								PosRequestsHandler.getCnxPassword("")
								);
				if(dbUpdateAnswer_>=0){ // Registro fue actualizado satisfactoriamente o ya había sido actualizado
						if (!insertCustomerPointsTrxRegister(pTrxVo))
							throw new DBAccessException("Error insertando trx de lealtad");										
				}else{ //  Hubo problemas con la base de datos
					System.out.println("Error actualizando registro de puntos");
					throw new DBAccessException("Error actualizando registro de puntos");
				}				
				
//				reintentos_++;
			//}		
//			if (pending_)
//				return false;
			return true;		
	
//		}catch(Exception e){
//			
//			return false;
//		}catch(Throwable t){			
//			t.printStackTrace();
//			return false;
//		}
		//return true;
	}
	*/		

/*
	public static boolean insertCustomerTrxRegister(TransaccionVO pTrxVo) throws DBAccessException{
		// Insertar en registro de la tabla llegadas_del_POS
		try{
			String sentencia_ = "INSERT INTO " + BusinessLogicParameters.DB_TABLA_TRX_DIA_SIN_IVA + " (" + 
				//BusinessLogicParameters.DB_COLUM_DSI_ID + "," + 
				BusinessLogicParameters.DB_COLUM_DSI_ID_CLIENTE	+ "," + 
				BusinessLogicParameters.DB_COLUM_DSI_TIENDA	 + "," + 
				BusinessLogicParameters.DB_COLUM_DSI_NUM_TERMINAL + "," + 	
				BusinessLogicParameters.DB_COLUM_DSI_OPERADOR + "," + 	
				BusinessLogicParameters.DB_COLUM_DSI_NUM_FACTURA + "," + 		
				BusinessLogicParameters.DB_COLUM_DSI_FECH_HORA_TRX_POS + "," + 	
				//BusinessLogicParameters.DB_COLUM_DSI_FECHA_HORA_TRX + "," + 		
				BusinessLogicParameters.DB_COLUM_DSI_ESTRUCTURA	 + "," + 
				//BusinessLogicParameters.DB_COLUM_LTL_FECHA_HORA_TRX	 + "," +
		 
				BusinessLogicParameters.DB_COLUM_DSI_FECHA_EVENTO	 + "," +
				BusinessLogicParameters.DB_COLUM_DSI_CANTIDAD_MAX	 + "," +
				BusinessLogicParameters.DB_COLUM_DSI_CANTIDAD_VENTA	 +
			") VALUES (" + 
					//"SELECT MAX("," +//"SQ_LLEGADAS_DE_POS.NEXTVAL," +
					pTrxVo.getNumero_documento()+"," +					 
					"'" + pTrxVo.getTienda().trim() + "'," +
					"'" + StringFormatter.align(pTrxVo.getTerminal().trim(),6,'0',0,6) + "'," +
					"'" + StringFormatter.align(pTrxVo.getOperador().trim(),10,'0',0,10) + "'," +
					"'" + StringFormatter.align(pTrxVo.getNum_factura().trim(),6,'0',0,6) + "'," +
					"'" + BusinessLogicParameters.PAR_CENTURY + pTrxVo.getFecha_hora_trx_pos().trim() + "'," +
					pTrxVo.getEstructuraComercial()+ "," +
					
					pTrxVo.getFechaDiaSinIVA()+ "," +
					pTrxVo.getMaxBeneficios()+ "," +
					pTrxVo.getBeneficiosUsados()+
				")";
			int reintentos_=0;	
			boolean pending_=true;
			while(pending_ && reintentos_<2){
				pending_ = !SqlUtils.insertaRegistro(
					sentencia_,
					PosRequestsHandler.getCnxClassName(""),
					PosRequestsHandler.getCnxUrl(""),
					PosRequestsHandler.getCnxUserID(""),
					PosRequestsHandler.getCnxPassword("")
				);
				
				reintentos_++;
			}		
			if (pending_)
				return false;
			return true;		
		}catch(Exception e){
			return false;
		}catch(Throwable t){			
			t.printStackTrace();
			return false;
		}
		//return true;
	}
*/
/*	
	public static BusinessLogicParam getBusinessLogicParam(String pIdParam) {
		try{
			Hashtable hash_ = getHashBusinessLogicParams();
			BusinessLogicParam answerParam_=null;
			if (hash_ != null) {
				answerParam_=(BusinessLogicParam)hash_.get(pIdParam);
			}
			if (answerParam_ == null) {
				loadBusinessParam(pIdParam);
				answerParam_=(BusinessLogicParam)getHashBusinessLogicParams().get(pIdParam);
			}
			if (answerParam_ == null) {	
				return new BusinessLogicParam("PAR_NO_FOUND","XX");
			} else {
				return answerParam_;
			}
		}catch(Exception e){		
			return new BusinessLogicParam("PAR_NO_FOUND","XX");
		}
	}

	public static Hashtable getHashBusinessLogicParams() {

		return aHashBusinessLogicParams;
	}
	
	private static void loadBusinessParam(String pParamId) {
		String paramValue_=null;										   	
		BusinessLogicParam param_=null; 
		try {
			ResourceBundle bundle_ = ResourceLocator.get(BUSINESSSETTINGS_FILENAME);
			paramValue_ = bundle_.getString(pParamId);
			if (aHashBusinessLogicParams==null)
				aHashBusinessLogicParams = new Hashtable();
			param_=new BusinessLogicParam();
			param_.setName(pParamId);
			param_.setValue(paramValue_.trim());		
			aHashBusinessLogicParams.put(pParamId,param_);
			aHashBusinessLogicParams.put(pParamId,param_);
			aHashBusinessLogicParams.put(pParamId,param_);
		}catch (NoSuchElementException ex1){
			System.out.println ("Elemento no definido correctamente en el archivo de parametros de negocio ");
			ex1.printStackTrace();
		}catch (Exception ex)  {
			System.out.println("ERROR: Parameter "+pParamId+" not properly defined in parameters file..." + ex);
		}		
	}	
	

	protected static String getCustomerTypesSentente(String pIdCustomer,String pCustTypes){
		String answer_;
		answer_ = "UPDATE " + BusinessLogicParameters.DB_TABLA_PUNTOS_CLIENTE +
				  "	SET " + BusinessLogicParameters.DB_COLUM_LPC_TIPOS_CLIENTE+"='"+pCustTypes +"'" +
				  " WHERE " + BusinessLogicParameters.DB_COLUM_LPC_COMPANY_ID+"=1"+
				  " AND "+ BusinessLogicParameters.DB_COLUM_LPC_ID_CLIENTE+"="+pIdCustomer;
				System.out.println("Sentencia->"+answer_);
		return answer_;					
			
	}
	*/
	
}
