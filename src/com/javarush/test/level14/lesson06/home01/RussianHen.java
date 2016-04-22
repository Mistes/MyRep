package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Mistes on 07.02.2016.
 */
public class RussianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        double a = Math.random() * 76 + 87;
        int n = (int)a;
        return n;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " +Country.RUSSIA +". Я несу "+ getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

