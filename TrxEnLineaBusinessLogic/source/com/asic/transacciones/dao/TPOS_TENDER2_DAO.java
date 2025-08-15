package com.asic.transacciones.dao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TPOS_TENDER2;

//import com.asic.transacciones.vo.TPOS_TENDER;

//import .TPOS_TENDER;

public interface TPOS_TENDER2_DAO extends TransactionalDao {

	 public int delete(TPOS_TENDER2 pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_TENDER2 pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_TENDER2 pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TPOS_TENDER2 findByPK(TPOS_TENDER2 pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TPOS_TENDER2 pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_TENDER2 pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_TENDER2 pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_TENDER2 pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_TENDER2 pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_TENDER2 pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_TENDER2 pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TPOS_TENDER2 pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_TENDER2 pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_TENDER2 pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}