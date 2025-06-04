package com.bipin.designPatterns.Singleton;

//Synchronised Blcok
public class Singleton {
    public static String str;
    private static Singleton singleInstance = null;
    private Singleton() {
        str = "Hello I am a Singleton Design Pattern!";
    }
    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    public static void main(String[] args)
    {
        Singleton singleton =new Singleton();
        System.out.println(str);
    }
}