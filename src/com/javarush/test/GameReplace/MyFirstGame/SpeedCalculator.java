package com.javarush.test.GameReplace.MyFirstGame;

/**
 * Created by Mistes on 04.05.2016.
 */
public class SpeedCalculator
{
    public int speedCalcPVE(Armor arm, Weapon wep, Person pers)
    {
        //How many strikes you will have, or your PVP enemy, Foe attaked all time!
        int speed = arm.getStatmovement() + wep.getWepspeed() + pers.getPersonspeed();
        int variabled = (speed / 20) + ((int) (Math.random() * 3) - 1);
        return variabled;
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