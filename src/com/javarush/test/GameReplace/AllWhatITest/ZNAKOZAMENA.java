package com.javarush.test.GameReplace.AllWhatITest;

import java.io.*;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/
public class ZNAKOZAMENA
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader3 = new BufferedReader(new FileReader("c:\\11.txt"));
        String tmp;
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("c:\\lo.txt")));
        while ((tmp = bufferedReader3.readLine()) != null)
        {
            String[] tempotwo = tmp.split(" ");
            String go = "";
            for (String aTempotwo : tempotwo)
            {
                go += aTempotwo.replace('.', '!') + " ";


            }
            writer.write(go + "\n");
            writer.flush();

        }

        writer.close();
    }
}
