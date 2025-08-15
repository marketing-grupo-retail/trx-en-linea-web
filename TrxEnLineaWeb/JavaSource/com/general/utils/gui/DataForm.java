// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:51:10 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   DataForm.java

package com.general.utils.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class DataForm extends JDialog
    implements ActionListener
{

    public DataForm(String pDataLabelsArray[])
    {
        this(pDataLabelsArray, "Entrada de datos");
    }

    public DataForm(String pDataLabelsArray[], String pTitle)
    {
        dataLabelsArray = pDataLabelsArray;
        setTitle(pTitle);
        buildComponents();
    }

    private void buildComponents()
    {
        getContentPane().setLayout(new BorderLayout());
        dataValuesArray = new JTextField[dataLabelsArray.length];
        GridLayout layout_ = new GridLayout(0, 1);
        JPanel dataPanel_ = new JPanel(layout_);
        for(int i = 0; i < dataLabelsArray.length; i++)
        {
            JPanel dataPanel1_ = new JPanel();
            JLabel label_ = new JLabel(dataLabelsArray[i]);
            label_.setPreferredSize(new Dimension(100, 20));
            dataPanel1_.add(label_);
            dataValuesArray[i] = new JTextField(15);
            dataPanel1_.add(dataValuesArray[i]);
            dataPanel_.add(dataPanel1_);
        }

        JPanel flowPanel_ = new JPanel();
        flowPanel_.add(dataPanel_);
        JPanel buttonPanel_ = new JPanel();
        JButton buttonOK_ = new JButton("OK");
        JButton buttonCancel_ = new JButton("Cancel");
        buttonOK_.addActionListener(this);
        buttonCancel_.addActionListener(this);
        buttonPanel_.add(buttonOK_);
        buttonPanel_.add(buttonCancel_);
        getContentPane().add(flowPanel_, "Center");
        getContentPane().add(buttonPanel_, "South");
        setSize(300, 30 * dataLabelsArray.length + 70);
    }

    public synchronized String[] getValues()
    {
        if(userAnswer == 0)
        {
          //  System.out.println("waiting for user accept...");
            try
            {
                wait();
            }
            catch(InterruptedException interruptedexception) { }
        }
        String answer_[] = (String[])null;
        if(userAnswer == 0)
        {
            answer_ = new String[dataValuesArray.length];
            for(int i = 0; i < answer_.length; i++)
                answer_[i] = dataValuesArray[i].getText();

        }
        return answer_;
    }

    public static String[] inputForm(String pLabels[])
    {
        DataForm form_ = new DataForm(pLabels);
        form_.setVisible(true);
        return form_.getValues();
    }

    public static void main(String args[])
    {
        String values_[] = inputForm(new String[] {
            "Nombre"
        });
        for(int i = 0; i < values_.length; i++)
            System.out.println(values_[i]);

    }

    public synchronized void actionPerformed(ActionEvent e)
    {
        userAnswer = e.getActionCommand().equals("OK") ? 0 : 2;
        notifyAll();
        dispose();
    }

    private String dataLabelsArray[];
    private JTextField dataValuesArray[];
    private int userAnswer;
}