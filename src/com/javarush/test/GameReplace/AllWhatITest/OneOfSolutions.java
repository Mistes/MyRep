package com.javarush.test.GameReplace.AllWhatITest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mistes on 30.05.2016.
 */
public class OneOfSolutions
{


    public static void main(String[] args)
    {


        int leftIndex = Direction.LEFT.ordinal();

        Direction[] array = Direction.values();
        Direction left = array[leftIndex];
        System.out.println(array.toString());
        for (Direction direction : Direction.values())
        {
            System.out.println(direction);
        }
    }
    public enum Direction{
        UP, DOWN, RIGHT, LEFT
    }
}
