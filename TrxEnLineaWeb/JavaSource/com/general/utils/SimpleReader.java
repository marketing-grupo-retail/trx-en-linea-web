// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:22 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   SimpleReader.java

package com.general.utils;

import java.io.IOException;
import java.io.InputStream;

public class SimpleReader
{

    public SimpleReader(InputStream pIo)
    {
        SALTO_LINEA_STRING = new String(SALTO_LINEA);
        io = pIo;
    }

    public String readLine()
        throws IOException
    {
        StringBuffer answer_ = new StringBuffer();
        int lecturaAnt_ = -1;
        int lectura_ = -1;
        for(boolean saltoLinea_ = false; (lectura_ = io.read()) != -1 && !saltoLinea_;)
        {
            saltoLinea_ = lecturaAnt_ == SALTO_LINEA[0] && lectura_ == SALTO_LINEA[1];
            answer_.append((char)lectura_);
            lecturaAnt_ = lectura_;
        }

        if(lecturaAnt_ == -1)
            return null;
        String strAnswer_ = answer_.toString();
        if(strAnswer_.endsWith(SALTO_LINEA_STRING))
            strAnswer_ = strAnswer_.substring(0, strAnswer_.length() - 2);
        return strAnswer_;
    }

    public void close()
        throws IOException
    {
        io.close();
    }

    private InputStream io;
    private final byte SALTO_LINEA[] = {
        13, 10
    };
    private final String SALTO_LINEA_STRING;
}