package org.dimigo.oop2;

public class Person {
    public static final String type = "포유류";
    private final String birthDate;
    private String name;

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }


    public String toString() {
        return "Person{" +
                "type='" + type + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("2002","bosung");
        Person p2 = new Person("2002","sunmeoung");


        System.out.println(p1.toString());
        System.out.println(p2.toString());

        //p1.type="파충류"; -> error


    }
}
