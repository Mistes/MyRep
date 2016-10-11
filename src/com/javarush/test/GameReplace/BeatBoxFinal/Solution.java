package com.javarush.test.GameReplace.BeatBoxFinal;

/**
 * Created by Администратор on 08.09.2016.
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            final String FILENAME = bufferedReader.readLine();
            String prepared;
            bufferedReader.close();
            if (args.length>0)
            {
                prepared = getNewID(FILENAME).append(getData(args)).toString();
                char z = 0;
                char c = 32;
                String finality = prepared.replace(z,c);
                PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(FILENAME, true)));
                writer.write(finality);
                writer.write(System.lineSeparator());
                writer.close();
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getClass().getSimpleName());
        }
    }
    public static StringBuilder getData (String[] args){
        StringBuilder finalData= new StringBuilder();
        StringBuilder productName= new StringBuilder();
        StringBuilder price = new StringBuilder();
        StringBuilder quantity = new StringBuilder();
        for (int i = 1; i<args.length-2; i++){
            productName.append(args[i].concat(" "));
        }
        productName.setLength(30);
        price.append(args[args.length-2]);
        price.setLength(8);
        quantity.append(args[args.length-1]);
        quantity.setLength(4);
        finalData.append(productName).append(price).append(quantity);
        return finalData;
    }
    public static StringBuilder getNewID (String filename) throws IOException{
        ArrayList<Integer> IDList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        StringBuilder id;
        String tmp;
        while((tmp = bufferedReader.readLine()) != null){
            IDList.add(Integer.parseInt(tmp.substring(0, 8).trim()));
        }
        if(IDList.isEmpty()){
            id = new StringBuilder("1");
            id.setLength(8);
        }
        else
        {
            Integer newID = Collections.max(IDList) + 1;
            id = new StringBuilder(newID.toString());
            id.setLength(8);
        }
        return id;
    }
}//TODO so beautiful code!!!