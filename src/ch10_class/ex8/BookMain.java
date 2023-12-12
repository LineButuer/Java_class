package ch10_class.ex8;

import java.util.Arrays;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
//        book.bookTitle = "책제목1";
        book.setBookTitle("shot");


        String title = book.getBookTitle();
        System.out.println("title = " + title);

        System.out.println(book.getBookTitle());

        book.setBookAuthor("gun");

        String Author = book.getBookAuthor();
        System.out.println("Author = " + Author);

        System.out.println(book.getBookAuthor());




    }
}
