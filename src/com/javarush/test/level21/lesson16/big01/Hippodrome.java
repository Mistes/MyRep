package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Mistes on 22.04.2016.
 */
public class Hippodrome
{
    public static Hippodrome game;
    public ArrayList<Horse> horses = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException
    {
        Hippodrome hipo = new Hippodrome();
        game = hipo;
        Horse bura = new Horse("Bura", 3, 0);
        Horse mega = new Horse("Mega", 3, 0);
        Horse leka = new Horse("DekaN", 3, 0);
        game.getHorses().add(bura);
        game.getHorses().add(mega);
        game.getHorses().add(leka);
        game.run();
        game.printWinner();
    }
    public void run() throws InterruptedException{
        for(int i = 0; i < 100; i++){
            move();
            print();
            Thread.sleep(50);
        }
    }
    public void move(){
        for (Horse horse : getHorses()) {
            horse.move();}
    }
    public void print(){
        for (Horse horse : getHorses()) {
            horse.print();}
    }


    public ArrayList<Horse> getHorses()
    {
        return horses;
    }
    public Horse getWinner(){
        double dis=0;
        Horse winner=null;
        for (Horse horse : getHorses()){
            if (horse.getDistance()>dis) {
                dis=horse.getDistance();
                winner=horse;
            }
        }
        return winner;

    }
    public void printWinner(){
        System.out.println(String.format("Winner is %s!", getWinner().getName()));
    }
}

