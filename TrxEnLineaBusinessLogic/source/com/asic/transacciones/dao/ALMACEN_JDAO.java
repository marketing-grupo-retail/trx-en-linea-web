package com.asic.transacciones.dao;

import java.sql.Connection;
import java.util.List;

import jdao.data.DataAdv;

import org.ramm.jwaf.jdao.AbstractDAO_JDAO;
import org.ramm.jwaf.patterns.poolmanager.ConnectionPool;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.grpretail.business.transacciones.vo.ALMACEN;
import com.grpretail.business.transacciones.vo.ALMACEN_Imp;

public class ALMACEN_JDAO extends AbstractDAO_JDAO implements ALMACEN_DAO {

	 public int delete(ALMACEN pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(ALMACEN_DAO.class);
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

	 public int insert(ALMACEN pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(ALMACEN_DAO.class);
	   Connection conn_=connPool_.getConnection();

	  
	  // Ejemplo de asignacion de Ids consecutivos
	   
	    Integer id_ = (Integer)getNextId(ALMACEN_DAO.class,conn_);
	    pData.setCODCCO(id_);
	   
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

	 public Integer insertByPK(ALMACEN pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(ALMACEN_DAO.class);
	   Connection conn_=connPool_.getConnection();

	  /*
	   * Ejemplo de asignacion de Ids consecutivos
	   *
	   * Integer id_ = (Integer)getNextId(ALMACEN_DAO.class,conn_);
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

	 public ALMACEN findByPK(ALMACEN pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(ALMACEN_DAO.class);
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

	   ALMACEN res_;

	   try{
	       res_= (ALMACEN)super.findByPK((DataAdv)pData,conn_);
	   }finally{
	   	connPool_.returnConnection(conn_);
	   }

	   return res_;
	 }

	 public List selectVO() 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ALMACEN data_= new ALMACEN_Imp();
	   ConnectionPool connPool_=getConnPool(ALMACEN_DAO.class);
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

	 public List selectVO(ALMACEN pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(ALMACEN_DAO.class);
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
	   ALMACEN data_= new ALMACEN_Imp();

	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(ALMACEN_DAO.class);
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
	   ALMACEN data_= new ALMACEN_Imp();

	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(ALMACEN_DAO.class);
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

	 public List selectVOFiltred(ALMACEN pData,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(ALMACEN_DAO.class);
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

	 public List selectVOFiltred(ALMACEN pData,String pFields,String pTable,String pFilter) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(ALMACEN_DAO.class);
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

	 public int update(ALMACEN pData) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(ALMACEN_DAO.class);
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

	 public int update(ALMACEN pData,String pFilter,Object[] params) 
	  throws ConnectionFailedException, DBAccessException{


	  // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
	   ConnectionPool connPool_=getConnPool(ALMACEN_DAO.class);
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