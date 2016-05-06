package com.javarush.test.GameReplace.MyFirstGame;

import com.javarush.test.level20.lesson07.task03.Solution;

/**
 * Created by Mistes on 04.05.2016.
 */
public class SpeedCalculator
{
    public boolean speedCalcPVE(Armor arm, Person pers)
    {
        int avoidness = arm.getStatmovement() + pers.getPersonspeed()  + ((int) (Math.random() * 30) - 15);
        int cooficient = avoidness / 20;
        if (cooficient < 2)
        {
            cooficient = 2;
        }
        int i = (int) (Math.random() * 10);
        if (i < cooficient)
        {
            System.out.println(pers.getPersonname() + " avoid this hit!!!");
            return false;   // false if missed


        } else return true;

    }
    public boolean misschancePVE(Weapon wep,Person pers){
        int accuracy = wep.getWepaccuracy();
        int i = (int) (Math.random() * 100 + 1);
        if (i < (45 - accuracy))
        {System.out.println(pers.getPersonname() + " missed this hit!");// false if YOU missed
            return false;



        } else return true;
    }

    public boolean speedCalcPVP(Armor arm, Weapon wep, Person pers)
    {
        // in this case wep is wep your enemy, its chance for hit, all rest for avoid, and players fight to the death , speedcalc ts about how many times you can avoid
        int avoidness = arm.getStatmovement() + pers.getPersonspeed() - wep.getWepaccuracy() + ((int) (Math.random() * 30) - 15);
        int cooficient = avoidness / 20;
        if (cooficient < 2)
        {
            cooficient = 2;
        }
        int i = (int) (Math.random() * 10);
        if (i < cooficient)
        {
            System.out.println(pers.getPersonname() + " avoid this hit!!!");
            return false;   // false if missed


        } else return true;

    }
}
//124     50%
//100     40
//80      30
//60      20
//        15