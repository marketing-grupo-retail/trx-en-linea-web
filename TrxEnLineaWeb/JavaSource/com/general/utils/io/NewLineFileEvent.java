// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:51:24 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   NewLineFileEvent.java

package com.general.utils.io;

import java.util.EventObject;

public class NewLineFileEvent extends EventObject
{

    public NewLineFileEvent(Object arg0)
    {
        super(arg0);
    }

    public NewLineFileEvent(Object arg0, String pLine, long pLineNumber)
    {
        super(arg0);
        setLine(pLine);
        setLineNumber(pLineNumber);
    }

    public String getLine()
    {
        return line;
    }

    public void setLine(String string)
    {
        line = string;
    }

    public String toString()
    {
        return "New line added: " + getLine();
    }

    public long getLineNumber()
    {
        return lineNumber;
    }

    public void setLineNumber(long l)
    {
        lineNumber = l;
    }

    private String line;
    private long lineNumber;
}