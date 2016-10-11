package com.javarush.test.GameReplace.AllWhatITest;
import java.io.*;
import java.util.ArrayList;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/
public class WordsWithFineNumbers
{
    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader3 = new BufferedReader(new FileReader(args[0]));
        String tmp;
        ArrayList<String>soperfect= new ArrayList<>();

        while((tmp = bufferedReader3.readLine()) != null)
        {


            String[] tempotwo = tmp.split(" ");
            for (int i = 0; i < tempotwo.length; i++){
                char[]ch = tempotwo[i].toCharArray();
                for (int j = 0; j < ch.length; j++){
                    if(Character.isDigit(ch[j])){
                        soperfect.add(tempotwo[i]);
                        break;
                    }
                }
                }

            }
        bufferedReader3.close();
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(args[1])));
        for (int i = 0; i<soperfect.size(); i++){
           writer.write(soperfect.get(i) + " ");
        }
        writer.flush();
        writer.close();
        }

    }
