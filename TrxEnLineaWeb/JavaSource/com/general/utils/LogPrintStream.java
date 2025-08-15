// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:19 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   LogPrintStream.java

package com.general.utils;

import java.io.*;
import java.sql.Timestamp;

// Referenced classes of package com.general.utils:
//            DateFormatter, StringFormatter

public class LogPrintStream extends PrintStream
{
    private class InnerLogPrintStream extends PrintStream
    {

        public void print(boolean b)
        {
            print(String.valueOf(b));
        }

        public void print(char c)
        {
            print(String.valueOf(c));
        }

        public void print(char s[])
        {
            print(new String(s));
        }

        public void print(double d)
        {
            print(String.valueOf(d));
        }

        public void print(float f)
        {
            print(String.valueOf(f));
        }

        public void print(int i)
        {
            print(String.valueOf(i));
        }

        public void print(long l)
        {
            print(String.valueOf(l));
        }

        public void print(Object obj)
        {
            print(String.valueOf(obj));
        }

        public void print(String s)
        {
            super.print(getPrefix() + s);
            lastPrint = 1;
        }

        public void println()
        {
            super.println();
            lastPrint = 2;
        }

        public void println(boolean x)
        {
            println(String.valueOf(x));
        }

        public void println(char x)
        {
            println(String.valueOf(x));
        }

        public void println(char x[])
        {
            println(new String(x));
        }

        public void println(double x)
        {
            println(String.valueOf(x));
        }

        public void println(float x)
        {
            println(String.valueOf(x));
        }

        public void println(int x)
        {
            println(String.valueOf(x));
        }

        public void println(long x)
        {
            println(String.valueOf(x));
        }

        public void println(Object x)
        {
            println(String.valueOf(x));
        }

        public void println(String x)
        {
            super.println(x);
            lastPrint = 2;
        }

        private String getPrefix()
        {
            if(lastPrint == 1)
                return "";
            else
                return "[" + DateFormatter.getActualDate("-") + " " + DateFormatter.getActualHour(":") + "] ";
        }

        private static final String EMPTY_STRING = "";
        private int lastPrint;

        public InnerLogPrintStream(OutputStream out)
        {
            super(out);
        }

        public InnerLogPrintStream(OutputStream out, boolean autoFlush)
        {
            super(out, autoFlush);
        }
    }


    public LogPrintStream(String pFilePrefix, String pPath)
    {
        this(pFilePrefix, pPath, "log");
    }

    public LogPrintStream(String pFilePrefix, String pPath, String pExt)
    {
        super(System.out);
        setExtension(pExt);
        filePrefix = pFilePrefix;
        if(pPath != null)
        {
            path = new File(pPath);
            boolean succes_ = true;
            if(path.exists())
            {
                if(!path.isDirectory())
                    succes_ = false;
            } else
            {
                try
                {
                    succes_ = path.mkdirs();
                }
                catch(Exception e)
                {
                    succes_ = false;
                }
            }
            if(!succes_)
                path = null;
        } else
        {
            path = null;
        }
    }

    private InnerLogPrintStream getOut()
        throws Exception
    {
        if(!checkDate())
        {
            closeOut();
            String fileName_ = filePrefix + DateFormatter.getActualDate().substring(2) + extension;
            File file_ = null;
            if(path == null)
                file_ = new File(fileName_);
            else
                file_ = new File(path, fileName_);
            fout = new FileOutputStream(file_.getPath(), true);
            out = new InnerLogPrintStream(fout);
        }
        return out;
    }

    private boolean checkDate()
    {
        boolean answer_ = actualDate != null && DateFormatter.getActualTime().equals(actualDate);
        return answer_;
    }

    private void closeOut()
    {
        if(fout != null)
            try
            {
                fout.close();
            }
            catch(IOException ioexception) { }
        if(out != null)
        {
            out.close();
            out = null;
        }
    }

    public void close()
    {
        closeOut();
        super.close();
    }

