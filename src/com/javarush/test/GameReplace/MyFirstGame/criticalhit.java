package com.javarush.test.GameReplace.MyFirstGame;

/**
 * Created by Mistes on 18.04.2016.
 */
public class criticalhit
{
    public static double Iscritical(Weapon wep)
    {
        double i = (int) (Math.random() * 10 + 1);
        if (i < wep.getWepcritchance()) //crit chance!
        {
            System.out.println("CRITICAL HIT!");
            return wep.getWepcritefectience();// need to return crit.effectivency


        } else return 1;
    }

}
