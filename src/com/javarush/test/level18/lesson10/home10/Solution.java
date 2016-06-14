package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int variabl = 1;
        FileInputStream file1 = null;
        FileOutputStream file2 = null;
        ArrayList<String> list = new ArrayList<>();
        String pop = "";


        // System.out.println(weknow[weknow.length-1] + " " + weknow[weknow.length-2]);
        while (true)
        {
           pop = reader.readLine();
            if (pop.equals("end"))
            {
                break;
            }
            list.add(pop);
        }

        while (!(variabl ==list.size()-1)){
        for(int i = 0; i <list.size();i++)
        {
            String[] weknow = list.get(i).split(".part");
            if (Integer.parseInt(weknow[weknow.length - 1]) == variabl)
            {
                File newFile = new File(weknow[weknow.length - 2]);
                newFile.createNewFile();
                file1 = new FileInputStream(pop);
                file2 = new FileOutputStream(newFile);

                while (file1.available() > 0)
                {
                    int data = file1.read();
                    file2.write(data);
                }
                variabl++;
            }
            else if(list.size()-1==i){i = 0;}
        }
          //   if(variabl == list.size()){break;}
        }
        reader.close();
        file1.close();
        file2.close();
    }



}
