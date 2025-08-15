package com.asic.transacciones.dao;

//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TX_ITEM_RECORD_CHANGE;

//import .TX_ITEM_RECORD_CHANGE;

public interface TX_ITEM_RECORD_CHANGE_DAO extends TransactionalDao {

	 public int delete(TX_ITEM_RECORD_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_ITEM_RECORD_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_ITEM_RECORD_CHANGE pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TX_ITEM_RECORD_CHANGE findByPK(TX_ITEM_RECORD_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TX_ITEM_RECORD_CHANGE pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_ITEM_RECORD_CHANGE pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_ITEM_RECORD_CHANGE pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TX_ITEM_RECORD_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_ITEM_RECORD_CHANGE pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_ITEM_RECORD_CHANGE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_ITEM_RECORD_CHANGE pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TX_ITEM_RECORD_CHANGE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_ITEM_RECORD_CHANGE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_ITEM_RECORD_CHANGE pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}