package com.grpretail.business.admin.dao.jdao;

import java.util.List;

import org.ramm.jwaf.patterns.dao.AbstractDAO;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.grpretail.business.admin.vo.TIPO;

public interface TIPO_DAO extends AbstractDAO {

	 public int delete(TIPO pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TIPO pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public TIPO findByPK(TIPO pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TIPO pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TIPO pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TIPO pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TIPO pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TIPO pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;



}