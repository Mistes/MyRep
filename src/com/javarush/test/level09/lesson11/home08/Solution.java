package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list =new ArrayList<int[]>();
        int[] o1 = {5, 6, 7, 8, 1};
        int[] o2 = {5, 6};
        int[] o3 = {5, 6, 7, 8};
        int[] o4 = {5, 6, 7, 8, 1, 15, 0};
        int[] o5 = {};
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        list.add(o5);
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
