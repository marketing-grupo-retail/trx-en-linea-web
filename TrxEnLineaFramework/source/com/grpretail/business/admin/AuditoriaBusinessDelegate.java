/*
 * Created on Jun 30, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.grpretail.business.admin;

import java.sql.Timestamp;
import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceProvider;
import com.grpretail.business.admin.vo.DBConfig;
import com.grpretail.business.admin.vo.MENSAJES;
import com.grpretail.business.admin.vo.OPTIONS;
import com.grpretail.business.admin.vo.USUARIO;

/**
 * @author JuanR
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public interface AuditoriaBusinessDelegate extends ServiceProvider {

	/**
	 * Devuelve un arreglo con el log de reportes para el usuario
	 * 
	 * @param pLogin		String
	 * @param pFechaIni		Date
	 * @param pFechaFinal	Date
	 * @param pPosIni		int
	 * @param pPosFin		int
	 * @return				List con objetos LOG_REP_Ext
	 * @throws ServiceException
	 */
	public List consultarLogReportes(String pLogin, Timestamp pFechaIni, 
		Timestamp pFechaFinal, int pPosIni, int pPosFin)	throws ServiceException;	
		
	/**
	 * Devuelve un arreglo con el log de acciones para el usuario
	 * 
	 * @param pLogin		String
	 * @param pFechaIni		Timestamp
	 * @param pFechaFinal	Timestamp
	 * @param pPosIni		int
	 * @param pPosFin		int
	 * @return				Lista con objetos LOG_OPTS_Ext
	 * @throws ServiceException
	 */
	public List consultarLogAcciones(String pLogin, Timestamp pFechaIni, 
		Timestamp pFechaFinal, int pPosIni, int pPosFin) throws ServiceException;
				
	/**
	 * Inserta en la tabla de log de opciones del sistema 
	 * una lista de logs de acciones del usuario.
	 * @param logOpts	Lista de Objetos LOG_OPTS a insertar
	 * @throws ServiceException
	 */
	public void insertLogAcciones(List logOpts)throws ServiceException;
	
	/**
	 * Inserta en la tabla de log de opciones del sistema 
	 * una lista de logs de acciones del usuario.
	 * @param pIdUser				Id del usuario que ejecuto la accion
	 * @param pDate					Fecha en la que se realizo la acción
	 * @param pDescrip				Descripcion de la accion
	 * @throws ServiceException
	 */
	public void insertLogReportes(int pIdUser, Timestamp pDate, String pDescrip) throws ServiceException;

	/**
	 * Retorna la opcion del sistema deseada
	 * 
	 * @param pId
	 * @return Objecto OPTIONS
	 */
	public OPTIONS getOpcion(String pId) throws ServiceException;

	/**
	 * Retorna un mensaje dependiendo del menu que se quiera mostrar
	 * 
	 * @param tipoMsj			int que representa el tipo de menú
	 * @return
	 * @throws ServiceException
	 */
	public String mostrarMensaje(int tipoMsj) throws ServiceException;
	
	/**
	 * Retorna una lista con todos los mensajes de la BD
	 * 
	 * @return					List con objetos MENSAJES
	 * @throws ServiceException
	 */
	public List getMensajes() throws ServiceException;
	
	/**
	 * Actualiza un mensaje en la BD
	 * 
	 * @param pMsj				Objeto MENSAJE a actualizar
	 * @throws ServiceException
	 */
	public void updateMensajes(MENSAJES pMsj) throws ServiceException;
	
	/**
	 * Método que retorna una lista con objetos DBConfig los cuales tienen los 
	 * parametros necesarios: login, password, url, driver
	 * 
	 * @return					Lista con objetos DBConfig
	 * @throws ServiceException
	 */
	public List getDBRelacional() throws ServiceException;
	
	/**
	 * Metodo que actualiza el db.properties
	 * 
	 * @param pConfig			Instancia de la clase DBConfig que contiene los datos a actualizar
	 * @throws ServiceException
	 */
	public void actualizarDBConfig(DBConfig pConfig) throws ServiceException;
	
	/**
	 * Retorna el valor asociado al parametro 
	 * 
	 * @param pParam			String que representa el parametro a buscar
	 * @return					String que representa el valor
	 * @throws ServiceException
	 */
	public String getParam(String pParam) throws ServiceException;
	
	
	/** Prueba una conección a la BD dados los parámetros
	 * 
	 * @author PEGR
	 * @param pVo objeto con los parámetros de conexión
	 * @return String con el resultado de la conexión
	 */
	public String testConnection(DBConfig pVo);
	
	
	/** Inserta en el log de acciones
	 * 
	 * @author IGL
	 * @param USUARIO pUsuario, String pOptionId 
	 * @return void
	 */	
	public void logAcciones( USUARIO pUsuario, String pOptionId ) 
	throws ServiceException ; 	
}
