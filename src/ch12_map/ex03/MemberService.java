package ch12_map.ex03;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();
    private static String loginEmail = null;

    public void save() {
        System.out.print("이메일: ");
        String memberEmail = scanner.next();
        System.out.print("비밀번호: ");
        String memberPassword = scanner.next();
        System.out.print("이름: ");
        String memberName = scanner.next();
        System.out.print("전화번호: ");
        String memberMobile = scanner.next();
        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
        boolean result = memberRepository.save(memberDTO);
        if (result) {
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패");
        }
    }

    public void login() {
        System.out.print("이메일: ");
        String memberEmail = scanner.next();
        System.out.print("비밀번호: ");
        String memberPassword = scanner.next();
        MemberDTO login = memberRepository.login(memberEmail, memberPassword);
        if (login != null) {
            System.out.println("로그인 성공");
            System.out.println(memberEmail + "님 환영합니다!");
            loginEmail = memberEmail;

        } else {
            System.out.println("이메일 또는 비밀번호가 틀립니다!");
        }
    }

    public void findAll() {
        Map<Long, MemberDTO> memberDTOMap = memberRepository.findAll();
        for (Long i : memberDTOMap.keySet()) {
            System.out.println(memberDTOMap.get(i));
        }

    }

    //
//    public void findById() {
//        System.out.print("조회 id: ");
//        Long id = scanner.nextLong();
//        MemberDTO memberDTO = MemberRepository.findById(id);
//    }
//
    public void update() {
        if (loginEmail != null) {
            System.out.println("수정 할 전화번호를 입력하세요.");
            String mobile = scanner.next();
            boolean result = memberRepository.update(loginEmail, mobile);
            if (result) {
                System.out.println("변경되었습니다.");
            } else {
                System.out.println("실패했습니다.");
            }
//
        } else {
            System.out.println("먼저 로그인을 해주세요.");
        }
    }

    public void delete() {
        if (loginEmail != null) {
            System.out.println("탈퇴하시겠습니까?");
            System.out.println("비밀번호를 입력해주세요");
            String password = scanner.next();
            boolean result = memberRepository.delete(loginEmail, password);
            if (result) {
                System.out.println("삭제가 완료되었습니다.");
            } else {
                System.out.println("실패했습니다.");
            }
        } else {
            System.out.println("먼저 로그인을 해주세요");
        }
    }

    public void logout() {
        System.out.println("로그아웃 하시겠습니까?");
        System.out.println("1.yes 2.no");
        int select = scanner.nextInt();
        if (select == 1) {
            System.out.println("감사합니다. 다음에 또 이용해주세요");
            loginEmail = null;
        } else {
            System.out.println("로그아웃을 취소합니다.");
        }

    }

}
