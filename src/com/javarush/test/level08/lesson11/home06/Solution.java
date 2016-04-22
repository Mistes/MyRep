package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> ch = new ArrayList<Human>();
        Human granpa = new Human("Oleg",true, 75,ch);
        Human grandma = new Human("Lena", false, 72,ch);
        Human grandpa2 = new Human("Pasha", true , 74,ch);
        Human grandma2 = new Human("Luda", false , 71,ch);
        Human father = new Human("Dorofei",true, 42, ch);
        Human mother = new Human("Lera", false , 38, ch);
        ch.add(new Human("sdf",true,4));
        ch.add(new Human("sdd",true,2));
        ch.add(new Human("sfd",true,5));
        System.out.println(grandma);
        System.out.println(grandma2);
        System.out.println(grandpa2);
        System.out.println(granpa);
        System.out.println(father);
        System.out.println(mother);
        for( int i = 0; i< ch.size(); i++){
            System.out.println(ch.get(i));
        }
    }

    public static class Human
    {
       String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();
        Human(String name,boolean sex,int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }
        Human(String name,boolean sex,int age,ArrayList<Human> children){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children = children;
    }



        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
