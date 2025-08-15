// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:14 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   DateFormatter.java

package com.general.utils;

import java.io.PrintStream;
import java.sql.Timestamp;
import java.text.*;
import java.util.*;

// Referenced classes of package com.general.utils:
//            StringFormatter, NumberFormatter

public class DateFormatter
{

    public DateFormatter()
    {
    }

    public static String getActualDate()
    {
        return getActualDate("");
    }

    public static String getActualDate(String pSeparator)
    {
        Calendar cal_ = Calendar.getInstance();
        int year_ = cal_.get(1);
        int month_ = cal_.get(2) + 1;
        int day_ = cal_.get(5);
        return String.valueOf(year_) + pSeparator + (month_ >= 10 ? "" : "0") + String.valueOf(month_) + pSeparator + (day_ >= 10 ? "" : "0") + String.valueOf(day_);
    }

    public static String getActualDate(int pDays)
    {
        Calendar cal_ = Calendar.getInstance();
        cal_.add(5, pDays);
        int year_ = cal_.get(1);
        int month_ = cal_.get(2) + 1;
        int day_ = cal_.get(5);
        return String.valueOf(year_) + (month_ >= 10 ? "" : "0") + String.valueOf(month_) + (day_ >= 10 ? "" : "0") + String.valueOf(day_);
    }

    public static int getActualDay()
    {
        Calendar cal_ = Calendar.getInstance();
        return cal_.get(5);
    }

    public static String getDayOfYear()
    {
        Calendar cal_ = Calendar.getInstance();
        return StringFormatter.align(String.valueOf(cal_.get(6)), 3, '0', 0, 3);
    }

    public static long getActualDateInMilliSeconds()
    {
        Calendar cal_ = Calendar.getInstance();
        return cal_.getTime().getTime();
    }

    public static long getActualDateInSeconds()
    {
        return getActualDateInMilliSeconds() / 1000L;
    }

    public static Timestamp getActualTime()
    {
        return Timestamp.valueOf(getActualDate("-") + " 00:00:00");
    }

    public static String getActualHour()
    {
        return getActualHour("");
    }

    public static String getActualHour(String pSeparator)
    {
        Calendar cal_ = Calendar.getInstance();
        int hour_ = cal_.get(11);
        int minute_ = cal_.get(12);
        int second_ = cal_.get(13);
        return (hour_ >= 10 ? "" : "0") + String.valueOf(hour_) + pSeparator + (minute_ >= 10 ? "" : "0") + String.valueOf(minute_) + pSeparator + (second_ >= 10 ? "" : "0") + String.valueOf(second_);
    }

    public static int getActualMils()
    {
        Calendar cal_ = Calendar.getInstance();
        return cal_.get(14);
    }

    public static String getMonthName(int pMonth)
    {
        if(pMonth > 0 && pMonth < 13)
            return MONTH_NAMES[pMonth - 1];
        else
            return "";
    }

    public static String formatoFecha(Date pDate, String pFormat)
    {
        aFormat.applyPattern(pFormat);
        return aFormat.format(pDate);
    }

    public static double convertHour(String pHour)
        throws Exception
    {
        StringTokenizer strToken_ = new StringTokenizer(pHour, ":");
        int div_ = 1;
        double minValue_ = 0.0D;
        double maxValue_ = 23.989999999999998D;
        double answer_ = 0.0D;
        while(strToken_.hasMoreTokens()) 
        {
            double parcial_ = 0.0D;
            try
            {
                parcial_ = Double.valueOf(strToken_.nextToken()).doubleValue();
                if(parcial_ < minValue_ || parcial_ > maxValue_)
                    throw new Exception("invalid time format: " + pHour);
            }
            catch(Exception ex)
            {
                throw new Exception("invalid time format: " + pHour);
            }
            answer_ += parcial_ / (double)div_;
            div_ *= 60;
            maxValue_ = 59.990000000000002D;
        }
        return answer_;
    }

    public static String convertDoubleHourToString(double pTime)
    {
        int int_ = (int)pTime;
        StringBuffer str_ = new StringBuffer(String.valueOf(int_) + "h ");
        double partial_ = pTime;
        double dif_ = partial_ - (double)int_;
        int_ = (int)(dif_ * 60D);
        str_.append(String.valueOf(int_) + "'");
        partial_ = dif_ * 60D;
        dif_ = partial_ - (double)int_;
        int_ = (int)(dif_ * 60D);
        str_.append(String.valueOf(int_) + '"');
        partial_ = dif_ * 60D;
        return str_.toString();
    }

    public static int getActualCentury()
    {
        Calendar cal_ = Calendar.getInstance();
        int actualYear_ = cal_.get(1);
        int actualCentury_ = (int)Math.ceil(((double)actualYear_ + 0.10000000000000001D) / 100D);
        return actualCentury_;
    }

    public static String getFullDate(String pDate)
    {
        if(pDate.length() < 14)
        {
            int actualCentury_ = getActualCentury();
            String strCentury_ = NumberFormatter.formatoNumero(actualCentury_ - 1, "00");
            pDate = strCentury_ + pDate.substring(Math.max(0, pDate.length() - 12));
        }
        return pDate;
    }

    public static void main(String args[])
    {
        String time_ = "18:30:20";
        try
        {
         //   System.out.println(convertHour(time_));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    private static SimpleDateFormat aFormat;
    private static DateFormatSymbols aDfs;
    private static final String MONTH_NAMES[] = {
        "ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", 
        "NOV", "DIC"
    };

    static 
    {
        aFormat = new SimpleDateFormat();
        aDfs = new DateFormatSymbols();
        aDfs.setMonths(MONTH_NAMES);
        aFormat.setDateFormatSymbols(aDfs);
    }
}