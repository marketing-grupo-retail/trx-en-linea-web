/*
 * Created on Dec 13, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.facade;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.asic.framework.exception.ServiceException;
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

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ProcesarTransaccionFacadeAdapterTest extends TestCase {

	ProcesarTransaccionFacadeAdapter adap_ = new ProcesarTransaccionFacadeAdapter();
	/**
	 * Constructor for ProcesarTransaccionFacadeAdapterTest.
	 * @param arg0
	 */
	public ProcesarTransaccionFacadeAdapterTest(String arg0) {
		super(arg0);
	}

	/*public void testProcesarTransaccion() {
	
		try {
			adap_.procesarTransaccion();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
	public void testInsertTransaccion() {
		TRANSACCION vo_ = new TRANSACCION_Imp();
		TRANSACCION vo1_ = new TRANSACCION_Imp();
		TRANSACCION vo2_ = new TRANSACCION_Imp();
		TRANSACCION vo3_ = new TRANSACCION_Imp();
		TRANSACCION vo4_ = new TRANSACCION_Imp();
		TRANSACCION vo5_ = new TRANSACCION_Imp();
		TRANSACCION vo6_ = new TRANSACCION_Imp();
		TRANSACCION vo7_ = new TRANSACCION_Imp();
		TRANSACCION vo8_ = new TRANSACCION_Imp();
		TRANSACCION vo9_ = new TRANSACCION_Imp();
		TRANSACCION vo10_ = new TRANSACCION_Imp();
		TRANSACCION vo11_ = new TRANSACCION_Imp();
		TRANSACCION vo12_ = new TRANSACCION_Imp();
		TRANSACCION vo13_ = new TRANSACCION_Imp();
		TRANSACCION vo14_ = new TRANSACCION_Imp();

		//trans. 0004 :2232
		TX_HEADER header_ = new TX_HEADER_Imp();
		header_.setOFFSETY("5165");
		header_.setOFFSETX("1");
		header_.setSTORE("68");
		header_.setTERMINAL("0003");
		header_.setTRANSNUM("0004");
		header_.setDAY("060116");
		header_.setTIME("2232");
		header_.setTRANSTYPE("17");
		header_.setNUMSTRIN("02");
		header_.setOPERATOR("52777114");
		header_.setPASSWORD("80760333");
		header_.setGROSSPOS("00");
		header_.setGROSSNEG("00");
		header_.setRINGTIME("00");
		header_.setTENDERTI("00");
		header_.setSPECIAL("00");
		header_.setINACTIVE("03");
		header_.setINDICAT11("0");
		header_.setINDICAT12("0");
		header_.setINDICAT13("0");
		header_.setINDICAT14("0");
		header_.setINDICAT15("0");
		header_.setINDICAT16("0");
		header_.setINDICAT17("0");
		header_.setINDICAT18("0");
		header_.setINDICAT19("0");
		header_.setINDICAT110("0");
		header_.setINDICAT111("0");
		header_.setINDICAT112("0");
		header_.setINDICAT113("0");
		header_.setINDICAT114("0");
		header_.setINDICAT115("0");
		header_.setINDICAT116("0");
		header_.setINDICAT117("0");
		header_.setINDICAT118("0");
		header_.setINDICAT119("0");
		header_.setINDICAT120("0");
		header_.setINDICAT121("0");
		header_.setINDICAT122("0");
		header_.setINDICAT123("0");
		header_.setINDICAT124("0");
		header_.setINDICAT125("0");
		header_.setINDICAT126("0");
		header_.setINDICAT127("0");
		header_.setINDICAT128("0");
		header_.setINDICAT129("0");
		header_.setINDICAT130("0");
		header_.setINDICAT131("0");
		header_.setINDICAT132("0");
		header_.setTIPO("V");

		TX_EXCEPTION_LOG el_ = new TX_EXCEPTION_LOG_Imp();
		el_.setOFFSETY("5166");
		el_.setOFFSETX("1");
		el_.setSTORE("68");
		el_.setTERMINAL("0003");
		el_.setTRANSNUM("0004");
		el_.setDAY("060116"); // no aparece date sino day
		el_.setTIME("2232");
		el_.setLOGDATA("000322");
		el_.setTIPO("V");

		TX_STORE_CLOSING sc_ = new TX_STORE_CLOSING_Imp();
		sc_.setOFFSETY("5167");
		sc_.setOFFSETX("1");
		sc_.setSTORE("68");
		sc_.setTERMINAL("0003");
		sc_.setTRANSNUM("0004");
		sc_.setDAY("060116"); // no aparece date sino day
		sc_.setTIME("2232");
		sc_.setFECHAHORA("0601162305");
		sc_.setINDICAT2("02");
		sc_.setTIPO("V");

		List lstHead_ = new ArrayList();
		List lstEl_ = new ArrayList();
		List lstSc_ = new ArrayList();
		lstHead_.add(header_);
		lstEl_.add(el_);
		lstSc_.add(sc_);
		vo_.setHeader(lstHead_);
		vo_.setExceptionLog(lstEl_);
		vo_.setStoreClosig(lstSc_);

		//trans. 0008 : 0838
		TX_HEADER header1_ = new TX_HEADER_Imp();
		header1_.setOFFSETY("96");
		header1_.setOFFSETX("1");
		header1_.setSTORE("68");
		header1_.setTERMINAL("0033");
		header1_.setTRANSNUM("0008");
		header1_.setDAY("060116");
		header1_.setTIME("0838");
		header1_.setTRANSTYPE("00");
		header1_.setNUMSTRIN("10");
		header1_.setOPERATOR("80416468");
		header1_.setPASSWORD("0159");
		header1_.setGROSSPOS("259900");
		header1_.setGROSSNEG("00");
		header1_.setRINGTIME("08");
		header1_.setTENDERTI("59");
		header1_.setSPECIAL("0205");
		header1_.setINACTIVE("0192");
		header1_.setINDICAT11("0");
		header1_.setINDICAT12("0");
		header1_.setINDICAT13("0");
		header1_.setINDICAT14("0");
		header1_.setINDICAT15("0");
		header1_.setINDICAT16("0");
		header1_.setINDICAT17("0");
		header1_.setINDICAT18("0");
		header1_.setINDICAT19("0");
		header1_.setINDICAT110("0");
		header1_.setINDICAT111("0");
		header1_.setINDICAT112("0");
		header1_.setINDICAT113("0");
		header1_.setINDICAT114("0");
		header1_.setINDICAT115("0");
		header1_.setINDICAT116("0");
		header1_.setINDICAT117("0");
		header1_.setINDICAT118("0");
		header1_.setINDICAT119("0");
		header1_.setINDICAT120("0");
		header1_.setINDICAT121("0");
		header1_.setINDICAT122("0");
		header1_.setINDICAT123("0");
		header1_.setINDICAT124("0");
		header1_.setINDICAT125("0");
		header1_.setINDICAT126("0");
		header1_.setINDICAT127("0");
		header1_.setINDICAT128("0");
		header1_.setINDICAT129("0");
		header1_.setINDICAT130("0");
		header1_.setINDICAT131("1");
		header1_.setINDICAT132("0");
		header1_.setTIPO("V");

		TX_ITEMENTRY it_ = new TX_ITEMENTRY_Imp();
		it_.setOFFSETY("96");
		it_.setOFFSETX("6");
		it_.setSTORE("68");
		it_.setTERMINAL("0033");
		it_.setTRANSNUM("0008");
		it_.setDAY("060116"); // no hay date sino day
		it_.setTIME("0838");
		it_.setITEMCODE("073649");
		it_.setXPRICE("010000");
		it_.setDEPARTME("10");
		it_.setFAMILYNU1("000");
		it_.setFAMILYNU2("000");
		it_.setINDICAT11("0");
		it_.setINDICAT12("0");
		it_.setINDICAT13("0");
		it_.setINDICAT14("0");
		it_.setINDICAT15("0");
		it_.setINDICAT16("0");
		it_.setINDICAT17("0");
		it_.setINDICAT18("0");
		it_.setINDICAT19("1");
		it_.setINDICAT110("0");
		it_.setINDICAT111("0");
		it_.setINDICAT112("0");
		it_.setINDICAT113("0");
		it_.setINDICAT114("0");
		it_.setINDICAT115("0");
		it_.setINDICAT116("0");
		it_.setINDICAT21("0");
		it_.setINDICAT22("0");
		it_.setINDICAT23("0");
		it_.setINDICAT24("0");
		it_.setINDICAT25("1");
		it_.setINDICAT26("0");
		it_.setINDICAT27("0");
		it_.setINDICAT28("0");
		it_.setINDICAT29("0");
		it_.setINDICAT210("0");
		it_.setINDICAT211("0");
		it_.setINDICAT212("0");
		it_.setINDICAT213("0");
		it_.setINDICAT214("0");
		it_.setINDICAT215("1");
		it_.setINDICAT216("0");
		it_.setINDICAT31("0");
		it_.setINDICAT32("1");
		it_.setMPGROUP("00");
		it_.setDEALQUAN("00");
		it_.setPRICEMTH("00");
		it_.setSALEQUAN("01");
		it_.setSALEPRICE("2500");
		it_.setQTYORWGT("04");
		it_.setINDICAT41("0");
		it_.setINDICAT42("0");
		it_.setINDICAT43("1");
		it_.setINDICAT44("0");
		it_.setINDICAT45("0");
		it_.setINDICAT46("0");
		it_.setINDICAT47("0");
		it_.setINDICAT48("0");
		it_.setPRCIVA("16");
		it_.setTIPO("V");

		TX_TENDER td_ = new TX_TENDER_Imp();
		td_.setOFFSETY("96");
		td_.setOFFSETX("9");
		td_.setSTORE("68");
		td_.setTERMINAL("0033");
		td_.setTRANSNUM("0008");
		td_.setDAY("060116"); // no aparece date sino day
		td_.setTIME("0838");
		td_.setTYPE("05");
		td_.setTENDTYPE("62");
		td_.setAMTTENDE("259900");
		td_.setAMTTNFEE("00");
		td_.setCUSTOMER("6271808001371405");
		td_.setSTATUS("50");
		td_.setTIPO("V");

		TX_TAX tx_ = new TX_TAX_Imp();
		tx_.setOFFSETY("96");
		tx_.setOFFSETX("10");
		tx_.setSTORE("68");
		tx_.setTERMINAL("0033");
		tx_.setTRANSNUM("0008");
		tx_.setDAY("060116"); // no aparece date sino day
		tx_.setTIME("0838");
		tx_.setTYPE("07");
		tx_.setAMTTAXA("00");
		tx_.setAMTTAXB("00");
		tx_.setAMTTAXC("00");
		tx_.setAMTTAXD("00");
		tx_.setAMTTAXLEA("259900"); //setAMTTAXEA NO APARECE
		tx_.setAMTTAXLEB("00"); //setAMTTAXEB NO APARECE
		tx_.setAMTTAXLEC("00"); //setAMTTAXEC NO APARECE
		tx_.setAMTTAXLED("00"); //setAMTTAXED NO APARECE
		tx_.setTIPO("V");

		TX_USER_DATA ud_ = new TX_USER_DATA_Imp();
		ud_.setOFFSETY("92");
		ud_.setOFFSETX("2");
		ud_.setSTORE("68");
		ud_.setTERMINAL("0033");
		ud_.setTRANSNUM("0008");
		ud_.setDAY("060116"); // no aparece date sino day
		ud_.setTIME("0838");
		ud_.setTYPE("22082002");
		ud_.setDATA1("000000073638");
		ud_.setDATA2("16");
		ud_.setDATA3("00");
		ud_.setDATA4("00");
		ud_.setDATA5("00");
		ud_.setDATA6("00");
		ud_.setDATA7("00");
		ud_.setDATA8("00");
		ud_.setDATA9("00");
		ud_.setDATA10("00");
		ud_.setDATA11("00");
		ud_.setDATA12("00");
		ud_.setDATA13(null);
		ud_.setDATA14(null);
		ud_.setDATA15(null);
		ud_.setDATA16(null);
		ud_.setDATA17(null);
		ud_.setDATA18(null);
		ud_.setDATA19(null);
		ud_.setDATA20(null);
		ud_.setTIPO("V");

		TX_USER_DATA ud1_ = new TX_USER_DATA_Imp();
		ud1_.setOFFSETY("96");
		ud1_.setOFFSETX("5");
		ud1_.setSTORE("68");
		ud1_.setTERMINAL("0033");
		ud1_.setTRANSNUM("0008");
		ud1_.setDAY("060116"); // no aparece date sino day
		ud1_.setTIME("0838");
		ud1_.setTYPE("22082002");
		ud1_.setDATA1("000000073649");
		ud1_.setDATA2("16");
		ud1_.setDATA3("00");
		ud1_.setDATA4("00");
		ud1_.setDATA5("00");
		ud1_.setDATA6("00");
		ud1_.setDATA7("00");
		ud1_.setDATA8("00");
		ud1_.setDATA9("00");
		ud1_.setDATA10("00");
		ud1_.setDATA11("00");
		ud1_.setDATA12("00");
		ud1_.setDATA13(null);
		ud1_.setDATA14(null);
		ud1_.setDATA15(null);
		ud1_.setDATA16(null);
		ud1_.setDATA17(null);
		ud1_.setDATA18(null);
		ud1_.setDATA19(null);
		ud1_.setDATA20(null);
		ud1_.setTIPO("V");

		//	este registro no ingreso a la BD por el contenido de los campos DATA1 y DATA2
		TX_USER_DATA ud2_ = new TX_USER_DATA_Imp();
		ud2_.setOFFSETY("96");
		ud2_.setOFFSETX("8");
		ud2_.setSTORE("68");
		ud2_.setTERMINAL("0033");
		ud2_.setTRANSNUM("0008");
		ud2_.setDAY("060116"); // no aparece date sino day
		ud2_.setTIME("0838");
		ud2_.setTYPE("22082002");
		ud2_.setDATA1("001010100011299|20000||091931|033|8|20060116|083851|1|0080416468||||6271808001371405||259900|62||01|86041292||6271808001371405=16011010000104110000|0|0|0||03|000000035848|000000224052|106568|||||||C265AA6B098373DD");
		ud2_.setDATA2("001  033A1299|1200||091931|0|20060116|083851|0033|00000008|000000000000|6271808001371405||||80000000||000000046443|||||0000000025990000||||0000000025990000||00|01|00|0|08||N||N||||000000|0000000000000000|||00000|000000000|||||||");
		ud2_.setDATA3("");
		ud2_.setDATA4("00");
		ud2_.setDATA5("00");
		ud2_.setDATA6("00");
		ud2_.setDATA7("00");
		ud2_.setDATA8("00");
		ud2_.setDATA9("00");
		ud2_.setDATA10("00");
		ud2_.setDATA11("00");
		ud2_.setDATA12("00");
		ud2_.setDATA13("00");
		ud2_.setDATA14(null);
		ud2_.setDATA15(null);
		ud2_.setDATA16(null);
		ud2_.setDATA17(null);
		ud2_.setDATA18(null);
		ud2_.setDATA19(null);
		ud2_.setDATA20(null);
		ud2_.setTIPO("V");

		TX_USER_DATA ud3_ = new TX_USER_DATA_Imp();
		ud3_.setOFFSETY("96");
		ud3_.setOFFSETX("11");
		ud3_.setSTORE("68");
		ud3_.setTERMINAL("0033");
		ud3_.setTRANSNUM("0008");
		ud3_.setDAY("060116"); // no aparece date sino day
		ud3_.setTIME("0838");
		ud3_.setTYPE("00");
		ud3_.setDATA1("Tr68330000000000106568");
		ud3_.setDATA2("00");
		ud3_.setDATA3("00");
		ud3_.setDATA4("00");
		ud3_.setDATA5("00");
		ud3_.setDATA6("00");
		ud3_.setDATA7("00");
		ud3_.setDATA8("00");
		ud3_.setDATA9("00");
		ud3_.setDATA10("00");
		ud3_.setDATA11("00");
		ud3_.setDATA12("00");
		ud3_.setDATA13(null);
		ud3_.setDATA14(null);
		ud3_.setDATA15(null);
		ud3_.setDATA16(null);
		ud3_.setDATA17(null);
		ud3_.setDATA18(null);
		ud3_.setDATA19(null);
		ud3_.setDATA20(null);
		ud3_.setTIPO("V");

		List lstHead1_ = new ArrayList();
		List lstTx_ = new ArrayList();
		List lstIt_ = new ArrayList();
		List lstTd_ = new ArrayList();
		List lstUd_ = new ArrayList();

		lstHead1_.add(header1_);
		lstTx_.add(tx_);
		lstIt_.add(it_);
		lstTd_.add(td_);
		lstUd_.add(ud_);
		lstUd_.add(ud1_);
		//lstUd_.add(ud2_);
		lstUd_.add(ud3_);
		
		vo1_.setHeader(lstHead1_);
		vo1_.setTax(lstTx_);
		vo1_.setItemEntry(lstIt_);
		vo1_.setTender(lstTd_);
		vo1_.setUserData(lstUd_);

		//trans.0003 : 0915
		TX_HEADER header2_ = new TX_HEADER_Imp();
		header2_.setOFFSETY("193");
		header2_.setOFFSETX("1");
		header2_.setSTORE("68");
		header2_.setTERMINAL("0014");
		header2_.setTRANSNUM("0003");
		header2_.setDAY("060116");
		header2_.setTIME("0915");
		header2_.setTRANSTYPE("00");
		header2_.setNUMSTRIN("37");
		header2_.setOPERATOR("57432600");
		header2_.setPASSWORD("57432600");
		header2_.setGROSSPOS("175900");
		header2_.setGROSSNEG("00");
		header2_.setRINGTIME("0198");
		header2_.setTENDERTI("57");
		header2_.setSPECIAL("00");
		header2_.setINACTIVE("0168");
		header2_.setINDICAT11("0");
		header2_.setINDICAT12("0");
		header2_.setINDICAT13("0");
		header2_.setINDICAT14("0");
		header2_.setINDICAT15("0");
		header2_.setINDICAT16("0");
		header2_.setINDICAT17("0");
		header2_.setINDICAT18("0");
		header2_.setINDICAT19("0");
		header2_.setINDICAT110("0");
		header2_.setINDICAT111("0");
		header2_.setINDICAT112("0");
		header2_.setINDICAT113("0");
		header2_.setINDICAT114("0");
		header2_.setINDICAT115("0");
		header2_.setINDICAT116("0");
		header2_.setINDICAT117("0");
		header2_.setINDICAT118("0");
		header2_.setINDICAT119("0");
		header2_.setINDICAT120("0");
		header2_.setINDICAT121("0");
		header2_.setINDICAT122("0");
		header2_.setINDICAT123("0");
		header2_.setINDICAT124("0");
		header2_.setINDICAT125("0");
		header2_.setINDICAT126("0");
		header2_.setINDICAT127("0");
		header2_.setINDICAT128("0");
		header2_.setINDICAT129("0");
		header2_.setINDICAT130("0");
		header2_.setINDICAT131("0");
		header2_.setINDICAT132("0");
		header2_.setTIPO("V");

		TX_TAX tx1_ = new TX_TAX_Imp();
		tx1_.setOFFSETY("193");
		tx1_.setOFFSETX("37");
		tx1_.setSTORE("68");
		tx1_.setTERMINAL("0014");
		tx1_.setTRANSNUM("0003");
		tx1_.setDAY("060116"); // no aparece date sino day
		tx1_.setTIME("0915");
		tx1_.setTYPE("07");
		tx1_.setAMTTAXA("00");
		tx1_.setAMTTAXB("00");
		tx1_.setAMTTAXC("00");
		tx1_.setAMTTAXD("00");
		tx1_.setAMTTAXLEA("171350"); //setAMTTAXEA NO APARECE
		tx1_.setAMTTAXLEB("00"); //setAMTTAXEB NO APARECE
		tx1_.setAMTTAXLEC("00"); //setAMTTAXEC NO APARECE
		tx1_.setAMTTAXLED("00"); //setAMTTAXED NO APARECE
		tx1_.setTIPO("V");

		List lstHead2_ = new ArrayList();
		List lstTx1_ = new ArrayList();
		lstHead2_.add(header2_);
		lstTx1_.add(tx1_);
		
		vo2_.setHeader(lstHead2_);
		vo2_.setTax(lstTx1_);

		// trans. 0236 :2112
		TX_HEADER header3_ = new TX_HEADER_Imp();
		header3_.setOFFSETY("5011");
		header3_.setOFFSETX("1");
		header3_.setSTORE("68");
		header3_.setTERMINAL("0006");
		header3_.setTRANSNUM("0236");
		header3_.setDAY("060116");
		header3_.setTIME("2112");
		header3_.setTRANSTYPE("00");
		header3_.setNUMSTRIN("53");
		header3_.setOPERATOR("80877900");
		header3_.setPASSWORD("02024850");
		header3_.setGROSSPOS("208250");
		header3_.setGROSSNEG("00");
		header3_.setRINGTIME("0108");
		header3_.setTENDERTI("62");
		header3_.setSPECIAL("00");
		header3_.setINACTIVE("65");
		header3_.setINDICAT11("0");
		header3_.setINDICAT12("0");
		header3_.setINDICAT13("0");
		header3_.setINDICAT14("0");
		header3_.setINDICAT15("0");
		header3_.setINDICAT16("0");
		header3_.setINDICAT17("0");
		header3_.setINDICAT18("0");
		header3_.setINDICAT19("0");
		header3_.setINDICAT110("0");
		header3_.setINDICAT111("0");
		header3_.setINDICAT112("0");
		header3_.setINDICAT113("0");
		header3_.setINDICAT114("0");
		header3_.setINDICAT115("0");
		header3_.setINDICAT116("0");
		header3_.setINDICAT117("0");
		header3_.setINDICAT118("0");
		header3_.setINDICAT119("0");
		header3_.setINDICAT120("0");
		header3_.setINDICAT121("0");
		header3_.setINDICAT122("0");
		header3_.setINDICAT123("0");
		header3_.setINDICAT124("0");
		header3_.setINDICAT125("0");
		header3_.setINDICAT126("0");
		header3_.setINDICAT127("0");
		header3_.setINDICAT128("0");
		header3_.setINDICAT129("0");
		header3_.setINDICAT130("0");
		header3_.setINDICAT131("0");
		header3_.setINDICAT132("0");
		header3_.setTIPO("V");

		TX_TENDER td1_ = new TX_TENDER_Imp();
		td1_.setOFFSETY("5011");
		td1_.setOFFSETX("50");
		td1_.setSTORE("68");
		td1_.setTERMINAL("0006");
		td1_.setTRANSNUM("0236");
		td1_.setDAY("060116"); // no aparece date sino day
		td1_.setTIME("2112");
		td1_.setTYPE("05");
		td1_.setTENDTYPE("11");
		td1_.setAMTTENDE("00");
		td1_.setAMTTNFEE("00");
		td1_.setCUSTOMER("00");
		td1_.setSTATUS("00");
		td1_.setTIPO("V");

		TX_TENDER td2_ = new TX_TENDER_Imp();
		td2_.setOFFSETY("5011");
		td2_.setOFFSETX("52");
		td2_.setSTORE("68");
		td2_.setTERMINAL("0006");
		td2_.setTRANSNUM("0236");
		td2_.setDAY("060116"); // no aparece date sino day
		td2_.setTIME("2112");
		td2_.setTYPE("05");
		td2_.setTENDTYPE("61");
		td2_.setAMTTENDE("208250");
		td2_.setAMTTNFEE("00");
		td2_.setCUSTOMER("01");
		td2_.setSTATUS("50");
		td2_.setTIPO("V");

		List lstHead3_ = new ArrayList();
		List lstTd1_ = new ArrayList();
		lstHead3_.add(header3_);
		lstTd1_.add(td1_);
		lstTd1_.add(td2_);

		vo3_.setHeader(lstHead3_);
		vo3_.setTender(lstTd1_);

		
		//trans.0161 : 1550
		TX_HEADER header4_ = new TX_HEADER_Imp();
		header4_.setOFFSETY("2562");
		header4_.setOFFSETX("1");
		header4_.setSTORE("68");
		header4_.setTERMINAL("0012");
		header4_.setTRANSNUM("0161");
		header4_.setDAY("060116");
		header4_.setTIME("1550");
		header4_.setTRANSTYPE("00");
		header4_.setNUMSTRIN("18");
		header4_.setOPERATOR("80813455");
		header4_.setPASSWORD("80813455");
		header4_.setGROSSPOS("061200");
		header4_.setGROSSNEG("00");
		header4_.setRINGTIME("15");
		header4_.setTENDERTI("69");
		header4_.setSPECIAL("00");
		header4_.setINACTIVE("10");
		header4_.setINDICAT11("0");
		header4_.setINDICAT12("0");
		header4_.setINDICAT13("0");
		header4_.setINDICAT14("0");
		header4_.setINDICAT15("0");
		header4_.setINDICAT16("0");
		header4_.setINDICAT17("0");
		header4_.setINDICAT18("0");
		header4_.setINDICAT19("0");
		header4_.setINDICAT110("0");
		header4_.setINDICAT111("0");
		header4_.setINDICAT112("0");
		header4_.setINDICAT113("0");
		header4_.setINDICAT114("0");
		header4_.setINDICAT115("0");
		header4_.setINDICAT116("0");
		header4_.setINDICAT117("0");
		header4_.setINDICAT118("0");
		header4_.setINDICAT119("0");
		header4_.setINDICAT120("0");
		header4_.setINDICAT121("0");
		header4_.setINDICAT122("0");
		header4_.setINDICAT123("0");
		header4_.setINDICAT124("0");
		header4_.setINDICAT125("0");
		header4_.setINDICAT126("0");
		header4_.setINDICAT127("0");
		header4_.setINDICAT128("0");
		header4_.setINDICAT129("0");
		header4_.setINDICAT130("0");
		header4_.setINDICAT131("0");
		header4_.setINDICAT132("0");
		header4_.setTIPO("V");

		TX_ITEMENTRY it1_ = new TX_ITEMENTRY_Imp();
		it1_.setOFFSETY("2562");
		it1_.setOFFSETX("3");
		it1_.setSTORE("68");
		it1_.setTERMINAL("0012");
		it1_.setTRANSNUM("0161");
		it1_.setDAY("060116"); // no hay date sino day
		it1_.setTIME("1550");
		it1_.setITEMCODE("8855");
		it1_.setXPRICE("4250");
		it1_.setDEPARTME("60");
		it1_.setFAMILYNU1("000");
		it1_.setFAMILYNU2("000");
		it1_.setINDICAT11("0");
		it1_.setINDICAT12("0");
		it1_.setINDICAT13("0");
		it1_.setINDICAT14("0");
		it1_.setINDICAT15("0");
		it1_.setINDICAT16("0");
		it1_.setINDICAT17("0");
		it1_.setINDICAT18("0");
		it1_.setINDICAT19("1");
		it1_.setINDICAT110("0");
		it1_.setINDICAT111("0");
		it1_.setINDICAT112("0");
		it1_.setINDICAT113("0");
		it1_.setINDICAT114("0");
		it1_.setINDICAT115("0");
		it1_.setINDICAT116("0");
		it1_.setINDICAT21("0");
		it1_.setINDICAT22("0");
		it1_.setINDICAT23("0");
		it1_.setINDICAT24("0");
		it1_.setINDICAT25("0");
		it1_.setINDICAT26("0");
		it1_.setINDICAT27("0");
		it1_.setINDICAT28("0");
		it1_.setINDICAT29("0");
		it1_.setINDICAT210("0");
		it1_.setINDICAT211("0");
		it1_.setINDICAT212("0");
		it1_.setINDICAT213("0");
		it1_.setINDICAT214("0");
		it1_.setINDICAT215("0");
		it1_.setINDICAT216("0");
		it1_.setINDICAT31("0");
		it1_.setINDICAT32("0");
		it1_.setMPGROUP("00");
		it1_.setDEALQUAN("00");
		it1_.setPRICEMTH("00");
		it1_.setSALEQUAN("00");
		it1_.setSALEPRICE("00");
		it1_.setQTYORWGT("00");
		it1_.setINDICAT41("0");
		it1_.setINDICAT42("0");
		it1_.setINDICAT43("0");
		it1_.setINDICAT44("0");
		it1_.setINDICAT45("0");
		it1_.setINDICAT46("0");
		it1_.setINDICAT47("0");
		it1_.setINDICAT48("0");
		it1_.setPRCIVA("16");
		it1_.setTIPO("V");

		TX_ITEMENTRY it2_ = new TX_ITEMENTRY_Imp();
		it2_.setOFFSETY("2562");
		it2_.setOFFSETX("5");
		it2_.setSTORE("68");
		it2_.setTERMINAL("0012");
		it2_.setTRANSNUM("0161");
		it2_.setDAY("060116"); // no hay date sino day
		it2_.setTIME("1550");
		it2_.setITEMCODE("033526");
		it2_.setXPRICE("8450");
		it2_.setDEPARTME("30");
		it2_.setFAMILYNU1("000");
		it2_.setFAMILYNU2("000");
		it2_.setINDICAT11("0");
		it2_.setINDICAT12("0");
		it2_.setINDICAT13("0");
		it2_.setINDICAT14("0");
		it2_.setINDICAT15("0");
		it2_.setINDICAT16("0");
		it2_.setINDICAT17("0");
		it2_.setINDICAT18("0");
		it2_.setINDICAT19("1");
		it2_.setINDICAT110("0");
		it2_.setINDICAT111("0");
		it2_.setINDICAT112("0");
		it2_.setINDICAT113("0");
		it2_.setINDICAT114("0");
		it2_.setINDICAT115("0");
		it2_.setINDICAT116("0");
		it2_.setINDICAT21("0");
		it2_.setINDICAT22("0");
		it2_.setINDICAT23("0");
		it2_.setINDICAT24("0");
		it2_.setINDICAT25("0");
		it2_.setINDICAT26("0");
		it2_.setINDICAT27("0");
		it2_.setINDICAT28("0");
		it2_.setINDICAT29("0");
		it2_.setINDICAT210("0");
		it2_.setINDICAT211("0");
		it2_.setINDICAT212("0");
		it2_.setINDICAT213("0");
		it2_.setINDICAT214("0");
		it2_.setINDICAT215("0");
		it2_.setINDICAT216("0");
		it2_.setINDICAT31("0");
		it2_.setINDICAT32("0");
		it2_.setMPGROUP("00");
		it2_.setDEALQUAN("00");
		it2_.setPRICEMTH("00");
		it2_.setSALEQUAN("00");
		it2_.setSALEPRICE("00");
		it2_.setQTYORWGT("00");
		it2_.setINDICAT41("0");
		it2_.setINDICAT42("0");
		it2_.setINDICAT43("0");
		it2_.setINDICAT44("0");
		it2_.setINDICAT45("0");
		it2_.setINDICAT46("0");
		it2_.setINDICAT47("0");
		it2_.setINDICAT48("0");
		it2_.setPRCIVA("16");
		it2_.setTIPO("V");

		TX_ITEMENTRY it3_ = new TX_ITEMENTRY_Imp();
		it3_.setOFFSETY("2562");
		it3_.setOFFSETX("7");
		it3_.setSTORE("68");
		it3_.setTERMINAL("0012");
		it3_.setTRANSNUM("0161");
		it3_.setDAY("060116"); // no hay date sino day
		it3_.setTIME("1550");
		it3_.setITEMCODE("053853");
		it3_.setXPRICE("4950");
		it3_.setDEPARTME("65");
		it3_.setFAMILYNU1("000");
		it3_.setFAMILYNU2("000");
		it3_.setINDICAT11("0");
		it3_.setINDICAT12("0");
		it3_.setINDICAT13("0");
		it3_.setINDICAT14("0");
		it3_.setINDICAT15("0");
		it3_.setINDICAT16("0");
		it3_.setINDICAT17("0");
		it3_.setINDICAT18("0");
		it3_.setINDICAT19("1");
		it3_.setINDICAT110("0");
		it3_.setINDICAT111("0");
		it3_.setINDICAT112("0");
		it3_.setINDICAT113("0");
		it3_.setINDICAT114("0");
		it3_.setINDICAT115("0");
		it3_.setINDICAT116("0");
		it3_.setINDICAT21("0");
		it3_.setINDICAT22("0");
		it3_.setINDICAT23("0");
		it3_.setINDICAT24("0");
		it3_.setINDICAT25("0");
		it3_.setINDICAT26("0");
		it3_.setINDICAT27("0");
		it3_.setINDICAT28("0");
		it3_.setINDICAT29("0");
		it3_.setINDICAT210("0");
		it3_.setINDICAT211("0");
		it3_.setINDICAT212("0");
		it3_.setINDICAT213("0");
		it3_.setINDICAT214("0");
		it3_.setINDICAT215("0");
		it3_.setINDICAT216("0");
		it3_.setINDICAT31("0");
		it3_.setINDICAT32("0");
		it3_.setMPGROUP("00");
		it3_.setDEALQUAN("00");
		it3_.setPRICEMTH("00");
		it3_.setSALEQUAN("00");
		it3_.setSALEPRICE("00");
		it3_.setQTYORWGT("00");
		it3_.setINDICAT41("0");
		it3_.setINDICAT42("0");
		it3_.setINDICAT43("0");
		it3_.setINDICAT44("0");
		it3_.setINDICAT45("0");
		it3_.setINDICAT46("0");
		it3_.setINDICAT47("0");
		it3_.setINDICAT48("0");
		it3_.setPRCIVA("16");
		it3_.setTIPO("V");

		TX_ITEMENTRY it4_ = new TX_ITEMENTRY_Imp();
		it4_.setOFFSETY("2562");
		it4_.setOFFSETX("9");
		it4_.setSTORE("68");
		it4_.setTERMINAL("0012");
		it4_.setTRANSNUM("0161");
		it4_.setDAY("060116"); // no hay date sino day
		it4_.setTIME("1550");
		it4_.setITEMCODE("011731");
		it4_.setXPRICE("5300");
		it4_.setDEPARTME("30");
		it4_.setFAMILYNU1("000");
		it4_.setFAMILYNU2("000");
		it4_.setINDICAT11("0");
		it4_.setINDICAT12("0");
		it4_.setINDICAT13("0");
		it4_.setINDICAT14("0");
		it4_.setINDICAT15("0");
		it4_.setINDICAT16("0");
		it4_.setINDICAT17("0");
		it4_.setINDICAT18("0");
		it4_.setINDICAT19("1");
		it4_.setINDICAT110("0");
		it4_.setINDICAT111("0");
		it4_.setINDICAT112("0");
		it4_.setINDICAT113("0");
		it4_.setINDICAT114("0");
		it4_.setINDICAT115("0");
		it4_.setINDICAT116("0");
		it4_.setINDICAT21("0");
		it4_.setINDICAT22("0");
		it4_.setINDICAT23("0");
		it4_.setINDICAT24("0");
		it4_.setINDICAT25("0");
		it4_.setINDICAT26("0");
		it4_.setINDICAT27("0");
		it4_.setINDICAT28("0");
		it4_.setINDICAT29("0");
		it4_.setINDICAT210("0");
		it4_.setINDICAT211("0");
		it4_.setINDICAT212("0");
		it4_.setINDICAT213("0");
		it4_.setINDICAT214("0");
		it4_.setINDICAT215("0");
		it4_.setINDICAT216("0");
		it4_.setINDICAT31("0");
		it4_.setINDICAT32("0");
		it4_.setMPGROUP("00");
		it4_.setDEALQUAN("00");
		it4_.setPRICEMTH("00");
		it4_.setSALEQUAN("00");
		it4_.setSALEPRICE("00");
		it4_.setQTYORWGT("00");
		it4_.setINDICAT41("0");
		it4_.setINDICAT42("0");
		it4_.setINDICAT43("0");
		it4_.setINDICAT44("0");
		it4_.setINDICAT45("0");
		it4_.setINDICAT46("0");
		it4_.setINDICAT47("0");
		it4_.setINDICAT48("0");
		it4_.setPRCIVA("16");
		it4_.setTIPO("V");

		TX_ITEMENTRY it7_ = new TX_ITEMENTRY_Imp();
		it7_.setOFFSETY("2562");
		it7_.setOFFSETX("11");
		it7_.setSTORE("68");
		it7_.setTERMINAL("0012");
		it7_.setTRANSNUM("0161");
		it7_.setDAY("060116"); // no hay date sino day
		it7_.setTIME("1550");
		it7_.setITEMCODE("033526");
		it7_.setXPRICE("8450");
		it7_.setDEPARTME("30");
		it7_.setFAMILYNU1("000");
		it7_.setFAMILYNU2("000");
		it7_.setINDICAT11("0");
		it7_.setINDICAT12("0");
		it7_.setINDICAT13("0");
		it7_.setINDICAT14("0");
		it7_.setINDICAT15("0");
		it7_.setINDICAT16("0");
		it7_.setINDICAT17("0");
		it7_.setINDICAT18("0");
		it7_.setINDICAT19("1");
		it7_.setINDICAT110("0");
		it7_.setINDICAT111("0");
		it7_.setINDICAT112("0");
		it7_.setINDICAT113("0");
		it7_.setINDICAT114("0");
		it7_.setINDICAT115("0");
		it7_.setINDICAT116("0");
		it7_.setINDICAT21("0");
		it7_.setINDICAT22("0");
		it7_.setINDICAT23("0");
		it7_.setINDICAT24("0");
		it7_.setINDICAT25("0");
		it7_.setINDICAT26("0");
		it7_.setINDICAT27("0");
		it7_.setINDICAT28("0");
		it7_.setINDICAT29("0");
		it7_.setINDICAT210("0");
		it7_.setINDICAT211("0");
		it7_.setINDICAT212("0");
		it7_.setINDICAT213("0");
		it7_.setINDICAT214("0");
		it7_.setINDICAT215("0");
		it7_.setINDICAT216("0");
		it7_.setINDICAT31("0");
		it7_.setINDICAT32("0");
		it7_.setMPGROUP("00");
		it7_.setDEALQUAN("00");
		it7_.setPRICEMTH("00");
		it7_.setSALEQUAN("00");
		it7_.setSALEPRICE("00");
		it7_.setQTYORWGT("00");
		it7_.setINDICAT41("0");
		it7_.setINDICAT42("0");
		it7_.setINDICAT43("0");
		it7_.setINDICAT44("0");
		it7_.setINDICAT45("0");
		it7_.setINDICAT46("0");
		it7_.setINDICAT47("0");
		it7_.setINDICAT48("0");
		it7_.setPRCIVA("16");
		it7_.setTIPO("V");

		TX_ITEMENTRY it5_ = new TX_ITEMENTRY_Imp();
		it5_.setOFFSETY("2562");
		it5_.setOFFSETX("13");
		it5_.setSTORE("68");
		it5_.setTERMINAL("0012");
		it5_.setTRANSNUM("0161");
		it5_.setDAY("060116"); // no hay date sino day
		it5_.setTIME("1550");
		it5_.setITEMCODE("060130");
		it5_.setXPRICE("7900");
		it5_.setDEPARTME("60");
		it5_.setFAMILYNU1("000");
		it5_.setFAMILYNU2("000");
		it5_.setINDICAT11("0");
		it5_.setINDICAT12("0");
		it5_.setINDICAT13("0");
		it5_.setINDICAT14("0");
		it5_.setINDICAT15("0");
		it5_.setINDICAT16("0");
		it5_.setINDICAT17("0");
		it5_.setINDICAT18("0");
		it5_.setINDICAT19("1");
		it5_.setINDICAT110("0");
		it5_.setINDICAT111("0");
		it5_.setINDICAT112("0");
		it5_.setINDICAT113("0");
		it5_.setINDICAT114("0");
		it5_.setINDICAT115("0");
		it5_.setINDICAT116("0");
		it5_.setINDICAT21("0");
		it5_.setINDICAT22("0");
		it5_.setINDICAT23("0");
		it5_.setINDICAT24("0");
		it5_.setINDICAT25("0");
		it5_.setINDICAT26("0");
		it5_.setINDICAT27("0");
		it5_.setINDICAT28("0");
		it5_.setINDICAT29("0");
		it5_.setINDICAT210("0");
		it5_.setINDICAT211("0");
		it5_.setINDICAT212("0");
		it5_.setINDICAT213("0");
		it5_.setINDICAT214("0");
		it5_.setINDICAT215("0");
		it5_.setINDICAT216("0");
		it5_.setINDICAT31("0");
		it5_.setINDICAT32("0");
		it5_.setMPGROUP("00");
		it5_.setDEALQUAN("00");
		it5_.setPRICEMTH("00");
		it5_.setSALEQUAN("00");
		it5_.setSALEPRICE("00");
		it5_.setQTYORWGT("00");
		it5_.setINDICAT41("0");
		it5_.setINDICAT42("0");
		it5_.setINDICAT43("0");
		it5_.setINDICAT44("0");
		it5_.setINDICAT45("0");
		it5_.setINDICAT46("0");
		it5_.setINDICAT47("0");
		it5_.setINDICAT48("0");
		it5_.setPRCIVA("16");
		it5_.setTIPO("V");

		TX_ITEMENTRY it6_ = new TX_ITEMENTRY_Imp();
		it6_.setOFFSETY("2562");
		it6_.setOFFSETX("15");
		it6_.setSTORE("68");
		it6_.setTERMINAL("0012");
		it6_.setTRANSNUM("0161");
		it6_.setDAY("060116"); // no hay date sino day
		it6_.setTIME("1550");
		it6_.setITEMCODE("047355");
		it6_.setXPRICE("021900");
		it6_.setDEPARTME("55");
		it6_.setFAMILYNU1("000");
		it6_.setFAMILYNU2("000");
		it6_.setINDICAT11("0");
		it6_.setINDICAT12("0");
		it6_.setINDICAT13("0");
		it6_.setINDICAT14("0");
		it6_.setINDICAT15("0");
		it6_.setINDICAT16("0");
		it6_.setINDICAT17("0");
		it6_.setINDICAT18("0");
		it6_.setINDICAT19("1");
		it6_.setINDICAT110("0");
		it6_.setINDICAT111("0");
		it6_.setINDICAT112("0");
		it6_.setINDICAT113("0");
		it6_.setINDICAT114("0");
		it6_.setINDICAT115("0");
		it6_.setINDICAT116("0");
		it6_.setINDICAT21("0");
		it6_.setINDICAT22("0");
		it6_.setINDICAT23("0");
		it6_.setINDICAT24("0");
		it6_.setINDICAT25("0");
		it6_.setINDICAT26("0");
		it6_.setINDICAT27("0");
		it6_.setINDICAT28("0");
		it6_.setINDICAT29("0");
		it6_.setINDICAT210("0");
		it6_.setINDICAT211("0");
		it6_.setINDICAT212("0");
		it6_.setINDICAT213("0");
		it6_.setINDICAT214("0");
		it6_.setINDICAT215("0");
		it6_.setINDICAT216("0");
		it6_.setINDICAT31("0");
		it6_.setINDICAT32("0");
		it6_.setMPGROUP("00");
		it6_.setDEALQUAN("00");
		it6_.setPRICEMTH("00");
		it6_.setSALEQUAN("00");
		it6_.setSALEPRICE("00");
		it6_.setQTYORWGT("00");
		it6_.setINDICAT41("0");
		it6_.setINDICAT42("0");
		it6_.setINDICAT43("0");
		it6_.setINDICAT44("0");
		it6_.setINDICAT45("0");
		it6_.setINDICAT46("0");
		it6_.setINDICAT47("0");
		it6_.setINDICAT48("0");
		it6_.setPRCIVA("16");
		it6_.setTIPO("V");

		TX_TAX tx3_ = new TX_TAX_Imp();
		tx3_.setOFFSETY("2562");
		tx3_.setOFFSETX("18");
		tx3_.setSTORE("68");
		tx3_.setTERMINAL("0012");
		tx3_.setTRANSNUM("0161");
		tx3_.setDAY("060116"); // no aparece date sino day
		tx3_.setTIME("1550");
		tx3_.setTYPE("07");
		tx3_.setAMTTAXA("00");
		tx3_.setAMTTAXB("00");
		tx3_.setAMTTAXC("00");
		tx3_.setAMTTAXD("00");
		tx3_.setAMTTAXLEA("061200"); //setAMTTAXEA NO APARECE
		tx3_.setAMTTAXLEB("00"); //setAMTTAXEB NO APARECE
		tx3_.setAMTTAXLEC("00"); //setAMTTAXEC NO APARECE
		tx3_.setAMTTAXLED("00"); //setAMTTAXED NO APARECE
		tx3_.setTIPO("V");

		TX_TENDER td3_ = new TX_TENDER_Imp();
		td3_.setOFFSETY("2562");
		td3_.setOFFSETX("16");
		td3_.setSTORE("68");
		td3_.setTERMINAL("0012");
		td3_.setTRANSNUM("0161");
		td3_.setDAY("060116"); // no aparece date sino day
		td3_.setTIME("1550");
		td3_.setTYPE("05");
		td3_.setTENDTYPE("11");
		td3_.setAMTTENDE("062000");
		td3_.setAMTTNFEE("00");
		td3_.setCUSTOMER("00");
		td3_.setSTATUS("00");
		td3_.setTIPO("V");

		TX_TENDER td4_ = new TX_TENDER_Imp();
		td4_.setOFFSETY("2562");
		td4_.setOFFSETX("17");
		td4_.setSTORE("68");
		td4_.setTERMINAL("0012");
		td4_.setTRANSNUM("0161");
		td4_.setDAY("060116"); // no aparece date sino day
		td4_.setTIME("1550");
		td4_.setTYPE("09");
		td4_.setTENDTYPE("11");
		td4_.setAMTTENDE("0800");
		td4_.setAMTTNFEE("00");
		td4_.setCUSTOMER("00");
		td4_.setSTATUS("00");
		td4_.setTIPO("V");

		TX_EXCEPTION_LOG el1_ = new TX_EXCEPTION_LOG_Imp();
		el1_.setOFFSETY("2563");
		el1_.setOFFSETX("1");
		el1_.setSTORE("68");
		el1_.setTERMINAL("0012");
		el1_.setTRANSNUM("0161");
		el1_.setDAY("060116"); // no aparece date sino day
		el1_.setTIME("1550");
		el1_.setLOGDATA("002022");
		el1_.setTIPO("V");

		List lstHead4_ = new ArrayList();
		List lstIt1_ = new ArrayList();
		List lstTx3_ = new ArrayList();
		List lstTd3_ = new ArrayList();
		List lstEl1_ = new ArrayList();
		
		lstHead4_.add(header4_);
		lstIt1_.add(it1_);
		lstIt1_.add(it2_);
		lstIt1_.add(it3_);
		lstIt1_.add(it4_);
		lstIt1_.add(it7_);
		lstIt1_.add(it5_);
		lstIt1_.add(it6_);
		lstTx3_.add(tx3_);
		lstTd3_.add(td3_);
		lstTd3_.add(td4_);
		lstEl1_.add(el1_);
		
		vo4_.setHeader(lstHead4_);
		vo4_.setExceptionLog(lstEl1_);
		vo4_.setTax(lstTx3_);
		vo4_.setItemEntry(lstIt1_);
		vo4_.setTender(lstTd3_);

		//trans.0328 : 1845
		TX_DISCOUNT ds_ = new TX_DISCOUNT_Imp();
		ds_.setOFFSETY("3994");
		ds_.setOFFSETX("12");
		ds_.setSTORE("68");
		ds_.setTERMINAL("0020");
		ds_.setTRANSNUM("0328");
		ds_.setDAY("060116"); // no hay date si no day
		ds_.setTIME("1845");
		ds_.setTYPE("03");
		ds_.setDISGROUP("02");
		ds_.setDISRATE("0600");
		ds_.setAMTDISCO("0912");
		ds_.setTAXEXEMP("00");
		ds_.setTIPO("V");

		TX_DISCOUNT ds1_ = new TX_DISCOUNT_Imp();
		ds1_.setOFFSETY("3994");
		ds1_.setOFFSETX("13");
		ds1_.setSTORE("68");
		ds1_.setTERMINAL("0020");
		ds1_.setTRANSNUM("0328");
		ds1_.setDAY("060116"); // no hay date si no day
		ds1_.setTIME("1845");
		ds1_.setTYPE("03");
		ds1_.setDISGROUP("04");
		ds1_.setDISRATE("00");
		ds1_.setAMTDISCO("08");
		ds1_.setTAXEXEMP("00");
		ds1_.setTIPO("V");

		List lstDs_ = new ArrayList();
		lstDs_.add(ds_);
		lstDs_.add(ds1_);
		
		vo5_.setDiscount(lstDs_);

		//trans.0236:2112 
		TX_TAX tx2_ = new TX_TAX_Imp();
		tx2_.setOFFSETY("5011");
		tx2_.setOFFSETX("53");
		tx2_.setSTORE("68");
		tx2_.setTERMINAL("0006");
		tx2_.setTRANSNUM("0236");
		tx2_.setDAY("060116"); // no aparece date sino day
		tx2_.setTIME("2112");
		tx2_.setTYPE("07");
		tx2_.setAMTTAXA("00");
		tx2_.setAMTTAXB("00");
		tx2_.setAMTTAXC("00");
		tx2_.setAMTTAXD("00");
		tx2_.setAMTTAXLEA("208250"); //setAMTTAXEA NO APARECE
		tx2_.setAMTTAXLEB("00"); //setAMTTAXEB NO APARECE
		tx2_.setAMTTAXLEC("00"); //setAMTTAXEC NO APARECE
		tx2_.setAMTTAXLED("00"); //setAMTTAXED NO APARECE
		tx2_.setTIPO("V");
		List lstTx2_ = new ArrayList();
		lstTx2_.add(tx2_);
		vo10_.setTax(lstTx2_);

		//trans. 0018 :1038
		TX_MANAGER_OVERRIDE mo_ = new TX_MANAGER_OVERRIDE_Imp();
		mo_.setOFFSETY("488");
		mo_.setOFFSETX("22");
		mo_.setSTORE("68");
		mo_.setTERMINAL("0008");
		mo_.setTRANSNUM("0018");
		mo_.setDAY("060116"); // no aparece date sino day
		mo_.setTIME("1038");
		mo_.setOVERRIDE("2321");
		mo_.setREASON("01");
		mo_.setTIPO("V");

		TX_MANAGER_OVERRIDE mo1_ = new TX_MANAGER_OVERRIDE_Imp();
		mo1_.setOFFSETY("488");
		mo1_.setOFFSETX("29");
		mo1_.setSTORE("68");
		mo1_.setTERMINAL("0008");
		mo1_.setTRANSNUM("0018");
		mo1_.setDAY("060116"); // no aparece date sino day
		mo1_.setTIME("1038");
		mo1_.setOVERRIDE("00");
		mo1_.setREASON("01");
		mo1_.setTIPO("V");

		TX_MANAGER_OVERRIDE mo2_ = new TX_MANAGER_OVERRIDE_Imp();
		mo2_.setOFFSETY("488");
		mo2_.setOFFSETX("37");
		mo2_.setSTORE("68");
		mo2_.setTERMINAL("0008");
		mo2_.setTRANSNUM("0018");
		mo2_.setDAY("060116"); // no aparece date sino day
		mo2_.setTIME("1038");
		mo2_.setOVERRIDE("00");
		mo2_.setREASON("01");
		mo2_.setTIPO("V");

		TX_MANAGER_OVERRIDE mo3_ = new TX_MANAGER_OVERRIDE_Imp();
		mo3_.setOFFSETY("488");
		mo3_.setOFFSETX("39");
		mo3_.setSTORE("68");
		mo3_.setTERMINAL("0008");
		mo3_.setTRANSNUM("0018");
		mo3_.setDAY("060116"); // no aparece date sino day
		mo3_.setTIME("1038");
		mo3_.setOVERRIDE("2321");
		mo3_.setREASON("2228");
		mo3_.setTIPO("V");

		List lstMo_ = new ArrayList();
		lstMo_.add(mo_);
		lstMo_.add(mo1_);
		lstMo_.add(mo2_);
		lstMo_.add(mo3_);
		
		vo7_.setManagerOverride(lstMo_);

		//trans. 0004 :0915
		TX_DATA_ENTRY de_ = new TX_DATA_ENTRY_Imp();
		de_.setOFFSETY("195");
		de_.setOFFSETX("2");
		de_.setSTORE("68");
		de_.setTERMINAL("0010");
		de_.setTRANSNUM("0004");
		de_.setDAY("060116"); // no aparece date sino day
		de_.setTIME("0915");
		de_.setDATA1("5100006800120783");
		de_.setDATA2("01");
		de_.setDATA3("060116");
		de_.setDATA4("060116");
		de_.setDATA5("79671869");
		de_.setDATA6("9000509439");
		de_.setTIPO("V");

		TX_DATA_ENTRY de1_ = new TX_DATA_ENTRY_Imp();
		de1_.setOFFSETY("195");
		de1_.setOFFSETX("4");
		de1_.setSTORE("68");
		de1_.setTERMINAL("0010");
		de1_.setTRANSNUM("0004");
		de1_.setDAY("060116"); // no aparece date sino day
		de1_.setTIME("0915");
		de1_.setDATA1("5101016800120783");
		de1_.setDATA2("092882");
		de1_.setDATA3("04");
		de1_.setDATA4("339600");
		de1_.setDATA5("00");
		de1_.setDATA6("00");
		de1_.setTIPO("V");

		TX_DATA_ENTRY de2_ = new TX_DATA_ENTRY_Imp();
		de2_.setOFFSETY("195");
		de2_.setOFFSETX("7");
		de2_.setSTORE("68");
		de2_.setTERMINAL("0010");
		de2_.setTRANSNUM("0004");
		de2_.setDAY("060116"); // no aparece date sino day
		de2_.setTIME("0915");
		de2_.setDATA1("5199006800120783");
		de2_.setDATA2("060116");
		de2_.setDATA3("0068");
		de2_.setDATA4("0010");
		de2_.setDATA5("0004");
		de2_.setDATA6("00");
		de2_.setTIPO("V");
		
		List lstDe1_ = new ArrayList();
		lstDe1_.add(de_);
		lstDe1_.add(de1_);
		lstDe1_.add(de2_);
		
		vo9_.setDataEntry(lstDe1_);
	
		//trans. 0043 : 1139
		TX_TILL_CHANGE tc_ = new TX_TILL_CHANGE_Imp();
		tc_.setOFFSETY("796"); //falta OFFSETY y OFFSEYX
		tc_.setOFFSETX("2");
		tc_.setSTORE("68");
		tc_.setTERMINAL("0008");
		tc_.setTRANSNUM("0043");
		tc_.setDAY("060116"); // no aparece date sino day
		tc_.setTIME("1139");
		tc_.setNUMBERLOANS("00"); // no aparece numericLOANS
		tc_.setAMTLOANS("00");
		tc_.setNUMBERPKUPS("01"); // no aparece numericPKUPS
		tc_.setAMTPKUPS("09760000");
		tc_.setTENDTYP11("21");
		tc_.setAMTTEND11("00");
		tc_.setTENDTYP12("31");
		tc_.setAMTTEND12("00");
		tc_.setTENDTYP13("41");
		tc_.setAMTTEND13("00");
		tc_.setTENDTYP14("51");
		tc_.setAMTTEND14("00");
		tc_.setTENDTYP15("61");
		tc_.setAMTTEND15("00");
		tc_.setTENDTYP16("71");
		tc_.setAMTTEND16("00");
		tc_.setTENDTYP17("81");
		tc_.setAMTTEND17("00");
		tc_.setTENDTYP18("99");
		tc_.setAMTTEND18("11");
		tc_.setTENDTYP21("09760000");
		tc_.setAMTTEND21(null);
		tc_.setTENDTYP22(null);
		tc_.setAMTTEND22(null);
		tc_.setTENDTYP23(null);
		tc_.setAMTTEND23(null);
		tc_.setTENDTYP24(null);
		tc_.setAMTTEND24(null);
		tc_.setTENDTYP25(null);
		tc_.setAMTTEND25(null);
		tc_.setTENDTYP26(null);
		tc_.setAMTTEND26(null);
		tc_.setTENDTYP27(null);
		tc_.setAMTTEND27(null);
		tc_.setTENDTYP28(null);
		tc_.setAMTTEND28(null);
		tc_.setTIPO("V");

		TX_TILL_CHANGE tc1_ = new TX_TILL_CHANGE_Imp();
		tc1_.setOFFSETY("796"); //falta OFFSETY y OFFSEYX
		tc1_.setOFFSETX("3");
		tc1_.setSTORE("68");
		tc1_.setTERMINAL("0008");
		tc1_.setTRANSNUM("0043");
		tc1_.setDAY("060116"); // no aparece date sino day
		tc1_.setTIME("1139");
		tc1_.setNUMBERLOANS("00"); // no aparece numericLOANS
		tc1_.setAMTLOANS("00");
		tc1_.setNUMBERPKUPS("01"); // no aparece numericPKUPS
		tc1_.setAMTPKUPS("09760000");
		tc1_.setTENDTYP11("12");
		tc1_.setAMTTEND11("00");
		tc1_.setTENDTYP12("22");
		tc1_.setAMTTEND12("00");
		tc1_.setTENDTYP13("32");
		tc1_.setAMTTEND13("00");
		tc1_.setTENDTYP14("42");
		tc1_.setAMTTEND14("00");
		tc1_.setTENDTYP15("52");
		tc1_.setAMTTEND15("00");
		tc1_.setTENDTYP16("62");
		tc1_.setAMTTEND16("00");
		tc1_.setTENDTYP17("72");
		tc1_.setAMTTEND17("00");
		tc1_.setTENDTYP18("82");
		tc1_.setAMTTEND18("00");
		tc1_.setTENDTYP21("99");
		tc1_.setAMTTEND21(null);
		tc1_.setTENDTYP22(null);
		tc1_.setAMTTEND22(null);
		tc1_.setTENDTYP23(null);
		tc1_.setAMTTEND23(null);
		tc1_.setTENDTYP24(null);
		tc1_.setAMTTEND24(null);
		tc1_.setTENDTYP25(null);
		tc1_.setAMTTEND25(null);
		tc1_.setTENDTYP26(null);
		tc1_.setAMTTEND26(null);
		tc1_.setTENDTYP27(null);
		tc1_.setAMTTEND27(null);
		tc1_.setTENDTYP28(null);
		tc1_.setAMTTEND28(null);
		tc1_.setTIPO("V");

		TX_TILL_CHANGE tc2_ = new TX_TILL_CHANGE_Imp();
		tc2_.setOFFSETY("796"); //falta OFFSETY y OFFSEYX
		tc2_.setOFFSETX("4");
		tc2_.setSTORE("68");
		tc2_.setTERMINAL("0008");
		tc2_.setTRANSNUM("0043");
		tc2_.setDAY("060116"); // no aparece date sino day
		tc2_.setTIME("1139");
		tc2_.setNUMBERLOANS("00"); // no aparece numericLOANS
		tc2_.setAMTLOANS("00");
		tc2_.setNUMBERPKUPS("01"); // no aparece numericPKUPS
		tc2_.setAMTPKUPS("09760000");
		tc2_.setTENDTYP11("13");
		tc2_.setAMTTEND11("00");
		tc2_.setTENDTYP12("23");
		tc2_.setAMTTEND12("00");
		tc2_.setTENDTYP13("33");
		tc2_.setAMTTEND13("00");
		tc2_.setTENDTYP14("43");
		tc2_.setAMTTEND14("00");
		tc2_.setTENDTYP15("53");
		tc2_.setAMTTEND15("00");
		tc2_.setTENDTYP16("63");
		tc2_.setAMTTEND16("00");
		tc2_.setTENDTYP17("73");
		tc2_.setAMTTEND17("00");
		tc2_.setTENDTYP18("83");
		tc2_.setAMTTEND18("00");
		tc2_.setTENDTYP21("99");
		tc2_.setAMTTEND21(null);
		tc2_.setTENDTYP22(null);
		tc2_.setAMTTEND22(null);
		tc2_.setTENDTYP23(null);
		tc2_.setAMTTEND23(null);
		tc2_.setTENDTYP24(null);
		tc2_.setAMTTEND24(null);
		tc2_.setTENDTYP25(null);
		tc2_.setAMTTEND25(null);
		tc2_.setTENDTYP26(null);
		tc2_.setAMTTEND26(null);
		tc2_.setTENDTYP27(null);
		tc2_.setAMTTEND27(null);
		tc2_.setTENDTYP28(null);
		tc2_.setAMTTEND28(null);
		tc2_.setTIPO("V");

		TX_TILL_CHANGE tc3_ = new TX_TILL_CHANGE_Imp();
		tc3_.setOFFSETY("796"); //falta OFFSETY y OFFSEYX
		tc3_.setOFFSETX("5");
		tc3_.setSTORE("68");
		tc3_.setTERMINAL("0008");
		tc3_.setTRANSNUM("0043");
		tc3_.setDAY("060116"); // no aparece date sino day
		tc3_.setTIME("1139");
		tc3_.setNUMBERLOANS("00"); // no aparece numericLOANS
		tc3_.setAMTLOANS("00");
		tc3_.setNUMBERPKUPS("01"); // no aparece numericPKUPS
		tc3_.setAMTPKUPS("09760000");
		tc3_.setTENDTYP11("14");
		tc3_.setAMTTEND11("00");
		tc3_.setTENDTYP12("24");
		tc3_.setAMTTEND12("00");
		tc3_.setTENDTYP13("34");
		tc3_.setAMTTEND13("00");
		tc3_.setTENDTYP14("44");
		tc3_.setAMTTEND14("00");
		tc3_.setTENDTYP15("54");
		tc3_.setAMTTEND15("00");
		tc3_.setTENDTYP16("64");
		tc3_.setAMTTEND16("00");
		tc3_.setTENDTYP17("74");
		tc3_.setAMTTEND17("00");
		tc3_.setTENDTYP18("84");
		tc3_.setAMTTEND18("00");
		tc3_.setTENDTYP21("99");
		tc3_.setAMTTEND21(null);
		tc3_.setTENDTYP22(null);
		tc3_.setAMTTEND22(null);
		tc3_.setTENDTYP23(null);
		tc3_.setAMTTEND23(null);
		tc3_.setTENDTYP24(null);
		tc3_.setAMTTEND24(null);
		tc3_.setTENDTYP25(null);
		tc3_.setAMTTEND25(null);
		tc3_.setTENDTYP26(null);
		tc3_.setAMTTEND26(null);
		tc3_.setTENDTYP27(null);
		tc3_.setAMTTEND27(null);
		tc3_.setTENDTYP28(null);
		tc3_.setAMTTEND28(null);
		tc3_.setTIPO("V");

		TX_TILL_CHANGE tc4_ = new TX_TILL_CHANGE_Imp();
		tc4_.setOFFSETY("796"); //falta OFFSETY y OFFSEYX
		tc4_.setOFFSETX("6");
		tc4_.setSTORE("68");
		tc4_.setTERMINAL("0008");
		tc4_.setTRANSNUM("0043");
		tc4_.setDAY("060116"); // no aparece date sino day
		tc4_.setTIME("1139");
		tc4_.setNUMBERLOANS("00"); // no aparece numericLOANS
		tc4_.setAMTLOANS("00");
		tc4_.setNUMBERPKUPS("01"); // no aparece numericPKUPS
		tc4_.setAMTPKUPS("09760000");
		tc4_.setTENDTYP11("15");
		tc4_.setAMTTEND11("00");
		tc4_.setTENDTYP12("25");
		tc4_.setAMTTEND12("00");
		tc4_.setTENDTYP13("35");
		tc4_.setAMTTEND13("00");
		tc4_.setTENDTYP14("45");
		tc4_.setAMTTEND14("00");
		tc4_.setTENDTYP15("55");
		tc4_.setAMTTEND15("00");
		tc4_.setTENDTYP16("65");
		tc4_.setAMTTEND16("00");
		tc4_.setTENDTYP17("75");
		tc4_.setAMTTEND17("00");
		tc4_.setTENDTYP18("85");
		tc4_.setAMTTEND18("00");
		tc4_.setTENDTYP21("99");
		tc4_.setAMTTEND21(null);
		tc4_.setTENDTYP22(null);
		tc4_.setAMTTEND22(null);
		tc4_.setTENDTYP23(null);
		tc4_.setAMTTEND23(null);
		tc4_.setTENDTYP24(null);
		tc4_.setAMTTEND24(null);
		tc4_.setTENDTYP25(null);
		tc4_.setAMTTEND25(null);
		tc4_.setTENDTYP26(null);
		tc4_.setAMTTEND26(null);
		tc4_.setTENDTYP27(null);
		tc4_.setAMTTEND27(null);
		tc4_.setTENDTYP28(null);
		tc4_.setAMTTEND28(null);
		tc4_.setTIPO("V");

		TX_TILL_CHANGE tc5_ = new TX_TILL_CHANGE_Imp();
		tc5_.setOFFSETY("796"); //falta OFFSETY y OFFSEYX
		tc5_.setOFFSETX("7");
		tc5_.setSTORE("68");
		tc5_.setTERMINAL("0008");
		tc5_.setTRANSNUM("0043");
		tc5_.setDAY("060116"); // no aparece date sino day
		tc5_.setTIME("1139");
		tc5_.setNUMBERLOANS("00"); // no aparece numericLOANS
		tc5_.setAMTLOANS("00");
		tc5_.setNUMBERPKUPS("01"); // no aparece numericPKUPS
		tc5_.setAMTPKUPS("09760000");
		tc5_.setTENDTYP11("16");
		tc5_.setAMTTEND11("00");
		tc5_.setTENDTYP12("26");
		tc5_.setAMTTEND12("00");
		tc5_.setTENDTYP13("36");
		tc5_.setAMTTEND13("00");
		tc5_.setTENDTYP14("46");
		tc5_.setAMTTEND14("00");
		tc5_.setTENDTYP15("56");
		tc5_.setAMTTEND15("00");
		tc5_.setTENDTYP16("66");
		tc5_.setAMTTEND16("00");
		tc5_.setTENDTYP17("76");
		tc5_.setAMTTEND17("00");
		tc5_.setTENDTYP18("86");
		tc5_.setAMTTEND18("00");
		tc5_.setTENDTYP21("99");
		tc5_.setAMTTEND21(null);
		tc5_.setTENDTYP22(null);
		tc5_.setAMTTEND22(null);
		tc5_.setTENDTYP23(null);
		tc5_.setAMTTEND23(null);
		tc5_.setTENDTYP24(null);
		tc5_.setAMTTEND24(null);
		tc5_.setTENDTYP25(null);
		tc5_.setAMTTEND25(null);
		tc5_.setTENDTYP26(null);
		tc5_.setAMTTEND26(null);
		tc5_.setTENDTYP27(null);
		tc5_.setAMTTEND27(null);
		tc5_.setTENDTYP28(null);
		tc5_.setAMTTEND28(null);
		tc5_.setTIPO("V");
		
		List lstTc_ = new ArrayList();
		lstTc_.add(tc1_);
		lstTc_.add(tc2_);
		lstTc_.add(tc3_);
		lstTc_.add(tc4_);
		lstTc_.add(tc5_);

		vo8_.setTillChange(lstTc_);
		
		//Trans 0004:1132
		TX_ITEM_RECORD_CHANGE irc_ = new TX_ITEM_RECORD_CHANGE_Imp();
		irc_.setOFFSETY("10");
		irc_.setOFFSETX("10");
		irc_.setSTORE("68");
		irc_.setTERMINAL("0003");
		irc_.setTRANSNUM("0004");
		irc_.setDAY("060116");
		irc_.setTIME("1132");
		irc_.setOLDDATA("10000");
		irc_.setNEWDATA("15000");
		irc_.setTIPO("V");
		
		List lstIrc_ = new ArrayList();
		lstIrc_.add(irc_);
		
		vo11_.setItemRecordChange(lstIrc_);
		
		//trans 0008: 1145
		TX_OPERATOR_TRAINING ot_ = new TX_OPERATOR_TRAINING_Imp();
		ot_.setOFFSETY("11");
		ot_.setOFFSETX("11");
		ot_.setSTORE("68");
		ot_.setTERMINAL("0033");
		ot_.setTRANSNUM("0008");
		ot_.setDAY("060116");
		ot_.setTIME("1145");
		ot_.setDATA1("100");
		ot_.setTIPO("V");
		
		List lstOt_ = new ArrayList();
		lstOt_.add(ot_);
		
		vo12_.setItemRecordChange(lstOt_);
			
		//trans 0003:0100
		TX_PRICE_CHANGE pc_ = new TX_PRICE_CHANGE_Imp();
		pc_.setOFFSETY("22");
		pc_.setOFFSETX("22");
		pc_.setSTORE("68");
		pc_.setTERMINAL("0014");
		pc_.setTRANSNUM("0003");
		pc_.setDAY("060116");
		pc_.setTIME("0100");
		pc_.setITEMCODE("54");
		pc_.setNEWDEALQ("11");
		pc_.setNEWPRICE("150000");
		pc_.setOLDDEALQ("21");
		pc_.setOLDPRICE("155000");
		pc_.setTIPO("V");
		
		List lstPc_ = new ArrayList();
		lstPc_.add(pc_);
		
		vo13_.setItemRecordChange(lstPc_);
		
		//trans 0006:1850
		TX_TRADING_STAMPS ts_ = new TX_TRADING_STAMPS_Imp();
		ts_.setOFFSETY("32");
		ts_.setOFFSETX("32");
		ts_.setSTORE("68");
		ts_.setTERMINAL("0236");
		ts_.setTRANSNUM("0006");
		ts_.setDAY("060116");
		ts_.setTIME("1850");
		ts_.setSTAMPS("159000");
		ts_.setTIPO("V");
		
		List lstTs_ = new ArrayList();
		lstTs_.add(ts_);
		
		vo14_.setItemRecordChange(lstTs_);
	
		try {
			adap_.insertTransaccion(vo_);
			adap_.insertTransaccion(vo1_);
			adap_.insertTransaccion(vo2_);
			adap_.insertTransaccion(vo3_);
			adap_.insertTransaccion(vo4_);
			adap_.insertTransaccion(vo5_);
			adap_.insertTransaccion(vo6_);
			adap_.insertTransaccion(vo7_);
			adap_.insertTransaccion(vo8_);
			adap_.insertTransaccion(vo9_);
			adap_.insertTransaccion(vo10_);
			adap_.insertTransaccion(vo11_);
			adap_.insertTransaccion(vo12_);
			adap_.insertTransaccion(vo13_);
			adap_.insertTransaccion(vo14_);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
