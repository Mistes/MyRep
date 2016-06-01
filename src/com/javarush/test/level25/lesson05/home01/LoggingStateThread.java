package com.javarush.test.level25.lesson05.home01;

/**
 * Created by Администратор on 01.06.2016.
 */
public class LoggingStateThread extends Thread
{
    Thread target;

    LoggingStateThread(Thread thread)
    {
        this.target = thread;
        setDaemon(true);


    }

    public void run()
    {
        Thread.State state = target.getState();
        System.out.println(state);
        while (state != State.TERMINATED)
        {
            if (state != target.getState())
            {
                state = target.getState();
                System.out.println(state); // TODO Цікавий цикл на зміну активного стану, для логів
            }
        }
    }
}