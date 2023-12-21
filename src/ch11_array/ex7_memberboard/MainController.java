package ch11_array.ex7_memberboard;

import ch11_array.ex7_memberboard.service.MemberService;
import practice.ex.MemberDTO;

import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
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
                memberService.login();
            }else if (select == 3) {
                memberService.memberList();
            }else if (select == 4) {
                memberService.memberEdit();
            }
        }

    }
}