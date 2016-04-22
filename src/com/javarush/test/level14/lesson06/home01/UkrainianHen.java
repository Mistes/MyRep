package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Mistes on 07.02.2016.
 */
public class UkrainianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        double a = Math.random() * 89 + 91;
        int n = (int)a;
        return n;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " +Country.UKRAINE +". Я несу "+ getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

