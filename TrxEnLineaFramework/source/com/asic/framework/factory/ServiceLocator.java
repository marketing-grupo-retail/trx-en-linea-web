/*
 * Proyecto: <Proyect Name>
 * 
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * All riths Reserved.
 * 
 * $Id: ServiceLocator.java,v 1.1 2019/12/18 17:24:41 Alfonso Exp $
 * 
 */
package com.asic.framework.factory;

import com.asic.framework.exception.ServiceException;

/**
 * <ASIC:Definicion de Clase>
 * 
 * <Ejemplo de Uso (opcional)> 
 * 
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class ServiceLocator {

	/**
	 * <ASIC:Descripcion de metodo>
	 * 
	 * @param class1
	 * @return
	 */
	public static ServiceProvider getService(Class pClassService) throws ServiceException {
		
		return BusinessDelegateFactoryAdapter.getInstanceImp().
			getService(pClassService.getName());
	}
	
	public static Object getVO(Class pClass) throws ServiceException {
	
		return BusinessDelegateFactoryAdapter.getInstanceImp()
			.createVOBusinessDelegate()
			.getInstance(pClass);
	}

}
