package com.javarush.test.GameReplace.PockerConsole;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Mistes on 22.06.2016.
 */
public class MainHere
{
    private int numberGame;
  // public static MainHere basic;

    public static void main(String[] args)
    {
      new MainHere().go();
    }
    public void go(){
       JFrame theFrame = new JFrame("Cyber BeatBox");
          theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          BorderLayout layout = new BorderLayout();
          JPanel background = new JPanel(layout);
          background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JPanel mainPanel = new JPanel();
        JPanel topPanel = new JPanel();
        JPanel downPanel = new JPanel();

       JTextArea testing = new JTextArea(15,50);
        testing.setLineWrap(true);
        testing.setWrapStyleWord(true);
        testing.setEditable(true);

        JLabel label = new JLabel("Add new player");

        JLabel countLabel = new JLabel("Игра № " + numberGame);

        JScrollPane aScroller = new JScrollPane(testing);
        aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton startGame = new JButton("Начать игру");
        startGame.addActionListener(e -> {try{

        }catch (Exception ed){ed.printStackTrace();}

        });

        JTextField newPlayer = new JTextField(20);

        topPanel.add(startGame);
        topPanel.add(countLabel);
        mainPanel.add(aScroller);
        downPanel.add(label);
        downPanel.add(newPlayer);
      //  downPanel.setLayout(new BoxLayout(downPanel,BoxLayout.Y_AXIS));

        theFrame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        theFrame.getContentPane().add(BorderLayout.NORTH, topPanel);
        theFrame.getContentPane().add(BorderLayout.SOUTH, downPanel);



        theFrame.setSize(700,400);
        theFrame.setVisible(true);
    }

}
