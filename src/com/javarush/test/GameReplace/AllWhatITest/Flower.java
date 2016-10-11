package com.javarush.test.GameReplace.AllWhatITest;

/**
 * Created by Администратор on 31.08.2016.
 */

    public class Flower{
    public static void main(String[] args)
    {
        Flower x= new Flower("Dodo");
        x.printPetalCount();
    }
        int petalCount = 0;
        String s = "Initial";
        Flower(int petals){
            petalCount = petals;
            System.out.println("Constructor with INT param, petalcount = " + petalCount);
        }
        Flower(String ss){
            System.out.println("Constructor with STRING param, s =" + ss);
            s = ss;
        }
        Flower (String s, int petals){
            this(petals);
            this.s = s;
            System.out.println("Arguments here - String and INT");
        }
        Flower(){
            this("LOH", 47);
            System.out.println("Default constructor, without arguments");
        }
        void printPetalCount(){
            System.out.println("PetalCount = "+ petalCount+ ", s = " + s);
        }
    }


