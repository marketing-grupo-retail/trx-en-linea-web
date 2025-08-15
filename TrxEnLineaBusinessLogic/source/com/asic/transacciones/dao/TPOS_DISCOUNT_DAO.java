package com.asic.transacciones.dao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TPOS_DISCOUNT;

//import .TPOS_DISCOUNT;

public interface TPOS_DISCOUNT_DAO extends TransactionalDao {

	 public int delete(TPOS_DISCOUNT pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_DISCOUNT pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_DISCOUNT pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TPOS_DISCOUNT findByPK(TPOS_DISCOUNT pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TPOS_DISCOUNT pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_DISCOUNT pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_DISCOUNT pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_DISCOUNT pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_DISCOUNT pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_DISCOUNT pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_DISCOUNT pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TPOS_DISCOUNT pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_DISCOUNT pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_DISCOUNT pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}