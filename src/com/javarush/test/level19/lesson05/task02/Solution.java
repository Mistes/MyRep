package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.StringTokenizer;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileReader fileReader = new FileReader(file);
        char buffer;
        String myString = "";
        while(fileReader.ready()){
            int chars= fileReader.read();
            myString+= (char) chars;
        }
        reader.close();
        fileReader.close();
        StringTokenizer ins = new StringTokenizer(myString," \t\n\r,.");
        int count  = 0;
        while(ins.hasMoreTokens()){
            if (ins.nextToken().equals("world")) count++;
        }
        System.out.println(count);
    }
}

