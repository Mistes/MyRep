package com.javarush.test;

import java.util.ArrayList;

/**
 * Created by Mistes on 10.04.2016.
 */
public class Adder
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        list.add(12);
        list.add(2);
        int j;
        int k;
        int d = 0;
        for(int i = 0; i < list.size(); i++){
            j = list.get(i);
            d += j;
        }
        System.out.println(d);
    }
}
