package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.


public class Cat
{
    private String name;
    private int weight;
    private int age;
    private String color;
    private String adress;
    private int standartweight;

    public void initialize (String name)
    {
        this.name = "Petroshka";
    }
    public void initialize (String name, int weight, int age)
    {
        this.name = "Vaska";
        this.weight = 3;
        this.age = 5;
    }
    public void initialize(String name, int age)
    {
        this.name ="koko";
        this.age = 2;
    }
    public void initialize(int weight, String color)
    {
        this.weight = 4;
        this.color ="Red";
    }
    public void initialize(int weight, String color, String adress)
    {
        this.weight = 2;
        this.color = black;
    }
}

*/
