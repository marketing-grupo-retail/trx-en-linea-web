package com.asic.transacciones.dao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TX_STORE_CLOSING;

//import .TX_STORE_CLOSING;

public interface TX_STORE_CLOSING_DAO extends TransactionalDao {

	 public int delete(TX_STORE_CLOSING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_STORE_CLOSING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_STORE_CLOSING pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TX_STORE_CLOSING findByPK(TX_STORE_CLOSING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TX_STORE_CLOSING pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_STORE_CLOSING pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_STORE_CLOSING pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TX_STORE_CLOSING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_STORE_CLOSING pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_STORE_CLOSING pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_STORE_CLOSING pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TX_STORE_CLOSING pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_STORE_CLOSING pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_STORE_CLOSING pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}