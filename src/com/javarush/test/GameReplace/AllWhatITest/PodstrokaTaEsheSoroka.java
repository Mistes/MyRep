package com.javarush.test.GameReplace.AllWhatITest;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/


import com.javarush.test.level22.lesson05.task01.*;
import com.javarush.test.level22.lesson05.task01.Solution;

public class PodstrokaTaEsheSoroka
{
    public static void main(String[] args)
    {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }
    public static String getPartOfString(String string) {
        String[] tempotwo = string.split(" ");
        try{
            return tempotwo[1] + " " + tempotwo[2]+ " " + tempotwo[3]+ " " + tempotwo[4];
        }catch (TooShortStringException e){
            System.out.println(e);
        }
        return null;
    }

    public static class TooShortStringException extends ArrayIndexOutOfBoundsException{

    }
}
