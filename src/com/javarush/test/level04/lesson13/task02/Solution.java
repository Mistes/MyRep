package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name1 = reader.readLine();
        int m = Integer.parseInt(name);
        int n = Integer.parseInt(name1);
        for (int i = 0; i <m; i++)
        {
            for (int p = 1; p < n; p++)
            {
                System.out.print("8");
            }
            System.out.println("8");
        }

    }
}
