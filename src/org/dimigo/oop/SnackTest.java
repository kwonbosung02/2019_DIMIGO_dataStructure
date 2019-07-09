package org.dimigo.oop;

public class SnackTest {
    public static void main(String[] args) {

        Snack[] SnackArr = {
                new Snack("새우깡", "농심",1100,2),
                new Snack ("콘칲","크라운",1200,1),
                new Snack("허니버터칩","해태",1500,4)
        };
        int Total_Sum = 0;

        for(int i = 0 ; i <3; i++){
            System.out.println(SnackArr[i].toString());
            Total_Sum += SnackArr[i].calcPrice();
        }
        System.out.print("총 구매 금액 : ");
        System.out.printf("%,d원",Total_Sum);


    }
}
