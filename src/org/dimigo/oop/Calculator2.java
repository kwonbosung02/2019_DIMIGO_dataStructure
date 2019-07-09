package org.dimigo.oop;

public class Calculator2 {

    private boolean powerFlag;

    public void powerOn(){
        if(!powerFlag)
        System.out.println("전원을 킨다");
        powerFlag = true;
    }

    public void powerOff(){

        System.out.println("전원을 끈다");
        powerFlag = false;
    }
    public static double PI = 3.141592;


    public static int add(int num1,int num2,Calculator2 c){

        c.powerOn();

        return num1 + num2;
    }
    public static int sub(int num1, int num2,Calculator2  c){
        c.powerOn();

        return num1 - num2;
    }
    public static int mul(int num1, int num2, Calculator2 c){
        c.powerOn();

        return num1 * num2;
    }
    public static   double div(int num1, int num2, Calculator2 c){
        c.powerOn();

        return (double) num1 / num2;
    }


//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Calculator2 c = new Calculator2();
//
//        System.out.printf( "%d + %d =  %d\n", a, b, add(a,b,c) );
//        System.out.printf( "%d - %d =  %d\n", a, b, sub(a,b,c) );
//        System.out.printf( "%d * %d =  %d\n", a, b, mul(a,b,c) );
//        System.out.printf( "%d / %d =  %.1f\n", a, b,div(a,b,c) );
//        System.out.println(PI);
//    }



}