/*
 * Proyecto: Liberty Sistema de Encuestas
 *
 * Copyright (C) 2005-2006 Asic S.A. Bogotá, Colombia.
 * All rights Reserved.
 * $Id:
 *
 */
package com.asic.transacciones.delegate;

import java.util.List;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceProvider;
import com.asic.transacciones.exception.InvalidAccessException;
import com.asic.transacciones.exception.UserUnknowException;
import com.asic.transacciones.vo.USUARIO;


/**
 * Servicios para Administracion de Usuarios
 *
 * @author Luis M
 */
public interface AdminUsuariosBusinessDelegate extends ServiceProvider{
	
	/**
	 * Crea un usuario en el sistema
	 * 
	 * @param 						<code>pUser</code> Objeto USUARIO con la información necesaria para la busqeuda
	 * @throws						<code>ServiceException</code> es lanzada si un error ocurre
	 */
	public USUARIO createUsuario(USUARIO pUser) throws ServiceException;
	
	/**
	 * Elimina un registro de la tabla USUARIO
	 * 
	 * @param 						<code>pParser</code> Lista con los usuarios a eliminar
	 * @throws						<code>ServiceException</code> es lanzada si un error ocurre
	 */
	public void deleteDatosUsuario(List pUsuario) throws ServiceException;

	/**
	 * Retorna una lista con toda la informacion de la tabla USUARIO
	 * 
	 * @return						<code>List</code> Lista con la información de la tabla USUARIO
	 * @throws						<code>ServiceException</code> es lanzada si un error ocurre
	 */
	public List getDatosUsuario() throws ServiceException;

	/**
	 * Actualiza los datos  de la tabla USUARIO
	 * 
	 * @param 						<code>pUsuario</code> Objeto de la clase USUARIO con la informacióna actualizar
	 * @throws						<code>ServiceException</code> es lanzada si un error ocurre
	 */
	public void updateDatosUsuario(USUARIO pUsuario) throws ServiceException;
	
    /**
     * Retorna los datos del usuario a partir de la información suministrada
     *
     * @param 						<code>pUser</code> Objeto de la clase USUARIO con la información a buscar
     * @return 						<code>USUARIO</code> Objeto de la clase USUARIO
     * @throws 						<code>UserUnknowException</code> es lanzada cuando el usuario es desconocido 
     * @throws						<code>ServiceException</code> es lanzada si un error ocurre
     */
    public USUARIO getUsuario(USUARIO pUser)
        throws UserUnknowException, ServiceException;

	/**

    /**
     * Actualiza los datos de un usuario
     *
     * @param 						<code>pUser</code> Objeto de la clase USUARIO con la información a actualizar
     * @return 						<code>int</code> Cantidad de registros actualizados
 	 * @throws 						<code>UserUnknowException</code> es lanzada cuando el usuario es desconocido 
     * @throws						<code>ServiceException</code> es lanzada si un error ocurre
     */
    public int updateUsuario(USUARIO pUser)
        throws UserUnknowException, ServiceException;


	/**
	 * Valida si el usuario tiene acceso a la opción dada.
	 * 
	 * @param 						<code>pUser</code> Objeto USUARIO con la información a buscar 
	 * @param 						<code>pIdOpcion</code> int con el valor de la opción
	 * @throws 						<code>InvalidAccessException</code> es lanzada cuando el acceso no es válido
	 * @throws						<code>ServiceException</code> es lanzada si un error ocurre
	 */
    public void autorizarUsuario(USUARIO pUser, int pIdOpcion)
        throws InvalidAccessException, ServiceException;

}
