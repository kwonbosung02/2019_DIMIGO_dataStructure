package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        int a  =10;
        int b = 20;
        Calculator Calculator = new Calculator(a,b);
        //Calculator.powerOn();

        System.out.printf("%d + %d =  %d\n",a,b,Calculator.add());
        System.out.printf("%d - %d =  %d\n",a,b,Calculator.sub());
        System.out.printf("%d * %d =  %d\n",a,b,Calculator.mul());
        System.out.printf("%d / %d =  %.1f\n",a,b,Calculator.div());
        Calculator.powerOff();
    }
}
