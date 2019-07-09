package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("아이유",25,160,45);
        System.out.println(p);
        p.eat();
        Student s = new Student( "권보성",18,200,100,"bskwon0526");
        s.study();
        Teacher t = new Teacher( "보성",30,30,30,"컴네" );
    }
}
