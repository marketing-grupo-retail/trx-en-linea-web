// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:12 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   BasicSequentialFileReader.java

package com.general.utils;

import java.io.*;
import java.util.*;

public class BasicSequentialFileReader
{

    public BasicSequentialFileReader()
    {
    }

    public static String getRecord(String pFileName, int pLineNumber)
    {
        String answer_ = null;
        pFileName = pFileName.toUpperCase().trim();
        Vector data_ = (Vector)getDataTable().get(pFileName);
        if(data_ == null)
            try
            {
                data_ = readSequentialFile(pFileName);
                dataTable.put(pFileName, data_);
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(data_ != null && data_.size() > pLineNumber)
            answer_ = (String)data_.elementAt(pLineNumber);
        return answer_;
    }

    public static String getRecord(String pFileName, String pLineNumber, String pColumnNumber)
    {
        return getRecord(pFileName, Integer.parseInt(pLineNumber), Integer.parseInt(pColumnNumber));
    }

    public static String getRecord(String pFileName, int pLineNumber, int pColumnNumber)
    {
        String answer_ = null;
        String line_ = getRecord(pFileName, pLineNumber);
        if(line_ != null)
        {
            StringTokenizer strToken_ = new StringTokenizer(line_, String.valueOf('"'));
            for(int i = 0; i <= pColumnNumber && strToken_.hasMoreTokens(); i++)
            {
                answer_ = strToken_.nextToken();
                if(answer_ != null && answer_.equals(",") && strToken_.hasMoreTokens())
                    answer_ = strToken_.nextToken();
            }

        }
        return answer_.replace('"', ' ').trim();
    }

    private static Vector readSequentialFile(String pFileName)
        throws FileNotFoundException, IOException
    {
        File file_ = new File(pFileName);
        if(!file_.exists() || !file_.isFile())
            throw new FileNotFoundException(pFileName);
        Vector answer_ = new Vector();
        FileInputStream is_ = null;
        InputStreamReader isr_ = null;
        BufferedReader br_ = null;
        try
        {
            is_ = new FileInputStream(file_);
            isr_ = new InputStreamReader(is_);
            br_ = new BufferedReader(isr_);
            String line_ = null;
            do
            {
                line_ = br_.readLine();
                if(line_ != null)
                    answer_.addElement(line_);
            } while(line_ != null);
        }
        finally
        {
            if(br_ != null)
                try
                {
                    br_.close();
                }
                catch(Exception exception1) { }
            if(isr_ != null)
                try
                {
                    isr_.close();
                }
                catch(Exception exception2) { }
            if(is_ != null)
                try
                {
                    is_.close();
                }
                catch(Exception e) { }
        }
        return answer_;
    }

    private static Hashtable getDataTable()
    {
        if(dataTable == null)
            dataTable = new Hashtable();
        return dataTable;
    }

    public static void main(String argv[])
    {
        String fileName_ = "D:/ASIC/proyectos/ApplManager/dev/lib/apiparm.dat";
       /* System.out.println(getRecord(fileName_, 4));
        System.out.println(getRecord(fileName_, 4, 0));
        System.out.println(getRecord(fileName_, 4, 1));*/
    }

    private static Hashtable dataTable;
}