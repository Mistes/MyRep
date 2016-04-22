package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    int centerX;
    int centerY;
    int radius;
    int width;
    String color;
    public void initialize(int centerX, int centerY, int radius)
    {
        this.centerX = 2;
        this.centerY = 1;
        this.radius = 3;
    }
    public void initialize( int centerX, int centerY, int radius, int width)
    {
        this.centerX = 2;
        this.centerY = 3;
        this.radius = 3;
        this.width = 2;
    }
    public void initialize(int centerX, int centerY, int radius, int width, String color)
    {
        this.centerX = 2;
        this.centerY = 3;
        this.radius = 3;
        this.width = 2;
        this.color = "Grey like Sasha Gray";
    }
}
