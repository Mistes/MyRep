package com.javarush.test.GameReplace.AllWhatITest;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/
/*public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("write path");
        String patch1 = reader.readLine();
        System.out.println("Write ID");
        String request = reader2.readLine();
        BufferedReader bf = new BufferedReader(new FileReader(patch1));
        reader.close();
        String line = bf.readLine();
        String result = "";
        while (line != null)
        {
           String list[] =  line.split(" ");
            if(request.equals(list[0])){
                result = line;
            }


            line = bf.readLine();
        }
        bf.close();
        reader2.close();
        System.out.println(result);
    }
}*/

import java.io.*;

public class AmazingClass
{
    public   String id = "15248127412571205215125";
    public String productName = "Шорты пляжные синие";
    public String price = "159.00";
    public String quantity = "17";
    public final int IDLEN = 8;
    public final int PRODLEN = 30;
    public final int PRICELEN = 8;
    public final int QUANTYLEN = 4;
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String patch1 = reader.readLine();


        BufferedReader bf = new BufferedReader(new FileReader(patch1));
        reader.close();
        if ("-c".equals(args[0]))
        {
            String result = "";
            String s = "";
            int max = 0;
            while ((s = bf.readLine()) != null)
            {
                int curID = Integer.parseInt(s.substring(0, 8).trim());
                if (curID > max) max = curID;
            }
            bf.close();
            AmazingClass zuk = new AmazingClass();
            int numberrer = max + 1;
            String valstr = "" + numberrer;


            BufferedWriter bw = new BufferedWriter(new FileWriter(patch1, true));
            bw.write(zuk.parceryourline(args, valstr));
            bw.close();

        }

    }


    public String boobleadder(String yourval, int len){
       int lengthcount = yourval.length();
        String spaces = "";
        int howmuchneedspaces;
        if(lengthcount < len){
            howmuchneedspaces = len - lengthcount;
            for (int i = 0; i < howmuchneedspaces; i++){
            spaces+=" ";
            }
        }
        else {
            yourval= (yourval.substring(0, len).trim());

        }
        return yourval + spaces;

    }
    public String parceryourline(String[] line, String idee){
        String backString;
        String funnyString = "";
        String list[] =  line;
        int thislength = list.length;
        quantity = list[thislength-1];
        price = list[thislength-2];
        for (int i = 1; i < thislength-2; i++){
            funnyString +=list[i];
        }
        AmazingClass am = new AmazingClass();

        backString = am.boobleadder(idee,IDLEN) +  am.boobleadder(funnyString, PRODLEN) + am.boobleadder(price, PRICELEN) + am.boobleadder(quantity, QUANTYLEN);
        return backString;
    }

}
