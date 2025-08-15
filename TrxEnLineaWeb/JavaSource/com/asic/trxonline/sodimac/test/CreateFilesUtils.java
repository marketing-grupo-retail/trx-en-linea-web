/*
 * Creado el 12/01/2006
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.trxonline.sodimac.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.asic.trxonline.sma.strings.AbstractTrxString;
import com.asic.trxonline.sma.strings.DataEntryString;
import com.asic.trxonline.sma.strings.DiscountString;
import com.asic.trxonline.sma.strings.ExceptionLogString;
import com.asic.trxonline.sma.strings.FoodStampChangeString;
import com.asic.trxonline.sma.strings.HeaderString;
import com.asic.trxonline.sma.strings.ItemEntryExtString;
import com.asic.trxonline.sma.strings.ItemEntryString;
import com.asic.trxonline.sma.strings.ItemRecordChargeString;
import com.asic.trxonline.sma.strings.ManagerOverrideString;
import com.asic.trxonline.sma.strings.MiscellaneousCashItemTrackingString;
import com.asic.trxonline.sma.strings.OperatorTrainingString;
import com.asic.trxonline.sma.strings.PriceChangeString;
import com.asic.trxonline.sma.strings.StoreClosingString;
import com.asic.trxonline.sma.strings.TaxString;
import com.asic.trxonline.sma.strings.TenderString;
import com.asic.trxonline.sma.strings.TillChangeString;
import com.asic.trxonline.sma.strings.TradingStampsString;
import com.asic.trxonline.sma.strings.UserDataReservedString;
import com.asic.trxonline.tramas.SodimacVOs.SodItemEntryTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodUserDataReservedTrama;

/**
 * @author Administrador
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */


public class CreateFilesUtils {
	private static final String OUTPUTDIRECTORY="C:/con_out_archivos/";
	private static final String FILEDATE="060106";
		
