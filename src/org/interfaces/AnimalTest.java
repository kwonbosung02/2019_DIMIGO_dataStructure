package org.interfaces;


public class AnimalTest {
    public static void main(String[] args) {
        IAnimal[] animals = {
                new Duck(), new Pig(), new Cow()
        };
        //IAnimal.FARM_NAME = "디미동물농장";

        System.out.println("평온");
        for(IAnimal a :animals){
            a.eat();
        }
        for(IAnimal a :animals){
            a.bark();
        }
        IAnimal.welcome();

    }
}
