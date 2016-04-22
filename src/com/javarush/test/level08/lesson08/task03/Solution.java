package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;
/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/
public class Solution
{

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String , String > hashMap=new HashMap<String, String>();
        for (int i = 0; i < 10; i++)
        {
            hashMap.put("Фамилия"+i, "Имя"+i);
        }
        return hashMap;
    }
    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int counterName=0;
        //напишите тут ваш код
        for(Map.Entry<String, String> a: map.entrySet())
        {
            if (a.getValue().equals(name)) counterName++;
        }
        return counterName;
    }
    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //напишите тут ваш код
        int counterFamilia=0;
        //напишите тут ваш код
        for(Map.Entry<String, String> a: map.entrySet())
        {
            if (a.getKey().equals(familiya)) counterFamilia++;
        }
        return counterFamilia;
    }
}
