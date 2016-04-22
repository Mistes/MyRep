package com.javarush.test.level14.lesson08.bonus01;

import javax.xml.bind.ValidationException;
import javax.xml.ws.WebServiceException;
import java.io.*;
import java.sql.BatchUpdateException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.prefs.BackingStoreException;
import java.util.zip.ZipException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

       try{
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           FileReader r = new FileReader("c://no.txt");
       }catch (Exception e){exceptions.add(e);}
        try{throw new ArithmeticException();
        }catch (Exception e){exceptions.add(e);}
        try{throw new BackingStoreException("Sa");
        }catch (Exception e){exceptions.add(e);}
        try{throw new WebServiceException();
        }catch (Exception e){exceptions.add(e);}
        try{throw new BatchUpdateException();
        }catch (Exception e){exceptions.add(e);}
        try{throw new ValidationException("Lox");
        }catch (Exception e){exceptions.add(e);}
        try{throw new ClassCastException();
        }catch (Exception e){exceptions.add(e);}
        try{throw new InterruptedIOException();
        }catch (Exception e){exceptions.add(e);}
        try{throw new ZipException();
        }catch (Exception e){exceptions.add(e);}

    }
}
