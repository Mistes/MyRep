package com.javarush.test.GameReplace.Midi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Администратор on 08.06.2016.
 */
public class PanelForText implements ActionListener
{
    int n = 0;
    JTextArea area;
    public static void main(String[] args)
    {
        PanelForText gui = new PanelForText();
        gui.go();
    }

    public void go()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        area = new JTextArea(10,20);
        final JButton button = new JButton("Just click click");
        area.setText("Start");

        button.addActionListener(this);
        panel.setBackground(Color.DARK_GRAY);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH,button);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.setSize(350, 300);
        frame.setVisible(true);
        JScrollPane scroller = new JScrollPane(area);
        area.setLineWrap(true);

        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scroller);
        //JTextField field2 = new JTextField("Take your name");
        area.selectAll();
        area.requestFocus();
       panel.add(area);

       // frame.add(field2);


    }
    public void actionPerformed(ActionEvent e) {

        n++;

        area.append("Button clicked "+ n +" times"+ "\n");

    }
}
