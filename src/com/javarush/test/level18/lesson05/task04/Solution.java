package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        //создаем объект FileInputStream, привязанный к файлу «c:/data.txt».

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);
        byte [] buffer = new byte[inputStream.available()];
        int buf_size = inputStream.read(buffer);
        for(int i = buf_size - 1; i >= 0; i--)
        {
            outputStream.write(buffer[i]);
        }

        reader.close();
        inputStream.close();
        outputStream.close();   // закрываем поток


    }
}
