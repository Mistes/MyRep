package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> newlist = new ArrayList<>();


        Integer[] array = new Integer[list.size()];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File f = new File(reader.readLine());
        reader.close();
        BufferedReader freader = new BufferedReader(new FileReader(f));
        String line = freader.readLine();
        while (line != null)
        {

            list.add(Integer.parseInt(line));

            line = freader.readLine();
        }
        freader.close();
        for (int i : list)
        {
            if (i % 2 == 0)
            {
                //for(int b = 0; b<list.size();b++){
                //  array[b]=i;
                newlist.add(i);
            }
        }
        for (int b = 1; b < newlist.size(); b++)
        {
            array[b] = newlist.get(b);}

            Arrays.sort(array, new Comparator<Integer>()
            {

                public int compare(Integer o1, Integer o2)
                {
                    return o2 - o1;
                }
            });
            for (int i : array)
            {
                System.out.println(i);
            }
        }
    }


