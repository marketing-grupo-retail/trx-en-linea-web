package com.asic.transacciones.dao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TPOS_ITEM_RECORD_CHANGE;

//import .TPOS_ITEM_RECORD_CHANGE;

public interface TPOS_ITEM_RECORD_CHANGE_DAO extends TransactionalDao {

	 public int delete(TPOS_ITEM_RECORD_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_ITEM_RECORD_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_ITEM_RECORD_CHANGE pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TPOS_ITEM_RECORD_CHANGE findByPK(TPOS_ITEM_RECORD_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TPOS_ITEM_RECORD_CHANGE pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_ITEM_RECORD_CHANGE pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_ITEM_RECORD_CHANGE pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_ITEM_RECORD_CHANGE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_ITEM_RECORD_CHANGE pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_ITEM_RECORD_CHANGE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_ITEM_RECORD_CHANGE pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TPOS_ITEM_RECORD_CHANGE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_ITEM_RECORD_CHANGE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_ITEM_RECORD_CHANGE pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}