package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.net.SocketPermission;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String one = reader.readLine();
        String two = reader.readLine();
        String three = reader.readLine();
        String four = reader.readLine();
        int a = Integer.parseInt(one);
        int b = Integer.parseInt(two);
        int c = Integer.parseInt(three);
        int d = Integer.parseInt(four);
             if ((a > b) && (a > c) && (a > d))
            System.out.println(a);
             else if (b > c  && b > d)
                 System.out.println(b);
             else if (c > d)
                 System.out.println(c);
             else
                 System.out.println(d);





    }
}
