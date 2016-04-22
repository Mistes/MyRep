package com.javarush.test.MyFirstGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Mistes on 20.04.2016.
 */
public class armorchooser
{
    public static int headarmor;
    public static int chestarmor;
    public static int legarmor;
    public static int headmove;
    public static int chestmove;
    public static int legmove;

    public static void HeadChooseer(){
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Choose your Head: 1==leather---2==mail-----3==plate");

            while (true)
            {
                int value = Integer.parseInt(reader.readLine());
                if (value == 3)
                {
                    headarmor = armor.IronHelmet.getHeadDefence();
                    headmove = armor.IronHelmet.getHeadMovement();
                    armor.IronHelmet.call();
                    break;
                }
                if (value == 2)
                {

                    System.out.println("You choose mail BUT IT NOT WORK MUHAHA");
                    break;
                }
                if (value == 1)// leather here
                {

                    System.out.println("You choose leather BUT IT NOT WORK MUHAHA");
                    break;
                }
            }

        }
        catch (Exception e)
        {
            System.out.println("EXCEPTION IN READER MOTHERFUCKER");
        }
    }
    public static void ChestChooseer(){
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Choose your Chest: 1==leather---2==mail-----3==plate");

            while (true)
            {
                int value = Integer.parseInt(reader.readLine());
                if (value == 3)
                {
                    chestarmor = armor.IronChest.getChestDefence();
                    chestmove = armor.IronChest.getChestMovement();
                    armor.IronChest.call();
                    break;
                }
                if (value == 2)
                {

                    System.out.println("You choose mail BUT IT NOT WORK MUHAHA");
                    break;
                }
                if (value == 1)// leather here
                {

                    System.out.println("You choose leather BUT IT NOT WORK MUHAHA");
                    break;
                }
            }

        }
        catch (Exception e)
        {
            System.out.println("EXCEPTION IN READER MOTHERFUCKER");
        }
    }
    public static void LegChooseer(){
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Choose your LegArmor: 1==leather---2==mail-----3==plate");

            while (true)
            {
                int value = Integer.parseInt(reader.readLine());
                if (value == 3)
                {
                    legarmor = armor.IronLegs.getLegDefence();
                    legmove =  armor.IronLegs.getLegMovement();
                    armor.IronLegs.call();
                    break;
                }
                if (value == 2)
                {

                    System.out.println("You choose mail BUT IT NOT WORK MUHAHA");
                    break;
                }
                if (value == 1)// leather here
                {

                    System.out.println("You choose leather BUT IT NOT WORK MUHAHA");
                    break;
                }
            }

        }
        catch (Exception e)
        {
            System.out.println("EXCEPTION IN READER MOTHERFUCKER");
        }
    }
}

