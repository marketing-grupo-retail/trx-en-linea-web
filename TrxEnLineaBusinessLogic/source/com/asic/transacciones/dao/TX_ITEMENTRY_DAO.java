package com.asic.transacciones.dao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TX_ITEMENTRY;

//import .TX_ITEMENTRY;

public interface TX_ITEMENTRY_DAO extends TransactionalDao {

	 public int delete(TX_ITEMENTRY pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_ITEMENTRY pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_ITEMENTRY pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TX_ITEMENTRY findByPK(TX_ITEMENTRY pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TX_ITEMENTRY pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_ITEMENTRY pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_ITEMENTRY pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TX_ITEMENTRY pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_ITEMENTRY pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_ITEMENTRY pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_ITEMENTRY pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TX_ITEMENTRY pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_ITEMENTRY pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_ITEMENTRY pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}