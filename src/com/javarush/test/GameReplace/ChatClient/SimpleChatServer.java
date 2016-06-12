package com.javarush.test.GameReplace.ChatClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Mistes on 12.06.2016.
 */
public class SimpleChatServer
{
    ArrayList clientOutputStreams;

    public class ClientHandler implements Runnable{
        BufferedReader reader;
        Socket sock;
        public ClientHandler(Socket clientSocket){
            try{
                sock = clientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);

            }catch (Exception e){
                System.out.println(e);
            }
        }
        @Override
        public void run()
        {
            String message;
            try{
                while ((message = reader.readLine())!=null){
                    System.out.println("read " + message);
                    tellEveryOne(message);
                    System.out.println("Sending " + message);

                }
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args)
    {
        new SimpleChatServer().go();
    }
    public void go(){
        clientOutputStreams = new ArrayList();
        try{
            ServerSocket serverSock = new ServerSocket(5000);
            while (true){
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStreams.add(writer);

                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("Got a connection");

            }
        }catch (Exception e){e.printStackTrace();}
    }
    public void tellEveryOne(String message){
        Iterator it = clientOutputStreams.iterator();
        while (it.hasNext()){try
        {
            PrintWriter writer = (PrintWriter)it.next();
            writer.println(message);
            writer.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
        }
    }
}
