package org.dimigo.oop2;

public class Car {
    //static
    private static String Company;

    //instance
    private String name;

    static {
        Company = "기아";
        System.out.println( "static block loaded" );
    }
    //constructor
    public Car(String name) {
        this.name = name;
        System.out.println("constructor loaded");
    }
    //gettter
    public static String getCompany() {
        return Company;
    }

    public String getName() {
        return name;
    }

    //setter

    public static void setCompany(String company) {
        Company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString
    public String toString() {
        return Company + " : " + name;
    }

}
