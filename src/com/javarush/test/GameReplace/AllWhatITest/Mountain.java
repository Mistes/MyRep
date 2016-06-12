package com.javarush.test.GameReplace.AllWhatITest;

/**
 * Created by Mistes on 12.06.2016.
 */
public class Mountain
{
   private int height;
   private String name;

    public int getHeight()
    {
        return height;
    }

    public String getName()
    {
        return name;
    }

    Mountain(String name, int h){
        this.height = h;
        this.name = name;
    }
    @Override
    public String toString()
    {
        return this.name+" "+this.height+" ";
    }
}
