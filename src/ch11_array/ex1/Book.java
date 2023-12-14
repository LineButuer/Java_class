package ch11_array.ex1;

public class Book {
    /**
     책 클래스
     필드
     책관리번호(id) - Long 타입
     책제목(bookTitle)
     저자(bookAuthor)
     가격(bookPrice)
     출판사(bookPublisher)
     필드에 대한 getter/setter
     생성자 2가지
     toString method
     */

//    필드
//    책관리번호(id) - Long 타입
    private Long id;
//    책제목(bookTitle)
    private String bookTitle;
//    저자(bookAuthor)
    private String bookAuthor;
//    가격(bookPrice)
    private int bookPrice;
//    출판사(bookPublisher)
    private String bookPublisher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }


    public Book(){

    }

    public Book(Long id, String bookTitle, String bookAuthor, int bookPrice, String bookPublisher) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookPublisher='" + bookPublisher + '\'' +
                '}';
    }
}