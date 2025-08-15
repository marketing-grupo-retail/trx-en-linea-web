// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:49:56 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   PgmRunner.java

package com.general.rpg;

import com.general.exceptions.FailedConnectionException;
import com.general.exceptions.TimeoutException;
import com.general.utils.*;
import com.ibm.as400.access.*;
import java.io.PrintStream;

public class PgmRunner
{

    public PgmRunner(String pIpAddress, String pUser, String pPass, String pCommandArray[], int pTimeOut, long pSessionLifeTime)
    {
        this(pIpAddress, pUser, pPass, pCommandArray, pTimeOut, pSessionLifeTime, 2048);
    }

    public PgmRunner(String pIpAddress, String pUser, String pPass, String pCommandArray[], int pTimeOut, long pSessionLifeTime, 
            int pParamLength)
    {
        timeOut = 30;
        sessionLifeTime = 3600L;
        paramLength = 2048;
        System.out.println("Creating instance of PgmRunner with ");
        System.out.println(pIpAddress + "," + pUser + "," + pPass + "," + pTimeOut + "," + pSessionLifeTime + "," + pParamLength);
        paramLength = pParamLength;
        System.out.print("Libraries: ");
        for(int i = 0; i < pCommandArray.length; i++)
            System.out.print(pCommandArray[i] + ",");

        System.out.println();
        setIpAddress(pIpAddress);
        setUserName(pUser);
        setPassword(pPass);
        commandArray = pCommandArray;
        setTimeOut(pTimeOut);
        setSessionLifeTime(pSessionLifeTime);
        initSession();
    }

    public boolean initSession()
    {
        closeSession();
        System.out.println("Starting AS400 session...");
        boolean answer_ = loadLibraries();
        if(answer_)
            initSessionTime = DateFormatter.getActualDateInSeconds();
        sessionActive = answer_;
        return answer_;
    }

    private boolean authenticateUser(int pTimeOut)
        throws FailedConnectionException
    {
        AS400 system_ = getSystem();
        boolean answer_ = false;
        try
        {
            Boolean authenticate_ = (Boolean)RunTimeOut.execute(system_, "authenticate", new Object[] {
                getUserName(), getPassword()
            }, pTimeOut);
            answer_ = authenticate_.booleanValue();
        }
        catch(Throwable e)
        {
            throw new FailedConnectionException(e.getMessage());
        }
        return answer_;
    }

    private boolean verifySession()
    {
        if(!sessionActive || DateFormatter.getActualDateInSeconds() - initSessionTime > sessionLifeTime)
            return initSession();
        else
            return true;
    }

    public boolean loadLibraries()
    {
        System.out.println("Loading libraries...");
        boolean answer_ = false;
        int libCounter_ = 1;
        String prefix_ = "ADDLIBLE LIB(";
        try
        {
            for(; libCounter_ < commandArray.length; libCounter_++)
            {
                String command_ = prefix_ + commandArray[libCounter_] + ")";
                System.out.println(command_);
                try
                {
                    RunTimeOut.execute(getCommand(), "run", new Object[] {
                        command_
                    }, timeOut);
                }
                catch(Throwable e)
                {
                    e.printStackTrace();
                    throw new Exception(e.getMessage());
                }
            }

        }
        catch(Exception ex)
        {
            System.out.println("Ex loading libraries: " + ex);
            ex.printStackTrace();
        }
        answer_ = libCounter_ > 1 && libCounter_ == commandArray.length;
        return answer_;
    }

    public boolean runPgm(Trama pParam)
        throws FailedConnectionException, TimeoutException
    {
        String message_ = pParam.getTrama();
        System.out.println("Running pgm with trama: *" + message_ + "*");
        boolean answer_ = false;
        if(verifySession() && authenticateUser(5))
        {
            String progName_ = "/QSYS.LIB/" + commandArray[1] + ".LIB/" + commandArray[0] + ".PGM";
            ProgramParameter progParam_ = new ProgramParameter(getParameter().toBytes(message_), paramLength);
            ProgramParameter paramArray_[] = {
                progParam_
            };
            try
            {
                getPgm().setProgram(progName_, paramArray_);
                Object obj_ = RunTimeOut.execute(getPgm(), "run", null, timeOut);
                answer_ = ((Boolean)obj_).booleanValue();
                if(answer_)
                {
                    String respuestaAS400_ = (String)getParameter().toObject(paramArray_[0].getOutputData(), 0);
                    pParam.setData(respuestaAS400_);
                } else
                {
                    System.out.println("no answer");
                }
            }
            catch(Throwable ex)
            {
                System.out.println("Ex running pgm: " + ex);
                throw new TimeoutException(ex.getMessage());
            }
        }
        return answer_;
    }

    public void closeSession()
    {
        System.out.println("Closing session...");
        if(system != null)
            system.disconnectAllServices();
        system = null;
        command = null;
        pgm = null;
        parameter = null;
        sessionActive = false;
    }

    public AS400 getSystem()
        throws FailedConnectionException
    {
        if(system == null)
            try
            {
                RunTimeOut.execute(this, "createSystem", null, timeOut);
            }
            catch(Throwable e)
            {
                throw new FailedConnectionException();
            }
        return system;
    }

    public void createSystem()
    {
        System.out.println("Creating AS400 instance...");
        system = new AS400(ipAddress, userName, password);
    }

    public CommandCall getCommand()
        throws FailedConnectionException
    {
        if(command == null)
        {
            System.out.println("Creating CommandCall instance...");
            command = new CommandCall(getSystem());
        }
        return command;
    }

    public ProgramCall getPgm()
        throws FailedConnectionException
    {
        if(pgm == null)
        {
            System.out.println("Creating ProgramCall instance...");
            pgm = new ProgramCall(getSystem());
        }
        return pgm;
    }

    public AS400Text getParameter()
        throws FailedConnectionException
    {
        if(parameter == null)
        {
            System.out.println("Creating AS400Text instance...");
            parameter = new AS400Text(paramLength, getSystem());
        }
        return parameter;
    }

    public int getTimeOut()
    {
        return timeOut;
    }

    public void setTimeOut(int timeOut)
    {
        this.timeOut = Math.max(1, timeOut);
    }

    public String getPassword()
    {
        return password;
    }

    public String getIpAddress()
    {
        return ipAddress;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setIpAddress(String url)
    {
        ipAddress = url;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public long getSessionLifeTime()
    {
        return sessionLifeTime;
    }

    public void setSessionLifeTime(long sessionLifeTime)
    {
        this.sessionLifeTime = sessionLifeTime;
    }

    protected void finalize()
        throws Throwable
    {
        closeSession();
        super.finalize();
    }

    public static final int PARAMETER_LENGTH = 2048;
    private int timeOut;
    private long sessionLifeTime;
    private long initSessionTime;
    private boolean sessionActive;
    private String commandArray[];
    private AS400 system;
    private CommandCall command;
    private ProgramCall pgm;
    private AS400Text parameter;
    private String ipAddress;
    private String userName;
    private String password;
    private int paramLength;
}