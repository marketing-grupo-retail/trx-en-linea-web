package com.grpretail.business.admin.dao.jdao;

import java.sql.Connection;
import java.util.List;

import jdao.data.DataAdv;

import org.ramm.jwaf.jdao.AbstractDAO_JDAO;
import org.ramm.jwaf.patterns.poolmanager.ConnectionPool;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.grpretail.business.admin.vo.LOG_REP;
import com.grpretail.business.admin.vo.LOG_REP_Imp;

public class LOG_REP_JDAO extends AbstractDAO_JDAO implements LOG_REP_DAO {

	 public int delete(LOG_REP pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(LOG_REP_DAO.class);
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

	 public int insert(LOG_REP pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(LOG_REP_DAO.class);
	   Connection conn_=connPool_.getConnection();

	  
	   // Ejemplo de asignacion de Ids consecutivos
	   
	    Integer id_ = (Integer)getNextId(LOG_REP_DAO.class,conn_);
	    pData.setID(id_);
	   


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
	       res_= super.insert((DataAdv)pData,conn_);
	   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public LOG_REP findByPK(LOG_REP pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(LOG_REP_DAO.class);
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

	   LOG_REP res_;

	   try{
	       res_= (LOG_REP)super.findByPK((DataAdv)pData,conn_);
	   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public List selectVO() 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   LOG_REP data_= new LOG_REP_Imp();
	   ConnectionPool connPool_=getConnPool(LOG_REP_DAO.class);
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

	 public List selectVO(LOG_REP pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(LOG_REP_DAO.class);
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
	   LOG_REP data_= new LOG_REP_Imp();

	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(LOG_REP_DAO.class);
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
	   LOG_REP data_= new LOG_REP_Imp();

	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(LOG_REP_DAO.class);
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

	 public List selectVOFiltred(LOG_REP pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(LOG_REP_DAO.class);
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

	 public List selectVOFiltred(LOG_REP pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(LOG_REP_DAO.class);
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

	 public int update(LOG_REP pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(LOG_REP_DAO.class);
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

	 public int update(LOG_REP pData,String pFilter,Object[] params) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(LOG_REP_DAO.class);
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



}