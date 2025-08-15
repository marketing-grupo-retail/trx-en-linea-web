// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:51:22 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   GeneralFileReader.java

package com.general.utils.io;

import java.util.Vector;

// Referenced classes of package com.general.utils.io:
//            GeneralFileInt, NewLineFileEvent, NewLineFileEventListener

public class GeneralFileReader
    implements Runnable
{

    public GeneralFileReader(GeneralFileInt pFileInstance, long pWaitTime)
    {
        aState = true;
        fileInstance = pFileInstance;
        waitTime = pWaitTime;
       // System.out.println("new instance of GeneralFileReader on " + pFileInstance);
    }

    public void startRun()
    {
        Thread startThread_ = new Thread(this);
        startThread_.start();
    }

    public void stopRun()
    {
        if(fileInstance != null)
        {
            printMessage("stopping...");
            aState = false;
            while(running) 
                try
                {
                    Thread.sleep(1000L);
                }
                catch(InterruptedException interruptedexception) { }
            fileInstance.close();
            printMessage("stopped");
            fileInstance = null;
        }
    }

    private String readLine()
    {
        long waitTime_ = waitTime * 1000L;
        String line_ = null;
        printMessage("Waiting for line...");
        while(fileInstance != null && line_ == null && aState) 
        {
            line_ = fileInstance.readCurrentLine();
            if(line_ == null)
                try
                {
                    Thread.sleep(waitTime_);
                }
                catch(InterruptedException interruptedexception) { }
        }
        if(line_ != null)
            printMessage("line read: " + line_);
        return line_;
    }

    public void run()
    {
        aState = true;
        running = true;
        while(fileInstance != null && aState) 
        {
            fileInstance.goTop();
            while(fileInstance != null && aState) 
                try
                {
                    String line_ = readLine();
                    long currentLine_ = fileInstance.getCurrentLine() - 1L;
                    if(line_ != null)
                    {
                        NewLineFileEvent event_ = new NewLineFileEvent(this, line_, currentLine_);
                        notifyListeners(event_);
                    }
                }
                catch(Exception ex)
                {
                    printMessage(ex);
                    ex.printStackTrace();
                }
        }
        running = false;
    }

    private void notifyListeners(final NewLineFileEvent e)
    {
        Vector vector_ = getListenerVector();
        System.out.println("There are " + vector_.size() + " listeners to notify");
        for(int i = 0; i < vector_.size(); i++)
        {
            final NewLineFileEventListener listener_ = (NewLineFileEventListener)vector_.elementAt(i);
            System.out.println("Listener: " + listener_);
            Thread hilo_ = new Thread(new Runnable() {

                public void run()
                {
                    System.out.println("notifying...");
                    listener_.lineAdded(e);
                    System.out.println("listener has been notified");
                }

            });
            hilo_.start();
            try
            {
                hilo_.join();
            }
            catch(InterruptedException e1)
            {
                e1.printStackTrace();
            }
        }

    }

    public void addNewLineFileEventListener(NewLineFileEventListener pListener)
    {
        getListenerVector().addElement(pListener);
    }

    public void removeNewLineIOFileEventListener(NewLineFileEventListener pListener)
    {
        getListenerVector().removeElement(pListener);
    }

    public Vector getListenerVector()
    {
        if(listenerVector == null)
            listenerVector = new Vector();
        return listenerVector;
    }

    public void printMessage(Object pMessage)
    {
        System.out.println(fileInstance.toString() + pMessage.toString());
    }

    private Vector listenerVector;
    private boolean aState;
    private GeneralFileInt fileInstance;
    private int aBackSequence;
    private long waitTime;
    private boolean running;
	private final class GeneralFileReader$1
		implements Runnable
	{

		public void run()
		{
			System.out.println("notifying...");
			//val$listener_.lineAdded(val$e);
			System.out.println("listener has been notified");
		}

		GeneralFileReader$1()
		{
		}
	}    
}