package com.asic.transacciones.dao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TX_TENDER;

//import .TX_TENDER;

public interface TX_TENDER_DAO extends TransactionalDao {

	 public int delete(TX_TENDER pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_TENDER pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_TENDER pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TX_TENDER findByPK(TX_TENDER pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TX_TENDER pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_TENDER pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_TENDER pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TX_TENDER pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_TENDER pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_TENDER pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_TENDER pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TX_TENDER pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_TENDER pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_TENDER pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}