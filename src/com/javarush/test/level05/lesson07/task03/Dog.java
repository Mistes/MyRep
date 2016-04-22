package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String name;
    int height;
    String color;
    public void initialize(String name)
    {
        this.name = "Lusya";
    }
    public void initialize(String name, int height)
    {
        this.name = "Asya";
        this.height = 2;
    }
    public void initialize(String name, int height, String color)
    {
        this.name = "Vasyou";
        this.height = 2;
        this.color = "RGB";
    }

}
