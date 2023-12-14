package ch11_array.ex2;

public class StudentService {
    /**
     * method name : method1
     * parameter : x
     * return : x
     */
    StudentRepository studentRepository = new StudentRepository();
    public void method1(){
        System.out.println("StudentService.method1");
        //Repository의 method1을 호출
        studentRepository.method1();
    }public void method2(){
        System.out.println("StudentService.method2");
    }public void method3(){
        System.out.println("StudentService.method3");
    }


}
