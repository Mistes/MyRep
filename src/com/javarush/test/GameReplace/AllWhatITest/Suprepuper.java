package com.javarush.test.GameReplace.AllWhatITest;

import java.awt.*;

/**
 * Created by Администратор on 02.06.2016.
 */
public class Suprepuper
{
    Integer i = 5;
    int j = 6;
    public void go(){
        j=i;
        System.out.println(i);
        System.out.println(j);
    }
    public static void main(String[] args)
    {
      //  Car car = new Car();
      //  Car car2 = new Car(Color.BLUE);
      //  Car car3 = new Car(15,Color.CYAN);
       // Suprepuper sup = new Suprepuper();
       // sup.go();
        System.out.println(String.format("%, d", 10000000)); // komu komu skrizb
        System.out.println(String.format("%,.2f, mistakes ", 2142364564345234.324236232363481274));
        System.out.println(String.format("%c, mistakes ", 42));
    }

    Suprepuper(){

        System.out.println("New text");
    }
    Suprepuper(int j,String none, Color c){
        System.out.println("its 3 constructor");
    }
    public static  class Car extends Suprepuper{
        Color color;
        Car(){
       this(Color.RED);
        }
        Car(Color c){
            super();
            color = c;
            System.out.println(color);
        }
        public Car(int j, Color color){
            super(j,"LOL",Color.BLACK);
            System.out.println("Car for 3 number");
        }

    }
}
