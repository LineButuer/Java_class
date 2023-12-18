package ch11_array.ex4;

import java.util.Scanner;

public class SignUpLogInMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SignUpLogInService signUpLogInService = new SignUpLogInService();
        int s = 0;
        boolean run = true;
        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인  | 3.회원 목록 조회 | 4.회원 정보 수정 | 5.회원 탈퇴 | 6.로그아웃 | 7.이메일 중복체크");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            s = scanner.nextInt();
            if (s == 1) {
                signUpLogInService.signUp();
            } else if (s == 3) {
                signUpLogInService.findAll();
            } else if (s == 2) {
                signUpLogInService.login();
            } else if (s == 4) {
                signUpLogInService.update();
            } else if (s == 5) {
                signUpLogInService.delete();

            }
        }
    }
}