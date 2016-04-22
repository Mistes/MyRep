package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream1 = new FileInputStream(args[0]);
        int count = 0;
        byte[] b = new byte[inputStream1.available()];
        inputStream1.read(b);
        for(byte m : b)
            if((m > 64 && m < 91) || (m < 123 && m > 96))
                count++;
        System.out.println(count);
        inputStream1.close();
    }
}

