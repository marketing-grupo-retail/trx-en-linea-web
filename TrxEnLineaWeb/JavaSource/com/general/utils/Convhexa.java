// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:14 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Convhexa.java

package com.general.utils;


// Referenced classes of package com.general.utils:
//            StringFormatter

public class Convhexa
{

    public Convhexa()
    {
    }

    public static String intToHex(int intHex)
    {
        String strHex_ = Integer.toHexString(intHex).toUpperCase();
        return StringFormatter.align(strHex_, 2, '0', 0, 2);
    }

    public static String intToHex(byte byteArray[])
    {
        StringBuffer str_ = new StringBuffer("");
        for(int i = 0; i < byteArray.length; i++)
            str_.append(intToHex(byteArray[i]));

        return str_.toString();
    }

    public static int hexToInt(String strHex)
    {
        int strLen_ = strHex.trim().length();
        int respuesta_ = 0;
        for(int i = strLen_ - 1; i >= 0; i--)
        {
            char char_ = strHex.trim().toUpperCase().substring(i, i + 1).charAt(0);
            if(char_ >= '0' && char_ <= '9')
                respuesta_ = (int)((double)respuesta_ + (double)(char_ - 48) * Math.pow(16D, strLen_ - i - 1));
            else
            if(char_ >= 'A' && char_ <= 'F')
                respuesta_ = (int)((double)respuesta_ + (double)(char_ - 55) * Math.pow(16D, strLen_ - i - 1));
            else
                return 0;
        }

        return respuesta_;
    }
}