// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:52:17 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   TagParser.java

package com.general.utils.tagparser;

import com.general.utils.StringFormatter;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package com.general.utils.tagparser:
//            TagObject

public class TagParser
{

    public TagParser()
    {
    }

    private static String replaceDefaultTags(String pStr)
    {
        for(int i = 0; i < commandDefaultArray.length; i++)
        {
            String strArray_[] = commandDefaultArray[i];
            pStr = StringFormatter.replace(pStr, strArray_[0], strArray_[1]);
        }

        return pStr;
    }

    private Hashtable getCommandTable()
    {
        if(commandTable == null)
        {
            commandTable = new Hashtable();
            for(int i = 0; i < DEFAULT_TAGS.length; i++)
            {
                String strArray_[] = DEFAULT_TAGS[i];
                String key_ = strArray_[0];
                String value_ = strArray_[1];
                commandTable.put(key_, value_);
            }

        }
        return commandTable;
    }

    public void putCommand(String pKey, Object pCommand)
    {
        getCommandTable().put(pKey, pCommand);
    }

    public Object getCommand(String pKey)
    {
        Object obj_ = getCommandTable().get(pKey);
        if(obj_ != null && (obj_ instanceof TagObject))
            ((TagObject)obj_).resetTag();
        return obj_;
    }

    public String evaluateTag(String pTag, String pBody)
    {
       // System.out.println("Evaluating tag " + pTag + " with body " + pBody);
        String answer_ = null;
        Object object_ = getCommand(pTag);
        if(object_ != null)
        {
            if(pBody != null && !pBody.trim().equals(""))
            {
                String separator_ = null;
                for(int i = 0; i < ATTRIBUTE_DELIMITERS.length && separator_ == null; i++)
                    if(pBody.indexOf(ATTRIBUTE_DELIMITERS[i]) > -1)
                        separator_ = ATTRIBUTE_DELIMITERS[i];

                pBody = replaceDefaultTags(pBody);
                for(StringTokenizer strToken1_ = new StringTokenizer(pBody, separator_); strToken1_.hasMoreElements();)
                {
                    String paramName_ = strToken1_.nextToken().replace('=', ' ').trim();
                    if(!paramName_.equals(""))
                    {
                        paramName_ = "set" + paramName_.substring(0, 1).toUpperCase() + paramName_.substring(1);
                        String paramValue_ = evaluateExpr(strToken1_.nextToken());
                        //System.out.println("Trying to invoke " + paramName_ + "(\"" + paramValue_ + "\")");
                        try
                        {
                            Method method_ = object_.getClass().getMethod(paramName_, new Class[] {
                                java.lang.String.class
                            });
                            method_.invoke(object_, new Object[] {
                                paramValue_
                            });
                        }
                        catch(NoSuchMethodException nosuchmethodexception) { }
                        catch(IllegalAccessException illegalaccessexception) { }
                        catch(InvocationTargetException invocationtargetexception) { }
                    }
                }

            }
            answer_ = object_.toString();
        }
        return answer_;
    }

    public String evaluateExpr(String pBody)
    {
        StringBuffer strBuff_ = null;
        for(int i = 0; i < pBody.length(); i++)
        {
            char char_ = pBody.charAt(i);
            if(char_ == '<')
            {
                int pos0_ = pBody.indexOf(">", i);
                int pos1_ = pBody.indexOf(" ", i);
                int posR_ = pos1_ != -1 ? Math.min(pos0_, pos1_) : pos0_;
                if(posR_ > -1)
                {
                    String tag_ = pBody.substring(i + 1, posR_);
                    int pos2_ = -1;
                    if(posR_ == pos1_)
                    {
                        String strFinish_ = "></";
                        int tagPending_ = 1;
                        String fullTag_ = "<" + tag_ + " ";
                        for(int posIni_ = pos1_; tagPending_ > 0; posIni_ = pos2_ + 1)
                        {
                            pos2_ = pBody.indexOf(strFinish_ + tag_ + ">", posIni_);
                            tagPending_--;
                            if(pos2_ > -1)
                            {
                                String newBody_ = pBody.substring(posIni_ + 1, pos2_);
                                tagPending_ += StringFormatter.occurs(newBody_, fullTag_);
                            }
                        }

                        if(pos2_ > -1)
                        {
                            String body_ = pBody.substring(pos1_ + 1, pos2_);
                            String str_ = evaluateTag(tag_, body_);
                            if(str_ != null)
                            {
                                if(strBuff_ == null)
                                    strBuff_ = new StringBuffer();
                                strBuff_.append(str_);
                            }
                            i = pos2_ + strFinish_.length() + tag_.length() + 1;
                        }
                    } else
                    {
                        String strFinish_ = "</";
                        pos2_ = pBody.indexOf(strFinish_ + tag_, posR_);
                        String str_ = evaluateTag(tag_, null);
                        if(str_ != null)
                        {
                            if(strBuff_ == null)
                                strBuff_ = new StringBuffer();
                            strBuff_.append(str_);
                        }
                        i = posR_ + strFinish_.length() + tag_.length() + 1;
                    }
                }
            } else
            {
                if(strBuff_ == null)
                    strBuff_ = new StringBuffer();
                strBuff_.append(char_);
            }
        }

        return strBuff_ != null ? strBuff_.toString() : null;
    }

