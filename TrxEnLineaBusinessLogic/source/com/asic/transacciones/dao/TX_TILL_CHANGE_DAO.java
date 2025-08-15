package com.asic.transacciones.dao;

//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TX_TILL_CHANGE;

//import .TX_TILL_CHANGE;

public interface TX_TILL_CHANGE_DAO extends TransactionalDao {

	 public int delete(TX_TILL_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_TILL_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_TILL_CHANGE pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TX_TILL_CHANGE findByPK(TX_TILL_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TX_TILL_CHANGE pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_TILL_CHANGE pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_TILL_CHANGE pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TX_TILL_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_TILL_CHANGE pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_TILL_CHANGE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_TILL_CHANGE pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TX_TILL_CHANGE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_TILL_CHANGE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_TILL_CHANGE pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}