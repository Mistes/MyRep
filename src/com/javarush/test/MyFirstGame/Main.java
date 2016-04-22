package com.javarush.test.MyFirstGame;

/**
 * Created by Mistes on 18.04.2016.
 */
public class Main
{
    public static void main(String[] args)
    {
        Main main = new Main();
        OpponentChooseer.WhatyouChoose();
        armorchooser.HeadChooseer();
        armorchooser.ChestChooseer();
        armorchooser.LegChooseer();
        System.out.println("Your armor count is " + armorcalculator.armorAmmount());
        WeaponChooser.WeaponChose();
        DMG.damagaem();

    }
    public Orc getOrc(){
        return new Orc(1,500);
    }
}
