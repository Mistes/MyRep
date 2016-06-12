package com.javarush.test.GameReplace.ChatClient;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Mistes on 11.06.2016.
 */
public class SimpleChatClientA
{
    JTextField outgoing;
    PrintWriter writer;
    Socket sock;
    JTextArea incoming;
    BufferedReader reader;

    public void go(){
        JFrame frame = new JFrame("Its boring simple chat client!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);
        incoming = new JTextArea(15,50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(true);

        JScrollPane aScroller = new JScrollPane(incoming);
        aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(e -> {try{
            writer.println(outgoing.getText());
            writer.flush();
           }catch (Exception ed){ed.printStackTrace();}
                 outgoing.setText("");
                 outgoing.requestFocus();
                                               });
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        mainPanel.add(aScroller);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        setUpNetworking();

        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

        frame.setSize(700,400);
        frame.setVisible(true);
    }
    private void setUpNetworking(){
        try{
            sock = new Socket("127.0.0.1", 5000);
            InputStreamReader StreamReader = new InputStreamReader(sock.getInputStream());
            reader = new BufferedReader(StreamReader);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("NetWorking estabilished");
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public class IncomingReader implements Runnable{
        @Override
        public void run()
        {
            String message;
            try{
                while ((message = reader.readLine())!=null){
                    System.out.println("read " + message);
                    incoming.append(message + "\n");
                   // incoming.setText(message);
                }
            }catch (Exception e){e.printStackTrace();}
        }
    }
    public static void main(String[] args)
    {
        new SimpleChatClientA().go();
    }

}
