package com.asic.transacciones.dao.jdao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TX_TRADING_STAMPS;

//import .TX_TRADING_STAMPS;

public interface TX_TRADING_STAMPS_DAO extends TransactionalDao {

	 public int delete(TX_TRADING_STAMPS pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_TRADING_STAMPS pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_TRADING_STAMPS pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TX_TRADING_STAMPS findByPK(TX_TRADING_STAMPS pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TX_TRADING_STAMPS pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_TRADING_STAMPS pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_TRADING_STAMPS pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TX_TRADING_STAMPS pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_TRADING_STAMPS pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_TRADING_STAMPS pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_TRADING_STAMPS pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TX_TRADING_STAMPS pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_TRADING_STAMPS pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_TRADING_STAMPS pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}