package com.javarush.test.GameReplace.MyFirstGame;

import java.util.HashMap;

public class Armor
{
    HashMap<Integer, ArmorComplect> oparm = new HashMap<>();
    Utill util = new Utill();
    private int statdefence;
    private int statyourhpbonus;
    private int statmovement;



    public void Armorcall()
    {
        System.out.println(String.format("You choose %s, you really choose that?", oparm.get(util.getImput()).getName()));
    }

    public int getStatdefence()
    {
        return statdefence;
    }

    public int getStatyourhpbonus()
    {
        return statyourhpbonus;
    }

    public int getStatmovement()
    {
        return statmovement;
    }

    public void SetArmor()
    {
        ArmorComplect cloth = new ArmorComplect(1, 50, 70, "Old cloth from garbage");
        ArmorComplect leather = new ArmorComplect(30, 90, 50, "Not so bad leather");
        ArmorComplect mail = new ArmorComplect(40, 110, 40, "Hunter's mail");
        ArmorComplect plate = new ArmorComplect(60, 130, 30, "Plate from old knight");
        oparm.put(1, cloth);
        oparm.put(2, leather);
        oparm.put(3, mail);
        oparm.put(4, plate);


    }

    public void ArmorChooserV2()
    {
        try
        {
            SetArmor();
            util.ReadInput("Choose your armor!: 1==Cloth---2==Leather-----3==Mail-----4==Plate");
            statdefence = oparm.get(util.getImput()).getDefence();
            statmovement = oparm.get(util.getImput()).getMovement();
            statyourhpbonus = oparm.get(util.getImput()).getYourhpbonus();
            Armorcall();

        }
        catch (NullPointerException e)
        {
            util.ReadInput("You need to push only numbers from 1 to 4! But you pushed " + util.getImput() + " And now all will start again!");
            ArmorChooserV2();

        }
    }

    public class ArmorComplect
    {
        String name;
        private int defence;
        private int yourhpbonus;
        private int movement;

        public ArmorComplect(int defence, int yourhpbonus, int movement, String name)
        {
            this.defence = defence;
            this.yourhpbonus = yourhpbonus;
            this.movement = movement;
            this.name = name;
        }

        public int getDefence()
        {
            return defence;
        }

        public int getYourhpbonus()
        {
            return yourhpbonus;
        }

        public int getMovement()
        {
            return movement;
        }

        public String getName()
        {
            return name;
        }
    }
}

