// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:22 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   StringFormatter.java

package com.general.utils;

import java.io.PrintStream;
import java.sql.Timestamp;

public class StringFormatter
{

    public StringFormatter()
    {
    }
	
	//despl: cadena a ajustar;         offset: número de caracteres con que debe quedar la cadena ajustada
	//caracter: caracter de relleno;   pos: Tipo de alineamiento 0:derecha 
	//tamaño: número de caracteres con que debe quedar la cadena ajustada
    public static String align(String despl, int offset, char caracter, int pos, int tamano)
    {
        if(despl == null)
            despl = "";
        int longitud = despl.length();
        int relleno = offset - longitud;
        String rta = "";
        StringBuffer str_ = new StringBuffer(despl != null ? despl : "");
        switch(pos)
        {
        default:
            break;

        case 0: // '\0'
            for(int i = 0; i < relleno; i++)
                str_.insert(0, caracter);

            break;

        case 1: // '\001'
            for(int i = 0; i < relleno; i++)
                str_.append(caracter);

            break;

        case 2: // '\002'
            int midRelleno_ = relleno / 2;
            for(int i = 0; i < midRelleno_; i++)
                str_.insert(0, caracter);

            for(int i = 0; i < relleno - midRelleno_; i++)
                str_.append(caracter);

            break;
        }
        //System.out.println(str_.toString());
        return str_.toString().substring(0, Math.max(0, Math.min(offset, tamano)));
    }

    public static String space(int pSpaces)
    {
        StringBuffer str_ = new StringBuffer("");
        for(int i = 0; i < pSpaces; i++)
            str_.append(' ');

        return str_.toString();
    }

    public static String alignIzqDer(String pStrIzq, String pStrDer, int pAncho)
    {
        int longIzq_ = Math.max(1, pAncho - pStrDer.length() - 1);
        return align(pStrIzq, longIzq_, ' ', 1, longIzq_) + pStrDer;
    }

    public static String alignIzqCenDer(String pStrIzq, String pStrCen, String pStrDer, int pAncho)
    {
        int longCen_ = Math.min(pAncho, pStrCen.length());
        int longIzq_ = Math.max(0, pAncho - pStrCen.length()) / 2;
        int longDer_ = pAncho - longIzq_ - longCen_;
        return align(pStrIzq, longIzq_, ' ', 1, longIzq_) + align(pStrCen, longCen_, ' ', 2, longCen_) + align(pStrDer, longDer_, ' ', 0, longDer_);
    }

    public static String replace(String pStr1, String pStr2)
    {
        return replace(pStr1, pStr2, null);
    }

    public static String replace(String pStr1, String pStr2, String pStr3)
    {
        pStr3 = pStr3 != null ? pStr3 : "";
        for(int pos1_ = -1; (pos1_ = pStr1.indexOf(pStr2)) > -1;)
            pStr1 = pStr1.substring(0, pos1_) + pStr3 + pStr1.substring(pos1_ + pStr2.length());

        return pStr1;
    }

    public static int occurs(String pStr1, String pStr2)
    {
        int answer_ = 0;
        for(int index_ = 0; (index_ = pStr1.indexOf(pStr2, index_)) > -1; index_++)
        {
            System.out.println(index_);
            answer_++;
        }

        return answer_;
    }

    public static String readStringToChar(String pStr, int pPos1, int pLen)
    {
        return readStringToChar(pStr, pPos1, pLen, false);
    }

    public static String readStringToChar(String pStr, int pPos1, int pLen, boolean pDisplayReading)
    {
        StringBuffer str_ = new StringBuffer();
        StringBuffer str1_ = new StringBuffer();
        for(int i = pPos1; i < pPos1 + pLen; i++)
        {
            char charParcial_ = pStr.charAt(i);
            if(pDisplayReading)
                str1_.append(charParcial_ + ",");
            if(charParcial_ == '\r' || charParcial_ == '=')
                str_.append('=');
            else
                str_.append(charParcial_);
        }

        if(pDisplayReading)
            System.out.println(str1_.toString());
        return str_.toString();
    }

    public static String readStringToChar1(String pStr, int pPos1, int pLen)
    {
        return readStringToChar1(pStr, pPos1, pLen, false);
    }

    public static String readStringToChar1(String pStr, int pPos1, int pLen, boolean pDisplayReading)
    {
        StringBuffer str_ = new StringBuffer();
        StringBuffer str1_ = new StringBuffer();
        for(int i = pPos1; i < pPos1 + pLen; i++)
        {
            char charParcial_ = (char)(pStr.charAt(i) + 32);
            if(pDisplayReading)
                str1_.append(charParcial_ + ",");
            str_.append(charParcial_);
        }

        if(pDisplayReading)
            System.out.println(str1_.toString());
        return str_.toString();
    }

    public static String ltrim(String pStr)
    {
        return removeCharsOnLeft(pStr, ' ');
    }

    public static String rtrim(String pStr)
    {
        return removeCharsOnRight(pStr, ' ');
    }

    public static String removeCharsOnLeft(String pStr, char pChar)
    {
        int ubic_;
        for(ubic_ = 0; ubic_ < pStr.length() && pStr.charAt(ubic_) == pChar; ubic_++);
        return pStr.substring(ubic_);
    }

    public static String removeCharsOnRight(String pStr, char pChar)
    {
        int ubic_;
        for(ubic_ = pStr.length() - 1; ubic_ >= 0 && pStr.charAt(ubic_) == pChar; ubic_--);
        return pStr.substring(0, ubic_ + 1);
    }

    public static void main(String arg[])
    {
        Timestamp time_ = new Timestamp(0x1cfefL);
        System.out.println(time_);
    }

    public static final int ALIGN_RIGHT = 0;
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_CENTER = 2;
}