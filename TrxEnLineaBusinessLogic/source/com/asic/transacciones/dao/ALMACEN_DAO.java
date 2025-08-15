package com.asic.transacciones.dao;

import java.util.List;

import org.ramm.jwaf.patterns.dao.AbstractDAO;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.grpretail.business.transacciones.vo.ALMACEN;

public interface ALMACEN_DAO extends AbstractDAO {

	 public int delete(ALMACEN pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int insert(ALMACEN pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public Integer insertByPK(ALMACEN pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public ALMACEN findByPK(ALMACEN pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVO(ALMACEN pData) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred() 
	 throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(ALMACEN pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public List selectVOFiltred(ALMACEN pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException;

	 public int update(ALMACEN pData) 
	 throws ConnectionFailedException, DBAccessException;

	 public int update(ALMACEN pData,String pFilter,Object[] params) 
	 throws ConnectionFailedException, DBAccessException;



}