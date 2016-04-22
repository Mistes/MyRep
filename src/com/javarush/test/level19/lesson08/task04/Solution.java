package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args)
    {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = parseAndReturn(outputStream.toString());
        System.setOut(console);
        System.out.println(result);}

        public static String parseAndReturn(String string)
        {
            String[] element = string.split(" ");
            int lastElement = 0;
            if      (element[1].equals("+")) lastElement = Integer.parseInt(element[0]) + Integer.parseInt(element[2]);
            else if (element[1].equals("-")) lastElement = Integer.parseInt(element[0]) - Integer.parseInt(element[2]);
            else if (element[1].equals("*")) lastElement = Integer.parseInt(element[0]) * Integer.parseInt(element[2]);
            String result = "";
            for (int i = 0; i < element.length - 1; i++)
            {
                result += element[i] + " ";
            }
            result += lastElement;
            return result;
        }


    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

