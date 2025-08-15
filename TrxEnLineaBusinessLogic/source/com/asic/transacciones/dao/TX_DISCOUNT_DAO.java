package com.asic.transacciones.dao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TX_DISCOUNT;

//import .TX_DISCOUNT;

public interface TX_DISCOUNT_DAO extends TransactionalDao {

	 public int delete(TX_DISCOUNT pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_DISCOUNT pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_DISCOUNT pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TX_DISCOUNT findByPK(TX_DISCOUNT pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TX_DISCOUNT pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_DISCOUNT pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_DISCOUNT pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TX_DISCOUNT pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_DISCOUNT pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_DISCOUNT pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_DISCOUNT pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TX_DISCOUNT pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_DISCOUNT pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_DISCOUNT pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}