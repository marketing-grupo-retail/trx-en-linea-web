/*
 * Created on Mar 7, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.bean;

import java.util.List;

import org.ramm.jwaf.dbutil.DBUtil;
import org.ramm.jwaf.logger.LogWriter;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.resources.ApplicationConfigFacadeAdapter;
import com.asic.framework.resources.ApplicationResources;
import com.asic.transacciones.vo.ORGMSTEE_Imp;

/**
 * @author Kcadena
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ConsultasComunesBean {
	
	private ApplicationConfigFacadeAdapter adapter_;

	public List getAlmacen() throws ServiceException {
		adapter_ = new ApplicationConfigFacadeAdapter();
		try { List lAlm_= DBUtil.select("to_char(ORG.ORG_LVL_NUMBER) ORG_LVL_NUMBER , ORG.ORG_NAME_FULL", 
									 	adapter_.getDBUniprodOwner() + "ORGMSTEE ORG", 
									 	" ORG.ORG_IS_STORE = 'T'"+
									 	" AND ORG.ORG_LVL_NUMBER NOT IN (72, 26, 98)",
									 	ORGMSTEE_Imp.class, ApplicationResources.UNIPROD_DB);
			return lAlm_;
		} catch (ConnectionFailedException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.connection_failed", e);
		} catch (DBAccessException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generic.dbaccess_failed", e);
		}

	}
}
