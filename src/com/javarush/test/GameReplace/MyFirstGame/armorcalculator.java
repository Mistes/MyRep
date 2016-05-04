package com.javarush.test.GameReplace.MyFirstGame;

/**
 * Created by Mistes on 18.04.2016.
 */
public class armorcalculator
{
    public static int armorAmmount()
    {
        return 1;// armorchooser.chestarmor + armorchooser.legarmor + armorchooser.headarmor;
    }

    public static int SpeedAmmount()
    {
        return 1;// armorchooser.chestmove;// + armorchooser.headmove + armorchooser.legmove + WeaponChooser.weaponspeed;
    }

    public static int speedcount()
    {
        int a = 1;//armorchooser.chestmove;// + armorchooser.headmove + armorchooser.legmove + WeaponChooser.weaponspeed;

        if (a < 25)
            return 2;
        if (a > 25 && a < 70)
            return 4;
        if (a > 70)
            return 7;
        else return 1;
    }
}

