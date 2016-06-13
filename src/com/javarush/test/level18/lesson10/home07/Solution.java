package com.javarush.test.level18.lesson10.home07;

/* Поиск данных внутри файла
Считать с консоли имя файла
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int)
Закрыть потоки. Не использовать try-with-resources

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity

где id - int
productName - название товара, может содержать пробелы, String
price - цена, double
quantity - количество, int

Информация по каждому товару хранится в отдельной строке
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String patch1 = reader.readLine();
        BufferedReader bf = new BufferedReader(new FileReader(patch1));
        reader.close();
        String line = bf.readLine();
        String result = "";
        while (line != null)
        {
           String list[] =  line.split(" ");
            if(args[0].equals(list[0])){
                result = line;
            }


            line = bf.readLine();
        }
        bf.close();
        System.out.println(result);
    }
}
