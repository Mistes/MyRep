package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);
    static {threads.add(new One());
            threads.add(new Inter());
            threads.add(new Ura());
            threads.add(new Messageone());
            threads.add(new Rid());}


   public static class One extends Thread{

       public void run()
       {
        while(true){}
       }
   }
    public static class Inter extends Thread{
        @Override
        public void run()
        {
            try{
                while (!isInterrupted()){
                    throw new InterruptedException();
                }
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public static class Ura extends Thread{
        @Override
        public void run()
        {
            while(true){
                try{
                    Thread.sleep(500);
                    System.out.println("Ура");
                } catch (InterruptedException e){}
            }
        }
    }

    public static class Messageone extends Thread implements Message{
        @Override
        public void showWarning()
        {try{
            interrupt();
            join();}
        catch (InterruptedException e){}
        }

        @Override
        public void run()
        {
            while (!isInterrupted()){}
        }
    }
    public static class Rid extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        @Override
        public void run()
        {
            try{
                String s;
                int sum = 0;

            while (!(s = reader.readLine()).equals("N")){
                sum+=Integer.parseInt(reader.readLine());
            }
                reader.close();
                System.out.println(sum);
            }catch (IOException e){}


        }
    }
}

