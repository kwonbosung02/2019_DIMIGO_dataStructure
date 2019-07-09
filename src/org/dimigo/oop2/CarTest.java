package org.dimigo.oop2;

public class CarTest {
    public static void main(String[] args) {

        Car[] cars = {
                new Car("제네시스"),
                new Car("아반뗴"),
                new Car("그렌저")
        };
        for(Car car : cars){
            System.out.println(car);
        }
    }
}
