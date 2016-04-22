package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
       ArrayList <String >[]arrayOfStringList = new  ArrayList [3];
        ArrayList<String>l1 = new ArrayList<String>();
        l1.add("Cat");
        ArrayList<String>l2 = new ArrayList<String>();
        l2.add("Cat");
        ArrayList<String>l3 = new ArrayList<String>();
        l3.add("Cat");
       arrayOfStringList[0]=l1;
        arrayOfStringList[1]=l2;
        arrayOfStringList[2]=l3;

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}