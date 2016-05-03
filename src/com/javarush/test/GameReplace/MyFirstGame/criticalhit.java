package com.javarush.test.GameReplace.MyFirstGame;

/**
 * Created by Mistes on 18.04.2016.
 */
public class criticalhit
{
    public static int Iscritical()
    {
        int i = (int) (Math.random() * 10 + 1);
        if (i > 8)
        {
            System.out.println("CRITICAL HIT!");
            return 2;


        } else return 1;
    }

}
