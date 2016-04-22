package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String name;
    int weight;
    int age;
    String color;
    String adress;
    public Cat(String name)
    {
        this.name = "231";
    }
    public Cat(String name, int weight,int age)
    {
        this.name = "Kolokol4eg";
        this.weight= 4;
        this.age = 2;
    }
    public Cat(String name, int age)
    {
        this.name = "smelly cat";
        this.age = 3;
        this.weight=weight;
    }
    public Cat(int weight, String color)
    {
        this.age = age;
        this.weight= 3;
        this.color = "Brown";
    }
    public Cat(int weight, String color,String adress)
    {
        this.weight = 5;
        this.color = "red";
        this.adress = "Kolotushkina";
    }
}
