package com.javarush.test.MyFirstGame;

public class armor
{

    public static class IronHelmet implements armorinterface.Helmets
    {
        private static int IronheadDefence = 12;
        private static int movementInHead = 3;

        public static void call()
        {
            System.out.println("You choose IRON HELMET!");

        }
        public static int getHeadDefence(){
            return IronheadDefence;}
        public static int getHeadMovement(){
            return movementInHead;
        }
    }

        public static class IronChest implements armorinterface.Chests
        {
            IronChest ironChest = new IronChest();
            private static int chestDefence = 18;
            private static int movementInChest = 6;

            public static void call()
            {
                System.out.println("You choose Iron Chest!");
            }
            public static int getChestDefence(){
                return chestDefence;}
            public static int getChestMovement(){
                return movementInChest;}


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

        public static void ArmorAnounce()
        {
            IronChest.call();
            IronHelmet.call();
            IronLegs.call();
        }
    }

