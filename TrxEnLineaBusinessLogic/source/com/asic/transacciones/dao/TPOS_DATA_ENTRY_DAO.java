package com.asic.transacciones.dao;

//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TPOS_DATA_ENTRY;

//import .TPOS_DATA_ENTRY;

public interface TPOS_DATA_ENTRY_DAO extends TransactionalDao {

	 public int delete(TPOS_DATA_ENTRY pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_DATA_ENTRY pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_DATA_ENTRY pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TPOS_DATA_ENTRY findByPK(TPOS_DATA_ENTRY pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TPOS_DATA_ENTRY pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_DATA_ENTRY pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_DATA_ENTRY pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_DATA_ENTRY pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_DATA_ENTRY pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_DATA_ENTRY pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_DATA_ENTRY pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TPOS_DATA_ENTRY pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_DATA_ENTRY pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_DATA_ENTRY pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}