package com.bai.java.learn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class TimerPrinter implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("Time is " + now + " now.");

    }

}
