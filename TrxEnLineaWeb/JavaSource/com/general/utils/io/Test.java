// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:51:24 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Test.java

package com.general.utils.io;

import java.io.PrintStream;

// Referenced classes of package com.general.utils.io:
//            SequentialFile, GeneralFileReader, NewLineFileEventListener, NewLineFileEvent

public class Test
{

    public Test()
    {
    }

    public static void main(String args[])
    {
        SequentialFile seqFile_ = new SequentialFile("c:/temp/prueba.txt");
        GeneralFileReader reader_ = new GeneralFileReader(seqFile_, 15L);
        reader_.addNewLineFileEventListener(new NewLineFileEventListener() {

            public void lineAdded(NewLineFileEvent e)
            {
                System.out.println(e.getLine() + " at " + e.getLineNumber());
            }

        });
        reader_.startRun();
    }
	private final class Test$1
		implements NewLineFileEventListener
	{

		public void lineAdded(NewLineFileEvent e)
		{
			System.out.println(e.getLine() + " at " + e.getLineNumber());
		}

		Test$1()
		{
		}
	}    
}