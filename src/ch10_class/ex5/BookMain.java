package ch10_class.ex5;

public class BookMain {
    // 책 정보는 시중에 있는 실제 책으로 해봅시다!

    // 기본 생성자로 객체 만들고 필드값 채우기
    public static void main(String[] args) {


        Book book1 = new Book();

        book1.bookTitle = "Extend Mind";
        book1.bookAuthor = "Paul, Annie Murphy";
        book1. bookPublisher = " William Morris Endeavor Entertainment, LLC";
        book1. isbn = " No.1";
        book1. bookPrice = " 20,000 won ";


        System.out.println("book1.bookTitle = " + book1.bookTitle);
       Book book2 = new Book("총균쇠", "재러드 다이아몬드");



       Book book3 = new Book("누가 내 머리 위에 똥 쌌어", "베르너 홀즈워스 와 볼프 에를브루흐의 책", "10,000 원", "사계절 출판사", " 9788971968413");

        System.out.println("book3.bookTitle = " + book3.bookTitle);
        System.out.println("book3.bookAuthor = " + book3.bookAuthor);
        System.out.println("book3.bookPrice = " + book3.bookPrice);
        System.out.println("book3.bookPublisher = " + book3.bookPublisher);
        System.out.println("book3.isbn = " + book3.isbn);


    }




    // 매개변수 2개 있는 생성자로 객체 만들고 필드값 채우기

    // 모든 매개변수 있는 생성자로 객체 만들고 필드값 채우기




}
