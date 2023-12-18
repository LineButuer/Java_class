package ch11_array.ex4;

import ch11_array.ex3.teacher.BookDTO;

import java.util.List;
import java.util.Scanner;

public class SignUpLogInService {
    private static String loginEmail = null;
    Scanner scanner = new Scanner(System.in);

    SignUpLogInRepository signUpLogInRepository = new SignUpLogInRepository();

    public void signUp() {
        System.out.println("회원가입 할 아이디를 입력하세요.");
        String id = scanner.next();
        System.out.println("비밀 번호를 입력하세요.");
        String passWord = scanner.next();
        System.out.println("이름을 입력하세요.");
        String name = scanner.next();
        System.out.println("핸드폰 번호를 입력하세요");
        String mobile = scanner.next();
        SignUpLogInDTO signUpLogInDTO = new SignUpLogInDTO(id, passWord, name, mobile);
        boolean result = signUpLogInRepository.signUp(signUpLogInDTO);
        if (result) {
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }

    }

    public void login() {

        System.out.println("아이디를 입력하세요");
        String id = scanner.next();
        System.out.println("비밀번호를 입력하세요");
        String passWord = scanner.next();

        boolean result = signUpLogInRepository.login(id, passWord);
        boolean run = true;


            if (result) {
                System.out.println("로그인 성공");
                loginEmail = id;

            } else {
                System.out.println("로그인 실패");
            }

    }

    public void findAll() {
        List<SignUpLogInDTO> signUpLogInList = signUpLogInRepository.findAll();
        for (SignUpLogInDTO signUpLogInDTO : signUpLogInList) {
            System.out.println("회원 목록 = " + signUpLogInDTO);
        }
    }

    public void findById() {
        System.out.print("조회 id: ");
        Long id = scanner.nextLong();
        SignUpLogInDTO signUpLogInDTO = signUpLogInRepository.findById(id);
    }

    public void update() {
        if (loginEmail != null) {
            System.out.println("수정 할 전화번호를 입력하세요.");
            String mobile = scanner.next();
            boolean result = signUpLogInRepository.update(mobile);
            if (result) {
                System.out.println("변경되었습니다.");
            } else {
                System.out.println("실패했습니다.");
            }

        } else {
            System.out.println("먼저 로그인을 해주세요.");
        }
    }

    public void delete(){
        if (loginEmail != null) {
            System.out.println("삭제할 아이디 번호를 입력하세요");
            String email = scanner.next();
            boolean result = signUpLogInRepository.delete(email);
            if (result) {
                System.out.println("삭제가 완료되었습니다.");
            } else {
                System.out.println("실패했습니다.");
            }
        }else {
            System.out.println("먼저 로그인을 해주세요");
        }
    }

}