    public void print(boolean b)
    {
        print(String.valueOf(b));
    }

    public void print(char c)
    {
        print(String.valueOf(c));
    }

    public void print(char s[])
    {
        print(new String(s));
    }

    public void print(double d)
    {
        print(String.valueOf(d));
    }

    public void print(float f)
    {
        print(String.valueOf(f));
    }

    public void print(int i)
    {
        print(String.valueOf(i));
    }

    public void print(long l)
    {
        print(String.valueOf(l));
    }

    public void print(Object obj)
    {
        print(String.valueOf(obj));
    }

    public void print(String s)
    {
        try
        {
            PrintStream ps_ = getOut();
            ps_.print(s);
        }
        catch(Exception e)
        {
            super.print(s);
        }
    }

    public void println()
    {
        super.println();
    }

    public void println(boolean x)
    {
        println(String.valueOf(x));
    }

    public void println(char x)
    {
        println(String.valueOf(x));
    }

    public void println(char x[])
    {
        println(new String(x));
    }

    public void println(double x)
    {
        println(String.valueOf(x));
    }

    public void println(float x)
    {
        println(String.valueOf(x));
    }

    public void println(int x)
    {
        println(String.valueOf(x));
    }

    public void println(long x)
    {
        println(String.valueOf(x));
    }

    public void println(Object x)
    {
        println(String.valueOf(x));
    }

    public void println(String x)
    {
        try
        {
            PrintStream ps_ = getOut();
            ps_.println(x);
        }
        catch(Exception e)
        {
            super.print(x);
        }
    }

    public String getExtension()
    {
        return extension;
    }

    public void setExtension(String pExt)
    {
        if(pExt == null)
            extension = ".log";
        else
            extension = "." + StringFormatter.replace(pExt.trim(), ".");
    }

    private InnerLogPrintStream out;
    private FileOutputStream fout;
    private String filePrefix;
    private String extension;
    private File path;
    Timestamp actualDate;
	private class LogPrintStream$InnerLogPrintStream extends PrintStream
	{

		public void print(boolean b)
		{
			print(String.valueOf(b));
		}

		public void print(char c)
		{
			print(String.valueOf(c));
		}

		public void print(char s[])
		{
			print(new String(s));
		}

		public void print(double d)
		{
			print(String.valueOf(d));
		}

		public void print(float f)
		{
			print(String.valueOf(f));
		}

		public void print(int i)
		{
			print(String.valueOf(i));
		}

		public void print(long l)
		{
			print(String.valueOf(l));
		}

		public void print(Object obj)
		{
			print(String.valueOf(obj));
		}

		public void print(String s)
		{
			super.print(getPrefix() + s);
			lastPrint = 1;
		}

		public void println()
		{
			super.println();
			lastPrint = 2;
		}

		public void println(boolean x)
		{
			println(String.valueOf(x));
		}

		public void println(char x)
		{
			println(String.valueOf(x));
		}

		public void println(char x[])
		{
			println(new String(x));
		}

		public void println(double x)
		{
			println(String.valueOf(x));
		}

		public void println(float x)
		{
			println(String.valueOf(x));
		}

		public void println(int x)
		{
			println(String.valueOf(x));
		}

		public void println(long x)
		{
			println(String.valueOf(x));
		}

		public void println(Object x)
		{
			println(String.valueOf(x));
		}

		public void println(String x)
		{
			super.println(x);
			lastPrint = 2;
		}

		private String getPrefix()
		{
			if(lastPrint == 1)
				return "";
			else
				return "[" + DateFormatter.getActualDate("-") + " " + DateFormatter.getActualHour(":") + "] ";
		}

		private static final String EMPTY_STRING = "";
		private int lastPrint;

		public LogPrintStream$InnerLogPrintStream(OutputStream out)
		{
			super(out);
		}

		public LogPrintStream$InnerLogPrintStream(OutputStream out, boolean autoFlush)
		{
			super(out, autoFlush);
		}
	}    
}