/*
 * Created on Aug 26, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.framework.helpers;

import java.util.Hashtable;
import java.util.StringTokenizer;

import org.apache.struts.action.ActionMapping;
import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceLocator;
import com.asic.framework.factory.ServiceProvider;
import com.grpretail.trxonline.reportes.TransaccionBusinessDelegate;

/**
 * DOCUMENT ME!
 *
 * @author ramm To change the template for this generated type comment go to
 *         Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and
 *         Comments
 */
public class AbstractHelper {
	/**
	 * JDOC Method Def
	 *
	 * @param pClass DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ServiceException DOCUMENT ME!
	 */
	protected Object getVO(Class pClass) throws ServiceException {
		return ServiceLocator.getVO(pClass);
	}

	/**
	 * JDOC Method Def
	 *
	 * @param pClassService DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 *
	 * @throws ServiceException DOCUMENT ME!
	 */
	protected ServiceProvider getService(Class pClassService)
		throws ServiceException {
		ServiceProvider service_ = null;

		service_ = ServiceLocator.getService(pClassService);

		return service_;
	}

	/**
	 * Retorna los parametros definidos en un action
	 *
	 * @param pParameters
	 *
	 * @return Hashtable con los parametros en formato llave,valor
	 */
	private Hashtable getActionParams(String pParameters) {
		StringTokenizer tokens_ = new StringTokenizer(pParameters, ";");
		Hashtable actionParams_ = new Hashtable();

		while (tokens_.hasMoreElements()) {
			String pair_ = (String) tokens_.nextElement();
			String key_ = pair_.substring(0, pair_.indexOf("="));
			String value_ =
				pair_.substring(pair_.indexOf("=") + 1, pair_.length());
			actionParams_.put(key_, value_);
		}

		return actionParams_;
	}

	/**
	 * JDOC Method Def
	 *
	 * @param pMap DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public Hashtable getActionParams(ActionMapping pMap) {
		return getActionParams(pMap.getParameter());
	}

	/**
	 * JDOC Method Def
	 *
	 * @param pMap DOCUMENT ME!
	 * @param pKey DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	public String getParameter(ActionMapping pMap, String pKey) {
		return (String) getActionParams(pMap).get(pKey);
	}

/*	protected VinculacionIntermediariosBusinessDelegate getVinculacionIntermediariosService()
		throws ServiceException {
		
		try {
			return (VinculacionIntermediariosBusinessDelegate) getService(
				VinculacionIntermediariosBusinessDelegate.class);
		} catch (ServiceException e) {
			LogWriter.getLog().log(this,LogWriter.WARNING,"getVinculacionIntermediariosService: ex",e);
			throw e;
		}

		
	}*/
	
	//TablasMaestro
	
/*	protected TablasMaestroBusinessDelegate getTablasMaestroService()
			throws ServiceException {
		
			try {
				return (TablasMaestroBusinessDelegate) getService(
				TablasMaestroBusinessDelegate.class);
			} catch (ServiceException e) {
				LogWriter.getLog().log(this,LogWriter.WARNING,"getTablasMaestroService: ex",e);
				throw e;
			}

		
		}*/
	protected TransaccionBusinessDelegate getTransaccionService() throws ServiceException {
		TransaccionBusinessDelegate service_ = null;
		try {
			service_ = (TransaccionBusinessDelegate) getService(TransaccionBusinessDelegate.class);
		} catch (ServiceException e) {
			LogWriter.getLog().log(this, LogWriter.WARNING,
				"getClienteService: ex", e);
			throw e;
		}
		return service_;
	}
}
