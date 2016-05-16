package com.javarush.test.level22.lesson18.big01;

/**
 * Created by Mistes on 13.05.2016.
 */
public class Tetris
{
    private Field field;
    private Figure figure;
    public Field getField()
    {
        return field;
    }
    public Figure getFigure(){return figure;}
    public void run(){}
    public void step(){}
    public static Tetris game;


    public static void main(String[] args)
    {
        game = new Tetris();
        game.run();

    }
}
