package com.grpretail.business.admin.dao.jdao;

import java.util.List;

import org.ramm.jwaf.patterns.dao.AbstractDAO;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.grpretail.business.admin.vo.MENSXPRF;

public interface MENSXPRF_DAO extends AbstractDAO {

	 public int delete(MENSXPRF pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(MENSXPRF pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public MENSXPRF findByPK(MENSXPRF pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(MENSXPRF pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(MENSXPRF pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(MENSXPRF pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(MENSXPRF pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(MENSXPRF pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;



}