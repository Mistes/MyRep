package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        int a1 = a.length();
        int b1 = b.length();
       if (a.equals(b))
            System.out.println("Имена идентичны");
        else if (a1 == b1)
        {
            System.out.println("Длины имен равны");
        }

    }
}
