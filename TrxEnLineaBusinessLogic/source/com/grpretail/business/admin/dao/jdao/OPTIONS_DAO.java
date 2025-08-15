package com.grpretail.business.admin.dao.jdao;

import java.util.List;

import org.ramm.jwaf.patterns.dao.AbstractDAO;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.grpretail.business.admin.vo.OPTIONS;

public interface OPTIONS_DAO extends AbstractDAO {

	 public int delete(OPTIONS pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(OPTIONS pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public OPTIONS findByPK(OPTIONS pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(OPTIONS pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(OPTIONS pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(OPTIONS pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(OPTIONS pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(OPTIONS pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;



}