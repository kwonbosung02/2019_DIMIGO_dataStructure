package org.interfaces;
// 인터페이스 : 하나의 표준 /규약 /명세
public interface IAnimal {
    //추상메소드 선언

    String FARM_NAME = "디미동물농장";

    //public abstract void eat();

    public  abstract void bark();


    public default void eat() {
        System.out.println("냠냠");
    }


    public static void welcome() {
        System.out.println(FARM_NAME+"에 오신 것을 환영합니다");
    }


}
