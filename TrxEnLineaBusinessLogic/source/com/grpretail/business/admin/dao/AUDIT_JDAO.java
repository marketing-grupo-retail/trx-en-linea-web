/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: AUDIT_JDAO.java,v 1.1 2019/12/18 17:08:55 Alfonso Exp $
 *
 */package com.grpretail.business.admin.dao;

import java.sql.Connection;
import java.util.List;

import jdao.data.DataAdv;

import org.ramm.jwaf.jdao.AbstractDAO_JDAO;
import org.ramm.jwaf.patterns.poolmanager.ConnectionPool;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.grpretail.business.admin.vo.AUDIT;
import com.grpretail.business.admin.vo.AUDIT_Imp;


/**
 * JDOC Class Def
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class AUDIT_JDAO extends AbstractDAO_JDAO implements AUDIT_DAO {
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
    public int delete(AUDIT pData)
        throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(AUDIT_DAO.class);
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
    public int insert(AUDIT pData)
        throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(AUDIT_DAO.class);
        Connection conn_ = connPool_.getConnection();

        /*
         * Ejemplo de asignacion de Ids consecutivos
         *
         * Integer id_ = (Integer)getNextId(AUDIT_DAO.class,conn_);
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
    public AUDIT findByPK(AUDIT pData)
        throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(AUDIT_DAO.class);
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
        AUDIT res_;

        try {
            res_ = (AUDIT) super.findByPK((DataAdv) pData, conn_);
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
        AUDIT data_ = new AUDIT_Imp();
        ConnectionPool connPool_ = getConnPool(AUDIT_DAO.class);
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
    public List selectVO(AUDIT pData)
        throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(AUDIT_DAO.class);
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
        AUDIT data_ = new AUDIT_Imp();

        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(AUDIT_DAO.class);
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
        AUDIT data_ = new AUDIT_Imp();

        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(AUDIT_DAO.class);
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
    public List selectVOFiltred(AUDIT pData, String pTable, String pFilter)
        throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(AUDIT_DAO.class);
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
    public List selectVOFiltred(AUDIT pData, String pFields, String pTable,
        String pFilter) throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(AUDIT_DAO.class);
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
    public int update(AUDIT pData)
        throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(AUDIT_DAO.class);
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
    public int update(AUDIT pData, String pFilter, Object[] params)
        throws ConnectionFailedException, DBAccessException {
        // obtiene la conexion a partir del nombre de la interfaz en el dao.properties
        ConnectionPool connPool_ = getConnPool(AUDIT_DAO.class);
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
