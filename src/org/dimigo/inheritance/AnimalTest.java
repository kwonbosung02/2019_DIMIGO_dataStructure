package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {

        Animal a = new Animal( "동물" );


        Animal d = new Dog("멍멍잉");

        Cat c = new Cat( "양양이" );

        Animal dog = new Dog("멍멍이");
        dog.eat();
        Dog dog2 = (Dog)dog;
        dog2.wag();
        dog.bark();

        Animal cat = new Cat("야옹이");
        ((Cat)cat).scratch();

        System.out.println(dog instanceof Dog);
        System.out.println(cat instanceof Object);
        doAction( cat );
        doAction( dog );
    }
    private static void doAction(Animal a){
       if(a instanceof Cat){
           Cat c = (Cat) a;
           c.scratch();
       }else if(a instanceof  Dog){
           ((Dog)a).wag();
       }
    }


}
