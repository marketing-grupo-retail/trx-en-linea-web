/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: ApplicationConfigFacadeAdapter.java,v 1.1 2019/12/18 17:09:00 Alfonso Exp $
 *
 */
package com.asic.framework.resources;

import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.ramm.jwaf.locator.FailedLocatingPropertiesFileException;
import org.ramm.jwaf.locator.ResourceLocator;
import org.ramm.jwaf.logger.LogWriter;
import org.ramm.jwaf.patterns.poolmanager.ConnectionConfig;
import org.ramm.jwaf.patterns.poolmanager.PoolFactory;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.resources.ApplicationConfigDelegate;
import com.asic.framework.resources.ApplicationResources;


/**
 * JDOC Class Def
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class ApplicationConfigFacadeAdapter implements ApplicationConfigDelegate {
    /**
     * Retorna la propiedad deseada
     *
     * @param pName
     *
     * @return String
     *
     * @throws ServiceException DOCUMENT ME!
     */
    public String get(String pName) throws ServiceException {
        try {
            return ResourceLocator.get(ApplicationResources.ASICG_FILE).getString(pName);
        } catch (MissingResourceException e) {
            LogWriter.getLog().log(LogWriter.SEVERE,
                "ApplicationResources.get:" + e.getMessage());
            throw new ServiceException("MissingResourceException", e);
        } catch (FailedLocatingPropertiesFileException e) {
            LogWriter.getLog().log(LogWriter.SEVERE,
                "ApplicationResources.get:" + e.getMessage());
            throw new ServiceException("FailedLocatingPropertiesFileException",
                e);
        }
    }

    /**
     * Retorna un boolean representando el valor de la propiedad
     *
     * @param pName
     *
     * @return boolean
     *
     * @throws ServiceException DOCUMENT ME!
     */
    public boolean getBool(String pName) throws ServiceException {
        //add:jcr: Adicione línea de return, ya que la otra siempre manda false
        //		return Boolean.getBoolean(get(pName));
        return ((new Boolean(get(pName))).booleanValue());
    }


	/**
	 * JDOC Method Def
	 *
	 * @return DOCUMENT ME!
	 */
	public String getAsicGOwner() {
		String owner_ = "";

		try {
			ConnectionConfig config_ = PoolFactory.getConfig(ApplicationResources.ASICG_DB);
			owner_ = config_.getOwner();
			if (!owner_.equals("")) {
				owner_ =owner_+".";
			}
		} catch (MissingResourceException e) {
			LogWriter.getLog().log(LogWriter.WARNING,
				"getAsicGOwner::" + e.getMessage());
		} catch (FailedLocatingPropertiesFileException e) {
			LogWriter.getLog().log(LogWriter.WARNING,
				"getAsicGOwner::" + e.getMessage());
		}

		return owner_;
	}

	/**
	 * JDOC Method Def
	 *
	 * @return DOCUMENT ME!
	 */
	/*public String getSKOwner() {
		String owner_ = "";

		try {
			ConnectionConfig config_ = PoolFactory.getConfig(ApplicationResources.SKCOLBKGEN_DB);
			owner_ = config_.getOwner();
			if (!owner_.equals("")) {
				owner_ =owner_+".";
			}
		} catch (MissingResourceException e) {
			LogWriter.getLog().log(LogWriter.WARNING,
				"getAsicGOwner::" + e.getMessage());
		} catch (FailedLocatingPropertiesFileException e) {
			LogWriter.getLog().log(LogWriter.WARNING,
				"getAsicGOwner::" + e.getMessage());
		}

		return owner_;
	}	*/

	/**
	 * JDOC Method Def
	 *
	 * @return DOCUMENT ME!
	 */
	public String getOwner() {
		String owner_ = "";

		try {
			ConnectionConfig config_ = PoolFactory.getConfig(ApplicationResources.ASICG_DB);
			owner_ = config_.getOwner();
			if (!owner_.equals("")) {
				owner_ =owner_+".";
			}
		} catch (MissingResourceException e) {
			LogWriter.getLog().log(LogWriter.WARNING,
				"getAsicGOwner::" + e.getMessage());
		} catch (FailedLocatingPropertiesFileException e) {
			LogWriter.getLog().log(LogWriter.WARNING,
				"getAsicGOwner::" + e.getMessage());
		}

		return owner_;
	}

	/**
	 * Valida si el puerto de acceso esta incluido dentro de los autorizados
	 * @return Si el puerto es valido o no
	 */
	public boolean isValidPort(String pPort) throws ServiceException {

		if (pPort == null) {
			LogWriter.getLog().log(this,LogWriter.WARNING,"Port NULL");
			return false;
		}

		String valor_ = get(ApplicationResources.APP_PORTS);
		// Se separa la cadena por las comas(,)
		StringTokenizer sToken_ = new StringTokenizer(valor_, ",");

		while (sToken_.hasMoreTokens()) {
			String port_ = sToken_.nextToken();

			if (port_.equals(pPort)) {
				return true;
			}
		}

		return false;
	}
	
	public String getDBTrxOnlineOwner() {
			String owner_ = "";

			try {
				ConnectionConfig config_ = PoolFactory.getConfig(ApplicationResources.TXONLINE_DB);
				owner_ = config_.getOwner();
				if (!owner_.equals("")) {
					owner_ =owner_+".";
				}
			} catch (MissingResourceException e) {
				LogWriter.getLog().log(LogWriter.WARNING,
					"getTrxOnlineDB::" + e.getMessage());
			} catch (FailedLocatingPropertiesFileException e) {
				LogWriter.getLog().log(LogWriter.WARNING,
					"getTrxOnlineDB::" + e.getMessage());
			}

			return owner_;
		}
		
	public String getDBUniprodOwner() {
				String owner_ = "";

				try {
					ConnectionConfig config_ = PoolFactory.getConfig(ApplicationResources.UNIPROD_DB);
					owner_ = config_.getOwner();
					if (!owner_.equals("")) {
						owner_ =owner_+".";
					}
				} catch (MissingResourceException e) {
					LogWriter.getLog().log(LogWriter.WARNING,
						"getDBUniprodOwner::" + e.getMessage());
				} catch (FailedLocatingPropertiesFileException e) {
					LogWriter.getLog().log(LogWriter.WARNING,
						"getDBUniprodOwner::" + e.getMessage());
				}

				return owner_;
			}

}
