package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallo5ne", new Date("JUNE 1 1980"));
        map.put("Stall4one", new Date("JULY 1 1980"));
        map.put("Stal3lone", new Date("JULY 1 1980"));
        map.put("Sta2llone", new Date("JULY 1 1980"));
        map.put("St1allone", new Date("JANUARY 1 1980"));
        map.put("Stlone", new Date("JULY 1 1980"));
        map.put("Stalo6ne", new Date("JULY 1 1980"));
        map.put("Stalln7e", new Date("JULY 1 1980"));
        map.put("Stallon8e", new Date("JULY 1 1980"));
        map.put("Stallone9", new Date("JULY 1 1980"));
        return map;
        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        for (Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext(); )
        {
            Map.Entry<String, Date> pair = it.next();
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7)
            {
                it.remove();
            }
        }

    }

    public static void main(String[] args)
    {
        System.out.println(createMap());
        removeAllSummerPeople(createMap());
    }
}