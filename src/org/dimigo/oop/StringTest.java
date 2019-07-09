package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        //literal pool
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

        System.out.println("-----------------------");
        //new 객체 생성
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        System.out.println(dog1 == "멍멍이");
        System.out.println(cat1 == "야옹이");

        String id = "AdmIn";
        System.out.println(id.equalsIgnoreCase("admin") ? "관리자":"관리자 아님");
        System.out.println("-----------------------");
        testString();

    }

    private static void testString() {
        String s = "abcdefgABCDEFG";
                  //01234567890123
        System.out.println(s.length());//14
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,6));
        System.out.println(s.indexOf("C"));
        System.out.println(s.charAt((9)));
        System.out.println(s.concat("ABC"));
        System.out.println("        ABC          ".trim());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.replace('a','A'));
        System.out.println(s.startsWith("abc"));
        System.out.println(s.endsWith("EFG"));
    }
}
