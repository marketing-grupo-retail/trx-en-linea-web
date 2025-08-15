// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:51:22 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   IOFile.java

package com.general.utils.io;

import com.general.utils.FileUtils;
import java.io.*;

// Referenced classes of package com.general.utils.io:
//            GeneralFileInt

public class IOFile extends RandomAccessFile
    implements GeneralFileInt
{

    public IOFile(String pFile, int pLen)
        throws FileNotFoundException
    {
        this(pFile, pLen, false);
    }

    public IOFile(String pFile, int pLen, boolean pFromController)
        throws FileNotFoundException
    {
        super(FileUtils.getValidFileName(pFile, pFromController), "rw");
        aCurrentLine = 1L;
        aLineLen = Math.max(1, pLen);
        aFileName = pFile;
    }

    public void close()
    {
        try
        {
            super.close();
        }
        catch(IOException ioexception) { }
    }

    public void writeLine(String pStr, long pLine)
    {
        try
        {
            long offSet_ = (pLine - 1L) * (long)(aLineLen + 2);
            seek(offSet_);
            writeBytes(pStr);
            seek(offSet_ + (long)aLineLen + 2L);
            aCurrentLine = pLine + 1L;
        }
        catch(IOException ioexception) { }
    }

    public void writeCurrentLine(String pStr)
    {
        writeLine(pStr, getCurrentLine());
    }

    public String readOneLine()
        throws IOException
    {
        checkCurrentLine();
        return super.readLine();
    }

    public String readLine(long pLine)
    {
        String answer_ = null;
        try
        {
            long offSet_ = (pLine - 1L) * (long)(aLineLen + 2);
            seek(offSet_);
            answer_ = readOneLine();
            if(answer_ != null)
                aCurrentLine = pLine + 1L;
        }
        catch(IOException ioexception) { }
        return answer_;
    }

    public String readCurrentLine()
    {
        String answer_ = null;
        try
        {
            answer_ = readOneLine();
            if(answer_ != null)
                aCurrentLine++;
        }
        catch(EOFException eofEx)
        {
            printMessage("eof exception");
            goTop();
        }
        catch(IOException ioEx)
        {
            printMessage("io exception");
        }
        return answer_;
    }

    public void goTop()
    {
        printMessage("Going to first line...");
        try
        {
            seek(0L);
            aCurrentLine = 1L;
        }
        catch(IOException ioexception) { }
    }

    public void checkCurrentLine()
    {
        long totalLines_ = getLinesAccount();
        if(aCurrentLine - 1L > totalLines_)
        {
            printMessage("File size is less than before");
            goTop();
        }
    }

    public long getCurrentLine()
    {
        return aCurrentLine;
    }

    public long getLinesAccount()
    {
        long answer_ = 0L;
        try
        {
            long size_ = length();
            answer_ = size_ / (long)(aLineLen + 2);
        }
        catch(Exception exception) { }
        return answer_;
    }

    public String toString()
    {
        return "[" + aFileName + "]";
    }

    public void printMessage(Object pMessage)
    {
        System.out.println(toString() + pMessage);
    }

    public String getFileName()
    {
        return aFileName;
    }

    private int aLineLen;
    private long aCurrentLine;
    private String aFileName;
}