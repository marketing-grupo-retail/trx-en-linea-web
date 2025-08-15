package com.asic.transacciones.dao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TPOS_MANAGER_OVERRIDE;

//import .TPOS_MANAGER_OVERRIDE;

public interface TPOS_MANAGER_OVERRIDE_DAO extends TransactionalDao {

	 public int delete(TPOS_MANAGER_OVERRIDE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_MANAGER_OVERRIDE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_MANAGER_OVERRIDE pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TPOS_MANAGER_OVERRIDE findByPK(TPOS_MANAGER_OVERRIDE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TPOS_MANAGER_OVERRIDE pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_MANAGER_OVERRIDE pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_MANAGER_OVERRIDE pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_MANAGER_OVERRIDE pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_MANAGER_OVERRIDE pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_MANAGER_OVERRIDE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_MANAGER_OVERRIDE pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TPOS_MANAGER_OVERRIDE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_MANAGER_OVERRIDE pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_MANAGER_OVERRIDE pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}