
package org.dimigo.basic;

public class HelloWorld
{
    static boolean flag;
    public static void main(String[] args)
    {

        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';
        //System.out.printf("%c %c %c",c1,c2,c3);

        int i1 = 10;
        int i2 = 0b00001010;
        int i3 = 0x0A;

        byte b1 = 127;
        byte b2 = -128;
        b1++;
        b2--;
        //System.out.println(Double.MIN_VALUE+"--"+Double.MAX_VALUE);
        long b3 = 1000000000000L;

        float f2 = 0.12345678901234567890F;
        double d2 = 0.12345678901234567890D;
        System.out.println(f2);
        System.out.println(d2);


    }

}
// byte -128~127

//Ctrl+D = 줄 복사

//Alt+Shift+f10 = 터미널 변경
