package org.dimigo.inheritance;

public class Student extends Person {
    private String studentID;

    public Student(String name, int age, int height, int weight, String studentID){

         super(name,age,height,weight);//무조건 수퍼 먼저
        this.studentID = studentID;
    }


    public void exam(){
        System.out.println(super.getName() + "이 시험을 봅니다");
    }
    public void study(){
        System.out.println(getName() + "이 공부를 합니다");
    }


    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                super.toString()+
                '}';
    }
}

