package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    String name;
    int age;
    String sex;
   public Friend(String name)
   {
       this.name="ololo";
   }
    public Friend(String name, int age)
    {
        this.name = "kokoko";
        this.age = 25;
    }
    public Friend (String name, int age, String sex)
    {
        this.name = "kokoko";
        this.age = 22;
        this.sex = "Dinozavr";
    }


}