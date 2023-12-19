package practice.ex;

import java.util.Scanner;

public class MemberService {
MemberRepository memberRepository = new MemberRepository();
    public void sign(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("이메일을 입력하세요.");
        String memberEmail = scanner.next();
        System.out.println("비밀번호를 입력하세요.");
        String memberPassword = scanner.next();
        System.out.println("이름을 입력하세요.");
        String memberName = scanner.next();
        System.out.println("핸드폰 번호를 입력하세요.");
        String memberMobile = scanner.next();
        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);

        boolean result = memberRepository.sign(memberDTO);
        if(result) {
            System.out.println("회원가입이 완료 됐습니다.");
        }else {
            System.out.println("회원가입에 실패했습니다.");
        }
    }
    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("아이디를 입력하세요.");
        String email = scanner.next();
        System.out.println("비밀번호를 입력하세요.");
        String password =scanner.next();
        boolean result = memberRepository.login(email, password);
        if(result) {
            System.out.println("로그인 성공");
        }else {
            System.out.println("로그인 실패");
        }
    }


}
