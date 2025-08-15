package com.grpretail.business.admin.dao.jdao;

import java.util.List;

import org.ramm.jwaf.patterns.dao.AbstractDAO;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.grpretail.business.admin.vo.LOG_PROP;

public interface LOG_PROP_DAO extends AbstractDAO {

	 public int delete(LOG_PROP pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(LOG_PROP pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public LOG_PROP findByPK(LOG_PROP pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(LOG_PROP pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(LOG_PROP pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(LOG_PROP pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(LOG_PROP pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(LOG_PROP pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;



}