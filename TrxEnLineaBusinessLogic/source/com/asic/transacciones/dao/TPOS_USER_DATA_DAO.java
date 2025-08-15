package com.asic.transacciones.dao;

//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TPOS_USER_DATA;

//import .TPOS_USER_DATA;

public interface TPOS_USER_DATA_DAO extends TransactionalDao {

	 public int delete(TPOS_USER_DATA pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_USER_DATA pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_USER_DATA pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TPOS_USER_DATA findByPK(TPOS_USER_DATA pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TPOS_USER_DATA pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_USER_DATA pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_USER_DATA pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_USER_DATA pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_USER_DATA pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_USER_DATA pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_USER_DATA pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TPOS_USER_DATA pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_USER_DATA pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_USER_DATA pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}