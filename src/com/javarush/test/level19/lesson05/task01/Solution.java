package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(reader1.readLine());
        FileWriter writer = new FileWriter(reader1.readLine());
         reader1.close();
        int count = 0;
        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            count++;
            int data = reader.read();
            if (count % 2 == 0){writer.write(data);}//читаем один символ (char будет расширен до int)
             //пишем один символ (int будет обрезан/сужен до char)
        }

        //закрываем потоки после использования
        reader.close();
        writer.close();
    }
}
