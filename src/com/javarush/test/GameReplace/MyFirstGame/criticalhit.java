package com.javarush.test.GameReplace.MyFirstGame;

/**
 * Created by Mistes on 18.04.2016.
 */
public class criticalhit
{
    public static double Iscritical()
    {
        double i = (int) (Math.random() * 10 + 1);
        if (i > 8)
        {
            System.out.println("CRITICAL HIT!");
            return 1.5;


        } else return 1;
    }

}
