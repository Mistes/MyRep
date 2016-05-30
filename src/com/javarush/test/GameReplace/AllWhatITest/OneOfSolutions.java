package com.javarush.test.GameReplace.AllWhatITest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mistes on 30.05.2016.
 */
public class OneOfSolutions
{


    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            String s = "";
            int sum = 0;
            int delta = 0;

            while (true)
            {
                s= reader.readLine();
                if(s.equals("N")){
                    break;}
                delta = Integer.parseInt(s);
                sum += delta;
            }
            reader.close();
            System.out.println(sum);
        }
        catch (IOException e)
        {
        }
    }
}
