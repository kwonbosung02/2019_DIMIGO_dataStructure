package org.dimgo.basic;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        do{
            System.out.println("<<아이돌 선택>>");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("9");
            menu = scanner.nextInt();
            switch (menu){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");

                    break;
                case 3:
                    System.out.println("3");

                    break;
                case 9:
                    System.out.println("9");

                    break;
                    default:
                        System.out.println("dfgfhgfd");
                        scanner.close();
                        break;

            }
        }
        while(menu != 9);



    }
}
