package org.dimigo.oop;

public class Calculator {
    //instance field
    private int num1;
    private int num2;
    private boolean powerFlag =  false;
    //consturctor
    public Calculator(){

    }

    public Calculator(int num1,int num2){
        powerOn();
        this.num1 = num1;
        this.num2 = num2;

    }
    //instance method (static x)
    public void powerOn(){
        if(!powerFlag)
        System.out.println("전원을 킨다");
        powerFlag = true;
    }

    public void powerOff(){

        System.out.println("전원을 끈다");
        powerFlag = false;
    }

    public int add(){
        powerOn();

        return this.num1 + this.num2;
    }
    public int sub(){
        powerOn();

        return this.num1- this.num2;
    }
    public int mul(){
        powerOn();

        return this.num1 * this.num2;
    }
    public double div(){
        powerOn();

        return (double) this.num1 / this.num2;
    }



}