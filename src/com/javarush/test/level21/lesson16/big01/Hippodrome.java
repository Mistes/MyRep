package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Mistes on 22.04.2016.
 */
public class Hippodrome
{
    public static Hippodrome game;
    public static ArrayList<Horse> horses = new ArrayList<>();
    Horse bura = new Horse("Bura", 1.5, 3.2);
    Horse mega = new Horse("Mega", 1.6, 4.2);
    Horse leka = new Horse("Leka", 1.3, 2.2);

    public static void main(String[] args)
    {
        Hippodrome hipo = new Hippodrome();
        game = hipo;
        Horse bura = new Horse("Bura", 1.5, 3.2);
        Horse mega = new Horse("Mega", 1.6, 4.2);
        Horse leka = new Horse("Leka", 1.3, 2.2);
        horses.add(bura);
        horses.add(mega);
        horses.add(leka);
    }

    public static ArrayList<Horse> getHorses()
    {
        return horses;
    }
}

