package org.dimigo.oop2;

public class Car_one {
    private static Car_one instance = new Car_one();

    private Car_one(){

    }

    public static Car_one getInstance(){
        return instance;
    }



}
