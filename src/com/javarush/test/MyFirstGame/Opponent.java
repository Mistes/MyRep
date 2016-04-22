package com.javarush.test.MyFirstGame;

/**
 * Created by Mistes on 20.04.2016.
 */
public class Opponent
{
    public static class Orc
    {
        private static int armor = 20;
        private static int hp = 215;

        public static int getArmor()
        {
            return armor;
        }
        public static int getHp()
        {return hp;}
        public static void Call(){
            System.out.println("You choose ORC ENEMY");
        }
        public static void Choosed(){
            System.out.println("Your enemy will be ORC!!!");
        }
    }
    public static class Princess
    {
        private static int armor = 10;
        private static int hp = 150;

        public static int getArmor()
        {
            return armor;
        }
        public static int getHp()
        {return hp;}
        public static void Call(){
            System.out.println("You choose PRINCESS ENEMY");
        }
        public static void Choosed(){
            System.out.println("Your enemy will be PRINCESS!!!");
        }
    }
    public static class Dragon
    {
        private static int armor = 5;
        private static int hp = 400;

        public static int getArmor()
        {
            return armor;
        }
        public static int getHp()
        {return hp;}
        public static void Call(){
            System.out.println("You choose DRAGON BEWARE OHOHOH");
        }
        public static void Choosed(){
            System.out.println("Your enemy will fucking DRAGON !!!! YOU WILL DIE!!!");
        }
    }
}
