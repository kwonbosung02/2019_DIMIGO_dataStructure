package org.dimigo.inheritance;

public class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("냠");
    }

    protected void sleep(){
        System.out.println("쿨");
    }

    public void bark(){
        System.out.println("멍");
    }
    public String toString(){
        return "내 이름은"+ name + "이다";
    }

}
