package org.dimigo.oop;

public class CarTest {
    public static void main(String[] args) {
        Car3[] car = new Car3[3];
        car[0] = new Car3("현대자동차","제네시스","검정색",225,50000000);
        car[1] = new Car3("기아자동차","K7",  "흰색",246);
        car[2] = new Car3("삼성자동차","SM7",  "회색");

        System.out.println("<<자동차 목록>>");
        for(int i = 0; i <3; i ++)
        {

            System.out.println("제조사명 : "+ car[i].getCompany()+"\n"+"모델명 : "+ car[i].getModel()+"\n"+"색상 : "+ car[i].getColor()+"\n"+"최대속도 : "+ car[i].getMaxSpeed()+"km");
            System.out.printf("가격 : %,d원\n\n",car[i].getPrice());
        }

    }
}
