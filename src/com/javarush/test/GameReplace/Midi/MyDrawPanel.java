package com.javarush.test.GameReplace.Midi;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Mistes on 05.06.2016.
 */
public class MyDrawPanel extends JPanel
{
    public void paintComponent23123(Graphics g){
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        int red =    (int)(Math.random()*255);
        int green =  (int)(Math.random()*255);
        int blue =   (int)(Math.random()*255);

        Color randomColor = new Color(red,green,blue);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);
    }
    public void paintComponent(Graphics g){
        int x = 20;
        int y = 50;
        g.setColor(Color.orange);
        for(int i = 0; i<10; i++){
            g.fillOval(x,y,100,100);
            try{Thread.sleep(500);}catch (InterruptedException e){
                System.out.println(e);
            }
            x = x+5;
            y=y + 5;

        }
    }
}
