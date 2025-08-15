// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:52:06 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   SqlUtils.java

package com.general.utils.sql;

import com.general.utils.RunTimeOut;
import java.io.PrintStream;
import java.sql.*;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package com.general.utils.sql:
//            ConnectionParameters

public class SqlUtils
{

    public SqlUtils(ConnectionParameters pCnxParam, int pTimeOut)
    {
        cnxParam = pCnxParam;
        timeOut = Math.max(1, pTimeOut);
    }

    public Object executeSentence(String pSentence)
        throws Throwable
    {
        return executeSentence(pSentence, 1);
    }

    public Object executeSentence(String pSentence, int pNumTries)
        throws Throwable
    {
        Object parameters_[] = {
            pSentence
        };
        String upperSentence_ = pSentence.toUpperCase();
        int sentenceType_ = 0;
        if(upperSentence_.startsWith("UPDATE"))
            sentenceType_ = 1;
        else
        if(upperSentence_.startsWith("SELECT"))
            sentenceType_ = 2;
        boolean retry_ = false;
        int triesCounter_ = 0;
        Object answer_ = null;
        do
        {
            retry_ = false;
            triesCounter_++;
            Connection conn_ = null;
            try
            {
                conn_ = getConnection();
            }
            catch(Exception e)
            {
                retry_ = triesCounter_ < pNumTries;
                if(!retry_)
                    throw e;
            }
            if(conn_ != null)
            {
                System.out.println("Trying to execute sentence " + pSentence);
                Statement st_ = null;
                try
                {
                    st_ = conn_.createStatement();
                    switch(sentenceType_)
                    {
                    case 0: // '\0'
                        answer_ = RunTimeOut.execute(st_, "execute", parameters_, timeOut);
                        System.out.println("Succesful sentence: " + answer_);
                        break;

                    case 1: // '\001'
                        answer_ = RunTimeOut.execute(st_, "executeUpdate", parameters_, timeOut);
                        System.out.println("Succesful update: " + answer_ + " records");
                        break;

                    case 2: // '\002'
                        ResultSet rs_ = (ResultSet)RunTimeOut.execute(st_, "executeQuery", parameters_, timeOut);
                        ResultSetMetaData rsm_ = rs_.getMetaData();
                        int numCols_ = rsm_.getColumnCount();
                        for(int i = 0; i < numCols_; i++)
                            System.out.print(rsm_.getColumnName(i + 1) + " " + rsm_.getColumnType(i + 1) + " (" + rsm_.getColumnDisplaySize(i + 1) + ") ");

                        answer_ = new Vector();
                        Vector row_;
                        for(; rs_.next(); ((Vector)answer_).addElement(row_))
                        {
                            row_ = new Vector();
                            for(int i = 1; i <= numCols_; i++)
                                row_.addElement(rs_.getString(i));

                        }

                        System.out.println("Succesful query: " + ((Vector)answer_).size() + " records");
                        break;
                    }
                }
                catch(Throwable e)
                {
                    System.out.println("Error doing sentence: " + e);
                    closeConnection();
                    retry_ = triesCounter_ < pNumTries;
                    if(!retry_)
                        throw e;
                }
                finally
                {
                    if(st_ != null)
                        try
                        {
                            st_.close();
                        }
                        catch(SQLException e) { }
                }
            }
        } while(retry_);
        return answer_;
    }

    private void closeConnection()
    {
        if(cnx != null)
            try
            {
                cnx.close();
            }
            catch(SQLException sqlexception) { }
            finally
            {
                cnx = null;
            }
    }

    private Connection getConnection()
        throws ClassNotFoundException, SQLException
    {
        if(cnx != null)
        {
            boolean isClosed_ = true;
            try
            {
                isClosed_ = cnx.isClosed();
            }
            catch(SQLException sqlEx)
            {
                System.out.println("Exception verifying connection: " + sqlEx);
                isClosed_ = true;
            }
            if(isClosed_)
            {
                System.out.println("Connection exists but is closed");
                cnx = null;
            }
        }
        if(cnx == null)
        {
            Class.forName(cnxParam.getClassName());
            System.out.println("Trying to get connection...");
            try
            {
                cnx = (Connection)RunTimeOut.execute(java.sql.DriverManager.class, "getConnection", new Object[] {
                    cnxParam.getUrl(), cnxParam.getUserName(), cnxParam.getPwd()
                }, timeOut);
            }
            catch(Throwable e)
            {
                throw (SQLException)e;
            }
        }
        return cnx;
    }

    public void finalize()
        throws Throwable
    {
        closeConnection();
        super.finalize();
    }

    public static void main(String arg[])
    {
        SqlUtils sql_ = new SqlUtils(new ConnectionParameters("com.ibm.as400.access.AS400JDBCDriver", "jdbc:as400://172.19.202.7/CMJARCH", "CAJASGPE01", "ASIC0428"), 30);
        try
        {
            Vector vector_ = (Vector)sql_.executeSentence("SELECT * FROM COMERTST");
            for(Enumeration iter = vector_.elements(); iter.hasMoreElements(); System.out.println())
            {
                Vector element = (Vector)iter.nextElement();
                String str;
                for(Enumeration iter1 = element.elements(); iter1.hasMoreElements(); System.out.print(str + ","))
                    str = (String)iter1.nextElement();

            }

            sql_.executeSentence("UPDATE COMERTST SET HORACIERRE = '16:00:00'");
        }
        catch(Throwable throwable) { }
    }

    private ConnectionParameters cnxParam;
    private Connection cnx;
    private int timeOut;
}