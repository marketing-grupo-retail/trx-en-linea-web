// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:14 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Trama.java

package com.general.utils;

import java.util.*;

// Referenced classes of package com.general.utils:
//            StringFormatter

public class Trama
{

    public static void putSequence(String pFieldArray[])
    {
        for(int i = 0; i < pFieldArray.length; i++)
            addSequence(pFieldArray[i], i);

    }

    private static void addSequence(String pKey, int pPos)
    {
        if(fieldSequence == null)
            fieldSequence = new Hashtable();
        String realKey_ = pKey.trim().toUpperCase();
        fieldSequence.put(realKey_, new Integer(pPos));
    }

    public static int getSequence(String pKey)
    {
        if(fieldSequence == null)
        {
            return 0;
        } else
        {
            String realKey_ = pKey.trim().toUpperCase();
            Integer obj_ = (Integer)fieldSequence.get(realKey_);
            return obj_.intValue();
        }
    }

    public Trama(int pArray[][])
    {
        setParseArray(pArray);
    }

    private int[] getStructure(int pPosition)
    {
        if(parseArray != null && pPosition < parseArray.length && parseArray[pPosition].length > 1)
            return parseArray[pPosition];
        else
            return DEFAULT_STRUCTURE;
    }

    public void setData(String pValue, int pPosition)
    {
        Vector data_ = getData();
        int structure_[] = getStructure(pPosition);
        int len_ = structure_[0];
        int type_ = structure_[1];
        String str_ = null;
        switch(type_)
        {
        case 0: // '\0'
            str_ = StringFormatter.align(pValue, len_, '0', 0, len_);
            break;

        case 1: // '\001'
        default:
            if(pValue == null)
                pValue = "";
            if(pPosition == parseArray.length - 1 && pValue.equals(""))
                str_ = pValue;
            else
                str_ = StringFormatter.align(pValue, len_, ' ', 1, len_);
            break;
        }
        for(int i = 0; i < (pPosition - data_.size()) + 1; i++)
            data_.addElement(null);

        data_.setElementAt(str_, pPosition);
    }

    public void setDelimitedData(String pData, String pDelim)
    {
        StringTokenizer strToken_ = new StringTokenizer(pData, pDelim);
        for(int i = 0; strToken_.hasMoreTokens(); i++)
        {
            String value_ = strToken_.nextToken();
            setData(value_, i);
        }

    }

    public final void setData(String pData)
    {
        Vector data_ = getData();
        boolean continue_ = true;
        int actualPosition_ = 0;
        for(int i = 0; i < data_.size() && continue_; i++)
        {
            int structure_[] = getStructure(i);
            String str_ = null;
            int nextPosition_ = actualPosition_ + structure_[0];
            if(pData.length() >= nextPosition_)
            {
                str_ = pData.substring(actualPosition_, nextPosition_);
            } else
            {
                str_ = pData.substring(actualPosition_);
                continue_ = false;
            }
            data_.setElementAt(str_, i);
            actualPosition_ = nextPosition_;
        }

    }

    public void setData(double pValue, int pPosition)
    {
        Vector data_ = getData();
        int structure_[] = getStructure(pPosition);
        int type_ = structure_[1];
        int numDec_ = structure_.length <= 2 ? 2 : structure_[2];
        setData(getFormattedNumber(pValue, numDec_), pPosition);
    }

    public double getNumericalValue(int pPosition)
    {
        double answer_ = -1D;
        Vector data_ = getData();
        int structure_[] = getStructure(pPosition);
        int type_ = structure_[1];
        String str_ = getData(pPosition);
        if(str_ != null && type_ == 0)
        {
            int numDec_ = structure_.length <= 2 ? 2 : structure_[2];
            try
            {
                double value0_ = Double.valueOf(str_).doubleValue();
                answer_ = Math.pow(10D, -numDec_) * value0_;
            }
            catch(RuntimeException runtimeexception) { }
        }
        return answer_;
    }

    public String getData(String pFieldName)
    {
        return getData(getSequence(pFieldName));
    }

    public String getData(int pPosition)
    {
        Vector data_ = getData();
        if(pPosition < data_.size())
            return (String)data_.elementAt(pPosition);
        else
            return null;
    }

    public String getTrama()
    {
        StringBuffer str_ = new StringBuffer();
        Vector data_ = getData();
        for(int i = 0; i < data_.size(); i++)
            str_.append((String)data_.elementAt(i));

        return str_.toString();
    }

    public String getFormattedNumber(double pNumber, int pNumDec)
    {
        int int_ = (int)pNumber;
        int frac_ = (int)Math.round(Math.pow(10D, pNumDec) * (pNumber - (double)int_));
        String str_ = String.valueOf(int_) + StringFormatter.align(String.valueOf(frac_), pNumDec, '0', 1, pNumDec);
        return str_;
    }

    private void initializeData()
    {
        for(int i = 0; i < parseArray.length; i++)
            setData("", i);

    }

    public Vector getData()
    {
        if(data == null)
        {
            data = new Vector();
            initializeData();
        }
        return data;
    }

    public int[][] getParseArray()
    {
        return parseArray;
    }

    public void setParseArray(int parseArray[][])
    {
        this.parseArray = parseArray;
        acumParseArray = new int[parseArray.length];
        acumParseArray[0] = parseArray[0][0];
        for(int i = 1; i < parseArray.length; i++)
            acumParseArray[i] = acumParseArray[i - 1] + parseArray[i][0];

    }

    public static final int DEFAULT_LENGTH = 10;
    public static final int DEFAULT_TYPE = 1;
    public static final int DEFAULT_NUM_DEC = 2;
    public static final int DEFAULT_STRUCTURE[] = {
        10, 1
    };
    public static final int TYPE_NUMBER = 0;
    public static final int TYPE_STRING = 1;
    private static Hashtable fieldSequence;
    private int parseArray[][];
    private int acumParseArray[];
    private Vector data;

}