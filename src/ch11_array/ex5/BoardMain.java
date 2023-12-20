package ch11_array.ex5;

import java.util.Scanner;

public class BoardMain {

    public static void main(String[] args) {
        BoardService boardService = new BoardService();
        boolean run = true;

        Scanner scanner = new Scanner(System.in);
       while(run) {
           System.out.println("▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽▼▽");
           System.out.println("1.글작성 2.글목록 3.글조회 4.글수정 5.글삭제 6.검색 7.테스트데이터");
           System.out.println("△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲△▲");
           int choice = scanner.nextInt();
           if (choice == 1) {
               boardService.save();
           } else if (choice == 2) {
               boardService.boardList();
           } else if (choice==3) {
               boardService.findId();
           } else if (choice==4) {
               boardService.edit();
           }else if (choice==5) {
               boardService.delete();
           }else if (choice==6) {
               boardService.search();
           }else if (choice==7) {
               boardService.testData();
           }

       }
    }
}
