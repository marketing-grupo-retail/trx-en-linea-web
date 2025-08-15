package com.asic.transacciones.dao;//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TPOS_OPERATOR_TRAINING;

//import .TPOS_OPERATOR_TRAINING;

public interface TPOS_OPERATOR_TRAINING_DAO extends TransactionalDao {

	 public int delete(TPOS_OPERATOR_TRAINING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_OPERATOR_TRAINING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_OPERATOR_TRAINING pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TPOS_OPERATOR_TRAINING findByPK(TPOS_OPERATOR_TRAINING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TPOS_OPERATOR_TRAINING pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_OPERATOR_TRAINING pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TPOS_OPERATOR_TRAINING pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_OPERATOR_TRAINING pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_OPERATOR_TRAINING pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TPOS_OPERATOR_TRAINING pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TPOS_OPERATOR_TRAINING pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TPOS_OPERATOR_TRAINING pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_OPERATOR_TRAINING pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TPOS_OPERATOR_TRAINING pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}