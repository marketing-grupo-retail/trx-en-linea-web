/*
 * Proyecto: ASICG
 * 
 * Copyright (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * All rights Reserved.
 * 
 * Id:
 * 
 */
package com.asic.transacciones.bean;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.ramm.jwaf.dbutil.DBUtil;
import org.ramm.jwaf.patterns.dao.DAOClassNotFoundException;
import org.ramm.jwaf.patterns.dao.DAOCreationException;
import org.ramm.jwaf.patterns.dao.DAOLocator;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.resources.ApplicationConfigFacadeAdapter;
import com.asic.framework.resources.ApplicationResources;
import com.asic.security.PasswordService;
import com.asic.security.SystemUnavailableException;
import com.asic.transacciones.dao.USUARIO_DAO;
import com.asic.transacciones.exception.UserUnknowException;
import com.asic.transacciones.vo.USUARIO;
import com.asic.transacciones.vo.USUARIO_Imp;

/**
 * @author ramm
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class AdminUsuariosBean  {

	private ApplicationConfigFacadeAdapter adapter_;

	/**
	 * Elimina un registro de la tabla USUARIO
	 * 
	 * @param pParser
	 * @throws ServiceException
	 */
	public void deleteDatosUsuario(List pUsuario) throws ServiceException{
		
		USUARIO_DAO usuarioDao_ = null;
		USUARIO_Imp usuario_ = null;
		List res_ = null;
		Integer idUser_;
		  
		try {
			usuarioDao_ = (USUARIO_DAO)DAOLocator.getDAO(USUARIO_DAO.class);
			long time_ = System.currentTimeMillis();
			Timestamp ts_ = new Timestamp(time_);
	
			for (Iterator iter = pUsuario.iterator(); iter.hasNext();) {
				idUser_ = (Integer) iter.next();
				usuario_ = new USUARIO_Imp();
				usuario_.setID(idUser_);
				res_ = usuarioDao_.selectVO(usuario_);
				// si el usuario tiene un estado distinto a E se coloca la fecha
				if(!((((USUARIO)res_.get(0)).getESTADO()).equals("E"))){
					usuario_.setESTADO("E");
					usuario_.setRETIDATE(ts_);
					// Se actualiza la informacion del usuario
					usuarioDao_.update(usuario_);
					// Se le eliminan las asociaciones que tenga con el despacho
					// de correos para la funcionalidad de documentos
	//				eliminarUsuarioCorreo(idUser_);
				}
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

	/**
	 * Retorna una lista con toda la informacion de la tabla USUARIO
	 * 
	 * @return List
	 * @throws ServiceException
	 */
	public List getDatosUsuario() throws ServiceException{
		
		List res_ = null;
		adapter_ = new ApplicationConfigFacadeAdapter();
		USUARIO_Imp element = null;
		  
		try {
			res_ = DBUtil.select("*",
					adapter_.getAsicGOwner() + "USUARIO USER",
					"",
					USUARIO_Imp.class,
					ApplicationResources.ASICG_DB);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
		
		return res_;
	}

	/**
	 * Actualiza los datos  de la tabla USUARIO
	 * 
	 * @param pParser
	 * @throws ServiceException
	 */
	public void updateDatosUsuario(USUARIO pUsuario) throws ServiceException{
		
		USUARIO_DAO usuarioDao_ = null;
		USUARIO_Imp userObj_ = null;
	/*	DSPEMAIL_DAO dspDao_ = null;
		DSPEMAIL_Imp dspObj_ = null;
	*/	String estado_ = pUsuario.getESTADO();
		if(estado_.equals("E")){
			throw new ServiceException("El usuario ya esta eliminado, no se puede editar") ;
		}
		
		try {
			usuarioDao_ = (USUARIO_DAO)DAOLocator.getDAO(USUARIO_DAO.class);
			
			// se busca el mail del usuario al cual se le esta actualizando la informacion
			userObj_ = new USUARIO_Imp();
			userObj_.setLOGIN(pUsuario.getLOGIN());
			List res_ = usuarioDao_.selectVO(userObj_);
	
			// si no hay conflicto entonces se actualiza la informacion del usuario
			usuarioDao_.update(pUsuario);
				
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
	 * Inserta un nuevo usuario y lo retorna
	 * 
	 * @param pUser
	 * @return
	 * @throws ServiceException
	 */
	public USUARIO createUsuario(USUARIO pUser) throws ServiceException {
		
		try {
			String newLogin_ = pUser.getLOGIN();
			USUARIO_Imp user_ = new USUARIO_Imp();
			user_.setLOGIN(newLogin_);
			
			USUARIO_DAO userDao_ = (USUARIO_DAO)DAOLocator.getDAO(USUARIO_DAO.class);
			
			List res_ = userDao_.selectVO(user_);
			
			if(res_== null || res_.isEmpty()){
				userDao_.insert(pUser);
			} else{
				throw new ServiceException(user_.getLOGIN(),"module_usuario.usuarioExistente",null);
			}
			
			res_ = userDao_.selectVO(pUser);
			
			pUser = (USUARIO)res_.get(0);
			
		} catch (DAOClassNotFoundException e) {
			throw new ServiceException("DAOClassNotFoundException", e);
		} catch (DAOCreationException e) {
			throw new ServiceException("DAOCreationException", e);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
		
		return pUser;
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param pUser
	 *
	 * @return
	 *
	 * @throws UserUnknowException
	 * @throws ServiceException
	 */
	public USUARIO getUsuario(USUARIO pUser)
		throws UserUnknowException, ServiceException {
		try {
			USUARIO_DAO userDao_ = (USUARIO_DAO) DAOLocator.getDAO(USUARIO_DAO.class);

			List list_ = userDao_.selectVO(pUser);

			if ((list_ == null) || (list_.size() <= 0)) {
				throw new UserUnknowException();
			}

			USUARIO user_ = (USUARIO) list_.get(0);

			return user_;
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
	 * DOCUMENT ME!
	 *
	 * @param pUser
	 *
	 * @return
	 *
	 * @throws ServiceException
	 */
	public int updateUsuario(USUARIO pUser) throws ServiceException {
		try {
			USUARIO_DAO userDao_ = (USUARIO_DAO) DAOLocator.getDAO(USUARIO_DAO.class);
			
			String passwd_ = pUser.getPASSWORD();
			passwd_ = PasswordService.getInstance().encrypt(passwd_);
			pUser.setPASSWORD(passwd_);
			
			return userDao_.update(pUser);
            
		} catch (DAOClassNotFoundException e) {
			throw new ServiceException("DAOClassNotFoundException", e);
		} catch (DAOCreationException e) {
			throw new ServiceException("DAOCreationException", e);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		} catch (SystemUnavailableException e) {
			throw new ServiceException("SystemUnavailableException", e);
		}
	}	

	
	/**
	 * Retorna una lista con toda la informacion de la tabla USUARIO
	 * 
	 * @return
	 * @throws ServiceException
	 */
	public List buscarUsuarios(USUARIO pUser, int pPosIni, int pPosFin) throws ServiceException{
		
		List res_ = null;
		adapter_ = new ApplicationConfigFacadeAdapter();
		String nombreE_ = "";
		USUARIO_Imp element = null;
		
		String login_ = tratarComillas(pUser.getLOGIN());
		if(login_==null){
			login_ = "";
		}
		String name_ = tratarComillas(pUser.getNOMBRE());
		if(name_==null){
			name_ = "";
		}
		String apellido_ = tratarComillas(pUser.getAPELLIDO());
		if(apellido_==null){
			apellido_ = "";
		}
		
	
		String setEstado_ = pUser.getESTADO();
		String estado_ = "";
		if(setEstado_ != null){
			estado_ = "USUARIO.ESTADO='" + setEstado_ + "' AND ";
		}

		try {
			res_ = DBUtil.select("USUARIO.*, UPPER(USUARIO.APELLIDO) UPPERAP ",
					adapter_.getAsicGOwner() + "USUARIO USUARIO",
					 estado_ + 
						"UPPER(USUARIO.LOGIN) LIKE '" + login_.toUpperCase() + "%' AND " +
						"UPPER(USUARIO.NOMBRE) LIKE '" + name_.toUpperCase() + "%' AND " +
						"UPPER(USUARIO.APELLIDO) LIKE '" + apellido_.toUpperCase() + "%' ",
						//PEGR: 12/10/2004 Ordena por apellido
						" ORDER BY UPPERAP ASC ",
					USUARIO_Imp.class,
					ApplicationResources.ASICG_DB,
					pPosIni, pPosFin );
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
		
		return res_;
	}
	

	
	/**
	 * @param string
	 * @return
	 */
	private String tratarComillas(String string) {
		String res_ = null;
		if (string!=null){
			StringBuffer sb_ = new StringBuffer(500);
			StringTokenizer st_ = new StringTokenizer(string, "'", true);
			for (int i = 0; i < st_.countTokens(); i++){
				String temp_ = st_.nextToken();
				sb_.append(temp_);
				if (temp_.equals("'"))
					sb_.append("'");
			}
			if (sb_.length()>1 && !sb_.substring(sb_.length()-2, sb_.length() - 1).equals("''")){
			//	sb_.deleteCharAt(sb_.length()-1);
			}else{
				if (sb_.length()!=1) sb_.append(string);
			}
			res_ = sb_.toString();
		}
		return res_;
	}

}