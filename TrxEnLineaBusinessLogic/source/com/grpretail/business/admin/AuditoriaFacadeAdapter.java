/*
 * Created on Jul 1, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.grpretail.business.admin;

import java.sql.Timestamp;
import java.util.List;

import com.asic.framework.exception.ServiceException;
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
public class AuditoriaFacadeAdapter	implements AuditoriaBusinessDelegate {

	/* (non-Javadoc)
	 * @see com.grpretail.business.admin.AdminGenListsBusinessDelegate#consultarLogReportes(java.lang.String, java.sql.Date, java.sql.Date)
	 */
	public List consultarLogReportes(String pLogin, Timestamp pFechaIni,
		Timestamp pFechaFinal, int pPosIni, int pPosFin) throws ServiceException {
		AuditoriaBean adminGenBean_ = new AuditoriaBean();

		return adminGenBean_.consultarLogReportes(pLogin, pFechaIni, pFechaFinal,pPosIni,pPosFin);
	}

	/* (non-Javadoc)
	 * @see com.grpretail.business.admin.AdminGenListsBusinessDelegate#consultarLogAcciones(java.lang.String, java.sql.Timestamp, java.sql.Timestamp)
	 */
	public List consultarLogAcciones(String pLogin, Timestamp pFechaIni,
		Timestamp pFechaFinal, int pPosIni, int pPosFin) throws ServiceException {
		AuditoriaBean adminGenBean_ = new AuditoriaBean();

		return adminGenBean_.consultarLogAcciones(pLogin, pFechaIni, pFechaFinal,pPosIni,pPosFin);
	}

	/* (no Javadoc)
	 * @see com.grpretail.business.admin.AuditoriaBusinessDelegate#insertLogAcciones(java.util.List)
	 */
	public void insertLogAcciones(List logOpts) throws ServiceException {
		AuditoriaBean adminGenBean_ = new AuditoriaBean();

		adminGenBean_.insertLogAcciones(logOpts);
	}

	/**
	 * Inserta en la tabla de log de opciones del sistema
	 * una lista de logs de acciones del usuario.
	 * @param pIdUser				Id del usuario que ejecuto la accion
	 * @param pDate					Fecha en la que se realizo la acción
	 * @param pDescrip				Descripcion de la accion
	 * @throws ServiceException
	 */
	public void insertLogReportes(int pIdUser, Timestamp pDate, String pDescrip) throws ServiceException {
		AuditoriaBean adminGenBean_ = new AuditoriaBean();

		adminGenBean_.insertLogReportes(pIdUser,pDate,pDescrip);
	}

	/* (no Javadoc)
	 * @see com.grpretail.business.admin.AuditoriaBusinessDelegate#getOpcion(java.lang.String)
	 */
	public OPTIONS getOpcion(String pId) throws ServiceException {
		AuditoriaBean adminGenBean_ = new AuditoriaBean();

		return adminGenBean_.getOpcion(pId);
	}

	/**
	 * Retorna un mensaje dependiendo del menu que se quiera mostrar
	 *
	 * @param tipoMsj			int que representa el tipo de menú
	 * @return
	 * @throws ServiceException
	 */
	public String mostrarMensaje(int tipoMsj) throws ServiceException{
		AuditoriaBean adminGenBean_ = new AuditoriaBean();

		return adminGenBean_.mostrarMensaje(tipoMsj);
	}

	/**
	 * Retorna una lista con todos los mensajes de la BD
	 *
	 * @return					List con objetos MENSAJES
	 * @throws ServiceException
	 */
	public List getMensajes() throws ServiceException{
		AuditoriaBean adminGenBean_ = new AuditoriaBean();

		return adminGenBean_.getMensajes();
	}

	/**
	 * Actualiza un mensaje en la BD
	 *
	 * @param pMsj				Objeto MENSAJE a actualizar
	 * @throws ServiceException
	 */
	public void updateMensajes(MENSAJES pMsj) throws ServiceException{
		AuditoriaBean adminGenBean_ = new AuditoriaBean();

		adminGenBean_.updateMensajes(pMsj);
	}

	/**
	 * Método que retorna una lista con objetos DBConfig los cuales tienen los
	 * parametros necesarios: login, password, url, driver
	 *
	 * @return					Lista con objetos DBConfig
	 * @throws ServiceException
	 */
	public List getDBRelacional() throws ServiceException{
		AuditoriaBean adminGenBean_ = new AuditoriaBean();

		return adminGenBean_.getDBRelacional();
	}

	/**
	 * Metodo que actualiza el db.properties
	 *
	 * @param pConfig			Instancia de la clase DBConfig que contiene los datos a actualizar
	 * @throws ServiceException
	 */
	public void actualizarDBConfig(DBConfig pConfig) throws ServiceException{
		AuditoriaBean adminGenBean_ = new AuditoriaBean();

		adminGenBean_.actualizarDBConfig(pConfig);
	}

	/**
	 * Retorna el valor asociado al parametro
	 *
	 * @param pParam			String que representa el parametro a buscar
	 * @return					String que representa el valor
	 * @throws ServiceException
	 */
	public String getParam(String pParam) throws ServiceException{
		AuditoriaBean adminGenBean_ = new AuditoriaBean();

		return adminGenBean_.getParam(pParam);
	}

	/** Prueba una conección a la BD dados los parámetros
		 *
		 * @author PEGR
		 * @param pVo objeto con los parámetros de conexión
		 * @return String con el resultado de la conexión
		 */
		public String testConnection(DBConfig pVo){
			AuditoriaBean adminGenBean_ = new AuditoriaBean();

			return adminGenBean_.testConnection(pVo);
		}

	/** Inserta en el log de acciones
	 *
	 * @author IGL
	 * @param USUARIO pUsuario, String pOptionId
	 * @return void
	 */
	public void logAcciones( USUARIO pUsuario, String pOptionId )
	throws ServiceException {

			AuditoriaBean adminGenBean_ = new AuditoriaBean();
			adminGenBean_.logAcciones( pUsuario, pOptionId );


	}
}
