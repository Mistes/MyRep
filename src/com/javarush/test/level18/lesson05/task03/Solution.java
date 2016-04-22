package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String d =reader.readLine();
        String j =reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(s);
        FileOutputStream outputStream = new FileOutputStream(d);
        FileOutputStream outputStream2 = new FileOutputStream(j);
        int counter = 0;
        byte[] cache  = new byte[(inputStream.available()/2)+1];
        byte[] cache2 = new byte[inputStream.available() - inputStream.available()/2];
        while (inputStream.available() > 0){
            int data = inputStream.read();
                counter++;
            if (counter % 2 == 0){
                outputStream.write(cache, 0 ,inputStream.read(cache));
                outputStream2.write(cache2, 0 ,inputStream.read(cache2));
                outputStream.flush();
                outputStream2.flush();
            }
            if(counter % 2 > 0)
            {
                outputStream.write(cache2, 0 ,inputStream.read(cache2));
                outputStream2.write(cache, 0 ,inputStream.read(cache));
                outputStream.flush();
                outputStream2.flush();
            }
            inputStream.close();
            outputStream.close();
            outputStream2.close();
        }

        inputStream.close();
        outputStream.close();
        outputStream2.close();

    }
}
