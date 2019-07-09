package org.dimigo.oop;

public class CalculatorTest2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Calculator2 c = new Calculator2();

        System.out.printf( "%d + %d =  %d\n", a, b, Calculator2.add(a,b,c) );
        System.out.printf( "%d - %d =  %d\n", a, b, Calculator2.sub(a,b,c) );
        System.out.printf( "%d * %d =  %d\n", a, b, Calculator2.mul(a,b,c) );
        System.out.printf( "%d / %d =  %.1f\n", a, b, c.div(a,b,c) );
        System.out.println(c.PI);
    }
}
