package com.javarush.test.GameReplace.AllWhatITest;

/* Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words
Закрыть потоки. Не использовать try-with-resources

Пример: words содержит слова А, Б, В
Строки:
В Б А Д  //3 слова из words, не подходит
Д А Д    //1 слово из words, не подходит
Д А Б Д  //2 слова - подходит, выводим
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DoYouLikeThisShortWineWorlds
{
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final String FILENAME1 = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader bufferedReader3 = new BufferedReader(new FileReader(FILENAME1));
        String tmp;

        while((tmp = bufferedReader3.readLine()) != null)
        {
            int counter = 0;

            String[] tempotwo = tmp.split(" ");
           for (int i = 0; i < words.size(); i++){
               for (int j = 0; j < tempotwo.length; j++){
                   if(words.get(i).equals(tempotwo[j])){
                       counter++;
                   }
               }

           }
            if (counter == 2){
                System.out.println(tmp);
            }

        }

    }
}

