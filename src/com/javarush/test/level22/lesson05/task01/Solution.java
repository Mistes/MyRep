package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static String getPartOfString(String string) {
        String a = null;
        try{
            if(string.isEmpty()) throw new TooShortStringException();
            if (string.equals(null)) throw new TooShortStringException();

            String [] x = string.split(" ");
            if(x[4].equals(null)){throw new TooShortStringException();}
            a = x[1] + " " + x[2] + " " + x[3] + " " + x[4];



       }catch (TooShortStringException e){
            System.out.println("Exception!" + e);
        }
        return a;
    }

    public static class TooShortStringException extends Throwable {

    }



    public static void main(String[] args)
    {
       // getPartOfString("Its really amazing day to have the walk");
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }
}
