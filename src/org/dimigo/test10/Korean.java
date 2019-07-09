package org.dimigo.test10;

public class Korean extends Person{

    public Korean(String name) {
        super( name );
    }



    public void sayHello() {
        System.out.println("안녕하세요");
    }


    public void sayBye() {
        System.out.println("안녕히 계세요");
    }


    public String toString() {
        return "저는 한국사람 "+super.getName()+"입니다.";
    }
}
