package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();
        int n11 = Integer.parseInt(n1);
        int n22 = Integer.parseInt(n2);
        int n33 = Integer.parseInt(n3);
        int m1 = min (n11, n22, n33);
        int m2 = max (n11, n22, n33);
        int m3 = srd(m1, m2, n11, n22, n33);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m1);
    }
    public static int min (int a, int b, int c){
        int i;
        if (a < b && a < c){
            i = a;
            return i;
        }             else {
            if (b < a && b <c){
                i = b;
                return i;
            }
            else  return c;
        }
    }
    public static int max (int a, int b, int c){
        int j;
        if (a > b && a > c){
            j = a;
            return j;
        }             else {
            if (b > a && b > c){
                j = b;
                return j;
            }
            else  return  c;
        }
    }
    public static int srd (int min, int max, int a, int b, int c){
        int k;
        if (a!=min && a!=max){
            k = a;
            return k;
        }         else {
            if (b!=min && b!= max){
                k= b;
                return k;
            }   else       {
                return c;
            }
        }
    }
}
