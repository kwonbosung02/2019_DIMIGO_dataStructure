package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class MyFavorite {
    private static String[] questions = {
         "가장 좋아하는 가수는? ",
         "가장 좋아하는 배우는? ",
         "가장 좋아하는 과목은? "
    };
    private static String[] answers = {
            "아이유",
            "원빈",
            "자료구조"
    };



    public static void main(String[] args) {
    int menu;
    String answer;
    StringBuilder sb = new StringBuilder();
    int random;

    Scanner scanner = new Scanner(System.in);

    do{
        System.out.println("------------------\n"+ "1. 질문 선택\n"+ "2. 정답 공개\n"+ "9. 프로그램 종료\n"+ "------------------");
        System.out.printf("메뉴 선택 => ");
        menu = scanner.nextInt();
        answer = scanner.nextLine();

        switch (menu){
            case 1:
                random = new Random().nextInt(3);

                System.out.print(questions[random]);
                answer = scanner.nextLine();
                System.out.println(answers[random].equals(answer) ? "정답입니다!" : "틀렸습니다!");
                break;

            case 2:
                for(int i = 0; i <3; i++){
                    sb.append(questions[i]).append(answers[i]).append("입니다.").append("\n");
                }
                System.out.println(sb);

                break;

            case 9:
                break;

            default:
                System.out.println("없는 메뉴입니다.");
                break;


        }


    }
    while(menu != 9);
        System.out.println("Bye~");
        scanner.close();
    }
}
