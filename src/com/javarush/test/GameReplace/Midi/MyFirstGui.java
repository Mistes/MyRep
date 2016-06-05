package com.javarush.test.GameReplace.Midi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mistes on 05.06.2016.
 */
public class MyFirstGui {

    public static void main(String[] args)
    {
        MyFirstGui gui = new MyFirstGui();
        gui.go();

    }

    public void go()
    {
        final JFrame frame = new JFrame();
        JButton colorButton = new JButton("Changing colors!");
        JButton labelButton = new JButton("we will");
        final JLabel label = new JLabel("LABELL!!!!!");
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        labelButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               label.setText("Oooohhh");
            }
        });


          colorButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               frame.repaint();
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setVisible(true);
    }


}

