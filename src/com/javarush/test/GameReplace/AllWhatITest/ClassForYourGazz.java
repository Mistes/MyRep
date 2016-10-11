package com.javarush.test.GameReplace.AllWhatITest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/
public class ClassForYourGazz
{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final String FILENAME1 = bufferedReader.readLine();
        bufferedReader.close();
        HashMap<String,Double>mapped = new HashMap<>();
        BufferedReader bufferedReader3 = new BufferedReader(new FileReader(FILENAME1));
        String tmp;
        while((tmp = bufferedReader3.readLine()) != null)
        {
            String[] tempotwo = tmp.split(" ");
            if (!mapped.containsKey(tempotwo[0]))
            {
                mapped.put(tempotwo[0], (Double.parseDouble(tempotwo[1])));
            } else
            {
                Double j = mapped.get(tempotwo[0]);
                mapped.put(tempotwo[0], j + Double.parseDouble(tempotwo[1]));
            }
        }
           ArrayList<Double>templist = new ArrayList<>();
            for (HashMap.Entry<String, Double> pair: mapped.entrySet())
            {
                templist.add(pair.getValue());
            }
       Double d =  Collections.max(templist);
        for (HashMap.Entry<String, Double> pair: mapped.entrySet())
        {
            if(pair.getValue().equals(d)){
                System.out.println(pair.getKey());
            }
        }

    }
}
