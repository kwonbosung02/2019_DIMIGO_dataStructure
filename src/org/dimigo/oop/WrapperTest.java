package org.dimigo.oop;

public class WrapperTest {

    public static void main(String[] args) {
        //warpper 클래스 -> primitive type를 객채화해줌
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));
        System.out.println("------------------------------------");
        //Boxing
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1.equals(i2));

        Integer i3 = Integer.valueOf(200);
        Double d1 = Double.valueOf(3.14);

        int r1 = i3.intValue();
        double r2 = d1.doubleValue();

        int p1  = Integer.parseInt("200");
        double p2 = Double.parseDouble("3.15");

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));

        Integer a = new Integer(1000);
        Integer b = new Integer(2000);


        System.out.println(a+b);

        Integer c = 1000;
        int d = c + 2000;

        Integer obj1 = 10; //boxing
        Integer obj2 = obj1 + 20; //boxing, unboxing
        Integer result = obj1 + obj2; // boxing, unboxing,unboxing
    }
}
