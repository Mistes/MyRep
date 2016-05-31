package com.javarush.test.level25.lesson02.task02;

import java.util.ArrayList;
import java.util.List;

/* Машину на СТО не повезем!
Инициализируйте поле wheels используя данные из loadWheelNamesFromDB.
Обработайте некорректные данные.
Подсказка: если что-то не то с колесами, то это не машина!
Сигнатуры не менять.
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            wheels = new ArrayList<>();
            String[]array = loadWheelNamesFromDB();
            try{
            for(int i = 0; i <array.length; i++){
                Wheel wheel = Wheel.valueOf(array[i]);
                wheels.add(wheel);
            }}catch (Exception e){
                System.out.println(" hehe" + e);
            }
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args)
    {

        Solution.Car car = new Solution.Car();
        for (Wheel text : car.wheels)
        {
            System.out.println(text);

        }
       // System.out.println(car.wheels);
    }
}
