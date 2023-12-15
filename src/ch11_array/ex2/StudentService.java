package ch11_array.ex2;

import java.util.List;
import java.util.Scanner;

public class StudentService {
    /**
     * method name : method1
     * parameter : x
     * return : x
     */
    StudentRepository studentRepository = new StudentRepository();
    Scanner scanner = new Scanner(System.in);
    public void method1(){
        System.out.println("StudentService.method1");
        //Repository의 method1을 호출
        studentRepository.method1();
    }public void method2(){
        System.out.println("StudentService.method2");
        studentRepository.method2("가나 초콜릿");
    }




    /**
     * StudentDTO 객체를 생성하고
     * Repository의 method3로 DTO 객체를 전달함
     */
    // Repository에서 객체를 만들고


    public void method3(){
        System.out.println("StudentService.method3");
        StudentDTO studentDTO = new StudentDTO("songuku", "123456", "major", "12345687");
        boolean result = studentRepository.method3(studentDTO);
        if (result){
            System.out.println("학생 등록 성공");
        }else {
            System.out.println("학생 등록 실패");
        }

        /**
         * Repository로 부터 List를 리턴 받아 for문으로 출력
         */
    }public void method4(){
        List<StudentDTO> studentDTOList = studentRepository.method4();
        for (StudentDTO studentDTO : studentDTOList) {
            System.out.println("studentDTO = " + studentDTO);
        }


        /**
         * 죄회할 id를 입력 받고
         * id를 repository로 전달하고
         * repository로 부터 id에 해당하는 학생 정보를 리턴 받고
         * 학생 정보를 출력
         * 어차피 repository에다가 정보를 받아서 main에서 출력하는 거니까
         * service에다가 정보를 입력하고 저기다가 넘기면 됨
         *
         */

    }
    public void method5(){
        System.out.println("조회할 id : ");
        Long id = scanner.nextLong();
        StudentDTO studentDTO = studentRepository.method5(id);
        if (studentDTO!=null){
            //조회 결과가 있다
            System.out.println("studentDTO = " + studentDTO);
        }
        else {
            System.out.println("조회 결과 없음");
        }
        System.out.println("studentDTO = " + studentDTO);

    }

}
