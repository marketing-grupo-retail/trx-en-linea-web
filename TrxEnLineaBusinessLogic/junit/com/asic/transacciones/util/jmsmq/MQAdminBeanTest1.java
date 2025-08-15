/*
 * Created on Dec 27, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.util.jmsmq;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TRANSACCION_Imp;
import com.asic.transacciones.vo.TX_HEADER;
import com.asic.transacciones.vo.TX_HEADER_Imp;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class MQAdminBeanTest1 extends TestCase {

	/**
	 * Constructor for MQAdminBeanTest.
	 * @param arg0
	 */
	public MQAdminBeanTest1(String arg0) {
		super(arg0);
	}

	public void testEnviarACola() {
		try {
			MQAdminBean mqa_ = new MQAdminBean();
			for (int i = 0; i < 5; i++) {
				TRANSACCION vo_ = new TRANSACCION_Imp();
				TX_HEADER header_ = new TX_HEADER_Imp();
				header_.setDAY("100105x");
				header_.setGROSSNEG("2111");
				header_.setGROSSPOS("4222");
				header_.setINACTIVE("1");
				header_.setNUMSTRIN("1111");
				header_.setOFFSETX("15");
				header_.setOFFSETY("123"+i);
				header_.setOPERATOR("1");
				header_.setPASSWORD("444444");
				header_.setRINGTIME("454545");
				header_.setSPECIAL("6767676");
				header_.setSTORE("1122");
				header_.setTENDERTI("12345678");
				header_.setTERMINAL("0001");
				header_.setTIME("12456");
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

				List lst_ = new ArrayList();
				lst_.add(header_);
				vo_.setHeader(lst_);
				mqa_.enviarACola(vo_);
			}

		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

}
