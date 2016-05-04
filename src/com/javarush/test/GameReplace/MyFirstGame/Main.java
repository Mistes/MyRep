package com.javarush.test.GameReplace.MyFirstGame;

import com.javarush.test.level20.lesson04.task05.Solution;

/**
 * Created by Mistes on 18.04.2016.
 */
public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Main main = new Main();
        main.gamebody();


    }

    public void gamebody() throws InterruptedException
    {
        SpeedCalculator player1calc = new SpeedCalculator();
        Person player1 = new Person();
        Opponent opo = new Opponent();
        Weapon weapon1 = new Weapon();
        Armor armor1 = new Armor();
        Weapon weapon2 = new Weapon();
        player1.PersonChooserV2();
        opo.ChooserMethod();
        weapon1.WeaponChooserV2();
        armor1.ArmorChooserV2();
        //weapon2.WeaponChooserV2();
        //System.out.println("Player1 choosed " +weapon.getWepname());
        //System.out.println("Player2 choosed " + weapon2.getWepname());


        //armorchooser.HeadChooseer();
        //armorchooser.ChestChooseer();
        //armorchooser.LegChooseer();


        int then = opo.getOpoHP();
        for (int i = 0; i <= player1calc.speedCalcPVE(armor1, weapon1, player1); i++)
        {
            Thread.sleep(1000);
            System.out.println(" Hp your enemy is now " + then);

            int dmg = ((((weapon1.getWepdamage()) + (int) (Math.random() * 20 + 1)) - opo.getOpoArmor()) * criticalhit.Iscritical());

            then = then - dmg;
            System.out.println("Its your   " + (i + 1) + " hit!");
            System.out.println("You hit your enemy at " + dmg + " HP");

            if (then < 0)
            {
                System.out.println("Your enemy is died! YOU ARE BRUTAL MURDERER!!!");
                break;
            }
            if (i == player1calc.speedCalcPVE(armor1, weapon1, player1))
            {
                System.out.println("Your enemy still alive.YOU ARE JERK ! Your foe have left  only " + then + " HP");
                ;
            }

        }
    }


}
