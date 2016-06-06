package com.javarush.test.GameReplace.Midi;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Администратор on 06.06.2016.
 */
public class MyDrawPanel extends JPanel
{


        public void pain1tComponent(Graphics g){

            g.setColor(Color.orange);
            for(int i = 0; i<10; i++)
            {
                g.fillOval(10,10, 100, 100);
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    System.out.println(e);
                }
            }

        }
    }

