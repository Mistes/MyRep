package com.javarush.test.GameReplace.AllWhatITest;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by Mistes on 12.06.2016.
 */
public class CompareForMountain   //TODO my comparator
{
    LinkedList<Mountain> mtn = new LinkedList<>();
    class NameCompare implements Comparator<Mountain>
    {
        @Override
        public int compare(Mountain o1, Mountain o2)
        {
            return o1.getName().compareTo(o2.getName());
        }
    }
    class HeightCompare implements Comparator<Mountain>
    {
        @Override
        public int compare(Mountain o1, Mountain o2)
        {
            return o1.getHeight()- o2.getHeight();
        }
    }

    public static void main(String[] args)
    {
        new CompareForMountain().go();

    }
    public void go(){
        mtn.add(new Mountain("Long-arnage", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Marun", 14156));
        mtn.add(new Mountain("Castle", 14265));
        System.out.println("at adding style \n" + mtn);
        NameCompare nc = new NameCompare();
        Collections.sort(mtn,nc);
        System.out.println("At name \n" + mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn,hc);
        System.out.println("at height \n" + mtn);
    }
}
