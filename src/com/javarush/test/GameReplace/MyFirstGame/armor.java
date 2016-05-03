package com.javarush.test.GameReplace.MyFirstGame;

import java.util.HashMap;

public class armor
{
    HashMap<Integer, ArmorComplect> oparm = new HashMap<>();
    Utill util = new Utill();
    private int statdefence;
    private int statyourhpbonus;
    private int statmovement;

    public static void ArmorAnounce()
    {
        IronChest.call();
        IronHelmet.call();
        IronLegs.call();
    }

    public void Armorcall()
    {

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

            //weaponcall();

        }
        catch (NullPointerException e)
        {
            util.ReadInput("You need to push only numbers from 1 to 4! But you pushed " + util.getImput() + " And now all will start again!");
            //WeaponChooserV2();

        }
    }

    public static class IronHelmet implements armorinterface.Helmets
    {
        private static int IronheadDefence = 12;
        private static int movementInHead = 3;

        public static void call()
        {
            System.out.println("You choose IRON HELMET!");

        }

        public static int getHeadDefence()
        {
            return IronheadDefence;
        }

        public static int getHeadMovement()
        {
            return movementInHead;
        }
    }

    public static class IronChest implements armorinterface.Chests
    {
        private static int chestDefence = 18;
        private static int movementInChest = 6;
        IronChest ironChest = new IronChest();

        public static void call()
        {
            System.out.println("You choose Iron Chest!");
        }

        public static int getChestDefence()
        {
            return chestDefence;
        }

        public static int getChestMovement()
        {
            return movementInChest;
        }


    }

    public static class IronLegs implements armorinterface.Legs
    {
        private static int legDefence = 10;
        private static int movementInLegs = 15;

        public static void call()
        {
            System.out.println("You choose Iron Legs!");
        }

        public static int getLegDefence()
        {
            return legDefence;
        }

        public static int getLegMovement()
        {
            return movementInLegs;
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

