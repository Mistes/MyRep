package com.javarush.test.level22.lesson18.big01;

/**
 * Created by Mistes on 13.05.2016.
 */
public class Field
{
    private int width;

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public int[][] getMatrix(){return matrix;}

    private int height;
    private int [][]matrix;
    Field(int width, int height){}
    public void print(){}
    public Integer getValue(int x, int y){

        return x*y;}
    public void setValue(int x, int y, int value){

    }
    public void removeFullLines(){}
}

