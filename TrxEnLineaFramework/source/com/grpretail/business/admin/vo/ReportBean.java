/*
 * Created on Jul 30, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.grpretail.business.admin.vo;

import java.sql.Timestamp;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceLocator;
import com.grpretail.business.admin.AuditoriaBusinessDelegate;

/**
 * @author JuanR
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ReportBean {
	
	// Usuario creado por el administrador del sistema
	public static int USER_CREADO_ADMIN 					= 1;
	
	// Usuario activado por el administrador del sistema
	public static int USER_ACTIVADO_ADMIN 					= 2;
	
	// A intentado ingresar al ambiente del administrador del sistema
	public static int USER_AMBIENTE_SISTEMA					= 3;
	
	// Usuario inactivado por el administrador del sistema
	public static int USER_INACTIVADO_ADMIN 				= 4;
	
	// El usuario a intentado ingresar al sistema y su estado se encuentra inactivo
	public static int USER_INACTIVO_INGRESANDO				= 5;
		
	// El administrador del sistema cambia su contraseña
	public static int ADMIN_CAMBIO_CONTRASEÑA 				= 6;
	
	// El usuario cambia su contraseña a voluntad
	public static int USER_CAMBIO_PASSWD_VOLUNTAD 			= 7;
	
	// Cambio de la información del usuario por parte del administrador del sistema
	public static int USER_INFO_CAMBIADA_ADMIN				= 8;
	
	// Usuario inactivo por intentar ingresar más de una vez en el mismo instante de tiempo
	public static int USER_INACTIVO_INGRESO_MULTIPLE		= 9;
	
	/**
	 * Inserta en el log de reportes
	 * 
	 * @param pIdUser				Id del usuario que eecuto la accion
	 * @param pIdReporte			Id de la acción realizada
	 * @throws ServiceException
	 */
	public static void insertReport(int pIdUser, Timestamp Date, String pDescrip) throws ServiceException{
		
		((AuditoriaBusinessDelegate)ServiceLocator.getService(
			AuditoriaBusinessDelegate.class)).insertLogReportes(pIdUser,Date,pDescrip);
		
	}

}
