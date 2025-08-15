/*
 * Creado el Jun 20, 2005
 */
package com.asic.transacciones.helpers;

import java.security.PublicKey;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.ServletContext;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.helpers.AbstractHelper;
import com.asic.transacciones.delegate.AdminRechazosBusinessDelegate;
import com.asic.transacciones.delegate.MQAdminBusinessDelegate;
import com.asic.transacciones.util.Propiedad;

/**
 * @author admin
 */
public class ConversionParamHelper extends AbstractHelper {

	static ConversionParamHelper instancia;
	Hashtable params = new Hashtable();	
	Hashtable strings = new Hashtable();


	/**
	 * @return
	 */
	public static ConversionParamHelper getInstancia() {
		if (instancia == null)
		instancia = new ConversionParamHelper();
		return instancia;
	}



	/**
	 * @param hashtable
	 */
	public void setParams(ServletContext sc_) throws ServiceException {
		params = Propiedad.getInstance().getPropiedades(Propiedad.RESOURCE_BUNDLE_PARAMS);
		sc_.setAttribute("parametros_trx",params);
	}
	
	public void setStringsParams(ServletContext sc_) throws ServiceException {
		strings = Propiedad.getInstance().getPropiedadesValidacion(Propiedad.RESOURCE_BUNDLE_CFG);
		sc_.setAttribute("parametros_strings",strings);
	}
	


}