	public static void insertTrxInFile (AbstractTrxString pObject  ){
		FileOutputStream os_ = null;
		BufferedWriter bw_=null;		
		try{
			os_= new FileOutputStream(OUTPUTDIRECTORY+getFileName(pObject)+FILEDATE,true);
			bw_=new BufferedWriter(new OutputStreamWriter(os_));
			bw_.write(getTramaToInsert(pObject));
			bw_.newLine();
			bw_.flush();
			bw_.close();

		}catch(Exception e){
			//System.out.println("exception en el getString->");
			e.printStackTrace();
		}finally{
			if (bw_!=null){
				try {
					bw_.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}		
		}
	}
	
	private static String getFileName(AbstractTrxString pObject){
		if (pObject instanceof HeaderString){		
			return "HD";
		}
		if (pObject instanceof ItemEntryString){
			return "IT";
		}
		/*if (pObject instanceof ItemEntryExtString){
			return "HD";
		}*/
		if (pObject instanceof DiscountString){
			return "DS";
		}
		if (pObject instanceof TenderString){
			return "TN";
		}
		if (pObject instanceof TaxString){
			return "TX";
		}
		if (pObject instanceof FoodStampChangeString){
			return "TN";
		}
		if (pObject instanceof ManagerOverrideString){
			return "MG";
		}
		if (pObject instanceof DataEntryString){
			return "DE";
		}				
		if (pObject instanceof PriceChangeString){
			return "PC";
		}
		if (pObject instanceof TillChangeString){
			return "TC";
		}
		if (pObject instanceof ItemRecordChargeString){
			return "IR";
		}
		if (pObject instanceof TradingStampsString){
			return "TS";
		}
		/*if (pObject instanceof MiscellaneousCashItemTrackingString){
			return "HD";
		}*/
		if (pObject instanceof ExceptionLogString){
			return "EL";
		}				
		if (pObject instanceof StoreClosingString){
			return "SC";
		}
		if (pObject instanceof OperatorTrainingString){
			return "OT";
		}
		if (pObject instanceof UserDataReservedString){
			return "UD";
		}	
		return "";
	}
	
	public static void printString(AbstractTrxString pObject){
		if (pObject instanceof HeaderString){		
			HeaderString trx_=(HeaderString)pObject;
			printHeader(trx_);
						
		}
		if (pObject instanceof ItemEntryString){
			ItemEntryString trx_=(ItemEntryString)pObject;
			printItemEntry(trx_);
		}
		if (pObject instanceof ItemEntryExtString){
			ItemEntryExtString trx_=(ItemEntryExtString)pObject;
			printItemEntryExtension(trx_);
		}
		if (pObject instanceof DiscountString){
			DiscountString trx_=(DiscountString)pObject;
			printDiscount(trx_);
		}
		if (pObject instanceof TenderString){
			TenderString trx_=(TenderString)pObject;
			printTender(trx_);
		}
		if (pObject instanceof TaxString){
			TaxString trx_=(TaxString)pObject;
			printTax(trx_);
		}
		if (pObject instanceof FoodStampChangeString){
			FoodStampChangeString trx_=(FoodStampChangeString)pObject;
			printFoodStampChange(trx_);
		}
		if (pObject instanceof ManagerOverrideString){
			ManagerOverrideString trx_=(ManagerOverrideString)pObject;
			printManagerOverride(trx_);
		}
		if (pObject instanceof DataEntryString){
			DataEntryString trx_=(DataEntryString)pObject;
			printDataEntry(trx_);
		}				
		if (pObject instanceof PriceChangeString){
			PriceChangeString trx_=(PriceChangeString)pObject;
			printPriceChange(trx_);
		}
		if (pObject instanceof TillChangeString){
			TillChangeString trx_=(TillChangeString)pObject;
			printTillChange(trx_);
		}
		if (pObject instanceof ItemRecordChargeString){
			ItemRecordChargeString trx_=(ItemRecordChargeString)pObject;
			printItemRecordCharge(trx_);
		}
		if (pObject instanceof TradingStampsString){
			TradingStampsString trx_=(TradingStampsString)pObject;
			printTradingStamps(trx_);
		}
		if (pObject instanceof MiscellaneousCashItemTrackingString){
			MiscellaneousCashItemTrackingString trx_=(MiscellaneousCashItemTrackingString)pObject;
			printMiscellaneousCashItemTracking(trx_);
		}
		if (pObject instanceof ExceptionLogString){
			ExceptionLogString trx_=(ExceptionLogString)pObject;
			printExceptionLog(trx_);
		}				
		if (pObject instanceof StoreClosingString){
			StoreClosingString trx_=(StoreClosingString)pObject;
			printStoreClosing(trx_);
		}
		if (pObject instanceof OperatorTrainingString){
			OperatorTrainingString trx_=(OperatorTrainingString)pObject;
			printOperatorTraining(trx_);
		}
		if (pObject instanceof UserDataReservedString){
			UserDataReservedString trx_=(UserDataReservedString)pObject;
			printUserDataReserved(trx_);
		}	
	}
		
	private static String getTramaToInsert(AbstractTrxString pObject){
		if (pObject instanceof HeaderString){		
			HeaderString trx_=(HeaderString)pObject;
			return getHeaderString(trx_);
						
		}
		if (pObject instanceof SodItemEntryTrama){
			SodItemEntryTrama trx_=(SodItemEntryTrama)pObject;
			return getItemEntryString(trx_);
		}
		if (pObject instanceof ItemEntryExtString){
			ItemEntryExtString trx_=(ItemEntryExtString)pObject;
			return getItemEntryExtensionString(trx_);
		}
		if (pObject instanceof DiscountString){
			DiscountString trx_=(DiscountString)pObject;
			return getDiscountString(trx_);
		}
		if (pObject instanceof TenderString){
			TenderString trx_=(TenderString)pObject;
			return getTenderString(trx_);
		}
		if (pObject instanceof TaxString){
			TaxString trx_=(TaxString)pObject;
			return getTaxString(trx_);
		}
		if (pObject instanceof FoodStampChangeString){
			FoodStampChangeString trx_=(FoodStampChangeString)pObject;
			return getFoodStampChangeString(trx_);
		}
		if (pObject instanceof ManagerOverrideString){
			ManagerOverrideString trx_=(ManagerOverrideString)pObject;
			return getManagerOverrideString(trx_);
		}
		if (pObject instanceof DataEntryString){
			DataEntryString trx_=(DataEntryString)pObject;
			return getDataEntryString(trx_);
		}				
		if (pObject instanceof PriceChangeString){
			PriceChangeString trx_=(PriceChangeString)pObject;
			return getPriceChangeString(trx_);
		}
		if (pObject instanceof TillChangeString){
			TillChangeString trx_=(TillChangeString)pObject;
			return getTillChangeString(trx_);
		}
		if (pObject instanceof ItemRecordChargeString){
			ItemRecordChargeString trx_=(ItemRecordChargeString)pObject;
			return getItemRecordChargeString(trx_);
		}
		if (pObject instanceof TradingStampsString){
			TradingStampsString trx_=(TradingStampsString)pObject;
			return getTradingStampsString(trx_);
		}
		if (pObject instanceof MiscellaneousCashItemTrackingString){
			MiscellaneousCashItemTrackingString trx_=(MiscellaneousCashItemTrackingString)pObject;
			return getMiscellaneousCashItemTrackingString(trx_);
		}
		if (pObject instanceof ExceptionLogString){
			ExceptionLogString trx_=(ExceptionLogString)pObject;
			return getExceptionLogString(trx_);
		}				
		if (pObject instanceof StoreClosingString){
			StoreClosingString trx_=(StoreClosingString)pObject;
			return getStoreClosingString(trx_);
		}
		if (pObject instanceof OperatorTrainingString){
			OperatorTrainingString trx_=(OperatorTrainingString)pObject;
			return getOperatorTrainingString(trx_);
		}
		if (pObject instanceof SodUserDataReservedTrama){
			SodUserDataReservedTrama trx_=(SodUserDataReservedTrama)pObject;
			return getUserDataReservedString(trx_);
		}		
		return null;
	}
	
	private static String getHeaderString(HeaderString pTrx_){
		return pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getTRANSNUM()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getTRANSTYPE()+","
		+pTrx_.getNUMSTRIN()+","
		+pTrx_.getOPERATOR()+","
		+pTrx_.getPASSWORD()+","
		+pTrx_.getGROSSPOS()+","
		+pTrx_.getGROSSNEG()+","
		+pTrx_.getRINGTIME()+","
		+pTrx_.getTENDERTI()+","
		+pTrx_.getSPECIAL()+","
		+pTrx_.getINACTIVE()+","
		+pTrx_.getIndicat1(1)+","
		+pTrx_.getIndicat1(2)+","
		+pTrx_.getIndicat1(3)+","
		+pTrx_.getIndicat1(4)+","
		+pTrx_.getIndicat1(5)+","
		+pTrx_.getIndicat1(6)+","
		+pTrx_.getIndicat1(7)+","
		+pTrx_.getIndicat1(8)+","
		+pTrx_.getIndicat1(9)+","
		+pTrx_.getIndicat1(10)+","
		+pTrx_.getIndicat1(11)+","
		+pTrx_.getIndicat1(12)+","
		+pTrx_.getIndicat1(13)+","
		+pTrx_.getIndicat1(14)+","
		+pTrx_.getIndicat1(15)+","
		+pTrx_.getIndicat1(16)+","
		+pTrx_.getIndicat1(17)+","
		+pTrx_.getIndicat1(18)+","
		+pTrx_.getIndicat1(19)+","
		+pTrx_.getIndicat1(20)+","
		+pTrx_.getIndicat1(21)+","
		+pTrx_.getIndicat1(22)+","
		+pTrx_.getIndicat1(23)+","
		+pTrx_.getIndicat1(24)+","
		+pTrx_.getIndicat1(25)+","
		+pTrx_.getIndicat1(26)+","
		+pTrx_.getIndicat1(27)+","
		+pTrx_.getIndicat1(28)+","
		+pTrx_.getIndicat1(29)+","
		+pTrx_.getIndicat1(30)+","
		+pTrx_.getIndicat1(31)+","
		+pTrx_.getIndicat1(32);
	}

	private static String getItemEntryString(SodItemEntryTrama pTrx_){
		return pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getTRANSNUM()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getITEMCODE()+","
		+pTrx_.getXPRICE()+","
		+pTrx_.getDEPARTME()+","
		+pTrx_.getFAMILYNU1()+","
		+pTrx_.getFAMILYNU2()+","
		+pTrx_.getINDICAT1(1)+","
		+pTrx_.getINDICAT1(2)+","
		+pTrx_.getINDICAT1(3)+","
		+pTrx_.getINDICAT1(4)+","
		+pTrx_.getINDICAT1(5)+","
		+pTrx_.getINDICAT1(6)+","
		+pTrx_.getINDICAT1(7)+","
		+pTrx_.getINDICAT1(8)+","
		+pTrx_.getINDICAT1(9)+","
		+pTrx_.getINDICAT1(10)+","
		+pTrx_.getINDICAT1(11)+","
		+pTrx_.getINDICAT1(12)+","
		+pTrx_.getINDICAT1(13)+","
		+pTrx_.getINDICAT1(14)+","
		+pTrx_.getINDICAT1(15)+","
		+pTrx_.getINDICAT1(16)+","
		+pTrx_.getINDICAT2(1)+","
		+pTrx_.getINDICAT2(2)+","
		+pTrx_.getINDICAT2(3)+","
		+pTrx_.getINDICAT2(4)+","
		+pTrx_.getINDICAT2(5)+","
		+pTrx_.getINDICAT2(6)+","
		+pTrx_.getINDICAT2(7)+","
		+pTrx_.getINDICAT2(8)+","
		+pTrx_.getINDICAT2(9)+","
		+pTrx_.getINDICAT2(10)+","
		+pTrx_.getINDICAT2(11)+","
		+pTrx_.getINDICAT2(12)+","
		+pTrx_.getINDICAT2(13)+","
		+pTrx_.getINDICAT2(14)+","
		+pTrx_.getINDICAT2(15)+","
		+pTrx_.getINDICAT2(16)+","
		+pTrx_.getIndicat3(1)+","
		+pTrx_.getIndicat3(2)+","				
		+pTrx_.getMPGROUP()+","
		+pTrx_.getDEALQUAN()+","
		+pTrx_.getPRICEMTH()+","
		+pTrx_.getSALEQUAN()+","
		+pTrx_.getSALEPRICE()+","
		+pTrx_.getQTYORWGT()+","
		+pTrx_.getINDICAT41()+","
		+pTrx_.getINDICAT42()+","
		+pTrx_.getINDICAT43()+","
		+pTrx_.getINDICAT44()+","
		+pTrx_.getINDICAT45()+","
		+pTrx_.getINDICAT46()+","
		+pTrx_.getINDICAT47()+","
		+pTrx_.getINDICAT48()+","//;
		+pTrx_.getPRCIVA(); // 
		
	}	

	private static String getItemEntryExtensionString(ItemEntryExtString pTrx_){
		return pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getTRANSNUM()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getMPGROUP()+","
		+pTrx_.getDEALQUAN()+","
		+pTrx_.getPRICEMTH()+","
		+pTrx_.getSALEQUAN()+","
		+pTrx_.getSALEPRICE()+","
		+pTrx_.getQTYORWGT()+","
		+pTrx_.getINDICAT1(1)+","
		+pTrx_.getINDICAT1(2)+","
		+pTrx_.getINDICAT1(3)+","
		+pTrx_.getINDICAT1(4)+","
		+pTrx_.getINDICAT1(5)+","
		+pTrx_.getINDICAT1(6)+","
		+pTrx_.getINDICAT1(7)+","
		+pTrx_.getINDICAT1(8);
	}	
	
	
	private static String getDiscountString(DiscountString pTrx_){
		return pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getTRANSNUM()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getStringType()+","
		+pTrx_.getDISGROUP()+","
		+pTrx_.getDISRATE()+","
		+pTrx_.getAMTDISCO()+","
		+pTrx_.getTAXEXEMP();
	}

	private static String getTenderString(TenderString pTrx_){
		return pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getTRANSNUM()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getStringType()+","
		+pTrx_.getTENDTYPE()+","
		+pTrx_.getAMTTENDE()+","
		+pTrx_.getAMTTNFEE()+","
		+pTrx_.getCUSTOMER()+","
		+pTrx_.getSTATUS();
		
		/*return pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getTRANSNUM()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getStringType()+","
		+pTrx_.getTendType()+","
		+pTrx_.getAmtChange()+","
		+"00"+","
		+"00"+","
		+"00";*/		
		
	}
	
	private static String getTaxString(TaxString pTrx_){
		return pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getTRANSNUM()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getStringType()+","
		+pTrx_.getAMTTAXA()+","
		+pTrx_.getAMTTAXB()+","
		+pTrx_.getAMTTAXC()+","
		+pTrx_.getAMTTAXD()+","
		+pTrx_.getAMTTAXLEA()+","
		+pTrx_.getAMTTAXLEB()+","
		+pTrx_.getAMTTAXLEC()+","
		+pTrx_.getAMTTAXLED();
	}
	
	private static String getFoodStampChangeString(FoodStampChangeString pTrx_){
		return pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getTRANSNUM()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getStringType()+","
		+pTrx_.getTendType()+","
		+pTrx_.getAmtChange()+","
		+"00"+","
		+"00"+","
		+"00";
	}	

	private static String getManagerOverrideString(ManagerOverrideString pTrx_){
		return pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getTRANSNUM()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getOVERRIDE()+","
		+pTrx_.getREASON();
	}	
	
	private static String getDataEntryString(DataEntryString pTrx_){
		return pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getTRANSNUM()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getUserData(1)+","
		+pTrx_.getUserData(2)+","
		+pTrx_.getUserData(3)+","
		+pTrx_.getUserData(4)+","
		+pTrx_.getUserData(5)+","
		+pTrx_.getUserData(6)
		// Lineas adicionadas para que cuadren con el archivo de Sodimac CACS.
		+",00"
		+",00"
		+",00"
		+",00"
		+",00"
		+",00"
		+",00";
	}
		
	private static String getPriceChangeString(PriceChangeString pTrx_){
		return  pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getTRANSNUM()+","		
		+pTrx_.getOFFSETY()+","
		+pTrx_.getITEMCODE()+","
		+pTrx_.getNEWDEALQ()+","
		+pTrx_.getNEWPRICE()+","
		+pTrx_.getOLDDEALQ()+","
		+pTrx_.getOLDPRICE();
	}	
	
	private static String getTillChangeString(TillChangeString pTrx_){
		return pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getTRANSNUM()+","		
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getNUMBERLOANS()+","
		+pTrx_.getAMTLOANS()+","
		+pTrx_.getNUMBERPKUPS()+","
		+pTrx_.getAMTPKUPS()+","
		+pTrx_.getTENDTYP11()+","
		+pTrx_.getAMTTEND11()+","
		+pTrx_.getTENDTYP12()+","
		+pTrx_.getAMTTEND12()+","
		+pTrx_.getTENDTYP13()+","
		+pTrx_.getAMTTEND13()+","
		+pTrx_.getTENDTYP14()+","
		+pTrx_.getAMTTEND14()+","
		+pTrx_.getTENDTYP15()+","
		+pTrx_.getAMTTEND15()+","
		+pTrx_.getTENDTYP16()+","
		+pTrx_.getAMTTEND16()+","
		+pTrx_.getTENDTYP17()+","
		+pTrx_.getAMTTEND17()+","		
		+pTrx_.getTENDTYP18()+","
		+pTrx_.getAMTTEND18()+","
		+pTrx_.getNegative();//+","
		/*+pTrx_.getTENDTYP21()+","
		+pTrx_.getAMTTEND21()+","
		+pTrx_.getTENDTYP22()+","
		+pTrx_.getAMTTEND22()+","
		+pTrx_.getTENDTYP23()+","
		+pTrx_.getAMTTEND23()+","
		+pTrx_.getTENDTYP24()+","
		+pTrx_.getAMTTEND24()+","
		+pTrx_.getTENDTYP25()+","
		+pTrx_.getAMTTEND25()+","
		+pTrx_.getTENDTYP26()+","
		+pTrx_.getAMTTEND26()+","
		+pTrx_.getTENDTYP27()+","
		+pTrx_.getAMTTEND27()+","
		+pTrx_.getTENDTYP28()+","
		+pTrx_.getAMTTEND28();*/
	}

			
	private static String getItemRecordChargeString(ItemRecordChargeString pTrx_){
		return pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getTRANSNUM()+","		
		+pTrx_.getOFFSETY()+","
		+pTrx_.getOLDDATA()+","
		+pTrx_.getNEWDATA();
	}

	private static String getTradingStampsString(TradingStampsString pTrx_){
		return pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getTRANSNUM()+","		
		+pTrx_.getOFFSETY()+","
		+pTrx_.getSTAMPS();
	}	

	private static String getMiscellaneousCashItemTrackingString(MiscellaneousCashItemTrackingString pTrx_){
		return pTrx_.getStringType()+","
		+pTrx_.getItemCode()+","
		+pTrx_.getXPrice()+","
		+pTrx_.getDepartme()+",";//No va para Sodimac.
		/*+pTrx_.getFamilyNuCurrent()+","
		+pTrx_.getItemCode()+","
		+pTrx_.getIndicat1(1)+","
		+pTrx_.getIndicat1(2)+","
		+pTrx_.getIndicat1(3)+","
		+pTrx_.getIndicat1(4)+","
		+pTrx_.getIndicat1(5)+","
		+pTrx_.getIndicat1(6)+","
		+pTrx_.getIndicat1(7)+","
		+pTrx_.getIndicat1(8)+","
		+pTrx_.getIndicat1(9)+","
		+pTrx_.getIndicat1(10)+","
		+pTrx_.getIndicat1(11)+","
		+pTrx_.getIndicat1(12)+","
		+pTrx_.getIndicat1(13)+","
		+pTrx_.getIndicat1(14)+","
		+pTrx_.getIndicat1(15)+","
		+pTrx_.getIndicat1(16)+","
		+pTrx_.getIndicat2(1)+","
		+pTrx_.getIndicat2(2)+","
		+pTrx_.getIndicat2(3)+","
		+pTrx_.getIndicat2(4)+","
		+pTrx_.getIndicat2(5)+","
		+pTrx_.getIndicat2(6)+","
		+pTrx_.getIndicat2(7)+","
		+pTrx_.getIndicat2(8)+","
		+pTrx_.getIndicat2(9)+","
		+pTrx_.getIndicat2(10)+","
		+pTrx_.getIndicat2(11)+","
		+pTrx_.getIndicat2(12)+","
		+pTrx_.getIndicat2(13)+","
		+pTrx_.getIndicat2(14)+","
		+pTrx_.getIndicat2(15)+","
		+pTrx_.getIndicat2(16)+","
		+pTrx_.getIndicat3()+","
		+pTrx_.getTendType();*/
	}
	
	private static String getOperatorTrainingString(OperatorTrainingString pTrx_){
		return pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getTRANSNUM()+","		
		+pTrx_.getOFFSETY();
	}	

	private static String getUserDataReservedString(SodUserDataReservedTrama pTrx_){
		return  pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getTRANSNUM()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		//+pTrx_.getTYPE()+"," Falta mirar como se obtiene para cada user data;
		+pTrx_.getUserData()+","
		+pTrx_.getData2();
	}

	
	private static String getExceptionLogString(ExceptionLogString pTrx_){
		return pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getTRANSNUM()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getLOGDATA();
		/*System.out.println("Log Data1->"+pTrx_.getLogData1());
		System.out.println("Log Data2->"+pTrx_.getLogData2());
		System.out.println("Log Data3->"+pTrx_.getLogData3());
		System.out.println("Log Data4->"+pTrx_.getLogData4());
		System.out.println("Log Data5->"+pTrx_.getLogData5());
		System.out.println("Log Data6->"+pTrx_.getLogData6());*/		
	}

	private static String getStoreClosingString(StoreClosingString pTrx_){
		return pTrx_.getOFFSETY()+","
		+pTrx_.getOFFSETX()+","
		+pTrx_.getSTORE()+","
		+pTrx_.getTERMINAL()+","
		+pTrx_.getTRANSNUM()+","
		+pTrx_.getDAY()+","
		+pTrx_.getTIME()+","
		+pTrx_.getDateTime()+","
		+pTrx_.getINDICAT1();
		/*+pTrx_.getINDICAT2(1)+","
		+pTrx_.getINDICAT2(2)+","
		+pTrx_.getINDICAT2(3)+","
		+pTrx_.getINDICAT2(4)+","
		+pTrx_.getINDICAT2(5)+","
		+pTrx_.getINDICAT2(6)+","
		+pTrx_.getINDICAT2(7)+","
		+pTrx_.getINDICAT2(8);*/
				
	}	
	
////////////////******               ******//////////////////////	

  private static void printHeader(HeaderString pTrx_){
	/*System.out.println("String Type->"+pTrx_.getStringType());
	  System.out.println("Terminal->"+pTrx_.getTERMINAL());
	  System.out.println("TransNum->"+pTrx_.getTRANSNUM());
	  System.out.println("Fecha->"+pTrx_.getDAY());
	  System.out.println("Time->"+pTrx_.getTIME());
	  System.out.println("Trx type->"+pTrx_.getTRANSTYPE());
	  System.out.println("String num->"+pTrx_.getNUMSTRIN());
	  System.out.println("Operator->"+pTrx_.getOPERATOR());
	  System.out.println("Password->"+pTrx_.getPASSWORD());
	  System.out.println("GrossPos->"+pTrx_.getGROSSPOS());
	  System.out.println("GrossNeg->"+pTrx_.getGROSSNEG());
	  System.out.println("RingTime->"+pTrx_.getRINGTIME());
	  System.out.println("TenderI->"+pTrx_.getTENDERTI());
	  System.out.println("Special->"+pTrx_.getSPECIAL());
	  System.out.println("Inactive->"+pTrx_.getINACTIVE());
	  System.out.println("getIndicat11->"+pTrx_.getIndicat1(1));
	  System.out.println("getIndicat12->"+pTrx_.getIndicat1(2));
	  System.out.println("getIndicat13->"+pTrx_.getIndicat1(3));
	  System.out.println("getIndicat14->"+pTrx_.getIndicat1(4));
	  System.out.println("getIndicat15->"+pTrx_.getIndicat1(5));
	  System.out.println("getIndicat16->"+pTrx_.getIndicat1(6));

	  System.out.println("getIndicat17->"+pTrx_.getIndicat1(7));
	  System.out.println("getIndicat18->"+pTrx_.getIndicat1(8));
	  System.out.println("getIndicat19->"+pTrx_.getIndicat1(9));
	  System.out.println("getIndicat110->"+pTrx_.getIndicat1(10));
	  System.out.println("getIndicat111->"+pTrx_.getIndicat1(11));
	  System.out.println("getIndicat112->"+pTrx_.getIndicat1(12));
	  System.out.println("getIndicat113->"+pTrx_.getIndicat1(13));
	  System.out.println("getIndicat114->"+pTrx_.getIndicat1(14));
	  System.out.println("getIndicat115->"+pTrx_.getIndicat1(15));
	  System.out.println("getIndicat116->"+pTrx_.getIndicat1(16));

	  System.out.println("getIndicat117->"+pTrx_.getIndicat1(17));
	  System.out.println("getIndicat118->"+pTrx_.getIndicat1(18));
	  System.out.println("getIndicat119->"+pTrx_.getIndicat1(19));
	  System.out.println("getIndicat120->"+pTrx_.getIndicat1(20));

	  System.out.println("getIndicat121->"+pTrx_.getIndicat1(21));
	  System.out.println("getIndicat122->"+pTrx_.getIndicat1(22));
	  System.out.println("getIndicat123->"+pTrx_.getIndicat1(23));
	  System.out.println("getIndicat124->"+pTrx_.getIndicat1(24));
	  System.out.println("getIndicat125->"+pTrx_.getIndicat1(25));
	  System.out.println("getIndicat126->"+pTrx_.getIndicat1(26));

	  System.out.println("getIndicat127->"+pTrx_.getIndicat1(27));
	  System.out.println("getIndicat128->"+pTrx_.getIndicat1(28));
	  System.out.println("getIndicat129->"+pTrx_.getIndicat1(29));
	  System.out.println("getIndicat130->"+pTrx_.getIndicat1(30));

	  System.out.println("getIndicat131->"+pTrx_.getIndicat1(31));
	  System.out.println("getIndicat132->"+pTrx_.getIndicat1(32));*/
  }

  private static void printItemEntry(ItemEntryString pTrx_){
	  /*System.out.println("String Type->"+pTrx_.getStringType());
	  System.out.println("ItemCode->"+pTrx_.getITEMCODE());
	  System.out.println("XPrice->"+pTrx_.getXPRICE());
	  System.out.println("Departamento->"+pTrx_.getDEPARTME());
	  System.out.println("Current Family Nu->"+pTrx_.getFAMILYNU1());
	  System.out.println("Previous Family Nu->"+pTrx_.getFAMILYNU2());
	  System.out.println("Indicador 11->"+pTrx_.getINDICAT1(1));
	  System.out.println("Indicador 12->"+pTrx_.getINDICAT1(2));
	  System.out.println("Indicador 13->"+pTrx_.getINDICAT1(3));
	  System.out.println("Indicador 14->"+pTrx_.getINDICAT1(4));
	  System.out.println("Indicador 15->"+pTrx_.getINDICAT1(5));
	  System.out.println("Indicador 16->"+pTrx_.getINDICAT1(6));
	  System.out.println("Indicador 17->"+pTrx_.getINDICAT1(7));
	  System.out.println("Indicador 18->"+pTrx_.getINDICAT1(8));
	  System.out.println("Indicador 19->"+pTrx_.getINDICAT1(9));
	  System.out.println("Indicador 110->"+pTrx_.getINDICAT1(10));
	  System.out.println("Indicador 111->"+pTrx_.getINDICAT1(11));
	  System.out.println("Indicador 112->"+pTrx_.getINDICAT1(12));
	  System.out.println("Indicador 113->"+pTrx_.getINDICAT1(13));
	  System.out.println("Indicador 114->"+pTrx_.getINDICAT1(14));
	  System.out.println("Indicador 115->"+pTrx_.getINDICAT1(15));
	  System.out.println("Indicador 116->"+pTrx_.getINDICAT1(16));*/
  }	

  private static void printItemEntryExtension(ItemEntryExtString pTrx_){
	  /*System.out.println("String Type->"+pTrx_.getStringType());
	  System.out.println("Mpgroup->"+pTrx_.getMPGROUP());
	  System.out.println("Dealquan->"+pTrx_.getDEALQUAN());
	  System.out.println("PriceMethod->"+pTrx_.getPRICEMTH());
	  System.out.println("Salequan->"+pTrx_.getSALEQUAN());
	  System.out.println("Salepric->"+pTrx_.getSALEPRICE());
	  System.out.println("Qtyorwgt->"+pTrx_.getQTYORWGT());
	  System.out.println("Indicador 11->"+pTrx_.getINDICAT1(1));
	  System.out.println("Indicador 12->"+pTrx_.getINDICAT1(2));
	  System.out.println("Indicador 13->"+pTrx_.getINDICAT1(3));
	  System.out.println("Indicador 14->"+pTrx_.getINDICAT1(4));
	  System.out.println("Indicador 15->"+pTrx_.getINDICAT1(5));
	  System.out.println("Indicador 16->"+pTrx_.getINDICAT1(6));
	  System.out.println("Indicador 17->"+pTrx_.getINDICAT1(7));
	  System.out.println("Indicador 18->"+pTrx_.getINDICAT1(8));*/
  }	
	
	
  private static void printDiscount(DiscountString pTrx_){
	  /*System.out.println("String Type->"+pTrx_.getStringType());
	  System.out.println("DisGroup->"+pTrx_.getDISGROUP());
	  System.out.println("DisRate->"+pTrx_.getDISRATE());
	  System.out.println("AmtDisco->"+pTrx_.getAMTDISCO());
	  System.out.println("TaxExemp->"+pTrx_.getTAXEXEMP());*/
  }

  private static void printTender(TenderString pTrx_){
	  /*System.out.println("String Type->"+pTrx_.getStringType());
	  System.out.println("TendType->"+pTrx_.getTENDTYPE());
	  System.out.println("AmtTende->"+pTrx_.getAMTTENDE());
	  System.out.println("AmtTnFee->"+pTrx_.getAMTTNFEE());
	  System.out.println("Customer->"+pTrx_.getCUSTOMER());
	  System.out.println("Status->"+pTrx_.getSTATUS());*/
  }
	
  private static void printTax(TaxString pTrx_){
	  /*System.out.println("String Type->"+pTrx_.getStringType());
	  System.out.println("AmtTaxA->"+pTrx_.getAMTTAXA());
	  System.out.println("AmtTaxB->"+pTrx_.getAMTTAXB());
	  System.out.println("AmtTaxC->"+pTrx_.getAMTTAXC());
	  System.out.println("AmtTaxD->"+pTrx_.getAMTTAXD());
	  System.out.println("AmtSaleA->"+pTrx_.getAMTTAXLEA());
	  System.out.println("AmtSaleB->"+pTrx_.getAMTTAXLEB());
	  System.out.println("AmtSaleC->"+pTrx_.getAMTTAXLEC());
	  System.out.println("AmtSaleD->"+pTrx_.getAMTTAXLED());*/
  }
	
  private static void printFoodStampChange(FoodStampChangeString pTrx_){
	  /*System.out.println("String Type->"+pTrx_.getStringType());
	  System.out.println("Tend Type->"+pTrx_.getTendType());
	  System.out.println("AmtChange->"+pTrx_.getAmtChange());*/
  }	

  private static void printManagerOverride(ManagerOverrideString pTrx_){
	  /*System.out.println("String Type->"+pTrx_.getStringType());
	  System.out.println("Override->"+pTrx_.getOVERRIDE());
	  System.out.println("Reason->"+pTrx_.getREASON());*/
  }	
	
  private static void printDataEntry(DataEntryString pTrx_){
	  /*System.out.println("String Type->"+pTrx_.getStringType());
	  //System.out.println("Data 0->"+pTrx_.getUserData(0));
	  System.out.println("Data 1->"+pTrx_.getUserData(1));
	  System.out.println("Data 2->"+pTrx_.getUserData(2));
	  System.out.println("Data 3->"+pTrx_.getUserData(3));
	  System.out.println("Data 4->"+pTrx_.getUserData(4));
	  System.out.println("Data 5->"+pTrx_.getUserData(5));
	  System.out.println("Data 6->"+pTrx_.getUserData(6));*/
	  //System.out.println("Data 7->"+pTrx_.getUserData(7));
  }
		
  private static void printPriceChange(PriceChangeString pTrx_){
	  /*System.out.println("String Type->"+pTrx_.getStringType());
	  System.out.println("Item Code->"+pTrx_.getITEMCODE());
	  System.out.println("New Deal Q->"+pTrx_.getNEWDEALQ());
	  System.out.println("New Price->"+pTrx_.getNEWPRICE());
	  System.out.println("OldDealQ->"+pTrx_.getOLDDEALQ());
	  System.out.println("Old Price->"+pTrx_.getOLDPRICE());*/
  }	
	
  private static void printTillChange(TillChangeString pTrx_){
	  /*System.out.println("String Type->"+pTrx_.getStringType());
	  System.out.println("Num loans->"+pTrx_.getNUMBERLOANS());
	  System.out.println("Amt loans->"+pTrx_.getAMTLOANS());
	  System.out.println("Num Pickups->"+pTrx_.getNUMBERPKUPS());
	  System.out.println("Amt Pickups->"+pTrx_.getAMTPKUPS());
	  System.out.println("Tend Type1 Pos->"+pTrx_.getTENDTYP11());
	  System.out.println("Amt Tend1 Pos->"+pTrx_.getAMTTEND11());
	  System.out.println("Tend Type 8 Pos->"+pTrx_.getTENDTYP18());
	  System.out.println("Amt Tend8 Pos->"+pTrx_.getAMTTEND18());
	  System.out.println("Negative->"+pTrx_.getNegative());
	  System.out.println("Tend Type1 Neg->"+pTrx_.getTENDTYP21());
	  System.out.println("Amt Tend1 Neg->"+pTrx_.getAMTTEND21());		
	  System.out.println("Tend Type8 Neg->"+pTrx_.getTENDTYP28());
	  System.out.println("Amt Tend8 Neg->"+pTrx_.getAMTTEND28());*/
  }

			
  private static void printItemRecordCharge(ItemRecordChargeString pTrx_){
	  /*System.out.println("String Type->"+pTrx_.getStringType());
	  System.out.println("Old Data->"+pTrx_.getOLDDATA());
	  System.out.println("New Data->"+pTrx_.getNEWDATA());*/
  }

  private static void printTradingStamps(TradingStampsString pTrx_){
	  /*System.out.println("String Type->"+pTrx_.getStringType());
	  System.out.println("Stamps->"+pTrx_.getSTAMPS());*/
  }	

  private static void printMiscellaneousCashItemTracking(MiscellaneousCashItemTrackingString pTrx_){
	  /*System.out.println("String Type->"+pTrx_.getStringType());
	  System.out.println("Item Code->"+pTrx_.getItemCode());
	  System.out.println("X Price->"+pTrx_.getItemCode());
	  System.out.println("Departme->"+pTrx_.getItemCode());
	  System.out.println("FamilyNu current->"+pTrx_.getItemCode());
	  System.out.println("FamilyNu Previous->"+pTrx_.getItemCode());
	  System.out.println("Indicat11->"+pTrx_.getIndicat1(1));
	  System.out.println("Indicat12->"+pTrx_.getIndicat1(2));
	  System.out.println("Indicat13->"+pTrx_.getIndicat1(3));
	  System.out.println("Indicat14->"+pTrx_.getIndicat1(4));
	  System.out.println("Indicat15->"+pTrx_.getIndicat1(5));
	  System.out.println("Indicat16->"+pTrx_.getIndicat1(6));
	  System.out.println("Indicat17->"+pTrx_.getIndicat1(7));
	  System.out.println("Indicat18->"+pTrx_.getIndicat1(8));
	  System.out.println("Indicat19->"+pTrx_.getIndicat1(9));
	  System.out.println("Indicat110->"+pTrx_.getIndicat1(10));
	  System.out.println("Indicat111->"+pTrx_.getIndicat1(11));
	  System.out.println("Indicat112->"+pTrx_.getIndicat1(12));
	  System.out.println("Indicat113->"+pTrx_.getIndicat1(13));
	  System.out.println("Indicat114->"+pTrx_.getIndicat1(14));
	  System.out.println("Indicat115->"+pTrx_.getIndicat1(15));
	  System.out.println("Indicat116->"+pTrx_.getIndicat1(16));
		
	  System.out.println("Indicat21->"+pTrx_.getIndicat2(1));
	  System.out.println("Indicat22->"+pTrx_.getIndicat2(2));
	  System.out.println("Indicat23->"+pTrx_.getIndicat2(3));
	  System.out.println("Indicat24->"+pTrx_.getIndicat2(4));
	  System.out.println("Indicat25->"+pTrx_.getIndicat2(5));
	  System.out.println("Indicat26->"+pTrx_.getIndicat2(6));
	  System.out.println("Indicat27->"+pTrx_.getIndicat2(7));
	  System.out.println("Indicat28->"+pTrx_.getIndicat2(8));
	  System.out.println("Indicat29->"+pTrx_.getIndicat2(9));
	  System.out.println("Indicat210->"+pTrx_.getIndicat2(10));
	  System.out.println("Indicat211->"+pTrx_.getIndicat2(11));
	  System.out.println("Indicat212->"+pTrx_.getIndicat2(12));
	  System.out.println("Indicat213->"+pTrx_.getIndicat2(13));
	  System.out.println("Indicat214->"+pTrx_.getIndicat2(14));
	  System.out.println("Indicat215->"+pTrx_.getIndicat2(15));
	  System.out.println("Indicat216->"+pTrx_.getIndicat2(16));
		
	  System.out.println("Indicat3->"+pTrx_.getIndicat3());
	  System.out.println("TendType->"+pTrx_.getTendType());
	*/
  }
	
  private static void printOperatorTraining(OperatorTrainingString pTrx_){
	  //System.out.println("String Type->"+pTrx_.getStringType());
  }	

  private static void printUserDataReserved(UserDataReservedString pTrx_){
	  //System.out.println("String Type->"+pTrx_.getStringType());
	  //System.out.println("UserData->"+pTrx_.getUserData());
  }

	
  private static void printExceptionLog(ExceptionLogString pTrx_){
	  //System.out.println("String Type->"+pTrx_.getStringType());
	  //System.out.println("Log Data->"+pTrx_.getLOGDATA());
	  /*System.out.println("Log Data1->"+pTrx_.getLogData1());
	  System.out.println("Log Data2->"+pTrx_.getLogData2());
	  System.out.println("Log Data3->"+pTrx_.getLogData3());
	  System.out.println("Log Data4->"+pTrx_.getLogData4());
	  System.out.println("Log Data5->"+pTrx_.getLogData5());
	  System.out.println("Log Data6->"+pTrx_.getLogData6());*/		
  }

  private static void printStoreClosing(StoreClosingString pTrx_){
	  /*System.out.println("String Type->"+pTrx_.getStringType());
	  System.out.println("Date Time->"+pTrx_.getDateTime());
	  System.out.println("Indicat1->"+pTrx_.getINDICAT1());
	  System.out.println("Indicat21->"+pTrx_.getINDICAT2(1));
	  System.out.println("Indicat22->"+pTrx_.getINDICAT2(2));
	  System.out.println("Indicat23->"+pTrx_.getINDICAT2(3));
	  System.out.println("Indicat24->"+pTrx_.getINDICAT2(4));
	  System.out.println("Indicat25->"+pTrx_.getINDICAT2(5));
	  System.out.println("Indicat26->"+pTrx_.getINDICAT2(6));
	  System.out.println("Indicat27->"+pTrx_.getINDICAT2(7));
	  System.out.println("Indicat28->"+pTrx_.getINDICAT2(8));*/		
  }
	
}
