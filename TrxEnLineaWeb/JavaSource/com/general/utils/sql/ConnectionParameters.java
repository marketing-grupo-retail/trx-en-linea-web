// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:52:06 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   ConnectionParameters.java

package com.general.utils.sql;


public class ConnectionParameters
{

    public ConnectionParameters(String pClass, String pUrl, String pUser, String pPwd)
    {
        className = pClass;
        url = pUrl;
        userName = pUser;
        pwd = pPwd;
    }

    public String toString()
    {
        return "Class: " + className + "/" + "Url: " + url + "/" + "User: " + userName + "/" + "Pwd: " + pwd + "/";
    }

    public boolean equals(Object pObj)
    {
        boolean answer_ = false;
        try
        {
            ConnectionParameters connP_ = (ConnectionParameters)pObj;
            answer_ = connP_.className.equals(className) && connP_.url.equals(url) && connP_.userName.equals(userName) && connP_.pwd.equals(pwd);
        }
        catch(Exception exception) { }
        return answer_;
    }

    public String getClassName()
    {
        return className;
    }

    public String getPwd()
    {
        return pwd;
    }

    public String getUrl()
    {
        return url;
    }

    public String getUserName()
    {
        return userName;
    }

    private String className;
    private String url;
    private String userName;
    private String pwd;
}