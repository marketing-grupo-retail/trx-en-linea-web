/*
 * Created on Jun 25, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.grpretail.business.admin;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

import org.ramm.jwaf.dbutil.DBUtil;
import org.ramm.jwaf.patterns.dao.DAOClassNotFoundException;
import org.ramm.jwaf.patterns.dao.DAOCreationException;
import org.ramm.jwaf.patterns.dao.DAOLocator;
import org.ramm.jwaf.patterns.poolmanager.ConnectionConfig;
import org.ramm.jwaf.patterns.poolmanager.ConnectionPool;
import org.ramm.jwaf.patterns.poolmanager.PoolFactory;
import org.ramm.jwaf.properties.PropertiesIOException;
import org.ramm.jwaf.properties.PropertiesManager;
import org.ramm.jwaf.properties.ResourceNotFoundException;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.resources.ApplicationConfigFacadeAdapter;
import com.asic.framework.resources.ApplicationResources;
import com.grpretail.business.admin.dao.PCONFIG_DAO;
import com.grpretail.business.admin.dao.USUARIO_DAO;
import com.grpretail.business.admin.dao.jdao.LOG_OPTS_DAO;
import com.grpretail.business.admin.dao.jdao.LOG_REP_DAO;
import com.grpretail.business.admin.dao.jdao.MENSAJES_DAO;
import com.grpretail.business.admin.dao.jdao.OPTIONS_DAO;
import com.grpretail.business.admin.vo.DBConfig;
import com.grpretail.business.admin.vo.DBConfig_Imp;
import com.grpretail.business.admin.vo.LOG_OPTS;
import com.grpretail.business.admin.vo.LOG_OPTS_Ext_Imp;
import com.grpretail.business.admin.vo.LOG_OPTS_Imp;
import com.grpretail.business.admin.vo.LOG_REP_Ext_Imp;
import com.grpretail.business.admin.vo.LOG_REP_Imp;
import com.grpretail.business.admin.vo.MENSAJES;
import com.grpretail.business.admin.vo.MENSAJES_Imp;
import com.grpretail.business.admin.vo.OPTIONS;
import com.grpretail.business.admin.vo.OPTIONS_Imp;
import com.grpretail.business.admin.vo.PCONFIG;
import com.grpretail.business.admin.vo.PCONFIG_Imp;
import com.grpretail.business.admin.vo.USUARIO;
import com.grpretail.business.admin.vo.USUARIO_Imp;


/**
 * @author JuanR
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class AuditoriaBean {
	
	private ApplicationConfigFacadeAdapter adapter_;
	
	/**
	 * Devuelve una lista con el log de acciones para el usuario
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
		Timestamp pFechaFinal, int pPosIni, int pPosFin) throws ServiceException {
		
		adapter_ = new ApplicationConfigFacadeAdapter();
		List res_ = null;
		String fechaIniOrig_ = pFechaIni.toString();
		StringBuffer fechaIni_ = new StringBuffer();
		
		fechaIni_.append("to_date('");
		fechaIni_.append(fechaIniOrig_.substring(8,10));//dia
		fechaIni_.append("/");
		fechaIni_.append(fechaIniOrig_.substring(5,7));//mes
		fechaIni_.append("/");
		fechaIni_.append(fechaIniOrig_.substring(2,4));//ano
		fechaIni_.append("','dd/mm/yy')");
		//fechaIni_.append(" 01:00:0.000000 AM");
		
		String fechaFinOrig_ = pFechaFinal.toString();
		StringBuffer fechaFin_ = new StringBuffer();
		fechaFin_.append("to_date('");
		fechaFin_.append(fechaFinOrig_.substring(8,10));//dia
		fechaFin_.append("/");
		fechaFin_.append(fechaFinOrig_.substring(5,7));//mes
		fechaFin_.append("/");
		fechaFin_.append(fechaFinOrig_.substring(2,4));//ano
		fechaFin_.append("','dd/mm/yy')");
		//fechaFin_.append(" 11:59:59.000000 PM");
		
		// Se busca el login que llega para saber si el usuario existe o no
		boolean exisUser_ = existeUsuario(pLogin);
		if(exisUser_ == false){
			throw new ServiceException("El login no existe");
		}
		
		try {
			//System.out.println("Fecha Inip->"+fechaIni_);
			//System.out.println("Fecha Fin->"+fechaFin_);
			res_ = DBUtil.select(
					"MOL_USUARIO.ID AS ID,MOL_USUARIO.LOGIN AS LOGIN, MOL_LOG_OPTS.DESCRIP AS DESCRIP, " +
//					"MOL_LOG_OPTS.TIME AS TIME, MOL_OPTIONS.NOMBRE AS NOMBRE, MOL_OPTIONS.DESCRIP AS DESC ",
					"MOL_LOG_OPTS.TIME AS TIME, MOL_OPTIONS.NOMBRE AS NOMBRE, MOL_OPTIONS.DESCRIP AS DESC_OPTS ",
					"MOL_USUARIO, MOL_LOG_OPTS, MOL_OPTIONS ",
					"MOL_USUARIO.LOGIN LIKE '%" + pLogin +
						"' AND MOL_USUARIO.ID = MOL_LOG_OPTS.ID_USR " +
						"AND MOL_LOG_OPTS.ID_OPTS = MOL_OPTIONS.ID " +
						//"AND MOL_LOG_OPTS.TIME BETWEEN " + fechaIni_ + " AND " + fechaFin_ + " ",
						"AND MOL_LOG_OPTS.TIME BETWEEN '" + pFechaIni + "' AND '" + pFechaFinal + "' ",
					" ORDER BY TIME DESC",
					LOG_OPTS_Ext_Imp.class,
					ApplicationResources.GR_DB,
					pPosIni, pPosFin);
												
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}

		return res_;
	}

	/**
	 * Devuelve una lista con el log de reportes para el usuario
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
		Timestamp pFechaFinal, int pPosIni, int pPosFin) throws ServiceException {
		
		adapter_ = new ApplicationConfigFacadeAdapter();
		List res_ = null;
		StringBuffer fechaIni_ = new StringBuffer(pFechaIni.toString());
//		fechaIni_ = fechaIni_.substring(0, fechaIni_.lastIndexOf('.'));
		fechaIni_.setCharAt(10,'-');
		fechaIni_.setCharAt(13,'.');
		fechaIni_.setCharAt(16,'.');
		StringBuffer fechaFin_ = new StringBuffer(pFechaFinal.toString());
//		fechaFin_ = fechaFin_.substring(0, fechaFin_.lastIndexOf('.'));
		fechaFin_.setCharAt(10,'-');
		fechaFin_.setCharAt(13,'.');
		fechaFin_.setCharAt(16,'.');
		
		// Se busca el login que llega para saber si el usuario existe o no
		boolean exisUser_ = existeUsuario(pLogin);
		if(exisUser_ == false){
			throw new ServiceException("El login no existe");
		}
		
		try {
			
			res_ = DBUtil.select(
					"LOG_REP.ID AS ID,LOG_REP.ID_USER AS ID_USER," +
						"LOG_REP.TIME AS TIME, LOG_REP.DESCRIP AS DESCRIP," +
						"USUARIO.LOGIN AS LOGIN ",
					/*adapter_.getAsicGOwner() +*/ "MOL_USUARIO AS USUARIO,  " + 
						/*adapter_.getAsicGOwner() +*/ "MOL_LOG_REP AS LOG_REP ",
					"USUARIO.LOGIN LIKE '" + pLogin +
						"' AND USUARIO.ID = LOG_REP.ID_USER " +
						"AND LOG_REP.TIME BETWEEN '" + fechaIni_ + "' AND '" + fechaFin_+ "' ",
					"ORDER BY TIME DESC,LOGIN",
					LOG_REP_Ext_Imp.class,
					ApplicationResources.GR_DB,
					pPosIni, pPosFin);
												
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}

		return res_;
	}

	/**
	 * Inserta en la tabla de log de opciones del sistema 
	 * una lista de logs de acciones del usuario.
	 * @param logOpts	Lista de Objetos LOG_OPTS a insertar
	 * @throws ServiceException
	 */
	public void insertLogAcciones(List logOpts)throws ServiceException{
		
		LOG_OPTS_Imp element = null;
		LOG_OPTS_DAO logOptsDao_ = null;
		
		try {
			logOptsDao_ = (LOG_OPTS_DAO)DAOLocator.getDAO(LOG_OPTS_DAO.class);
		
			for (Iterator iter = logOpts.iterator(); iter.hasNext();) {
				element = (LOG_OPTS_Imp) iter.next();
				logOptsDao_.insert(element);
			}
		
		} catch (DAOClassNotFoundException e) {
			throw new ServiceException("DAOClassNotFoundException", e);
		} catch (DAOCreationException e) {
			throw new ServiceException("DAOCreationException", e);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
	}
	
//	/**
//	 * Inserta en la tabla de log de opciones del sistema 
//	 * una lista de logs de acciones del usuario.
//	 * @param logOpts
//	 * @throws ServiceException
//	 */
//	public void insertLogReportes(List logOpts)throws ServiceException{
//		
//		LOG_REP_Imp element = null;
//		LOG_REP_DAO logRepDao_ = null;
//		
//		try {
//			logRepDao_ = (LOG_REP_DAO)DAOLocator.getDAO(LOG_REP_DAO.class);
//		
//			for (Iterator iter = logOpts.iterator(); iter.hasNext();) {
//				element = (LOG_REP_Imp) iter.next();
//				logRepDao_.insert(element);
//			}
//		
//		} catch (DAOClassNotFoundException e) {
//			throw new ServiceException("DAOClassNotFoundException", e);
//		} catch (DAOCreationException e) {
//			throw new ServiceException("DAOCreationException", e);
//		} catch (ConnectionFailedException e) {
//			throw new ServiceException("ConnectionFailedException", e);
//		} catch (DBAccessException e) {
//			throw new ServiceException("DBAccessException", e);
//		}
//	}
	
	/**
	 * Inserta en la tabla de log de opciones del sistema 
	 * una lista de logs de acciones del usuario.
	 * @param pIdUser				Id del usuario que ejecuto la accion
	 * @param pDate					Fecha en la que se realizo la acción
	 * @param pDescrip				Descripcion de la accion
	 * @throws ServiceException
	 */
	public void insertLogReportes(int pIdUser, Timestamp pDate, String pDescrip)throws ServiceException{
		
		LOG_REP_Imp element_ = null;
		LOG_REP_DAO logRepDao_ = null;
		
		try {
			logRepDao_ = (LOG_REP_DAO)DAOLocator.getDAO(LOG_REP_DAO.class);
				
			element_ = new LOG_REP_Imp();
			element_.setID_USER(new Integer(pIdUser));
			element_.setTIME(pDate);
			element_.setDESCRIP(pDescrip);
				
			logRepDao_.insert(element_);
		
		} catch (DAOClassNotFoundException e) {
			throw new ServiceException("DAOClassNotFoundException", e);
		} catch (DAOCreationException e) {
			throw new ServiceException("DAOCreationException", e);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
	}

	/**
	 * Retorna la opcion del sistema deseada
	 * 
	 * @param pId
	 * @return Objecto OPTIONS
	 */
	public OPTIONS getOpcion(String pId) throws ServiceException{
		
		OPTIONS_DAO optDao_ = null;
		OPTIONS_Imp opt_ = null;
		List res_ = null;
		
		try {
			optDao_ = (OPTIONS_DAO)DAOLocator.getDAO(OPTIONS_DAO.class);
			opt_ = new OPTIONS_Imp();
			opt_.setID(new Integer(pId));
			
			res_ = optDao_.selectVO(opt_);
			
			if((res_ != null) && !(res_.isEmpty())){
				return (OPTIONS)res_.get(0);
			}
			
		} catch (DAOClassNotFoundException e) {
			throw new ServiceException("DAOClassNotFoundException", e);
		} catch (DAOCreationException e) {
			throw new ServiceException("DAOCreationException", e);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
		
		return null;
	}
	
	/**
	 * Retorna un mensaje dependiendo del menu que se quiera mostrar
	 * 
	 * @param tipoMsj			int que representa el tipo de menú
	 * @return
	 * @throws ServiceException
	 */
	public String mostrarMensaje(int tipoMsj) throws ServiceException{
		
		MENSAJES_DAO msjDao_ = null;
		MENSAJES_Imp msj_ = new MENSAJES_Imp();
		List res_ = null;
		String mensaje_ = "";
		
		try {
			msjDao_ = (MENSAJES_DAO)DAOLocator.getDAO(MENSAJES_DAO.class);
		
			msj_.setID(new Integer(tipoMsj));
			res_ = msjDao_.selectVO(msj_);
			
			mensaje_ = ((MENSAJES)res_.get(0)).getMENSAJE();
			
		} catch (DAOClassNotFoundException e) {
			throw new ServiceException("DAOClassNotFoundException", e);
		} catch (DAOCreationException e) {
			throw new ServiceException("DAOCreationException", e);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
		
		return mensaje_;
	}
	
	/**
	 * Retorna una lista con todos los mensajes de la BD
	 * 
	 * @return					List con objetos MENSAJES
	 * @throws ServiceException
	 */
	public List getMensajes() throws ServiceException{

		MENSAJES_DAO msjDao_ = null;
		List res_ = null;
		
		try {
			msjDao_ = (MENSAJES_DAO)DAOLocator.getDAO(MENSAJES_DAO.class);
		
			res_ = msjDao_.selectVO();
			
		} catch (DAOClassNotFoundException e) {
			throw new ServiceException("DAOClassNotFoundException", e);
		} catch (DAOCreationException e) {
			throw new ServiceException("DAOCreationException", e);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
		
		return res_;
	}
	
	/**
	 * Actualiza un mensaje en la BD
	 * 
	 * @param pMsj				Objeto MENSAJE a actualizar
	 * @throws ServiceException
	 */
	public void updateMensajes(MENSAJES pMsj) throws ServiceException{

		MENSAJES_DAO msjDao_ = null;
		
		try {
			msjDao_ = (MENSAJES_DAO)DAOLocator.getDAO(MENSAJES_DAO.class);
		
			msjDao_.update(pMsj);
			
		} catch (DAOClassNotFoundException e) {
			throw new ServiceException("DAOClassNotFoundException", e);
		} catch (DAOCreationException e) {
			throw new ServiceException("DAOCreationException", e);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
	}
	
	/**
	 * Método que retorna una lista con objetos DBConfig los cuales tienen los 
	 * parametros necesarios: login, password, url, driver
	 * 
	 * @return					Lista con objetos DBConfig
	 * @throws ServiceException
	 */
	public List getDBRelacional() throws ServiceException{
		
		adapter_ = new ApplicationConfigFacadeAdapter();
		List res_ = new Vector();
		String nombresBD_ = "";
		String name_ = "";
		DBConfig_Imp config_ = null;
		
		nombresBD_ = adapter_.get(ApplicationResources.APP_BD_NAMES);
		// Se separa la cadena por las comas(,)
		StringTokenizer sToken_ = new StringTokenizer(nombresBD_, ",");

		while (sToken_.hasMoreTokens()) {
			name_ = sToken_.nextToken();
			config_ = getInfoDB(name_+".");
			config_.setNOMBRE(name_);
			res_.add(config_);
		}	
		
//		config_ = getInfoDB("");
//		config_.setNOMBRE("inarch");
//		res_.add(config_);

		return res_;
	}
	
	private DBConfig_Imp getInfoDB(String pPrefix) throws ServiceException{
		
		PropertiesManager prop_ = null;
		DBConfig_Imp config_ = new DBConfig_Imp();
		String usuario_ = pPrefix + "user";
		String clave_ = pPrefix + "password";
		String url_ = pPrefix + "dburl";
		String driver_ = pPrefix + "driver";
		
		try {
			prop_ = new PropertiesManager("app_name=gr_admin","db.properties");
			config_.setLOGIN(prop_.readProperty(usuario_));
			config_.setPASSWORD(prop_.readProperty(clave_));
			config_.setURL(prop_.readProperty(url_));
			config_.setDRIVER(prop_.readProperty(driver_));
		
		} catch (ResourceNotFoundException e) {
			throw new ServiceException("ResourceNotFoundException", e);
		} catch (PropertiesIOException e) {
			throw new ServiceException("PropertiesIOException", e);
		}

		return config_;
	}
	
	/**
	 * Metodo que actualiza el db.properties
	 * 
	 * @param pConfig			Instancia de la clase DBConfig que contiene los datos a actualizar
	 * @throws ServiceException
	 */
	public void actualizarDBConfig(DBConfig pConfig) throws ServiceException{
		
//		LOG_PROP_DAO propDao_ = null;
//		LOG_PROP_Imp prope_ = null;
		String nombre_ = "";
		
		try {
						
			PropertiesManager prop_ = new PropertiesManager("","db.properties");
			String name_ = pConfig.getNOMBRE();
//			if(!(name_.equals("inarch"))){
//				nombre_ = name_ + ".";
//			}else{
//				name_ = "";
//			}
			nombre_ = name_ + ".";
			
			// Se actualiza el db.properties
			prop_.writeProperty(nombre_ + "user", pConfig.getLOGIN());
			prop_.writeProperty(nombre_ + "password", pConfig.getPASSWORD());
			prop_.writeProperty(nombre_ + "dburl", pConfig.getURL());
			prop_.writeProperty(nombre_ + "driver", pConfig.getDRIVER());
			
			resetConnex(pConfig, name_);
			
//			// Se inserta el log 
//			propDao_ = (LOG_PROP_DAO)DAOLocator.getDAO(LOG_PROP_DAO.class);
//			
//			long time_ = System.currentTimeMillis();
//			Timestamp hoy_ = new Timestamp(time_);
//			prope_.setACTUDATE(hoy_);
//			prope_.setID_USER(new Integer(idUser_));
//			prope_.setCONXNAME(name_);
//			
//			propDao_.insert(prope_);
		
		} catch (ResourceNotFoundException e) {
			throw new ServiceException("ResourceNotFoundException", e);
		} catch (PropertiesIOException e) {
			throw new ServiceException("PropertiesIOException", e);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		}
//		} catch (DAOClassNotFoundException e) {
//			throw new ServiceException("DAOClassNotFoundException", e);
//		} catch (DAOCreationException e) {
//			throw new ServiceException("DAOCreationException", e);
//		} catch (ConnectionFailedException e) {
//			throw new ServiceException("ConnectionFailedException", e);
//		} catch (DBAccessException e) {
//			throw new ServiceException("DBAccessException", e);
	}
	
	/**
	 * Actualiza la conexión con los nuevos parámetros del properties
	 * 
	 * @param pConfig					Instancia de la clase DBConfig que contiene los datos a actualizar
	 * @throws ConnectionFailedException
	 */
	public void resetConnex(DBConfig pConfig, String pConnection) throws ConnectionFailedException{

		ConnectionPool conPool_ = PoolFactory.getPool(pConnection);
		ConnectionConfig conConfig_ = conPool_.getConfig();
		
		conConfig_.setUserName(pConfig.getLOGIN());
		conConfig_.setPassword(pConfig.getPASSWORD());
		conConfig_.setUrl(pConfig.getURL());
		conConfig_.setDriver(pConfig.getDRIVER());
		
		conPool_.setConfig(conConfig_);
		
	}
	
	/**
	 * Retorna el valor asociado al parametro 
	 * 
	 * @param pParam			String que representa el parametro a buscar
	 * @return					String que representa el valor
	 * @throws ServiceException
	 */
	public String getParam(String pParam) throws ServiceException{
		
		PCONFIG conf_ = null;
		PCONFIG_DAO confDao_ = null;
		List res_ = null;
		String valor_ = "";
		
		try {
			confDao_ = (PCONFIG_DAO) DAOLocator.getDAO(PCONFIG_DAO.class);
			
			conf_ = new PCONFIG_Imp();		
			conf_.setNOMBRE(pParam);
			
			res_ = confDao_.selectVO(conf_);
			
			if(res_ != null && !(res_.isEmpty())){
				conf_ = (PCONFIG) res_.get(0);
				valor_ = conf_.getVALOR();
			}
			
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DAOClassNotFoundException e) {
			throw new ServiceException("DAOClassNotFoundException", e);
		} catch (DAOCreationException e) {
			throw new ServiceException("DAOCreationException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
		
		return valor_;
	}
	
	/**
	 * Verifica si el login que llega existe o no
	 * 
	 * @param pLogin			Login del usuario a buscar
	 * @return					true si el usuario existe
	 * 							false si el usuario no existe
	 * @throws ServiceException
	 */
	public boolean existeUsuario(String pLogin) throws ServiceException{
		
		USUARIO_DAO userDao_ = null;
		USUARIO_Imp user_ = null;
		List res_ = null;
		
		try {
			
			userDao_ = (USUARIO_DAO)DAOLocator.getDAO(USUARIO_DAO.class);
			user_ = new USUARIO_Imp();
			user_.setLOGIN(pLogin);
			
			res_ = userDao_.selectVO(user_);
			
			if(res_!=null && !(res_.isEmpty())){
				return true;
			}
		
		} catch (DAOClassNotFoundException e) {
			throw new ServiceException("DAOClassNotFoundException", e);
		} catch (DAOCreationException e) {
			throw new ServiceException("DAOCreationException", e);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}

		return false;
	}
	
	/** Prueba una conección a la BD dados los parámetros
	 * 
	 * @author PEGR
	 * @param pVo objeto con los parámetros de conexión
	 * @return String con el resultado de la conexión
	 */
	public String testConnection(DBConfig pVo){
		String result_ = "La conexión fue exitosa con los datos suministrados.";
		Connection conn_ = null;
		String nombre_ = "";
		try{	
//			if (!pVo.getNOMBRE().equalsIgnoreCase("inarch")){
				nombre_ = pVo.getNOMBRE();
//			}
			conn_ = createConnection(pVo);
			Statement stmt_ = conn_.createStatement();
			PropertiesManager prop_ = new PropertiesManager("","db.properties");
			String consulta_ = prop_.readProperty("TesterSqlStatement");	
			stmt_.	executeQuery(consulta_);
			stmt_.close();
		}catch(ResourceNotFoundException rnfe){
			result_ = "Falló al encontrar el archivo de configuración.";
		}catch(PropertiesIOException pioe){
			result_ = "Falló al leer del archivo de configuración.";
		}catch(SQLException sqle){
			result_ = "Ocurrió un error al establecer la conexión con los datos suministrados: "+ sqle.getMessage();
		}finally{
			if (conn_ != null)
				try{
					PoolFactory.getPool(nombre_).returnConnection(conn_);
				}catch(Exception e){
					
				}
				
		}
		return result_;
	}

	/** Retorna una conexión
	 * @param pVo
	 */
	private Connection createConnection(DBConfig pVo) 
	throws SQLException{

		Connection conn_ = null;
		String nombre_ = "";
		DBConfig configOld_ = new DBConfig_Imp();
		
		try{
//				if (!pVo.getNOMBRE().equalsIgnoreCase("inarch")){
					nombre_ = pVo.getNOMBRE();
					configOld_ = getInfoDB(nombre_+".");
//				} else {
//					configOld_ = getInfoDB(nombre_);
//				}
				configOld_.setNOMBRE(pVo.getNOMBRE());
				//actualiza el config_
				actualizarDBConfig(pVo);
			
				ConnectionPool pool_ = PoolFactory.getPool(nombre_);
				pool_.closePool();
				pool_ = PoolFactory.getPool(nombre_);
				conn_ = pool_.getConnection();
				
	
		}catch(Throwable e){
			throw new SQLException(e.getLocalizedMessage());
		}finally{
			try{
				actualizarDBConfig(configOld_);
			}catch(Exception e){
				throw new SQLException(e.getLocalizedMessage());
			}
			
		}
		return conn_;
	}



	public void logAcciones( USUARIO pUsuario, String pOptionId ) throws ServiceException{

		ArrayList list_ = new ArrayList();
		LOG_OPTS log_ = new LOG_OPTS_Imp();
		//USUARIO user_ = (USUARIO)pRequest.getSession().getAttribute("s_usuario");
		
		if (pUsuario !=null){
			
			log_.setID_USR(pUsuario .getID());
			log_.setTIME(new Timestamp(new java.util.Date().getTime()));
			log_.setID_OPTS(new Integer(pOptionId));
			//log_.setDESCRIP("Algo");
			list_.add(log_);

				
			insertLogAcciones(list_);
							

		}
	}	
	
}
