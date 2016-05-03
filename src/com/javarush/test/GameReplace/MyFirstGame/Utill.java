package com.javarush.test.GameReplace.MyFirstGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Mistes on 02.05.2016.
 */
public class Utill
{
    private int imput;

    public int getImput()
    {
        return imput;
    }

    public void setImput(int imput)
    {
        this.imput = imput;
    }

    public void ReadInput(String msg)
    {
        System.out.println(msg);
        int value;

        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            value = Integer.parseInt(reader.readLine());
            setImput(value);
        }
        catch (Exception e)
        {
            System.out.println("EXCEPTION IN READER MOTHERFUCKER");
        }
    }
}
