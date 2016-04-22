package com.javarush.test.level19.lesson08.task01;

/* Ридер обертка
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна преобразовывать весь текст в заглавные буквы
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток.
Вывести модифицированную строку в консоль.
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consolestream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
       testString.printS();
       String result = outputStream.toString().toUpperCase();

        System.setOut(consolestream);
        System.out.println(result);
        System.out.println("ololo");
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
        public void printS(){
            System.out.println("kakoi krasivuy tekst vah vah vah");
        }
    }
}
