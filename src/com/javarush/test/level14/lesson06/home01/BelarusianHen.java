package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Mistes on 07.02.2016.
 */
public class BelarusianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        double a = Math.random() * 54 + 65;
        int n = (int)a;
        return n;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " +Country.BELARUS +". Я несу "+ getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

