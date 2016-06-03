package com.javarush.test.GameReplace.AllWhatITest;

import java.util.Calendar;

/**
 * Created by Администратор on 03.06.2016.
 */
public class DaysOfMoon
{
    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args)
    {

        Calendar c = Calendar.getInstance();
        c.set(2004, 0, 7, 15, 40);
        long day1 = c.getTimeInMillis();
        for (int i = 0; i < 60; i++)
        {
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            System.out.println(String.format("Full moon was be at %tc",c));

        }

    }
}
