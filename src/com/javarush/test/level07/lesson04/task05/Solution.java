package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] l1 = new int[20];
        int[] l2 = new int [10];
        int[] l3 = new int [10];
        for (int i = 0; i < l1.length; i++)
        {
            String s = reader.readLine();
            l1[i] = Integer.parseInt(s);
        }

            System.arraycopy(l1, 0, l2, 0, 10);

            System.arraycopy(l1, 10, l3, 0, 10);
            for (int i = 0; i < l3.length; i++)
            {
                System.out.println(l3[i]);
            }


        }
        }

