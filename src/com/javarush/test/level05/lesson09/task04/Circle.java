package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    int CenterX;
    int CenterY;
    int radius;
    int width;
    String color;
    public Circle(int centerX, int centerY, int radius)
    {
        this.CenterX = 2;
        this.CenterY = 3;
        this.radius = 1;
    }
    public Circle(int centerX, int centerY, int radius, int width)
    {
        this.CenterX = 2;
        this.CenterY = 3;
        this.radius = 1;
        this.width = 1;
    }
    public Circle(int centerY, int radius, int width, String color)
    {
        this.CenterX = 2;
        this.CenterY = 3;
        this.radius = 1;
        this.width = 2;
        this.color = "yellow";
    }

}
