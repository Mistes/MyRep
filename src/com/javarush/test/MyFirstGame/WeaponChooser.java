package com.javarush.test.MyFirstGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Mistes on 20.04.2016.
 */
public class WeaponChooser
{
    public static int weaponspeed;
    public static int weapondamage;

    public static void WeaponChose()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Choose your Weapon: 1==SWORD---2==KNIFE-----3==MACE");

            while (true)
            {
                int value = Integer.parseInt(reader.readLine());
                if (value == 3)
                {
                    weaponspeed = Weapon.Mace.getSpeed();
                    weapondamage = Weapon.Mace.getDamage();
                    Weapon.Mace.weaponcall();
                    break;
                }
                if (value == 2)
                {
                    weaponspeed = Weapon.Knife.getSpeed();
                    weapondamage = Weapon.Knife.getDamage();
                    Weapon.Knife.weaponcall();
                    break;
                }
                if (value == 1)// leather here
                {
                    weaponspeed = Weapon.Sword.getSpeed();
                    weapondamage = Weapon.Sword.getDamage();
                    Weapon.Sword.weaponcall();
                    break;
                }
            }

        }
        catch (Exception e)
        {
            System.out.println("EXCEPTION IN READER MOTHERFUCKER");
        }
    }
}
