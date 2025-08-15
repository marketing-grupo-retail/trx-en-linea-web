package com.grpretail.business.admin.dao.jdao;

import java.util.List;

import org.ramm.jwaf.patterns.dao.AbstractDAO;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.grpretail.business.admin.vo.LOG_REP;

public interface LOG_REP_DAO extends AbstractDAO {

	 public int delete(LOG_REP pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(LOG_REP pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public LOG_REP findByPK(LOG_REP pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(LOG_REP pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(LOG_REP pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(LOG_REP pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(LOG_REP pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(LOG_REP pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;



}