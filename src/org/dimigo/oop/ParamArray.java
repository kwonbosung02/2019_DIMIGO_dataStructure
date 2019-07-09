package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
            int [] Arr = {1,2,3,4,5};
            add(Arr, 10);

            printArray(Arr);
            String[] names = {"김보성","구보성","왕보성","짱보성"};
            changeNames(names);
            printArray(names);
    }

    private static void changeNames(String[] names) {
        for (int i = 0; i <names.length; i++) {
            names[i] = "권" + names[i].substring(1);
        }
    }


    private static void add(int[] arr, int num) {
        for(int i = 0 ; i <arr.length; i++)
        {
            arr[i] += num;

        }
    }
    private  static void printArray(int[] arr){
        for (int number :arr){
            System.out.println(number);
        }
    }
    private  static void printArray(String[] arr){
        for (String Q :arr){
            System.out.println(Q);
        }
    }
}
