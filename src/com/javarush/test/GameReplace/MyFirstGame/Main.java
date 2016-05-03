package com.javarush.test.GameReplace.MyFirstGame;

import com.javarush.test.level20.lesson04.task05.Solution;

/**
 * Created by Mistes on 18.04.2016.
 */
public class Main
{
    public static void main(String[] args)
    {
        Main main = new Main();
        main.gamebody();


    }

    public void gamebody()
    {
        Opponent opo = new Opponent();
        Weapon weapon = new Weapon();
        Weapon weapon2 = new Weapon();

        opo.ChooserMethod();
        weapon.WeaponChooserV2();
        weapon2.WeaponChooserV2();


        armorchooser.HeadChooseer();
        armorchooser.ChestChooseer();
        armorchooser.LegChooseer();
        System.out.println("Your armor count is " + armorcalculator.armorAmmount());


        int then = opo.getOpoHP();
        for (int i = 0; i <= armorcalculator.speedcount(); i++)
        {
            System.out.println(" Hp your enemy is now " + then);

            int dmg = ((((weapon.getWepdamage()) + (int) (Math.random() * 10 + 10)) - opo.getOpoArmor()) * criticalhit.Iscritical());

            then = then - dmg;
            System.out.println("Its your   " + (i + 1) + " hit!");
            System.out.println("You hit your enemy at " + dmg + " HP");

            if (then < 0)
            {
                System.out.println("Your enemy is died! YOU ARE BRUTAL MURDERER!!!");
                break;
            }
            if (i == armorcalculator.speedcount())
            {
                System.out.println("Your enemy still alive.YOU ARE JERK ! Your foe have left  only " + then + " HP");
                ;
            }

        }
    }



}
