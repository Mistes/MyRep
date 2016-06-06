package com.javarush.test.GameReplace.Midi;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Mistes on 05.06.2016.
 */
public class MySecondGUI
{
    int x = 270;
    int y = 70;
    public static void main(String[] args)
    {
       MySecondGUI gui = new MySecondGUI();
        gui.go();

    }

    public void go()
    {
        final JFrame frame = new JFrame();




        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(drawPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
        for(int i = 0; i <130; i++){
            x++;
          //  y++;
            drawPanel.repaint();
            try{Thread.sleep(50);}catch (InterruptedException e){
                System.out.println(e);
            }

        }
    }
    public class MyDrawPanel extends JPanel
    {

        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0,0,getHeight(),getWidth());
            g.setColor(Color.green);
                g.fillOval(x, y, 100, 100);

        }
        }
    }
