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
        Opponent starting = new Opponent();
        starting.SetEnemies();
        starting.ChooserMethod();


       // OpponentChooseer opoChoos = new OpponentChooseer();
       // opoChoos.WhatyouChoose();
        armorchooser.HeadChooseer();
        armorchooser.ChestChooseer();
        armorchooser.LegChooseer();
        System.out.println("Your armor count is " + armorcalculator.armorAmmount());
        WeaponChooser.WeaponChose();
        DMG.damagaem(starting);

    }



}
