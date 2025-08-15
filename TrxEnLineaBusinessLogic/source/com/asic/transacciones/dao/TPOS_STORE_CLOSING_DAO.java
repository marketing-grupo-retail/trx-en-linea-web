package com.asic.transacciones.dao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TPOS_STORE_CLOSING;

//import .TPOS_STORE_CLOSING;

public interface TPOS_STORE_CLOSING_DAO extends TransactionalDao {

	 public int delete(TPOS_STORE_CLOSING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_STORE_CLOSING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_STORE_CLOSING pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TPOS_STORE_CLOSING findByPK(TPOS_STORE_CLOSING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TPOS_STORE_CLOSING pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_STORE_CLOSING pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_STORE_CLOSING pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_STORE_CLOSING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_STORE_CLOSING pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_STORE_CLOSING pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_STORE_CLOSING pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TPOS_STORE_CLOSING pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_STORE_CLOSING pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_STORE_CLOSING pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}