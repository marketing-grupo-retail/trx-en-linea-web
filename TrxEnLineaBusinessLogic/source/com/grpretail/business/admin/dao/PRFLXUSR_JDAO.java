/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: PRFLXUSR_JDAO.java,v 1.1 2019/12/18 17:08:54 Alfonso Exp $
 *
 */
package com.grpretail.business.admin.dao;

import java.sql.Connection;
import java.util.List;

import jdao.data.DataAdv;

import org.ramm.jwaf.jdao.AbstractDAO_JDAO;
import org.ramm.jwaf.patterns.poolmanager.ConnectionPool;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.grpretail.business.admin.vo.PRFLXUSR;
import com.grpretail.business.admin.vo.PRFLXUSR_Imp;


/**
 * JDOC Class Def
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class PRFLXUSR_JDAO extends AbstractDAO_JDAO implements PRFLXUSR_DAO {
    /**
     * JDOC Method Def
     *
     * @param pData DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ConnectionFailedException DOCUMENT ME!
     * @throws DBAccessException DOCUMENT ME!
     */
    public int delete(PRFLXUSR pData)
        throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(PRFLXUSR_DAO.class);
        Connection conn_ = connPool_.getConnection();

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
         *                        conn_.rollback();
         *                } catch (SQLException e1) {
         *                        LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
         *                }
         *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);           *        }finally{
         *                connPool_.returnConnection(conn_);
         *        }
         */
        int res_;

        try {
            res_ = super.delete((DataAdv) pData, conn_);
        } finally {
            connPool_.returnConnection(conn_);
        }

        return res_;
    }

    /**
     * JDOC Method Def
     *
     * @param pData DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ConnectionFailedException DOCUMENT ME!
     * @throws DBAccessException DOCUMENT ME!
     */
    public int insert(PRFLXUSR pData)
        throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(PRFLXUSR_DAO.class);
        Connection conn_ = connPool_.getConnection();


         // Ejemplo de asignacion de Ids consecutivos

          Integer id_ = (Integer)getNextId(PRFLXUSR_DAO.class,conn_);
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
         *                        conn_.rollback();
         *                } catch (SQLException e1) {
         *                        LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
         *                }
         *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);           *        }finally{
         *                connPool_.returnConnection(conn_);
         *        }
         */
        int res_;

        try {
            res_ = super.insert((DataAdv) pData, conn_);
        } finally {
            connPool_.returnConnection(conn_);
        }

        return res_;
    }

    /**
     * JDOC Method Def
     *
     * @param pData DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ConnectionFailedException DOCUMENT ME!
     * @throws DBAccessException DOCUMENT ME!
     */
    public PRFLXUSR findByPK(PRFLXUSR pData)
        throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(PRFLXUSR_DAO.class);
        Connection conn_ = connPool_.getConnection();

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
         *                        conn_.rollback();
         *                } catch (SQLException e1) {
         *                        LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
         *                }
         *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);           *        }finally{
         *                connPool_.returnConnection(conn_);
         *        }
         */
        PRFLXUSR res_;

        try {
            res_ = (PRFLXUSR) super.findByPK((DataAdv) pData, conn_);
        } finally {
            connPool_.returnConnection(conn_);
        }

        return res_;
    }

    /**
     * JDOC Method Def
     *
     * @return DOCUMENT ME!
     *
     * @throws ConnectionFailedException DOCUMENT ME!
     * @throws DBAccessException DOCUMENT ME!
     */
    public List selectVO() throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        PRFLXUSR data_ = new PRFLXUSR_Imp();
        ConnectionPool connPool_ = getConnPool(PRFLXUSR_DAO.class);
        Connection conn_ = connPool_.getConnection();

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
         *                        conn_.rollback();
         *                } catch (SQLException e1) {
         *                        LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
         *                }
         *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);           *        }finally{
         *                connPool_.returnConnection(conn_);
         *        }
         */
        List res_;

        try {
            res_ = super.selectVO((DataAdv) data_, conn_);
        } finally {
            connPool_.returnConnection(conn_);
        }

        return res_;
    }

    /**
     * JDOC Method Def
     *
     * @param pData DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ConnectionFailedException DOCUMENT ME!
     * @throws DBAccessException DOCUMENT ME!
     */
    public List selectVO(PRFLXUSR pData)
        throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(PRFLXUSR_DAO.class);
        Connection conn_ = connPool_.getConnection();

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
         *                        conn_.rollback();
         *                } catch (SQLException e1) {
         *                        LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
         *                }
         *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);           *        }finally{
         *                connPool_.returnConnection(conn_);
         *        }
         */
        List res_;

        try {
            res_ = super.selectVO((DataAdv) pData, conn_);
        } finally {
            connPool_.returnConnection(conn_);
        }

        return res_;
    }

    /**
     * JDOC Method Def
     *
     * @param pStartIndex DOCUMENT ME!
     * @param pMaxIndex DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ConnectionFailedException DOCUMENT ME!
     * @throws DBAccessException DOCUMENT ME!
     */
    public List selectVO(int pStartIndex, int pMaxIndex)
        throws ConnectionFailedException, DBAccessException {
        PRFLXUSR data_ = new PRFLXUSR_Imp();

        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(PRFLXUSR_DAO.class);
        Connection conn_ = connPool_.getConnection();

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
         *                        conn_.rollback();
         *                } catch (SQLException e1) {
         *                        LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
         *                }
         *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);           *        }finally{
         *                connPool_.returnConnection(conn_);
         *        }
         */
        List res_;

        try {
            res_ = super.selectVO((DataAdv) data_, pStartIndex, pMaxIndex, conn_);
        } finally {
            connPool_.returnConnection(conn_);
        }

        return res_;
    }

    /**
     * JDOC Method Def
     *
     * @return DOCUMENT ME!
     *
     * @throws ConnectionFailedException DOCUMENT ME!
     * @throws DBAccessException DOCUMENT ME!
     */
    public List selectVOFiltred()
        throws ConnectionFailedException, DBAccessException {
        PRFLXUSR data_ = new PRFLXUSR_Imp();

        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(PRFLXUSR_DAO.class);
        Connection conn_ = connPool_.getConnection();

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
         *                        conn_.rollback();
         *                } catch (SQLException e1) {
         *                        LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
         *                }
         *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);           *        }finally{
         *                connPool_.returnConnection(conn_);
         *        }
         */
        List res_;

        try {
            res_ = super.selectVOFiltred((DataAdv) data_, "", "", conn_);
        } finally {
            connPool_.returnConnection(conn_);
        }

        return res_;
    }

    /**
     * JDOC Method Def
     *
     * @param pData DOCUMENT ME!
     * @param pTable DOCUMENT ME!
     * @param pFilter DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ConnectionFailedException DOCUMENT ME!
     * @throws DBAccessException DOCUMENT ME!
     */
    public List selectVOFiltred(PRFLXUSR pData, String pTable, String pFilter)
        throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(PRFLXUSR_DAO.class);
        Connection conn_ = connPool_.getConnection();

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
         *                        conn_.rollback();
         *                } catch (SQLException e1) {
         *                        LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
         *                }
         *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);           *        }finally{
         *                connPool_.returnConnection(conn_);
         *        }
         */
        List res_;

        try {
            res_ = super.selectVOFiltred((DataAdv) pData, pTable, pFilter, conn_);
        } finally {
            connPool_.returnConnection(conn_);
        }

        return res_;
    }

    /**
     * JDOC Method Def
     *
     * @param pData DOCUMENT ME!
     * @param pFields DOCUMENT ME!
     * @param pTable DOCUMENT ME!
     * @param pFilter DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ConnectionFailedException DOCUMENT ME!
     * @throws DBAccessException DOCUMENT ME!
     */
    public List selectVOFiltred(PRFLXUSR pData, String pFields, String pTable,
        String pFilter) throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(PRFLXUSR_DAO.class);
        Connection conn_ = connPool_.getConnection();

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
         *                        conn_.rollback();
         *                } catch (SQLException e1) {
         *                        LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
         *                }
         *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);           *        }finally{
         *                connPool_.returnConnection(conn_);
         *        }
         */
        List res_;

        try {
            res_ = super.selectVOFiltred((DataAdv) pData, pFields, pTable,
                    pFilter, conn_);
        } finally {
            connPool_.returnConnection(conn_);
        }

        return res_;
    }

    /**
     * JDOC Method Def
     *
     * @param pData DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ConnectionFailedException DOCUMENT ME!
     * @throws DBAccessException DOCUMENT ME!
     */
    public int update(PRFLXUSR pData)
        throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(PRFLXUSR_DAO.class);
        Connection conn_ = connPool_.getConnection();

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
         *                        conn_.rollback();
         *                } catch (SQLException e1) {
         *                        LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
         *                }
         *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);           *        }finally{
         *                connPool_.returnConnection(conn_);
         *        }
         */
        int res_;

        try {
            res_ = super.update((DataAdv) pData, conn_);
        } finally {
            connPool_.returnConnection(conn_);
        }

        return res_;
    }

    /**
     * JDOC Method Def
     *
     * @param pData DOCUMENT ME!
     * @param pFilter DOCUMENT ME!
     * @param params DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws ConnectionFailedException DOCUMENT ME!
     * @throws DBAccessException DOCUMENT ME!
     */
    public int update(PRFLXUSR pData, String pFilter, Object[] params)
        throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(PRFLXUSR_DAO.class);
        Connection conn_ = connPool_.getConnection();

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
         *                        conn_.rollback();
         *                } catch (SQLException e1) {
         *                        LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e1);
         *                }
         *   LogWriter.getLog().log(this,LogWriter.WARNING,"Exception in transaction : ",e);           *        }finally{
         *                connPool_.returnConnection(conn_);
         *        }
         */
        int res_;

        try {
            res_ = super.update((DataAdv) pData, pFilter, params, conn_);
        } finally {
            connPool_.returnConnection(conn_);
        }

        return res_;
    }
}
