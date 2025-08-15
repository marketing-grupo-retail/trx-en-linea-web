package com.grpretail.trxonline.utils;

public class BusinessLogicParameters {

	// Tabla de códigos para las diferentes transacciones
	public static final int APLICACION_LEALTAD					= 2;
	public static final int APLICACION_CHEQUES					= 3;
	public static final int APLICACION_BONOS					= 4;
	
	public static final int APLICACION_LEALTAD_COMFANDI			= 20;
	
	public static final int FUNCION_CARGAPARAM_WAS				= 206;
	public static final int FUNCION_CARGAPARAM_WASLOCAL			= 207;

	public static final int FUNCION_DESCONOCIDA					= 9999;
	

	public static final String ID_EMITTED_BONOS_STATUS			= "EMITTED_BONUS_STATUS";
	public static final String ID_PARTIAL_BONOS_STATUS			= "PARTIAL_BONUS_STATUS";
	public static final String ID_USED_BONOS_STATUS				= "USED_BONUS_STATUS";
	public static final String ID_NULL_BONOS_STATUS				= "NULL_BONUS_STATUS";	
	
	public static final int FUNCION_CONSULTA_FACTURA_A_PAGAR		= 1201;	// Por dentro de la trx
	public static final int FUNCION_ACTUALIZ_PAGO_FAC_TRXONLINE		= 1203;	// Por dentro de la trx
	

	// DATOS GENERALES DE LA APLICACION
	public static final String PAR_CURRENT_DATE_FUNTION_NAME			= "CURRENT DATE";//Para DB2
	public static final String PAR_CURRENT_TIMESTAMP_FUNTION_NAME		= "CURRENT TIMESTAMP";//Para DB2
	public static final String PAR_CURRENT_TIME_FUNTION_NAME			= "CURRENT TIME";//Para DB2
	public static final String PAR_CENTURY								= "20";	
	
	//public static final String CURRENT_DATE_FUNTION_NAME			= "SYSDATE";//Para Oracle
	

	// DATOS GENERALES DE LA APLICACION
	public static final int ID_TRX_IN_FILE_NO_DB					= 1;
	public static final int ID_TRX_IN_DB_NO_FILE					= 2;
	public static final int ID_TRX_BAD_ESTRUCTURE					= 3;
	public static final int ID_TRX_TWICE_IN_DB						= 4;		

	public static final String DB_TABLA_TOL_SUPPORT_STORES			= "TOL_SUPPORT_STORE";
	
	public static final String DB_COLUM_TOL_STORE_ID					= "TOL_ID"; 
	public static final String DB_COLUM_TOL_STORE_NAME					= "TOL_NAME";

