/*
 * Created on Jan 16, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.helpers;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.NoSaleTransactionException;
import com.asic.framework.exception.ServiceException;
import com.asic.framework.helpers.AbstractHelper;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TRANSACCION_Imp;
import com.asic.trxonline.sma.strings.AbstractTrxString;
import com.asic.trxonline.sma.strings.ItemEntryExtString;
import com.asic.trxonline.tramas.SodimacVOs.SodDataEntryTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodDiscountTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodExceptionLogTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodFoodStampChangeTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodHeaderTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodItemEntryTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodItemRecordChargeTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodManagerOverrideTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodMiscellaneousCashItemTrackingTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodOperatorTrainingTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodPriceChangeTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodStoreClosingTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodTaxTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodTenderTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodTillChangeTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodTradingStampsTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodUserDataReservedTrama;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

/*tramaTable.put("00",SodHeaderTrama.class);
tramaTable.put("01",SodItemEntryTrama.class);
tramaTable.put("02",ItemEntryExtTrama.class);
tramaTable.put("03",SodDiscountTrama.class);
tramaTable.put("04",SodDiscountTrama.class);
tramaTable.put("05",SodTenderTrama.class);
tramaTable.put("06",SodTenderTrama.class);
tramaTable.put("07",SodTaxTrama.class);
tramaTable.put("08",SodTaxTrama.class);
tramaTable.put("09",SodFoodStampChangeTrama.class);
//tramaTable.put("09",SodFoodStampChangeTrama.class);
tramaTable.put("10",SodManagerOverrideTrama.class);
tramaTable.put("11",SodDataEntryTrama.class);
tramaTable.put("12",SodPriceChangeTrama.class);
tramaTable.put("13",SodTillChangeTrama.class);
tramaTable.put("14",SodItemRecordChargeTrama.class);
tramaTable.put("15",SodTradingStampsTrama.class);
tramaTable.put("17",SodMiscellaneousCashItemTrackingTrama.class);		
tramaTable.put("20",SodExceptionLogTrama.class);
tramaTable.put("21",SodStoreClosingTrama.class);
tramaTable.put("98",SodOperatorTrainingTrama.class);
tramaTable.put("99",SodUserDataReservedTrama.class)*/

public class GeneradorMensajeHelper extends AbstractHelper {

