package com.javarush.test.GameReplace.Midi;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Mistes on 05.06.2016.
 */
public class MySecondGUI
{
    public static void main(String[] args)
    {
       MySecondGUI gui = new MySecondGUI();
        gui.go();

    }

    public void go()
    {
        final JFrame frame = new JFrame();



        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setVisible(true);
    }
}
