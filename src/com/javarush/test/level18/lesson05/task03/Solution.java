package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileInputStream file1 = new FileInputStream(reader.readLine());
            FileOutputStream file2 = new FileOutputStream(reader.readLine());
            FileOutputStream file3 = new FileOutputStream(reader.readLine());
            reader.close();
            if (file1.available() > 0) {
                int filesize = file1.available() / 2;    // записуємо в файлсайз половину байт
                if (file1.available() % 2 != 0) filesize++; // якщо не ділиться порівну на два, прибавляємо 1 байт.
                byte[] buffer = new byte[filesize];             // буфер розміром з 1 половину
                file1.read(buffer);
                file2.write(buffer);
                buffer = new byte[file1.available()];           //друга половина, все що залишилось
                file1.read(buffer);
                file3.write(buffer);
            }
            file1.close();
            file2.close();
            file3.close();
        } catch (Exception e) {}
    }
}