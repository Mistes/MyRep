package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String patch1 = bufferedReader.readLine();
        String patch2 = bufferedReader.readLine();
        BufferedReader buffpatchreader2 = new BufferedReader(new FileReader(patch2));
        BufferedReader buffpatchreader1 = new BufferedReader(new FileReader(patch1));
        bufferedReader.close();
        ArrayList<String> array = new ArrayList<String>();
        String line;
        while ((line = buffpatchreader2.readLine()) != null)
        {
            array.add(line);
        }
        buffpatchreader2.close();
        while ((line = buffpatchreader1.readLine()) != null)
        {
            array.add(line);
        }
        buffpatchreader1.close();
        FileWriter fw = new FileWriter(patch1);
        for (int i = 0; i < array.size(); i++)
        {
            fw.write(array.get(i) + "\r\n");
        }
        fw.close();
    }
}
