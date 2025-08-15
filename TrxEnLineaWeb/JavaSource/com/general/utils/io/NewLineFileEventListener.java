// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:51:24 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   NewLineFileEventListener.java

package com.general.utils.io;

import java.util.EventListener;

// Referenced classes of package com.general.utils.io:
//            NewLineFileEvent

public interface NewLineFileEventListener
    extends EventListener
{

    public abstract void lineAdded(NewLineFileEvent newlinefileevent);
}