package com.javarush.test.GameReplace.Midi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Администратор on 10.06.2016.
 */
public class DailyAdvicer
{
    public void go() {
        try {
            Socket s = new Socket("127.0.0.1", 4242);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            System.out.println("Today you should: " + advice);
            reader.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        DailyAdvicer client = new DailyAdvicer();
        client.go();
    }
}