    private String[] readTagFile(String pFile)
        throws IOException
    {
        String answer_[] = (String[])getTagFileTable().get(pFile);
        if(answer_ != null)
        {
            System.out.println("getting voucher settings from table...");
            return answer_;
        }
        System.out.println("Reading " + pFile + " for voucher...");
        StringBuffer strBuff_ = new StringBuffer();
        File file_ = new File(pFile);
        FileInputStream fileInput_ = null;
        try
        {
            fileInput_ = new FileInputStream(file_);
            int char_ = -1;
            do
            {
                char_ = fileInput_.read();
                switch(char_)
                {
                default:
                    strBuff_.append((char)char_);
                    break;

                case -1: 
                case 9: // '\t'
                case 10: // '\n'
                case 13: // '\r'
                    break;
                }
            } while(char_ != -1);
        }
        finally
        {
            if(fileInput_ != null)
                try
                {
                    fileInput_.close();
                }
                catch(IOException e)
                {
                    System.out.println(e);
                    e.printStackTrace();
                }
        }
        if(strBuff_ != null)
        {
            Vector vector_ = new Vector();
            String sep1_ = "<BR>".toUpperCase();
            String sep2_ = "<BR>".toLowerCase();
            String sep0_ = "\n";
            String str_ = StringFormatter.replace(StringFormatter.replace(strBuff_.toString(), sep1_, sep0_), sep2_, sep0_);
            String doubleLine_ = sep0_ + sep0_;
            String doubleLine1_ = sep0_ + " " + sep0_;
            str_ = StringFormatter.replace(str_, doubleLine_, doubleLine1_);
            for(StringTokenizer strToken_ = new StringTokenizer(str_, sep0_); strToken_.hasMoreTokens(); vector_.addElement(strToken_.nextToken()));
            answer_ = new String[vector_.size()];
            for(int i = 0; i < answer_.length; i++)
                answer_[i] = (String)vector_.elementAt(i);

            tagFileTable.put(pFile, answer_);
            return answer_;
        } else
        {
            return null;
        }
    }

    public String[] translateTagFile(String pFile)
        throws IOException
    {
        String answer_[] = (String[])null;
        String read_[] = readTagFile(pFile);
        if(read_ != null)
        {
            Vector vector_ = new Vector();
            for(int i = 0; i < read_.length; i++)
            {
                String str_ = evaluateExpr(read_[i]);
                if(str_ != null)
                    vector_.addElement(str_);
            }

            answer_ = new String[vector_.size()];
            for(int i = 0; i < answer_.length; i++)
                answer_[i] = (String)vector_.elementAt(i);

        }
        return answer_;
    }

    public Hashtable getTagFileTable()
    {
        if(tagFileTable == null)
            tagFileTable = new Hashtable();
        return tagFileTable;
    }

    private Hashtable commandTable;
    private Hashtable tagFileTable;
    public static final String BLANK_ROW_TAG = "<BR>";
    public static final String DEFAULT_TAGS[][] = {
        {
            "NULLSTRING", ""
        }
    };
    public static final String ATTRIBUTE_DELIMITERS[] = {
        "[", "{", "\"", "'"
    };
    private static String commandDefaultArray[][];

    static 
    {
        int numDelim_ = ATTRIBUTE_DELIMITERS.length;
        commandDefaultArray = new String[numDelim_][DEFAULT_TAGS.length * numDelim_];
        for(int i = 0; i < DEFAULT_TAGS.length; i++)
        {
            String strArray_[] = DEFAULT_TAGS[i];
            String value0_ = "<" + strArray_[0] + "></" + strArray_[0] + ">";
            for(int j = 0; j < numDelim_; j++)
            {
                String key_ = ATTRIBUTE_DELIMITERS[j] + strArray_[1] + ATTRIBUTE_DELIMITERS[j];
                String value_ = ATTRIBUTE_DELIMITERS[j] + value0_ + ATTRIBUTE_DELIMITERS[j];
                commandDefaultArray[numDelim_ * i + j] = (new String[] {
                    key_, value_
                });
            }

        }

    }
}