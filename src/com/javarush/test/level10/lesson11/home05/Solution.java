package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        String str = list.toString().replaceAll(",", "");
        char[] chars = str.substring(1, str.length() - 1).replaceAll(" ", "").toCharArray();

        //напишите тут ваш код
        LinkedHashMap<Character, Integer> result = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < alphabet.size(); i++){
            result.put(alphabet.get(i),0);
        }
        for (int i = 0; i < chars.length; i++)
        {
            if (result.containsKey(chars[i]))
            {result.put(chars[i], result.get(chars[i]).intValue() + 1);}
        }
        for ( Map.Entry<Character, Integer> pair : result.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