	public Object generarMensaje(AbstractTrxString[] pTrama) throws ServiceException, NoSaleTransactionException {
		System.out.println("Generar mensaje inicio->");
		TRANSACCION mensaje_ = new TRANSACCION_Imp();
		for (int i = 0; i < pTrama.length; i++) {

			AbstractTrxString trama_ = pTrama[i];

			try {
				if (trama_ instanceof SodHeaderTrama) {
					SodHeaderTrama vo_ = (SodHeaderTrama) trama_;
					try{
						System.out.println("vo_.getTRANSTYPE()->"+vo_.getTRANSTYPE());
						if (!vo_.getTRANSTYPE().equals("00") && !vo_.getTRANSTYPE().equals("0") &&
							!vo_.getTRANSTYPE().equals("01") && !vo_.getTRANSTYPE().equals("1")){
							System.out.println("NO ES UNA TRAMA DE VENTA NI ITERCAMBIO DE MEDIO DE PAGO");
							//return null;
							throw new NoSaleTransactionException("This is not a sale transaction or tender interchange");
						}else{
							//System.out.println("ES UNA TRAMA DE VENTA. SE CONTINUA");	
							System.out.println("ES UNA TRAMA DE VENTA O INTERCAMBIO DE MEDIO DE PAGO");
						}
					}catch(NoSaleTransactionException e){
						System.out.println("No es una transacciOn de venta ni de intercambio de medio de pago. Se filtra");
						throw e;
					}catch(Exception e){
						System.out.println("HUBO EXCEPCION EN AJUSTE");
						e.printStackTrace();	
					}
					vo_.fillData();
					mensaje_.getHeader().add(vo_.getStringRecord());
				}
				else if (trama_ instanceof SodItemEntryTrama) {
					SodItemEntryTrama vo_ = (SodItemEntryTrama) trama_;
					vo_.fillData();
					mensaje_.getItemEntry().add(vo_.getStringRecord());
				}
				else if (trama_ instanceof ItemEntryExtString) {
					ItemEntryExtString vo_ = (ItemEntryExtString) trama_;
					//vo_.fillData();
					LogWriter.getLog().log(LogWriter.INFO, "Trama de tipo ItemEntryExtTrama: " + trama_);
				}
				else if (trama_ instanceof SodDiscountTrama) {
					SodDiscountTrama vo_ = (SodDiscountTrama) trama_;
					vo_.fillData();
					mensaje_.getDiscount().add(vo_.getStringRecord());
				}
				else if (trama_ instanceof SodTenderTrama) {
					SodTenderTrama vo_ = (SodTenderTrama) trama_;
					vo_.fillData();
					mensaje_.getTender().add(vo_.getStringRecord());
				}
				else if(trama_ instanceof SodTaxTrama) {
					SodTaxTrama vo_ = (SodTaxTrama) trama_;
					vo_.fillData();
					mensaje_.getTax().add(vo_.getStringRecord());
				}
				else if (trama_ instanceof SodFoodStampChangeTrama) {
					SodFoodStampChangeTrama vo_ = (SodFoodStampChangeTrama) trama_;
					//vo_.fillData();
					LogWriter.getLog().log(LogWriter.INFO, "Trama de tipo SodFoodStampChangeTrama: " + trama_);
				}
				else if (trama_ instanceof SodManagerOverrideTrama) {
					SodManagerOverrideTrama vo_ = (SodManagerOverrideTrama) trama_;
					vo_.fillData();
					mensaje_.getManagerOverride().add(vo_.getStringRecord());
				}
				else if (trama_ instanceof SodDataEntryTrama) {
					SodDataEntryTrama vo_ = (SodDataEntryTrama) trama_;
					vo_.fillData();
					mensaje_.getDataEntry().add(vo_.getStringRecord());
				}
				else if (trama_ instanceof SodPriceChangeTrama) {
					SodPriceChangeTrama vo_ = (SodPriceChangeTrama) trama_;
					vo_.fillData();
					mensaje_.getPriceChange().add(vo_.getStringRecord());
				}
				else if (trama_ instanceof SodTillChangeTrama) { //SodTillChangeTrama
					SodTillChangeTrama vo_ = (SodTillChangeTrama) trama_;
					vo_.fillData();
					mensaje_.getTillChange().add(vo_.getStringRecord());
				}
				else if (trama_ instanceof SodItemRecordChargeTrama) {
					SodItemRecordChargeTrama vo_ = (SodItemRecordChargeTrama) trama_;
					vo_.fillData();
					mensaje_.getItemRecordChange().add(vo_.getStringRecord());
				}
				else if (trama_ instanceof SodTradingStampsTrama) {
					SodTradingStampsTrama vo_ = (SodTradingStampsTrama) trama_;
					vo_.fillData();
					mensaje_.getTradingStamps().add(vo_.getStringRecord());
				}
				else if (trama_ instanceof SodTradingStampsTrama) {
					SodTradingStampsTrama vo_ = (SodTradingStampsTrama) trama_;
					vo_.fillData();
					mensaje_.getTradingStamps().add(vo_.getStringRecord());
				}
				else if (trama_ instanceof SodMiscellaneousCashItemTrackingTrama) {
					SodMiscellaneousCashItemTrackingTrama vo_ = (SodMiscellaneousCashItemTrackingTrama) trama_;
					//vo_.fillData();
					LogWriter.getLog().log(LogWriter.INFO, "Trama de tipo SodMiscellaneousCashItemTrackingTrama: " + trama_);
				}
				else if (trama_ instanceof SodStoreClosingTrama) {
					SodStoreClosingTrama vo_ = (SodStoreClosingTrama) trama_;
					vo_.fillData();
					mensaje_.getStoreClosig().add(vo_.getStringRecord());
				}
				else if (trama_ instanceof SodExceptionLogTrama) {
					SodExceptionLogTrama vo_ = (SodExceptionLogTrama) trama_;
					vo_.fillData();
					mensaje_.getExceptionLog().add(vo_.getStringRecord());
				}
				else if (trama_ instanceof SodOperatorTrainingTrama) {
					SodOperatorTrainingTrama vo_ = (SodOperatorTrainingTrama) trama_;
					vo_.fillData();
					mensaje_.getOperatorTraining().add(vo_.getStringRecord());
				}
				else if (trama_ instanceof SodUserDataReservedTrama) {
					SodUserDataReservedTrama vo_ = (SodUserDataReservedTrama) trama_;
					vo_.fillData();
					mensaje_.getUserData().add(vo_.getStringRecord());
				} 
				else if (trama_ == null) {
					//mensaje_ = null;
					LogWriter.getLog().log(LogWriter.INFO, "********* Trama de tipo indefinido: " + trama_ );
				} else {
					//mensaje_ = null;
					LogWriter.getLog().log(LogWriter.INFO, "********* Trama de tipo indefinido: " + trama_ + " Clase:" + (trama_ != null ? trama_.getClass().getName() : "?"));
				}

			} catch (ServiceException e) {
				//LogWriter.getLog().log(LogWriter.WARNING, "[generarMensaje(...)", e);
				e.printStackTrace();
				throw new ServiceException("", "error.generarMensaje", e);
			}
		}
		System.out.println("Generar mensaje fin->");
		return mensaje_;

	}

}
