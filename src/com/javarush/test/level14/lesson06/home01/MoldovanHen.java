package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Mistes on 07.02.2016.
 */
public class MoldovanHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        double a = Math.random() * 116 + 40;
        int n = (int)a;
        return n;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " +Country.MOLDOVA +". Я несу "+ getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
