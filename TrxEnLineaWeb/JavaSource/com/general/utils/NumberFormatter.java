// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:19 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   NumberFormatter.java

package com.general.utils;

import java.io.PrintStream;
import java.text.*;

// Referenced classes of package com.general.utils:
//            StringFormatter

public class NumberFormatter
{

    public NumberFormatter()
    {
    }

    public static String eliminarChar(String pStr, char pChar)
    {
        for(int position_ = pStr.indexOf(String.valueOf(pChar)); position_ != -1; position_ = pStr.indexOf(String.valueOf(pChar)))
            pStr = pStr.substring(0, position_) + (position_ >= pStr.length() - 1 ? "" : pStr.substring(position_ + 1, pStr.length()));

        return pStr;
    }

    public static String ignoreNoDigits(String pStr)
    {
        StringBuffer strB_ = new StringBuffer("");
        for(int i = 0; i < pStr.length(); i++)
        {
            char parcialChar_ = pStr.charAt(i);
            if(Character.isDigit(parcialChar_))
                strB_.append(parcialChar_);
        }

        return strB_.toString();
    }

    public static String formatoMoneda(double pValor)
    {
        return formatoMoneda(pValor, CURRENCY_SYMBOL);
    }

    public static String formatoMoneda(double pValor, char pCurrencySymbol)
    {
        return pCurrencySymbol + formatoNumero(pValor);
    }

    public static String formatoMoneda(double pValor, String pFormato, char pCurrencySymbol)
    {
        return pCurrencySymbol + formatoNumero(pValor, pFormato);
    }

    public static String formatoMoneda(double pValor, String pFormato)
    {
        return formatoMoneda(pValor, pFormato, CURRENCY_SYMBOL);
    }

    public static String formatoNumero(double pValor)
    {
        return getDecimalFormat().format(pValor);
    }

    public static String formatoNumero(double pValor, String pFormato)
    {
        String answer_ = null;
        try
        {
            DecimalFormatSymbols dfs_ = new DecimalFormatSymbols();
            dfs_.setDecimalSeparator(DECIMAL_SYMBOL);
            dfs_.setGroupingSeparator(MILES_SEPARATOR);
            DecimalFormat df_ = new DecimalFormat(pFormato);
            df_.setDecimalFormatSymbols(dfs_);
            answer_ = df_.format(pValor);
        }
        catch(Exception ex)
        {
            answer_ = getDecimalFormat().format(pValor);
        }
        return answer_;
    }

    public static String formatoNumero(double pValor, String pFormato, char pMiles, char pDecimal)
    {
        char orgMiles_ = MILES_SEPARATOR;
        char orgDecimal_ = DECIMAL_SYMBOL;
        setMILES_SEPARATOR(pMiles);
        setDECIMAL_SYMBOL(pDecimal);
        String answer_ = formatoNumero(pValor, pFormato);
        setDECIMAL_SYMBOL(orgDecimal_);
        setMILES_SEPARATOR(orgMiles_);
        return answer_;
    }

    private static void generateDf()
    {
        DecimalFormatSymbols dfs_ = new DecimalFormatSymbols();
        dfs_.setDecimalSeparator(DECIMAL_SYMBOL);
        dfs_.setGroupingSeparator(MILES_SEPARATOR);
        if(decimalFormat == null)
        {
            String format_ = "#,###" + (numDecimales <= 0 ? "" : "." + StringFormatter.align("0", numDecimales, '0', 0, numDecimales));
            decimalFormat = new DecimalFormat(format_);
        }
        decimalFormat.setDecimalFormatSymbols(dfs_);
    }

    public static String ajusteDecimales(String pCifra, int pNumDecimalesOrigen, int pNumDecimalesDestino, char pDecimalChar)
    {
        pCifra = eliminarChar(pCifra, '.');
        try
        {
            String formato_ = "0" + (pNumDecimalesDestino <= 0 ? "" : ".") + StringFormatter.align("0", pNumDecimalesDestino, '0', 1, pNumDecimalesDestino);
            String strValorOrigen_ = pCifra.substring(0, pCifra.length() - pNumDecimalesOrigen) + "." + pCifra.substring(pCifra.length() - pNumDecimalesOrigen, pCifra.length());
            double dobValorOrigen_ = Double.valueOf(strValorOrigen_).doubleValue();
            String strValorDestino_ = formatoNumero(dobValorOrigen_, formato_);
            if(pDecimalChar == 0)
                return eliminarChar(strValorDestino_, DECIMAL_SYMBOL);
            else
                return strValorDestino_.replace(DECIMAL_SYMBOL, pDecimalChar);
        }
        catch(Exception ex)
        {
            return "0";
        }
    }

    public static char getMILES_SEPARATOR()
    {
        return MILES_SEPARATOR;
    }

    public static void setMILES_SEPARATOR(char pMILES_SEPARATOR)
    {
        MILES_SEPARATOR = pMILES_SEPARATOR;
        generateDf();
    }

    public static char getDECIMAL_SYMBOL()
    {
        return DECIMAL_SYMBOL;
    }

    public static void setDECIMAL_SYMBOL(char pDECIMAL_SYMBOL)
    {
        DECIMAL_SYMBOL = pDECIMAL_SYMBOL;
        generateDf();
    }

    public static char getCURRENCY_SYMBOL()
    {
        return CURRENCY_SYMBOL;
    }

    public static void setCURRENCY_SYMBOL(char pCURRENCY_SYMBOL)
    {
        CURRENCY_SYMBOL = pCURRENCY_SYMBOL;
    }

    public static int getNumDecimales()
    {
        return numDecimales;
    }

    public static void setNumDecimales(int pNumDecimales)
    {
        numDecimales = pNumDecimales;
        decimalFormat = null;
        generateDf();
    }

    private static DecimalFormat getDecimalFormat()
    {
        if(decimalFormat == null)
            generateDf();
        return decimalFormat;
    }

    public static String longToBinary(long pValue)
    {
        StringBuffer strBuff_ = new StringBuffer();
        for(int bitCounter_ = 31; bitCounter_ >= 0; bitCounter_--)
        {
            String str_ = null;
            if(((long)(1 << bitCounter_) & pValue) != 0L)
                str_ = "1";
            else
                str_ = "0";
            strBuff_.append(str_);
        }

        return strBuff_.toString();
    }

    public static long binaryToLong(String pValue)
    {
        pValue = pValue.trim();
        int sign_ = pValue.length() != 32 ? 1 : -1;
        int intParcial_ = pValue.charAt(0) - 48;
        intParcial_ = intParcial_ == 1 ? 1 : 0;
        long answer_ = (long)sign_ * (long)Math.pow(2D, pValue.length() - 1) * (long)intParcial_;
        for(int i = 1; i < pValue.length(); i++)
        {
            intParcial_ = pValue.charAt(i) - 48;
            intParcial_ = intParcial_ == 1 ? 1 : 0;
            long parcial_ = (long)Math.pow(2D, pValue.length() - i - 1) * (long)intParcial_;
            answer_ += parcial_;
        }

        return answer_;
    }

    public static void main(String args[])
    {
        System.out.println(formatoNumero(2D, "000000"));
        System.out.println(formatoMoneda(91236845D));
    }

    private static char MILES_SEPARATOR = '.';
    private static char DECIMAL_SYMBOL = ',';
    private static char CURRENCY_SYMBOL = '$';
    private static int numDecimales = 2;
    private static DecimalFormat decimalFormat;

}