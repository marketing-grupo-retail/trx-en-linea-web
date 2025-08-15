// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:51:25 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   SequentialFile.java

package com.general.utils.io;

import java.io.*;

// Referenced classes of package com.general.utils.io:
//            GeneralFileInt

public class SequentialFile
    implements GeneralFileInt
{

    public SequentialFile(String pFileName)
    {
        file = new File(pFileName);
        currentLine = 1L;
    }

    public void goTop()
    {
        close();
    }

    public String readCurrentLine()
    {
        String line_ = null;
        try
        {
            line_ = getBr().readLine();
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
        if(br != null)
            try
            {
                br.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        if(isr != null)
            try
            {
                isr.close();
            }
            catch(IOException e1)
            {
                e1.printStackTrace();
            }
        if(is != null)
            try
            {
                is.close();
            }
            catch(IOException e2)
            {
                e2.printStackTrace();
            }
    }

    public BufferedReader getBr()
        throws FileNotFoundException
    {
        if(br == null)
            br = new BufferedReader(getIsr());
        return br;
    }

    public FileInputStream getIs()
        throws FileNotFoundException
    {
        if(is == null)
            is = new FileInputStream(file);
        return is;
    }

    public InputStreamReader getIsr()
        throws FileNotFoundException
    {
        if(isr == null)
            isr = new InputStreamReader(getIs());
        return isr;
    }

    public String toString()
    {
        return "[" + file.getAbsolutePath() + "]";
    }

    private long currentLine;
    private File file;
    private FileInputStream is;
    private InputStreamReader isr;
    private BufferedReader br;
}