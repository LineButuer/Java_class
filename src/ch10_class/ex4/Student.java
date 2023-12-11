package ch10_class.ex4;

public class Student {
    // 이름(studentName), 학번(studentNumber), 학과(studentMajor)
    String studentName;
    String studentNumber;
    String studentMajor;


    // 기본 생성자
    public Student() {
        System.out.println("student 기본 생성자");
    }

    public Student(String sName, String studentNumber, String studentMajor) {
        System.out.println("studentName = " + studentName + ", studentNumber = " + studentNumber + ", studentMajor = " + studentMajor);
        this.studentName = sName;
        this.studentNumber=studentNumber;
        this.studentMajor=studentMajor;
    }
    // 이름, 학번, 학과를 매개변수로 하는 생성자
    // 전달받은 매개변수 값을 필드에 담기
    // this는 필드를 가리킴
}

