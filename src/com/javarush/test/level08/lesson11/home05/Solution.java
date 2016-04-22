package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String s = reader.readLine();
        if(!s.isEmpty()){
            char mas[] = s.toCharArray();
            mas[0] = Character.toUpperCase(mas[0]);
            for(int i = 1; i < mas.length; i++){
                if((Character.isLetter(mas[i])&& mas[i-1] ==' ')||(Character.isLetter(mas[i]) && Character.isDigit(mas[i - 1]))){
                    mas[i] = Character.toUpperCase(mas[i]);
                }
            }
            String result = new String(mas);
            System.out.println(result);

        }
        else System.out.println("You are dumb idiot");
    }


}
