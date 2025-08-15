/*
 * Created on Dec 13, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.util;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.bean.ValidadorStringsTransBean;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TRANSACCION_Imp;
import com.asic.transacciones.vo.TX_HEADER;
import com.asic.transacciones.vo.TX_HEADER_Imp;
import com.asic.transacciones.vo.TX_ITEMENTRY;
import com.asic.transacciones.vo.TX_ITEMENTRY_Imp;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ValidadorStringsTransTest extends TestCase {
	ValidadorStringsTransBean val = new ValidadorStringsTransBean();
	/**
	 * Constructor for ValidadorStringsTransTest.
	 * @param arg0
	 */
	public ValidadorStringsTransTest(String arg0) {
		super(arg0);
	}

	public void testValidarTrama() {
		
		TRANSACCION vo_ = new TRANSACCION_Imp();
		TX_HEADER header_ = new TX_HEADER_Imp();
		header_.setDAY("051002");
		header_.setGROSSNEG("2111");
		header_.setGROSSPOS("4222");
		header_.setINACTIVE("1");
		header_.setNUMSTRIN("1111");
		header_.setOFFSETX("10");
		header_.setOFFSETY("5");
		header_.setOPERATOR("1");
		header_.setPASSWORD("444444");
		header_.setRINGTIME("454545");
		header_.setSPECIAL("6767676");
		header_.setSTORE("1122");
		header_.setTENDERTI("12345678");
		header_.setTERMINAL("0001");
		header_.setTIME("12345");
		header_.setTIPO("V");
		header_.setTRANSNUM("12");
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
				
		TX_ITEMENTRY item_ = new TX_ITEMENTRY_Imp();
		item_.setDAY("hijk");
		List itementryList_ = new ArrayList();
		List headerList_ = new ArrayList();
		itementryList_.add(item_);
		headerList_.add(header_);
		
		//vo_.setItemEntry(itementryList_);
		vo_.setHeader(headerList_);
		try {
			val.validarTrama(vo_);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
