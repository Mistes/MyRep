package com.javarush.test.GameReplace.Midi;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Администратор on 08.06.2016.
 */
public class NewPanel
{
    public static void main(String[] args)
    {
        NewPanel gui = new NewPanel();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.setSize(250, 200);
        frame.setVisible(true);
        JButton button = new JButton("Take me");
        JButton button2 = new JButton("Give me break");
        JButton button3 = new JButton("He he!");
        panel.add(button);
        panel.add(button2);
        panel.add(button3);


    }

}
