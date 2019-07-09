package org.dimigo.test10;

public class PersonTest2 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Tom"),
                new Korean( "홍길동" ),
                new Japanese( "다나카" ),
                new Chinese( "왕밍" )
        };

        for(Person p : people){
            greeting(p);

        }

    }

    private static void greeting(Person p){
        System.out.println(p.toString());
        p.sayHello();
        p.sayBye();
        System.out.println();
    }

}
