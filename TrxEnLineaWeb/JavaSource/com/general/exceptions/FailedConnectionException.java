// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:49:44 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   FailedConnectionException.java

package com.general.exceptions;


public class FailedConnectionException extends Exception
{

    public FailedConnectionException()
    {
        super("Failed Connection");
    }

    public FailedConnectionException(String s)
    {
        super(s);
    }
}