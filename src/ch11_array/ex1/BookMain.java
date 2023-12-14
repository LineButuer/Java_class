package ch11_array.ex1;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        // Book 객체를 담기위한 bookList 객체 선언
        List<Book> bookList = new ArrayList<>();
        // 기본생성자로 Book 객체(book1) 생성 후 bookList에 추가
        Book book1 = new Book();
//        book1.setId(1111L);
        book1.setBookTitle("Extend Mind");
        book1.setBookAuthor("애니 머피 폴");
        book1.setBookPrice(20000);
        book1.setBookPublisher("알에이치코리아");
        bookList.add(book1);
        // 매개변수 생성자로 Book 객체(book2) 생성 후 bookList에 추가
        Book book2 = new Book("총균쇠", "재러드 다이아몬드", 20000, "문학사상사");
        Book book3 = new Book("사장을 위한 MBA필독서", "나가이다카히사", 17800, "센시오");




        bookList.add(book2);
        bookList.add(book3);
        // for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList = " + bookList);
        }
        // for each를 이용하여 bookList의 전체 데이터 출력
        for (Book bk : bookList) {
            System.out.println("bk = " + bk);
        }
        // list의 0번 인덱스에 담긴 책의 가격을 50000으로 변경

        bookList.get(0).setBookPrice(50000);
        System.out.println("bookPrice = " + bookList.get(0).getBookPrice());
        // list의 1번 인덱스에 담긴 출판사의 제목을 "안녕출판사"로 변경
        bookList.get(1).setBookPublisher("안녕 출판사");
        // for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList = " + bookList);


            // for each를 이용하여 bookList의 전체 데이터 출력
            for (Book bk : bookList) {
                System.out.println("bk = " + bk);
            }
        }
    }
}