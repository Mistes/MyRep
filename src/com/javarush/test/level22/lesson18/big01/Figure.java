package com.javarush.test.level22.lesson18.big01;

/**
 * Created by Mistes on 13.05.2016.
 */
public class Figure
{
    public Figure(int x, int y, int[][] matrix)
    {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int[][] getMatrix()
    {
        return matrix;
    }

    private int x;
    private int y;
    private int[][]matrix;
}
