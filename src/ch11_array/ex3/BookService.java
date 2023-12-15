package ch11_array.ex3;

import java.util.Scanner;

public class BookService {
    /**
     * 도서등록 메서드
     * name: save
     * parameter: x
     * return: x
     * 실행내용
     *      스캐너로 도서명, 저자, 가격, 출판사정보를 입력받고
     *      BookDTO 객체에 담아서 Repository로 전달하여 저장이 되도록 함
     *      등록 여부를 출력한다.(등록성공 or 등록실패)
     */
    Scanner scanner =new Scanner(System.in);
    BookRepository bookRepository =new BookRepository();

    public void save (){
        System.out.println("등록 시킬 책의 정보를 입력해라");
        System.out.println("책 이름 : ");
        String bookTitle = scanner.next();
        System.out.println("저자");
        String bookAuthor = scanner.next();
        System.out.println("가격");
        String bookPrice = scanner.next();
        System.out.println("출판사");
        String bookPublisher = scanner.next();
        BookDTO bookDTO = new BookDTO(bookTitle, bookAuthor, bookPrice, bookPublisher);
        boolean result = bookRepository.save(bookDTO);
        if(result){
            System.out.println("등록 성공");
        }else{
            System.out.println("등록 실패");
        }
    }




    public void findAll(){
        System.out.println(bookRepository.findAll());
    }
    /**
     * 도서목록 메서드
     * name: findAll
     * parameter: x
     * return: x
     * 실행내용
     *      Repository로 부터 목록을 리턴 받아서 목록에 있는 모든 정보를 출력
     */

    
    
    /**
     * 도서조회 메서드
     * name: findById
     * parameter: x
     * return: x
     * 실행내용
     *      id를 입력받고 Repository로 부터 id에 해당 하는 도서 정보를 출력
     *      없으면 없다고 출력
     */

    public void findById(){
        System.out.println("책 번호를 입력하시오");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if(bookDTO != null){
            System.out.println("책이 있다.");
        }else{
            System.out.println("다시 번호를 입력해라");
        }
        
    }
    
    
    
    public void findByTitle(){
        System.out.println("찾으려는 책 제목을 입력해라");
        String bookTitle =scanner.next();
        BookDTO bookDTO = bookRepository.findByTitle(bookTitle);
        if(bookDTO != null) {
            System.out.println("찾으려는 책이 있따.");
        }else{
            System.out.println("책이 없다.");
        }


    }
    
    /**
     * 도서조회 메서드
     * name: findByTitle
     * parameter: x
     * return: x
     * 실행내용
     *      도서제목을 입력받고 Repository로 부터 해당 하는 도서 정보를 출력(제목이 정확히 일치하는 것만)
     *      없으면 없다고 출력
     */
}
