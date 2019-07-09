package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book;
        book = new Book();
        Book book2 = new Book();

        System.out.println(book);
        System.out.println(book2);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        book.setTitle("수학의 바이블");
        book.setAuthor("민경도");
        book.setPage(20);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());
    }
}
