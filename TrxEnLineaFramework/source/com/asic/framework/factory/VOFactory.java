/*
 * Creado el Apr 20, 2004
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generaci�n de c�digo&gt;C�digo y comentarios
 */
package com.asic.framework.factory;

import com.asic.framework.exception.ServiceException;


/**
 * DOCUMENT ME!
 *
 * @author ramm Para cambiar la plantilla para este comentario de tipo generado
 *         vaya a Ventana&gt;Preferencias&gt;Java&gt;Generaci�n de
 *         c�digo&gt;C�digo y comentarios
 */
public interface VOFactory {
    /**
     * M�todo que retorna un objeto que representa una instancia de una clase
     *
     * @param String className
     *
     * @return Object
     *
     * @throws ServiceException
     */
    public Object getInstance(Class pClass) throws ServiceException;
}
