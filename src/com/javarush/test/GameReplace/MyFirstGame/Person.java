package com.javarush.test.GameReplace.MyFirstGame;

import com.javarush.test.level20.lesson04.task05.Solution;

import java.util.HashMap;

/**
 * Created by Mistes on 03.05.2016.
 */
public class Person
{
    Utill util = new Utill();
    HashMap<Integer, Character> oppers = new HashMap<>();
    private int personspeed;
    private int personhp;
    private String personname;


    public int getPersonspeed()
    {
        return personspeed;
    }

    public int getPersonhp()
    {
        return personhp;
    }

    public String getPersonname()
    {
        return personname;
    }


    public void SetCharacter() //int speed, int hp, String name
    {
        Character toni = new Character(35, 225, "Warrior");
        Character aria = new Character(60, 125, "Rogue");
        Character hodor = new Character(20, 310, "Tank");
        oppers.put(1, toni);
        oppers.put(2, aria);
        oppers.put(3, hodor);
    }

    public String Who(HashMap<Integer, Character> hehe)
    {
      String then = "";
        for (HashMap.Entry<Integer, Character> map : hehe.entrySet()
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

    public void PersonChooserV2()
    {
        try
        {
            SetCharacter();

            util.ReadInput("Choose your Character!:" + Who(oppers));

            personspeed = oppers.get(util.getImput()).getSpeed();
            personhp = oppers.get(util.getImput()).getHp();
            personname = oppers.get(util.getImput()).getName();
            Personcall();
        }
        catch (Exception e)
        {
            System.out.println(String.format("You need to push only numbers from 1 to %d! But you pushed %d And now all will start again!", oppers.size(), util.getImput()));
            PersonChooserV2();
        }
    }

    public void Personcall()
    {
        System.out.println(String.format("You choose %s, now its your character", oppers.get(util.getImput()).getName()));
    }

    public class Character
    {

        private int speed;
        private int hp;
        private String name;



        Character(int speed, int hp, String name)
        {
            this.speed = speed;
            this.hp = hp;
            this.name = name;
        }

        public int getSpeed()
        {
            return speed;
        }

        public int getHp()
        {
            return hp;
        }

        public String getName()
        {
            return name;
        }
    }

}
