// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:21 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   PropertiesManager.java

package com.general.utils;

import java.io.*;
import java.util.Hashtable;
import java.util.Properties;

// Referenced classes of package com.general.utils:
//            FileUtils

public class PropertiesManager
{

    public PropertiesManager(String pFile)
    {
        this(pFile, true);
    }

    public PropertiesManager(String pFile, boolean pValideExist)
    {
        setFileName(pFile, pValideExist);
        loadConf();
    }

    public boolean loadConf()
    {
        boolean answer_ = false;
        FileInputStream input_ = null;
        if(props == null)
            props = new Properties();
        else
            props.clear();
        try
        {
            input_ = new FileInputStream(fileName);
            props.load(input_);
            answer_ = true;
        }
        catch(IOException ioexception) { }
        finally
        {
            if(input_ != null)
                try
                {
                    input_.close();
                }
                catch(IOException e) { }
        }
        return answer_;
    }

    public String getParameter(String pName)
    {
        String answer_ = null;
        Properties props_ = getProps();
        if(props_ != null)
            answer_ = props_.getProperty(pName);
        if(answer_ == null)
            return "";
        else
            return answer_;
    }

    public void setParameter(String pName, String pValue)
    {
        getProps().put(pName, pValue);
    }

    public Properties getProps()
    {
        if(props == null)
            loadConf();
        return props;
    }

    public void store(String pHeader)
        throws IOException
    {
        FileOutputStream os_ = null;
        try
        {
            os_ = new FileOutputStream(fileName);
            getProps().save(os_, pHeader);
        }
        finally
        {
            if(os_ != null)
                try
                {
                    os_.close();
                }
                catch(IOException e) { }
        }
    }

    public static void main(String arg[])
    {
        String fileName_ = FileUtils.getValidFileName("R::c:/java/bin/pruebita.xxx");
        PropertiesManager prop_ = new PropertiesManager(fileName_, false);
        prop_.setParameter("TEST", "MYTEST");
        try
        {
            prop_.store("THIS IS MY TEST");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void setFileName(String string)
    {
        setFileName(string, true);
    }

    public void setFileName(String string, boolean pValideExist)
    {
        System.out.println("Setting filename " + string);
        File file_ = new File(string);
        if(pValideExist && !file_.exists())
        {
            string = file_.getName();
            System.out.println("Valid filename: " + string);
        }
        fileName = string;
    }

    private String fileName;
    private Properties props;
}