package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter{
    private FileOutputStream fs;
    public AdapterFileOutputStream (FileOutputStream fileOutputStream){
        this.fs = fileOutputStream;
    }

    @Override
    public void flush() throws IOException
    {
        this.fs.flush();
    }

    @Override
    public void writeString(String s) throws IOException
    {
       fs.write(s.getBytes());
    }

    @Override
    public void close() throws IOException
    {
    this.fs.close();
    }
}

