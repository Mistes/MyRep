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
import java.util.Collections;
import java.util.Comparator;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream file1 = null;
        FileOutputStream file2 = null;
        ArrayList<String> list = new ArrayList<>();
        String pop = "";

        while (true)
        {
           pop = reader.readLine();
            if (!pop.equals("end"))
            {
                list.add(pop);
            }
           else if(pop.equals("end")){break;}
        }


        class ArrayCompare implements Comparator<String>
        {
            @Override
            public int compare(String o1,String o2)
            {
                return
                        Integer.parseInt(o1.split(".part")[o1.split(".part").length - 1]) -
                                Integer.parseInt(o2.split(".part")[o2.split(".part").length - 1]);
            }
        }
        Collections.sort(list,new ArrayCompare());


        for(int i = 0; i <list.size();i++)
        {
            String[] weknow = list.get(i).split(".part");

                File newFile = new File(weknow[weknow.length - 2]);
                newFile.createNewFile();
                file1 = new FileInputStream(list.get(i));
                file2 = new FileOutputStream(newFile,true);
                byte[] buffer = new byte[1000];
                while (file1.available() > 0)
                {
                    int data = file1.read(buffer);
                    file2.write(buffer,0,data);
                }

            }
        reader.close();
        file1.close();
        file2.close();

        }
}





