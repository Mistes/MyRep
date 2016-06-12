package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String patch1 = bufferedReader.readLine();
        String patch2 = bufferedReader.readLine();
        BufferedReader buffpatchreader1 = new BufferedReader(new FileReader(patch1));
        bufferedReader.close();
        FileWriter fw = new FileWriter(patch2);
        String line = "";
        String s = "";
        while (line != null)
        {
            s = s + line;
            // считываем остальные строки в цикле
            line = buffpatchreader1.readLine();
        }
        System.out.println(s);
       StringTokenizer tokenizer =
                new StringTokenizer(s," ");
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            double j = Double.parseDouble(token);
            int i = (int)Math.round(j);
            fw.write(i+ " ");
        }
        buffpatchreader1.close();
        fw.close();

    }
}
