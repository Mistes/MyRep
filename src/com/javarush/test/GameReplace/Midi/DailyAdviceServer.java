package com.javarush.test.GameReplace.Midi;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Администратор on 10.06.2016.
 */
public class DailyAdviceServer
{
    String[] adviceList = {"Еште маленькими порциями", "Buy a new jeans", "two words: Its a bad choice",
    "Be honest right today", "Maybe, you need to change your hair style"};
    public void go(){
        try{
            ServerSocket serverSock = new ServerSocket(4242);
            while (true){
                Socket sock = serverSock.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
            }
        }catch (IOException e){e.printStackTrace();}
    }
    private String getAdvice(){
        int random =(int)(Math.random()*adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args)
    {
        DailyAdviceServer sever = new DailyAdviceServer();
        sever.go();
    }
}
