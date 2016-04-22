package com.javarush.test.MyFirstGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Mistes on 20.04.2016.
 */
public class OpponentChooseer
{
    public static int oponentarmor;
    public static int opponenthp;
    public static void WhatyouChoose(){
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Choose RANDOM ENEMY---1---- OR your ENEMY ----2-----");

            while (true)
            {
                int value = Integer.parseInt(reader.readLine());
                if (value == 1)
                {
                    Opponentrandom();
                    break;
                }
                if (value == 2)
                {
                    OpponentChose();
                    break;
                }
            }
        }
            catch(Exception e)
            {
                System.out.println("EXCEPTION IN READER MOTHERFUCKER");
            }
        }
    public static void OpponentChose()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Choose your ENEMY: 1==Dragon---2==Princess-----3==ORC");

            while (true)
            {
                int value = Integer.parseInt(reader.readLine());
                if (value == 3)
                {
                    oponentarmor = Opponent.Orc.getArmor();
                    opponenthp = Opponent.Orc.getHp();
                    Opponent.Orc.Call();
                    break;
                }
                if (value == 2)
                {
                    oponentarmor = Opponent.Princess.getArmor();
                    opponenthp = Opponent.Princess.getHp();
                    Opponent.Princess.Call();

                    break;
                }
                if (value == 1)
                {
                    oponentarmor = Opponent.Dragon.getArmor();
                    opponenthp = Opponent.Dragon.getHp();
                    Opponent.Dragon.Call();
                    break;
                }


            }

        }
        catch (Exception e)
        {
            System.out.println("EXCEPTION IN READER MOTHERFUCKER");
        }
    }
    public static void Opponentrandom()
    {
        try
        {
            System.out.println("Choosing your enemy.....");

            while (true)
            {
                int value = (int)(Math.random()*3+1);
                if (value == 3)
                {
                    oponentarmor = Opponent.Orc.getArmor();
                    opponenthp = Opponent.Orc.getHp();
                    Opponent.Orc.Choosed();
                    break;
                }
                if (value == 2)
                {

                    oponentarmor = Opponent.Princess.getArmor();
                    opponenthp = Opponent.Princess.getHp();
                    Opponent.Princess.Choosed();
                    break;
                }
                if (value == 1)
                {
                    oponentarmor = Opponent.Dragon.getArmor();
                    opponenthp = Opponent.Dragon.getHp();
                    Opponent.Dragon.Choosed();
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
