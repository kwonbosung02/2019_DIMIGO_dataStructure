package org.dimigo.oop;

public class Book {
    //필드 선언
    private String title  = "Word Master" ;
    private String author = "이투스";
    private int    page   = 3000;
    public Book() {

    }
    public Book(String title,String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    //매소드 선언

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    //@Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }
}

