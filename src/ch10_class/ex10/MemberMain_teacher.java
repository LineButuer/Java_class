package ch10_class.ex10;
import java.util.Scanner;
public class MemberMain_teacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        Member_teacher member = null;

        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                member = new Member_teacher();
                System.out.print("이메일: ");
                String memberEmail = scanner.next();
                System.out.print("비밀번호: ");
                String memberPassword = scanner.next();
                System.out.print("이름: ");
                String memberName = scanner.next();
                System.out.print("전화번호: ");
                String memberMobile = scanner.next();
                member.setMemberEmail(memberEmail);
                member.setMemberPassword(memberPassword);
                member.setMemberName(memberName);
                member.setMemberMobile(memberMobile);
            } else if (selectNo == 2) {
                System.out.print("이메일: ");
                String memberEmail = scanner.next();
                System.out.print("비밀번호: ");
                String memberPassword = scanner.next();
                boolean loginResult = member.memberLogin(memberEmail, memberPassword);
                if (loginResult) {
                    System.out.println("로그인 성공");
                } else {
                    System.out.println("로그인 실패");
                }
            } else if (selectNo == 3) {
                run = false;
            }
        }
    }
}
