package com.javarush.test.level13.lesson11.home03; //TODO  13 level 11 lesson 3 zadanie postrochnuy cycle

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File f = new File(reader.readLine());
        reader.close();
        BufferedReader freader = new BufferedReader(new FileReader(f));
        String line = freader.readLine();
        while (line != null)
        {
            System.out.println(line);
            // считываем остальные строки в цикле
            line = freader.readLine();
        }
        freader.close();
    }
}
