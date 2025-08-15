// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:22 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   RunTimeOut.java

package com.general.utils;

import com.general.exceptions.TimeoutException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.general.utils:
//            ClassUtils, NumberFormatter

public class RunTimeOut
    implements Runnable
{

    private RunTimeOut(Object pObj, Method pMethod, Object pArg[])
    {
        aRunMethod = -1;
        aObj = pObj;
        aMethod = pMethod;
        aArg = pArg;
    }

    public void run()
    {
        aException = null;
        try
        {
            if(aMethod.getReturnType() != null)
            {
                Class class_[] = aMethod.getParameterTypes();
                aReturn = aMethod.invoke(aObj, aArg);
            } else
            {
                aMethod.invoke(aObj, aArg);
            }
            aRunMethod = 0;
        }
        catch(IllegalAccessException ex)
        {
            System.out.println("Ex running method " + aMethod.getName() + ": " + ex);
            aRunMethod = 1;
            aException = ex;
        }
        catch(InvocationTargetException ex)
        {
            System.out.println("Ex running method " + aMethod.getName() + ": " + ex.getTargetException());
            aRunMethod = 1;
            aException = ex.getTargetException();
        }
    }

    public static Object execute(Class pClass, String pMethod, Object pArg[], int pTimeOut, Object pObj, float pFloatStep)
        throws Throwable
    {
        System.out.println("Trying to execute " + pMethod + " from " + pClass.getName());
        int pStep = (int)(pFloatStep * 1000F);
        int answer_ = -1;
        Object obj_ = null;
        Throwable ex_ = null;
        Class pTypes_[];
        if(pArg == null)
            pTypes_ = (Class[])null;
        else
            pTypes_ = ClassUtils.getPrimitiveClassArray(pArg);
        Method method_ = null;
        for(int triesCounter_ = 0; method_ == null && triesCounter_ < 2; triesCounter_++)
            try
            {
                method_ = pClass.getMethod(pMethod, pTypes_);
            }
            catch(NoSuchMethodException ex)
            {
                if(triesCounter_ == 0)
                    pTypes_ = ClassUtils.getClassArray(pArg);
                else
                    ex_ = ex;
                method_ = null;
            }

        if(method_ != null)
        {
            RunTimeOut run_ = new RunTimeOut(pObj != null ? pObj : ((Object) (pClass)), method_, pArg);
            Thread thread_ = new Thread(run_);
            if(pTimeOut > 0)
            {
                thread_.start();
                int milsElapsed_ = 0;
                String format_ = "00000";
                String strTO_ = " of " + NumberFormatter.formatoNumero(pTimeOut, format_) + " sec";
                while(run_.aRunMethod == -1 && milsElapsed_ <= pTimeOut * 1000) 
                {
                    System.out.println(NumberFormatter.formatoNumero(Math.round(milsElapsed_ / 1000), "00000") + strTO_);
                    if(run_.aRunMethod == -1)
                    {
                        try
                        {
                            Thread.sleep(pStep);
                        }
                        catch(Exception exception1) { }
                        milsElapsed_ += pStep;
                    }
                }
            } else
            {
                run_.run();
            }
            answer_ = run_.aRunMethod;
            obj_ = run_.aReturn;
            ex_ = run_.aException;
            if(answer_ == -1)
            {
                System.out.println("\nTimeout occurred!!!");
                try
                {
                    thread_.interrupt();
                }
                catch(Exception exception) { }
                obj_ = null;
                throw new TimeoutException();
            }
            if(ex_ != null)
                throw ex_;
            run_ = null;
        } else
        {
            System.out.println("Method " + pMethod + " not found");
            throw ex_;
        }
        return obj_;
    }

    public static Object execute(Class pClass, String pMethod, Object pArg[])
        throws Throwable
    {
        return execute(pClass, pMethod, pArg, -1);
    }

    public static Object execute(Class pClass, String pMethod, Object pArg[], int pTimeOut, Object pObj)
        throws Throwable
    {
        return execute(pClass, pMethod, pArg, pTimeOut, pObj, 1.0F);
    }

    public static Object execute(Object pObj, String pMethod, Object pArg[], int pTimeOut)
        throws Throwable
    {
        return execute(pObj, pMethod, pArg, pTimeOut, 1.0F);
    }

    public static Object execute(Object pObj, String pMethod, Object pArg[], int pTimeOut, float pStep)
        throws Throwable
    {
        Class class_ = pObj.getClass();
        return execute(class_, pMethod, pArg, pTimeOut, pObj, pStep);
    }

    public static Object execute(Class pClass, String pMethod, Object pArg[], int pTimeOut)
        throws Throwable
    {
        return execute(pClass, pMethod, pArg, pTimeOut, null);
    }

    private Object aObj;
    private Method aMethod;
    private Object aArg[];
    private int aRunMethod;
    private Throwable aException;
    private Object aReturn;
    public static final int STEP_DEFAULT = 1;
}