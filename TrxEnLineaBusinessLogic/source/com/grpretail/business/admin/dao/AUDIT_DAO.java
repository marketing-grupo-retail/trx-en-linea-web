/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: AUDIT_DAO.java,v 1.1 2019/12/18 17:08:55 Alfonso Exp $
 *
 */
package com.grpretail.business.admin.dao;

import java.util.List;

import org.ramm.jwaf.patterns.dao.AbstractDAO;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.grpretail.business.admin.vo.AUDIT;


/**
 * JDOC Class Def
 *
 * @author $author$
 * @version $Revision: 1.1 $
 */
public interface AUDIT_DAO extends AbstractDAO {

/**
 *
 * @param pData
 * @return
 * @throws ConnectionFailedException
 * @throws DBAccessException
 */
    public int delete(AUDIT pData)
        throws ConnectionFailedException, DBAccessException;

/**
 *
 * @param pData
 * @return
 * @throws ConnectionFailedException
 * @throws DBAccessException
 */
    public int insert(AUDIT pData)
        throws ConnectionFailedException, DBAccessException;

/**
 *
 * @param pData
 * @return
 * @throws ConnectionFailedException
 * @throws DBAccessException
 */
    public AUDIT findByPK(AUDIT pData)
        throws ConnectionFailedException, DBAccessException;

/**
 *
 * @return
 * @throws ConnectionFailedException
 * @throws DBAccessException
 */
    public List selectVO() throws ConnectionFailedException, DBAccessException;

/**
 *
 * @param pData
 * @return
 * @throws ConnectionFailedException
 * @throws DBAccessException
 */
    public List selectVO(AUDIT pData)
        throws ConnectionFailedException, DBAccessException;

/**
 *
 * @param pStartIndex
 * @param pMaxIndex
 * @return
 * @throws ConnectionFailedException
 * @throws DBAccessException
 */
    public List selectVO(int pStartIndex, int pMaxIndex)
        throws ConnectionFailedException, DBAccessException;

/**
 *
 * @return
 * @throws ConnectionFailedException
 * @throws DBAccessException
 */
    public List selectVOFiltred()
        throws ConnectionFailedException, DBAccessException;

/**
 *
 * @param pData
 * @param pTable
 * @param pFilter
 * @return
 * @throws ConnectionFailedException
 * @throws DBAccessException
 */
    public List selectVOFiltred(AUDIT pData, String pTable, String pFilter)
        throws ConnectionFailedException, DBAccessException;

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
        String pFilter) throws ConnectionFailedException, DBAccessException;

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
        throws ConnectionFailedException, DBAccessException;

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
        throws ConnectionFailedException, DBAccessException;
}
