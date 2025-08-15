/*
 * Created on Dec 13, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.facade;

import java.math.BigDecimal;
import java.math.BigInteger;
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
public class ProcesarTransaccionFacadeAdapterTest1 extends TestCase {

	ProcesarTransaccionFacadeAdapter adap_ = new ProcesarTransaccionFacadeAdapter();
	/**
	 * Constructor for ProcesarTransaccionFacadeAdapterTest.
	 * @param arg0
	 */
	public ProcesarTransaccionFacadeAdapterTest1(String arg0) {
		super(arg0);
	}
	
		public void testProcesarTransaccion() {
	
			try {
				adap_.procesarTransaccion();
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
/*
	public void testInsertTransaccion() {
		try {
			for (int i = 0; i < 10; i++) {
				TRANSACCION vo_ = new TRANSACCION_Imp();
				BigDecimal b = new BigDecimal("123456789012345678901234");
				//Long l = new Long("123456789012345678901234");

				TX_HEADER header_ = new TX_HEADER_Imp();
				header_.setDAY("1001057z");
				header_.setGROSSNEG("12345678");
				header_.setGROSSPOS("12345678");
				header_.setINACTIVE("12345678");
				header_.setNUMSTRIN("1234");
				header_.setOFFSETX("1");
				header_.setOFFSETY("1234");
				header_.setOPERATOR("1234567890");
				header_.setPASSWORD("12345678");
				header_.setRINGTIME("12345678");
				header_.setSPECIAL("12345678");
				header_.setSTORE("1234");
				header_.setTENDERTI("12345678");
				header_.setTERMINAL("0001");
				header_.setTIME("12345p");
				header_.setTIPO("V");
				header_.setTRANSNUM("1234");
				header_.setTRANSTYPE("1");
				header_.setINDICAT11("0");
				header_.setINDICAT110("1");
				header_.setINDICAT111("0");
				header_.setINDICAT112("1");
				header_.setINDICAT113("0");
				header_.setINDICAT114("1");
				header_.setINDICAT115("1");
				header_.setINDICAT116("1");
				header_.setINDICAT117("0");
				header_.setINDICAT118("0");
				header_.setINDICAT119("0");
				header_.setINDICAT12("0");
				header_.setINDICAT120("0");
				header_.setINDICAT121("1");
				header_.setINDICAT122("1");
				header_.setINDICAT123("1");
				header_.setINDICAT124("1");
				header_.setINDICAT125("0");
				header_.setINDICAT126("0");
				header_.setINDICAT127("1");
				header_.setINDICAT128("4");
				header_.setINDICAT129("5");
				header_.setINDICAT13("7");
				header_.setINDICAT130("8");
				header_.setINDICAT131("9");
				header_.setINDICAT132("4");
				header_.setINDICAT14("1");
				header_.setINDICAT15("6");
				header_.setINDICAT16("3");
				header_.setINDICAT17("2");
				header_.setINDICAT18("1");
				header_.setINDICAT19("5");

				TX_ITEMENTRY it_ = new TX_ITEMENTRY_Imp();
				it_.setOFFSETY("1234");
				it_.setOFFSETX("2");
				it_.setSTORE("1234");
				it_.setTERMINAL("1234");
				it_.setTRANSNUM("1234");
				it_.setDAY("060203"); // no hay date sino day
				it_.setTIME("12345");
				it_.setITEMCODE("123456789012");
				it_.setXPRICE("12345678");
				it_.setDEPARTME("1234");
				it_.setFAMILYNU1("123");
				it_.setFAMILYNU2("123");
				it_.setINDICAT11("a");
				it_.setINDICAT12("b");
				it_.setINDICAT13("c");
				it_.setINDICAT14("d");
				it_.setINDICAT15("e");
				it_.setINDICAT16("f");
				it_.setINDICAT17("g");
				it_.setINDICAT18("h");
				it_.setINDICAT19("i");
				it_.setINDICAT110("j");
				it_.setINDICAT111("k");
				it_.setINDICAT112("l");
				it_.setINDICAT113("m");
				it_.setINDICAT114("n");
				it_.setINDICAT115("o");
				it_.setINDICAT116("p");
				it_.setINDICAT21("q");
				it_.setINDICAT22("r");
				it_.setINDICAT23("s");
				it_.setINDICAT24("t");
				it_.setINDICAT25("u");
				it_.setINDICAT26("v");
				it_.setINDICAT27("w");
				it_.setINDICAT28("x");
				it_.setINDICAT29("y");
				it_.setINDICAT210("z");
				it_.setINDICAT211("a");
				it_.setINDICAT212("b");
				it_.setINDICAT213("c");
				it_.setINDICAT214("d");
				it_.setINDICAT215("e");
				it_.setINDICAT216("f");
				it_.setINDICAT31("g");
				it_.setINDICAT32("h");
				it_.setMPGROUP("12");
				it_.setDEALQUAN("12345678");
				it_.setPRICEMTH("12");
				it_.setSALEQUAN("12");
				it_.setSALEPRICE("1234567890");
				it_.setQTYORWGT("12345678901");
				it_.setINDICAT41("a");
				it_.setINDICAT42("b");
				it_.setINDICAT43("c");
				it_.setINDICAT44("d");
				it_.setINDICAT45("e");
				it_.setINDICAT46("f");
				it_.setINDICAT47("g");
				it_.setINDICAT48("h");
				it_.setPRCIVA("16");

				TX_DISCOUNT ds_ = new TX_DISCOUNT_Imp();
				ds_.setOFFSETY("1234");
				ds_.setOFFSETX("1234");
				ds_.setSTORE("1234");
				ds_.setTERMINAL("1234");
				ds_.setTRANSNUM("1234");
				ds_.setTYPE("1234");
				ds_.setTIPO("a");
				ds_.setDAY("060203"); // no hay date si no day
				ds_.setTIME("123");
				ds_.setDISGROUP("1234");
				ds_.setDISRATE("1234");
				ds_.setAMTDISCO("12345678");
				ds_.setTAXEXEMP("12345678");

				TX_TENDER td_ = new TX_TENDER_Imp();
				td_.setOFFSETY("1234");
				td_.setOFFSETX("1234");
				td_.setSTORE("1234");
				td_.setTERMINAL("1234");
				td_.setTRANSNUM("1234");
				td_.setDAY("060203"); // no aparece date sino day
				td_.setTIME("123");
				td_.setTYPE("12");
				td_.setTENDTYPE("1234");
				td_.setAMTTENDE("12345678");
				td_.setAMTTNFEE("12");
				td_.setCUSTOMER("123456789012345678901234"); //123456789012345678901234 //9223372036854775807
				td_.setSTATUS("12");

				TX_TAX tx_ = new TX_TAX_Imp();
				tx_.setOFFSETY("1234");
				tx_.setOFFSETX("1234");
				tx_.setSTORE("1234");
				tx_.setTERMINAL("1234");
				tx_.setTRANSNUM("1234");
				tx_.setTYPE("12");
				tx_.setTIPO("a");
				tx_.setDAY("020207"); // no aparece date sino day
				tx_.setTIME("12345");
				tx_.setAMTTAXA("12345678");
				tx_.setAMTTAXB("12345678");
				tx_.setAMTTAXC("12345678");
				tx_.setAMTTAXD("12345678");
				tx_.setAMTTAXLEA("12345678"); //setAMTTAXEA NO APARECE
				tx_.setAMTTAXLEB("12345678"); //setAMTTAXEB NO APARECE
				tx_.setAMTTAXLEC("12345678"); //setAMTTAXEC NO APARECE
				tx_.setAMTTAXLED("12345678"); //setAMTTAXED NO APARECE

				TX_MANAGER_OVERRIDE mo_ = new TX_MANAGER_OVERRIDE_Imp();
				mo_.setOFFSETY("1234");
				mo_.setOFFSETX("1234");
				mo_.setSTORE("1234");
				mo_.setTERMINAL("1234");
				mo_.setTRANSNUM("1234");
				mo_.setDAY("060203"); // no aparece date sino day
				mo_.setTIME("12345");
				mo_.setOVERRIDE("12345678901234");
				mo_.setREASON("qwertyuioplkjhgfdsazxcvbnmqwer");

				TX_DATA_ENTRY de_ = new TX_DATA_ENTRY_Imp();
				de_.setOFFSETY("1234");
				de_.setOFFSETX("1234");
				de_.setSTORE("1234");
				de_.setTERMINAL("1234");
				de_.setTRANSNUM("1234");
				de_.setDAY("060203"); // no aparece date sino day
				de_.setTIME("12345");
				de_.setTIPO("1");
				de_.setDATA1("qwertyuiopasdfghjklñzxcvbnmqwertyuiopasd");
				de_.setDATA2("qwertyuiopasdfghjklñzxcvbnmqwertyuiopasd");
				de_.setDATA3("qwertyuiopasdfghjklñzxcvbnmqwertyuiopasd");
				de_.setDATA4("qwertyuiopasdfghjklñzxcvbnmqwertyuiopasd");
				de_.setDATA5("qwertyuiopasdfghjklñzxcvbnmqwertyuiopasd");
				de_.setDATA6("qwertyuiopasdfghjklñzxcvbnmqwertyuiopasd");

				TX_PRICE_CHANGE pc_ = new TX_PRICE_CHANGE_Imp();
				pc_.setOFFSETX("1112"); //falta OFFSETY y OFFSEYX
				pc_.setOFFSETY("1234"); //falta OFFSETY y OFFSEYX
				pc_.setSTORE("1234");
				pc_.setTERMINAL("1234");
				pc_.setTRANSNUM("1234");
				pc_.setDAY("060203"); // no aparece date sino day
				pc_.setTIME("12345");
				pc_.setITEMCODE("123");
				pc_.setNEWDEALQ("12");
				pc_.setNEWPRICE("1234567990");
				pc_.setOLDDEALQ("12");
				pc_.setOLDPRICE("1234567890");

				TX_TILL_CHANGE tc_ = new TX_TILL_CHANGE_Imp();
				tc_.setOFFSETY("1121"); //falta OFFSETY y OFFSEYX
				tc_.setOFFSETX("1");
				tc_.setSTORE("1237");
				tc_.setTERMINAL("1234");
				tc_.setTRANSNUM("1234");
				tc_.setDAY("060203"); // no aparece date sino day
				tc_.setTIME("1");
				tc_.setNUMBERLOANS("123"); // no aparece numericLOANS
				tc_.setAMTLOANS("12");
				tc_.setNUMBERPKUPS("12"); // no aparece numericPKUPS
				tc_.setAMTPKUPS("123");
				tc_.setTENDTYP11("12");
				tc_.setAMTTEND11("12345678");
				tc_.setTENDTYP12("12");
				tc_.setAMTTEND12("12345678");
				tc_.setTENDTYP13("12");
				tc_.setAMTTEND13("12345678");
				tc_.setTENDTYP14("12");
				tc_.setAMTTEND14("12345678");
				tc_.setTENDTYP15("12");
				tc_.setAMTTEND15("12345678");
				tc_.setTENDTYP16("12");
				tc_.setAMTTEND16("12345678");
				tc_.setTENDTYP17("12");
				tc_.setAMTTEND17("12345678");
				tc_.setTENDTYP18("12");
				tc_.setAMTTEND18("12345678");
				tc_.setTENDTYP21("12");
				tc_.setAMTTEND21("12345678");
				tc_.setTENDTYP22("12");
				tc_.setAMTTEND22("12345678");
				tc_.setTENDTYP23("12");
				tc_.setAMTTEND23("12345678");
				tc_.setTENDTYP24("12");
				tc_.setAMTTEND24("12345678");
				tc_.setTENDTYP25("12");
				tc_.setAMTTEND25("12345678");
				tc_.setTENDTYP26("12");
				tc_.setAMTTEND26("12345678");
				tc_.setTENDTYP27("12");
				tc_.setAMTTEND27("12345678");
				tc_.setTENDTYP28("12");
				tc_.setAMTTEND28("12345678");
				tc_.setTIPO("V");

				TX_ITEM_RECORD_CHANGE irc_ = new TX_ITEM_RECORD_CHANGE_Imp();
				irc_.setOFFSETX("1212");
				irc_.setOFFSETY("1234"); //falta OFFSETY y OFFSEYX
				irc_.setSTORE("1234");
				irc_.setTERMINAL("1234");
				irc_.setTRANSNUM("1234");
				irc_.setDAY("060203"); // no aparece date sino day
				irc_.setTIME("12345");
				irc_.setOLDDATA("qwertyuioplkjhgfdsazxcvbnmlkjhgfdsaqwertyuioplkjhgfdsazxcbv");
				irc_.setNEWDATA("qwertyuioplkjhgfdsazxcvbnmlkjhgfdsaqwertyuioplkjhgfdsazxcbv");

				TX_TRADING_STAMPS ts_ = new TX_TRADING_STAMPS_Imp();
				ts_.setOFFSETX("1111");
				ts_.setOFFSETY("1234"); //falta OFFSETY y OFFSEYX
				ts_.setSTORE("1234");
				ts_.setTERMINAL("1234");
				ts_.setTRANSNUM("1234");
				ts_.setDAY("060203"); // no aparece date sino day
				ts_.setTIME("12345");
				ts_.setSTAMPS("12345678");

				TX_EXCEPTION_LOG el_ = new TX_EXCEPTION_LOG_Imp();
				el_.setOFFSETY("1234");
				el_.setOFFSETX("1234");
				el_.setSTORE("1234");
				el_.setTERMINAL("1234");
				el_.setTRANSNUM("1234");
				el_.setDAY("060203"); // no aparece date sino day
				el_.setTIME("12345");
				el_.setLOGDATA("qwertyuioplkjhgfdsazxcvbnmqw");

				TX_STORE_CLOSING sc_ = new TX_STORE_CLOSING_Imp();
				sc_.setOFFSETY("1234");
				sc_.setOFFSETX("1234");
				sc_.setSTORE("1234");
				sc_.setTERMINAL("1234");
				sc_.setTRANSNUM("1234");
				sc_.setDAY("060203"); // no aparece date sino day
				sc_.setTIME("12345");
				sc_.setINDICAT2("ab");
				sc_.setFECHAHORA("abcdefghij");

				TX_OPERATOR_TRAINING ot_ = new TX_OPERATOR_TRAINING_Imp();
				ot_.setOFFSETX("1212");
				ot_.setOFFSETY("1234");
				ot_.setSTORE("1234");
				ot_.setTERMINAL("1234");
				ot_.setTRANSNUM("1234");
				ot_.setDAY("060203"); // no aparece date sino day
				ot_.setTIME("12345");
				ot_.setDATA1("1");

				TX_USER_DATA ud_ = new TX_USER_DATA_Imp();
				ud_.setOFFSETY("1234");
				ud_.setOFFSETX("1234");
				ud_.setSTORE("1234");
				ud_.setTERMINAL("1234");
				ud_.setTRANSNUM("1234");
				ud_.setDAY("060203"); // no aparece date sino day
				ud_.setTIME("12345");
				ud_.setTYPE("asdfghjk");
				ud_.setDATA1("qwertyuioplkjhgfdsamnbvcx");
				ud_.setDATA2("qwertyuioplkjhgfdsamnbvcx");
				ud_.setDATA3("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA4("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA5("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA6("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA7("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA8("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA9("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA10("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA11("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA12("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA13("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA14("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA15("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA16("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA17("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA18("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA19("qwertyuiopljkhgfdsamnbvcx");
				ud_.setDATA20("qwertyuiopljkhgfdsamnbvcx");

				TX_TENDER tdTEST_ = new TX_TENDER_Imp();
				tdTEST_.setOFFSETY("96");
				tdTEST_.setOFFSETX("9");
				tdTEST_.setSTORE("68");
				tdTEST_.setTERMINAL("0033");
				tdTEST_.setTRANSNUM("0008");
				tdTEST_.setDAY("060116"); // no aparece date sino day
				tdTEST_.setTIME("0838");
				tdTEST_.setTYPE("05");
				tdTEST_.setTENDTYPE("62");
				tdTEST_.setAMTTENDE("259900");
				tdTEST_.setAMTTNFEE("00");
				tdTEST_.setCUSTOMER("6271808001371405");
				tdTEST_.setSTATUS("50");
				tdTEST_.setTIPO("V");

				List lstHead_ = new ArrayList();
				List lstIt_ = new ArrayList();
				List lstDs_ = new ArrayList();
				List lstTd_ = new ArrayList();
				List lstTx_ = new ArrayList();
				List lstMo_ = new ArrayList();
				List lstDe_ = new ArrayList();
				List lstPc_ = new ArrayList();
				List lstTc_ = new ArrayList();
				List lstIrc_ = new ArrayList();
				List lstTs_ = new ArrayList();
				List lstEl_ = new ArrayList();
				List lstSc_ = new ArrayList();
				List lstOt_ = new ArrayList();
				List lstUd_ = new ArrayList();

				lstHead_.add(header_);
				lstIt_.add(it_);
				lstDs_.add(ds_);
				lstTd_.add(td_);
				lstTx_.add(tx_);
				lstMo_.add(mo_);
				lstDe_.add(de_);
				lstPc_.add(pc_);
				lstTc_.add(tc_);
				lstIrc_.add(irc_);
				lstTs_.add(ts_);
				lstEl_.add(el_);
				lstSc_.add(sc_);
				lstOt_.add(ot_);
				lstUd_.add(ud_);
				lstTd_.add(tdTEST_);

				vo_.setHeader(lstHead_);
				vo_.setItemEntry(lstIt_);
				vo_.setDiscount(lstDs_);
				vo_.setTender(lstTd_);
				vo_.setTax(lstTx_);
				vo_.setManagerOverride(lstMo_);
				vo_.setDataEntry(lstDe_);
				vo_.setPriceChange(lstPc_);
				vo_.setTillChange(lstTc_);
				vo_.setItemRecordChange(lstIrc_);
				vo_.setTradingStamps(lstTs_);
				vo_.setExceptionLog(lstEl_);
				vo_.setStoreClosig(lstSc_);
				vo_.setOperatorTraining(lstOt_);
				vo_.setUserData(lstUd_);

				adap_.insertTransaccion(vo_);
			}
			} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}*/

}
