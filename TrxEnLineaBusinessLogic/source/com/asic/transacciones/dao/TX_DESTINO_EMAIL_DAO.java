package com.asic.transacciones.dao;

//package ;

import java.util.List;

import org.ramm.jwaf.jdao.TransactionalDao;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.vo.TX_DESTINO_EMAIL;

//import .TX_DESTINO_EMAIL;

public interface TX_DESTINO_EMAIL_DAO extends TransactionalDao {

	 public int delete(TX_DESTINO_EMAIL pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_DESTINO_EMAIL pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_DESTINO_EMAIL pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public TX_DESTINO_EMAIL findByPK(TX_DESTINO_EMAIL pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(TX_DESTINO_EMAIL pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_DESTINO_EMAIL pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(TX_DESTINO_EMAIL pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(TX_DESTINO_EMAIL pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_DESTINO_EMAIL pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(TX_DESTINO_EMAIL pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(TX_DESTINO_EMAIL pData,  boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException;

	 public int delete(TX_DESTINO_EMAIL pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_DESTINO_EMAIL pData,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(TX_DESTINO_EMAIL pData,String pFilter,Object[] params,  boolean isTransaction) 
	 throws ConnectionFailedException, DBAccessException;



}