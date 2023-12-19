package practice.ex;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {

        MemberService memberService = new MemberService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("1.회원가입 | 2.로그인 | 3.회원 목록 | 4.회원 정보 수정 | 5.회원 정보 삭제 | 6.로그아웃 | 7.이메일 중복체크");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.print("선택 - > ");
        int s = scanner.nextInt();
        if(s==1){
            memberService.sign();
        } else if (s==2) {
            memberService.login();

        }


    }
}
