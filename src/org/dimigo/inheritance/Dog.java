package org.dimigo.inheritance;

public class Dog extends Animal {

    public Dog(String name) {
        super( name );
    }

    public void wag(){
        System.out.println(name + "이 꼬리를 흔든당");
    }
    public void bark(){
        System.out.println("왈");
    }
    @Override // annotation
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
