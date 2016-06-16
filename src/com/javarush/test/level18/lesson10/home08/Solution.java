package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.*;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args)
            throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




        String pop = "";
        while (true)
        {
            pop = reader.readLine();
            if (!pop.equals("exit"))
            {
                ReadThread read = new ReadThread(pop);
                read.start();

            }
            else if(pop.equals("exit")){break;}
        }
        reader.close();
        System.out.println(resultMap);


       /* for (Map.Entry<String, Integer> pair : resultMap.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }*/


    }

    public static class ReadThread extends Thread  {
         String filename;
        public ReadThread(String fileName) {
            //implement constructor body
            this.filename = fileName;
        }

        @Override
        public void run()
        {

        try
            {
                FileInputStream file1 = new FileInputStream(filename);

                Integer[] array;
                ArrayList<Integer> list = new ArrayList<>();
                Map<Integer, Integer> map = new HashMap<>();
                while (file1.available() > 0)
                {
                    int data = file1.read();
                    if(!map.containsKey(data))
                        map.put(data,1);
                    else map.put(data,map.get(data).intValue()+1);
                    list.add(data);
                }
                array = map.values().toArray(new Integer[map.size()]);
                Arrays.sort(array, new Comparator<Integer>()
                {

                    public int compare(Integer o1, Integer o2)
                    {
                        return o2 - o1;
                    }
                });
                for (Map.Entry<Integer, Integer> pair : map.entrySet())
                {
                    if (pair.getValue().equals(array[0]))
                    {

                        resultMap.put(filename, pair.getKey());
                        break;
                    }
                }

                file1.close();



            }
            catch (IOException e)
            {
                System.out.println(e);
            }
        }

    }
}
