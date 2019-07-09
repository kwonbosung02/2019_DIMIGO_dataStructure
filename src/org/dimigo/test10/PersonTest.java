package org.dimigo.test10;

public class PersonTest {
    public static void main(String[] args) {


        Person[] people = {
                new Person("Tom"),
                new Korean( "홍길동" ),
                new Japanese( "다나카" ),
                new Chinese( "왕밍" )
        };
        System.out.println(people.toString());

        for(Person p : people){
            p.sayHello();

        }
        System.out.println();
        for(Person p : people){
            p.sayBye();
        }

        System.out.println();
        for(Person p : people){

        }


    }
}
