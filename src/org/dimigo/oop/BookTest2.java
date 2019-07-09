package org.dimigo.oop;

public class BookTest2 {

    private static void compare() {
        int a = 10;
        int b = a;
        System.out.println(a == b ? "true" : "false" );
        Book book = new Book();
        Book book2 = book;
        System.out.println(book == book2 ? "true" : "false");
        book.setTitle(("수학의바이블"));
        System.out.println(book.getTitle());
        System.out.println(book2.getTitle());
    }

    public static void main(String[] args) {
        compare();
        System.out.println("----------------------------");
        int num = 5;
        methodA(num);
        Book book =  new Book();
         methodB(book);
         methodC(book);
    }

    private static void methodC(Book book) {
        book.setTitle("화학");
    }

    private static void methodB(Book book) {
        System.out.println(book.getTitle());


    }

    private static void methodA(int num) {
        num += 10;
        System.out.println(num);
    }
}
