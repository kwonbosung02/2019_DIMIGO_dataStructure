package org.dimigo.oop;

public class MultyArray {
    public static void main(String[] args) {

        int[][] intArr = new int[2][3];
        printArray(intArr);

        String[][] strArr = new String[2][];
        strArr[0] = new String[]{"C","Java","PhP"};
        strArr[1] = new String[]{"C#","Python"};


        printArray(strArr);

        String[][] strArr2 = {
                {"C","Java","PhP"},
                {"C#","Python"}};

        }
        String[][] strArr3 = new String[][]{
                {"C","Java","PhP"},
                {"C#","Python"}
        };

        String[][] strArr4 = new String[][]{
                new String[]{"C","Java","PhP"},
                new String[]{"C#","Python"}
        };

        String[][] strArr5 = {
                new String[]{"C","Java","PhP"},
                new String[]{"C#","Python"}
        };



    private static void printArray(int[][] intArr) {

        for(int[] arr: intArr) {
            for (int value2 : arr) {
                System.out.print(value2);
            }
            System.out.println();
        }
    }

    private static void printArray(String[][] strArr) {

        for(String[] arr: strArr) {
            for (String value2 : arr) {
                System.out.print(value2);
            }
            System.out.println();
        }
    }

}
