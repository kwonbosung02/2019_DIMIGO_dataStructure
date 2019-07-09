package org.dimigo.oop;

public class ArrayBasic {


    public static
    void main(String[] args) {
        int[] intArr = null;
        int[] intArr2 = {1,2,3,4,5};

        double[] doubleArr = null;

        intArr = new int[5];

        doubleArr = new double[5];

        String[] StrArr = new String[3];
        String[] StrArr2 = new String[] {"ITZY","예지","릴타치","권보성"};

        StrArr[0] = "권보성";
        StrArr[1] = "리타치";
        StrArr[2] = "강현준";
        //OverLoading
        printArray(intArr);
        printArray(doubleArr);
        printArray(StrArr);
        printArray(intArr2);
        printArray(StrArr2);

        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("수학의 바이블","김재영",100);
        bookArr[1] = new Book("과학","김영",500);
       /*
       Book[] bookArr = {
        new Book("수학의 바이블","김재영",100),new Book("과학","김영",500)
       }


        */
        Book[] bookArr2 = new Book[]{new Book("수학의 바이블","김재영",100), new Book("과학","김영",500)};

        printArray(bookArr2);
        //배열 사용시 주의 사항
        int[] intArr3 = null;
        //System.out.println(intArr3.length);//NullPointerException
        int[] intArr4 = new int[3];
        System.out.println(intArr4.length);
        //System.out.println(intArr4[3]);//Index 3 out of bounds for length 3

        String[] strArr3 = new String[3];
        System.out.println(strArr3[0]);
        //System.out.println(strArr3[0].length());
    }

    private static void printArray(double[] doubleArr) {
        for(double value : doubleArr) {

            System.out.print(value + " | ");

        }System.out.println();
    }

    private static void printArray(int[] intArr) {
        for(int value : intArr) {

            System.out.print(value + " | ");

        }System.out.println();

    }
    private static void printArray(String[] StrArr) {
        for(String value : StrArr) {

            System.out.print(value + " | ");

        }System.out.println();
    }

    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr) {

            System.out.print(value);

        }System.out.println();
    }

}
