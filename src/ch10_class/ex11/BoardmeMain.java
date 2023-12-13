package ch10_class.ex11;

import java.util.Scanner;

public class BoardmeMain {
    public static void main(String[] args) {
        /**
         * 메뉴
         * 1. 글작성(매개변수 있는 생성자이용)
         *      글작성 정보는 스캐너로 받음. 글번호도 같이 입력함.
         * 2. 글조회
         *      글번호를 입력 받고 Board 클래스의 findById로 글번호를 넘긴다.
         * 3. 종료
         */
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        Boardme boardme = null;
        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.글작성 | 2.글조회 | 3.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();





            if (selectNo == 1) {
                //우선 글 내용이 있어야 하는데 그건
                boardme = new Boardme();
                System.out.println("글 번호");
                Long id = scanner.nextLong();
                System.out.println("글 제목");
                String boardTitle = scanner.next();
                System.out.println("글 작성자");
                String boardWriter = scanner.next();
                System.out.println("글 내용");
                String boardContents = scanner.next();

                boardme.setId(id);
                boardme.setBoardTitle(boardTitle);
                boardme.setBoardWriter(boardWriter);
                boardme.setBoardContents(boardContents);



            } else if (selectNo == 2) {
                // 글 조회를 누르면 글로 가야하는데, 글 번호를 받아서 갈 수 있게 만든다.
                System.out.println("조회하실 id를 입력하세요.");
                Long id = scanner.nextLong();
                boardme.findById(id);
                System.out.println("조회수" + boardme.getBoardHits());
            } else if (selectNo == 3) {
                run = false;
            }
        }
    }
}