	/*	
	public static final String DB_TABLA_CLIENTE_X_TIPO_CLIENTE		= "CLIXTCLI";
	
	public static final String DB_COLUM_CTC_ID_CLIENTE				= "NROIDE";	
	public static final String DB_COLUM_CTC_ID_TIPO_CLIENTE			= "IDTCLI";
	
	public static final String DB_TABLA_TIPO_CLIENTE				= "MOL_TIPO_CLIENTE";
	public static final String DB_COLUM_TCL_ID_TIPO_CLIENTE			= "ID"; 
	public static final String DB_COLUM_TCL_NOMBRE					= "NOMBRE"; 
	public static final String DB_COLUM_TCL_DESCRIPCION				= "DESCRIP";
	public static final String DB_COLUM_TCL_CODIGO					= "CODIGO_TIPO";
	
	
	public static final String DB_TABLA_TRX_DIA_SIN_IVA			= "TRX_DIA_SIN_IVA";
	public static final String DB_COLUM_DSI_ID					= "DSI_ID";
	public static final String DB_COLUM_DSI_ID_CLIENTE			= "DSI_ID_CLIENTE";
	//public static final String DB_COLUM_LTL_PRY					= "TLT_PRY";
	//public static final String DB_COLUM_LTL_SVR					= "TLT_SVR";
	//public static final String DB_COLUM_LTL_CADENA				= "TLT_CADENA"; 
	public static final String DB_COLUM_DSI_TIENDA				= "DSI_TIENDA"; 	
	public static final String DB_COLUM_DSI_NUM_TERMINAL		= "DSI_NUM_TERMINAL"; 	
	public static final String DB_COLUM_DSI_OPERADOR			= "DSI_OPERADOR"; 		
	public static final String DB_COLUM_DSI_NUM_FACTURA			= "DSI_NUM_FACTURA";	
	public static final String DB_COLUM_DSI_FECH_HORA_TRX_POS	= "DSI_FECHA_HORA_TRX_POS";
	public static final String DB_COLUM_DSI_FECHA_HORA_TRX		= "DSI_FECHA_HORA_TRX";
	 		
	public static final String DB_COLUM_DSI_ESTRUCTURA	    	= "DSI_ESTRUCTURA"; 
	public static final String DB_COLUM_DSI_FECHA_EVENTO		= "DSI_FECHA_EVENTO"; 
	public static final String DB_COLUM_DSI_CANTIDAD_MAX		= "DSI_CANTIDAD_MAX";
	public static final String DB_COLUM_DSI_CANTIDAD_VENTA		= "DSI_CANTIDAD_VENTA";

	//public static final String DB_COLUM_LTL_MONTO_TRANSACCION	= "TLT_MONTO_TRX";

	public static final String DB_TABLA_BONOS_LEALTAD			= "LT_BONOS_LEALTAD";
	public static final String DB_COLUM_LBL_ID					= "LBL_ID";
	public static final String DB_COLUM_LBL_ID_CLIENTE			= "LBL_ID_CLIENTE";
	public static final String DB_COLUM_LBL_NUMERO				= "LBL_NUMERO";
	public static final String DB_COLUM_LBL_VALOR				= "LBL_VALOR";
	public static final String DB_COLUM_LBL_VALOR_USADO			= "LBL_VALOR_USADO"; 
	public static final String DB_COLUM_LBL_FECHA_CREACION		= "LBL_FECHA_CREACION"; 	
	public static final String DB_COLUM_LBL_FECHA_USO			= "LBL_FECHA_USO"; 	
	public static final String DB_COLUM_LBL_ESTADO				= "LBL_ESTADO";
	public static final String DB_COLUM_LBL_STORE				= "LBL_ID_SUPERM";
	public static final String DB_COLUM_LBL_TERMINAL			= "LBL_ID_TERMINAL";
	public static final String DB_COLUM_LBL_TRX					= "LBL_ID_TRANSACC";
	public static final String DB_COLUM_LBL_POS_FECHA_HORA		= "LBL_POS_FEC_HOR_TRANSACC";
	public static final String DB_COLUM_LBL_OPERATOR			= "LBL_ID_CAJERO"; 		

	
	public static final String DB_SQ_PCL_NEXT_VALUE				= "SQ_LT_TRX_PUNTOS_CLIENTE.NEXTVAL";
	
	public static final String DB_TABLA_LOYALTY_PARAMETERS		= "LT_PARAMETROS_PTS";
	public static final String DB_COLUM_LY_VENCIMIENTO			= "VENCIMIENTO";             
	public static final String DB_COLUM_LY_DURATION				= "DURACION";
	public static final String DB_COLUM_LY_NOTIFICATION			= "NOTIFICACION";
	public static final String DB_COLUM_LY_ACCUMULATION			= "ACUMULACION ";
	public static final String DB_COLUM_LY_START_DATE			= "FECHA_INI DATE";
	public static final String DB_COLUM_LY_END_DATE				= "FECHA_FIN DATE";
	public static final String DB_COLUM_CL_NOMBRES				= "NOMCLI";
	public static final String DB_COLUM_CL_APELLIDOS			= "APECLI";
	public static final String DB_COLUM_CL_ID_TIPOCLIENTE		= "TIPO";
	*/

	public static final int PAGE_REGISTER_NUMBER						= 500;//Número de registros para paginación.
	
	
	// Bases de datos usadas en el proyecto  - PROYECTO: PAGO ELECTRONIO COMFANDI
	public static final String ID_DATABASE_MILENIUM				= "milenium";// Documentos de pago
	public static final String ID_DATABASE_TITAN				= "titan";	// Transacciones de log.
	public static final String ID_DATABASE_MERC					= "";	// 
		
	
	
	
	
	
	
}

