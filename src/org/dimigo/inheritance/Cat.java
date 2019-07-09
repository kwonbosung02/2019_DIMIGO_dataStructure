package org.dimigo.inheritance;

public class Cat extends Animal {

    public Cat(String name) {
        super( name );
    }
    //부모 클래스의 메소드 자식 클래스에서 제정의, 메소드 오버라이딩
 //   public void bark(){
 //       System.out.println("양");
 //   }

    @Override
    public void bark() {
        System.out.println("양");
    }

    public void scratch() {
        System.out.println(name +"이 할퀸다");
    }
}
