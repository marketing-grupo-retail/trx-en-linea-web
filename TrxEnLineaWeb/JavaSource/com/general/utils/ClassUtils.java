// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:14 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   ClassUtils.java

package com.general.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassUtils
{

    public ClassUtils()
    {
    }

    public static Object newInstance(Class pClass, Object pArg[])
        throws NoSuchMethodException, InstantiationException, IllegalAccessException
    {
        Object answer_ = null;
        if(pArg == null)
        {
            answer_ = pClass.newInstance();
        } else
        {
            Class classArray_[] = getClassArray(pArg);
            Constructor constructor_ = null;
            try
            {
                constructor_ = pClass.getConstructor(classArray_);
            }
            catch(NoSuchMethodException e1)
            {
                classArray_ = getPrimitiveClassArray(pArg);
                constructor_ = pClass.getConstructor(classArray_);
            }
            try
            {
                answer_ = constructor_.newInstance(pArg);
            }
            catch(InvocationTargetException e)
            {
                throw new InstantiationException(e.getMessage());
            }
        }
        return answer_;
    }

    public static Class primitiveType(Class wrapType)
    {
        if(wrapType.equals(java.lang.Integer.class))
            return Integer.TYPE;
        if(wrapType.equals(java.lang.Long.class))
            return Long.TYPE;
        if(wrapType.equals(java.lang.Float.class))
            return Float.TYPE;
        if(wrapType.equals(java.lang.Double.class))
            return Double.TYPE;
        if(wrapType.equals(java.lang.Boolean.class))
            return Boolean.TYPE;
        if(wrapType.equals(java.lang.Byte.class))
            return Byte.TYPE;
        if(wrapType.equals(java.lang.Character.class))
            return Character.TYPE;
        else
            return wrapType;
    }

    public static Class[] getPrimitiveClassArray(Object pObj[])
    {
        Class class_[] = new Class[pObj.length];
        for(int i = 0; i < pObj.length; i++)
            class_[i] = primitiveType(pObj[i].getClass());

        return class_;
    }

    public static Class[] getClassArray(Object pObj[])
    {
        Class class_[] = new Class[pObj.length];
        for(int i = 0; i < pObj.length; i++)
            class_[i] = pObj[i].getClass();

        return class_;
    }
}