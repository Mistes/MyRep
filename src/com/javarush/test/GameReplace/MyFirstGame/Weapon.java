package com.javarush.test.GameReplace.MyFirstGame;

import com.javarush.test.MyFirstGame.WeaponChooser;
import com.javarush.test.level06.lesson08.task03.Util;
import com.javarush.test.level20.lesson04.task05.Solution;

import java.util.HashMap;

public class Weapon
{
    Utill util = new Utill();
    HashMap<Integer, AllWeps> opwep = new HashMap<>();
    private int wepspeed;
    private int wepdamage;
    private int wepaccuracy;
    private int wepcritchance;
    private int wepcritefectience;

    public int getWepspeed()
    {
        return wepspeed;
    }

    public int getWepdamage()
    {
        return wepdamage;
    }

    public int getWepaccuracy()
    {
        return wepaccuracy;
    }

    public int getWepcritchance()
    {
        return wepcritchance;
    }

    public int getWepcritefectience()
    {
        return wepcritefectience;
    }

    public void weaponcall()
    {
        System.out.println(String.format("You choose %s Its your weapon for now", opwep.get(util.getImput()).getName()));
    }

    public void setWeapons()
    {
        AllWeps mace = new AllWeps(1, 80, 6, "Mace!", 3, 8);
        AllWeps dagger = new AllWeps(40, 35, 8, "Dagger", 7, 2);
        AllWeps sword = new AllWeps(25, 55, 7, "Sword!", 4, 7);
        AllWeps nunchakas = new AllWeps(60, 15, 9, "Nunchakas", 9, 3);
        opwep.put(1, mace);
        opwep.put(2, dagger);
        opwep.put(3, sword);
        opwep.put(4, nunchakas);
    }


    public void WeaponChooserV2()
    {
        try
        {
            setWeapons();
            util.ReadInput("Choose your Weapon!: 1==Mace---2==Dagger-----3==Sword-----4==Nunchakas");
            wepspeed = opwep.get(util.getImput()).getSpeed();
            wepdamage = opwep.get(util.getImput()).getDamage();
            wepaccuracy = opwep.get(util.getImput()).getAccuracy();
            wepcritchance = opwep.get(util.getImput()).getCritchance();
            wepcritefectience = opwep.get(util.getImput()).getCritefectience();
            weaponcall();

        }
        catch (NullPointerException e)
        {
            util.ReadInput("You need to push only numbers from 1 to 4! But you pushed " + util.getImput() + " And now all will start again!");
            WeaponChooserV2();

        }
    }

    public class AllWeps
    {
        private int speed;
        private int damage;
        private int accuracy;
        private String name;
        private int critchance;
        private int critefectience;

        public AllWeps(int speed, int damage, int accuracy, String name, int critchance, int critefectience)
        {
            this.speed = speed;
            this.damage = damage;
            this.accuracy = accuracy;
            this.name = name;
            this.critchance = critchance;
            this.critefectience = critefectience;
        }

        public int getSpeed()
        {
            return speed;
        }

        public int getDamage()
        {
            return damage;
        }

        public int getAccuracy()
        {
            return accuracy;
        }

        public String getName()
        {
            return name;
        }

        public int getCritchance()
        {
            return critchance;
        }

        public int getCritefectience()
        {
            return critefectience;
        }

    }
}
