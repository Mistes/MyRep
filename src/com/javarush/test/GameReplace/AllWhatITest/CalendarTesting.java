package com.javarush.test.GameReplace.AllWhatITest;

import java.util.Calendar;

/**
 * Created by Администратор on 03.06.2016.
 */
public class CalendarTesting
{
    public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();
        c.set(2004,0,7,15,40);
        long day1 = c.getTimeInMillis();
        day1+=1000*60*60;
        c.setTimeInMillis(day1);
        System.out.println("new time " + c.get(c.HOUR_OF_DAY));
        c.add(c.DATE, 35);
        System.out.println("add 35 days " + c.getTime());
        c.roll(c.DATE, 35);
        System.out.println("roll at 35 days " + c.getTime());
        c.set(c.DATE, 1);
        System.out.println("Setting date at 1 " + c.getTime());


    }
}
