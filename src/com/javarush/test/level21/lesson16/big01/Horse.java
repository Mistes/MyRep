package com.javarush.test.level21.lesson16.big01;

/**
 * Created by Mistes on 22.04.2016.
 */
public class Horse
{
  private String name;
  private double speed;
  private double distance;
   public Horse(String name, double speed, double distance){
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public double getDistance()
    {
        return distance;
    }

    public double getSpeed()
    {
        return speed;
    }

    public String getName()
    {
        return name;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }
    public void move(){
        distance+=speed*Math.random();
    }
    public void print(){
        int var = (int)distance;
        for(int i = 0; i < var; i++){
            System.out.print(".");
        }
        System.out.print(name);
        System.out.println(" ");
        System.out.println(" ");
    }
}
