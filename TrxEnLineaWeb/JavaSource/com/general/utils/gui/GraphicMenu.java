// Decompiled by DJ v3.5.5.77 Copyright 2003 Atanas Neshkov  Date: 18/11/2005 09:51:11 a.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   GraphicMenu.java

package com.general.utils.gui;

import com.general.utils.FileUtils;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class GraphicMenu extends JFrame
    implements WindowListener, ActionListener
{

    public GraphicMenu(String pTitle, String pArray[], ActionListener pListener)
    {
        title = pTitle;
        buttonLabelsArray = pArray;
        setMnemonicArray();
        paintFrame();
        addActionListener(pListener);
        setVisible(true);
        os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        System.setErr(ps);
        Thread hilo_ = new Thread(new Runnable() {

            public void run()
            {
                do
                {
                    String str_ = os.toString();
                    os.reset();
                    if(str_ != null && !str_.trim().equals(""))
                        console.setText(console.getText() + str_);
                    getContentPane().validate();
                    getContentPane().repaint();
                    console.setCaretPosition(console.getText().length());
                    try
                    {
                        Thread.sleep(1000L);
                    }
                    catch(InterruptedException interruptedexception) { }
                } while(true);
            }

        });
        hilo_.start();
    }

    public void paintFrame()
    {
        JLabel title_ = new JLabel(title, 0);
        getContentPane().add(title_, "North");
        JPanel buttons_ = new JPanel();
        buttons_.setBorder(BorderFactory.createEtchedBorder());
        buttonArray = new JButton[buttonLabelsArray.length];
        for(int i = 0; i < buttonLabelsArray.length; i++)
        {
            JButton button_ = new JButton(buttonLabelsArray[i]);
            button_.setActionCommand(String.valueOf(i));
            buttons_.add(button_);
            buttonArray[i] = button_;
            button_.setMnemonic(mNemonicArray[i]);
        }

        JScrollPane consoleScroll_ = new JScrollPane();
        JPanel consoleButtons_ = new JPanel();
        if(console == null)
            console = new JTextArea();
        console.setBorder(BorderFactory.createEtchedBorder());
        console.setEditable(false);
        consoleScroll_.getViewport().add(console);
        JButton clearConsoleButton_ = new JButton("Clear console");
        clearConsoleButton_.setActionCommand(String.valueOf(0));
        JButton saveConsoleButton_ = new JButton("Save console contents as...");
        saveConsoleButton_.setActionCommand(String.valueOf(1));
        clearConsoleButton_.addActionListener(this);
        saveConsoleButton_.addActionListener(this);
        consoleButtons_.add(clearConsoleButton_);
        consoleButtons_.add(saveConsoleButton_);
        JPanel consolePanel_ = new JPanel(new BorderLayout());
        consolePanel_.add(consoleScroll_, "Center");
        consolePanel_.add(consoleButtons_, "North");
        JPanel centerPanel_ = new JPanel(new GridLayout(0, 1));
        centerPanel_.add(buttons_);
        centerPanel_.add(consolePanel_);
        getContentPane().add(centerPanel_, "Center");
        messageBar = new JLabel("Ready to go");
        messageBar.setBorder(BorderFactory.createEtchedBorder());
        getContentPane().add(messageBar, "South");
        setSize(800, 600);
    }

    private void setMnemonicArray()
    {
        mNemonicArray = new char[buttonLabelsArray.length];
        for(int i = 0; i < mNemonicArray.length; i++)
        {
            char mNemonic_ = '\0';
            for(int j = 0; j < buttonLabelsArray[i].length() && mNemonic_ == 0; j++)
            {
                boolean already_ = false;
                char possible_ = buttonLabelsArray[i].charAt(j);
                String strPossible_ = String.valueOf(possible_).toUpperCase();
                for(int k = 0; k < i && !already_; k++)
                {
                    String past_ = String.valueOf(mNemonicArray[k]).toUpperCase();
                    already_ = past_.equals(strPossible_);
                }

                if(!already_)
                    mNemonic_ = possible_;
            }

            mNemonicArray[i] = mNemonic_;
        }

    }

    public void addActionListener(ActionListener pAction)
    {
        for(int i = 0; i < buttonArray.length; i++)
            buttonArray[i].addActionListener(pAction);

    }

    public void setMessage(String pMessage)
    {
        messageBar.setText(pMessage);
    }

    public void actionPerformed(ActionEvent e)
    {
        int option_ = Integer.parseInt(e.getActionCommand());
        switch(option_)
        {
        default:
            break;

        case 0: // '\0'
            console.setText("");
            break;

        case 1: // '\001'
            if(fileChooser == null)
                fileChooser = new JFileChooser();
            int save_ = fileChooser.showSaveDialog(this);
            if(save_ != 0)
                break;
            File file_ = fileChooser.getSelectedFile();
            Vector vector_ = new Vector();
            vector_.addElement(console.getText());
            try
            {
                FileUtils.writeSequentialFile(file_.getAbsolutePath(), vector_, false);
            }
            catch(IOException ex)
            {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", 0);
            }
            break;
        }
    }

    public void windowActivated(WindowEvent windowevent)
    {
    }

    public void windowClosed(WindowEvent e)
    {
        System.exit(0);
    }

    public void windowClosing(WindowEvent windowevent)
    {
    }

    public void windowDeactivated(WindowEvent windowevent)
    {
    }

    public void windowDeiconified(WindowEvent windowevent)
    {
    }

    public void windowIconified(WindowEvent windowevent)
    {
    }

    public void windowOpened(WindowEvent windowevent)
    {
    }

    String title;
    String buttonLabelsArray[];
    JButton buttonArray[];
    JTextArea console;
    JLabel messageBar;
    char mNemonicArray[];
    ByteArrayOutputStream os;
    JFileChooser fileChooser;
    private static final int CLEAR_CONSOLE_BUTTON_ID = 0;
    private static final int SAVE_CONSOLE_BUTTON_ID = 1;
	private final class GraphicMenu$1
		implements Runnable
	{

		public void run()
		{
			do
			{
				String str_ = os.toString();
				os.reset();
				if(str_ != null && !str_.trim().equals(""))
					console.setText(console.getText() + str_);
				getContentPane().validate();
				getContentPane().repaint();
				console.setCaretPosition(console.getText().length());
				try
				{
					Thread.sleep(1000L);
				}
				catch(InterruptedException interruptedexception) { }
			} while(true);
		}

		GraphicMenu$1()
		{
		}
	}    
}