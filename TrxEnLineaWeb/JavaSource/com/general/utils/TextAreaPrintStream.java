// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:50:22 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   TextAreaPrintStream.java

package com.general.utils;

import java.io.PrintStream;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

public class TextAreaPrintStream extends PrintStream
{

    public TextAreaPrintStream()
    {
        super(System.out);
        textArea = new JTextArea();
    }

    public void print(String s)
    {
        textArea.setText(textArea.getText() + s);
    }

    public void println(String x)
    {
        print(x + "\n");
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
        print(obj.toString());
    }

    public void println()
    {
        println();
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
        println(x.toString());
    }

    public JTextArea getTextArea()
    {
        return textArea;
    }

    JTextArea textArea;
}