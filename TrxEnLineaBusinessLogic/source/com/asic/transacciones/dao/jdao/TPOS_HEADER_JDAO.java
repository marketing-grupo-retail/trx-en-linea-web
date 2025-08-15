package com.asic.transacciones.dao.jdao;//package ;

import java.sql.Connection;
import java.util.List;

import jdao.data.DataAdv;

import org.ramm.jwaf.jdao.TransactionalDao_JDAO;
import org.ramm.jwaf.patterns.poolmanager.ConnectionPool;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.transacciones.dao.TPOS_HEADER_DAO;
import com.asic.transacciones.vo.TPOS_HEADER;
import com.asic.transacciones.vo.TPOS_HEADER_Imp;

//import .TPOS_HEADER;

public class TPOS_HEADER_JDAO extends TransactionalDao_JDAO implements TPOS_HEADER_DAO  {

	 public int delete(TPOS_HEADER pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(TPOS_HEADER_DAO.class);
	   Connection conn_=connPool_.getConnection();


	  /*
	   * Ejemplo utilizando transacciones
	   * Connection conn_ = connPool_.getConnection()
	   * try{
	   *    conn_.setAutoCommit(false);

	   *  insert your code here

	   *    conn_commit();
	   *    conn_.setAutoCommit(true);
	   * } catch (SQLException e) {
	   *     try {
	   *			conn_.rollback();
	   *		} catch (SQLException e1) {
	   *			LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
	   *		}
	   *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);	   *	}finally{
	   *		connPool_.returnConnection(conn_);
	   *	}
	   */

	   int res_;

	   try{
	       res_= super.delete((DataAdv)pData,conn_);
	   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public int insert(TPOS_HEADER pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(TPOS_HEADER_DAO.class);
	   Connection conn_=connPool_.getConnection();

	  /*
	   * Ejemplo de asignacion de Ids consecutivos
	   *
	   * Integer id_ = (Integer)getNextId(TPOS_HEADER_DAO.class,conn_);
	   * pData.setID(id_);
	   */


	  /*
	   * Ejemplo utilizando transacciones
	   * Connection conn_ = connPool_.getConnection()
	   * try{
	   *    conn_.setAutoCommit(false);

	   *  insert your code here

	   *    conn_commit();
	   *    conn_.setAutoCommit(true);
	   * } catch (SQLException e) {
	   *     try {
	   *			conn_.rollback();
	   *		} catch (SQLException e1) {
	   *			LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
	   *		}
	   *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);	   *	}finally{
	   *		connPool_.returnConnection(conn_);
	   *	}
	   */

	   int res_=0;

	   try{
	       res_= super.insert((DataAdv)pData,conn_);
	   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public Integer insertByPK(TPOS_HEADER pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(TPOS_HEADER_DAO.class);
	   Connection conn_=connPool_.getConnection();

	  /*
	   * Ejemplo de asignacion de Ids consecutivos
	   *
	   * Integer id_ = (Integer)getNextId(TPOS_HEADER_DAO.class,conn_);
	   * pData.setID(id_);
	   */


	  /*
	   * Ejemplo utilizando transacciones
	   * Connection conn_ = connPool_.getConnection()
	   * try{
	   *    conn_.setAutoCommit(false);

	   *  insert your code here

	   *    conn_commit();
	   *    conn_.setAutoCommit(true);
	   * } catch (SQLException e) {
	   *     try {
	   *			conn_.rollback();
	   *		} catch (SQLException e1) {
	   *			LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
	   *		}
	   *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);	   *	}finally{
	   *		connPool_.returnConnection(conn_);
	   *	}
	   */

	   Integer res_;

	   try{
	       res_= super.insertByPK((DataAdv)pData,conn_);
	   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public TPOS_HEADER findByPK(TPOS_HEADER pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(TPOS_HEADER_DAO.class);
	   Connection conn_=connPool_.getConnection();


	  /*
	   * Ejemplo utilizando transacciones
	   * Connection conn_ = connPool_.getConnection()
	   * try{
	   *    conn_.setAutoCommit(false);

	   *  insert your code here

	   *    conn_commit();
	   *    conn_.setAutoCommit(true);
	   * } catch (SQLException e) {
	   *     try {
	   *			conn_.rollback();
	   *		} catch (SQLException e1) {
	   *			LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
	   *		}
	   *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);	   *	}finally{
	   *		connPool_.returnConnection(conn_);
	   *	}
	   */

	   TPOS_HEADER res_;

	   try{
	       res_= (TPOS_HEADER)super.findByPK((DataAdv)pData,conn_);
	   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public List selectVO() 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   TPOS_HEADER data_= new TPOS_HEADER_Imp();
	   ConnectionPool connPool_=getConnPool(TPOS_HEADER_DAO.class);
	   Connection conn_=connPool_.getConnection();


	  /*
	   * Ejemplo utilizando transacciones
	   * Connection conn_ = connPool_.getConnection()
	   * try{
	   *    conn_.setAutoCommit(false);

	   *  insert your code here

	   *    conn_commit();
	   *    conn_.setAutoCommit(true);
	   * } catch (SQLException e) {
	   *     try {
	   *			conn_.rollback();
	   *		} catch (SQLException e1) {
	   *			LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
	   *		}
	   *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);	   *	}finally{
	   *		connPool_.returnConnection(conn_);
	   *	}
	   */

	   List res_;

	   try{
	       res_= super.selectVO((DataAdv)data_,conn_);
		   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public List selectVO(TPOS_HEADER pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(TPOS_HEADER_DAO.class);
	   Connection conn_=connPool_.getConnection();


	  /*
	   * Ejemplo utilizando transacciones
	   * Connection conn_ = connPool_.getConnection()
	   * try{
	   *    conn_.setAutoCommit(false);

	   *  insert your code here

	   *    conn_commit();
	   *    conn_.setAutoCommit(true);
	   * } catch (SQLException e) {
	   *     try {
	   *			conn_.rollback();
	   *		} catch (SQLException e1) {
	   *			LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
	   *		}
	   *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);	   *	}finally{
	   *		connPool_.returnConnection(conn_);
	   *	}
	   */

	   List res_;

	   try{
	       res_= super.selectVO((DataAdv)pData,conn_);
		   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public List selectVO(int pStartIndex,int pMaxIndex) 
	  throws ConnectionFailedException, DBAccessException{
	   TPOS_HEADER data_= new TPOS_HEADER_Imp();

	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(TPOS_HEADER_DAO.class);
	   Connection conn_=connPool_.getConnection();


	  /*
	   * Ejemplo utilizando transacciones
	   * Connection conn_ = connPool_.getConnection()
	   * try{
	   *    conn_.setAutoCommit(false);

	   *  insert your code here

	   *    conn_commit();
	   *    conn_.setAutoCommit(true);
	   * } catch (SQLException e) {
	   *     try {
	   *			conn_.rollback();
	   *		} catch (SQLException e1) {
	   *			LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
	   *		}
	   *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);	   *	}finally{
	   *		connPool_.returnConnection(conn_);
	   *	}
	   */

	   List res_;

	   try{
	       res_= super.selectVO((DataAdv)data_,pStartIndex,pMaxIndex,conn_);
		   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public List selectVOFiltred() 
	  throws ConnectionFailedException, DBAccessException{
	   TPOS_HEADER data_= new TPOS_HEADER_Imp();

	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(TPOS_HEADER_DAO.class);
	   Connection conn_=connPool_.getConnection();


	  /*
	   * Ejemplo utilizando transacciones
	   * Connection conn_ = connPool_.getConnection()
	   * try{
	   *    conn_.setAutoCommit(false);

	   *  insert your code here

	   *    conn_commit();
	   *    conn_.setAutoCommit(true);
	   * } catch (SQLException e) {
	   *     try {
	   *			conn_.rollback();
	   *		} catch (SQLException e1) {
	   *			LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
	   *		}
	   *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);	   *	}finally{
	   *		connPool_.returnConnection(conn_);
	   *	}
	   */

	   List res_;

	   try{
	       res_= super.selectVOFiltred((DataAdv)data_,"","",conn_);
	   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public List selectVOFiltred(TPOS_HEADER pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(TPOS_HEADER_DAO.class);
	   Connection conn_=connPool_.getConnection();


	  /*
	   * Ejemplo utilizando transacciones
	   * Connection conn_ = connPool_.getConnection()
	   * try{
	   *    conn_.setAutoCommit(false);

	   *  insert your code here

	   *    conn_commit();
	   *    conn_.setAutoCommit(true);
	   * } catch (SQLException e) {
	   *     try {
	   *			conn_.rollback();
	   *		} catch (SQLException e1) {
	   *			LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
	   *		}
	   *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);	   *	}finally{
	   *		connPool_.returnConnection(conn_);
	   *	}
	   */

	   List res_;

	   try{
	       res_= super.selectVOFiltred((DataAdv)pData,pTable,pFilter,conn_);
	   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public List selectVOFiltred(TPOS_HEADER pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(TPOS_HEADER_DAO.class);
	   Connection conn_=connPool_.getConnection();


	  /*
	   * Ejemplo utilizando transacciones
	   * Connection conn_ = connPool_.getConnection()
	   * try{
	   *    conn_.setAutoCommit(false);

	   *  insert your code here

	   *    conn_commit();
	   *    conn_.setAutoCommit(true);
	   * } catch (SQLException e) {
	   *     try {
	   *			conn_.rollback();
	   *		} catch (SQLException e1) {
	   *			LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
	   *		}
	   *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);	   *	}finally{
	   *		connPool_.returnConnection(conn_);
	   *	}
	   */

	   List res_;

	   try{
	       res_= super.selectVOFiltred((DataAdv)pData,pFields,pTable,pFilter,conn_);
	   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public int update(TPOS_HEADER pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(TPOS_HEADER_DAO.class);
	   Connection conn_=connPool_.getConnection();


	  /*
	   * Ejemplo utilizando transacciones
	   * Connection conn_ = connPool_.getConnection()
	   * try{
	   *    conn_.setAutoCommit(false);

	   *  insert your code here

	   *    conn_commit();
	   *    conn_.setAutoCommit(true);
	   * } catch (SQLException e) {
	   *     try {
	   *			conn_.rollback();
	   *		} catch (SQLException e1) {
	   *			LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
	   *		}
	   *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);	   *	}finally{
	   *		connPool_.returnConnection(conn_);
	   *	}
	   */

	   int res_;

	   try{
	       res_= super.update((DataAdv)pData,conn_);
	   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public int update(TPOS_HEADER pData,String pFilter,Object[] params) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(TPOS_HEADER_DAO.class);
	   Connection conn_=connPool_.getConnection();


	  /*
	   * Ejemplo utilizando transacciones
	   * Connection conn_ = connPool_.getConnection()
	   * try{
	   *    conn_.setAutoCommit(false);

	   *  insert your code here

	   *    conn_commit();
	   *    conn_.setAutoCommit(true);
	   * } catch (SQLException e) {
	   *     try {
	   *			conn_.rollback();
	   *		} catch (SQLException e1) {
	   *			LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
	   *		}
	   *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);	   *	}finally{
	   *		connPool_.returnConnection(conn_);
	   *	}
	   */

	   int res_;

	   try{
	       res_= super.update((DataAdv)pData,pFilter,params,conn_);
	   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public ConnectionPool getPool() 	  throws ConnectionFailedException, DBAccessException {	   return getConnPool(TPOS_HEADER_DAO.class);
	 }

	 public int insert(TPOS_HEADER pData, boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException{


	   int res_;

	   if (!isTransaction) {
	   	res_ = insert(pData);
	   } else {
	      Connection conn_= getGroupConn();

	  /*
	   * Ejemplo de asignacion de Ids consecutivos
	   *
	   * Integer id_ = (Integer)getNextId(TPOS_HEADER_DAO.class,conn_);
	   * pData.setID(id_);
	   */

	       res_= super.insert((DataAdv)pData,conn_);
	   }
	   return res_;
	 }

	 public Integer insertByPK(TPOS_HEADER pData, boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(TPOS_HEADER_DAO.class);
	   Integer res_;

	   if (!isTransaction) {
	   	res_ = insertByPK(pData);
	   } else {
	      Connection conn_= getGroupConn();

	  /*
	   * Ejemplo de asignacion de Ids consecutivos
	   *
	   * Integer id_ = (Integer)getNextId(TPOS_HEADER_DAO.class,conn_);
	   * pData.setID(id_);
	   */

	       res_= super.insertByPK((DataAdv)pData,conn_);
	   }
	   return res_;
	 }

	 public int delete(TPOS_HEADER pData, boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException{


	   int res_;

	   if (!isTransaction) {
	   	res_ = delete(pData);
	   } else {
	      Connection conn_= getGroupConn();

	   

	       res_= super.delete((DataAdv)pData,conn_);
	   }
	   return res_;
	 }

	 public int update(TPOS_HEADER pData, boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException{


	   int res_;

	   if (!isTransaction) {
	   	res_ = update(pData);
	   } else {
	      Connection conn_= getGroupConn();

	   

	       res_= super.update((DataAdv)pData,conn_);
	   }
	   return res_;
	 }

	 public int update(TPOS_HEADER pData,String pFilter,Object[] params, boolean isTransaction) 
	  throws ConnectionFailedException, DBAccessException{


	   int res_;

	   if (!isTransaction) {
	   	res_ = update(pData,pFilter,params);
	   } else {
	      Connection conn_= getGroupConn();

	   

	       res_= super.update((DataAdv)pData,pFilter,params,conn_);
	   }
	   return res_;
	 }



}