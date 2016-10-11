package com.javarush.test.GameReplace.AllWhatITest;

import java.io.*;
import java.util.ArrayList;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/
public class SoCuteLongWords
{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader3 = new BufferedReader(new FileReader(args[0]));
        String tmp;
        ArrayList<String> soperfect= new ArrayList<>();

        while((tmp = bufferedReader3.readLine()) != null)
        {


            String[] tempotwo = tmp.split(" ");
            for (int i = 0; i < tempotwo.length; i++){
                char[]ch = tempotwo[i].toCharArray();
               if(ch.length>6){
                   soperfect.add(tempotwo[i]);
               }
            }

        }
        bufferedReader3.close();
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(args[1])));
        for (int i = 0; i<soperfect.size(); i++){
            if(i< soperfect.size()-1){
                writer.write(soperfect.get(i) + ",");
            }
            else { writer.write(soperfect.get(i));
            }

        }
        writer.flush();
        writer.close();
    }

    }

