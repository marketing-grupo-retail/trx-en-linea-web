// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:49:44 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   TimeoutException.java

package com.general.exceptions;


public class TimeoutException extends Exception
{

    public TimeoutException()
    {
        super("Time out reached");
    }

    public TimeoutException(String arg0)
    {
        super(arg0);
    }
}