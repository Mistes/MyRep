package com.javarush.test.GameReplace.QuizCards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Created by Администратор on 09.06.2016.
 */
public class QuizCardBuilder
{
    private JTextArea question;
    private JTextArea answer;
    private ArrayList<QuizCard> cardsList;
    private JFrame frame;

    public static void main(String[] args)
    {
        QuizCardBuilder builder = new QuizCardBuilder();
        builder.go();
    }

    public void go(){
        frame = new JFrame("Quiz card builder");
        JPanel mainpanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD,24);
        question = new JTextArea(6, 20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(bigFont);

        JScrollPane qScroller = new JScrollPane(question);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        answer = new JTextArea(6,20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(bigFont);

        JScrollPane aScroller = new JScrollPane(answer);
        aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton nextButton = new JButton("Next card");

        cardsList = new ArrayList<>();

        JLabel qLabel = new JLabel("Question:");
        JLabel aLabel = new JLabel("Answer:");

        mainpanel.add(qLabel);
        mainpanel.add(qScroller);
        mainpanel.add(aLabel);
        mainpanel.add(aScroller);
        mainpanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());
        JMenuBar menuBar = new JMenuBar();
        JMenu filemenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        newMenuItem.addActionListener(new NewMenuListener());

        saveMenuItem.addActionListener(new SaveMenuListener());
        filemenu.add(newMenuItem);
        filemenu.add(saveMenuItem);
        menuBar.add(filemenu);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER,mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,600);
        frame.setVisible(true);
    }

    private class NextCardListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e)
        {
            QuizCard card = new QuizCard(question.getText(),answer.getText());
            cardsList.add(card);
            clearCard();

        }
    }
    private class SaveMenuListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e)
        {
            QuizCard card = new QuizCard(question.getText(),answer.getText());
            cardsList.add(card);
            JFileChooser fileSave = new JFileChooser();
            fileSave.showSaveDialog(frame);
            saveFile(fileSave.getSelectedFile());

        }
    }
    private class NewMenuListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e)
        {
            cardsList.clear();
            clearCard();

        }
    }
    private void clearCard(){
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }
    private void saveFile(File file){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            for(QuizCard card : cardsList){
                writer.write(card.getQuestion() + "/");
                writer.write((card.getAnswer())+ '\r'+ '\n');
            }
            writer.close();
        }catch (Exception e){
            System.out.println("Cant write cardList out!");
            e.printStackTrace();
        }
    }


}
