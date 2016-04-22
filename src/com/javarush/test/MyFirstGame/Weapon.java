package com.javarush.test.MyFirstGame;

/**
 * Created by Mistes on 20.04.2016.
 */
public class Weapon
{
    public static class Mace{
        private static int speed = 1;
        private static int damage = 80;
        public static int getSpeed(){
            return speed;
        }
        public static int getDamage(){
            return damage;
        }
        public static void weaponcall(){
            System.out.println("You choose MACE!!!!");
        }
    }
    public static class Knife{
        private static int speed = 50;
        private static int damage = 35;
        public static int getSpeed(){
            return speed;
        }
        public static int getDamage(){
            return damage;
        }
        public static void weaponcall(){
            System.out.println("You choose KNIFE!!!!");
        }
    }
    public static class Sword{
        private static int speed = 25;
        private static int damage = 60;
        public static int getSpeed(){
            return speed;
        }
        public static int getDamage(){
            return damage;
        }
        public static void weaponcall(){
            System.out.println("You choose SWORD!!!!");
        }
    }
}
