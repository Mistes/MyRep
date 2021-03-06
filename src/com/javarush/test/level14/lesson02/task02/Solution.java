package com.javarush.test.level14.lesson02.task02;

/* Bingo-2
Исправь строчку 'Cat o = new Cat();' так, чтобы программа вывела "Bingo!"
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat o = new Cat();

        boolean isCat = o instanceof Cat;
        boolean isMoveable = o instanceof Cat;
        boolean isTom = o instanceof Cat;

        if (isCat && isMoveable && isTom) System.out.println("Bingo!");

    }

    interface Moveable
    {
    }

    static class Cat
    {
    }

    static class TomCat extends Cat implements Moveable
    {

    }
}
