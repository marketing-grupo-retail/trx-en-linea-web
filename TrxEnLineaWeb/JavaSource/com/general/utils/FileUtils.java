// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:15 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   FileUtils.java

package com.general.utils;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class FileUtils
{

    public FileUtils()
    {
    }

    public static void writeSequentialFile(String pFileName, Vector pData, boolean pAppend)
        throws IOException
    {
        FileOutputStream os_ = null;
        OutputStreamWriter osw_ = null;
        BufferedWriter bw_ = null;
        try
        {
            os_ = new FileOutputStream(pFileName, pAppend);
            osw_ = new OutputStreamWriter(os_);
            bw_ = new BufferedWriter(osw_);
            for(Enumeration iter = pData.elements(); iter.hasMoreElements(); bw_.newLine())
            {
                Object element = iter.nextElement();
                bw_.write(element.toString());
            }

        }
        finally
        {
            if(bw_ != null)
                try
                {
                    bw_.close();
                }
                catch(IOException ioexception) { }
            if(osw_ != null)
                try
                {
                    osw_.close();
                }
                catch(IOException ioexception1) { }
            if(os_ != null)
                try
                {
                    os_.close();
                }
                catch(IOException e) { }
        }
    }

    public static Vector readSequentialFile(String pFileName)
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

    public static String getValidFileName(String pName)
    {
        return getValidFileName(pName, false);
    }

    public static String getValidFileName(String pName, boolean pIgnorePrefix)
    {
       // System.out.println("Validating " + pName);
        if(pName == null)
            return "null";
        pName = pName.trim().toUpperCase();
        if(pName.startsWith("R::"))
            if(!pIgnorePrefix)
            {
                System.out.println("searching parent...");
                File parent_ = new File(pName);
                System.out.println(parent_);
                if(!parent_.exists())
                    pName = pName.substring(3);
            } else
            {
                pName = pName.substring(3);
            }
        System.out.println("Valid filename: " + pName);
        return pName;
    }
}