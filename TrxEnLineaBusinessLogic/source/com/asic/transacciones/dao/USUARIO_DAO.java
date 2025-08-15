package com.asic.transacciones.dao;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.USUARIO;

public interface USUARIO_DAO extends TransactionalDao {

	 public int delete(USUARIO pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(USUARIO pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(USUARIO pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public USUARIO findByPK(USUARIO pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(USUARIO pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(USUARIO pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(USUARIO pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(USUARIO pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(USUARIO pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(USUARIO pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(USUARIO pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(USUARIO pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(USUARIO pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(USUARIO pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}