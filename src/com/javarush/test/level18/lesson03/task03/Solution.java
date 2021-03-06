package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Integer[] array;
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        ArrayList<Integer>list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            if(!map.containsKey(data))
                map.put(data,1);
            else map.put(data,map.get(data).intValue()+1);
            list.add(data);
        }
        array = map.values().toArray(new Integer[map.size()]);
        Arrays.sort(array, new Comparator<Integer>()
        {

            public int compare(Integer o1, Integer o2)
            {
                return o2 - o1;
            }
        });
        for (Map.Entry<Integer, Integer> pair : map.entrySet())
        {
            if (pair.getValue().equals(array[0]))
            {
                System.out.print(pair.getKey() + " ");
            }
        }
        reader.close();
        inputStream.close();
    }
}
