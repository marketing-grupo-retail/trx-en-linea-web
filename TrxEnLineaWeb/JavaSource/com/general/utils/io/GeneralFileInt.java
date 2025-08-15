// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:51:20 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   GeneralFileInt.java

package com.general.utils.io;


public interface GeneralFileInt
{

    public abstract void goTop();

    public abstract String readCurrentLine();

    public abstract long getCurrentLine();

    public abstract void close();
}