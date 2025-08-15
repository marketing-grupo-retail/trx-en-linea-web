package com.asic.transacciones.dao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TPOS_EXCEPTION_LOG;

//import .TPOS_EXCEPTION_LOG;

public interface TPOS_EXCEPTION_LOG_DAO extends TransactionalDao {

	 public int delete(TPOS_EXCEPTION_LOG pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_EXCEPTION_LOG pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_EXCEPTION_LOG pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TPOS_EXCEPTION_LOG findByPK(TPOS_EXCEPTION_LOG pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TPOS_EXCEPTION_LOG pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_EXCEPTION_LOG pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_EXCEPTION_LOG pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_EXCEPTION_LOG pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_EXCEPTION_LOG pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_EXCEPTION_LOG pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_EXCEPTION_LOG pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TPOS_EXCEPTION_LOG pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_EXCEPTION_LOG pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_EXCEPTION_LOG pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}