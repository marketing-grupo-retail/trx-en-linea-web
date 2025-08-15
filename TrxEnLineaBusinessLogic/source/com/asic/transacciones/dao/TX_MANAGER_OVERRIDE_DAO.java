package com.asic.transacciones.dao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TX_MANAGER_OVERRIDE;

//import .TX_MANAGER_OVERRIDE;

public interface TX_MANAGER_OVERRIDE_DAO extends TransactionalDao {

	 public int delete(TX_MANAGER_OVERRIDE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_MANAGER_OVERRIDE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_MANAGER_OVERRIDE pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TX_MANAGER_OVERRIDE findByPK(TX_MANAGER_OVERRIDE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TX_MANAGER_OVERRIDE pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_MANAGER_OVERRIDE pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_MANAGER_OVERRIDE pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TX_MANAGER_OVERRIDE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_MANAGER_OVERRIDE pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_MANAGER_OVERRIDE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_MANAGER_OVERRIDE pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TX_MANAGER_OVERRIDE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_MANAGER_OVERRIDE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_MANAGER_OVERRIDE pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}