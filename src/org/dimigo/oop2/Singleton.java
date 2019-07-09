package org.dimigo.oop2;

public class Singleton {
    public static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

    public static Singleton getInstance2(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public static final int djks = 0;

}
