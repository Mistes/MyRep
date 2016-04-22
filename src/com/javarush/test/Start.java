package com.javarush.test;

/**
 * Created by Mistes on 03.04.2016.
 */
public class Start
{
    public static void main(String[] args)
    {
        int getPhoneNumber=501234567;
        int getCountryPhoneCode =38;
        String m = String.format("+%d(%2$s)%3$s-%4$s-%5$s",getCountryPhoneCode,
                String.format("%010d",getPhoneNumber).substring(0, 3),
                String.format("%010d",getPhoneNumber).substring(3, 6),
                String.format("%010d",getPhoneNumber).substring(6, 8),
                String.format("%010d",getPhoneNumber).substring(8));
        System.out.println(m);
        String z = String.format("%+d020",getCountryPhoneCode);
        System.out.println(z);

    }
}
