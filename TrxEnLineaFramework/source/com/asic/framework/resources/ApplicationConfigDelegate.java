/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * Id:
 *
 */
package com.asic.framework.resources;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceProvider;


/**
 * DOCUMENT ME!
 *
 * @author JuanR Para cambiar la plantilla para este comentario de tipo
 *         generado vaya a Ventana&gt;Preferencias&gt;Java&gt;Generación de
 *         código&gt;Código y comentarios
 */
public interface ApplicationConfigDelegate extends ServiceProvider {
    /**
     * Retorna la propiedad deseada
     *
     * @param String
     *
     * @return String
     */
    public abstract String get(String pName) throws ServiceException;

    /**
     * Retorna un boolean representando el valor de la propiedad
     *
     * @param String
     *
     * @return boolean
     */
    public abstract boolean getBool(String pName) throws ServiceException;



	public boolean isValidPort(String pPort) throws ServiceException;

}
