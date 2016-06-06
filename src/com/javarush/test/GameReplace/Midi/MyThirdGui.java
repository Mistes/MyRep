package com.javarush.test.GameReplace.Midi;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyThirdGui extends JFrame {
    private int voron = 0;
    private JLabel countLabel;
    private JButton addCrow;
    private JButton removeCrow;

    public MyThirdGui(){
        super("Crow calculator");
        //Подготавливаем компоненты объекта
        countLabel = new JLabel("Crows:" + voron);
        addCrow = new JButton("Add Crow");
        removeCrow = new JButton("Remove Crow");

        //Подготавливаем временные компоненты
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        //Расставляем компоненты по местам
        add(countLabel, BorderLayout.NORTH); //О размещении компонент поговорим позже
        addCrow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                voron = voron+5;     //Добавляем одну ворону
                updateCrowCounter(); //Сообщаем приложению, что количество ворон изменилось
            }
        });
        removeCrow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                voron = voron-2;
                if(voron<0){voron = 0;}
                updateCrowCounter();}

        });


        buttonsPanel.add(addCrow);
        buttonsPanel.add(removeCrow);

        add(buttonsPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void updateCrowCounter() {
        countLabel.setText("Crows:" + voron);
    }

    public static void main(String[] args) {
        MyThirdGui app = new MyThirdGui();
        app.setVisible(true);
        app.pack(); //Эта команда подбирает оптимальный размер в зависимости от содержимого окна
    }
}