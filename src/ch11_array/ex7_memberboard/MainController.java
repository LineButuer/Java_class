package ch11_array.ex7_memberboard;

import ch11_array.ex7_memberboard.service.BoardService;
import ch11_array.ex7_memberboard.service.MemberService;
import practice.ex.MemberDTO;

import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        BoardService boardService = new BoardService();
        while (run) {
            System.out.println("======회원관리======");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("1.회원가입 2.로그인 3.회원목록 4.회원수정 5.회원탈퇴 6.로그아웃 7.게시판메뉴 0.종료");
            System.out.println("------------------------------------------------------------------------");
            System.out.print("선택 > ");
            int select = scanner.nextInt();

            if (select == 0) {
                run = false;
            } else if (select == 1) {
                memberService.signUp();
            } else if (select == 2) {
                memberService.logIn();
            } else if (select == 3) {
                memberService.memberList();
            } else if (select == 4) {
                memberService.memberEdit();
            } else if (select == 5) {
                memberService.memberExit();
            } else if (select == 6) {
                memberService.logOut();
            } else if (select == 7) {
                boolean runner = true;
                while (runner) {
                    System.out.println("======게시판======");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("1.글작성 2.글목록 3.글조회 4.글수정 5.글삭제 6.검색 99.sample 0.메인메뉴");
                    System.out.println("----------------------------------------------------------------");
                    System.out.print("선택 =>");
                    int choice = scanner.nextInt();
                    if (choice == 0) {
                        runner = false;
                    } else if (choice == 1) {
                        boardService.boardWrite();
                    } else if (choice == 2) {
                        boardService.boardList();
                    } else if (choice == 3) {
                        boardService.findById();
                    } else if (choice == 4) {
                        boardService.boardEdit();
                    }
                }

            }
        }
    }
}