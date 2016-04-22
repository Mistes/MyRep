package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
       String name;
        int age;
        int numberofchildrens;
        boolean hasmom;
        boolean hasdad;
        String nameofChild;
        String mood;
        Human(){}                        //1
        Human(int age, boolean hasmom){  //2
            this.age = age;
            this.hasmom = true;
        }
        Human (int age, int numberofchildrens){     //3
            this.age = age;
            this.numberofchildrens = numberofchildrens;
        }
        Human (int age, boolean hasmom, boolean hasdad){   //4
            this.age = age;
            this.hasmom = hasmom;
            this.hasdad  = hasdad;
        }
        Human(int age, int numberofchildrens, boolean hasmom, boolean hasdad){//5
            this.age = age;
        this.numberofchildrens = numberofchildrens;
        this.hasmom = hasmom;
            this.hasdad = hasdad;
        }
        Human(int age){this.age = age;}    //6
        Human(String mood){this.mood = mood;}    //7
        Human(String mood, String nameofChild){this.mood = mood; this.nameofChild = nameofChild;}   //8
        Human(Boolean hasmom, int numberofchildrens){
            this.hasmom = hasmom; this.numberofchildrens = numberofchildrens;     //9
        }
        Human(String nameofChild, int age, boolean hasdad){
            this.nameofChild = nameofChild;
            this.age = age;
            this.hasdad = hasdad;           //10
        }

    }
}
