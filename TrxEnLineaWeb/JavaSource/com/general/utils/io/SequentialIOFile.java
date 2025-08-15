// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:51:26 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   SequentialIOFile.java

package com.general.utils.io;

import com.general.utils.FileUtils;
import java.io.*;

// Referenced classes of package com.general.utils.io:
//            GeneralFileInt

public class SequentialIOFile
    implements GeneralFileInt
{

    public SequentialIOFile(String pFileName)
    {
        this(pFileName, false);
    }

    public SequentialIOFile(String pFileName, boolean pFromController)
    {
        file = new File(FileUtils.getValidFileName(pFileName, pFromController));
        currentLine = 1L;
    }

    public void goTop()
    {
        close();
    }

    public String readCurrentLine()
    {
        String line_ = null;
        RandomAccessFile raf_ = getRafFile();
        if(raf_ != null)
            try
            {
                line_ = raf_.readLine();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(line_ != null)
            currentLine++;
        return line_;
    }

    public long getCurrentLine()
    {
        return currentLine;
    }

    public void close()
    {
        currentLine = 1L;
        if(rafFile != null)
            try
            {
                rafFile.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
    }

    public String toString()
    {
        return "[SeqIOFile:" + file.getAbsolutePath() + "]";
    }

    public RandomAccessFile getRafFile()
    {
        if(rafFile == null)
            try
            {
                rafFile = new RandomAccessFile(file, "rw");
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
        return rafFile;
    }

    private long currentLine;
    private File file;
    private RandomAccessFile rafFile;
}