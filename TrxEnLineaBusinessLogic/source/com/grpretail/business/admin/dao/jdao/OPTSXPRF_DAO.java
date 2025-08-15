package com.grpretail.business.admin.dao.jdao;

import java.util.List;

import org.ramm.jwaf.patterns.dao.AbstractDAO;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.grpretail.business.admin.vo.OPTSXPRF;

public interface OPTSXPRF_DAO extends AbstractDAO {

	 public int delete(OPTSXPRF pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(OPTSXPRF pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public OPTSXPRF findByPK(OPTSXPRF pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(OPTSXPRF pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(OPTSXPRF pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(OPTSXPRF pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(OPTSXPRF pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(OPTSXPRF pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;



}