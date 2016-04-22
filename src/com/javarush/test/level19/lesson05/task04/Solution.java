package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources


import java.io.*;
import java.util.StringTokenizer;

// ct.getPhoneNumber().replaceAll("[^0-9]", "");
        public class Solution {
            public static void main(String[] args) throws IOException
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                FileReader file = new FileReader(reader.readLine());
                FileWriter filew = new FileWriter(reader.readLine());
                String myString = "";
                String beta;
                while(file.ready()){
                  int data = file.read(char[] buffer);
                    void write
                    beta = myString.replaceAll(".", "!");
                    filew.write(beta);
                }
                reader.close();
                file.close();
                filew.close();
            }
        }*/