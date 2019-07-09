package org.dimigo.oop;

public class Contact {


    private String  firstName;
    private String  secondName;
    private String  phoneNumber;
    private boolean isMale;
    private String  job;

    public void callTo(String to) {
        System.out.println(to+"에 전화를 겁니다 : 띠리링 띠링띠링");
    }


    public void getName(String name) {
        System.out.println(name+"이 이름입니다");
    }


    public void getPhoneNumber(String number) {
        System.out.println("사용자의 전화번호는 "+number+" 입니다");
    }


    public void getInfo() {
        System.out.println( "이름 : "+firstName+" "+secondName+"\n"
                +"전화번호 : "+phoneNumber+"\n"
                +"남자 : "+isMale+"\n"
                +"직업 : "+job);
    }


    public boolean isGenderMale() {
        if (isMale == true)
            System.out.println("남자입니다");

        if (isMale == false)
            System.out.println("여자입니다");
        return isMale;

    }


}
