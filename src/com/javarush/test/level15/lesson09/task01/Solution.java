package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }
    static{
         labels.put(2.7,"7");
        labels.put(2.6,"6");
        labels.put(2.5,"5");
        labels.put(2.4,"4");
        labels.put(2.3,"3");

    }
}
