package com.asic.transacciones.dao;

//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TX_DATA_ENTRY;

//import .TX_DATA_ENTRY;

public interface TX_DATA_ENTRY_DAO extends TransactionalDao {

	 public int delete(TX_DATA_ENTRY pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_DATA_ENTRY pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_DATA_ENTRY pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TX_DATA_ENTRY findByPK(TX_DATA_ENTRY pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TX_DATA_ENTRY pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_DATA_ENTRY pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_DATA_ENTRY pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TX_DATA_ENTRY pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_DATA_ENTRY pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_DATA_ENTRY pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_DATA_ENTRY pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TX_DATA_ENTRY pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_DATA_ENTRY pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_DATA_ENTRY pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}