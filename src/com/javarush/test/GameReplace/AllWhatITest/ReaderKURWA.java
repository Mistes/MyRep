package com.javarush.test.GameReplace.AllWhatITest;


import java.io.*;

/* Дублируем текст
Считайте с консоли имя файла
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна дублировать вывод всего текста в файл, имя которого вы считали
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Закройте поток файла

Пример вывода на экран:
it's a text for testing

Пример тела файла:
it's a text for testing
*/
public class ReaderKURWA extends PrintStream
{
    public static String fileName;
    private final PrintStream second;

    public ReaderKURWA(OutputStream main, PrintStream second)
    {
        super(main);
        this.second = second;
        System.out.println(second);
    }
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException{
        BufferedReader bro = new BufferedReader(new InputStreamReader(System.in));
        fileName = bro.readLine();
        FileOutputStream filed = new FileOutputStream(fileName);
        ReaderKURWA tee = new ReaderKURWA(filed, System.out);
        System.setOut(tee);
        testString.printSomething();
        System.out.println("cat");
        System.setOut(System.out);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

