/**
 * @author Alfonso Cadena ASIC Consuting Group
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.trxonline.sodimac.monitor.trx.functions;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.ac.utils.Manejaformato;
import com.asic.ac.utils.StringFormatter;
import com.asic.author.manager.trx.PosTransaction;
import com.asic.framework.exception.TransactionExistsException;
import com.asic.framework.factory.ServiceLocator;
import com.asic.transacciones.helpers.DemoHelper;
import com.asic.transacciones.helpers.GeneradorMensajeHelper;
import com.asic.transacciones.helpers.MQAdminHelper;
import com.asic.trxonline.sma.strings.AbstractTrxString;
import com.asic.trxonline.sodimac.monitor.trx.UserServerAnswer;
import com.asic.trxonline.tramas.TramaOrganizer;
import com.grpretail.business.transacciones.almacen.ConciliacionBusinessDelegate;
import com.grpretail.business.transacciones.vo.ALMACEN;
import com.grpretail.business.transacciones.vo.ALMACEN_Imp;
import com.grpretail.business.transacciones.vo.STORE_CLOSING;
import com.grpretail.business.transacciones.vo.STORE_CLOSING_Imp;
import com.grpretail.business.transacciones.vo.STORE_CONCILIATION_Imp;
import com.grpretail.support.vos.SUPPORT_STORE_Imp;
import com.grpretail.transacciones.update_controllers.ControllerMessenger;
import com.grpretail.trxonline.helpers.AuthorizerDBHelper;
import com.grpretail.trxonline.vos.Store500Vo;

public class RecibirTransaccionTest extends PosTransaction {
	static int cont_ = 0;
	protected int posDateTime; // Posición de fecha y hora del reporte
	protected String dateTime; // Fecha y hora del reporte

	/*
	protected int posCurrPartNum; // Posición del número de parte actual del mensaje
	protected String CurrPartNum; // Número de parte actual del mensaje.
	protected int posTotalPartNum; // Posición del número de partes total del mensaje.
	protected String totalPartNum; // Número de parte actual del mensaje.
	protected int posTramaProcesar; // Posición de la trama o segmento de trama a procesar.
	protected String tramaProcesar; // Trama o segmento de trama a procesar.
	*/	
	public static final int ANCHO_TOTAL_TRAMA;
	//public static final double RECEIVE_CHECKOUT_QUEUED_TRXONLINE_FUNCTION_CODE = 9994;
	//public static final double RECEIVE_QUEUED_TRXONLINE_FUNCTION_CODE = 9995;
	public static final double RECEIVE_TRXONLINE_FUNCTION_CODE = 9997;
	private static Hashtable stores;

	static {
		//String codProcesarTramaEncoladaCheckout_ = Manejaformato.formatoNumero(RECEIVE_CHECKOUT_QUEUED_TRXONLINE_FUNCTION_CODE, "0000");
		//String codProcesarTramaEncolada_ = Manejaformato.formatoNumero(RECEIVE_QUEUED_TRXONLINE_FUNCTION_CODE, "0000");
		String codProcesarTrama_ = Manejaformato.formatoNumero(RECEIVE_TRXONLINE_FUNCTION_CODE, "0000");

		int[] arregloDatosPtos_ = new int[] {
			12 // FechaHora formato yyyymmddhhmi
		};
		aParseDatos.put(codProcesarTrama_, arregloDatosPtos_);
		aParseRespuesta.put(codProcesarTrama_, new int[] {
		});
		
		//aParseDatos.put(codProcesarTramaEncolada_, arregloDatosPtos_);
		//aParseRespuesta.put(codProcesarTramaEncolada_, new int[] {
		//});	
		
		//aParseDatos.put(codProcesarTramaEncoladaCheckout_, arregloDatosPtos_);
		//aParseRespuesta.put(codProcesarTramaEncoladaCheckout_, new int[] {
		//});				

		int ancho_ = 0;
		for (int i = 0; i < arregloDatosPtos_.length; i++) {
			ancho_ += arregloDatosPtos_[i];
		}
		ANCHO_TOTAL_TRAMA = ANCHO_SOLICITUD_GENERICA + ancho_;
	}

	/**
	 * Constructor for ActualizaPuntos
	 */
	public RecibirTransaccionTest() throws Exception {
		super();
	}

	public void setTrama(String pTrama) throws Exception {
		super.setTrama(pTrama);
	}

	public static int getLongitudTrama() {
		return ANCHO_TOTAL_TRAMA;
	}

	/**
	 * @see PosTransaction#execute()
	 */
	public Object execute() {
		List res_ = null;

		GeneradorMensajeHelper generador_ = new GeneradorMensajeHelper();
		//MQAdminHelper helperMQ_ = new MQAdminHelper();
		try {
			try{
				String currentCompany_ = "1";
				DemoHelper dmp_=new DemoHelper();
				List stores_ = dmp_.getSupportStores();
				boolean store500Flag_ = false;
				Store500Vo store500DataObj_ = null;
				if (stores_ != null && stores_.size()>0){
					System.out.println("Recorriendo almacenes de soporte2");
					for(int i=0;i<stores_.size();i++){
						SUPPORT_STORE_Imp currStore_ = (SUPPORT_STORE_Imp)stores_.get(i);
						ALMACEN alm_ = new ALMACEN_Imp();
						alm_.setCODCCO(new Integer(currStore_.getTOL_ID().intValue())); 
						alm_.setCODEMP(new Integer(currentCompany_));
						alm_ = ((ConciliacionBusinessDelegate)ServiceLocator.getService
								(ConciliacionBusinessDelegate.class)).buscarAlmacen(alm_,currentCompany_);	
						if(alm_.getCODCCO().intValue()>0){
							if(alm_.getIP()!=null && !alm_.getIP().trim().equals("")){
								System.out.println("AlmacEn: "+ alm_.getNOMBRE().trim()+" Dir IP: "+alm_.getIP().trim());
								try{
										//************* RECUPERACION DE REGISTROS DE CIERRES DESDE LA DB ***********************//
										
										try{
											STORE_CLOSING storeClosing_ = new STORE_CLOSING_Imp();
											//java.util.Timestamp timeStamp_ = new Timestamp();
											Date storeClosingDate_ = new Date();
											/*
											date_.setYear(new Integer("2022").intValue()-1900);
											date_.setMonth(new Integer("01").intValue()-1);
											date_.setDate(new Integer("04").intValue());
											date_.setHours(new Integer("23").intValue());
											date_.setMinutes(new Integer("59").intValue());
											*/
											storeClosingDate_.setYear(new Integer(getDateTime().substring(0,4)).intValue()-1900);
											storeClosingDate_.setMonth(new Integer(getDateTime().substring(4,6)).intValue()-1);
											storeClosingDate_.setDate(new Integer(getDateTime().substring(6,8)).intValue());
											storeClosingDate_.setHours(new Integer(getDateTime().substring(8,10)).intValue());
											storeClosingDate_.setMinutes(new Integer(getDateTime().substring(10,12)).intValue());
											storeClosingDate_.setSeconds(0);
											System.out.println("Fecha a validar->"+storeClosingDate_);
											String strDateTime_ = StringFormatter.align((storeClosingDate_.getYear()+1900)+"",4,'0',0,4)+"-"+StringFormatter.align((storeClosingDate_.getMonth()+1)+"",2,'0',0,2)+"-"+
																  StringFormatter.align(storeClosingDate_.getDate()+"",2,'0',0,2)+" "+StringFormatter.align(storeClosingDate_.getHours()+"",2,'0',0,2)+":"+
																  StringFormatter.align(storeClosingDate_.getMinutes()+"",2,'0',0,2)+":"+StringFormatter.align(storeClosingDate_.getSeconds()+"",2,'0',0,2)+".00";
											System.out.println("Fecha para traer los cierres->"+strDateTime_);					  
											java.sql.Timestamp timeStamp_ = new java.sql.Timestamp(storeClosingDate_.getYear(),storeClosingDate_.getMonth()-1,storeClosingDate_.getDay(),storeClosingDate_.getHours(),storeClosingDate_.getMinutes(),storeClosingDate_.getSeconds(),0);
											//timeStamp_.set
											//storeClosing_.setSTORE(new Integer(535));
											storeClosing_.setSTORE(new Integer(currStore_.getTOL_ID().intValue()));
											storeClosing_.setFECHAHORA(timeStamp_);
											List storeClosings_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																	(ConciliacionBusinessDelegate.class)).getStoreClosings(storeClosing_,1,10,strDateTime_);
											if(storeClosings_ != null)						
												System.out.println("Tamano lista cierre->"+storeClosings_.size());
											else
												System.out.println("storeClosings_ es nula");							
											//if(storeClosings_!= null && storeClosings_.size()>0){
												if(storeClosings_== null)
													storeClosings_ = new ArrayList();
												for(int k=0;k<storeClosings_.size();k++){
													STORE_CLOSING currStrClos_ = (STORE_CLOSING)storeClosings_.get(k);
													System.out.println("Store closing["+k+"] AlmacEn:"+currStrClos_.getSTORE()+" Fecha:"+currStrClos_.getDAY()+" FechaHora:"+currStrClos_.getFECHAHORA());
 
												}
												String strIniDateTime_ = "";
												String strFinalDateTime_ = "";
												if(storeClosings_.size()>0){
													STORE_CLOSING currStrClos_ = (STORE_CLOSING)storeClosings_.get(0);
													Timestamp finDateTime_ = currStrClos_.getFECHAHORA();
													Timestamp iniDateTime_ = null;
													if(storeClosings_.size()>1){						
														currStrClos_ = (STORE_CLOSING)storeClosings_.get(1);
														iniDateTime_ = currStrClos_.getFECHAHORA();
														strIniDateTime_ = StringFormatter.align((iniDateTime_.getYear()+1900)+"",4,'0',0,4)+"-"+StringFormatter.align((iniDateTime_.getMonth()+1)+"",2,'0',0,2)+"-"+
																		  StringFormatter.align(iniDateTime_.getDate()+"",2,'0',0,2)+" "+StringFormatter.align(iniDateTime_.getHours()+"",2,'0',0,2)+":"+
																		  StringFormatter.align(iniDateTime_.getMinutes()+"",2,'0',0,2)+":"+StringFormatter.align(iniDateTime_.getSeconds()+"",2,'0',0,2)+".00";
													}else{// No hay una cierre antes de la fecha dada. Se toma como fecha inicial el 1o de enero de 1900
														Date date_ = new Date();
														date_.setYear(0);
														date_.setMonth(new Integer("01").intValue()-1);
														date_.setDate(new Integer("01").intValue());
														date_.setHours(new Integer("23").intValue());
														date_.setMinutes(new Integer("59").intValue());
														System.out.println("Fecha inicial a validar2->"+date_);
							
														strIniDateTime_ = StringFormatter.align((date_.getYear()+1900)+"",4,'0',0,4)+"-"+StringFormatter.align((date_.getMonth()+1)+"",2,'0',0,2)+"-"+
														StringFormatter.align(date_.getDate()+"",2,'0',0,2)+" "+StringFormatter.align(date_.getHours()+"",2,'0',0,2)+":"+
														StringFormatter.align(date_.getMinutes()+"",2,'0',0,2)+":"+StringFormatter.align(date_.getSeconds()+"",2,'0',0,2)+".00";								
													}
													strFinalDateTime_ = StringFormatter.align((finDateTime_.getYear()+1900)+"",4,'0',0,4)+"-"+StringFormatter.align((finDateTime_.getMonth()+1)+"",2,'0',0,2)+"-"+
																		StringFormatter.align(finDateTime_.getDate()+"",2,'0',0,2)+" "+StringFormatter.align(finDateTime_.getHours()+"",2,'0',0,2)+":"+
																		StringFormatter.align(finDateTime_.getMinutes()+"",2,'0',0,2)+":"+StringFormatter.align(finDateTime_.getSeconds()+"",2,'0',0,2)+".00";						
													System.out.println("Fecha final a validar2->"+strFinalDateTime_);
												}else{ //// No hay fechas de cierres para el almacén. La fecha inicial es el 1o de enero de 1900 y la final la fecha dada
													Date date_ = new Date();
													date_.setYear(0);
													date_.setMonth(new Integer("01").intValue()-1);
													date_.setDate(new Integer("01").intValue());
													date_.setHours(new Integer("00").intValue());
													date_.setMinutes(new Integer("00").intValue());
													System.out.println("Fecha inicial a validar->"+date_);
							
													strIniDateTime_ = StringFormatter.align((date_.getYear()+1900)+"",4,'0',0,4)+"-"+StringFormatter.align((date_.getMonth()+1)+"",2,'0',0,2)+"-"+
													StringFormatter.align(date_.getDate()+"",2,'0',0,2)+" "+StringFormatter.align(date_.getHours()+"",2,'0',0,2)+":"+
													StringFormatter.align(date_.getMinutes()+"",2,'0',0,2)+":"+StringFormatter.align(date_.getSeconds()+"",2,'0',0,2)+".00";

													date_ = new Date();
													
													date_.setYear(new Integer(getDateTime().substring(0,4)).intValue()-1900);
													date_.setMonth(new Integer(getDateTime().substring(4,6)).intValue()-1);
													date_.setDate(new Integer(getDateTime().substring(6,8)).intValue());
													date_.setHours(new Integer(getDateTime().substring(8,10)).intValue());
													date_.setMinutes(new Integer(getDateTime().substring(10,12)).intValue());
													date_.setSeconds(0);
																										
													System.out.println("Fecha final a validar->"+date_);
												
													strFinalDateTime_ = StringFormatter.align((date_.getYear()+1900)+"",4,'0',0,4)+"-"+StringFormatter.align((date_.getMonth()+1)+"",2,'0',0,2)+"-"+
													StringFormatter.align(date_.getDate()+"",2,'0',0,2)+" "+StringFormatter.align(date_.getHours()+"",2,'0',0,2)+":"+
													StringFormatter.align(date_.getMinutes()+"",2,'0',0,2)+":"+StringFormatter.align(date_.getSeconds()+"",2,'0',0,2)+".00";
													System.out.println("Fecha final a validar3->"+strFinalDateTime_);												
												}
												//String store_ = "535";
												String store_ = alm_.getCODCCO().intValue()+"";
												System.out.println("Fecha inicial reporte->"+strIniDateTime_);
												System.out.println("Fecha final reporte->"+strFinalDateTime_);
												
												//*************** REVISA SI EL ALMACEN YA FUE CONCILIADO ANTERIORMENTE ***************//
												if(!AuthorizerDBHelper.existsConciliationRegister(store_, strIniDateTime_, strFinalDateTime_)){
													//*************** TRAE VALORES DESDE LA CONTROLADORA ***************//
													boolean result_=false;
													String url1_ = alm_.getIP().trim(); //"10.28.100.3";
													String url2_ = alm_.getIP().trim(); //"10.28.100.3";
													//int port_ = 5003;
													int port_ = 5002;
													//String keyRegister_ = "05352201042355";
										
													//String keyRegister_ = StringFormatter.align(alm_.getCODCCO().intValue()+"",);
													//String keyRegister_ = StringFormatter.align(alm_.getCODCCO().intValue()+"",4,'0',0,4)+getDateTime().substring(2);
													String strCodCco_ = alm_.getCODCCO().intValue()+"";
													if(strCodCco_.equals("500")){
														System.out.println("Es el centro de costo 785 fantasma. Hay que cambiar el centro costo para consulta controladora");
														strCodCco_ = "785";
														store500Flag_ = true; // Indica que es el Centro Costo 500 que es el almacén 785 fantasma 
													}else{
														System.out.println("NO es el centro de costo 785 fantasma.");
														store500Flag_ = false; // Indica que es el Centro Costo 500 que es el almacén 785 fantasma
													}
													String keyRegister_ = StringFormatter.align(strCodCco_,4,'0',0,4)+
																		  strFinalDateTime_.substring(2,4) + strFinalDateTime_.substring(5,7)+
																		  strFinalDateTime_.substring(8,10) +strFinalDateTime_.substring(11,13)+
																		  strFinalDateTime_.substring(14,16);
													System.out.println("Llave para recuperar registro en controladora->"+keyRegister_);
													Object[] anwser=ControllerMessenger.getStoreSellTotals(url1_,url2_,port_+"",keyRegister_);
													if(anwser != null && anwser.length>=8){
														for(int j=2;j<anwser.length;j++){
															System.out.println("Dato["+j+"]: "+(String)anwser[j]);
														}
														System.out.println("Llave del registro->"+(String)anwser[2]);
														System.out.println("Gross positivo->"+(String)anwser[3]);
														System.out.println("Gross negativo->"+(String)anwser[4]);
														System.out.println("Gross descuentos->"+(String)anwser[5]);
														System.out.println("No movimientos o clientes->"+(String)anwser[6]);
														System.out.println("No Items vendidos->"+(String)anwser[7]);
														System.out.println("Monto Items miscelaneos->"+(String)anwser[8]);
														long storeGrossSales_ = -1;
														long storeVoids_ = -1;
														long storeDiscounts_ = -1;
														String strStoreDiscounts_ = "";
														long storeTicketsNum_ = -1;
														long storeSoldItemsNum_ = -1;
														String strStoreSoldItemsNum_ = "";
														long storeMiscellaneousAmt_ = -1;															
														try{
															storeGrossSales_ = new Long((String)anwser[3]).longValue();
															storeVoids_ = new Long((String)anwser[4]).longValue();
															storeDiscounts_ = new Long((String)anwser[5]).longValue();
															strStoreDiscounts_ = (String)anwser[5];
															storeTicketsNum_ = new Long((String)anwser[6]).longValue();
															storeSoldItemsNum_ = new Long((String)anwser[7]).longValue();
															strStoreSoldItemsNum_ = (String)anwser[7];
															storeMiscellaneousAmt_ = new Long((String)anwser[8]).longValue();
															if(store500Flag_){ // Es el Centro Costo 500 que es el almacén 785 fantasma
																store500DataObj_ = new Store500Vo();
																store500DataObj_.setStoreGrossSales(storeGrossSales_);
																store500DataObj_.setStoreVoids(storeVoids_);
																store500DataObj_.setStoreDiscounts(storeDiscounts_);
																store500DataObj_.setStoreTicketsNum(storeTicketsNum_);
																store500DataObj_.setStoreSoldItemsNum(storeSoldItemsNum_);
																store500DataObj_.setStoreMiscellaneousAmt(storeMiscellaneousAmt_);
															}
														}catch(Exception e){
															System.out.println("Exception transformando valores traIdos de cotroladora");
															storeGrossSales_ = -1;
														}
														if(store500Flag_){
															System.out.println("Es el almacEn 500 no se consulta a la DB");
														}else{
															boolean normalPath_ = true; // Para continuar con el flujo normal
															if(strCodCco_.equals("785")){
																if(store500DataObj_ != null){
																	normalPath_ = false;
																	System.out.println("Es el centro costo 785 y hay información del centro costo 500. Se continUa con el flujo especial de conciliaciOn");
																}else
																	System.out.println("Es el centro costo 785 pero no hay información del centro costo 500. Se continUa con el flujo normal");
															}else
																System.out.println("NO es el centro costo 785 pero no hay información del centro costo 500. Se continUa con el flujo normal");
																
																
															if(normalPath_){ // Flujo de conciliación normal	
																try{
																	Long dbGrossSales_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																						(ConciliacionBusinessDelegate.class)).getGrossSales(store_, strIniDateTime_, strFinalDateTime_);
																	System.out.println("Gross Sales recuperado->"+dbGrossSales_);
																	if(storeGrossSales_>=0 && storeGrossSales_ == dbGrossSales_.longValue()){
																		
																		try{
																			Long dbVoids_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																								(ConciliacionBusinessDelegate.class)).getVoidedItemsAmount(store_, strIniDateTime_, strFinalDateTime_);
																			System.out.println("Anulaciones recuperadas->"+dbVoids_);
																			if(storeVoids_ == dbVoids_.longValue()){
																				try{
																					Long dbRefunds_ = new Long(0);
																					//Long dbRefunds_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																					//					(ConciliacionBusinessDelegate.class)).getRefundedItemsAmount(store_, strIniDateTime_, strFinalDateTime_);
																					//System.out.println("Devoluciones recuperadas->"+dbRefunds_);
																					//if(storeVoids_ == dbVoids_.longValue()){
																						try{					
																							Long dbDiscounts_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																												(ConciliacionBusinessDelegate.class)).getDiscountsAmount(store_, strIniDateTime_, strFinalDateTime_);
																							System.out.println("Descuentos recuperados->"+dbDiscounts_);
																							if(storeDiscounts_ == dbDiscounts_.longValue() || isNegativeValueInPOSFileVII(storeDiscounts_, dbDiscounts_.longValue())){
																								Long dbMiscellaneous_ = new Long(0);
																								try{
																									
																									dbMiscellaneous_ = ((ConciliacionBusinessDelegate)ServiceLocator.getService
																													 (ConciliacionBusinessDelegate.class)).getMiscellaneous(store_, strIniDateTime_, strFinalDateTime_);
																									System.out.println("ArtIculos miscelaneos vendidos->"+dbMiscellaneous_);
																									if(dbMiscellaneous_.longValue()<0){
																										dbMiscellaneous_ = new Long(dbMiscellaneous_.longValue() * (-1));
																										System.out.println("ArtIculos miscelaneos vendidos convertido->"+dbMiscellaneous_);
																									}
																									
																									if(storeMiscellaneousAmt_ == dbMiscellaneous_.longValue() || storeMiscellaneousAmt_ == (dbMiscellaneous_.longValue()*(-1)) ){
																										
																										Long dbVoidedTrxsAmount_ = new Long(0);
																										/*
																										try{
																											dbVoidedTrxsAmount_ = ((ConciliacionBusinessDelegate)ServiceLocator.getService
																															 (ConciliacionBusinessDelegate.class)).getVoidedTrxsAmount(store_, strIniDateTime_, strFinalDateTime_);
																											System.out.println("Monto trxs anuladas recuperado->"+dbVoidedTrxsAmount_);
																										}catch(Exception e){
																											e.printStackTrace();
																										}
																										*/
																										Long dbGrossPositive_ = new Long(0);
																										/*
																										try{
																											dbGrossPositive_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																																(ConciliacionBusinessDelegate.class)).getGrossPositive(store_, strIniDateTime_, strFinalDateTime_);
																											System.out.println("Gross positivo recuperado->"+dbGrossPositive_);																
																										}catch(Exception e){
																											e.printStackTrace();
																										}
																										*/
																										Long dbGrossNegative_ = new Long(0);
																										/*
																										try{
																											dbGrossNegative_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																																(ConciliacionBusinessDelegate.class)).getGrossNegative(store_, strIniDateTime_, strFinalDateTime_);
																											System.out.println("Gross negativo recuperado->"+dbGrossNegative_);																	
																										}catch(Exception e){
																											e.printStackTrace();
																										}
																										*/
																										Long dbCustomerOrTicketsNumber_ =  new Long(0);																								
																										try{
																											dbCustomerOrTicketsNumber_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																																(ConciliacionBusinessDelegate.class)).getCustomersOrTicketsNumber(store_, strIniDateTime_, strFinalDateTime_);
																											System.out.println("customerOrTicketsNumber_ recuperado->"+dbCustomerOrTicketsNumber_);
																											if(storeTicketsNum_ == dbCustomerOrTicketsNumber_.longValue()){
																												
																												Long dbStoreCoupons_ = new Long(0);
																												/*
																												try{						
																													dbStoreCoupons_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																																		(ConciliacionBusinessDelegate.class)).getStoreCoupons(store_, strIniDateTime_, strFinalDateTime_);
																													System.out.println("storeCoupons_ recuperado->"+dbStoreCoupons_);															
																												}catch(Exception e){
																													e.printStackTrace();
																												}
																												*/
																												Long dbSoldItemsNumber_ = new Long(0);
																												try{					
																													dbSoldItemsNumber_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																																		(ConciliacionBusinessDelegate.class)).getSoldItemsNumber(store_, strIniDateTime_, strFinalDateTime_);
																													System.out.println("soldItemsNumber_ recuperado->"+dbSoldItemsNumber_);
																													if(storeSoldItemsNum_ == dbSoldItemsNumber_.longValue() || isNegativeValueInPOSFile(strStoreSoldItemsNum_, dbSoldItemsNumber_.longValue())){
																														System.out.println("");
																														System.out.println("//********************************************************************************************//");
																														System.out.println("//********** ALMACEN: "+alm_.getCODCCO().intValue()+" CONCILIADO SATISFACTORIAMENTE **********//");
																														System.out.println("//********************************************************************************************//");
																														System.out.println("");
																														STORE_CONCILIATION_Imp objToInsert_ = new STORE_CONCILIATION_Imp();
																														objToInsert_.setSTORE_ID(new Integer(store_));
																														objToInsert_.setGROSS_SALES(dbGrossSales_);
																														objToInsert_.setVOIDED_ITEMS(dbVoids_);
																														objToInsert_.setREFUNDED_ITEMS(dbRefunds_);
																														objToInsert_.setTOTAL_DISCOUNTS(dbDiscounts_);
																														objToInsert_.setMISCELLA_AMOUNT(dbMiscellaneous_);
																														objToInsert_.setVOIDED_TRXS_AMT(dbVoidedTrxsAmount_);
																														objToInsert_.setITM_GROSS_POSIT(dbGrossPositive_);
																														objToInsert_.setITM_GROSS_NEGAT(dbGrossNegative_);
																														objToInsert_.setCUST_TICKET_NUM(dbCustomerOrTicketsNumber_);
																														objToInsert_.setSTORE_COUPONS(dbStoreCoupons_);
																														objToInsert_.setITEMS_SOLDS_NUM(dbSoldItemsNumber_);
																														objToInsert_.setFECHAHORA_INI(strIniDateTime_);
																														objToInsert_.setFECHAHORA_FIN(strFinalDateTime_);
																														//boolean answer_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																														//					(ConciliacionBusinessDelegate.class)).insertStoreConciliation(objToInsert_);
																														try{
																															if(AuthorizerDBHelper.insertStoreConciliation(objToInsert_))
																																System.out.println("Registro conciliaciOn insertado satisfactoriamente");
																															else
																																System.out.println("Registro conciliaciOn NO insertado satisfactoriamente");	
																														}catch(Exception e2){
																															System.out.println("Exception inserting register");
																															e2.printStackTrace();
																														}																															
																													}else{
																														System.out.println("No Items vendidos no concilia para el almacEn:"+alm_.getCODCCO().intValue());
																														showTotalDBValueSummary(store_, strIniDateTime_, strFinalDateTime_);
																													}	
																												}catch(Exception e){
																													e.printStackTrace();
																												}																																																														
																											}else{
																												System.out.println("No tickets no concilia para el almacEn:"+alm_.getCODCCO().intValue());
																												showTotalDBValueSummary(store_, strIniDateTime_, strFinalDateTime_);
																											}																						
																										}catch(Exception e){
																											e.printStackTrace();
																										}
																									}else{
																										System.out.println("Monto de Items miscelaneos vendidos no concilia para el almacEn:"+alm_.getCODCCO().intValue());
																										showTotalDBValueSummary(store_, strIniDateTime_, strFinalDateTime_);
																									}																								
																								}catch(Exception e){
																									e.printStackTrace();
																								}
																							}else{
																								System.out.println("Discounts no concilia para el almacEn:"+alm_.getCODCCO().intValue());
																								showTotalDBValueSummary(store_, strIniDateTime_, strFinalDateTime_);		
																							}	
																								
																						}catch(Exception e){
																							e.printStackTrace();
																						}	
				
																																								
																					//}else
																						//System.out.println();	
																				}catch(Exception e){
																					e.printStackTrace();
																				}
				
																																				
																			}else{
																				System.out.println("Store Voids no concilia para el almacEn:"+alm_.getCODCCO().intValue());
																				showTotalDBValueSummary(store_, strIniDateTime_, strFinalDateTime_);
																			}	
																		}catch(Exception e){
																			e.printStackTrace();
																		}	
																																
																		
																	}else{
																		System.out.println("GrossSales no concilia para el almacEn:"+alm_.getCODCCO().intValue());
																		showTotalDBValueSummary(store_, strIniDateTime_, strFinalDateTime_);
																	}	
																}catch(Exception e){
																	e.printStackTrace();
																}
															}else{ // Flujo de conciliación especial. Por ejemplo para el centro de costo 785
																System.out.println("Ejecutando flujo especial");
																try{
																	Long dbGrossSales_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																						(ConciliacionBusinessDelegate.class)).getGrossSales(store_, strIniDateTime_, strFinalDateTime_);
																	System.out.println("Gross Sales recuperado->"+dbGrossSales_+" Acumulado 785->"+(storeGrossSales_+store500DataObj_.getStoreGrossSales()));
																	if(storeGrossSales_>=0 && (storeGrossSales_+store500DataObj_.getStoreGrossSales()) == dbGrossSales_.longValue()){
																		try{
																			Long dbVoids_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																								(ConciliacionBusinessDelegate.class)).getVoidedItemsAmount(store_, strIniDateTime_, strFinalDateTime_);
																			System.out.println("Anulaciones recuperadas->"+dbVoids_+" Acumulado 785->"+(storeVoids_+store500DataObj_.getStoreVoids()));
																			if((storeVoids_+store500DataObj_.getStoreVoids()) == dbVoids_.longValue()){
																				try{
																					Long dbRefunds_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																										(ConciliacionBusinessDelegate.class)).getRefundedItemsAmount(store_, strIniDateTime_, strFinalDateTime_);
																					System.out.println("Devoluciones recuperadas->"+dbRefunds_);
																					//if(storeVoids_ == dbVoids_.longValue()){
																						try{					
																							Long dbDiscounts_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																												(ConciliacionBusinessDelegate.class)).getDiscountsAmount(store_, strIniDateTime_, strFinalDateTime_);
																							System.out.println("Descuentos recuperados->"+dbDiscounts_+" Acumulado 785->"+(storeDiscounts_+store500DataObj_.getStoreDiscounts()));
																							if((storeDiscounts_+store500DataObj_.getStoreDiscounts()) == dbDiscounts_.longValue()){
																								Long dbMiscellaneous_ = new Long(0);
																								try{
																									dbMiscellaneous_ = ((ConciliacionBusinessDelegate)ServiceLocator.getService
																													 (ConciliacionBusinessDelegate.class)).getMiscellaneous(store_, strIniDateTime_, strFinalDateTime_);
																									System.out.println("ArtIculos miscelaneos vendidos->"+dbMiscellaneous_);
																									if(dbMiscellaneous_.longValue()<0){
																										dbMiscellaneous_ = new Long(dbMiscellaneous_.longValue() * (-1));
																										System.out.println("ArtIculos miscelaneos vendidos convertido->"+dbMiscellaneous_+" Acumulado 785->"+(storeMiscellaneousAmt_+store500DataObj_.getStoreMiscellaneousAmt()));
																									}
																									if((storeMiscellaneousAmt_+store500DataObj_.getStoreMiscellaneousAmt()) == dbMiscellaneous_.longValue() || storeMiscellaneousAmt_ == (dbMiscellaneous_.longValue()*(-1)) ){
																										Long dbVoidedTrxsAmount_ = new Long(0);
																										try{
																											dbVoidedTrxsAmount_ = ((ConciliacionBusinessDelegate)ServiceLocator.getService
																															 (ConciliacionBusinessDelegate.class)).getVoidedTrxsAmount(store_, strIniDateTime_, strFinalDateTime_);
																											System.out.println("Monto trxs anuladas recuperado->"+dbVoidedTrxsAmount_);
																										}catch(Exception e){
																											e.printStackTrace();
																										}
																										Long dbGrossPositive_ = new Long(0);
																										try{
																											dbGrossPositive_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																																(ConciliacionBusinessDelegate.class)).getGrossPositive(store_, strIniDateTime_, strFinalDateTime_);
																											System.out.println("Gross positivo recuperado->"+dbGrossPositive_);																
																										}catch(Exception e){
																											e.printStackTrace();
																										}
																										Long dbGrossNegative_ = new Long(0);
																										try{
																											dbGrossNegative_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																																(ConciliacionBusinessDelegate.class)).getGrossNegative(store_, strIniDateTime_, strFinalDateTime_);
																											System.out.println("Gross negativo recuperado->"+dbGrossNegative_);																	
																										}catch(Exception e){
																											e.printStackTrace();
																										}
																										Long dbCustomerOrTicketsNumber_ =  new Long(0);																								
																										try{
																											dbCustomerOrTicketsNumber_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																																(ConciliacionBusinessDelegate.class)).getCustomersOrTicketsNumber(store_, strIniDateTime_, strFinalDateTime_);
																											System.out.println("customerOrTicketsNumber_ recuperado->"+dbCustomerOrTicketsNumber_+" Acumulado 785->"+(storeTicketsNum_+store500DataObj_.getStoreTicketsNum()));
																											if((storeTicketsNum_+store500DataObj_.getStoreTicketsNum()) == dbCustomerOrTicketsNumber_.longValue()){
																												Long dbStoreCoupons_ = new Long(0);
																												try{						
																													dbStoreCoupons_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																																		(ConciliacionBusinessDelegate.class)).getStoreCoupons(store_, strIniDateTime_, strFinalDateTime_);
																													System.out.println("storeCoupons_ recuperado->"+dbStoreCoupons_);															
																												}catch(Exception e){
																													e.printStackTrace();
																												}
																												Long dbSoldItemsNumber_ = new Long(0);
																												try{					
																													dbSoldItemsNumber_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																																		(ConciliacionBusinessDelegate.class)).getSoldItemsNumber(store_, strIniDateTime_, strFinalDateTime_);
																													System.out.println("soldItemsNumber_ recuperado->"+dbSoldItemsNumber_+" Acumulado 785->"+(storeSoldItemsNum_+store500DataObj_.getStoreSoldItemsNum()));
																													if((storeSoldItemsNum_+store500DataObj_.getStoreSoldItemsNum()) == dbSoldItemsNumber_.longValue()){
																														System.out.println("");
																														System.out.println("//********************************************************************************************//");
																														System.out.println("//********** ALMACEN: "+alm_.getCODCCO().intValue()+" CONCILIADO SATISFACTORIAMENTE **********//");
																														System.out.println("//********************************************************************************************//");
																														System.out.println("");
																														STORE_CONCILIATION_Imp objToInsert_ = new STORE_CONCILIATION_Imp();
																														objToInsert_.setSTORE_ID(new Integer(store_));
																														objToInsert_.setGROSS_SALES(dbGrossSales_);
																														objToInsert_.setVOIDED_ITEMS(dbVoids_);
																														objToInsert_.setREFUNDED_ITEMS(dbRefunds_);
																														objToInsert_.setTOTAL_DISCOUNTS(dbDiscounts_);
																														objToInsert_.setMISCELLA_AMOUNT(dbMiscellaneous_);
																														objToInsert_.setVOIDED_TRXS_AMT(dbVoidedTrxsAmount_);
																														objToInsert_.setITM_GROSS_POSIT(dbGrossPositive_);
																														objToInsert_.setITM_GROSS_NEGAT(dbGrossNegative_);
																														objToInsert_.setCUST_TICKET_NUM(dbCustomerOrTicketsNumber_);
																														objToInsert_.setSTORE_COUPONS(dbStoreCoupons_);
																														objToInsert_.setITEMS_SOLDS_NUM(dbSoldItemsNumber_);
																														objToInsert_.setFECHAHORA_INI(strIniDateTime_);
																														objToInsert_.setFECHAHORA_FIN(strFinalDateTime_);
																														//boolean answer_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
																														//					(ConciliacionBusinessDelegate.class)).insertStoreConciliation(objToInsert_);
																														try{
																															if(AuthorizerDBHelper.insertStoreConciliation(objToInsert_))
																																System.out.println("Registro conciliaciOn insertado satisfactoriamente");
																															else
																																System.out.println("Registro conciliaciOn NO insertado satisfactoriamente");	
																														}catch(Exception e2){
																															System.out.println("Exception inserting register");
																															e2.printStackTrace();
																														}																															
																													}else{
																														System.out.println("No Items vendidos no concilia para el almacEn:"+alm_.getCODCCO().intValue());
																														showTotalDBValueSummary(store_, strIniDateTime_, strFinalDateTime_);
																													}	
																												}catch(Exception e){
																													e.printStackTrace();
																												}																																																														
																											}else{
																												System.out.println("No tickets no concilia para el almacEn:"+alm_.getCODCCO().intValue());
																												showTotalDBValueSummary(store_, strIniDateTime_, strFinalDateTime_);
																											}																						
																										}catch(Exception e){
																											e.printStackTrace();
																										}
																									}else{
																										System.out.println("Monto de Items miscelaneos vendidos no concilia para el almacEn:"+alm_.getCODCCO().intValue());
																										showTotalDBValueSummary(store_, strIniDateTime_, strFinalDateTime_);
																									}																								
																								}catch(Exception e){
																									e.printStackTrace();
																								}
																							}else{
																								System.out.println("Discounts no concilia para el almacEn:"+alm_.getCODCCO().intValue());
																								showTotalDBValueSummary(store_, strIniDateTime_, strFinalDateTime_);		
																							}	
																									
																						}catch(Exception e){
																							e.printStackTrace();
																						}	
					
																																									
																					//}else
																						//System.out.println();	
																				}catch(Exception e){
																					e.printStackTrace();
																				}
					
																																					
																			}else{
																				System.out.println("Store Voids no concilia para el almacEn:"+alm_.getCODCCO().intValue());
																				showTotalDBValueSummary(store_, strIniDateTime_, strFinalDateTime_);
																			}	
																		}catch(Exception e){
																			e.printStackTrace();
																		}	
																																	
																			
																	}else{
																		System.out.println("GrossSales no concilia para el almacEn:"+alm_.getCODCCO().intValue());
																		showTotalDBValueSummary(store_, strIniDateTime_, strFinalDateTime_);
																	}	
																}catch(Exception e){
																	e.printStackTrace();
																}																
															}	
														}
													}else
														System.out.println("Respuesta no tiene los datos necesarios");
												}else{ // Almacén conciliado con anterioridad
													System.out.println("");
													System.out.println("//********************************************************************************************//");
													System.out.println("//********** ALMACEN: "+alm_.getCODCCO().intValue()+" CONCILIADO SATISFACTORIAMENTE(A)**********//");
													System.out.println("//********************************************************************************************//");
													System.out.println("");
												}
											//}else
												//System.out.println("Lista de cierres es nula");
										}catch(Exception e){
											e.printStackTrace();			
										}
										//********************* FIN RECUPERACION DE DATOS DESDE LA DB ****************//										
																			
				
								}catch(Exception e){
									e.printStackTrace();
								}								
							}else{
								System.out.println("IP de almacEn es nula");		
							}
						}else
							System.out.println("AlmacEn "+currStore_.getTOL_ID().intValue()+" no encontrado en DB");
						//((AdminUsuariosBusinessDelegate) ServiceLocator.getService(
						//  AdminUsuariosBusinessDelegate.class)).createUsuario((USUARIO)((UserForm)form).getVO());
					}										
					
				}
			}catch(Exception e){
				e.printStackTrace();	
			}


			

			
			//System.out.println(result_.);
			
			setRespuestaServidor(getRespuestaServidor(UserServerAnswer.ID_TOTAL_TRAMA_STORED));
			setCodRespuesta(ID_APPL_SUCCESS_CODE);
			setCodControl(ID_TRX_SUCCESS_CODE);						
		} catch (Exception e) {
			removeStore(getTienda());
			e.printStackTrace();
			setRespuestaServidor(getRespuestaServidor(UserServerAnswer.ID_ERROR_DESCONOCIDO));
			setCodRespuesta(ID_APPL_ERROR_CODE);
			setCodControl(ID_TRX_SUCCESS_CODE);
			//LogWriter.getLog().log(LogWriter.WARNING, "Generando mensaje [execute(...) en RecibirTransaccion", e);
			
		} catch (Throwable t){
			removeStore(getTienda());
			t.printStackTrace();
			setRespuestaServidor(getRespuestaServidor(UserServerAnswer.ID_ERROR_DESCONOCIDO));
			setCodRespuesta(ID_APPL_ERROR_CODE);
			setCodControl(ID_TRX_SUCCESS_CODE);
			//LogWriter.getLog().log(LogWriter.WARNING, "Generando mensaje [execute(...) en RecibirTransaccion", t);
		} finally {
			aRta.setRespuestaHost(getRespuestaServidor().getCodigo());
			aRta.setMensajeHost(getRespuestaServidor().getMensaje());
		}
		/*
		System.out.println("[Trama de entrada] "+getTotalTrama()+" [Salida]"+
		"toString->"+getRespuesta()+
		"CodRespuesta->"+getRespuesta().getCodRespuesta()+
		"CodRtaTrx->"+getRespuesta().getCodRtaTrans()+
		"Mensaje Host->"+getRespuesta().getMensajeHost()+
		"Rta Host->"+getRespuesta().getRespuestaHost()+
		"Rta no genérica->"+getRespuesta().getRespuestaNoGenerica());*/
		return (Object) getRespuesta();
	}
	
	public static boolean isNegativeValueInPOSFile(String pStoreSoldItemsNumValue, long pDBValue){
		System.out.println("Desde isNegativeValueInPOSFile");
		if(pStoreSoldItemsNumValue != null && pStoreSoldItemsNumValue.length()>2 && pStoreSoldItemsNumValue.startsWith("13")){
			long newValue_ = new Long(pStoreSoldItemsNumValue.substring(2)).longValue();
			System.out.println("newValue_->"+newValue_);
			newValue_ = newValue_ * (-1);
			if(newValue_ == pDBValue){
				System.out.println("Pasó las validaciones como negativo");
				return true;
			}
		}
		return false;
		
		
	}
	
	public static boolean isNegativeValueInPOSFileVII(long pStoreSoldItemsNumValue, long pDBValue){
			System.out.println("Desde isNegativeValueInPOSFileVII");
			//if(pStoreSoldItemsNumValue != null && pStoreSoldItemsNumValue.length()>2 && pStoreSoldItemsNumValue.startsWith("13")){
				long newValue_ = pStoreSoldItemsNumValue;
				System.out.println("newValue_->"+newValue_);
				newValue_ = newValue_ * (-1);
				if(newValue_ == pDBValue){
					System.out.println("Pasó las validaciones como negativo");
					return true;
				}
			//}
			return false;
		
		
		}

	/**
	 * @see PosTransaction#setOtrosParam(int)
	 */
	public void setOtrosParam(int pAF) {
		setPosDateTime(0);
		setDateTime(getDatosElement(getPosDateTime()).trim());
		/*
		setPosCurrPartNum(1);
		setCurrPartNum(getDatosElement(getPosCurrPartNum()).trim());
		setPosTotalPartNum(2);
		setTotalPartNum(getDatosElement(getPosTotalPartNum()).trim());
		setPosTramaProcesar(3);
		setTramaProcesar(getDatosElement(getPosTramaProcesar()).trim());
		*/
	}
	
	void setStore(String pStore){
		if(stores==null)
			stores=new Hashtable();		
		stores.put(pStore,new Date());
		
	}
	
	synchronized boolean getStore(String pStore){
		if(stores==null){
			stores=new Hashtable();
			setStore(pStore);
			return false;
		}
		System.out.println("No stores concurrentes->"+stores.size());
		if(stores.get(pStore)==null){
			setStore(pStore);
			return false;
		}else{
			Date dt_ = (Date)stores.get(pStore);
			Date currDt_ = new Date();
			if ((currDt_.getTime()-dt_.getTime())>3600000 || (currDt_.getTime()-dt_.getTime())<0)
				stores.remove(pStore);
		}
			
		return true;	
	}
	
	void removeStore(String pStore){
		if(stores==null)
			stores=new Hashtable();		
		stores.remove(pStore);
	}
	/**
	 * @return
	 */
	public String getDateTime() {
		return dateTime;
	}

	/**
	 * @return
	 */
	public int getPosDateTime() {
		return posDateTime;
	}

	/**
	 * @param string
	 */
	public void setDateTime(String string) {
		dateTime = string;
	}

	/**
	 * @param i
	 */
	public void setPosDateTime(int i) {
		posDateTime = i;
	}

	public void showTotalDBValueSummary(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal){
		Long dbGrossSales_ =  new Long(0);
		try{
			dbGrossSales_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
								(ConciliacionBusinessDelegate.class)).getGrossSales(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
		}catch(Exception e){
			e.printStackTrace();
		}			
		Long dbVoids_ = new Long(0);
		try{
			dbVoids_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
								(ConciliacionBusinessDelegate.class)).getVoidedItemsAmount(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
		}catch(Exception e){
			e.printStackTrace();
		}
		/*
		Long dbRefunds_ = new Long(0);
		try{
			dbRefunds_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
								(ConciliacionBusinessDelegate.class)).getRefundedItemsAmount(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
		}catch(Exception e){
			e.printStackTrace();
		}				
		*/
		Long dbDiscounts_ = new Long(0);
		try{					
			dbDiscounts_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
								(ConciliacionBusinessDelegate.class)).getDiscountsAmount(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
		}catch(Exception e){
			e.printStackTrace();
		}				
		Long dbMiscellaneous_ = new Long(0);
		try{
			dbMiscellaneous_ = ((ConciliacionBusinessDelegate)ServiceLocator.getService
							 (ConciliacionBusinessDelegate.class)).getMiscellaneous(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
		}catch(Exception e){
			e.printStackTrace();
		}
		/*
		Long dbVoidedTrxsAmount_ = new Long(0);
		try{
			dbVoidedTrxsAmount_ = ((ConciliacionBusinessDelegate)ServiceLocator.getService
							 (ConciliacionBusinessDelegate.class)).getVoidedTrxsAmount(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
		}catch(Exception e){
			e.printStackTrace();
		}
		Long dbGrossPositive_ = new Long(0);
		try{
			dbGrossPositive_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
								(ConciliacionBusinessDelegate.class)).getGrossPositive(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
		}catch(Exception e){
			e.printStackTrace();
		}
		Long dbGrossNegative_ = new Long(0);
		try{
			dbGrossNegative_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
								(ConciliacionBusinessDelegate.class)).getGrossNegative(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
		}catch(Exception e){
			e.printStackTrace();
		}
		*/
		Long dbCustomerOrTicketsNumber_ =  new Long(0);																								
		try{
			dbCustomerOrTicketsNumber_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
								(ConciliacionBusinessDelegate.class)).getCustomersOrTicketsNumber(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
		}catch(Exception e){
			e.printStackTrace();
		}
		/*								
		Long dbStoreCoupons_ = new Long(0);
		try{						
			dbStoreCoupons_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
								(ConciliacionBusinessDelegate.class)).getStoreCoupons(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
		}catch(Exception e){
			e.printStackTrace();
		}
		*/
		Long dbSoldItemsNumber_ = new Long(0);
		try{					
			dbSoldItemsNumber_ =  ((ConciliacionBusinessDelegate)ServiceLocator.getService
								(ConciliacionBusinessDelegate.class)).getSoldItemsNumber(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("//********************************************************************************************//");
		System.out.println("**************************** RESUMEN ALMACEN NO CONCILIADO ***********************************//");
		System.out.println("Gross Sales recuperado->"+dbGrossSales_);								
		System.out.println("Anulaciones recuperadas->"+dbVoids_);					
		//System.out.println("Devoluciones recuperadas->"+dbRefunds_);					
		System.out.println("Descuentos recuperados->"+dbDiscounts_);						
		System.out.println("ArtIculos miscelaneos vendidos->"+dbMiscellaneous_);																											 
		//System.out.println("Monto trxs anuladas recuperado->"+dbVoidedTrxsAmount_);																												
		//System.out.println("Gross positivo recuperado->"+dbGrossPositive_);																												
		//System.out.println("Gross negativo recuperado->"+dbGrossNegative_);																													
		System.out.println("customerOrTicketsNumber_ recuperado->"+dbCustomerOrTicketsNumber_);																												
		//System.out.println("storeCoupons_ recuperado->"+dbStoreCoupons_);																												
		System.out.println("soldItemsNumber_ recuperado->"+dbSoldItemsNumber_);
		System.out.println("//********************************************************************************************//");
		System.out.println("");				
	}
}
