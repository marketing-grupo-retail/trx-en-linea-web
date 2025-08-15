/*
 * Created on 21/11/2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.trxonline.sodimac.monitor.trx;

import com.asic.author.manager.obj.ServerAnswer;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class UserServerAnswer extends ServerAnswer{
	/***La configuración de la respuesta debe ser definida en el archivo ServerAnswerCodes.properties***////
	public static final String ID_TOTAL_TRAMA_STORED		="TOTAL_TRAMA_STORED";
	public static final String ID_PARTIAL_TRAMA_STORED		="PARTIAL_TRAMA_STORED"; //Respuesta de test 1
	public static final String ID_RECEIVED_BAD_TRAMA		="RECEIVED_BAD_TRAMA"; //Respuesta de test 1
	public static final String ID_TEST_ANSWER1		="TEST_ANSWER1"; //Respuesta de test 2
	public static final String ID_TEST_ANSWER2		="TEST_ANSWER2"; //Respuesta de test 2	
	public static final String ID_STORE_PENDING_TRX				="STORE_PENDING_TRX"; //Respuesta de test 2
	public static final String ID_DB_STORE_GETTING_ERROR		="DB_STORE_GETTING_ERROR"; //Respuesta de test 2
	public static final String ID_SUPPORT_STORE_NOT_FOUND_IN_DB	="SUPPORT_STORE_NOT_FOUND_IN_DB"; //Respuesta de test 2
	public static final String ID_IS_NOT_SALES_TRANSACCION		="NO_ES_TRANSACCION_DE_VENTA";
}
