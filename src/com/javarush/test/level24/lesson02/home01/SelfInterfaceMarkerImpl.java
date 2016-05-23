package com.javarush.test.level24.lesson02.home01;

/**
 * Created by Mistes on 22.05.2016.
 */
public class SelfInterfaceMarkerImpl implements SelfInterfaceMarker
{
    public void fakemove()
    {
        System.out.println("its fake");
    }

    public int trapforyou(int number)
    {
        if (number % 2 == 0)
        {
            System.out.println("its a trap!");
            return 1;
        } else System.out.println("Its fake but who cares");
        return 2;
    }
}
