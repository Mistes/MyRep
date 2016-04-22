package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int list[] = new int[5];

        for ( int i = 0; i < list.length; i++ )
        {
            String s1 = reader.readLine();
            list[i] = Integer.parseInt(s1);
        }
        for (int i = 0; i < list.length; i++)
        {
            int min = list[i];
            int imin = i;
            for (int j = i+1; j < list.length; j++)
            {
                if (list[j] < min)
                {
                    min = list[j];
                    imin = j;
                }
            }
            if ( i!= imin)
            {
                int temp = list[i];
                list[i] = list[imin];
                list[imin] = temp;


            }
        }
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }
}
