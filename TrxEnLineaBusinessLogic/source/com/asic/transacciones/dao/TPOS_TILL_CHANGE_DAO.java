package com.asic.transacciones.dao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TPOS_TILL_CHANGE;

//import .TPOS_TILL_CHANGE;

public interface TPOS_TILL_CHANGE_DAO extends TransactionalDao {

	 public int delete(TPOS_TILL_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_TILL_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_TILL_CHANGE pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TPOS_TILL_CHANGE findByPK(TPOS_TILL_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TPOS_TILL_CHANGE pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_TILL_CHANGE pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_TILL_CHANGE pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_TILL_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_TILL_CHANGE pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_TILL_CHANGE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_TILL_CHANGE pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TPOS_TILL_CHANGE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_TILL_CHANGE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_TILL_CHANGE pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}