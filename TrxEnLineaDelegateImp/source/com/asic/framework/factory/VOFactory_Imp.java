/*
 * Creado el 15/04/2004
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.framework.factory;

import com.asic.framework.exception.ServiceException;


/**
 * DOCUMENT ME!
 *
 * @author JuanR Clase que instancia una clase a partir de un nombre dado
 */
public class VOFactory_Imp implements VOFactory {
    /**
     * Método que retorna un objeto que representa una instancia de una clase
     *
     * @param pClass className
     *
     * @return Object
     *
     * @throws ServiceException
     */
    public Object getInstance(Class pClass) throws ServiceException {
        try {
            String name_ = pClass.getName() + "_Imp";
            Class impClass_ = Class.forName(name_);

            return impClass_.newInstance();
        } catch (InstantiationException e) {
            throw new ServiceException("InstantiationException", e);
        } catch (IllegalAccessException e) {
            throw new ServiceException("IllegalAccessException", e);
        } catch (ClassNotFoundException e) {
            throw new ServiceException("ClassNotFoundException", e);
        }

        // reintentar con creacion directa
    }
}
