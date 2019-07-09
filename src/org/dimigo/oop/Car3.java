package org.dimigo.oop;

public class Car3 {

    private String  Company;
    private String  model;
    private String  color;
    private int     maxSpeed;
    private int     price;

    //기본 생성자

    public Car3(){

    }

    public Car3(String company, String model, String color, int maxSpeed, int price) {
        this.Company  = company;
        this.model    = model;
        this.color    = color;
        this.maxSpeed = maxSpeed;
        this.price    = price;
    }
    public Car3(String company, String model, String color, int maxSpeed) {
        this(company,model,color,maxSpeed,0);
    }

    public Car3(String company, String model, String color) {
        this(company,model,color,0,0);

    }





    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}