// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:19 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   InitParameters.java

package com.general.utils;

import java.util.Hashtable;

// Referenced classes of package com.general.utils:
//            PropertiesManager, StringFormatter

public class InitParameters
{

    public InitParameters(String pFileName)
    {
        fileName = pFileName;
        generalIniProp = new PropertiesManager(pFileName.indexOf(".") != -1 ? pFileName : pFileName + "." + "ini");
        specificIniProp = new Hashtable();
    }

    public PropertiesManager getSpecificIniProp(String pExtension)
    {
        PropertiesManager answer_ = null;
        String extension_ = StringFormatter.align(pExtension, 3, '0', 0, 3);
        answer_ = (PropertiesManager)specificIniProp.get(extension_);
        if(answer_ == null)
        {
            int dotPosition_ = fileName.indexOf(".");
            String specificFile_ = null;
            if(dotPosition_ > -1)
                specificFile_ = fileName.substring(0, dotPosition_) + "." + extension_;
            else
                specificFile_ = fileName.trim() + "." + extension_;
            answer_ = new PropertiesManager(specificFile_);
            specificIniProp.put(extension_, answer_);
        }
        return answer_;
    }

    public String getParameter(String pParameter, String pExtension)
    {
        String answer_ = null;
        String terminalParameter_ = null;
        if(pExtension != null)
            terminalParameter_ = getSpecificIniProp(pExtension).getParameter(pParameter);
        if(terminalParameter_ == null || terminalParameter_.trim().equals(""))
            answer_ = generalIniProp.getParameter(pParameter);
        else
            answer_ = terminalParameter_;
        return answer_;
    }

    public String getParameter(String pParameter)
    {
        return getParameter(pParameter, null);
    }

    public PropertiesManager getGeneralIniProp()
    {
        return generalIniProp;
    }

    public static void main(String argv[])
    {
        InitParameters test_ = new InitParameters("r::c:/java/bin/test.ini");
    }

    public static final String FILE_EXTENSION = "ini";
    private String fileName;
    private PropertiesManager generalIniProp;
    private Hashtable specificIniProp;
}