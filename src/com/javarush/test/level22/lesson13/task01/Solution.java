package com.javarush.test.level22.lesson13.task01;

import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution
{
    public static String[] getTokens(String query, String delimiter)
    {

        int i = 0;
        StringTokenizer tokenizer =
                new StringTokenizer(query, delimiter);
        String[] a = new String[tokenizer.countTokens()];
        while (tokenizer.hasMoreTokens())
        {

            String token = tokenizer.nextToken();
            a[i] = token;
            i++;

            // return token;
        }
        return a;
    }

    public static void main(String[] args)
    {
        for (String s : getTokens("level22.lesson13.task01", "."))
        {
            System.out.println(s);
        }
    }
}

