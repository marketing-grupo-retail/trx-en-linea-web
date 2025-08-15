package com.asic.transacciones.dao;

//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TX_OPERATOR_TRAINING;

//import .TX_OPERATOR_TRAINING;

public interface TX_OPERATOR_TRAINING_DAO extends TransactionalDao {

	 public int delete(TX_OPERATOR_TRAINING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_OPERATOR_TRAINING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_OPERATOR_TRAINING pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TX_OPERATOR_TRAINING findByPK(TX_OPERATOR_TRAINING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TX_OPERATOR_TRAINING pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_OPERATOR_TRAINING pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_OPERATOR_TRAINING pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TX_OPERATOR_TRAINING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_OPERATOR_TRAINING pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_OPERATOR_TRAINING pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_OPERATOR_TRAINING pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TX_OPERATOR_TRAINING pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_OPERATOR_TRAINING pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_OPERATOR_TRAINING pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}