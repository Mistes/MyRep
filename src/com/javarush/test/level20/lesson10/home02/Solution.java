package com.javarush.test.level20.lesson10.home02;

import java.io.*;

/* Десериализация
На вход подается поток, в который записан сериализованный объект класса A либо класса B.
Десериализуйте объект в методе getOriginalObject предварительно определив, какого именно типа там объект.
Реализуйте интерфейс Serializable где необходимо.
*/
public class Solution implements Serializable{
    Solution(){}

    public A getOriginalObject(ObjectInputStream objectStream) {
            Object o = null;
    try{
         o = objectStream.readObject();}catch (IOException e){
        System.out.println(e);
    }catch (ClassNotFoundException d){
        System.out.println(d);
    }
        if (o instanceof A ){
            A a = (A) o;
            return a;
        } else return null;
    }

    public class A implements Serializable{
        A(){}
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }
}
