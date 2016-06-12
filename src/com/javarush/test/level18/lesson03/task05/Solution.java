package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        HashMap<Integer, Integer> list = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = inputStream.read();
            list.put(data,data);
        }
        Integer[] array;
        array = list.values().toArray(new Integer[list.size()]);
        Arrays.sort(array, (o1, o2) -> o1 - o2);
        for (int i : array)
        {
            System.out.println(i);
        }

        inputStream.close(); //закрываем оба потока. Они больше не нужны.

    }
}
