package com.javarush.test.GameReplace.AllWhatITest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Администратор on 03.06.2016.
 */
public class CalendarTesting
{
    public static void main(String[] args)
    {//15-Apr-1990
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        System.out.println(dateFormat.format( new Date() ) );


    }
}
