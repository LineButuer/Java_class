package ch10_class.ex10;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        /**
         * 메뉴
         * 1. 회원가입(기본생성자이용)
         *      회원가입 정보는 스캐너로 받음.
         * 2. 로그인
         * 3. 종료
         */
        Scanner scanner = new Scanner(System.in);
        Member member = new Member();


        boolean run = true;
        String Id = "";
        String Pw = "";
        int menu = 0;
        while (run){
            System.out.println("1. 회원가입  2. 로그인  3. 종료");
            menu = scanner.nextInt();
            if(menu==1){
                System.out.println("회원가입 할 아이디를 입력하세요.");
                member.setMemberEmail(scanner.next());
                System.out.println("회원가입 할 비밀번호를 입력하세요.");
                member.setMemberPassword(scanner.next());
                System.out.println("회원가입에 성공하셨습니다.");

                System.out.println("memberEmail = " + member.memberEmail);
                System.out.println("memberPassword = " + member.memberPassword);
            } else if(menu==2){
                System.out.println("아이디를 입력하세요");
                Id = scanner.next();
                System.out.println("비밀번호를 입력하세요");
                Pw = scanner.next();
                member.memberLogin(Id, Pw);
//                if(!(Id.equals(member.memberEmail))){
//                    System.out.println("없는 아이디입니다. 회원가입을 먼저 해주세요");
//                } else if (!(Pw.equals(member.getMemberPassword()))) {
//                    System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요");
//                } else {
//                    System.out.println("로그인 성공");
//                }

            }else if(menu==3){
                System.out.println("종료");
                run =false;
            }






        }







    }
}
