/*
 * Proyecto: ASIC Admin Usuarios
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogot�, Colombia.
 * All riths Reserved.
 *
 * $Id: AdminUsuariosFacadeAdapter.java,v 1.1 2019/12/18 17:08:59 Alfonso Exp $
 *
 */
package com.asic.transacciones.facade;

import java.sql.Date;
import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.bean.AdminUsuariosBean;
import com.asic.transacciones.delegate.AdminUsuariosBusinessDelegate;
import com.asic.transacciones.exception.InvalidAccessException;
import com.asic.transacciones.exception.UserUnknowException;
import com.asic.transacciones.vo.USUARIO;


/**
 * JDOC Class Def
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class AdminUsuariosFacadeAdapter implements AdminUsuariosBusinessDelegate {

	/* (non-Javadoc)
	 * @see com.asic.admin.AdminGenListsBusinessDelegate#deleteDatosUsuario(com.asic.admin.vo.USUARIO)
	 */
	public void deleteDatosUsuario(List pUsuario) throws ServiceException {
		AdminUsuariosBean adminGenBean_ = new AdminUsuariosBean();
		
		adminGenBean_.deleteDatosUsuario(pUsuario);
	}

	/* (non-Javadoc)
	 * @see com.asic.admin.AdminGenListsBusinessDelegate#getDatosUsuario()
	 */
	public List getDatosUsuario() throws ServiceException {
		AdminUsuariosBean adminGenBean_ = new AdminUsuariosBean();
		
		return adminGenBean_.getDatosUsuario();
	}

	/* (non-Javadoc)
	 * @see com.asic.admin.AdminGenListsBusinessDelegate#updateDatosUsuario(com.asic.admin.vo.USUARIO)
	 */
	public void updateDatosUsuario(USUARIO pUsuario) throws ServiceException {
		AdminUsuariosBean adminGenBean_ = new AdminUsuariosBean();
		
		adminGenBean_.updateDatosUsuario(pUsuario);
	}

/**
 * 
 */
   public void addLista() {
        // TODO Ap�ndice de m�todo generado autom�ticamente
    }

/**
 * 
 */
    public void autorizarUsuario(USUARIO pUser)
        throws InvalidAccessException, ServiceException {
        // TODO Ap�ndice de m�todo generado autom�ticamente
    }

/**
 * 
 */
    public void getLista(Date pFechaInicial, Date pFechaFinal) {
        // TODO Ap�ndice de m�todo generado autom�ticamente
    }

/**
 * 
 */
    public void getListaMensajes(Integer pInit) {
        // TODO Ap�ndice de m�todo generado autom�ticamente
    }

/**
 * 
 */
    public void updateMensajes(String pMensaje) {
        // TODO Ap�ndice de m�todo generado autom�ticamente
    }

/**
 * 
 */
    public USUARIO getUsuario(USUARIO pUser)
        throws UserUnknowException, ServiceException {
        	
		AdminUsuariosBean adminGenBean_ = new AdminUsuariosBean();
        return adminGenBean_.getUsuario(pUser);
        
    }

/**
 * 
 */
    public int updateUsuario(USUARIO pUser)
        throws UserUnknowException, ServiceException {
        	
		AdminUsuariosBean adminGenBean_ = new AdminUsuariosBean();		
        return adminGenBean_.updateUsuario(pUser);
        
    }
    

	/**
	 * 
	 * 
	 */
	public USUARIO createUsuario(USUARIO pUser) throws ServiceException {
		AdminUsuariosBean adminGenBean_ = new AdminUsuariosBean();
		
		return adminGenBean_.createUsuario(pUser);
	}
		
	/**
	 *
	 *
	 */
	public void autorizarUsuario(USUARIO pUser, int pIdOpcion) throws InvalidAccessException, ServiceException {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}
	
	
	/**
	 * Retorna una lista con toda la informacion de la tabla USUARIO
	 * 
	 * @return
	 * @throws ServiceException
	 */
	public List buscarUsuarios(USUARIO pUser, int pPosIni, int pPosFin) throws ServiceException{
		AdminUsuariosBean adminGenBean_ = new AdminUsuariosBean();
		
		return adminGenBean_.buscarUsuarios(pUser, pPosIni, pPosFin);
		
	}

}
