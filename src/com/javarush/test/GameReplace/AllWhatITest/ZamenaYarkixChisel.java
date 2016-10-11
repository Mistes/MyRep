package com.javarush.test.GameReplace.AllWhatITest;

import java.io.*;
import java.util.*;

/* Замена чисел
1. В статическом блоке инициализировать словарь map парами [число-слово] от 0 до 12 включительно
Например, 0 - "ноль", 1 - "один", 2 - "два"
2. Считать с консоли имя файла
3. Заменить все числа на слова используя словарь map
4. Результат вывести на экран
5. Закрыть потоки. Не использовать try-with-resources

Пример данных:
Это стоит 1 бакс, а вот это - 12 .
Переменная имеет имя file1.
110 - это число.

Пример вывода:
Это стоит один бакс, а вот это - двенадцать .
Переменная имеет имя file1.
110 - это число.
*/
public class ZamenaYarkixChisel
{
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static
    {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одинадцать");
        map.put(12, "двенадцать");

    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader3 = new BufferedReader(new FileReader(args[0]));
        String tmp;
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(args[1])));
        while ((tmp = bufferedReader3.readLine()) != null)
        {
            String[] tempotwo = tmp.split(" ");
            String go = "";
            for (int i = 0; i < tempotwo.length; i++)
            {
                int tyty = -1;
                try
                {
                    tyty = Integer.parseInt(tempotwo[i]);
                    HashSet<Integer>badet = new HashSet<>();
                    badet.add(tyty);
                    for (Map.Entry<Integer, String> pair : map.entrySet())
                    {
                        int key = pair.getKey();
                        String value = pair.getValue();

                        if (tyty == key)
                        {
                            go += value + " ";
                            badet.remove(tyty);
                        }

                    }
                    List<Integer> lol = new ArrayList<>(badet);
                    if(!lol.isEmpty()){
                        go += lol.get(0) + " ";
                    }

                }
                catch (Exception e)
                {
                    go += tempotwo[i] + " ";
                }


            }
            writer.write(go + "\n");
            writer.flush();

        }

        writer.close();
    }
}

