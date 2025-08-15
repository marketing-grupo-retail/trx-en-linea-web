/*
 * Created on Mar 10, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.bean;

import java.util.Iterator;

import org.ramm.jwaf.dbutil.DBUtil;
import org.ramm.jwaf.jdao.TransactionDaoGroup;
import org.ramm.jwaf.logger.LogWriter;
import org.ramm.jwaf.patterns.dao.DAOLocator;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.resources.ApplicationConfigFacadeAdapter;
import com.asic.framework.resources.ApplicationResources;
import com.asic.transacciones.dao.TPOS_HEADER_DAO;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TPOS_HEADER;


/**
 * @author Kcadena
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ImportArchivosBean {
	private ApplicationConfigFacadeAdapter adapter_;
	TransactionDaoGroup group_ = null;
	
	public void insertHeader(TRANSACCION pVo) throws ServiceException {
		
		String campos_ = "OFFSETY, OFFSETX, STORE, TERMINAL, TRANSNUM, DAY, TIME, TRANSTYPE, NUMSTRIN,"+
						 "OPERATOR, PASSWORD, GROSSPOS, GROSSNEG, RINGTIME,  TENDERTI, SPECIAL, INACTIVE,"+
						 "INDICAT11, INDICAT12, INDICAT13, INDICAT14, INDICAT15, INDICAT16, INDICAT17,"+
						 "INDICAT18, INDICAT19, INDICAT110, INDICAT111, INDICAT112, INDICAT113, INDICAT114,"+
						 "INDICAT115, INDICAT116, INDICAT117, INDICAT118, INDICAT119, INDICAT120, INDICAT121, "+
						 "INDICAT122, INDICAT123, INDICAT124, INDICAT125, INDICAT126, INDICAT127, INDICAT128,"+
						 "INDICAT129, INDICAT130, INDICAT131, INDICAT132";
		
		/*for (Iterator iter = pVo.getHeader().iterator(); iter.hasNext();) {
			TPOS_HEADER vo_ = (TPOS_HEADER) iter.next();
			TPOS_HEADER_DAO daoHeader_ = (TPOS_HEADER_DAO) DAOLocator.getDAO(TPOS_HEADER_DAO.class);
			daoHeader_.insert(vo_, true);
		}*/
	}
	
}
