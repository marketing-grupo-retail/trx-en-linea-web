package com.grpretail.business.admin.dao.jdao;

import java.util.List;

import org.ramm.jwaf.patterns.dao.AbstractDAO;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.grpretail.business.admin.vo.MENSAJES;

public interface MENSAJES_DAO extends AbstractDAO {

	 public int delete(MENSAJES pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(MENSAJES pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public MENSAJES findByPK(MENSAJES pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(MENSAJES pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(MENSAJES pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(MENSAJES pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(MENSAJES pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(MENSAJES pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;



}