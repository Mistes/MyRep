package com.javarush.test.level19.lesson10.home08;

/* Перевертыши
1 Считать с консоли имя файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке
2.2 вывести на экран
3 Закрыть потоки. Не использовать try-with-resources

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/


import java.io.*;

public class Solution {
    public void reversed(String input){//TODO reverse method for strings
    StringBuilder input1 = new StringBuilder();
    input1.append(input);
    input1=input1.reverse();
   // for (int i=0;i<input1.length();i++)
     //       System.out.print(input1.charAt(i));
        System.out.println(input1);
}
    public static void main(String[] args) throws IOException{
        Solution sol = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File f = new File(reader.readLine());
        reader.close();
        BufferedReader freader = new BufferedReader(new FileReader(f));
        String line = freader.readLine();
        while (line != null)
        {
           sol.reversed(line);

            // считываем остальные строки в цикле
            line = freader.readLine();
        }
        freader.close();
    }
    }

