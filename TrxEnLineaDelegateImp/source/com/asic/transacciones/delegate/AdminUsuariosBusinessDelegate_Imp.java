/*
 * Creado el 6/05/2004
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.transacciones.delegate;

import java.sql.Date;
import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.exception.InvalidAccessException;
import com.asic.transacciones.exception.UserUnknowException;
import com.asic.transacciones.facade.AdminUsuariosFacadeAdapter;
import com.asic.transacciones.vo.USUARIO;


/**
 * DOCUMENT ME!
 *
 * @author LuisL Para cambiar la plantilla para este comentario de tipo
 *         generado vaya a Ventana&gt;Preferencias&gt;Java&gt;Generación de
 *         código&gt;Código y comentarios
 */
public class AdminUsuariosBusinessDelegate_Imp
    implements AdminUsuariosBusinessDelegate {


    /* (non-Javadoc)
     * @see com.asic.admin.AdminGenListsBusinessDelegate#deleteDatosUsuario(com.asic.admin.vo.USUARIO)
     */
    public void deleteDatosUsuario(List pUsuario) throws ServiceException {
        AdminUsuariosFacadeAdapter facade_ = new AdminUsuariosFacadeAdapter();

        facade_.deleteDatosUsuario(pUsuario);
    }

    /* (non-Javadoc)
     * @see com.asic.admin.AdminGenListsBusinessDelegate#getDatosUsuario()
     */
    public List getDatosUsuario() throws ServiceException {
        AdminUsuariosFacadeAdapter facade_ = new AdminUsuariosFacadeAdapter();

        return getDatosUsuario();
    }

    /* (non-Javadoc)
     * @see com.asic.admin.AdminGenListsBusinessDelegate#updateDatosUsuario(com.asic.admin.vo.USUARIO)
     */
    public void updateDatosUsuario(USUARIO pUsuario) throws ServiceException {
        AdminUsuariosFacadeAdapter facade_ = new AdminUsuariosFacadeAdapter();

        facade_.updateDatosUsuario(pUsuario);
    }



    /* (no Javadoc)
     * @see com.asic.admin.AdminBusinessDelegate#autorizarUsuario(com.asic.admin.vo.USUARIO)
     */
    public void autorizarUsuario(USUARIO pUser, int pIdOpcion)
        throws InvalidAccessException, ServiceException {
        // TODO (P!) BSN:C7:LRM: Implementar autorizarUsuario
    }

    /**
     * @see com.asic.admin.AdminBusinessDelegate#getListaMensajes(java.lang.Integer)
     */
    public void getListaMensajes(Integer pInit) {
        // TODO Apéndice de método generado automáticamente
    }

    /**
     * @see com.asic.admin.AdminBusinessDelegate#updateMensajes(java.lang.String)
     */
    public void updateMensajes(String pMensaje) {
        // TODO Apéndice de método generado automáticamente
    }

    /**
     * @see com.asic.admin.AdminBusinessDelegate#getLista(java.sql.Date, java.sql.Date)
     */
    public void getLista(Date pFechaInicial, Date pFechaFinal) {
        // TODO Apéndice de método generado automáticamente
    }

    /**
     * @see com.asic.admin.AdminBusinessDelegate#addLista()
     */
    public void addLista() {
        // TODO Apéndice de método generado automáticamente
    }

    /**
     * @see com.asic.admin.AdminBusinessDelegate#getUsuario(com.asic.admin.vo.USUARIO)
     */
    public USUARIO getUsuario(USUARIO pUser) throws UserUnknowException, ServiceException {
        AdminUsuariosFacadeAdapter facade_ = new AdminUsuariosFacadeAdapter();
        return facade_.getUsuario(pUser);
    }

    /**
     * @see com.asic.admin.AdminBusinessDelegate#updateUsuario(com.asic.admin.vo.USUARIO)
     */
    public int updateUsuario(USUARIO pUser)
        throws UserUnknowException, ServiceException {
        AdminUsuariosFacadeAdapter facade_ = new AdminUsuariosFacadeAdapter();

        return facade_.updateUsuario(pUser);
    }


    /**
     * @see com.asic.admin.AdminUsuariosBusinessDelegate#createUsuario(com.asic.admin.vo.USUARIO)
     */
    public USUARIO createUsuario(USUARIO pUser) throws ServiceException {
		AdminUsuariosFacadeAdapter facade_ = new AdminUsuariosFacadeAdapter();

		return facade_.createUsuario(pUser);
    }

   
   /**
	* Retorna una lista con toda la informacion de la tabla USUARIO
	* 
	* @return
	* @throws ServiceException
	*/
   public List buscarUsuarios(USUARIO pUser, int pPosIni, int pPosFin) throws ServiceException{
		AdminUsuariosFacadeAdapter facade_ = new AdminUsuariosFacadeAdapter();
		
		return facade_.buscarUsuarios(pUser, pPosIni, pPosFin);
   }
   

}
