package com.javarush.test.GameReplace.AllWhatITest;

import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/
public class Numbersfinder
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
        final String FILENAME1 = bufferedReader.readLine();
        final String FILENAME2 = bufferedReader.readLine();
        String prepared;
        bufferedReader.close();
        bufferedReader2.close();
        ArrayList<Integer> IDList = new ArrayList<>();
        BufferedReader bufferedReader3 = new BufferedReader(new FileReader(FILENAME1));
        String tmp;
        while((tmp = bufferedReader3.readLine()) != null){

           String [] tempotwo = tmp.split(" ");
            for(int i = 0; i < tempotwo.length; i++){
                System.out.println("Length is= " + tempotwo.length);
                try{tempotwo[i] = tempotwo[i].trim();
           IDList.add(Integer.parseInt(tempotwo[i]));}
                catch (NumberFormatException e){
                    System.out.println(e);}
            }
        }
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(FILENAME2)));
        for (int i = 0; i<IDList.size(); i++){
         //   int toto = IDList(i);
        }

        System.out.println(IDList);
    }
}


