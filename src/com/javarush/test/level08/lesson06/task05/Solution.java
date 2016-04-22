package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution
{
    public static List  getListForGet()
    {
        ArrayList<String> getListForGet= new ArrayList<String>();
  return getListForGet;
    }

    public static List  getListForSet()
    {
        ArrayList<String> getListForSet= new ArrayList<String>();
        return getListForSet;

    }

    public static List  getListForAddOrInsert()
    {
        LinkedList<String> getListForAddOrInsert= new LinkedList<String>();
        return getListForAddOrInsert;

    }

    public static List  getListForRemove()
    {
        LinkedList<String> getListForRemove= new LinkedList<String>();
        return getListForRemove;

    }
}
