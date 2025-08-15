// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:10 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   ArrayUtils.java

package com.general.utils;

import java.util.Enumeration;
import java.util.Vector;

public class ArrayUtils
{

    public ArrayUtils()
    {
    }

    public static boolean compareArrays(byte pArray1[], byte pArray2[])
    {
        int nullCount_ = (pArray1 != null ? 0 : 1) + (pArray2 != null ? 0 : 1);
        switch(nullCount_)
        {
        case 1: // '\001'
            return false;

        case 2: // '\002'
            return true;

        case 0: // '\0'
            boolean answer_ = nullCount_ == 2 || pArray1.length == pArray2.length;
            if(answer_)
            {
                for(int i = 0; i < pArray1.length && answer_; i++)
                    answer_ = pArray1[i] == pArray2[i];

            }
            return answer_;
        }
        return false;
    }

    public static boolean compareArrays(int pArray1[], int pArray2[])
    {
        int nullCount_ = (pArray1 != null ? 0 : 1) + (pArray2 != null ? 0 : 1);
        switch(nullCount_)
        {
        case 1: // '\001'
            return false;

        case 2: // '\002'
            return true;

        case 0: // '\0'
            boolean answer_ = nullCount_ == 2 || pArray1.length == pArray2.length;
            if(answer_)
            {
                for(int i = 0; i < pArray1.length && answer_; i++)
                    answer_ = pArray1[i] == pArray2[i];

            }
            return answer_;
        }
        return false;
    }

    public static int getPositionArray(int pArray[], int pValue)
    {
        int position_ = 0;
        for(position_ = 0; position_ < pArray.length && pArray[position_] != pValue; position_++);
        if(position_ == pArray.length)
            return -1;
        else
            return position_;
    }

    public static int getPositionArray(char pArray[], char pValue)
    {
        int position_ = 0;
        for(position_ = 0; position_ < pArray.length && pArray[position_] != pValue; position_++);
        if(position_ == pArray.length)
            return -1;
        else
            return position_;
    }

    public static boolean compareArrays(Object pArray1[], Object pArray2[])
    {
        int nullCount_ = (pArray1 != null ? 0 : 1) + (pArray2 != null ? 0 : 1);
        switch(nullCount_)
        {
        case 1: // '\001'
            return false;

        case 2: // '\002'
            return true;

        case 0: // '\0'
            boolean answer_ = nullCount_ == 2 || pArray1.length == pArray2.length;
            if(answer_)
            {
                for(int i = 0; i < pArray1.length && answer_; i++)
                    answer_ = pArray1[i].equals(pArray2[i]);

            }
            return answer_;
        }
        return false;
    }

    public static String[] convertStringVectorToArray(Vector pStringVector)
    {
        String array_[] = new String[pStringVector.size()];
        int i = 0;
        for(Enumeration iter = pStringVector.elements(); iter.hasMoreElements();)
        {
            String element = (String)iter.nextElement();
            array_[i] = element;
            i++;
        }

        return array_;
    }
}