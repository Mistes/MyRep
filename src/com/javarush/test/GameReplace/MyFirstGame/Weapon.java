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
    private double wepcritefectience;
    private String wepname;

    public int getWepspeed()
    {
        return wepspeed;
    }

    public String getWepname()
    {
        return wepname;
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

    public double getWepcritefectience()
    {
        return wepcritefectience;
    }

    public void weaponcall()
    {
        System.out.println(String.format("You choose %s Its your weapon for now", opwep.get(util.getImput()).getName()));
    }

    public void setWeapons()//int speed, int damage, int accuracy, String name, int critchance, int critefectience
    {
        AllWeps mace = new AllWeps      (1, 95, 22, "Mace!",     3, 1.8);
        AllWeps dagger = new AllWeps    (3, 30, 10, "Dagger",    5, 1.3);
        AllWeps sword = new AllWeps     (1, 70, 30, "Sword!",    4, 2.5);
        AllWeps nunchakas = new AllWeps (2, 45, 15, "Nunchakas", 4, 1.7);
        opwep.put(1, mace);
        opwep.put(2, dagger);
        opwep.put(3, sword);
        opwep.put(4, nunchakas);
    }
    public String Who(HashMap<Integer, AllWeps> hehe)
    {
        String then = "";
        for (HashMap.Entry<Integer, AllWeps> map : hehe.entrySet()
                )
        {
            Integer keys = map.getKey();
            String value = map.getValue().getName();
            String who = keys + "==" + value + "----";
            then = then + who;


            // 1==Mace---2==Dagger-----3==Sword-----4==Nunchakas
        }
        return then;

    }


    public void WeaponChooserV2()
    {
        try
        {
            setWeapons();
            util.ReadInput("Choose your Weapon!: " + Who(opwep));
            wepspeed = opwep.get(util.getImput()).getSpeed();
            wepdamage = opwep.get(util.getImput()).getDamage();
            wepaccuracy = opwep.get(util.getImput()).getAccuracy();
            wepcritchance = opwep.get(util.getImput()).getCritchance();
            wepcritefectience = opwep.get(util.getImput()).getCritefectience();
            wepname = opwep.get(util.getImput()).getName();
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
        private double critefectience;

        public AllWeps(int speed, int damage, int accuracy, String name, int critchance, double critefectience)
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

        public double getCritefectience()
        {
            return critefectience;
        }

    }
}
