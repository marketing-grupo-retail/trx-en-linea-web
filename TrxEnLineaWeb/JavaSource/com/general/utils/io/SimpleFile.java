// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:51:26 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   SimpleFile.java

package com.general.utils.io;

import com.general.utils.SimpleReader;
import java.io.*;

// Referenced classes of package com.general.utils.io:
//            GeneralFileInt

public class SimpleFile
    implements GeneralFileInt
{

    public SimpleFile(String pFileName)
    {
        fileName = pFileName;
        File file_ = new File(pFileName);
        if(!file_.exists())
            try
            {
                FileOutputStream fos_ = new FileOutputStream(pFileName, false);
                fos_.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        open();
    }

    public void goTop()
    {
        close();
        open();
    }

    public String readCurrentLine()
    {
        currentLine++;
        String line_;
        for(line_ = null; line_ == null;)
            try
            {
                line_ = getReader().readLine();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }

        return line_;
    }

    public long getCurrentLine()
    {
        return currentLine;
    }

    private void open()
    {
        try
        {
            iStream = new FileInputStream(fileName);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        currentLine = 0L;
    }

    public void close()
    {
        try
        {
            iStream.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    private SimpleReader getReader()
    {
        if(reader == null)
            reader = new SimpleReader(iStream);
        return reader;
    }

    public static void main(String args[])
    {
        String name_ = "C:\\ASIC\\proyectos\\sodimac\\trx_on_line\\dev\\doc\\eamtrana.dat";
        SimpleFile s_ = new SimpleFile(name_);
      //  System.out.println("Leyendo linea...");
        String l_ = null;
        for(int i = 0; i < 4; i++)
            s_.readCurrentLine();

        l_ = s_.readCurrentLine();
        byte a_[] = l_.getBytes();
        for(int i = 0; i < a_.length; i++)
            System.out.print(a_[i] + " ");

        System.out.println();
        try
        {
            File file_ = new File(name_);
            FileReader fr_ = new FileReader(file_);
            BufferedReader br_ = new BufferedReader(fr_);
            for(int i = 0; i < 4; i++)
                br_.readLine();

            l_ = br_.readLine();
            a_ = l_.getBytes();
            for(int i = 0; i < a_.length; i++)
                System.out.print(a_[i] + " ");

            System.out.println();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            SimpleReader sr_ = new SimpleReader(new FileInputStream(new File(name_)));
            for(int i = 0; i < 4; i++)
                sr_.readLine();

            l_ = sr_.readLine();
            a_ = l_.getBytes();
            for(int i = 0; i < a_.length; i++)
                System.out.print(a_[i] + " ");

        }
        catch(FileNotFoundException e1)
        {
            e1.printStackTrace();
        }
        catch(IOException e1)
        {
            e1.printStackTrace();
        }
    }

    private long currentLine;
    private SimpleReader reader;
    private String fileName;
    private InputStream iStream;
}