package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
        {
            set.add( i + 1);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext())
            {
                int number = iterator.next();
                if(number > 10){
                    iterator.remove();
                    System.out.println(number);
                }
        }
        return set;

    }
}
