package com.javarush.test.level17.lesson10.home09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
        String one = reader.readLine();
        String two = reader.readLine();
        BufferedReader freader = new BufferedReader(new FileReader(one));
        String line = freader.readLine();
        while (line != null)
        {
            allLines.add(line);
            // считываем остальные строки в цикле
            line = freader.readLine();
        }
        freader.close();

        BufferedReader breader = new BufferedReader(new FileReader(two));
        String bline = breader.readLine();
        while (bline != null)
        {
            forRemoveLines.add(bline);
            // считываем остальные строки в цикле
            bline = breader.readLine();
        }
        breader.close();
        reader.close();}
        catch (IOException e){
            System.out.println(e);
        }

        Solution sol = new Solution();
        try{
        sol.joinData();}catch (CorruptedDataException ed){
            System.out.println("Something gone wrong, transfer isnt completed");
        }

    }

    public void joinData () throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)){//TODO неплохая робота с списком
            allLines.removeAll(forRemoveLines);
            return;
        }
        for (String s : forRemoveLines) {
            if (!allLines.contains(s)){
                allLines.clear();
                throw  new CorruptedDataException();
            }
        }


    }
}
