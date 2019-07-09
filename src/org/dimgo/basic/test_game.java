package org.dimgo.basic;


import java.util.Random;
import java.util.Scanner;

public class test_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        int[] attackPoint = {100,100,100,100};
        String[] character = {"마법사","영주","기사","농민"};
        int pick = 0;
        int count = 0;

        do{
            System.out.println(
                    "--------------------\n" +
                    "<< 게임 메뉴 >>\n" +
                    "1. 캐릭터 설정\n" +
                    "2. 공격력 증가\n" +
                    "3. 공격력 감소\n" +
                    "9. 종료\n" +
                    "--------------------");
            menu = scanner.nextInt();
            switch (menu)
            {
                case 1:
                    pick = new Random().nextInt(4);
                    count = 1;
                    System.out.println(character[pick]+"(으)로 설정되었습니다.");
                    break;

                case 2:
                    if(count != 1) System.out.println("먼저 캐릭터를 설정하세요!!");
                    else{
                        attackPoint[pick] += 10;
                        System.out.println(character[pick]+" 공격력이 증가되었습니다. 현재 공격력 : "+attackPoint[pick]);

                    }
                    break;
                case 3:

                    if(count != 1) System.out.println("먼저 캐릭터를 설정하세요!!");
                    else {
                        attackPoint[pick] -= 10;
                        System.out.println(character[pick]+" 공격력이 감소되었습니다. 현재 공격력 : "+attackPoint[pick]);

                    }
                    break;
                case 9:

                    break;
                default:
                    System.out.println("없는 메뉴 입니다!!");

            }
        }
        while(menu != 9);
        System.out.println("이제 공부하세요!");

    }
}
