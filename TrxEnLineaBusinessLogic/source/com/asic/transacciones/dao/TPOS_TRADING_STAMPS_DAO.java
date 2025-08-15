package com.asic.transacciones.dao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TPOS_TRADING_STAMPS;

//import .TPOS_TRADING_STAMPS;

public interface TPOS_TRADING_STAMPS_DAO extends TransactionalDao {

	 public int delete(TPOS_TRADING_STAMPS pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_TRADING_STAMPS pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_TRADING_STAMPS pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TPOS_TRADING_STAMPS findByPK(TPOS_TRADING_STAMPS pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TPOS_TRADING_STAMPS pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_TRADING_STAMPS pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_TRADING_STAMPS pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_TRADING_STAMPS pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_TRADING_STAMPS pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_TRADING_STAMPS pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_TRADING_STAMPS pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TPOS_TRADING_STAMPS pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_TRADING_STAMPS pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_TRADING_STAMPS pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}