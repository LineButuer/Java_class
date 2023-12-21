package ch11_array.ex7_memberboard.service;

import ch11_array.ex7_memberboard.common.CommonVariables;
import ch11_array.ex7_memberboard.dto.MemberDTO;
import ch11_array.ex7_memberboard.repository.MemberRepository;

import java.util.List;
import java.util.Scanner;

import static ch11_array.ex7_memberboard.common.CommonVariables.loginEmail;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();

    public void signUp() {
        boolean run = true;
        System.out.println("이메일을 입력하세요.");
        while (run) {
            String memberEmail = scanner.next();
            boolean check = memberRepository.emailCheck(memberEmail);
            if (check) {
                System.out.println("이메일이 중복되었습니다. 다시 입력해주세요.");
            } else {
                System.out.println("감사합니다. 확인됐습니다.");
                System.out.println("비밀번호를 입력하세요.");
                String memberPassword = scanner.next();
                System.out.println("이름을 입력하세요.");
                String memberName = scanner.next();
                System.out.println("전화번호를 입력하세요.");
                String memberMobile = scanner.next();
                MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
                boolean result = memberRepository.signUp(memberDTO);
                if (result) {
                    System.out.println("등록 되었습니다.");
                    run=false;
                } else {
                    System.out.println("등록에 실패했습니다.");
                }
            }

        }
    }
    public void login(){
        System.out.println("이메일을 입력하세요.");
        String memberEamail = scanner.next();
        System.out.println("비밀번호를 입력하세요.");
        String memberPassword = scanner.next();
        MemberDTO memberDTO = memberRepository.login(memberEamail, memberPassword);
        if(memberDTO != null){
            System.out.println("로그인 성공!");
            loginEmail=memberEamail;
        }else {
            System.out.println("로그인 실패 ㅠㅠ");
        }
    }
    public void memberList(){
        MemberDTO result =memberRepository.memberList();
        if(result!=null){
            System.out.println("회원목록 = " + result);
        }
    }

    public void memberEdit(){
        System.out.println("수정하고 싶은 회원 정보를 입력하세요.");
        System.out.println("1.password 2.name 3.mobile");
        int memberEdit = scanner.nextInt();
        String password =scanner.next();
        if(memberEdit==1){
            boolean result = memberRepository.editPassword(loginEmail, password);
            if(result){
                System.out.println("수정 성공!!");
            }else{
                System.out.println("수정 실패ㅠㅠ");
            }
        } else if (memberEdit==2) {
            boolean result = memberRepository.editName(loginEmail);
            if(result){
                System.out.println("수정 성공!!");
            } else {
                System.out.println("수정 실패ㅠㅠ");
            }
        } else if (memberEdit==3) {
            boolean result = memberRepository.editMobile(loginEmail);
            if(result){
                System.out.println("수정 성공!!");
            }else {
                System.out.println("수정 실패ㅠㅠ");
            }
        }
    }
}